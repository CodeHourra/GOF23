package proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * 代理模式
 * @author Liugan
 * @date 2020/5/2 09:53
 * 远程服务接口
 */
public interface ThirdPartyYoutubeLib {
		
		/**
		 * 通用视频
		 * @return
		 */
		HashMap<String, Video> popularVideos();
		
		/**
		 * 获取Video
		 * @param videoId 视频id
		 * @return
		 */
		Video getVideo(String videoId);
}
