package adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 20:35
 * @Description: 适配器 连接电脑-连接网络
 * // 两种方式实现
 * 1. 继承 （类适配器， 单继承） ⭐
 * 2. 组合 （对象适配器）
 */
public class Adapter extends Adaptee implements NetToUsb{
    /**
     * 处理请求 网线 => usb
     */
    @Override
    public void handleRequest() {
        super.request();
    }
}
