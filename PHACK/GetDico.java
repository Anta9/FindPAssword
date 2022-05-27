import java.io.*;
import java.util.Scanner;
public class GetDico extends CrackPassword
{   
    public static boolean testing()
    {
        boolean b=false;
    
    try
    {
      // Le fichier d'entrée
      FileInputStream file = new FileInputStream("C:/Users/USER/Desktop/PHACK/file1.txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
        if(User.authentificate(scanner.nextLine())==true)
        {
            b=true;
            break;
        }
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    return b;
}
    
    public void findPassword()
    {
        long startTime = System.currentTimeMillis();

        String guess;
            if (testing()==true)
                {
                    guess = itIs();
                    System.out.println("votre mot de passse se trouve dans le dictionnaire :"+guess);
                }
            else
                {
                    System.out.println("Votre mot de passe ne se trouve pas dans le dictionnaire ");

                }
                long endTime = System.currentTimeMillis();
                System.out.println(GetTime.duration(endTime, startTime));
    }
    public static String itIs()
    { String var="";
    String test;
    try
    {
      FileInputStream file = new FileInputStream("C:/Users/USER/Desktop/PHACK/file1.txt");   
      Scanner scanner = new Scanner(file);  
      
      while(scanner.hasNextLine())
      {
          test=scanner.nextLine();
        if(User.authentificate(test)==true){
             var= test;
            break;
        }
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
   return var;
    }
}
    