package com.biz.myclass;

public class Myclass_02 {

	// MMyclass_02의 멤버 변수
	public int num1 = 0;
	public int num2 = 0;

	//voud형 메서드 
	//voud형 메서드는 보통 returu을 생략한다.
	// 만약 returu 사용할려면 아무련 값이 없이 사용한다.
	public void add() {
		System.out.println(num1 + num2);
		return;

	}
	// returu type이 있는 메서드
	//ㅍ이 있는 메서드는 반드시 returu문이 있어야한다.
	//returu 되는 데이터형이 returu type과 일치해야한다.
	//또한 호출한 곳에서 returu 되는 값을 사용할려면
	// 같은 type의 변수에 있어야한다
	public String add(int num1, int num2) {
		// System.out.println(num1+num2);
		return ""+(num1 + num2);

	}
	public String add(String s1, String s2) {
		return s1 +s2;
	}
	public float add(float f1, float f2) {
		return f1+f2;
	}

	public void times() {
		System.out.println(num1 * num2);

		return;
	}

	public void minus() {
		System.out.println(num1 - num2);
		return;
	}

}
