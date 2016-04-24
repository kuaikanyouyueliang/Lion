/**
 * Created by Administrator on 2016/4/24.
 */
public class 异常处理 extends Throw {
    /**
     * throw 异常对象名；
     * throw new异常对类名；
     * throw语句一旦执行，后面的程序将不在执行；
     *
     * 执行顺序：
     * 先执行try catch finally
     * 当其他的异常没有被try代码捕获的时候，进而转成系统处理，最后再抛出；
     *
     * @param args
     */
    private static final RuntimeException NullPointerException=null;
    public static void main(String[] args) {
        RuntimeException re=NullPointerException;

        System.out.println("1");
        try {
            throw_do();
        }catch (Exception e){
            System.out.println("2");
        }
        System.out.println("3");
        throw re;

    }
    private static void throw_do(){
        throw new ArithmeticException();
    }

    void throw1() {
        try {
            throw2();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Throw {
    void throw1() throws ArithmeticException {
        System.out.println("throw1");
    }

    void throw2() throws IllegalAccessException {
        System.out.println("throw2");
    }
}
