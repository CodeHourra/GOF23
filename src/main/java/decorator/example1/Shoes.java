package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 22:53
 * @Description TODO
 */
public class Shoes extends Finery {
		Human human;
		/**
		 * 打扮
		 *
		 * @param human
		 */
		public Shoes(Human human) {
				super(human);
				this.human = human;
		}
		
		@Override
		public void show() {
				System.out.print(" 破鞋 ");
				human.show();
		}
}
