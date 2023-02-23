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
    public String askName()
    {
        return "Hvad er dit navn?";
    }

    @Override
    public String askOptions() {
        return "Hvad vil du?\n" +
                "1: Lån bog\n" +
                "2: Se dine lån";
    }

    @Override
    public String changeLanguage() {
        return "Skift sprog?";
    }
}