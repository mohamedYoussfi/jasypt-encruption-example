import org.jasypt.util.password.StrongPasswordEncryptor;

public class UniDirectionalEncryption {
    public static void main(String[] args) {
        StrongPasswordEncryptor passwordEncryptor=new StrongPasswordEncryptor();
        String password="med@1234";
        String encryptedPassword=passwordEncryptor.encryptPassword(password);
        System.out.println(encryptedPassword);
        String inputPassword="med@1234";
        if(passwordEncryptor.checkPassword(inputPassword,encryptedPassword)){
            System.out.println("Password Matched");
        } else {
            System.out.println("Password Not Matched");
        }
    }
}
