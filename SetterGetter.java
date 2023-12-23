public class SetterGetter {
    private int num;
    private String str;

    public SetterGetter(int num, String str){
        this.num = num;
        this.str = str;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public void display(){
        System.out.println("Integer Number: " + getNum());
        System.out.println("String value: " + getStr());
    }

    public static void main(String[] args){
        SetterGetter sg = new SetterGetter(10, "Kolkata");
        System.out.println("Values before modification");
        sg.display();

        sg.setNum(100);
        sg.setStr("India");

        System.out.println("Values after modification");
        sg.display();
    }
}
