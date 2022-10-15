class Question1b {
    void implement(){
        IF2 mi2 = (x) -> x+1;
        System.out.println(mi2.perform2(5));
    }
}
interface IF2{
    int perform2(int x);
}
class Main2 {
    public static void main(String[] args) {
        Question1b ques2 = new Question1b();
        ques2.implement();
    }
}