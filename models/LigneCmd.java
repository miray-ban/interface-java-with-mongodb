package models;

public class LigneCmd {
    private int quantite;
    private Article article;

    // Constructeur
    public LigneCmd(int quantite, Article article) {
        this.quantite = quantite;
        this.article = article;
    }

    // Getters and setters
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
