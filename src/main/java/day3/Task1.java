package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        
        String city2 = "";
            while(true) {
                
                
                Scanner scanner = new Scanner(System.in);
                String city = scanner.nextLine();
                city2 = city;


                switch (city){
                    case "Москва" :
                    case "Владивосток" :
                    case "Ростов" :
                        System.out.println("Россия");
                        break;
                    case "Рим" :
                    case "Милан" :
                    case "Турин" :
                        System.out.println("Италия");
                            break;
                    case "Ливерпуль" :
                    case "Манчестер" :
                    case "Лондон" :
                        System.out.println("Англия");
                        break;
                    case "Берлин" :
                    case "Мюнхен" :
                    case "Кёльн" :
                        System.out.println("Германия");
                    case "Stop" :
                        System. exit(0);
                    default:
                        System.out.println("Неизвестная страна. Попробуйте ещё раз");
                        break;









                }




        }








    }
}
