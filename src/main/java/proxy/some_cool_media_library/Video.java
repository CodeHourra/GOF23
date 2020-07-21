package proxy.some_cool_media_library;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/2 0002 09:57
 * @Description 视频文件
 */
public class Video {
		public String id;
		public String title;
		public String data;
		
		public Video(String id, String title) {
				this.id = id;
				this.title = title;
		}
		
		@Override
		public String toString() {
				return "Video{" +
								"id='" + id + '\'' +
								", title='" + title + '\'' +
								", data='" + data + '\'' +
								'}';
		}
}
