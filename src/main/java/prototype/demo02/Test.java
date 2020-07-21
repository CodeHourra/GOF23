package prototype.demo02;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/7 0007
 * @Time: 22:28
 * @Description: 客户端 拷贝视频
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象 v1
//        LocalDate now = LocalDate.now();
        Date date = new Date();
        String name = "正版";
        Video v1 = new Video(name, date);
        System.out.println(v1.toString() + " : " + v1.hashCode());

        Video v2 = (Video) v1.clone();
        System.out.println(v2.toString() + " : " + v2.hashCode());

        date.setTime(545151515);
        System.out.println(v1.toString() + " : " + v1.hashCode());
        System.out.println(v2.toString() + " : " + v2.hashCode());
    }
}
