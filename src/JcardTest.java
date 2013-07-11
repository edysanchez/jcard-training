import javacard.framework.*;
import javacard.framework.service.*;
public class JcardTest extends Applet{

    private JcardTest() {
    }
    public static void install(byte[] buff, short ofs, short len) {
        new JcardTest().register();
    }

    public void process(APDU apdu) {

    }
}
