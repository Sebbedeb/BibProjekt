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
    public String askOptions() {
        return "What do you wanna do?\n"+
                "1: borrow a book?\n"+
                "2: see your currently borrowed books";
    }

    @Override
    public String askName() {
        return "What is your id?";
    }

    @Override
    public String changeLanguage() {
        return "Change language?";
    }

}