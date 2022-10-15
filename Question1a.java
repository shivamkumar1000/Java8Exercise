class Question1a{
    void implement(){
        IF1 mi1 = (a,b) -> a>b;
        System.out.println(mi1.perform1(4,7));
    }
}
interface IF1{
    Boolean perform1(int a,int b);
}
class Main1 {
    public static void main(String[] args) {
        Question1a ques1 = new Question1a();
        ques1.implement();
    }
}
