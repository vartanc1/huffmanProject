import java.util.Scanner;

public class HuffmanTree {

    /*Write a program to implement Huffman coding and decoding. It should do the following:

        Accept a text message.
        Create a Huffman tree for this message.
        Create a code table.
        Encode the message into binary and display it to Console
        Decode the message from binary back to text and display decoded message to Console
 
    */
    static char[] UpperCaseAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    static char[] LowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text_msg = "";
        Tree tree = new Tree();
        
        System.out.println("Enter text message");
        text_msg = input.nextLine();
        char[] message = new char[text_msg.length()];

        for(int i= 0; i < text_msg.length();++i){
            message[i] = text_msg.charAt(i);
            System.out.println(message[i]);
        }

        for(int i  = 0; i < UpperCaseAlphabet.length;++i){
            if(text_msg.charAt(i) == UpperCaseAlphabet[i] )
        tree.insert(50, "A");
        tree.insert(51,"B");

        }
        

        PriorityQ queue = new PriorityQ(text_msg.length());
        
        tree.print();
        

    }
}
