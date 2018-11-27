import javax.swing.*;
public class Übung1 {
    public static void main(String[]args){
        String a= JOptionPane.showInputDialog(null,"Gib was ein.");
        switch (a) {
            case "Peter Pan":
                System.out.println("Bangarang");
                break;
            case 20:
                int b = Integer.valueOf(a);
                int alter=Integer.parseInt(JOptionPane.showInputDialog(null,"alter pls"));
                int antwort=(b*alter);
                JOptionPane.showMessageDialog(null,antwort);
                break;
            default:
                System.err.println("Dumb");
        }
    }
}
