package zeroing2.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zeroing2.hellospring.repository.JdbcMemberRepository;
import zeroing2.hellospring.repository.JdbcTemplateMemberRepository;
import zeroing2.hellospring.repository.MemberRepository;
import zeroing2.hellospring.repository.MemoryMemberRepository;
import zeroing2.hellospring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
