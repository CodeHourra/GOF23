package decorator.example3;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/19 23:02
 * @Description TODO
 */
public class DecoratorPatternDemo {
		public static void main(String[] args) {
				
				Shape circle = new Circle();
				ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
				ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
				//Shape redCircle = new RedShapeDecorator(new Circle());
				//Shape redRectangle = new RedShapeDecorator(new Rectangle());
				System.out.println("Circle with normal border");
				circle.draw();
				
				System.out.println("\nCircle of red border");
				redCircle.draw();
				
				System.out.println("\nRectangle of red border");
				redRectangle.draw();
		}
}
