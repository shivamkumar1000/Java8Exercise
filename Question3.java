class Question3{
    void implement(){
        Runnable task2 = () -> { System.out.println("Task #2 is running"); };
        new Thread(task2).start();
    }
}
class Mainc {
    public static void main(String[] args) {
        Question3 ques3 = new Question3();
        ques3.implement();
    }
}