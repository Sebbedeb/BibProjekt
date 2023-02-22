package Languages;

public class Dansk extends Dialog{

    @Override
    public String hello() {
        return "HEJ";
    }

    @Override
    public String welcome() {
        return "Velkommen";
    }

    @Override
    public String askAge() {
        return "Hvor gammel er du?";
    }

    @Override
    public String printAge(String age) {
        return "Du er "+age+" år gammel";
    }

    @Override
    public String changeLanguage() {
        return "Skift sprog?";
    }
}