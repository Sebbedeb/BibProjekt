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
}