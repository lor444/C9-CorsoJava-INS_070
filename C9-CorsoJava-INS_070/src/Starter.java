import it.corsojava.scontrino.Riga;
import it.corsojava.scontrino.tipidati.base.Percentuale;
import it.corsojava.scontrino.tipidati.specifici.Sconto;

import javax.net.ssl.SSLContext;

public class Starter {

    public static void main(String[] args) {
        TerminalUI ui = new TerminalUI();
        ScontrinoAgent agent=new ScontrinoAgent(ui);
        agent.run();
    }

}
