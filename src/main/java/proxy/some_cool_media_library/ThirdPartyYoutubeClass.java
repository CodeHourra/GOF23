package proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 10:51
 * @Description 远程服务实现
 */
public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
		/**
		 * 通用视频
		 *
		 * @return
		 */
		@Override
		public HashMap<String, Video> popularVideos() {
				connectToServer("http://www.youtobe.com");
				return getRandomVideos();
		}
		
		/**
		 * 获取Video
		 *
		 * @param videoId 视频id
		 * @return
		 */
		@Override
		public Video getVideo(String videoId) {
				connectToServer("http://www.youtube.com/" + videoId);
				return getSomeVideo(videoId);
		}
		
		/**
		 * 生成随机数
		 * @param max 随机数最大值
		 * @param min 随机数最小值
		 * @return 在[min, max]之间的随机数
		 */
		private int random(int min, int max) {
				return min + (int) (Math.random() * ((max - min) + 1));
		}
		
		private void experienceNetworkLatency() {
				int randomLatency = random(5, 10);
				for (int i = 0; i < randomLatency; i++) {
						try {
								Thread.sleep(1000);
						} catch (InterruptedException e) {
								e.printStackTrace();
						}
				}
		}
		
		private HashMap<String, Video> getRandomVideos() {
				System.out.print("Downloading populars... ");
				
				experienceNetworkLatency();
				HashMap<String, Video> hmap = new HashMap<String, Video>();
				hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
				hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
				hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
				hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
				hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
				
				System.out.print("Done!" + "\n");
				return hmap;
		}
		
		private void connectToServer(String server) {
				System.out.print("Connecting to " + server + "... ");
				experienceNetworkLatency();
				System.out.print("Connected!" + "\n");
		}
		
		private Video getSomeVideo(String videoId) {
				System.out.print("Downloading video... ");
				
				experienceNetworkLatency();
				Video video = new Video(videoId, "Some video title");
				
				System.out.print("Done!" + "\n");
				return video;
		}
}
