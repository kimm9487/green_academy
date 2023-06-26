package fullstack.rockpaperscissor;



public class Compare {
	int num, cpu;
	
	public Compare(int num, int cpu) {
		
		this.num = num;
		this.cpu = cpu;
	}



	public  void compare() {
		String comVal="", userVal="";
		
		if(this.cpu == 1) {
			comVal = "가위";
		}else if (this.cpu == 2) {
			comVal ="바위";
		}else {
			comVal ="보";
		} 
		
		if (this.num == 1) {
			userVal ="가위";
		}else if (this.num == 2) {
			userVal ="바위";
		}if (this.num == 3) {
			userVal ="보";
		}
		
		if (this.num > this.cpu) {
			if(!(this.num > 3)) { 
				
				System.out.println("[user] -> "+ userVal +"\n[cpu] -> " + comVal +"\n[user] 승");
				}else {
					System.out.println("잘못된 값을 입력하셨습니다.");	
				}
		}else if (this.num < this.cpu) {
			if(!(this.num <= 0)) { 
				
				System.out.println("[user] -> "+userVal +"\n[cpu] -> " + comVal +"\n[cpu] 승");
				}else {
					System.out.println("잘못된 값을 입력하셨습니다.");	
				}
			
		}else  if(this.num == this.cpu){
			System.out.println("[user] -> "+ userVal +"\n[cpu] -> " + comVal +"\n[비김]");
		} 
	}		
}


