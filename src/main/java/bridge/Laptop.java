package bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 21:44
 * @Description:
 */
public class Laptop extends BaseComputer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("笔记本");
    }
}
