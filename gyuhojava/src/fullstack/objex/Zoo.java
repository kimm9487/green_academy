package fullstack.objex;

public class Zoo {

	public static void main(String[] args) {
		//현실적으론 말도 안되지만 Animal 인스턴스를 생성 해 볼게요.
		//Animal animal = new Animal();
		
		Dog dog = new Dog("쫑이","포메라이안","Female");//기본생성자 호출되어서 잘 생성됨.
		System.out.println(dog);
		dog.sound();
		
		Cat cat = new Cat("괭이","잡종","Female");
		System.out.println(cat);
		cat.sound();
		
		Duck duck = new Duck("꽥이", "천둥오리", "Female");
		System.out.println(duck.toString());
		duck.sound();
		
		SuperDDC ddc = new SuperDDC("슈퍼캣");
		
		//인스턴스는 한번 생성되면 메모리에서 사라지기 전까지 그 타입은 절대 불변입니다.
		//객체변수 or dog2 객체 or dog2 ref 변수
		Animal dog2 = new Dog("쫑이2", "포메라이안2", "Female2");
		System.out.println(dog2);
		
		//dog = (Dog)dog2;  
		/*
		Animal animal1 = dog;
		Animal animal2 = cat;
		Animal animal3 = duck;
		*/
		System.out.println();//공백
		
		//Animal 클래스 타입의 객체를 담는 배열선언합니다.
		Animal[] animals = {dog, cat, duck};
		Dog dg = (Dog)animals[0];
		
		for(int i = 0; i<animals.length; i++) {
			Animal theAnimal =
					animals[(int)(Math.random() * animals.length)];
			System.out.println(theAnimal);
			theAnimal.sound();
			
			//instanceof 연산자 : 주어지는 객체가 주어진 클래스의 인스턴스인지를
			//물어보는 연산자입니다. VM 이 동적으로 판별 후 맞으면 true, 아니면 false 리턴.
			if(theAnimal instanceof Duck){
				((Duck)theAnimal).layEggs();
			}
			Eatable eatable = (Eatable)theAnimal;
			eatable.eat();
			System.out.println();
			
			
			
			/*
			 * 먹을수 있는 (eatable) 동물들 그룹으로 배열을 생성해서
			 * 모든 동물의 객체를 값으로 채우세요...4종류
			 * 모두 채워진 배열을 loop 하면서 eat()을 호출하는데,
			 * 이중 날 수 있는 기능을 가진 객체는 날도록(fly()) 호출하세요.
			 */
			//Animal 클래스 타입의 객체를 담는 배열 선언합니다.선생님 답
			Animal[] animals2 = {dog, cat, duck};
			Eatable[] theAnimals =
				{(Eatable)animals[0],
						(Eatable)animals[1],
							(Eatable)animals[2], new SuperDDC("SUPER DDC")};
			
			for(Eatable animal : theAnimals) {
				animal.eat();
				if(animal instanceof Flyable) {
					((Flyable)animal).fly();
				}
				}
			
			
			/*
			Animal[] eatAnimal = {dog,cat,duck,ddc};
			for(int j = 0; j < 4; j++) {
				Animal eA = eatAnimal[j];
				System.out.println(eA);
				if(eA instanceof SuperDDC) {
					((SuperDDC)eatAnimal[j]).fly();
				}
				Eatable eatable2 = (Eatable)eA;
				eatable2.eat();
				Moveable moveable = (Moveable)theAnimal;
				moveable.moveFast(3, 3);
			}
			*/
		}
		//모든 동물에게 eat()을 호출해보세요.
	
		
		//오버라이드된 부모의 메서드나 필드는 호출되지않음. 여기서 예를들면 타입.

		/*
		 * 다형성 : 객체지향언어에서는 다형성 이란 개념이 있습니다.
		 * 이 의미는 쉽게 표현 하자면, 하나의 인스턴스가 상속 관계에 있는 클래스를 바탕으로
		 * 생성되었다면, 해당 인스턴스를 Ref 하는 클래스 타입이 다양하게 변경되어질 수 있다는 말입니다.
		 * 즉 자식 인스턴스를 발생했을 경우에, 그 Ref 타입은, 자식 그리고 부모 모두 될수 있다는 말입니다.
		 * 
		 * 이렇게 하는 이유는 오버라이드를 한 메서드를 타입 구분없이 동일하게 호출된
		 * 구현되는 내용은 오버라이드 한 내용이 나오도록 함입니다.
		 */
		
		/*
		 * int a = 10; double d[] = {a, 10, 1};
		 * 
		 * a = d[0];
		 */
	}

}
