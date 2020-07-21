package proxy.downloader;

import proxy.some_cool_media_library.Video;
import proxy.some_cool_media_library.ThirdPartyYoutubeLib;

import java.util.HashMap;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 11:09
 * @Description 媒体下载应用
 */
public class YoutubeDownloader {
		private ThirdPartyYoutubeLib api;
		
		public YoutubeDownloader(ThirdPartyYoutubeLib api) {
				this.api = api;
		}
		
		public void renderVideoPage(String videoId) {
				Video video = api.getVideo(videoId);
				System.out.println("\n-------------------------------");
				System.out.println("Video page (imagine fancy HTML)");
				System.out.println(video.toString());
				System.out.println("-------------------------------\n");
		}
		
		public void renderPopularVideos() {
				HashMap<String, Video> list = api.popularVideos();
				System.out.println("\n-------------------------------");
				System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
				for (Video video : list.values()) {
						System.out.println(video.toString());
				}
				System.out.println("-------------------------------\n");
		}
}
