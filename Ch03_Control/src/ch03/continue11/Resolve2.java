package ch03.continue11;

public class Resolve2 {
// for문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성하세요.
//*
//**
//***
//****
//*****
	
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {						// 행 변화
			for (int j = 0; j < i; j++) {						// 열 변화
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
