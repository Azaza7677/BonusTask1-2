public class CaesarChiTest {
    public static void main(String[] args) {
        CaesarChi chi = new CaesarChi(4);

        String originalText="Hello World";
        System.out.println("orig text: "+originalText);

        String enqryptedText= chi.enqrypt(originalText);
        System.out.println("ecryp text "+enqryptedText);

        String decryptedText= chi.decrypt(enqryptedText);
        System.out.println("deqryp text "+decryptedText);
    }
}
