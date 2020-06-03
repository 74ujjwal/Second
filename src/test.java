import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class test {

	public static void main(String[] args) throws IOException {
		try (InputStream input = test.class.getClassLoader().getResourceAsStream("test.properties")) {

            Properties prop = new Properties();
            prop.load(input);
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            final String ob = "ob|ab|cd|de";
            if (ob.contains("cd")) {
            System.out.print(ob);
	}

}
}
}
