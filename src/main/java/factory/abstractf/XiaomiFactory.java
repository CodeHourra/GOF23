package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 23:51
 * @Description: 小米工厂
 */
public class XiaomiFactory implements IProductFactory {

    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaomiRouter();
    }
}
