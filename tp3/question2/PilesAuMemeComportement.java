package question2;

public class PilesAuMemeComportement extends junit.framework.TestCase {

    private question2.PileI p1;
    private question2.PileI p2;
    private question2.PileI p3;
    private question2.PileI p4;

    /**
     * Met en place les engagements.
     *
     * M?thode appel?e avant chaque appel de m?thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        p1 = new question2.Pile(PileI.CAPACITE_PAR_DEFAUT);
        p2 = new question2.Pile2(PileI.CAPACITE_PAR_DEFAUT);
        p3 = new question2.Pile3(PileI.CAPACITE_PAR_DEFAUT);
        p4 = new question2.Pile4(PileI.CAPACITE_PAR_DEFAUT);
    }

    /**
     * Supprime les engagements
     *
     * M?thode appel?e apr?s chaque appel de m?thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Lib?rez ici les ressources engag?es par setUp()
    }

    public void test_Sommaire()  throws Exception {

        p4.empiler("b");p4.empiler("a");
        p3.empiler("b");p3.empiler("a");
        p2.empiler("b");p2.empiler("a");
        p1.empiler("b");p1.empiler("a");

        assertEquals(p1.capacite(), p2.capacite());
        assertEquals(p2.capacite(), p3.capacite());
        assertEquals(p3.capacite(), p4.capacite());
     
        assertEquals("[a, b]", p1.toString());
        assertEquals(p2.toString(), p3.toString());
       assertEquals(p3.toString(), p4.toString());

        assertEquals(p1.sommet(), p2.sommet());
        assertEquals(p2.sommet(), p3.sommet());
       

        String s = (String) p1.depiler();
        assertEquals(s, (String) p2.depiler());
        assertEquals(s, (String) p3.depiler());
        

    }

    public void test_meme_comportement() throws Exception { 
        p4.empiler("aze");
        p3.empiler("aze");
        p2.empiler("aze");
        p1.empiler("aze");

      assertEquals("p1.capacit?() == p2.capacit?() ??",p1.capacite(), p2.capacite());
     assertEquals("p2.capacite() == p3.capacite() ??",p2.capacite(), p3.capacite());
        assertEquals("p3.capacite() == p4.capacite() ??",p3.capacite(), p4.capacite());

        assertEquals("[aze]", p1.toString());
        assertEquals("p1.toString() != p2.toString() ?? ", p1.toString(), p2.toString());
        assertEquals("p2.toString()!= p3.toString() ?? ",p2.toString(), p3.toString());
        assertEquals("p3.toString()!= p4.toString() ?? ", p3.toString(), p4.toString());

        assertEquals("p1.sommet() != p2.sommet() ??? ", p1.sommet(), p2.sommet());
        assertEquals("p2.sommet() != p3.sommet() ??? ", p2.sommet(), p3.sommet());
        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());

        String s = (String) p1.depiler();
        assertEquals(" diff?rence apr?s avoir d?pil? ?? ", s, (String) p2.depiler());
        assertEquals(" diff?rence apr?s avoir d?pil? ?? ",s, (String) p3.depiler());
      

        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());

        assertEquals(" diff?rence sur la taille() ?? ",p1.taille(), p2.taille());
        assertEquals(" diff?rence sur la taille() ?? ",p2.taille(), p3.taille());
      

        p4.empiler("azerty");
        p3.empiler("azerty");
        p2.empiler("azerty");
        p1.empiler("azerty");

        assertEquals("p1.sommet() != p2.sommet() ??? ", p1.sommet(), p2.sommet());
        assertEquals("p2.sommet() != p3.sommet() ??? ", p2.sommet(), p3.sommet());
        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());
        assertEquals(" diff?rence sur la taille() ?? ",p1.taille(), p2.taille());
        assertEquals(" diff?rence sur la taille() ?? ",p2.taille(), p3.taille());
      

        p4.empiler("azer");
        p3.empiler("azer");
        p2.empiler("azer");
        p1.empiler("azer");

       
        assertEquals("p2.toString() != p3.toString() ?? ",p2.toString(), p3.toString());
        

        assertEquals("p1.sommet() != p2.sommet() ??? ", p1.sommet(), p2.sommet());
        assertEquals("p2.sommet() != p3.sommet() ??? ", p2.sommet(), p3.sommet());

        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());

        assertEquals(" diff?rence sur la taille() ?? ",p1.taille(), p2.taille());
        assertEquals(" diff?rence sur la taille() ?? ",p2.taille(), p3.taille());
       

        p4.empiler("azer");
        p3.empiler("azer");
        p2.empiler("azer");
        p1.empiler("azer");

       
        assertEquals("p2.toString() != p3.toString() ?? ",p2.toString(), p3.toString());
      

        assertEquals("p1.sommet() != p2.sommet() ??? ", p1.sommet(), p2.sommet());
        assertEquals("p2.sommet() != p3.sommet() ??? ", p2.sommet(), p3.sommet());

        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());

        assertEquals(" diff?rence sur la taille() ?? ",p1.taille(), p2.taille());
        assertEquals(" diff?rence sur la taille() ?? ",p2.taille(), p3.taille());
        

        p4.depiler();
        p3.depiler();
        p2.depiler();
        p1.depiler();

       
        assertEquals("p2.toString() != p3.toString() ?? ",p2.toString(), p3.toString());
      

        assertEquals("p1.sommet() != p2.sommet() ??? ", p1.sommet(), p2.sommet());
        assertEquals("p2.sommet() != p3.sommet() ??? ", p2.sommet(), p3.sommet());

        assertEquals("p1.estVide() != p2.estVide() ??? ",p1.estVide(), p2.estVide());
        assertEquals("p2.estVide()!= p3.estVide() ??? ", p2.estVide(), p3.estVide());
        assertEquals("p1.estPleine() != p2.estPleine() ??? ",p1.estPleine(), p2.estPleine());
        assertEquals("p2.estPleine()!=  p3.estPleine() ??? ",p2.estPleine(), p3.estPleine());

        assertEquals(" diff?rence sur la taille() ?? ",p1.taille(), p2.taille());
        assertEquals(" diff?rence sur la taille() ?? ",p2.taille(), p3.taille());
        

    }
}
