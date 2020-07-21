package bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/8 0008
 * @Time: 21:50
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 苹果台式机
        BaseComputer computer = new Desktop(new Apple());
        computer.info();

        // 联想笔记本
        BaseComputer computer2 = new Laptop(new Lenovo());
        computer2.info();

    }
}
