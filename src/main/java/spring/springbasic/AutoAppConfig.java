package spring.springbasic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
//        basePackages = "spring.springbasic.member",
//        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
// 컴포넌트 스캔을 사용하려면 먼저 @ComponentScan를 붙여줘야 한다.
// 기존의 AppConfig완,ㄴ 다르게 @Bean으로 등록한 클래스가 하나도 없다.

// 컴포넌트 스캔은 이름 그래도 @component 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다.

// 이제 각 클래스가 컴포넌트 스캔의 대상이 되도록 @Component를 붙여준다
