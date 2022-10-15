class Question1c {
    void implement() {
        IF3 mi3 = (s1, s2) -> s1 + s2;
        System.out.println(mi3.perform3("Shivam", "Kumar"));
    }
}
interface IF3{
    String perform3(String str1,String str2);
}
class Main3 {
    public static void main(String[] args) {
        Question1c ques3 = new Question1c();
        ques3.implement();
    }
}
