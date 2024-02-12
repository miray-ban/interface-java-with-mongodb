package models;
import java.util.Date;

public class Commande {
    private int num;
    private Date date;
    private String adresseLivraison;
    private Client client;

    public Commande(int num, Date date, String adresseLivraison, Client client) {
        this.num = num;
        this.date = date;
        this.adresseLivraison = adresseLivraison;
        this.client = client;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
