public class Conditionals2  {
        public static void main(String[] args) {
            Conditionals2 magicEightBall = new Conditionals2();
        }//main method

        public Conditionals2(){
            String question = "Do you like soccer?";
            System.out.println(question);
            double randomInt = Math.random();

            if(randomInt<(0.125)){
                System.out.println("Without a doubt.");
            }else if(randomInt<(0.25)){
                System.out.println("Better not tell you now.!");
            }else if(randomInt<(0.325)){
                System.out.println("Very doubtful.");
            }else if(randomInt<(0.5)){
                System.out.println("As I see it, yes.");
            }else if(randomInt<(0.625)){
                System.out.println("Roll again.");
            }else if(randomInt<(0.75)){
                System.out.println("Most likely.");
            }else if(randomInt<(0.875)){
                System.out.println("Yes.");
            }else{
                System.out.println("Concentrate and ask again.");
            }



        }
    }


