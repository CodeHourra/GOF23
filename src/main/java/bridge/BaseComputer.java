package bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 21:36
 * @Description:
 */
public abstract class BaseComputer {
    protected Brand brand;

    public BaseComputer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        // 自带品牌信息
        brand.info();
    }
}
