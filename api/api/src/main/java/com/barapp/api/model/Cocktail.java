import javax.persistence.*;

@Entity
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCocktail;
    private String nomCocktail;
    private String ingredientsCocktail;
    private double prixSmallCocktail;
    private double prixMediumCocktail;
    private double prixLargeCocktail;

    @ManyToOne
    @JoinColumn(name = "id_carte")
    private Carte carte;

    public Long getIdCocktail() {
        return idCocktail;
    }

    public void setIdCocktail(Long idCocktail) {
        this.idCocktail = idCocktail;
    }

    public String getNomCocktail() {
        return nomCocktail;
    }

    public void setNomCocktail(String nomCocktail) {
        this.nomCocktail = nomCocktail;
    }

    public String getIngredientsCocktail() {
        return ingredientsCocktail;
    }

    public void setIngredientsCocktail(String ingredientsCocktail) {
        this.ingredientsCocktail = ingredientsCocktail;
    }

    public double getPrixSmallCocktail() {
        return prixSmallCocktail;
    }

    public void setPrixSmallCocktail(double prixSmallCocktail) {
        this.prixSmallCocktail = prixSmallCocktail;
    }

    public double getPrixMediumCocktail() {
        return prixMediumCocktail;
    }

    public void setPrixMediumCocktail(double prixMediumCocktail) {
        this.prixMediumCocktail = prixMediumCocktail;
    }

    public double getPrixLargeCocktail() {
        return prixLargeCocktail;
    }

    public void setPrixLargeCocktail(double prixLargeCocktail) {
        this.prixLargeCocktail = prixLargeCocktail;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }
}