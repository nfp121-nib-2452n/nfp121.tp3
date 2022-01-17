package question2;

/**
 * Classe-test Pile4Test.
 * 
 * @author (votre nom)
 * @version (un num?ro de version ou une date)
 * 
 *          Les classes-test sont document?es ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont bas?es sur le document ? 2002 Robert A. Ballance intitul?
 *          ?JUnit: Unit Testing Framework?.
 * 
 *          Les objets Test (et TestSuite) sont associ?s aux classes ? tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          m?me paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque m?thode Test ?
 *          ex?cuter. Il peut y avoir plus d'une m?thode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ d?couvrira
 *          automatiquement (par introspection) les m?thodes Test de votre
 *          classe Test et g?n?rera la TestSuite cons?quente. Chaque appel d'une
 *          m?thode Test sera pr?c?d? d'un appel de setUp(), qui r?alise les
 *          engagements, et suivi d'un appel ? tearDown(), qui les d?truit.
 */
public class Pile4Test extends junit.framework.TestCase {
    private Pile4 p1;
    private Pile4 p2;
    /**
     * Constructeur de la classe-test Pile4Test
     */
    public Pile4Test() {
    }

    /**
     * Met en place les engagements.
     * 
     * M?thode appel?e avant chaque appel de m?thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        p1 = new Pile4();
        p2 = new Pile4();

    }

    /**
     * Supprime les engagements
     * 
     * M?thode appel?e apr?s chaque appel de m?thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Lib?rez ici les ressources engag?es par setUp()
    }

    public void test_Pile_estPleine() throws Exception {
        Pile4 p = new question2.Pile4(3);
        p.empiler(3);
        assertEquals(1, p.taille());
        p.empiler(2);
        assertEquals(2, p.taille());
        p.empiler(1);
        assertEquals(3, p.taille());

        assertEquals(true, p.estPleine());
        assertEquals(p.taille(), p.capacite());
        try {
            p.empiler(0);
        } catch (Exception e) {
           assertTrue(e instanceof question1.PilePleineException);
          
        }
    }
    
    public void test_Pile_sommet() throws Exception {
        Pile4 p = new question2.Pile4(3);
        assertEquals(true, p.estVide());

        p.empiler(new Integer(3));
        assertEquals(" sommet ?? ", new Integer(3), Integer.valueOf(p.sommet().toString()));
        assertEquals(1, p.taille());
        assertEquals(" depiler ?? ", new Integer(3), Integer.valueOf(p.depiler().toString()));
        assertEquals(0, p.taille());
    }

    public void test_Pile_estVide() throws Exception {
        Pile4 p = new question2.Pile4(3);
        assertEquals(true, p.estVide());
        try {
            Object r = p.depiler();
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof question1.PileVideException);
        }
    }
    public void test_Pile_TailleNegative() {
        Pile4 p = new question2.Pile4(-3);
        assertEquals(p.CAPACITE_PAR_DEFAUT, p.capacite());

    }
    public void test_Pile_equals() throws Exception {

        p1.empiler(3);
        p1.empiler(2);
        p1.empiler(1);

        p2.empiler(3);
        p2.empiler(2);
        p2.empiler(1);

        assertTrue("?galit? de deux piles ? ", p1.equals(p2));
        assertTrue("?galit? de deux piles ? ", p2.equals(p1));
        assertTrue("?galit? de deux piles ? ", p1.equals(p1));

        p2.empiler(1);
        assertFalse("?galit? de deux piles ? ", p1.equals(p2));

    }

    public void test_Pile_toString() throws Exception {
        Pile4 pile1 = new question2.Pile4(3);
        assertEquals("toString incorrect ? ", "[]", pile1.toString());
        pile1.empiler(4);
        assertEquals("toString incorrect ? ", "[4]", pile1.toString());
        pile1.empiler(5);
        assertEquals("toString incorrect ? ", "[4, 5]", pile1.toString());
        pile1.empiler(3);
        assertEquals("toString incorrect ? ", "[4, 5, 3]", pile1.toString());

    }

}