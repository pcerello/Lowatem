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
        // testActionsPossibles_niveau3();
        // testActionsPossiblesRouge_niveau4();
        // testActionsPossiblesNoir_niveau4();
        testActionsPossiblesRouge_niveau5();
        testActionsPossiblesNoir_niveau5();
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
     * Test de la fonction actionsPossibles, au niveau 3.
     */
    public void testActionsPossibles_niveau3() {
        JoueurLowatem joueur = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU3);
        // on choisit la couleur du joueur
        char couleur = 'R';
        // on choisit le niveau
        int niveau = 3;
        // on lance actionsPossibles
        String[] actionsPossiblesDepuisPlateau
                = joueur.actionsPossibles(plateau, couleur, niveau);
        ActionsPossibles actionsPossibles
                = new ActionsPossibles(actionsPossiblesDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossibles.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossibles.contient("dADdA,13,0"));
        assertTrue(actionsPossibles.contient("dADdN,13,0"));
        assertTrue(actionsPossibles.contient("dADdG,13,0"));
        assertTrue(actionsPossibles.contient("dADaA,13,0"));
        assertTrue(actionsPossibles.contient("dADnA,13,0"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossibles.contient("dADfA,13,0"));
        assertFalse(actionsPossibles.contient("dADdA,8,0"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(Coordonnees.NB_LIGNES + Coordonnees.NB_COLONNES - 1,
                actionsPossiblesDepuisPlateau.length);
    }
    
     /**
     * Test de la fonction actionsPossibles, au niveau 4.
     */
    public void testActionsPossiblesRouge_niveau4() {
        JoueurLowatem joueurRouge = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU4);
        // on choisit la couleur du joueur
        char couleurRouge = 'R';
        // on choisit le niveau
        int niveau = 4 ;
        // on lance actionsPossibles
        String[] actionsPossiblesRougeDepuisPlateau
                = joueurRouge.actionsPossibles(plateau, couleurRouge, niveau);
        ActionsPossibles actionsPossiblesRouge
                = new ActionsPossibles(actionsPossiblesRougeDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesRouge.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesRouge.contient("aMDaN,5,7"));
        assertTrue(actionsPossiblesRouge.contient("aMDaM,5,7"));
        assertTrue(actionsPossiblesRouge.contient("aMDcM,5,7"));
        assertTrue(actionsPossiblesRouge.contient("aMDnM,5,7"));
        assertTrue(actionsPossiblesRouge.contient("aMDaB,5,7"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesRouge.contient("aMDaA,5,7"));
        assertFalse(actionsPossiblesRouge.contient("aMDaB,5,9"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(26, actionsPossiblesRougeDepuisPlateau.length);
    }
        
    public void testActionsPossiblesNoir_niveau4() {
        JoueurLowatem joueurNoir = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU4);
        // on choisit la couleur du joueur
        char couleurNoir = 'N';
                // on choisit le niveau
        int niveau = 4 ;
        // on lance actionsPossibles
        String[] actionsPossiblesNoirDepuisPlateau
                = joueurNoir.actionsPossibles(plateau, couleurNoir, niveau);
        ActionsPossibles actionsPossiblesNoir
                = new ActionsPossibles(actionsPossiblesNoirDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesNoir.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesNoir.contient("aADaA,5,7"));
        assertTrue(actionsPossiblesNoir.contient("aADjA,5,7"));
        assertTrue(actionsPossiblesNoir.contient("aADeA,5,7"));
        assertTrue(actionsPossiblesNoir.contient("aADaN,5,7"));
        assertTrue(actionsPossiblesNoir.contient("aADaD,5,7"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesNoir.contient("aADaA,5,8"));
        assertFalse(actionsPossiblesNoir.contient("aADaM,5,7"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(53, actionsPossiblesNoirDepuisPlateau.length);
    }
    
    /**
     * Test de la fonction actionsPossibles, au niveau 5.
     */
    public void testActionsPossiblesRouge_niveau5() {
        JoueurLowatem joueurRouge = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU5);
        // on choisit la couleur du joueur
        char couleurRouge = 'R';
        // on choisit le niveau
        int niveau = 5 ;
        // on lance actionsPossibles
        String[] actionsPossiblesRougeDepuisPlateau
                = joueurRouge.actionsPossibles(plateau, couleurRouge, niveau);
        ActionsPossibles actionsPossiblesRouge
                = new ActionsPossibles(actionsPossiblesRougeDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesRouge.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesRouge.contient("cDDaD,7,6"));
        assertTrue(actionsPossiblesRouge.contient("cDDcN,7,6"));
        assertTrue(actionsPossiblesRouge.contient("cDDcD,7,6"));
        assertTrue(actionsPossiblesRouge.contient("cDDdD,7,6"));
        assertTrue(actionsPossiblesRouge.contient("cDDcE,7,6"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesRouge.contient("cDDcMAcL,7,6"));
        assertTrue(actionsPossiblesRouge.contient("cDDcKAcL,7,6"));        
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesRouge.contient("cDDcL,7,6"));
        assertFalse(actionsPossiblesRouge.contient("cDDcD,7,9"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesRouge.contient("cDDcMAcL,7,5"));
        assertFalse(actionsPossiblesRouge.contient("cDDcKAdK,7,6"));
        assertFalse(actionsPossiblesRouge.contient("cDDcKAcK,7,6"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(55, actionsPossiblesRougeDepuisPlateau.length);
    }
        
    public void testActionsPossiblesNoir_niveau5() {
        JoueurLowatem joueurNoir = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU5);
        // on choisit la couleur du joueur
        char couleurNoir = 'N';
                // on choisit le niveau
        int niveau = 5 ;
        // on lance actionsPossibles
        String[] actionsPossiblesNoirDepuisPlateau
                = joueurNoir.actionsPossibles(plateau, couleurNoir, niveau);
        ActionsPossibles actionsPossiblesNoir
                = new ActionsPossibles(actionsPossiblesNoirDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesNoir.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesNoir.contient("cLDcL,7,6"));
        assertTrue(actionsPossiblesNoir.contient("cLDaL,7,6"));
        assertTrue(actionsPossiblesNoir.contient("cLDdL,7,6"));
        assertTrue(actionsPossiblesNoir.contient("cLDcK,7,6"));
        assertTrue(actionsPossiblesNoir.contient("cLDcA,7,6"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesNoir.contient("cLDcEAcD,7,6"));
        assertTrue(actionsPossiblesNoir.contient("cLDcCAcD,7,6"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesNoir.contient("cLDcD,7,6"));
        assertFalse(actionsPossiblesNoir.contient("cLDcM,4,6"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesNoir.contient("cLDcCAcD,7,5"));
        assertFalse(actionsPossiblesNoir.contient("cLDcEAcE,7,6"));
        assertFalse(actionsPossiblesNoir.contient("cLDcEAdE,7,6"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(55, actionsPossiblesNoirDepuisPlateau.length);
    }
    
    @Test
    public void testAjoutDeplDepuis() {
        JoueurLowatem joueur = new JoueurLowatem();
        ActionsPossibles actions = new ActionsPossibles();
        NbPointsDeVie nbPv = new NbPointsDeVie(7, 6);
        char couleur = 'R';
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU5);
        joueur.ajoutDeplDepuis(Coordonnees.depuisCars('c', 'D'), actions, nbPv, plateau, couleur);
        // les horizontaux avec la case d'origine
        assertTrue(actions.contient("cDDcM,7,6"));
        assertTrue(actions.contient("cDDcF,7,6"));
        assertTrue(actions.contient("cDDcD,7,6"));
        assertTrue(actions.contient("cDDcA,7,6"));
        // les verticaux
        assertTrue(actions.contient("cDDaD,7,6"));
        assertTrue(actions.contient("cDDhD,7,6"));
        // des mauvais
        assertFalse(actions.contient("cDDaF,7,6"));
        assertFalse(actions.contient("cDDcL,7,6"));
        // le bon nombre d'unités
        assertFalse(actions.contient("cDDcD,1,6"));
        assertEquals(28, actions.nbActions);
        
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
    public void testChaineActionAtt() {
        assertEquals("cEDfCAfD,9,0", JoueurLowatem.chaineActionAtt(
                Coordonnees.depuisCars('c', 'E'), 
                Coordonnees.depuisCars('f', 'C'),
                Coordonnees.depuisCars('f', 'D'),
                new NbPointsDeVie(9, 0)));
        assertEquals("nDDnDAnE,9,0", JoueurLowatem.chaineActionAtt(
                Coordonnees.depuisCars('n', 'D'),
                Coordonnees.depuisCars('n', 'D'),
                Coordonnees.depuisCars('n', 'E'),
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
    
    final String PLATEAU_NIVEAU3
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
            + "f|SR4|   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
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
    
    final String PLATEAU_NIVEAU4
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|SN3|   |   |   |   |   |   |   |   |   |   |   |SR5|   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|   |   |   |   |   |   |   |   |   |   |SN4|   |   |   |\n"
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
    
    final String PLATEAU_NIVEAU5
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |   |   |   |   |   |   |   |SN5|   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |   |SR4|   |   |   |   |   |   |   |SN1|   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
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
            + "n|SR3|   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
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
