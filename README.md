# 해당주차
- week04 : LifeCycle
# 미션내용
**생명주기를 활용**하여 메모장 앱 만들어보기
- 화면 구성
    1. 메모 화면 (EditText와 다음 화면으로 넘어가는 Button)
    2. 확인 화면 (TextView에 메모 화면에서 작성한 내용 보여주기)
- 생명주기에 다음 기능 구현
    - **onCreate** : Layout XML 파일을 Activity에서 ContentView로 사용할 수 있도록 하기 (즉, 화면 설정)
    - **onResume** : onPause에서 저장한 전역변수 내용으로 EditText 내용으로 설정하기
        - 변수 값이 비어있다면 아무것도 안하기
    - **onPause** : 현재까지 작성한 내용 Activity의 전역변수에 담아두기
    - **onRestart** : Dialog를 활용하여 다시 작성할거냐고 묻는 창 띄우기
        - 다시 작성하지 않겠다고 하면 onPause에서 저장했던 변수 비우기
