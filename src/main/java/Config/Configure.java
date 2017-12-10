package Config;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@Configuration
@EnableScheduling
public class Configure {

	@Bean
    public TaskScheduler taskExecutor () {
        return new ConcurrentTaskScheduler(
                  Executors.newScheduledThreadPool(3));
    }
}
