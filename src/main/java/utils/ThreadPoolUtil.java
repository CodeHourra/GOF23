package utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/24 0024 11:09
 * @Description 线程池工具
 * 线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
 * 说明：Executors各个方法的弊端：
 * 1）newFixedThreadPool和newSingleThreadExecutor:
 * 主要问题是堆积的请求处理队列可能会耗费非常大的内存，甚至OOM。
 * 2）newCachedThreadPool和newScheduledThreadPool:
 * 主要问题是线程数最大数是Integer.MAX_VALUE，可能会创建数量非常多的线程，甚至OOM。
 */
public class ThreadPoolUtil {
		
		private ThreadPoolUtil() {
		}
		
		private volatile static ExecutorService executorService;
		
		public static ExecutorService getExecutorService(String threadName) {
				if (executorService == null) {
						synchronized (ThreadPoolUtil.class) {
								/**
								 * 使用谷歌的guava框架
								 * ThreadPoolExecutor参数解释
								 *   1.corePoolSize 核心线程池大小
								 *   2.maximumPoolSize 线程池最大容量大小
								 *   3.keepAliveTime 线程池空闲时，线程存活的时间
								 *   4.TimeUnit 时间单位
								 *   5.ThreadFactory 线程工厂
								 *   6.BlockingQueue任务队列
								 *   7.RejectedExecutionHandler 线程拒绝策略
								 */
								ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(threadName + "-%d").build();
								executorService = new ThreadPoolExecutor(5, 5,
												0L, TimeUnit.MILLISECONDS,
												new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
								
						}
				}
				return executorService;
		}
}
