package lowatem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Tests unitaires de la classe JoueurLowatem.
 */
public class JoueurLowatemTest {

    /**
     * Test de la fonction actionsPossibles. Commentez les appels aux tests des
     * niveaux inférieurs, n'activez que le test du niveau à valider.
     */
    @Test
    public void testActionsPossibles() {
        // testActionsPossibles_niveau1();
        // testActionsPossibles_niveau2();
        testActionsPossibles_niveau4();
    }

    /**
     * Test de la fonction actionsPossibles, au niveau 1.
     */
    public void testActionsPossibles_niveau1() {
        JoueurLowatem joueur = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU1);
        // on choisit la couleur du joueur
        char couleur = 'R';
        // on choisit le niveau
        int niveau = 1;
        // on lance actionsPossibles
        String[] actionsPossiblesDepuisPlateau
                = joueur.actionsPossibles(plateau, couleur, niveau);
        ActionsPossibles actionsPossibles
                = new ActionsPossibles(actionsPossiblesDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossibles.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossibles.contient("gGDgA,9,0"));
        assertTrue(actionsPossibles.contient("gGDgB,9,0"));
        assertTrue(actionsPossibles.contient("gGDgG,9,0"));
        assertTrue(actionsPossibles.contient("gGDgA,9,0"));
        assertTrue(actionsPossibles.contient("gGDaG,9,0"));
        assertTrue(actionsPossibles.contient("gGDnG,9,0"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossibles.contient("gGDgO,9,0"));
        assertFalse(actionsPossibles.contient("gGDgA,8,0"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(Coordonnees.NB_LIGNES + Coordonnees.NB_COLONNES - 1,
                actionsPossiblesDepuisPlateau.length);
    }

    /**
     * Test de la fonction actionsPossibles, au niveau 2.
     */
    public void testActionsPossibles_niveau2() {
        JoueurLowatem joueur = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU2);
        // on choisit la couleur du joueur
        char couleur = 'R';
        // on choisit le niveau
        int niveau = 2;
        // on lance actionsPossibles
        String[] actionsPossiblesDepuisPlateau
                = joueur.actionsPossibles(plateau, couleur, niveau);
        ActionsPossibles actionsPossibles
                = new ActionsPossibles(actionsPossiblesDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossibles.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossibles.contient("dADdA,9,0"));
        assertTrue(actionsPossibles.contient("dADdN,9,0"));
        assertTrue(actionsPossibles.contient("dADdG,9,0"));
        assertTrue(actionsPossibles.contient("dADaA,9,0"));
        assertTrue(actionsPossibles.contient("dADnA,9,0"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossibles.contient("dADnO,9,0"));
        assertFalse(actionsPossibles.contient("dADdA,8,0"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(Coordonnees.NB_LIGNES + Coordonnees.NB_COLONNES - 1,
                actionsPossiblesDepuisPlateau.length);
    }

    /**
     * Test de la fonction actionsPossibles, au niveau 4.
     */
    public void testActionsPossibles_niveau4() {
        JoueurLowatem joueurRouge = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NB_PV);
        // on choisit la couleur du joueur
        char couleur = 'R';
        // on choisit le niveau
        int niveau = 4 ;
        // on lance actionsPossibles
        String[] actionsPossiblesRougeDepuisPlateau
                = joueurRouge.actionsPossibles(plateau, couleur, niveau);
        ActionsPossibles actionsPossiblesRouge
                = new ActionsPossibles(actionsPossiblesRougeDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesRouge.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesRouge.contient("nNDdN,14,9"));
        assertTrue(actionsPossiblesRouge.contient("nNDnN,14,9"));
        assertTrue(actionsPossiblesRouge.contient("nNDbN,14,9"));
        assertTrue(actionsPossiblesRouge.contient("nNDnG,14,9"));
        assertTrue(actionsPossiblesRouge.contient("nNDnB,14,9"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesRouge.contient("nNDnA,14,9"));
        assertFalse(actionsPossiblesRouge.contient("nNDnN,13,9"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(Coordonnees.NB_LIGNES + Coordonnees.NB_COLONNES - 4,
                actionsPossiblesRougeDepuisPlateau.length);
        
        JoueurLowatem joueurNoir = new JoueurLowatem();
        // on choisit la couleur du joueur
        couleur = 'N';
        // on lance actionsPossibles
        String[] actionsPossiblesNoirDepuisPlateau
                = joueurNoir.actionsPossibles(plateau, couleur, niveau);
        ActionsPossibles actionsPossiblesNoir
                = new ActionsPossibles(actionsPossiblesNoirDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesNoir.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesNoir.contient("aADaA,14,9"));
        assertTrue(actionsPossiblesNoir.contient("aADjA,14,9"));
        assertTrue(actionsPossiblesNoir.contient("aADeA,14,9"));
        assertTrue(actionsPossiblesNoir.contient("aADaM,14,9"));
        assertTrue(actionsPossiblesNoir.contient("aADaD,14,9"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesNoir.contient("aADaA,14,8"));
        assertFalse(actionsPossiblesNoir.contient("aADaN,14,9"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(Coordonnees.NB_LIGNES + Coordonnees.NB_COLONNES - 3,
                actionsPossiblesNoirDepuisPlateau.length);
    }
    
    @Test
    public void testAjoutDeplDepuis() {
        JoueurLowatem joueur = new JoueurLowatem();
        ActionsPossibles actions = new ActionsPossibles();
        NbPointsDeVie nbPv = new NbPointsDeVie(9, 0);
        char couleur = 'R';
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU2);
        joueur.ajoutDeplDepuis(Coordonnees.depuisCars('f', 'D'), actions, nbPv, plateau, couleur);
        // les horizontaux avec la case d'origine
        assertTrue(actions.contient("fDDfA,9,0"));
        assertTrue(actions.contient("fDDfB,9,0"));
        assertTrue(actions.contient("fDDfC,9,0"));
        assertTrue(actions.contient("fDDfD,9,0"));
        assertTrue(actions.contient("fDDfF,9,0"));
        assertTrue(actions.contient("fDDfH,9,0"));
        assertTrue(actions.contient("fDDfN,9,0"));
        // les verticaux
        assertTrue(actions.contient("fDDaD,9,0"));
        assertTrue(actions.contient("fDDhD,9,0"));
        // des mauvais
        assertFalse(actions.contient("fDDaF,9,0"));
        assertFalse(actions.contient("fDDaA,9,0"));
        // le bon nombre d'unités
        assertFalse(actions.contient("fDDfA,1,0"));
        // finalement on doit en avoir 1 + 13 + 13
        assertEquals(27, actions.nbActions);
        
    }

    @Test
    public void testChaineActionDepl() {
        assertEquals("cEDfC,9,0", JoueurLowatem.chaineActionDepl(
                Coordonnees.depuisCars('c', 'E'), 
                Coordonnees.depuisCars('f', 'C'),
                new NbPointsDeVie(9, 0)));
        assertEquals("nDDnD,9,0", JoueurLowatem.chaineActionDepl(
                Coordonnees.depuisCars('n', 'D'),
                Coordonnees.depuisCars('n', 'D'),
                new NbPointsDeVie(9, 0)));
    }

    @Test
    public void testNbPointsDeVie() {
        // plateau : rouge 9, noir 0
        Case[][] plateau1 = Utils.plateauDepuisTexte(PLATEAU_NIVEAU1);
        NbPointsDeVie nbPv1 = JoueurLowatem.nbPointsDeVie(plateau1);
        assertEquals(9, nbPv1.nbPvRouge);
        assertEquals(0, nbPv1.nbPvNoir);
        // plateau : rouge 9, noir 0
        Case[][] plateau2 = Utils.plateauDepuisTexte(PLATEAU_NIVEAU2);
        NbPointsDeVie nbPv2 = JoueurLowatem.nbPointsDeVie(plateau2);
        assertEquals(9, nbPv2.nbPvRouge);
        assertEquals(0, nbPv2.nbPvNoir);
        // plateau : rouge 14, noir 9
        Case[][] plateauNbPv = Utils.plateauDepuisTexte(PLATEAU_NB_PV);
        NbPointsDeVie nbPv = JoueurLowatem.nbPointsDeVie(plateauNbPv);
        assertEquals(14, nbPv.nbPvRouge);
        assertEquals(9, nbPv.nbPvNoir);
    }
    
    /**
     * Un plateau de base, sous forme de chaîne. Pour construire une telle
     * chaîne depuis votre sortie.log, déclarez simplement final String
     * MON_PLATEAU = ""; puis copiez le plateau depuis votre sortie.log, et
     * collez-le entre les guillemets. Puis Alt+Shift+f pour mettre en forme.
     */
    final String PLATEAU_NIVEAU1
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "e|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|   |   |   |   |   |   |SR9|   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n";
    
    final String PLATEAU_NIVEAU2
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|SR9|   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "e|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n";
    
    final String PLATEAU_NB_PV
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|SN3|   |   |   |   |   |   |   |   |   |   |   |   |SN5|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |   |SR4|   |   |   |   |   |   |   |SN1|   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "e|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|   |   |   |   |   |   |   |   |   |   |   |   |   |SR2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|SR3|   |   |   |   |   |   |   |   |   |   |   |   |SR5|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n";
}