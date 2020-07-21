package bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 21:41
 * @Description:
 */
public class Desktop extends BaseComputer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("台式机");
    }
}
