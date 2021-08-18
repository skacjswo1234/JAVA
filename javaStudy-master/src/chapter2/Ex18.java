package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Student student1 = new Student();
					student1.name = "고영희";
					student1.addr = "부산광역시 부산진구 중앙대로";
							
							Student student2 = new Student();
					student2.name = "이철수";
					student2.addr = "부산광역시 남구 전포대로";
					
			
					
					Student[] studentList= new Student[5];
				
						studentList[0] = new Student();
						studentList[1] = student1;
						studentList[2] = new Student();
						studentList[3] = student2;
						studentList[4] = new Student();
						
						
						
						System.out.println("이사 전");
						System.out.println(studentList[3] .addr);
						
						studentList[3].addr = "부산광역시 부산진구 범천동";
						
						System.out.println("이사 후");
						System.out.println(studentList[3] .addr);
						
						
						
						
	}

}
