package com.biz.var;

public class var_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//만약 i가 9인경우
		for (int i = 1; i <= 100; i++) {
			int index = 2;
			for (index = 2; index < i; index++) {
				//indax가 3이 되는 경우
				//9%3==0의 조건문이 true가되고
				// 9%4이후는 계산할 필요가없다

				if (i % index == 0) {
					break;
					
				}

			}
			
			// break 이후 실행 되는 곳
			//i값이 소수이면
			// index>= i
			//i가 소수가 아니면
			// index < i
			if( index >=i) {
				System.out.println(i+"는 소수입니다");
			}
			
		}
	
	
	
	}
	

}
