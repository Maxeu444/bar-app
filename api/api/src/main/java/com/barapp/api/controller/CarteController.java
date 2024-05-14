@RestController
@RequestMapping("/cartes")
public class CarteController {

    @Autowired
    private CarteService carteService;

    @GetMapping("/")
    public List<Carte> getAllCartes() {
        return carteService.getAllCartes();
    }

    @GetMapping("/{id}")
    public Carte getCarteById(@PathVariable Long id) {
        return carteService.getCarteById(id);
    }

    @PostMapping("/")
    public Carte addCarte(@RequestBody Carte carte) {
        return carteService.addCarte(carte);
    }

    @PutMapping("/{id}")
    public Carte updateCarte(@PathVariable Long id, @RequestBody Carte carte) {
        return carteService.updateCarte(id, carte);
    }

    @DeleteMapping("/{id}")
    public void deleteCarte(@PathVariable Long id) {
        carteService.deleteCarte(id);
    }


}