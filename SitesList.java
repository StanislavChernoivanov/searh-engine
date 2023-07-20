package searchengine.config;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;
@Setter
@Getter
@Component
@Configuration
@ConfigurationProperties(prefix = "indexing-settings")
public class SitesList {
    private List<Site> sites;
}
