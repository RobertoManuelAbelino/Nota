import java.util.*;
import javax.swing.*;
/**Declaracion de la clase Nota
 * @author Manuel Abelino Roberto : numControl 18161174
 * @version 1.0 
 * Realizar un programa que pueda crear notas, con titulo y cuerpo, asi como poder buscarlas por titulo o por su cuerpo
 */
public class Nota
{
    private String Titulo,Cuerpo;
    /**metodo main
     * metodo simple para poder correr el programa
     */
    public static void main(String args[]){
       Vector almacenamiento= new <Nota> Vector();
       
       int a = 0;
        do{
           a= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion deseada\n0.Salir\n1.Crear nueva nota\n2.Buscar nota por Titulo"+
            "\n3. Buscar nota por el cuerpo"));
            
           switch(a){
              case 0:
                JOptionPane.showMessageDialog(null, "Hasta la proximaaaa");
              break;
               case 1:
              String s = JOptionPane.showInputDialog("Ingresa el titulo de la nota");
              String d = JOptionPane.showInputDialog("Ingresa el cuerpo de la nota");
              Nota n = new Nota(s,d);
              almacenamiento.add(n);
              JOptionPane.showMessageDialog(null, "Nota Creada");
              break;
              case 2:
              String g = JOptionPane.showInputDialog("Ingresa caracteres a buscar");
              String resultado = "";
              for (int i=0 ; i<almacenamiento.size(); i++){
                  if(((Nota)almacenamiento.get(i)).getTitulo().toUpperCase().contains(g.toUpperCase()))
                     resultado += ((Nota)almacenamiento.get(i)).getTitulo()+"\n\n";
                }
                
                JTextArea j = new JTextArea(20,40);
                j.setEditable(false);
                JScrollPane scroll= new JScrollPane(j);
                j.append(resultado);
                JOptionPane.showMessageDialog(null, scroll);
              break;
              case 3:
              String r = JOptionPane.showInputDialog("Ingresa caracteres a buscar");
              String resultad = "";
              for (int i=0 ; i<almacenamiento.size(); i++){
                  if(((Nota)almacenamiento.get(i)).getCuerpo().toUpperCase().contains(r.toUpperCase()))
                     resultad += ((Nota)almacenamiento.get(i)).getCuerpo()+"\n\n";
                }
                JTextArea h = new JTextArea(20,40);
                h.setEditable(false);
                JScrollPane scrol= new JScrollPane(h);
                h.append(resultad);
                JOptionPane.showMessageDialog(null, scrol);
              break;
              default :
               JOptionPane.showMessageDialog(null, "No hay ninguna opcion con ese numero");
              break;
            }
           
        }while(a!=0);
    }
    /**costructor Nota
     * @param Titulo, Cuerpo los parametros que se necesitan son el Titulo y el cuerpo que son objetos String
     */
    private Nota(String  Titulo, String Cuerpo){
       setTitulo(Titulo);
       setCuerpo(Cuerpo);
    }
    /**metodo setTitulo
     * @param Titulo , Titulo es un objeto String , se definio este metodo por si en una version futura se pueda modificar el Titulo
     */
    private void setTitulo(String Titulo){
       this.Titulo = Titulo;
    }
    /** metodo setTitulo
     * @param Cuerpo, Cuerpo es un objeto String , se definio este metodo por si en una version futura se pueda modificar el cuerpo
     */
    private void setCuerpo(String Cuerpo){
       this.Cuerpo = Cuerpo;
    }
    /** metodo getTitulo
     * @return este metodo regresa el Titulo de la nota
     */
    private String getTitulo(){
       return Titulo;
    }
    /** metodo getCuerpo
     * @return este metod regresa el Cuerpo de la nota
     */
    private String getCuerpo(){
       return Cuerpo;
    }
    /** metodo mostrarNota
     * metodo que muestra la nota en un recuadro grafico con la clase swing
     */
    private void mostrarNota(){
       JOptionPane.showMessageDialog(null,getTitulo()+"\n"+getCuerpo());
    }
}