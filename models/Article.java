package models;

public class Article {
    private int code;
    private String designation;
    private double prixU;
    private String rayon;
    private String sousRayon;

    // Constructeur
    public Article(int code, String designation, double prixU, String rayon, String sousRayon) {
        this.code = code;
        this.designation = designation;
        this.prixU = prixU;
        this.rayon = rayon;
        this.sousRayon = sousRayon;
    }

    // Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixU() {
        return prixU;
    }

    public void setPrixU(double prixU) {
        this.prixU = prixU;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getSousRayon() {
        return sousRayon;
    }

    public void setSousRayon(String sousRayon) {
        this.sousRayon = sousRayon;
    }
}
