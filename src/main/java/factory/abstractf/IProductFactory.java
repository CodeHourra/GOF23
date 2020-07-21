package factory.abstractf;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 23:49
 * @Description: 抽象产品工厂
 */
public interface IProductFactory {

    IphoneProduct iphoneProduct();

    IRouterProduct iRouterProduct();
}
