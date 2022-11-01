package hello.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;

@Controller
public class MemberController {
	
	// 회원 컨트롤러가 회원 서비스와 회원 리파지토리를 사용할 수 있는 의존관계 주입 
	
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 회원 가입 
	@GetMapping("/members/new")
	public String creatForm() {
		return "/members/creatMemberForm";
	}
	
	@PostMapping("/members/new")
	public String creat(MemberForm memberForm) {
		Member member = new Member();
		member.setName(memberForm.getName());
		
		memberService.join(member);
		
		return "redirect:/";
	}
	
	// 회원 조회 
	@GetMapping("/members")
	public String list(Model model) {
		List<Member> list = memberService.findMembers();
		model.addAttribute("members", list);
		return "/members/memberList";
	}
	
}