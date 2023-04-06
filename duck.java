/*Write a program to check whether a number is a duck number or not?
Example : Input 1 : 0512                                                           Input 2 : 8142
                 Output1 : Not a Duck Number                                Output 2 : Duck Number
*/
class duck {
   public static void main(String[] args){
   	String num = "513";
   	if(num.charAt(0) == '0'){
   		System.out.println("Not Duck Number");
   	}else {
   		System.out.println("Duck Number");
   	}
   }
}
