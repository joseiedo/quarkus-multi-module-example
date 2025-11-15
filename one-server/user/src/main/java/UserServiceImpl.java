import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl implements UserService {

	@Override
	public String get() {
		return "hey. i'm inside user module";
	}

	
}
