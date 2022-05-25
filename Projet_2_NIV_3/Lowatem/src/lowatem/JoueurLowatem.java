package lowatem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Joueur implémentant les actions possibles à partir d'un plateau, pour un
 * niveau donné.
 */
public class JoueurLowatem implements IJoueurLowatem {

    /**
     * Cette méthode renvoie, pour un plateau donné et un joueur donné, toutes
     * les actions possibles pour ce joueur.
     *
     * @param plateau le plateau considéré
     * @param couleurJoueur couleur du joueur
     * @param niveau le niveau de la partie à jouer
     * @return l'ensemble des actions possibles
     */
    @Override
    public String[] actionsPossibles(Case[][] plateau, char couleurJoueur, int niveau) {
        // afficher l'heure de lancement
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        System.out.println("actionsPossibles : lancement le " + format.format(new Date()));
        // se préparer à stocker les actions possibles
        ActionsPossibles actions = new ActionsPossibles();
        // calculer les points de vie sur le plateau initial
        NbPointsDeVie nbPv = nbPointsDeVie(plateau);
        // déplacements possibles depuis une case aléatoire
        for (int ligne = 0 ; ligne < plateau.length ; ligne++){
            for (int colonne = 0 ; colonne < plateau.length ; colonne++){
                if (plateau[ligne][colonne].unitePresente()){
                    ajoutDeplDepuis(new Coordonnees(ligne,colonne), actions, nbPv, plateau);
                }
            }
        }
        System.out.println("actionsPossibles : fin");
        return actions.nettoyer();
    }

    /**
     * Nombre de points de vie de chaque joueur sur le plateau.
     *
     * @param plateau le plateau
     * @return le nombre de points de vies des Rouges et des Noirs sur le plateau
     */
    static NbPointsDeVie nbPointsDeVie(Case[][] plateau) {
        int sommePointsDeVieRouge = 0;
        int sommePointsDeVieNoir = 0;
        for (int ligne = 0 ; ligne < plateau.length ; ligne++){
            for (int colonne = 0 ; colonne < plateau.length ; colonne++){
                if (plateau[ligne][colonne].couleurUnite == Case.CAR_ROUGE){
                    sommePointsDeVieRouge += plateau[ligne][colonne].pointsDeVie;
                }else if (plateau[ligne][colonne].couleurUnite == Case.CAR_NOIR){
                    sommePointsDeVieNoir += plateau[ligne][colonne].pointsDeVie;
                }
                
            }
        }
        return new NbPointsDeVie(sommePointsDeVieRouge, sommePointsDeVieNoir);
    }

    /**
     * Ajouter tous les déplacements depuis une case donnée.
     *
     * @param coord coordonnées de la case d'origine
     * @param actions ensemble des actions possibles, à compléter
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau
     * initial
     */
    void ajoutDeplDepuis(Coordonnees coord, ActionsPossibles actions, NbPointsDeVie nbPv, Case[][] plateau) {
        // on part dans chacune des 4 directions
        for (Direction dir : Direction.toutes()) {
            ajoutDeplDansDirection(dir, coord, actions, nbPv, plateau);
        }
        // on ajoute le déplacement "sur place"
        ajoutDepl(coord, coord, actions, nbPv, plateau);
    }

    /**
     * Ajouter tous les déplacements depuis une case donnée, dans une direction
     * donnée.
     *
     * @param dir direction à suivre
     * @param src coordonnées de la case d'origine
     * @param actions ensemble des actions possibles, à compléter
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau
     * initial
     */
    void ajoutDeplDansDirection(Direction dir, Coordonnees src,
            ActionsPossibles actions, NbPointsDeVie nbPv, Case[][] plateau) {
        Coordonnees dst = src.suivantes(dir);
        while (dst.estDansPlateau()) {
            ajoutDepl(src, dst, actions, nbPv, plateau);
            dst = dst.suivantes(dir);
        }
    }

    /**
     * Ajout d'une action de déplacement dans l'ensemble des actions possibles.
     *
     * @param src coordonnées de la case à l'origine du déplacement
     * @param dst coordonnées de la case destination du déplacement
     * @param actions l'ensemble des actions possibles (en construction)
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau
     * initial
     */
    void ajoutDepl(Coordonnees src, Coordonnees dst, ActionsPossibles actions,
            NbPointsDeVie nbPv, Case[][] plateau) {
            if (!plateau[dst.ligne][dst.colonne].unitePresente() || src == dst){
                actions.ajouterAction(chaineActionDepl(src, dst, nbPv));
        }
    }

    /**
     * Chaîne de caractères correspondant à une action-mesure de déplacement.
     *
     * @param src coordonnées de la case à l'origine du déplacement
     * @param dst coordonnées de la case destination du déplacement
     * @param nbPv nombre de points de vie de chaque joueur après l'action
     * @return la chaîne codant cette action-mesure
     */
    static String chaineActionDepl(Coordonnees src, Coordonnees dst, NbPointsDeVie nbPv) {
        return "" + src.carLigne() + src.carColonne()
                + "D" + dst.carLigne() + dst.carColonne()
                + "," + nbPv.nbPvRouge + "," + nbPv.nbPvNoir;
    }
}
