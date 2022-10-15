class Question1d {
    void implement() {
        IF4 mi4 = (str) -> str.toUpperCase();
        System.out.println(mi4.perform4("shivam"));


    }
}
interface IF4{
    String perform4(String str);
}
class Main4 {
    public static void main(String[] args) {
        Question1d ques4 = new Question1d();
        ques4.implement();
    }
}