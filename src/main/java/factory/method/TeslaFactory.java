package factory.method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 22:44
 * @Description:
 */
public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
