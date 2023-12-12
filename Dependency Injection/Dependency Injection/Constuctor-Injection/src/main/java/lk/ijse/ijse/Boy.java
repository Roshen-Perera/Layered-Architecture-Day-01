package lk.ijse.ijse;

public class Boy {
    Agreement agreement;

    public Boy(Girl girl) {
        this.agreement = girl;
    }

    public void chatWithGirl(){
        agreement.chat();
    }
    public void test(){
        agreement.chat();
    }
    public static void main(String[] args) {

        Boy boy = new Boy(new Girl());
        boy.chatWithGirl();
        boy.test();
    }
}
