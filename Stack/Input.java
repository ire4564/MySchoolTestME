package 과제4주차;

import java.util.ArrayList;

public class Input {
	 LinkedStack main = new LinkedStack(); //괄호를 push, pop할수있는 stack
	 LinkedStack index = new LinkedStack(); //인덱스 값을 넣을 수 있는 stack
	 ArrayList<String> indexFin = new ArrayList<>();
	 //우선 문자열을 입력받고
	 public Input(String string) {
		 for(int i=0; i<string.length(); i++) { //(일 경우에 push 시키고 
			 	if(string.charAt(i)=='(') {
			 		main.push(string.charAt(i)); 
			 		index.push(i); //새로운 스텍에 인덱스 출력
			 	} else if(string.charAt(i)==')') { //)일 경우에 pop
			 		if(main.isEmpty()) {
			 			System.out.println("괄호쓰기가 틀림!");
			 			return;
			 		} else {
			 		main.pop();
			 		indexFin.add(index.pop() + "," + i); //인덱스 출력
			 		}
			 	}
		 }
		 if(!main.isEmpty()) { 
			 System.out.println("괄호쓰기가 틀림!");
			 return;
		 } 
		 
		 for(int i=0; i<indexFin.size(); i++) {
			 System.out.println(indexFin.get(i));
		 }
		 System.out.println("괄호쓰기가 맞음!");
		 
	 }
	
	 //string을 하나하나씩 체크하기
	 //만약 체크시 '('이면 push
	 //push면 for문으로 인덱스 기록하기
	 //체크시 ')'면 pop
	 
	 //스텍이 isempty가 아니면 '괄호쓰기가 틀림'
	 //스텍이 isempty인데 pop을 동작시키는 경우 '괄호쓰기가 틀림'
	 //두개 넘어가면 인덱스 처리
	 
	 
	 

}
