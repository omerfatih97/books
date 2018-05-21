package pt.ipg.bodymassindex2;

/**
 * Created by jei on 19/03/2018.
 */

public class BodyMassIndex {
    private double  altura; // metros
    private double  peso; // kg


    /**
     * Creates a new BodyMassIndex object
     * @param altura altura em metros
     * @param peso peso em kg
     */
    public BodyMassIndex(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * gets the body mass index
     * @return the value representing of body mass index
     */

    public double getIndex() {
        return peso / (altura *altura);
    }
}
