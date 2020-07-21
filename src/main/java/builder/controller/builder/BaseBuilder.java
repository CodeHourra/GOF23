package builder.controller.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/6 0006
 * @Time: 22:03
 * @Description: 抽象建造者 建造者模式
 */
public abstract class BaseBuilder {
    /**
     * 地基
     */
    abstract void buildA();

    /**
     * 钢筋工程
     */
    abstract void buildB();

    /**
     * 铺电线
     */
    abstract void buildC();

    /**
     * 粉刷
     */
    abstract void buildD();

    /**
     * 得到产品
     * @return 产品
     */
    abstract Product getProduct();
}
