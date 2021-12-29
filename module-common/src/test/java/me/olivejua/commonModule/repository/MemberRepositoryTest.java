package me.olivejua.commonModule.repository;

import me.olivejua.commonModule.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void add() {
        memberRepository.save(new Member("olivejua", "olivejua@gmail.com"));
        Member saved = memberRepository.findById(1L).get();
        assertThat(saved.getName(), is("olivejua"));
    }
}
