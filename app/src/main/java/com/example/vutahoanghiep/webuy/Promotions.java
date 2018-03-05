package com.example.vutahoanghiep.webuy;

/**
 * Created by TAHIR on 01/03/2018.
 */

class Promotions {
    private String nomImageProduit;
    private String nomProduit;
    private double prixHorsPromo;
    private double prixPromo;
    private int quantiteMin;
    private int quantiteAAcheter;

    public Promotions(String nomImageProduit, String nomProduit, double prixHorsPromo, double prixPromo, int quantiteMin, int quantiteAAcheter) {
        this.nomImageProduit = nomImageProduit;
        this.nomProduit = nomProduit;
        this.prixHorsPromo = prixHorsPromo;
        this.prixPromo = prixPromo;
        this.quantiteMin = quantiteMin;
        this.quantiteAAcheter = quantiteAAcheter;
    }

    public String getNomImageProduit() {
        return nomImageProduit;
    }

    public void setNomImageProduit(String nomLogoProduit) {
        this.nomImageProduit = nomLogoProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrixHorsPromo() {
        return prixHorsPromo;
    }

    public void setPrixHorsPromo(double prixHorsPromo) {
        this.prixHorsPromo = prixHorsPromo;
    }

    public double getPrixPromo() {
        return prixPromo;
    }

    public void setPrixPromo(double prixPromo) {
        this.prixPromo = prixPromo;
    }

    public int getQuantiteMin() {
        return quantiteMin;
    }

    public void setQuantiteMin(int quantiteMin) {
        this.quantiteMin = quantiteMin;
    }

    public int getQuantiteAAcheter() {
        return quantiteAAcheter;
    }

    public void setQuantiteAAcheter(int quantiteAAcheter) {
        this.quantiteAAcheter = quantiteAAcheter;
    }
}
