package module2;

// import java.util.Scanner;

public class module2 
{
    public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
        int i = 0;//, t = 0;
//      loop: while (true) {
        System.out.println("Start the count!");
//      if (sc.hasNext()) {
        for(i=1; i>=1; i++){
            System.out.println("Runtime count: "+i);
//                if (i == t) {
//                  break;
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }  
                     

//        t = sc.nextInt();
//        if (t <= 0) {
//            System.out.println("Target time value less then zero! Enter new value!");
//            continue loop;
            
//        }
//   }
         
//    }    
    //System.out.println("Total runtime is "+i+" sec.");
//    sc.close();
//    break;         
}    
}
//}

//Добавлена линия для дополнительного пуша для тестирования работы пре пуш скрипта гит.
//Вторая попытка. Сделал файл исполняемым.
//Попытка три. Скрипт ушел в пре коммит действие.