package chapter1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WareHourse {
		public static Map<String, String> user;
		static {
			user = new ConcurrentHashMap<>();
			user.put("id", "pw");
		}
}
