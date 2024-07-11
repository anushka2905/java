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

            System.out.println("Num = " + num);
            System.out.println("Num 2 = " + num2);
            System.out.println("Temp = " + temp);

        }
    
 }