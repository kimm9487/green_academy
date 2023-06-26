package fullstack.ifex;

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫 번째 수 : ");
        int first = scanner.nextInt();
        System.out.println("두 번째 수 : ");
        int sec = scanner.nextInt();
        System.out.println("세 번째 수 : ");
        int th = scanner.nextInt();
        
        int a;
        
        
        if (first < sec) {
            a = first;
            first = sec;
            sec = a;
        }
       
       
        if (first < th) {
           a = first;
            first = th;
            th = a;
        }
        

        if (sec < th) {
            a = sec;
            sec = th;
            th = a;
        }
        
       //선생님 답
        //if(sec >= first && sec >= th) {
        	//여기가 실행된다는 의미는 무조건 sec 값이 젤 크다는 의미입니다.
        	//first 값을 a 변수에 대입합니다
        	//a= first;
        	//first = sec; //first 값이 사라짐
        	//sec = a;//sec 값에 first 값을 대입해서 값을 치환
        //}else if(th >= first && th >= sec) {
        	//a = first;
        	//first = th;
        	//th = first;
        //}
        //if(th >= sec) {
        	//a = sec;
        	//sec = th;
        	//th = a;
        //}
        //위 is else if 에서 큰 수 값은 정렬되었음.
        
        
        
        
        
        
        
        
        
        
        System.out.println("큰 수부터 나열된 결과 : ");
        System.out.println(first + " " + sec + " " + th);
    }
}