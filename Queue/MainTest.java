package Queue6주차;

public class MainTest {
	public static void main (String args[]) {
		Queue que1 = new Queue();
		Queue que2 = new Queue();
		
		ExponentialRandom random = new ExponentialRandom(2);
		
		//random.nextInt(); //생성 시간 간격
		
		int id = 0;
		int count = 0;
		int times;
		int x = 4; //삭제할 시간
		
		for(int time = 1; time <100; time++) {
			times = random.nextInt();
			
			if(count == times) {
				Node newNode = new Node(id);
				id ++;
				if(que1.size() > que2.size()) {
					que2.add(newNode);
					System.out.println("[Time : " + time + "] Service " + id + "arrived. Inserted Queue 2.");
				} else {
					que1.add(newNode);
					System.out.println("[Time : " + time + "] Service " + id + "arrived. Inserted Queue 2.");
				}
			} else {
				count++;//삽입
			}
			
			if(time%x == 0) {
				if(que1.size() == 0) {
					System.out.println("Queue1에 원소가 없습니다!");
				} else {
					que1.remove();
					System.out.println("[Time : " + time + "] Service ID : " + id + " remove Queue ID : 1.");	
				}
				
			} else if(time%x == 1) {
				if(que2.size() == 0) {
					System.out.println("Queue2에 원소가 없습니다!");
				} else {
					que2.remove();
					
					System.out.println("[Time : " + time + "] Service ID : " + id + " remove Queue ID : 2.");	
				}
			}
		}
		System.out.println("Queue 1에 원소가 " + que1.size() + "개 남아 있습니다.");
		System.out.println("Queue 2에 원소가 " + que2.size() + "개 남아 있습니다.");
		
		//삭제
		
		
	}

}
