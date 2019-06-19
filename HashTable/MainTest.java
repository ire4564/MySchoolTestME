package week8Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainTest {
	public static void main(String args[]) {
		
		HashTable_Closed hash = new HashTable_Closed(20);
		int countLine = 0; //줄 수 count
		 //객체 생성

		try {
			BufferedReader br = new BufferedReader(new FileReader("text.txt")); //text문서를 한 토큰씩 불러오기
			while(br.ready()) {
				String line = br.readLine();
				countLine++; //줄 수를 세고 카운트 ++
				
				StringTokenizer parser = new StringTokenizer(line, " ,:;-.?!");//토큰은 특수문자 단위로 끊어서 구분하기
				while(parser.hasMoreTokens()) { //String 단어 불러오기
					String x = parser.nextToken(); //하나씩 불린 단어
					hash.put(x, countLine);
					//x를 해시 테이블에 넣는 코드 작성
				}
			}
				br.close();
		}catch(IOException e) {
			System.out.println(e); }
	
	//값 출력하는출력 코드
	System.out.println("America의 value 값 : " + hash.get("America"));
	System.out.println("answer의 value 값 : " + hash.get("answer"));
	System.out.println("where의 value 값 : " + hash.get("where"));
	System.out.println("disabled의 value 값 : " + hash.get("disabled"));
	System.out.println("believed의 value 값 : " + hash.get("believed"));
	System.out.println("we의 value 값 : " + hash.get("we"));
	System.out.println("free의 value 값 : " + hash.get("free"));
	
	}
}

