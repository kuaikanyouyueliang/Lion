/**
 * User:Administrator
 * Date:2016/4/12 21:39
 */
public class 类和对象有什么区别 {
    /**
     * 类：class 抽象的概念，提取相似的属性
     * 对象：Object 具体化，也就是实例化将类变为可操作性的
     */
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.name="旺财";
        animal.age=2;
        animal.run();

    }


}
class Animal{
    String name;
    int age;
    public void run(){
        System.out.println(name+":"+age+":Running...");
    }
}
