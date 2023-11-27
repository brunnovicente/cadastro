
package cadastro;

import janelas.JanelaPrincipal;
import javax.swing.JFrame;
import modelo.Banco;
import modelo.Cliente;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        Cliente c1 = new Cliente("Otavio", "otavio@gmail.com", "569595959");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com", "959595995");
        Cliente c3 = new Cliente("Matheus", "matheus@gmail.com", "9393993");
        banco.cadastrar(c1);
        banco.cadastrar(c2);
        banco.cadastrar(c3);
        banco.imprimir();
        System.out.println("");
        
        JanelaPrincipal principal = new JanelaPrincipal(banco);
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }//Fim do main
    
}
