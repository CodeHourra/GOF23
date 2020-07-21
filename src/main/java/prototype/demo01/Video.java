package prototype.demo01;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/7/7 0007
 * @Time: 22:23
 * @Description: 原型模式
 * 1. 实现Cloneable接口
 * 2. 重写clone方法
 */
public class Video implements Cloneable {
    private String name;
    private Date date;

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
