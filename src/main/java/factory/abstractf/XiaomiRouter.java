package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 23:43
 * @Description:
 */
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开小米路由器Wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器");
    }
}
