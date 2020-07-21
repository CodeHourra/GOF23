package adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 20:30
 * @Description: 适配器模式 要被适配的类
 */
public class Adaptee {
    public  void request() {
        System.out.println("连接网线上网");
    }
}
