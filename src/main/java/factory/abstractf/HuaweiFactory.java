package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/31 0031
 * @Time: 10:04
 * @Description: 华为工厂
 */
public class HuaweiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaweiRouter();
    }
}
