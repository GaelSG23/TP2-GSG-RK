package livres;

public class Pays
{
    public String nom;
    public String code_pays;

    public Pays(String nom, String code_pay) {

        this.nom = nom;
//        assert code_pay.chars().filter(Character::isUpperCase).count() == 3
//                : "Le code pays doit contenir exactement 3 lettres majuscules";

        if (code_pay.chars().filter(Character::isUpperCase).count() != 3) {
            throw new IllegalArgumentException("Le code pays doit contenir 3 majuscules");
        }
    }
}
