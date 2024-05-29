package ex08.polling;

public class LotteMart {
    private String value = null;

    public String getValue() {
        return value;
    }

    // 상품 입고
    public void received(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value = "상품"; // 5초 뒤에 상품이 채워진다.
    }

}
