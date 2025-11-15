package com.joseiedo.streaming;

import com.joseiedo.user.UserService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
@Path("/streaming")
public class HealthController {

	private final StreamingService streamingService;

    public HealthController(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @GET
	@Path("/health")
	public String health() {
        return streamingService.get();
	}

}
