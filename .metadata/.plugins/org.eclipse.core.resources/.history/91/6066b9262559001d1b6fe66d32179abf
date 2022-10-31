package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

@Service
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	// 회원 리포지토리 코드가 회원 서비스 코드를 DI이 함 
	@Autowired
	public MemberService(MemoryMemberRepository memberRepository) {
		this.memberRepository = memberRepository;
		
	}
	
	/*
	 *	 회원 가입 
	 */
	public Long join(Member member) {
		
		validateDuplicateMember(member); // 이름 중복 방지 
		memberRepository.save(member);
		return member.getId();
	}


	private void validateDuplicateMember(Member member) {
		// 메소드 생성 방법 : cmd + option + m
		/*
		Optional<Member> result = memberRepository.findByName(member.getName());
		result.ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
		*/
		// IllegalStateException : 메소드가 요구된 처리를 하기에 적한한 상태에 있지 않을때 발생하는 에러 
		memberRepository.findByName(member.getName())
		.ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
	} 
	
	/*
	 *	 회원 조회 
	 */
	public List<Member> findMembers() {
		return memberRepository.findAll();
	} 
	
	public Optional<Member> findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}

}
