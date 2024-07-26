public class Switch {

    public static void main(String[] args) {
        int n = 5;
        
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
        
     // New Switch statement

        // String day = "Sunday";

        // switch (day) {
        //     case "Saturday", "Sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");
        
       
        // }

        String day = "Wed";
        String result = "";// Switch as an Expression
        
        result = switch(day)
         {
            // Using Arrow
            // case "Saturday", "Sunday" -> "6am";
                        
            // case "Monday" -> "8am";
                
            // default -> "7am";

            // Using yield
            case "Saturday", "Sunday": yield "6am";
                        
            case "Monday": yield "8am";
                
            default: yield "7am";
        };

        System.out.println(result);
        
}

}