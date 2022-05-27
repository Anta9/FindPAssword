import java.util.*;

public class MainAp
{   
    
    public static void main(String[] args)
     {  
      Scanner in = new Scanner(System.in);
      System.out.println("Pour tester le craquage par brute force tapez 1\n ");
      System.out.println("Pour vérifier si votre mot de passe se trouve dans le dictionnaire des mots de passes souvent utilisés tapez 2");

      Integer var = in.nextInt();
     CrackPassword newinstance = FabriquePassword.testPassword(var);
     System.out.println("Authentification....");
     newinstance.findPassword();

     }
}

    

