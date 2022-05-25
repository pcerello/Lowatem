package lowatem;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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
        for (int ligne = 0; ligne < plateau.length; ligne++) {
            for (int colonne = 0; colonne < plateau.length; colonne++) {
                if (plateau[ligne][colonne].unitePresente() 
                        && couleurJoueur == plateau[ligne][colonne].couleurUnite) {
                    ajoutDeplDepuis(new Coordonnees(ligne, colonne), actions, nbPv, plateau, couleurJoueur);
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
     * @return le nombre de points de vies des Rouges et des Noirs sur le
     * plateau
     */
    static NbPointsDeVie nbPointsDeVie(Case[][] plateau) {
        int sommePointsDeVieRouge = 0;
        int sommePointsDeVieNoir = 0;
        for (int ligne = 0; ligne < plateau.length; ligne++) {
            for (int colonne = 0; colonne < plateau.length; colonne++) {
                if (plateau[ligne][colonne].couleurUnite == Case.CAR_ROUGE) {
                    sommePointsDeVieRouge += plateau[ligne][colonne].pointsDeVie;
                } else if (plateau[ligne][colonne].couleurUnite == Case.CAR_NOIR) {
                    sommePointsDeVieNoir += plateau[ligne][colonne].pointsDeVie;
                }

            }
        }
        return new NbPointsDeVie(sommePointsDeVieRouge, sommePointsDeVieNoir);
    }



    
    /**
     * Retourne un tableau de coordonnees de cases d'ennemis voisins
     * 
     * @param coord coordonnées de la case d'origine
     * @param plateau
     * @param couleurJoueur couleur de l'unité sur la case
     * @return le tableau de case voisines avec un ennemi
     */
    static Coordonnees[] tabCaseVoisine(Coordonnees coord, Case[][] plateau, char couleurJoueur) {
        int i = 0;
        Coordonnees[] tabCaseVoisine = new Coordonnees[4];
        if (couleurJoueur == Case.CAR_ROUGE) {
            for (Direction dir : Direction.toutes()) {
                Coordonnees src = coord.suivantes(dir);
                if (src.estDansPlateau() && plateau[src.ligne][src.colonne].unitePresente() 
                        && plateau[src.ligne][src.colonne].couleurUnite == Case.CAR_NOIR) {
                    tabCaseVoisine[i] = src;
                    i++;
                }
            }
        }else if (couleurJoueur == Case.CAR_NOIR) {
            for (Direction dir : Direction.toutes()) {
                Coordonnees src = coord.suivantes(dir);
                if (src.estDansPlateau() && plateau[src.ligne][src.colonne].unitePresente() 
                        && plateau[src.ligne][src.colonne].couleurUnite == Case.CAR_ROUGE) {
                    tabCaseVoisine[i] = src;
                    i++;
                }
            }
        }
        return Arrays.copyOf(tabCaseVoisine, i);
    }

    /**
     * Ajouter tous les déplacements depuis une case donnée.
     *
     * @param coord coordonnées de la case d'origine
     * @param actions ensemble des actions possibles, à compléter
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau initial
     * @param plateau le plateau considéré
     * @param couleurJoueur la couleur du joueur joué
     */
    void ajoutDeplDepuis(Coordonnees coord, ActionsPossibles actions, 
            NbPointsDeVie nbPv, Case[][] plateau, char couleurJoueur) {
        // on part dans chacune des 4 directions
        for (Direction dir : Direction.toutes()) {
            ajoutDeplDansDirection(dir, coord, actions, nbPv, plateau, couleurJoueur);
        }
        // on ajoute le déplacement "sur place"
        ajoutDepl(coord, coord, actions, nbPv, plateau);
        for (Coordonnees enn : tabCaseVoisine(coord, plateau, couleurJoueur)){
                ajoutAtt(coord, coord, enn, actions, nbPv, plateau, couleurJoueur);
            }
    }

    /**
     * Ajouter tous les déplacements depuis une case donnée, dans une direction
     * donnée.
     *
     * @param dir direction à suivre
     * @param src coordonnées de la case d'origine
     * @param actions ensemble des actions possibles, à compléter
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau initial
     * @param plateau le plateau considéré
     * @param couleurJoueur la couleur du joueur joué
     */
    void ajoutDeplDansDirection(Direction dir, Coordonnees src,
            ActionsPossibles actions, NbPointsDeVie nbPv, Case[][] plateau, char couleurJoueur) {
        Coordonnees dst = src.suivantes(dir);
        while (dst.estDansPlateau()) {
            ajoutDepl(src, dst, actions, nbPv, plateau);
            for (Coordonnees enn : tabCaseVoisine(dst, plateau, couleurJoueur)){
                ajoutAtt(src, dst, enn, actions, nbPv, plateau, couleurJoueur);
            }
            dst = dst.suivantes(dir);
        }
    }

    /**
     * Ajout d'une action de déplacement dans l'ensemble des actions possibles.
     *
     * @param src coordonnées de la case à l'origine du déplacement
     * @param dst coordonnées de la case destination du déplacement
     * @param actions l'ensemble des actions possibles (en construction)
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau initial
     * @param plateau le plateau considéré
     */
    void ajoutDepl(Coordonnees src, Coordonnees dst, ActionsPossibles actions,
            NbPointsDeVie nbPv, Case[][] plateau) {
        if (!plateau[dst.ligne][dst.colonne].unitePresente() || src == dst) {
            actions.ajouterAction(chaineActionDepl(src, dst, nbPv));
        }
    }

    /**
     * Ajout d'une action d'attaque dans l'ensemble des actions possibles.
     *
     * @param src coordonnées de la case à l'origine du déplacement
     * @param dst coordonnées de la case destination du déplacement
     * @param actions l'ensemble des actions possibles (en construction)
     * @param nbPv nombre de points de vie de chaque joueur sur le plateau initial
     * @param plateau le plateau considéré
     * @param couleurJoueur la couleur du joueur joué
     */
    void ajoutAtt(Coordonnees src, Coordonnees dst, Coordonnees enn, ActionsPossibles actions,
            NbPointsDeVie nbPv, Case[][] plateau, char couleurJoueur) {
        if (!plateau[dst.ligne][dst.colonne].unitePresente() || src == dst) {
            actions.ajouterAction(chaineActionAtt(src, dst, enn, nbPv, plateau, couleurJoueur));
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

    /**
     * Chaîne de caractères correspondant à une action-mesure de déplacement avec action d'attaque.
     * 
     * @param src coordonnées de la case à l'origine du déplacement
     * @param dst coordonnées de la case destination du déplacement
     * @param enn coordonnées de la case ennemie voisine
     * @param nbPv nombre de points de vie de chaque joueur après l'action
     * @param plateau le plateau considéré
     * @param couleurJoueur la couleur du joueur joué
     * @return la chaîne codant cette action-mesure et attaque
     */
    static String chaineActionAtt(Coordonnees src, Coordonnees dst, Coordonnees enn, 
            NbPointsDeVie nbPv, Case[][] plateau, char couleurJoueur) {
        int nouvelleSommePvRouge;
        int nouvelleSommePvNoir;
        NbPointsDeVie calculNewPv = calculNewPv(src, enn, plateau);
        if (couleurJoueur == Case.CAR_ROUGE){
            nouvelleSommePvRouge = nbPv.nbPvRouge - plateau[src.ligne][src.colonne].pointsDeVie + calculNewPv.nbPvRouge;
            nouvelleSommePvNoir = nbPv.nbPvNoir - plateau[enn.ligne][enn.colonne].pointsDeVie + calculNewPv.nbPvNoir;
        }else if (couleurJoueur == Case.CAR_NOIR) {
            nouvelleSommePvRouge = nbPv.nbPvRouge - plateau[enn.ligne][enn.colonne].pointsDeVie + calculNewPv.nbPvNoir;
            nouvelleSommePvNoir = nbPv.nbPvNoir - plateau[src.ligne][src.colonne].pointsDeVie + calculNewPv.nbPvRouge;
        }else{
            nouvelleSommePvRouge = nbPv.nbPvRouge;
            nouvelleSommePvNoir = nbPv.nbPvNoir;
        }
        return "" + src.carLigne() + src.carColonne()
                + "D" + dst.carLigne() + dst.carColonne()
                + "A" + enn.carLigne() + enn.carColonne()
                + "," + nouvelleSommePvRouge + "," + nouvelleSommePvNoir;
    }
    
    /**
     * Nombre de points de vie de chaque joueur sur le plateau après attaque.
     * 
     * @param coord coordonnées de la case attaquante
     * @param enn coordonnées de la case attaquée
     * @param plateau le plateau considéré
     * @return le nombre de points de vies des Rouges et des Noirs sur le
     * plateau
     */
    static NbPointsDeVie calculNewPv(Coordonnees coord, Coordonnees enn, Case[][] plateau){
        int oldPvAttaquant = plateau[coord.ligne][coord.colonne].pointsDeVie;
        int oldPvAttaque = plateau[enn.ligne][enn.colonne].pointsDeVie;
        int newPvAttaquant = oldPvAttaquant - 2 - (int)((oldPvAttaque - 5)/2);
        if (newPvAttaquant < 0){
            newPvAttaquant =0;
        }
        int newPvAttaque = oldPvAttaque - 4 - (int)((oldPvAttaquant - 5)/2);
        if (newPvAttaque < 0){
            newPvAttaque =0;
        }
        return new NbPointsDeVie(newPvAttaquant,newPvAttaque);
    }
}

