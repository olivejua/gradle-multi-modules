package me.olivejua.moduleApi.repository;

import me.olivejua.domain.Member;
import me.olivejua.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void save() {
        Member member = new Member("seulki", "tmfrl4710@gmail.com", "olivejua");
        memberRepository.save(member);

        assertThat(member.getId()).isEqualTo(1L);
    }
}
