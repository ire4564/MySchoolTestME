package week6Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainTest {
	public static void main(String args[]) {

		Double dou = new Double();
		Square squ = new Square();
		Linear lin = new Linear();

		try {
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			while(br.ready()) {
				String line = br.readLine();
				StringTokenizer parser = new StringTokenizer(line, " ,:;-.?!");
				while(parser.hasMoreTokens()) { //String 단어 불러오기
					String x = parser.nextToken(); //하나씩 불린 단어
					//dou.Double_put(x);
					lin.Linear_put(x, 1);
					squ.Square_put(x, 1);
					dou.Double_put(x, 1);
					//squ.Square_put(x);
				}
			}
				br.close();
				
		}catch(IOException e) {
			System.out.println(e); }

		System.out.println("America: 선형조사(" + lin.get("America") +"), 제곱조사(" + squ.get("America") + "), 이중해싱(" + dou.get("America") + ")");
		System.out.println("answer: 선형조사(" + lin.get("answer") +"), 제곱조사(" + squ.get("answer") + "), 이중해싱(" + dou.get("answer") + ")");
		System.out.println("where: 선형조사(" + lin.get("where") +"), 제곱조사(" + squ.get("where") + "), 이중해싱(" + dou.get("where") + ")");
		System.out.println("disabled: 선형조사(" + lin.get("disabled") +"), 제곱조사(" + squ.get("disabled") + "), 이중해싱(" + dou.get("disabled") + ")");
		System.out.println("believed: 선형조사(" + lin.get("believed") +"), 제곱조사(" + squ.get("believed") + "), 이중해싱(" + dou.get("believed") + ")");
		

		//충돌 횟수와 빈도수 출력
		//충돌 횟수 출력 -> fin 출력
		System.out.println("Linear에서의 충돌 값 :" + lin.crash());
		System.out.println("Square에서의 충돌 값 :" + squ.crash());
		System.out.println("Double에서의 충돌 값 :" + dou.crash());
		
	}
}

