import javax.persistence.*;

@Entity
public class ContenuCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContcom;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "id_cocktail")
    private Cocktail cocktail;

    private int etapeContcom;

    public Long getIdContcom() {
        return idContcom;
    }

    public void setIdContcom(Long idContcom) {
        this.idContcom = idContcom;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public int getEtapeContcom() {
        return etapeContcom;
    }

    public void setEtapeContcom(int etapeContcom) {
        this.etapeContcom = etapeContcom;
    }
}