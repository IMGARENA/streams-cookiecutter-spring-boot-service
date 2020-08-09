package {{ cookiecutter.base_package }}.{{ cookiecutter.project_slug }};

import {{ cookiecutter.base_package }}.{{ cookiecutter.project_slug }}.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
