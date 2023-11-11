public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }// Main method
    public Loops(){
        //call counting methods in here
        countUp();
        countByThrees();
        countDown();
    }//constructor method
    // define counting methods here
    public void countUp(){
        for(int x = 1; x<6; x++){
            System.out.println(x);
        }
    }
    public void countByThrees(){
        for(int y = 3; y<=15;y = y+3){
            System.out.print(y + " ");
        }
    }
    public void countDown(){
        System.out.println();
        for( int q = 10; q>= 1; q = q-1){
            System.out.print(q + ", ");
        }
        System.out.println("Happy Loop Year!");
    }
}
