/**
 * This class plays with characters' ASCII code
 */
public class CharacterASCIICode {
    public static void main(String[] args) {
        System.out.printf("%1$d,%X%n",(int)'A');//前面是10进制，后面16
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'B');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'C');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'a');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'b');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'c');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'0');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'$');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'*');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'+');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)'/');
        System.out.printf("%1$c 's ASCII code is %d%n",(int)' ');//here the character is a blank space

    }
}
