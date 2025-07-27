
import java.util.*;

class DigitalCricket
{
    static int toss(String user_toss, String user){
        Random r=new Random();
        int comp_toss=r.nextInt(2);
        String comp_toss2;
        if(comp_toss==0){
            comp_toss2="H";
        }
        else{
            comp_toss2="T";
        }
        if(user_toss.matches(comp_toss2)){
            System.out.println(user+" Won The Toss!");
            return 1;
        }
        else{
            System.out.println("COMPUTER Won the Toss!");
            return 0;
        }
    }

    static int comp_batting1(){
        int comp_score=0, count=0;
        System.out.println("\n-------------------------------------> COMPUTER BATTING <--------------------------------------\n");
        while (count == 0){
            Random r=new Random();
            Scanner s=new Scanner(System.in);
            int comp_run1 = r.nextInt(1,7);
            System.out.print("Enter a Number between 1 and 6: ");
            int user_bowl1 = s.nextInt();
            while (user_bowl1<1 | user_bowl1>6){
                System.out.print("Enter a valid number: ");
                user_bowl1 = s.nextInt();
            }
            System.out.println("\nComputer number: "+comp_run1);
            System.out.println("User Number: "+user_bowl1);
            if(user_bowl1==comp_run1){
                count = 1;
                System.out.println("\nCOMPUTER OUT!\n");
            }
            else{
                comp_score = comp_score + comp_run1;
                System.out.println("\nSCORE: "+comp_score+"\n");
            }
        }
        System.out.println("COMPUTER Final Score: "+comp_score);
        return comp_score;
    }

    static int comp_batting2(int user_score){
        int comp_score=0, count=0;
        System.out.println("\n-------------------------------------> COMPUTER BATTING <--------------------------------------\n");
        System.out.println("COMPUTER need "+(user_score+1)+" Runs to Win!\n");
        while (count == 0 && comp_score <= user_score){
            Random r=new Random();
            Scanner s=new Scanner(System.in);
            int comp_run2 = r.nextInt(1,7);
            System.out.print("Enter a Number between 1 and 6: ");
            int user_bowl2 = s.nextInt();
            while (user_bowl2<1 | user_bowl2>6){
                System.out.print("Enter a valid number: ");
                user_bowl2 = s.nextInt();
            }
            System.out.println("\nComputer number: "+comp_run2);
            System.out.println("User Number: "+user_bowl2);
            if(user_bowl2==comp_run2){
                count = 1;
                System.out.println("\nCOMPUTER OUT!\n");
            }
            else{
                comp_score = comp_score + comp_run2;
                System.out.println("\nSCORE: "+comp_score+"\n");
                if(comp_score<=user_score){
                    System.out.println("COMPUTER need "+(user_score-comp_score+1)+" More Runs to Win\n");
                }
            }
        }
        System.out.println("COMPUTER Final Score: "+comp_score);
        return comp_score;
    }

    static int user_batting1(String user){
        int user_score=0, count=0;
        System.out.println("\n------------------------------------> "+ user +" BATTING <-------------------------------------\n");
        while (count == 0){
            Random r=new Random();
            Scanner s=new Scanner(System.in);
            int comp_bowl1 = r.nextInt(1,7);
            System.out.print("Enter a Number between 1 and 6: ");
            int user_run1 = s.nextInt();
            while (user_run1<1 | user_run1>6){
                System.out.print("Enter a valid number: ");
                user_run1 = s.nextInt();
            }
            System.out.println("\nComputer number: "+comp_bowl1);
            System.out.println("User Number: "+user_run1);
            if(user_run1==comp_bowl1){
                count = 1;
                System.out.println("\n"+user+" Out!\n");
            }
            else{
                user_score = user_score + user_run1;
                System.out.println("\nSCORE: "+user_score+"\n");
            }
        }
        System.out.println(user+" Final Score: "+user_score);
        return user_score;
    }

    static int user_batting2(String user,int comp_score){
        int user_score=0, count=0;
        System.out.println("\n------------------------------------> "+ user +" BATTING <-------------------------------------\n");
        System.out.println(user+" need "+(comp_score+1)+" Runs to Win!\n");
        while (count == 0 && user_score <= comp_score){
            Random r=new Random();
            Scanner s=new Scanner(System.in);
            int comp_bowl2 = r.nextInt(1,7);
            System.out.print("Enter a Number between 1 and 6: ");
            int user_run2 = s.nextInt();
            while (user_run2<1 | user_run2>6){
                System.out.print("Enter a valid number: ");
                user_run2 = s.nextInt();
            }
            System.out.println("\nComputer number: "+comp_bowl2);
            System.out.println("User Number: "+user_run2);
            if(user_run2==comp_bowl2){
                count = 1;
                System.out.println("\n"+user+" Out!\n");
            }
            else{
                user_score = user_score + user_run2;
                System.out.println("\nSCORE: "+user_score+"\n");
                if (user_score <= comp_score) {
                    System.out.println(user+" need "+(comp_score-user_score+1)+" More Runs to Win\n");
                }
            }
        }
        System.out.println(user+" Final Score: "+user_score);
        return user_score;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int user_score,comp_score;
        System.out.println("\n==========================> WELCOME TO THE GAME OF DIGITAL CRICKET <===========================\n");
        System.out.println("|> Rules for the game are as follws:-\n");
        System.out.println("1) User have to enter any number between 1 and 6 and it will be compared with the number\nrandomly generated by the computer.");
        System.out.println("2) If both the numbers match then batsman will be considered out.");
        System.out.println("3) If the number doesn't match then the number which batsman has presented will be added to\nit's final score.");
        System.out.println("\n-----------------------------------------------------------------------------------------------\n");
        System.out.print("ENTER YOUR NAME(Max 10 Char): ");
        String user = s.nextLine();
        if(user.length()>10){
            user=user.substring(0, 10);
        }
        user=user.toUpperCase();
        
        while(true){
            System.out.println("\n-----------------------------------------> TOSS TIME <-----------------------------------------\n");
            System.out.print("Enter a toss(H/T): ");
            String toss1 = s.next();
            if(toss1.length()>1){
                toss1=toss1.substring(0,1);
            }
            toss1=toss1.toUpperCase();
            while(!"H".equals(toss1) && !"T".equals(toss1)){
                System.out.print("Enter Valid Choice: ");
                toss1 = s.next();
                toss1 = toss1.toUpperCase();
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------\n");
            
            int toss2=toss(toss1,user);
            
            if(toss2==1){
                System.out.println("Enter your Choice: \n1. Bat(1)\n2. Bowl(2)");
                int user_choice=s.nextInt();
                while(user_choice<1 | user_choice>2){
                    System.out.print("Enter Valid Choice: ");
                }
                
                if(user_choice == 1){
                    System.out.println("-------------------------------> "+ user +" Chose to Bat First <-------------------------------");
                    user_score=user_batting1(user);
                    comp_score=comp_batting2(user_score);
                }
                else{
                    System.out.println("------------------------------> "+ user+ " Chose to Bowl First <-------------------------------");
                    comp_score=comp_batting1();
                    user_score=user_batting2(user, comp_score);
                }
            }
            else{
                int comp_choice=r.nextInt(1,3);
                
                if(comp_choice == 1){
                    System.out.println("--------------------------------> COMPUTER Chose to Bat First <--------------------------------");
                    comp_score=comp_batting1();
                    user_score=user_batting2(user, comp_score);
                }
                else{
                    System.out.println("-------------------------------> COMPUTER Chose to Bowl First <--------------------------------");
                    user_score=user_batting1(user);
                    comp_score=comp_batting2(user_score);
                }
            }

            if (user_score>comp_score) {
                System.out.println("\n=================================> "+ user +" Won the Match! <=================================\n");
            }
            else if(user_score==comp_score){
                System.out.println("\n========================================> Match Tied! <========================================\n");
            }
            else{
                System.out.println("\n==================================> COMPUTER Won the match <===================================\n");
            }
            System.out.println("Do you want to play again!\n1. Yes(1)\n2. No(2)");
            int again=s.nextInt();
            while(again<1 | again>2){
                System.out.print("Enter Valid Input: ");
                again=s.nextInt();
            }
            if(again==2){
                break;
            }
        }
    }
}