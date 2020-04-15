package Main;

public class Zwembad {

    private double Breedte;
    private double Lengte;
    private double Diepte;
    private double inhoud;

    public Zwembad(double br, double len, double diep) {
        Breedte = br;
        Lengte = len;
        Diepte = diep;


    }

    public double getBreedte(){
        return Breedte;
    }

    public double getLengte(){
        return Lengte;
    }

    public double getDiepte(){
        return Diepte;
    }

    public double getInhoud(){
        return Lengte*Breedte*Diepte;
    }

    public void setBreedte(double breedte) {
        Breedte = breedte;
    }

    public void setDiepte(double diepte) {
        Diepte = diepte;
    }

    public void setLengte(double lengte) {
        Lengte = lengte;
    }

    public String toString(){
        String s = "Dit zwembad is "+Breedte+" meter breed, "+Lengte+"meter lang, en "+Diepte+ "meter diep";
        return s;
    }



}
