# SpringBoot-Inflearn
인프런 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술(내용 정리, 실습 코드 정리)


### 0. 강의 소개 
### 1. 프로젝트 환경 설정
 * **View 환경설정 ([index.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/static/index.html) / [hello.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/templates/hello.html) / [HelloController](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/controller/HelloController.java))**
### 2. 스프링 웹 개발 기초 
 * **정적 컨텐츠**
 * **MVC와 템플릿 엔진**
 * **API**
### 3. 회원 관리 예제 - 백엔드 개발
  * **회원 도메인과 리포지토리 만들기 ([Member](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/domain/Member.java) / [MemberRepository](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/repository/MemberRepository.java) / [MemoryMemberRepository](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/repository/MemoryMemberRepository.java))**
    - Optional 클래스[💡](https://bejewled-hornet-2b8.notion.site/Stream-058a5a7ac492444e91d7184b39ce9132#972627f95b114bd9838d18937476c461)
    - stream()[💡](https://bejewled-hornet-2b8.notion.site/Stream-42f86dbd422d4f0aa2659e3936c5246a)
  * **회원 리포지토리 테스트 케이스 작성 ([MemoryMemberRepositoryTest](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/test/java/hello/hellospring/repository/MemoryMemberRepositoryTest.java))**
    - JUnit 프레임워크로 테스트 실행 (@Test)
    - @BeforeEach : 각 테스트가 시작될 때 마다 실행 / @AfterEach : 각 테스트가 종료될 때 마다 실행 
    - ```Assertions.assertThat().isEqualTo()```
  * **회원 서비스 개발 ([MemberService](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/service/MemberService.java))**
    - Method 만드는 단축키 : cmd + option + m
    - IllegalStateException : 메소드가 요구된 처리를 하기에 적합한 상태에 있지 않을때 발생하는 에러 
  * **회원 서비스 테스트 ([MemberServiceTest](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/test/java/hello/hellospring/service/MemberServiceTest.java))**
    - JUnit 테스트 케이스 쉽게 만들기 : 원하는 class 파일 우클릭 > New > JUnit Test Case 생성 > Test Methods 설정 후 Finish  
### 4. 스프링 빈과 의존관계
  * **컴포넌트 스캔과 자동 의존관계 설정 ([MemberController](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/controller/MemberController.java))**
    - @Componet 애노테이션이 있으면 스프링 빈으로 자동 등록 
    - @Componet 를 포함하는 애노테이션도 스프링 빈으로 자동 등록 (@Controller, @Service, @Repository)
    - 생성자에 @Autowired 를 사용하면 객체 생성 시점에 스프링 컨테이서에서 해당 스프링 빈을 찾아 주입
    - 스프링 컨테이너에 스프링 빈을 등록할 때 기본으로 싱글톤으로 등록함(유일하게 하나만 등록하여 공유)
  * **자바 코드로 직접 스프링 빈 등록하기 ([SpringConfig](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/service/SpringConfig.java))**
    - 회원 서비스와 회원 리포지토리의 @Service, @Repository, @Autowired 를 제거하고 진행
    - 주의: ~~*SpringConfig를 통해*~~ 스프링 빈으로 등록하지 않고 직접 생성한 객체에서는 동작 안 함
### 5. 회원 관리 예제 - 웹 MVC 개발
### 6. 스프링 DB 접근 기술
### 7. AOP
### 8. 다음으로
