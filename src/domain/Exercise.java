package domain;

public class Exercise {
    /**
     * Method for calculating the number of lucky tickets
     * @param ticket 
     * @return int value
     */
    public static int Calculate(int ticket){
        int sum = 0;
        /**
         * Divide a six-digit number into six parts
         */
        for(int i = 000001; i <= 999999; i++)
        {
            int number1 = i/100000;
            int number2 = (i%100000)/10000;
            int number3 = (i%10000)/1000;
            int number4 = (i%1000)/100;
            int number5 = (i%100)/10;
            int number6 = i%10;   

            if(number1 + number2 + number3 == number4 + number5 + number6){
                sum++;
            }
    }
        return sum;
}
}