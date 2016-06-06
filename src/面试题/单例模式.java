/**
 * Created by Administrator on 2016/6/6.
 */
public class 单例模式 {
    private 单例模式(){

    }
    //懒汉式,线程不安全
//    private static 单例模式 instance;
//    public static 单例模式 getInstance(){
//        if (instance==null){
//            return new 单例模式();
//        }
//        return instance;
//    }
    //懒汉式，线程安全，效率低
//    private static 单例模式 instance;
//    public static synchronized 单例模式 getInstance(){
//        if(instance==null){
//            return new 单例模式();
//        }
//        return instance;
//    }
    //懒汉式，双重检验锁
//    private volatile static 单例模式 instance;
//    public static 单例模式 getInstance(){
//        if(instance==null){
//            synchronized (单例模式.class){
//                if (instance==null){
//                    return new 单例模式();
//                }
//            }
//        }
//        return instance;
//    }
    //饿汉式
//    private static final 单例模式 instance=new 单例模式();
//    public static 单例模式 getInstance(){
//        return instance;
//    }
    //静态内部类
    private static class SingletonHolder{
        private static final 单例模式 INSTANCE=new 单例模式();
    }
    public static 单例模式 getInstance(){
        return SingletonHolder.INSTANCE;
    }


}
