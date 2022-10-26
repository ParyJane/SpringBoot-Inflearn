package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

public class MemoryMemberRepositoryTest {
	
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	public void clearStore() {
		repository.clearStore();
	}
	
	@Test
	public void save() {
		// given
		Member member = new Member();
		member.setName("String");
		
		// when
		repository.save(member);
		
		// then
		Member result = repository.findById(member.getId()).get(); // Optional에서 get()
		assertThat(result).isEqualTo(member);
		
	}
	
	@Test
	public void findByName() {
		
		Member member1 = new Member();
		member1.setName("String1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("String2");
		repository.save(member2);
		
		Member result = repository.findByName(member2.getName()).get();
		
		assertThat(result).isEqualTo(member2);
		
	}
	
	@Test
	public void findById() {
		
		Member member1 = new Member();
		member1.setName("String1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("String2");
		repository.save(member2);
		
		Member result = repository.findById(member2.getId()).get();
		
		assertThat(result).isEqualTo(member2);
		
	}
	
	@Test
	public void findAll() {
		
		Member member1 = new Member();
		member1.setName("String1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("String2");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
		
	}
}
