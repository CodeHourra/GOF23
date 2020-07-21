package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 22:52
 * @Description TODO
 */
public class Tshirt extends Finery {
		Human human;
		/**
		 * 打扮
		 *
		 * @param human
		 */
		public Tshirt(Human human) {
				super(human);
				this.human = human;
		}
		
		@Override
		public void show() {
				System.out.print(" T恤 ");
				human.show();
		}
}
