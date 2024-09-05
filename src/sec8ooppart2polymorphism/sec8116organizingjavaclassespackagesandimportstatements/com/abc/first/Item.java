package sec8ooppart2polymorphism.sec8116organizingjavaclassespackagesandimportstatements.com.abc.first;

public class Item {

    private String type;

    public Item(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                '}';
    }
}
