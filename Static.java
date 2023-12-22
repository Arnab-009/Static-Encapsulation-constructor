public class Static {
    private static int count = 0;

    public Static(){
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args){
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        System.out.println("Number of instances created: " + Static.getCount());
    }
}
