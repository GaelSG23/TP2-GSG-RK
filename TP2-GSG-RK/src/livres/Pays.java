package livres;

public class Pays
{
    public String nom;
    public String code_pay;

    public Pays(String nom, String code_pay)
    {
        this.nom = nom;
        if(code_pay.chars().filter(Character::isUpperCase).count() == 3)
        {
            this.code_pay = code_pay;
        }
        else
        {
            System.out.println("Erreur de code pay");
        }
    }
}
