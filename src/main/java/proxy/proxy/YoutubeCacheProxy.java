package proxy.proxy;

import proxy.some_cool_media_library.ThirdPartyYoutubeClass;
import proxy.some_cool_media_library.ThirdPartyYoutubeLib;
import proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 11:02
 * @Description 缓存代理
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib{
		private ThirdPartyYoutubeLib youtubeService;
		private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
		private HashMap<String, Video> cacheAll = new HashMap<String, Video>();
		
		public YoutubeCacheProxy() {
				this.youtubeService = new ThirdPartyYoutubeClass();
		}
		
		/**
		 * 通用视频
		 *
		 * @return
		 */
		@Override
		public HashMap<String, Video> popularVideos() {
				if (cachePopular.isEmpty()) {
						cachePopular = youtubeService.popularVideos();
				} else {
						System.out.println("Retrieved list from cache.");
				}
				return cachePopular;
		}
		
		/**
		 * 获取Video
		 *
		 * @param videoId 视频id
		 * @return
		 */
		@Override
		public Video getVideo(String videoId) {
				Video video = cacheAll.get(videoId);
				if (video == null) {
						video = youtubeService.getVideo(videoId);
						cacheAll.put(videoId, video);
				} else {
						System.out.println("Retrieved video '" + videoId + "' from cache.");
				}
				return video;
		}
		
		public void reset() {
				cachePopular.clear();
				cacheAll.clear();
		}
}
