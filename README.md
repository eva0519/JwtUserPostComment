# (JWT + Security + Board + Comment)


## API 명세서

| 기능           |    Method    | URL              | Request           |   Response|
| ------------- | ------------- |-----------         |------------------|------------
| 회원 가입       | POST           |/api/signup | username	 password passwordConfirm| ResponseDto
| 로그인          | POST           |/api/login| username	 password| ResponseEntity
| 토큰 재발급     | POST           |/api/reissue| accessToken refreshToken| ResponseEntity
| 게시글 작성     | POST         | /api/auth/boards | Authorization, Refresh-Token, PostRequestDto| ResponseDto
| 게시글 조회     | GET           | /api/boards       |                      | PostResponseDto
| 게시글 수정     | PUT          |/api/auth/boards/{id}| id, title, content, UserLoginInfo | ResponseDto
| 게시글 삭제     | DELETE      |/api/auth/boards/{id}| id, UserLoginInfo | ResponseDto
| 댓글 생성      | POST         | /api/auth/comments  | postId, content, UserLoginInfo | ResponseDto
| 댓글 목록 조회  | GET        | /api/comments/{id}   | postId | PostResponseDto
| 댓글 수정      | PUT         | /api/auth/comments/{id} |  id, postId, title, content, UserLoginInfo | ResponseDto
| 댓글 삭제      | DELETE     | /api/auth/comments/{id} | id, postId, UserLoginInfo | ResponseDto
| 유저 생성      | POST     | /users/me |            | ResponseDto
| 유저 조회      | GET     | /{username} | username	 | ResponseDto



![boardcomment](https://user-images.githubusercontent.com/57734102/195507571-bc5b38e6-dfcf-4816-a3fd-6025644270eb.JPG)
