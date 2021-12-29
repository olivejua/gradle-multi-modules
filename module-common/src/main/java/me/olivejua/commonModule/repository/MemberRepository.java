package me.olivejua.commonModule.repository;

import me.olivejua.commonModule.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
