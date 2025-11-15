import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BillingServiceImpl implements BillingService {

	@Override
	public String get() {
		return "hey. i'm inside billing module";
	}

	
}
