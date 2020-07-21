package factory.method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 21:23
 * @Description:
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("Tesla");
    }
}
