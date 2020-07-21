package single;

import utils.ThreadPoolUtil;

import java.util.concurrent.ExecutorService;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/24 0024 10:31
 * @Description 饿汉式单例
 * 缺陷:
 * 可能会浪费资源/空间
 * 优点:
 * 线程安全
 */
public class Hungry {
		private byte[] data1 = new byte[1024*1024];
		private byte[] data2 = new byte[1024*1024];
		private byte[] data3 = new byte[1024*1024];
		private byte[] data4 = new byte[1024*1024];
		/**
		 * 1. 私有化构造器
		 */
		private Hungry() {
				System.out.println(Thread.currentThread().getName() + " start");
		}
		
		/**
		 * 2. 初始化对象
		 */
		private static Hungry HUNGRY = new Hungry();
		
		/**
		 * 3. 提供获取对象方法
		 * @return
		 */
		private static Hungry getInstance() {
				return HUNGRY;
		}
		
		public static void main(String[] args) {
				ExecutorService executorService = ThreadPoolUtil.getExecutorService("HUNGRY-thread");
				
				for (int i = 0; i < 10; i++) {
						executorService.execute(() -> {
								System.out.println(Hungry.getInstance());
						});
				}
				executorService.shutdown();
		}
}
