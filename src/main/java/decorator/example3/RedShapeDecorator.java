package decorator.example3;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/19 23:01
 * @Description TODO
 */
public class RedShapeDecorator extends ShapeDecorator{
		public RedShapeDecorator(Shape decoratedShape) {
				super(decoratedShape);
		}
		
		@Override
		public void draw() {
				decoratedShape.draw();
				setRedBorder(decoratedShape);
		}
		
		private void setRedBorder(Shape decoratedShape){
				System.out.println("Border Color: Red");
		}
}
