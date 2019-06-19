import java.util.Arrays;
import java.util.Random;

class MyArray {
		
	public int size = 10; //원소개수
	public int[] a = new int[size];
	int[] b = new int[size*2];
	
	public void makelist() {
		Random rng = new Random();
		for(int i=0; i<10; i++) {
			a[i] = rng.nextInt(100);
		}
	}

	public void removemultiples(int x) {
		for(int i=0;i<10;i++) { //배열숫자중에서
			if((a[i]%x)==0) { //2의 배수를 찾으면
				System.arraycopy(a, i+1, a, i, size-(i+1));
				size--;
				}
			}
		for(int i=0;i<10;i++) { //중복을 없애기 위해서 
			if((a[i]%x)==0) { 
				System.arraycopy(a, i+1, a, i, size-(i+1));
				size--;
				}
			}
		}
		// 삭제
		//size 변수 수정
	public void doublelength() {
		//기존 배열보다 2배 큰 배열 생성
		//a의 내용 복사 후 리턴
		System.arraycopy(a, 0, b, 0, size);
		a=b;
		
	}

	public void print() {
		System.out.println("생성된 배열 a는 다음과 같습니다.");
		System.out.print("배열의 원소 : ");
		for (int i=0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" | 배열의 크기 : " + a.length);
		//배열 a 내용
	}
	
	public void print2() {
		System.out.println("배열 a의 2의 배수를 모두 제거합니다.");
		System.out.print("배열의 원소 : ");
		for (int i=0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" | 배열의 크기 : " + a.length);
		//배열 a 내용
	
	//a.length 출력
	}
	
	public void print3() {
			System.out.println("배열 a의 공간을 두 배 확장합니다.");
			System.out.print("배열의 원소 : ");
			for (int i=0; i<size; i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println(" | 배열의 크기 : " + b.length);
			//배열 a 내용
		
		//a.length 출력
		}
	}



