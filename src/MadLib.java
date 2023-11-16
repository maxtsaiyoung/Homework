public class MadLib {
    public int number1 = 100;
    public int number2 = 9;
    public int wholeNumberBetween1And4 = 2;
    public String adjective = "tiring";
    public String miltonTeacher = "Ms. Lockwood";
    public String miltonDean = "Mr. Furst";
    public String season = "fall";
    public String classmate = "Teddy";
    public String city = "Boston";
    public String noun = "pencil";
    public String pluralNoun = "cars";
    public String pluralAnimal = "dogs";
    public double decimalBiggerThan1 = 1.5;
    public boolean trueOrFalse = true;
    public char letterGrade = 'A';


    public static void main(String[] args) {
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    } //main method

    public MadLib(){
        System.out.println("hi bob");


        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);

    }//constructor method.

}