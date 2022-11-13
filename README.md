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
  * **회원 웹 기능 - 홈 화면 추가 ([home.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/templates/home.html) / [HomeController](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/controller/HomeController.java))**
    - 스프링은 컨테이너에 등록된 페이지 ~~*home.html*~~ 를 우선적으로 검색하고 등록된 페이지가 없으면  ```static/index.html```을 오픈
  * **회원 웹 기능 - 홈 화면 추가 ([home.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/templates/home.html) / [HomeController](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/controller/HomeController.java))**
  * **회원 웹 기능 - 등록 ([creatMemberForm.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/templates/members/creatMemberForm.html) / [MemberForm](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/java/hello/hellospring/controller/MemberForm.java))**
    - @GetMapping : 일반적으로 조회할 때 많이 사용 (url 주소)
    - @PostMapping : 일반적으로 데이터를 등록할 때 많이 사용 (form에 데이터를 넣어서 전달하는 방식)
  * **회원 웹 기능 - 조회 ([memberList.html](https://github.com/ParyJane/SpringBoot-Inflearn/blob/master/hello-spring/src/main/resources/templates/members/memberList.html))**
### 6. 스프링 DB 접근 기술 [💡]([https://bejewled-hornet-2b8.notion.site/Stream-058a5a7ac492444e91d7184b39ce9132#972627f95b114bd9838d18937476c461](https://www.notion.so/88c333bc21b7410bab598eb6e78f3d8a#56b0371574854f8c8df2bc93121957f1))
  * **H2 데이터 베이스 설치** 
  * **순수 JDBC** 
    - 개방 폐쇄 원칙(OCP, Open-Closed Principle) : 확장에는 열려있고, 수정, 변경에는 닫혀있다.
  * **스프링 통합 테스트** 
    - @SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행한다.
    - @Transactional : 테스트 시작 전에 트랜젝션을 시작하고, 테스트 완료 후에 항상 롤백한다.(다음 테스트에 영향X)
  * **스프링 JdbcTemplate** 
    - RowMapper<T> : JdbcTemplate에서 ResultSet을 행 단위로 매핑하는데 사용하는 인터페이스
  * **JPA** 
  * **스프링 데이터 JPA** 
### 7. AOP
  * **AOP가 필요한 상황**
    - 공통 관심 사항 vs 핵심 관심 사항 : 회원가입, 회원 조회 같은 기능은 핵심 관심 사항이고, 각 메소드의 시간을 측정하는 로직은 공통 관심 사항이다.
  * **AOP 적용**
    - AOP(Aspect Oriented Programming) : 관점 지향 프로그램
    - 핵심 관심 사항을 깔끔하게 유지할 수 있다.
    - 원하는 적용 대상을 선택할 수 있다.
    - ```@Aspect``` / ```@Component``` / ```@Around("execution(* hello.helloSpring.service..*(..))")```
### 8. 다음으로
