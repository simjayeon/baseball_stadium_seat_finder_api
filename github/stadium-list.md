📌 기능 ID: FINDER-001

📌 기능 이름: 구장 리스트 조회

---

### 🔸 기능 설명

1. 구장 리스트를 조회한다.

---

**⚙️ 처리 로직**

- Step 1: 구장 리스트 조회
    - 데이터베이스에서 구장 리스트를 조회한다.
    - 빈 값인 경우, noContent 응답을 반환한다.
    - 값이 있는 경우, 구장 리스트를 반환한다.

**📤 출력 데이터 (Response Body)**

- 201 OK: `ResStadiumList` 객체를 반환

```json
{
  "stadium": StadiumEnum
}
```

- 401 Fail: Unauthorized와 오류 메시지 반환

```json
 {
  "message": "없는 정보"
}
```

**🔗 API 정보**

•    **Method**: GET

•    **Endpoint**: /api/v1/stadium

**✅ 진행 상태 체크리스트**

- [x]  요구사항 분석
- [x]  개발 중
- [x]  테스트 완료
- [ ]  배포 완료

**🎯 우선순위**

• Middle