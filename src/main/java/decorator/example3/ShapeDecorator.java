package decorator.example3;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/19 23:00
 * @Description TODO
 */
public abstract class ShapeDecorator implements Shape {
		protected Shape decoratedShape;
		
		public ShapeDecorator(Shape decoratedShape){
				this.decoratedShape = decoratedShape;
		}
		
		@Override
		public void draw(){
				decoratedShape.draw();
		}
}
