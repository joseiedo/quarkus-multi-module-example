import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
@Path("/billing")
public class HealthController {

	private BillingService billingService;
	private UserService userService;

	public HealthController(
		BillingService billingService,
		UserService userService
	) {
		this.billingService = billingService;
		this.userService = userService;
	}

	@GET
	@Path("/health")
	public String health() {
		return billingService.get();
	}

	@GET
	@Path("/user")
	public String user() {
		return userService.get();
	}
}
