
class Question5 implements myInterface2{
    public void perform(){
        System.out.println("Overriding the default method of interface");
    }
    void implement(){
        Question5 ques5 = new Question5();
        ques5.perform();
    }

}
interface myInterface2{
    default void perform(){
        System.out.println("Default method inside interface");
    }
}
class Maind {
    public static void main(String[] args) {
        Question5 ques5 = new Question5();
        ques5.implement();
    }
}