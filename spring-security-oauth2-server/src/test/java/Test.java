import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @description:
 * @author: Nox
 * @date: 2019/8/18
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("secret"));
	}
}
