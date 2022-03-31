/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedro.ieslaencanta.com.dawgoogle;

import asg.cliche.Command;
import asg.cliche.Shell;
import asg.cliche.ShellDependent;
import asg.cliche.ShellFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Pedro
 */
public class Principal implements ShellDependent {

    /**
     * @param args the command line arguments
     */
    private Shell shell;

    public Principal() {

    }

    public void process(String texto, String url) {

        List<String> lineas = texto.lines().toList();
        Iterator<String> it = lineas.iterator();
        while (it.hasNext()) {
            StringTokenizer st = new StringTokenizer(it.next());
            String palabra;
            while (st.hasMoreTokens()) {
                palabra = st.nextToken();
                //se van anyadiendo las entradas a la estructura seleccionada
            }
        }
    }

    @Command
    public void addPage(String url) throws IOException {
       
       
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
        String web_text = doc.body().text();
        this.process(web_text, url);
       }

    @Command
    public String findPage(String query) {
        return "";
    }

    @Command
    public String findWord(String key) {
        StringBuilder sb;
        
            return "vacio";
      
    }

    @Command
    public String listPages() {
        StringBuilder sb = new StringBuilder();
       
        return sb.toString();
    }

    @Command
    public void removePage(String url) {
    }

    public static void main(String[] args) throws IOException {

        ShellFactory.createConsoleShell("DAW>", "?list' to list all commands\"", new Principal())
                .commandLoop();
    }

    @Override
    public void cliSetShell(Shell shell) {
        this.shell = shell;
    }

}
