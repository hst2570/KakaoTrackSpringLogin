# SpringBootWebApp

### 회원관리 기능(회원가입/로그인)

##### 메인화면 (/)

- 회원가입, 로그인, 로그아웃으로 구성됨.
- session에 id값이 없으면 회원가입과 로그인을 보여줌.
- session에 id값이 있다면 로그아웃을 보여줌.

##### 회원가입 (/user/signup)

- 이메일과 비밀번호, 닉네임을 입력받는다.
- MainController -> write객체를 통해 저장.

##### 로그인 (/user/signin/form)

- 이메일과 비밀번호 값을 입력받음.
- MainController -> signin객체에서 로그인 유무 판별
- 로그인이 된다면 session에 mem_id값을 저장.
- 로그인 실패 시, 실패 레이아웃을 보여줌.


###테이블

#####회원 테이블

- 회원 번호(PK) (mem_id)
- 아이디 (email)
- 패스워드 (password)
- 닉네임 (nickname)


