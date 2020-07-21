package decorator.example3;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/19 23:00
 * @Description TODO
 */
public class Rectangle implements Shape {
		@Override
		public void draw() {
				System.out.println("Shape: Rectangle");
		}
}
