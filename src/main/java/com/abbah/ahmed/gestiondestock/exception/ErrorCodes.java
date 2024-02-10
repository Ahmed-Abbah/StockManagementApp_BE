package com.abbah.ahmed.gestiondestock.exception;

public enum ErrorCodes {
    VENTE_NOT_FOUND(1000),
    ARTICLE_NOT_FOUND(2000),
    ARTICLE_NOT_VALID(2001),
    CLIENT_NOT_FOUND(3000),
    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    ENTREPRISE_NOT_FOUND(6000),
    FOURNISSEUR_NOT_FOUND(7000),
    LIGNE_COMMANDE_COMMANDE_NOT_FOUND(8000),
    LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(9000),
    LIGNE_VENTE_NOT_FOUND(10000),
    MVT_STK_FOUND(11000),
    CATEGORY_NOT_FOUND(12000);

    private int code;

    ErrorCodes(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
