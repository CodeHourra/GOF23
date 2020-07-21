package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 23:15
 * @Description:
 */
public class HuaweiPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("Huawei手机开机啦。。。");
    }

    @Override
    public void shutdown() {
        System.out.println("Huawei手机关机机啦。。。");
    }

    @Override
    public void call() {
        System.out.println("Huawei手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("Huawei手机发短信");
    }
}
