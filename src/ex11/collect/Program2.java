package ex11.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program2 {
	
	public static void main(String[] args) {
		
		// 인터페이스 : 뼈대는 같은데, 기능만 달라짐 - 다 똑같은데 어떤 한 기능만 달라짐 -> 틀로 쓰는게 아니라 일부분을 뺏다 꼈다 할 수 있게 하자. 
		// 확장이 아니라 바뀌는 것. (렌즈만 바꿔낀다)
		
		//ExamConsole console = new ExamConsole();
		//console.setExam(null);
		
		//int[] nums = new int[3];
		/*ArrayList list = new ArrayList();*/
		
		//숫자를 문자열로
		/*int x = 3;
		String s = Integer.toString(x);
		String s1 = String.valueOf(x);*/
		
		String name1 = "아이유";
		String name2 = "아이유";
		String name3 = new String("아이유");
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1=="아이유");
		
		//값 비교
		System.out.println(name1.equals(name3));
		
		String fileName = "pho.to.jpg";
		
		System.out.println(".까지 몇개인가 " + fileName.indexOf("."));
		System.out.println("문자열 길이 " + fileName.length());
		System.out.println("0부터 3번째 까지 출력 " + fileName.substring(0,3));
		
		
		//문제1 - 위의 파일명에서 점(.)이 있는 곳까지의 문자열을 출력하시오
		int indexLength = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(0,indexLength));
		
		//문제2
		String fileName1 = "photo.jpg".toUpperCase();
		String fileName2 = "Photo.jpg";
		
		System.out.println(fileName1.equals(fileName2.toUpperCase()));
		
		//문제3
		String guest = "강호동,유재석,홍길동"; //csv
		
		String[] names= guest.split(",");
		
		System.out.println(names[0]);
		
		
		
		//숙제1 - temp에 대한 검증
		Scanner scan = new Scanner(System.in);
		System.out.print("kor : ");
		String temp = scan.next();
		
		boolean a = isNan(temp);
		System.out.println(a);
		
		
		//문자열을 숫자로
		//int y = Integer.parseInt(temp);
		
		
		/*List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		Iterator it1 = list.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		
		list.add(3);
		//list.add('d');
		//list.add('g');
		list.add(6);
		for(Integer n : list)
			System.out.println(n++);
		
		System.out.println("--------------------------");
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(4);
		set.add(3);
		//set.add('d');
		
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Integer n : set)
			System.out.println(n);
		
		
		Map<String,Object> map = new HashMap<>();
		map.put("이름", "이자호");
		map.put("나이", 29);
		map.put("주소", "그냥동");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		System.out.println(map.get("주소"));
		
		Set keySet = map.keySet();
		for(Object k : keySet) {
			System.out.println(k + " : " + map.get(k));
		}
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d\n", list.get(i));	
		
		Object obj = 3;
		System.out.printf("%d",obj);*/
	}

	private static boolean isNan(String temp) {
		//char array에 String temp 담기
		char[] array = temp.toCharArray();
		
		//숫자가 있는지 없는지 check할 bool 변수
		boolean check = true;
		
		//검사할 때 0~9 사이의 값이 아니면(문자면) check를 false로 바꿔준다
		for(int i = 0; i < temp.length(); i++) {
			if(array[i] < '0' || array[i] > '9')
				check = false;
		}
		
		return check;
	}
}
