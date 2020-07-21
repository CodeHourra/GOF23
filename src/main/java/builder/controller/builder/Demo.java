package builder.controller.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/6 0006
 * @Time: 22:17
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
