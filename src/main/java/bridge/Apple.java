package bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 21:35
 * @Description:
 */
public class Apple implements Brand {
    /**
     * 打印品牌信息
     */
    @Override
    public void info() {
        System.out.print("Apple");
    }
}
