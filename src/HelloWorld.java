public class HelloWorld {
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 打印 Hello World
        int a = 2;
        if(a>11){
            System.out.println(a);
        }
        else{
            System.out.println("no equal");
        }
        switch (a){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("Default case ");
        }
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        while (a<100){
            System.out.print(a);
            System.out.println("aaa");
            a++;
        }
    }

}