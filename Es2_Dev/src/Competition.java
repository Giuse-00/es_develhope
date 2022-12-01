public class Competition{

    public static void main(String[] args) {

        CompetitionRules printR = new CompetitionRules();
        printR.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Juve";
        teamB.teamName = "Udinese";

        teamA.p1.name = "Giuse";
        teamA.p1.yearsOfExperience = 3;
        teamA.p1.programmingLanguage = "JS";

        teamA.p2.name = "Marco";
        teamA.p2.yearsOfExperience = 3;
        teamA.p2.programmingLanguage = "Python";

        teamB.p1.name = "Billy";
        teamB.p1.yearsOfExperience = 6;
        teamB.p1.programmingLanguage = "Kotlin";

        teamB.p2.name = "Luca";
        teamB.p2.yearsOfExperience = 2;
        teamB.p2.programmingLanguage = "Java";

        System.out.println("----------------------------------------");

        teamA.printTeamDetails();
        teamB.printTeamDetails();

    }
}
