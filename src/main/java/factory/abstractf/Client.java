package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/31 0031
 * @Time: 10:06
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.iphoneProduct().start();
        xiaomiFactory.iRouterProduct().start();

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.iphoneProduct().start();
        huaweiFactory.iRouterProduct().start();
    }
}
