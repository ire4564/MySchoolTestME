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
				while(parser.hasMoreTokens()) { //String �ܾ� �ҷ�����
					String x = parser.nextToken(); //�ϳ��� �Ҹ� �ܾ�
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

		System.out.println("America: ��������(" + lin.get("America") +"), ��������(" + squ.get("America") + "), �����ؽ�(" + dou.get("America") + ")");
		System.out.println("answer: ��������(" + lin.get("answer") +"), ��������(" + squ.get("answer") + "), �����ؽ�(" + dou.get("answer") + ")");
		System.out.println("where: ��������(" + lin.get("where") +"), ��������(" + squ.get("where") + "), �����ؽ�(" + dou.get("where") + ")");
		System.out.println("disabled: ��������(" + lin.get("disabled") +"), ��������(" + squ.get("disabled") + "), �����ؽ�(" + dou.get("disabled") + ")");
		System.out.println("believed: ��������(" + lin.get("believed") +"), ��������(" + squ.get("believed") + "), �����ؽ�(" + dou.get("believed") + ")");
		

		//�浹 Ƚ���� �󵵼� ���
		//�浹 Ƚ�� ��� -> fin ���
		System.out.println("Linear������ �浹 �� :" + lin.crash());
		System.out.println("Square������ �浹 �� :" + squ.crash());
		System.out.println("Double������ �浹 �� :" + dou.crash());
		
	}
}

