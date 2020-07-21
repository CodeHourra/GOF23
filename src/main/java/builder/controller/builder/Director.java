package builder.controller.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/6 0006
 * @Time: 22:14
 * @Description: 建造模式指挥者
 */
public class Director {
    /**
     * 指挥工人按照顺序去建造产品
     * @param builder 建造者
     * @return 产品
     */
    public Product build(BaseBuilder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
