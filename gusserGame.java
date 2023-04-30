import java.util.Scanner;

class gussser{
    int gusssedNum;
    public int gussNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("gusser plz guss number");
        gusssedNum = in.nextInt();
        return gusssedNum;
    }
}
class player{
    int playerNum;
    public int playerInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("player plz input yhe number");
        playerNum = in.nextInt();
        return playerNum;
    }
}
class umpire{
    int p1Input,p2Input,p3Input;
    int gusserInput;
    public void getNumbers(){
        gussser g1= new gussser();
        gusserInput = g1.gussNum();
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        p1Input=p1.playerInput();
        p2Input=p2.playerInput();
        p3Input=p3.playerInput();


    }
    public void result(){
        if((p1Input==gusserInput)||(p2Input==gusserInput)||(p3Input==gusserInput)){
            System.out.println("here the player side won the match");
            if(p1Input == gusserInput){ 
                if(p1Input == p3Input && p1Input == p2Input){System.out.println("all players has enterd right");}
                else if(p1Input == p3Input){System.out.println("p1 and p3 enterd right gussed");}
                else if(p1Input == p2Input){System.out.println("p1 and p2 gussed right");}
                else{System.out.println("p1 has enterd right");}
            }else if(p2Input == gusserInput){
                if(p2Input == p3Input){System.out.println("p2 and p3 gussed right");}
                else{
                    System.out.println("p2 gussed right");
                }

            }else{
                System.out.println("p3 gussed right");
            }
        }


            else{
            System.out.println("here the gusser side has won");
        }


    }
    

    

}
public class gusserGame {
    public static void main(String[] args) {
        
        umpire u = new umpire();
        u.getNumbers();
        u.result();
    }
    
    
}
