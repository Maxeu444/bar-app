@RestController
@RequestMapping("/cocktails")
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/")
    public List<Cocktail> getAllCocktails() {
        return cocktailService.getAllCocktails();
    }

    @GetMapping("/{id}")
    public Cocktail getCocktailById(@PathVariable Long id) {
        return cocktailService.getCocktailById(id);
    }
}