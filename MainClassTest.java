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

    @Test
    public void testGetClassNumber()
    {
        if (this.getClassNumber() > 45) {
            System.out.println("Success! Value greater than 45");
        } else {
            System.out.println("Error!!! Value = " + this.getClassNumber());
        }
    }
}
