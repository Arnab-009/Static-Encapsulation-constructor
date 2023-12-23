public class Constructor {
    private int age;
    private String name;

    public Constructor (int age, String name){
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){
        Constructor con = new Constructor(25, "Arnab Dutta");
        con.display();
    }
}
