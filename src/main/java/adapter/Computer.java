package adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 20:32
 * @Description: 客户端类 想上网但是插不了网线
 */
public class Computer {

    /**
     * 我们的电脑需要连接上转接器才能上网
     * @param adapter 适配器
     */
    public void net(NetToUsb adapter) {
        // 上网的具体实现 寻找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑
        Computer computer = new Computer();
        // 网线
        Adaptee adaptee = new Adaptee();
        // 转接器
        Adapter adapter = new Adapter();

        Adapter2 adapter2 = new Adapter2(adaptee);

        computer.net(adapter);
        computer.net(adapter2);
    }
}
