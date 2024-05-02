package ${package}.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YAMLConfig {
  @Bean
  public ObjectMapper yamlObjectMapper() {
    return new ObjectMapper(new YAMLFactory());
  }
}
