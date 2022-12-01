public class CompetitionRules {

    private static CompetitionRules rules = new CompetitionRules();

    private String competitionRule1 = "Do not copy and paste from StackOverFlow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.println("1st rule: " + competitionRule1);
        System.out.println("2nd rule: " + competitionRule2);
        System.out.println("3rd rule: " + competitionRule3);
    }

 public static CompetitionRules getInstance(){
        return rules;
    }
}

