public class StaticBlock {
    private int num;
    private String str;

    static{
        System.out.println("Static Block");
    }

    public StaticBlock(){
        System.out.println("No arg constructor");
    }

    public StaticBlock(int num){
        super();
        this.num = num;
    }

    public StaticBlock(String str){
        super();
        this.str = str;
    }

    public StaticBlock(int num, String str){
        super();
        this.num = num;
        this.str = str;
    }

    public void display(){
        System.out.println("Number: " + num);
        System.out.println("String: " + str);
    }

    public static void main(String[] args){
        StaticBlock block = new StaticBlock();
        block.display();

        StaticBlock block1 = new StaticBlock(10);
        System.out.println(block1.num);

        StaticBlock block2 = new StaticBlock("India");
        System.out.println(block2.str);

        StaticBlock block3 = new StaticBlock(100,"Kolkata");
        block3.display();
    }
}
