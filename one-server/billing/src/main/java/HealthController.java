import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

public class HealthController {

	@GET
	@Path("/health")
	public String health() {
		return "What is love? Baby don't hurt me...";
	}
}
