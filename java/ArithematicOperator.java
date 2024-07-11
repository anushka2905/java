//++ -> increment
// -- -> decrement 
// num++;
// ++num; prefix
// --num; prefix a++ + ++a
 /**
  * ArithematicOperator
  */
 class ArithematicOperator {
        public static void main(String[] args){
            int num = 5;
            num++;
            int num2 = num;

            double temp = 9.9;
            temp++;
            char tempChar = '0';
            //tempChar++;
            int smallA = 97;

            System.out.println("Num = " + num);
            System.out.println("Num 2 = " + num2);
            System.out.println("Temp = " + temp);
            System.out.println("Temp char = " + (int)tempChar);
            System.out.println("smallA = " + (char)smallA);

        }
    
 }