package Languages;

public class Deutsch extends Dialog {

    @Override
    public String hello() {
        return "Guten Tag";
    }

    @Override
    public String welcome() {
        return "Wilkommen";
    }

    @Override
    public String askAge() {
        return "Wie alt bist du?";
    }

    @Override
    public String printAge(String age) {
        return "Du Bist "+age+" Jahre Alt";
    }

    @Override
    public String changeLanguage() {
        return "Sprache ändern?";
    }
}