public class PowerOfNumber {
	public static void main(String[] args){
		 int base=3, exp=4;
		 long result=1;
		 while(exp!=0){
		 result*=base;
		 --exp;
		 }
		 System.out.println("Answer is"+result);
		 }
}
