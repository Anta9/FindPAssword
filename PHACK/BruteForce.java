
import java.util.*;
public class BruteForce extends CrackPassword{
    static List<String> caracter = new ArrayList<String> (Arrays.asList( "A","a","b","B","c","C","d","D","e","E","f","F",
    "g","G","h","H","i","I","j","J","k","K","l","L","m","M","n","N","O","o","p","P",
    "q","Q","R","r","S","s","t","T","u","U","V","v","w","W","X","X","y","Y","Z",
    "z","0","1","2","3","4","5","6","7","8","9","@","[","!",
     "#","(",")","*","/",":",";","=","|","~",""));	
     

    public void findPassword()
    {
        long startTime = System.currentTimeMillis();
        String passw =new String("");
        loops :for(int i = 0 ; i < caracter.size(); i++)
        {
                 for(int j = 0 ; j < caracter.size(); j++)

                    {
                            for(int k= 0 ; k <  caracter.size(); k++)
                            {
                                for(int l = 0 ; l < caracter.size(); l++)
                                {
                                    for(int m = 0 ; m < caracter.size(); m++)
                                    {
                                        for(int n = 0 ; n< caracter.size(); n++)
                                        {
                                            for(int o = 0 ; o < caracter.size(); o++)
                                            {
                                                passw = caracter.get(i) + caracter.get(j)  + caracter.get(k) + caracter.get(l) + caracter.get(m) + caracter.get(n) + caracter.get(o);
                                                    
                                                //System.out.println(passw) ; ralentit la recherche 
                                                
                                                if (User.authentificate(passw)==true)
                                                {  
                                                    break loops ;
                                                }
                                            }
                                        }    
                                    }

                                
                                    
                                }
                                
                            
                            }
                        
                    
                    } 
            
             
       }
       long endTime = System.currentTimeMillis();
       
       System.out.println("votre mot de passe est :" + passw);
       System.out.println(GetTime.duration(endTime, startTime));
       
       
    }    

}



