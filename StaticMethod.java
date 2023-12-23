public class StaticMethod {
    public static void run(){
        System.out.println("Method calling without creating object");
    }

    public static void main(String[] args){
        StaticMethod.run();
    }
}
