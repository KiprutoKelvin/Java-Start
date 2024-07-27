public class ForLoop {

    public static void main(String[] args) {
        //increment order
        for(int i=1; i<=4; i++){
            System.out.println("Hi " + i);

        }
        //decrement order
        for(int i=4; i>=1; i--){
            System.out.println("Hey " + i);

        }
        // calender like
        for(int i=1; i<=5; i++){
            System.out.println("DAY " + i);
            //nested  for
            for(int j=1; j<=9; j++){
                System.out.println("  " + (j+8) +" - " + (j+9));
    
            }

        }
    }
}