# 📚 프로젝트 소개
## 1. 개요
- 프로젝트명 : Book' (북따옴)
- 개발 기간 : 2023.09.16 ~ 2023.10.10
- 개발 인원 : 6명
<br>

📌[click! 프로젝트 협업 관리 페이지 (notion)](https://low-fisherman-ad6.notion.site/Team-Project_Book-845242c6cf794c498a449a01a79072e6?pvs=4)

<img src="https://blogfiles.pstatic.net/MjAyMzA5MjhfMTEz/MDAxNjk1ODQxOTQ4MDA2.uLPLvFcfGnvAbGFXCvj3QawjfEDEG46I730AhcjFnlAg.VAnivc5MENfYDTcU0AgfVCTBXYb_xMfXzPvqpaZl2yIg.JPEG.kky5163/readme1.jpg" wight="700" height="743">

<br>


# 📋 기능 명세서
## 1. 관리자 페이지
### 기본 설정
    
### 회원관리
- 회원 전체 조회
- 아이디 찾기
- 비밀번호 찾기

## 2. 회원
### 로그인
- 로그인
### 회원가입
- 회원가입 시 암호화(hashing)화 되어 DB에 저장.
- Id(email) : email 형식의 아이디. 필수 항목.
- Pw : 최대 길이 40. 필수 항목.
- 회원명 : 최대 길이 40. 필수 항목.
- 휴대전화번호 : 최대 길이 11. 필수 항목 정규표현식 사용.
- 우편번호 : 최대 길이 10. 필수 항목.
- 주소 : 최대 길이 100. 필수 항목
- 나머지 주소

### 아이디(email) 찾기
- 아이디(email), 회원명으로 조회
- 성공시 정보 출력 후 로그인 페이지로 이동.
- 실패시 재입력 요구.

### 비밀번호 찾기
- 아이디(email), 회원명으로 조회
- 성공시 정보 출력 후 로그인 페이지로 이동.
- 실패시 재입력 요구.

### 마이페이지
- 개인정보 수정, 회원탈퇴
- 문의 내용 목록 조회

## 3. 상품
### 상품 등록
- 상품 조회
  - 전체 조회
  - 개별 조회
- 상품 수정
- 상품 등록

## 4. 주문
### 주문 관리
- 주문 통합 검색
- 신규 주문
- 배송 상태

### 취소/교환/반품
- 취소
- 교환
- 반품

## 5. 게시글
### 게시판 관리
- 게시판 목록
- 게시판 등록/수정
- 게시글 관리

## 6. 통계 그래프
### 통계
- 요약
- 고객현황
- 연령별 선호도

## 7. 이벤트
### 이벤트 관리
- 이벤트 쿠폰

# 💡 담당 파트
- 관리자, 회원 : 윤여찬
- 상품 등록 : 장준
- 주문 관리 : 김기용
- 취소/반품/교환 : 김혜주
- 게시판 관리 : 전성우
- 통계, 이벤트 : 김형석

# 유스케이스 다이어그램
[click! 확대 페이지](https://gitmind.com/app/docs/fi33cfss)
<img src="https://postfiles.pstatic.net/MjAyMzEwMThfMjUg/MDAxNjk3NjA5OTQ3NTY3.OS17M7o4w4afiFUtrAXjDO821mflnpNniiUWIPQetrog.w_QWTylXYNIEdY_rfflIpfLuUN2ObOog0KMKBSPFCsAg.PNG.kky5163/image.png?type=w966" wight="700" height="743">

# ERD 다이어그램