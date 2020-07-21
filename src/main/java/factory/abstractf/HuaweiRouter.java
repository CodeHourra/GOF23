package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 23:44
 * @Description:
 */
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动Huawei路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭Huawei路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开Huawei路由器Wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置Huawei路由器");
    }
}
