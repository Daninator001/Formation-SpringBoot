
package com.linkedin.actuator;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TestHealthIndicator implements HealthIndicator {

    @Override
    public @Nullable Health health() {
        return Health.up().withDetail("DB", "OK").withDetail("Network", "OK").build();
        // return Health.down().withDetail("DB", "OK").withDetail("Network", "OK").build();
    }

}
