package JavaString.Level2;
import java.util.Scanner;
class RockPaperScissor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of games:");
        int n=sc.nextInt();sc.nextLine();
        String[][] results=new String[n][3];
        int userWin=0,compWin=0;
        for(int i=0;i<n;i++){
            System.out.println("Game "+(i+1)+": Enter rock, paper, or scissors:");
            String user=sc.nextLine().toLowerCase();
            String comp=computerChoice();
            String winner=decideWinner(user,comp);
            if(winner.equals("User")) userWin++;
            else if(winner.equals("Computer")) compWin++;
            results[i][0]=user;results[i][1]=comp;results[i][2]=winner;
        }
        String[][] stats=calculateStats(userWin,compWin,n);
        displayResults(results,stats);
    }
    static String computerChoice(){
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        else if(r==1) return "paper";
        else return "scissors";
    }
    static String decideWinner(String user,String comp){
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("rock") && comp.equals("paper")) return "Computer";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        if(user.equals("paper") && comp.equals("scissors")) return "Computer";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        if(user.equals("scissors") && comp.equals("rock")) return "Computer";
        return "Invalid";
    }
    static String[][] calculateStats(int user,int comp,int total){
        String[][] arr=new String[3][2];
        arr[0][0]="User";arr[0][1]=String.valueOf(user);
        arr[1][0]="Computer";arr[1][1]=String.valueOf(comp);
        arr[2][0]="User Win %";arr[2][1]=String.valueOf((user*100)/total);
        arr[2][0]+=" / Computer Win %";arr[2][1]+=" / "+String.valueOf((comp*100)/total);
        return arr;
    }
    static void displayResults(String[][] games,String[][] stats){
        System.out.println("\nGame Results:");
        System.out.println("User\tComputer\tWinner");
        for(int i=0;i<games.length;i++)
            System.out.println(games[i][0]+"\t"+games[i][1]+"\t"+games[i][2]);
        System.out.println("\nStats:");
        for(int i=0;i<stats.length;i++)
            System.out.println(stats[i][0]+"\t"+stats[i][1]);
    }
}

