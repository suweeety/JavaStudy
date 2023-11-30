import java.util.Scanner;

public class Lotto {

   public static void main(String[] args) {
      // 로또 당첨 프로그램
      // 랜덤값으로 1~45의 숫자를 맞추세요.
      // 미션1단계 : 1개라도 맞으면 당첨을 시켜주세요.
      // 미션2단계 : 5개 맞으면 1등, 4개 맞으면 2등, 3개 맞으면 3등
      
      int num1 = (int)(Math.random()*45) + 1 ;
      int num2 = (int)(Math.random()*45) + 1 ;
      int num3 = (int)(Math.random()*45) + 1 ;
      int num4 = (int)(Math.random()*45) + 1 ;
      int num5 = (int)(Math.random()*45) + 1 ;
      int num6 = (int)(Math.random()*45) + 1 ;
      int num7 = (int)(Math.random()*45) + 1 ;
      
      Scanner in = new Scanner(System.in);
      System.out.println("1~45의 숫자 중 임의의 수 7개를 입력하세요. (입력 후 Enter)");
      
      
      
      int myNum1 = in.nextInt();
      System.out.println("첫번째 번호 :" + myNum1); 
      int myNum2 = in.nextInt();
      System.out.println("두번째 번호 :" + myNum2);
      int myNum3 = in.nextInt();
      System.out.println("세번째 번호 :" + myNum3);
      int myNum4 = in.nextInt();
      System.out.println("네번째 번호 :" + myNum4);
      int myNum5 = in.nextInt();
      System.out.println("다섯번째 번호 :" + myNum5);
      int myNum6 = in.nextInt();
      System.out.println("여섯번째 번호 :" + myNum6);
      int myNum7 = in.nextInt();
      System.out.println("일곱번째 번호 :" + myNum7);
            
      
      int x = 0 ; // 맞은숫자
      
      if(myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6) {
         ++x ;
      }
      if(myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6) {
         ++x ;
      }
      if(myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6) {
         ++x ;
      }
      if(myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6) {
         ++x ;
      }
      if(myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6) {
         ++x ;
      }
      if(myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6) {
         ++x ;
      }
      
         
      System.out.println("-------------------------------------");
      
      System.out.println("\t" + "- 1회차 당첨번호 입니다. -");
      System.out.println(" 당첨번호 : " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + num7);
      
      System.out.println("-------------------------------------");
      
      if(x == 0) {
         System.out.println(" 아쉽게도 낙첨되었습니다. 번호가 0개 일치합니다.");
      } else if(x == 1) {
         System.out.println("아쉽게도 낙첨되었습니다. 번호가 1개 일치합니다.");
      } else if(x == 2) {
          System.out.println("아쉽게도 낙첨되었습니다. 번호가 2개 맞았습니다.");
      } else if(x == 3) {
         System.out.println("아쉽게도 낙첨되었습니다. 번호가 3개 맞았습니다.");
      } else if(x == 4) {
          System.out.println("아쉽게도 낙첨되었습니다. 번호가 4개 맞았습니다.");
      } else if(x == 5) {
          System.out.println("축하드립니다. 번호가 5개 맞았습니다.");
          System.out.println("[ 당첨금 : 5만원 ]");
      } else if(x == 6) {
          System.out.println("축하드립니다. 번호가 6개 맞았습니다.");
          System.out.println("[ 당첨금 : 1천만원 ]");
      } else if(x == 6 && myNum7 == num7) {
          System.out.println("축하드립니다. 모든 번호가 일치합니다.");
          System.out.println("[ 당첨금 : 1억원 ]");
      }
      
         
   
      } // 메인 메소드 종료
   
   } // 클래스 종료