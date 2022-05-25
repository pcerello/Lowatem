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
        // testActionsPossiblesRouge_niveau5();
        // testActionsPossiblesNoir_niveau5();
        // testActionsPossiblesRouge_niveau6();
        // testActionsPossiblesNoir_niveau6();
        testActionsPossiblesRouge_niveau7();
        testActionsPossiblesNoir_niveau7();
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
    
    /**
     * Test de la fonction actionsPossibles, au niveau 6.
     */
    public void testActionsPossiblesRouge_niveau6() {
        JoueurLowatem joueurRouge = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU6);
        // on choisit la couleur du joueur
        char couleurRouge = 'R';
        // on choisit le niveau
        int niveau = 6 ;
        // on lance actionsPossibles
        String[] actionsPossiblesRougeDepuisPlateau
                = joueurRouge.actionsPossibles(plateau, couleurRouge, niveau);
        ActionsPossibles actionsPossiblesRouge
                = new ActionsPossibles(actionsPossiblesRougeDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesRouge.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesRouge.contient("cDDaD,14,9"));
        assertTrue(actionsPossiblesRouge.contient("cDDcN,14,9"));
        assertTrue(actionsPossiblesRouge.contient("cDDcD,14,9"));
        assertTrue(actionsPossiblesRouge.contient("cDDdD,14,9"));
        assertTrue(actionsPossiblesRouge.contient("cDDcE,14,9"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesRouge.contient("cDDcMAcL,14,8"));
        assertTrue(actionsPossiblesRouge.contient("cDDcKAcL,14,8"));        
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesRouge.contient("cDDcL,14,9"));
        assertFalse(actionsPossiblesRouge.contient("cDDcD,14,6"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesRouge.contient("cDDcMAcL,14,5"));
        assertFalse(actionsPossiblesRouge.contient("cDDcKAdK,14,8"));
        assertFalse(actionsPossiblesRouge.contient("cDDcKAcK,14,8"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(105, actionsPossiblesRougeDepuisPlateau.length);
    }
        
    public void testActionsPossiblesNoir_niveau6() {
        JoueurLowatem joueurNoir = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU6);
        // on choisit la couleur du joueur
        char couleurNoir = 'N';
                // on choisit le niveau
        int niveau = 6 ;
        // on lance actionsPossibles
        String[] actionsPossiblesNoirDepuisPlateau
                = joueurNoir.actionsPossibles(plateau, couleurNoir, niveau);
        ActionsPossibles actionsPossiblesNoir
                = new ActionsPossibles(actionsPossiblesNoirDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesNoir.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesNoir.contient("cLDcL,14,9"));
        assertTrue(actionsPossiblesNoir.contient("cLDaL,14,9"));
        assertTrue(actionsPossiblesNoir.contient("cLDdL,14,9"));
        assertTrue(actionsPossiblesNoir.contient("cLDcK,14,9"));
        assertTrue(actionsPossiblesNoir.contient("cLDcA,14,9"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesNoir.contient("cLDcEAcD,12,8"));
        assertTrue(actionsPossiblesNoir.contient("cLDcCAcD,12,8"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesNoir.contient("cLDcD,14,9"));
        assertFalse(actionsPossiblesNoir.contient("cLDcM,4,9"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesNoir.contient("cLDcCAcD,14,5"));
        assertFalse(actionsPossiblesNoir.contient("cLDcEAcE,14,9"));
        assertFalse(actionsPossiblesNoir.contient("cLDcEAdE,14,9"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(81, actionsPossiblesNoirDepuisPlateau.length);
    }
    
    /**
     * Test de la fonction actionsPossibles, au niveau 7.
     */
    public void testActionsPossiblesRouge_niveau7() {
        JoueurLowatem joueurRouge = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU7);
        // on choisit la couleur du joueur
        char couleurRouge = 'R';
        // on choisit le niveau
        int niveau = 7 ;
        // on lance actionsPossibles
        String[] actionsPossiblesRougeDepuisPlateau
                = joueurRouge.actionsPossibles(plateau, couleurRouge, niveau);
        ActionsPossibles actionsPossiblesRouge
                = new ActionsPossibles(actionsPossiblesRougeDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesRouge.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesRouge.contient("cCDcD,12,12"));
        assertTrue(actionsPossiblesRouge.contient("cCDcC,12,12"));
        assertTrue(actionsPossiblesRouge.contient("cCDcB,12,12"));
        assertTrue(actionsPossiblesRouge.contient("cCDmC,12,12"));
        assertTrue(actionsPossiblesRouge.contient("cCDbC,12,12"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesRouge.contient("cCDkCAlC,12,11"));
        assertTrue(actionsPossiblesRouge.contient("cCDmCAlC,12,11"));        
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesRouge.contient("cCDcF,12,12"));
        assertFalse(actionsPossiblesRouge.contient("cCDcE,12,12"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesRouge.contient("cCDkCAlC,12,5"));
        assertFalse(actionsPossiblesRouge.contient("cCDcBAlC,12,12"));
        assertFalse(actionsPossiblesRouge.contient("cCDcLAcM,12,12"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(230, actionsPossiblesRougeDepuisPlateau.length);
    }
        
    public void testActionsPossiblesNoir_niveau7() {
        JoueurLowatem joueurNoir = new JoueurLowatem();
        // un plateau sur lequel on veut tester actionsPossibles()
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU7);
        // on choisit la couleur du joueur
        char couleurNoir = 'N';
                // on choisit le niveau
        int niveau = 7 ;
        // on lance actionsPossibles
        String[] actionsPossiblesNoirDepuisPlateau
                = joueurNoir.actionsPossibles(plateau, couleurNoir, niveau);
        ActionsPossibles actionsPossiblesNoir
                = new ActionsPossibles(actionsPossiblesNoirDepuisPlateau);
        // on peut afficher toutes les actions possibles calculées :
        actionsPossiblesNoir.afficher();
        // on peut aussi tester si une action est dans les actions possibles :
        assertTrue(actionsPossiblesNoir.contient("lGDlA,12,12"));
        assertTrue(actionsPossiblesNoir.contient("lGDlK,12,12"));
        assertTrue(actionsPossiblesNoir.contient("lGDlG,12,12"));
        assertTrue(actionsPossiblesNoir.contient("lGDmG,12,12"));
        assertTrue(actionsPossiblesNoir.contient("lGDfG,12,12"));
        // on peut aussi tester si une action est dans les actions possibles avec attaque :
        assertTrue(actionsPossiblesNoir.contient("lGDhGAgG,10,11"));
        assertTrue(actionsPossiblesNoir.contient("lGDfGAgG,10,11"));
        // on peut aussi tester si une action n'est pas dans les actions possibles :
        assertFalse(actionsPossiblesNoir.contient("lGDdG,12,12"));
        assertFalse(actionsPossiblesNoir.contient("lGDcG,12,12"));
        // on peut aussi tester si une action n'est pas dans les actions possibles avec attaque :
        assertFalse(actionsPossiblesNoir.contient("lGDlGAgG,10,11"));
        assertFalse(actionsPossiblesNoir.contient("lGDhGAgG,14,11"));
        assertFalse(actionsPossiblesNoir.contient("lGDhGAhF,10,11"));
        // vérifions s'il y a le bon nombre d'actions possibles :
        assertEquals(225, actionsPossiblesNoirDepuisPlateau.length);
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

    /*@Test
    public void testChaineActionAtt() {
        Case[][] plateau = Utils.plateauDepuisTexte(PLATEAU_NIVEAU6);
        assertEquals("aADmAAnA,11,8", JoueurLowatem.chaineActionAtt(
                Coordonnees.depuisCars('a', 'A'), 
                Coordonnees.depuisCars('m', 'A'),
                Coordonnees.depuisCars('n', 'A'),
                plateau,
                new calculNewPv(, 0)));
        assertEquals("nNDbNAaN,12,5", JoueurLowatem.chaineActionAtt(
                Coordonnees.depuisCars('n', 'N'), 
                Coordonnees.depuisCars('b', 'N'),
                Coordonnees.depuisCars('a', 'N'),
                plateau,
                new calculNewPv(, 0)));
    }*/
    
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
    
    @Test
    public void testCalculNewPv() {
        Case[][] plateau6 = Utils.plateauDepuisTexte(PLATEAU_NIVEAU6bis);
        Coordonnees coord = Coordonnees.depuisCars('n', 'A');
        Coordonnees enn = Coordonnees.depuisCars('m', 'A');
        NbPointsDeVie calculNewPv = JoueurLowatem.calculNewPv(coord, enn, plateau6);
        assertEquals(2, calculNewPv.nbPvRouge);
        assertEquals(0, calculNewPv.nbPvNoir);
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
    
    final String PLATEAU_NIVEAU6
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
    
    final String PLATEAU_NIVEAU6bis
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |   |   |   |   |   |   |   |   |SN5|\n"
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
            + "m|SN3|   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|SR3|   |   |   |   |   |   |   |   |   |   |   |   |SR5|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n";
    
    final String PLATEAU_NIVEAU7
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N \n"
            + " +---+---+---+---+---+---+E--+E--+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |SN2|   |   |   |SN1|   |   |   |   |\n"
            + " +---+---+---+---+---+E--+E--+E--+E--+---+---+---+---+---+\n"
            + "b|   |   |   |   |   |   |   |   |   |   |   |   |   |SR1|\n"
            + " +---+---+---+---+E--+E--+E--+E--+E--+---+---+---+---+---+\n"
            + "c|   |   |SR2|   |   |   |   |   |   |   |   |   |SR2|   |\n"
            + " +---+---+---+E--+E--+E--+E--+E--+---+---+---+---+---+---+\n"
            + "d|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+E--+E--+---+---+---+---+---+---+---+---+\n"
            + "e|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|SN1|   |   |   |   |   |   |   |   |   |SR1|   |SN1|   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|   |   |   |   |   |   |SR2|   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|   |   |   |   |   |   |   |   |   |SN1|   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|   |SR1|   |   |   |   |   |   |   |   |   |   |SN1|   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|   |   |SN1|   |   |   |SN2|   |   |   |   |SN2|   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|   |   |   |   |   |   |   |   |   |   |SR1|SR1|   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|   |   |   |   |SR1|   |   |   |   |   |   |   |   |   |\n"
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
