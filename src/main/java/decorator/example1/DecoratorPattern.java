package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 21:56
 * @Description 装饰器模式
 */
public class DecoratorPattern {
		public static void main(String[] args) {
				Human human = new Person("菜花儿");
				
				human = new Shoes(human);
				human = new Tshirt(human);
				human = new BigTrouser(human);
				
				human.show();
		}
}
