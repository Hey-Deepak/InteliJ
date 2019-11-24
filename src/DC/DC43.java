package DC;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String x) {
        this.name = x;
    }
}

public class DC43 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Deepak");
        System.out.println("Name is " + myObj.getName());
    }
}
