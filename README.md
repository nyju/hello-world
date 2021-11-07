# Restful-api

[tistory_blog 정리내용 보기](https://anjuna.tistory.com/category/Study/Restful)
* 사용자 restful api 생성
  * 전체 사용자 목록
  * 개별 사용자 목록
  * 사용자 등록
  
  
* Http status Code 제어
  * Servleturicomponentsbuilder로 uri를 생성하여 id 반환
  * ResponseEntity 응답코드 생성
* Exception Handing
  * ControllerAdvice를 이용한 에러 처리
  
* 유효성 체크를 위한 Validation 사용
  * handleMethodArgumentNotValid를 재정의 하여 오류메세지 출력
* 다국어 처리를 위한 Internationalization 구현
  * LocaleResolver
  
* 데이터 필터링
  * @JsonIgnore, @JsonIgnoreProperties
  * @JsonFilter

* Restful API 버전관리
  * URL을 이용한 버전관리
  * Request 파라미터를 이용한 버전 관리
  * Header값을 이용한 버전관리
  * Mime Type을 이용한 버전관리
  
  
* Hateoas(Hypermedia as the Engine of Application State)
  * 현재 리소스와 연관된 자원 상태 정보를 제공
  * WebMvcLinkBuilder
