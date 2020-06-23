public class ImageViewerPlugin {
    private String ext;

    public ImageViewerPlugin(String ext) {
        this.ext = ext;
    }

    public String getName() {
        return ext + " Module";
    };

    // 해당되는 확장자를 가지고 있는 파일을 보이는 함수
    // 본 문제에서는 그냥 로딩한다는 표시만 화면에
    // 출력. 예) "JPG image loading: fileName"
    public void show(String fileName) {
        System.out.println(ext + " image loading: " + fileName);
    }

    // 처리 가능한 이미지의 확장자를 문자열 형태로 반환
    // 예) "JPG" 또는 "PNG"
    public String getExtension() {
        return ext;
    }

    public String getExtName() {
        return ext;
    }
}
