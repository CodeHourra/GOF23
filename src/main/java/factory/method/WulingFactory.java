package factory.method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 22:43
 * @Description:
 */
public class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
