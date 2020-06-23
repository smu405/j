public class ImageViewer {
    private static final int MAX_PLUGINS = 5;
    private ImageViewerInterface[] plugins;
    private int pluginsCount;

    // ImageViewerInterface를 구현한 클래스의 객체를
    // 담을 수 있는 배열 초기화
    // 최대 플러그인 개수는 MAX_PLUGINS
    ImageViewer() {
        plugins = new ImageViewerInterface[MAX_PLUGINS];
        pluginsCount = 0;
    }

    // ImageViewerInterface를 구현한 클래스의 객체를
    // 배열에 추가
    void addPlugIn(ImageViewerInterface ivi) {
        if (pluginsCount < plugins.length) {
            plugins[pluginsCount] = ivi;
            pluginsCount++;
        }
    }

    // 이미지 파일 이름과 확장자에 해당되는 인자를 받아서
    // 배열에서 해당되는 확장자를 처리할 수 있는 객체를
    // 찾아서 처리. 만약 플러그인을 찾지 못하면, "Image
    // viewer plugin for the extension, ???, is not
    // registered"를 출력할 것. ???는 확장자
    void show(String fileName, String ext) {
        boolean found = false;
//        for (ImageViewerInterface ivi : plugins) {
//            if (ivi != null) {
//                if (ivi.getExtension().equals(ext)) {
//                    System.out.println("Using " + ivi.getName());
//                    ivi.show(fileName);
//                    found = true;
//                    break;
//                }
//            }
//            else break;
//        }
        for (int i = 0; i < pluginsCount; i++) {
            ImageViewerInterface ivi = plugins[i];
            if (ivi.getExtension().equals(ext)) {
                System.out.println("Using " + ivi.getName());
                ivi.show(fileName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Image viewer plugin for the extension, " + ext + ", is not registered");
        }
    }
}
