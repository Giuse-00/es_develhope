public class Team {

        public String teamName;

        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();

        public void printTeamDetails(){
            System.out.println("The team name is: " + teamName);
            System.out.println(p1.name + " work with " + p1.programmingLanguage + " and has " + p1.yearsOfExperience + " years of experience");
            System.out.println(p2.name + " work with " + p2.programmingLanguage + " and has " + p2.yearsOfExperience + " years of experience");
        }
}
