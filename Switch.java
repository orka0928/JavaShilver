// import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       /*int num = ;
        switch (num) {
            case num == 10 -> System.out.println(num + "は10未満です"); // 比較できない
            case 10 -> System.out.println(num);
            default -> throw new RuntimeException("N/A");
        }*/

       /*        
       Scanner scan = new Scanner(System.in);
       String userInput = scan.next();
       scan.close();       
       String message = "";
       //passWord比較 
       // sughei12j4H
         switch (userInput) {
          case "sughei12j4H":
            message = "Hello";          
            break;
            
          default:
            message = "Wrong password!";
            break;
            }
        System.out.println(message); */
    
    //    String month = "July";
       String month = "";
       String fourSeasons = switch(month){
        case "March","April","May": yield "Spring";
        case "June","July","August": yield "Summer";
        case "September","October","November": yield"Autumn";
        case "December","January","February" : yield "Winter";       
        default : yield"Not Found";
       };
    //    String fourSeasons = switch (month) {
    //     case "March","April","May" -> "Spring";
    //     case "June","July","August" -> "Summer";
    //     case "September","October","November" -> "Autumn";
    //     case "December","January","February" -> "Winter";       
    //     default -> "Not Found";                    
    //    };
       System.out.println(fourSeasons.equals("Not Found") ? "Not Found" : month + " is " + fourSeasons);
    
       
    }
}
