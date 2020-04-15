package Main;

public class Main {
    public static void main(String[] arg){
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        Zwembad z2 = new Zwembad(2.5,100,2.0);

        System.out.println("BREEDTE: "+z1.getBreedte());
        System.out.println("LENGTE: "+z1.getLengte());
        System.out.println("DIEPTE: "+z1.getDiepte());
        System.out.println("INHOUD: "+z1.getInhoud());

        System.out.println("");

        System.out.println("GEGEVENS: "+z2.toString());
        System.out.println("INHOUD: "+z2.getInhoud());
    }
}
