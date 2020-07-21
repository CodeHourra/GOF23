package proxy;

import proxy.downloader.YoutubeDownloader;
import proxy.proxy.DynamicSubject;
import proxy.proxy.YoutubeCacheProxy;
import proxy.some_cool_media_library.ThirdPartyYoutubeClass;
import proxy.some_cool_media_library.ThirdPartyYoutubeLib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 11:19
 * @Description 代理模式演示
 */
public class Demo {
		public static void main(String[] args) {
				YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
				YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());
				long naive = test(naiveDownloader);
				long smart = test(smartDownloader);
				System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
		}
		
		private void javaDynamicProxy() {
				// 指定代理类
				ThirdPartyYoutubeLib partyYoutubeLib = new ThirdPartyYoutubeClass();
				// 动态代理
				InvocationHandler dynamicSubject = new DynamicSubject(partyYoutubeLib);
				
				Class<? extends ThirdPartyYoutubeLib> libClass = partyYoutubeLib.getClass();
				ThirdPartyYoutubeLib youtubeLib = (ThirdPartyYoutubeLib) Proxy.newProxyInstance(libClass.getClassLoader(), libClass.getInterfaces(), dynamicSubject);
				System.out.println("partyYoutubeLib的Class类是：" + youtubeLib.getClass().toString());
				System.out.println(youtubeLib instanceof Proxy);
				
				System.out.print("youtubeLib中的属性有：");
				
				Field[] field = youtubeLib.getClass().getDeclaredFields();
				for (Field f : field) {
						System.out.print(f.getName() + ", ");
				}
				System.out.print("\n" + "youtubeLib中的方法有：");
				
				Method[] method = youtubeLib.getClass().getDeclaredMethods();
				
				for (Method m : method) {
						System.out.print(m.getName() + ", ");
				}
				
				System.out.println("\n" + "youtubeLib的父类是：" + youtubeLib.getClass().getSuperclass());
				
				System.out.print("\n" + "youtubeLib实现的接口是：");
				
				Class<?>[] interfaces = youtubeLib.getClass().getInterfaces();
				
				for (Class<?> i : interfaces) {
						System.out.print(i.getName() + ", ");
				}
				
				System.out.println("\n\n" + "运行结果为：");
				youtubeLib.popularVideos();
		}
		
		private static long test(YoutubeDownloader downloader) {
				long startTime = System.currentTimeMillis();
				
				// User behavior in our app:
				downloader.renderPopularVideos();
				downloader.renderVideoPage("catzzzzzzzzz");
				downloader.renderPopularVideos();
				downloader.renderVideoPage("dancesvideoo");
				// Users might visit the same page quite often.
				downloader.renderVideoPage("catzzzzzzzzz");
				downloader.renderVideoPage("someothervid");
				
				long estimatedTime = System.currentTimeMillis() - startTime;
				System.out.print("Time elapsed: " + estimatedTime + "ms\n");
				return estimatedTime;
		}
}
