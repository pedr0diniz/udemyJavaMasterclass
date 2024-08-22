package sec8ooppart2polymorphism.sec8107polymorphismpart1;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}
