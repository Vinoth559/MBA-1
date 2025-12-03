import java.util.Scanner;
import java.util.HashMap;

public class MBACareerQuiz {
    public static void main(String[] args) {
        String[] questions = { /* Questions as previously defined */ };
        String[][] options = { /* Options as previously defined */ };
        String[][] values = { /* Values as previously defined */ };

        HashMap<String,Integer> score = new HashMap<>();
        score.put("HR",0); score.put("Marketing",0); score.put("Finance",0);
        score.put("Operations",0); score.put("Consulting",0);

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++){
            System.out.println(questions[i]);
            for(int j=0;j<5;j++) System.out.println((j+1)+". "+options[i][j]);
            int choice;
            System.out.print("Enter your choice (1-5): "); choice = sc.nextInt();
            while(choice<1 || choice>5){ System.out.print("Invalid! Enter 1-5: "); choice=sc.nextInt(); }
            String job = values[i][choice-1]; score.put(job, score.get(job)+1);
            System.out.println();
        }

        String result=""; int maxScore=0;
        for(String key: score.keySet()){ if(score.get(key)>maxScore){ maxScore=score.get(key); result=key; } }

        System.out.println("==============================");
        switch(result){
            case "HR": System.out.println("You are suitable for HR roles: Recruiter, Talent Manager, HR Business Partner."); break;
            case "Marketing": System.out.println("You are suitable for Marketing roles: Brand Manager, Digital Marketing, Sales Manager."); break;
            case "Finance": System.out.println("You are suitable for Finance roles: Financial Analyst, Investment Banker, Accountant."); break;
            case "Operations": System.out.println("You are suitable for Operations roles: Supply Chain Manager, Operations Manager, Project Manager."); break;
            case "Consulting": System.out.println("You are suitable for Consulting roles: Business Consultant, Strategy Consultant, Management Consultant."); break;
        }
        sc.close();
    }
}
