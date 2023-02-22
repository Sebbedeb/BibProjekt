package Languages;

public class English extends Dialog{

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String welcome() {
        return "Welcome";
    }

    @Override
    public String askAge() {
        return "How old are you?";
    }

    @Override
    public String printAge(String age) {
        return "You are "+age+" years old";
    }

    @Override
    public String changeLanguage() {
        return "Change language?";
    }

}