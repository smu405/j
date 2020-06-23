public interface ImageViewerInterface {
    // ImageViewerInterface를 구현하는 클래스 모듈의
    // 이름을 반환. 예) "JPG Module"
    String getName();

    // 해당되는 확장자를 가지고 있는 파일을 보이는 함수
    // 본 문제에서는 그냥 로딩한다는 표시만 화면에
    // 출력. 예) "JPG image loading: fileName"
    void show(String fileName);

    // 처리 가능한 이미지의 확장자를 문자열 형태로 반환
    // 예) "JPG" 또는 "PNG"
    String getExtension();
}
