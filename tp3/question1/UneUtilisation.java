package question1;

public class UneUtilisation {

    public static void main(String[] args) throws Exception {
        Pile p1 = new Pile(6);
        Pile p2 = new Pile(10);
        // p1 est ici une pile de polygones réguliers PolygoneRegulier.java

        p1.empiler(new PolygoneRegulier(5, 100));
        p1.empiler("polygone");
        p1.empiler(new Integer(100));
        System.out.println(" la pile p1 = " + p1); // resultat :  la pile p1 = [100, polygone, <5,100>]

        p2.empiler(new Integer(1000));
        p1.empiler(p2);
        System.out.println(" la p1 = " + p1); // resultat :  la p1 = [[1000], 100, polygone, <5,100>]

        try {
            p1.empiler(new PolygoneRegulier(4,100));
            // ....
            String s = (String) p1.depiler(); 
            // L'exception produite est du au castion de l'objet polynomeRegulier 
            //� String sans appeler la methode toString() de la classe PolynomeRegulier 
        } catch (Exception e) {
            e.printStackTrace();
        } // catch
    } // main()
} // UneUtilisation
