public class Dog {
    String breed;
    int age;
    String color;
    void barking(){}
    void hungry(){}
    public Dog(String name){
        System.out.println("小狗的名称是：" + name);
    }
    public static void main(String[] args){
        Dog mydog = new Dog("haoran");
    }
}
