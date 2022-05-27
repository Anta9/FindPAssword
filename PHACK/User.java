import java.util.*;
public class User{
    
    static String password;
    static String login;
    public User(String login, String password)
    {
        
    }
    static public String getUser()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre login et votre mot de passe");
        String login=in.nextLine(); //pas utilisé mais vu que dont se mettre dans les conditions....
        String password=in.nextLine();
        return password;
    }
   static  String realpassword=getUser();
    static public  Boolean authentificate(String testpassword)
    {
       

        if (realpassword.equals(testpassword))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

}
