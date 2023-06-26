package fullstack2.langex;
/*
 * 프로그램 시작하면 이메일 입력하라고 출력 후 값 받기
 * @ 없으면 없다고 메세지 출력 후 종료
 * 있다면 id 와 서버 분리
 * id 검증하기 // 8 ~ 12 사이, 반드시 첫자는 대문자
 * 값 중에 하나는 반드시 숫자가 포함
 * 검증 로직 완성 후 모두 올바르면 마지막으로 입력된 서버값을 
 * .을 기준으로 메일 서버명을 fullstack.com 으로 모두 변경해서
 * 변경된 이메일 값을 축 회원 가입 aabc@fullstack.com 님으로 출력
 * 만약 위 조건 중 하나라도 어긋나면 뭐가 문제인지 출력
 */


import java.util.Scanner;

public class StringQuiz {
    static Scanner sc = new Scanner(System.in);
    static String email;

    public static void email(String email) {
        while (true) {
            if (email.contains("@")) {
                String[] sp = email.split("@");
                String ret1 = sp[0];
                String ret2 = sp[1];
                int ret1Leng = ret1.length();

                if (ret1Leng >= 8 && ret1Leng <= 12) {
                    char a = 'A';
                    char z = 'Z';

                    if (ret1.charAt(0) >= a && ret1.charAt(0) <= z) {
                        if (ret1.contains("1")
                                || ret1.contains("2")
                                || ret1.contains("3")
                                || ret1.contains("4")
                                || ret1.contains("5")
                                || ret1.contains("6")
                                || ret1.contains("7")
                                || ret1.contains("8")
                                || ret1.contains("9")
                                || ret1.contains("0")) {

                            System.out.println("[회원가입 성공]\nemail : " + email + "\nid : " + ret1 + "\nserver : " + ret2);
                            break; // while 루프를 벗어남
                        } else {
                            System.out.println("[회원가입 실패] 숫자를 포함해주세요.");
                        }
                    } else {
                        System.out.println("[회원가입 실패] 첫 문자에 대문자를 포함해주세요.");
                    }
                } else {
                    System.out.println("[회원가입 실패] 8 ~ 12자의 아이디를 입력하세요.");
                }
            } else {
                System.out.println("[회원가입 실패] 다시 입력해주세요.");
            }

            // 다시 입력 받기
            System.out.println("이메일을 입력하세요");
            email = sc.next();
        }
    }
}