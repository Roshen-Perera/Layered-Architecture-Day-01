package lk.ijse;

public class Boy {
    private final Agreement agreement = new Girl();
    public void chatWithGirl(){
        agreement.chat();
    }
    public void test(){
        agreement.chat();
    }
    public static void main(String[] args) {

        Boy boy = new Boy();
        boy.chatWithGirl();
        boy.test();
    }
}
