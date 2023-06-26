package fullstack.objex;

public class RcpResult {
	int  comValue;
	String userValue;
	
	 public RcpResult(int comValue, String userValue) {
	        this.comValue = comValue;
	        this.userValue = userValue;
	    }
	
	
	public static String compare(int comValue, String userValue) {
		String result = null;
		String convertCom = "";
		switch (comValue) {
		case 1:
			convertCom = "가위";
			break;
		case 2:
			convertCom = "바위";
			break;
		default:
			convertCom = "보";
			break;
		}
		
		if(convertCom.equalsIgnoreCase(userValue)) {
			result = "컴 : " + convertCom + " 너님 : " + userValue + " 결과 : 무승부";
		}else if(convertCom.equals("가위") && userValue.equals("바위")) {
			result = "컴 : " + convertCom + " 너님 : " + userValue + " 결과 : 너님승";
		}
		return result;
	}
}
