import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void mainClassTest() {
        if (this.getLocalNumber() == 14) {
            System.out.println("Success! getLocalNumber = " + this.getLocalNumber());
        } else {
            System.out.println("Error!!! getLocalNumber = " + this.getLocalNumber());
        }
    }
}
