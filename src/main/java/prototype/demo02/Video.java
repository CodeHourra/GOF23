package prototype.demo02;

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
    private Date createTime;

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Video v = (Video) clone;
        v.createTime = (Date) this.createTime.clone();
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + createTime +
                '}';
    }
}
