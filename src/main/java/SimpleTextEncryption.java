import org.jasypt.util.text.BasicTextEncryptor;

public class SimpleTextEncryption {
    public static void main(String[] args) {
        BasicTextEncryptor basicTextEncryptor=new BasicTextEncryptor();
        basicTextEncryptor.setPasswordCharArray("PRIVATE_KEY".toCharArray());
        String message="Hello Mohamed";
        String encryptedMessage=basicTextEncryptor.encrypt(message);
        System.out.println(encryptedMessage);
        String decryptedMessage=basicTextEncryptor.decrypt(encryptedMessage);
        System.out.println(decryptedMessage);

    }
}
