📌 기능 ID: COM-AUTH-001

📌 기능 이름: 회원가입

---

### 🔸 기능 설명

1. 유저의 정보를 직접 입력을 통해 일반 회원가입을 한다.

---

### 📥 입력 데이터 (Request Param)

```json
"name": String,
"email": String,
"password": String
```

**⚙️ 처리 로직**

- Step 1: 유저 정보 검증
    - 클라이언트로부터 `name` , `email` , `password` 값을 확인한다.
    - 데이터베이스에 중복되는 `email` 이 있는지 검증한다.
    - 유효하지 않을 경우, “이미 가입된 정보입니다.” 메시지를 반환한다.
    - 유효하는 경우, 가입을 진행한다.

**📤 출력 데이터 (Response Body)**

- 201 OK: `ResTokenDto` 객체를 반환

```json
{
  "accessToken": String,
  "refreshToken": String
}
```

- 401 Fail: Unauthorized와 오류 메시지 반환

```json
 {
  "message": "잘못된 가입 정보"
}
```

**🚨 예외 처리**

| **조건**               | 응답코드             | **예외 메시지** |
|----------------------|------------------|------------|
| `email` 이 유효하지 않은 경우 | 400 Bad Request  | [메시지]      |
| `email` 검증 실패 시      | 401 Unauthorized | [메시지]      |

**🔗 API 정보**

•    **Method**: POST

•    **Endpoint**: /api/v1/auth/sign-up

**✅ 진행 상태 체크리스트**

- [x]  요구사항 분석
- [x]  개발 중
- [x]  테스트 완료
- [x]  배포 완료

**🎯 우선순위**

• High