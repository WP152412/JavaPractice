/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 	    └ MelonGenreChart
 * 1. 개요 :
 * 2. 작성일: 2017. 6. 12.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		System.out.println("-- << 멜론 장르별 차트 >> --");
		
		List<Music> tmpList = new ArrayList<>();
		tmpList.add(new Music("팔레트", "아이유"));
		map.put("발라드", tmpList);
		
		List<Music> tmpList2 = new ArrayList<>();
		tmpList2.add(new Music("I LUV IT", "싸이"));
		tmpList2.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", tmpList2);
		printMap(map);
		
		System.out.println("-- << 댄스 2위곡 변경 >> --");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		System.out.println("-- << 댄스 1위곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);

		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear(); printMap(map);
	}
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println('[' + key + ']');
			int cnt = 0;
			for(Music music: map.get(key)) System.out.println( (++cnt) + ". " + music);
		} System.out.println("");
	}
}
