package builder.controller.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/6 0006
 * @Time: 22:09
 * @Description:
 */
public class Worker extends BaseBuilder {

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    /**
     * 地基
     */
    @Override
    void buildA() {
        System.out.println("建造地基");
        product.setBuildA("建造地基");
    }

    /**
     * 钢筋工程
     */
    @Override
    void buildB() {
        System.out.println("铺设钢筋");
        product.setBuildB("铺设钢筋");
    }

    /**
     * 铺电线
     */
    @Override
    void buildC() {
        System.out.println("铺设电线");
        product.setBuildC("铺设电线");
    }

    /**
     * 粉刷
     */
    @Override
    void buildD() {
        System.out.println("粉刷墙壁");
        product.setBuildD("粉刷墙壁");
    }

    /**
     * 得到产品
     *
     * @return 产品
     */
    @Override
    Product getProduct() {
        return product;
    }
}
