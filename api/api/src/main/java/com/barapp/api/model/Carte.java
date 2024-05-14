import javax.persistence.*;

@Entity
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarte;

    @ManyToOne
    @JoinColumn(name = "id_user_carte")
    private User user;

    @OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
    private List<Cocktail> cocktails;

    public Long getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(Long idCarte) {
        this.idCarte = idCarte;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<Cocktail> cocktails) {
        this.cocktails = cocktails;
    }
}