// fichero Ejemplo1.java
import java.util.ArrayList;
import java.awt.*;
class Ejemplo1 {
public static void main(String arg[]) throws InterruptedException
{
System.out.println("Generador de circulos");
Circulo c = new Circulo(5.0, 5.0, 5.0);
System.out.println("El radio es: " + c.r + " unidades de medida.");
 System.out.println("El centro es: (" + c.x + "," + c.y + ") unidades de medida.");
 Circulo c1 = new Circulo(5.0, 5.0, 5.0);
 Circulo c2 = new Circulo(0.0, 0.0, 5.0);
 c = c1.elMayor(c2);
 System.out.println("El mayor radio es " + c.r + ".");
 c = new Circulo(); // c.r = 0.0;
 c = Circulo.elMayor(c1, c2);
 System.out.println("El mayor radio es " + c.r + ".");
 VentanaCerrable ventana =
 new VentanaCerrable("Programa David Millan");
 ArrayList v = new ArrayList();
 CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.black);
 CirculoGrafico cg2 = new CirculoGrafico(300, 200, 100, Color.red);
 RectanguloGrafico rg = new
 RectanguloGrafico(50, 50, 450, 350, Color.darkGray);
 v.add(cg1);
 v.add(cg2);
 v.add(rg);
 PanelDibujo mipanel = new PanelDibujo(v);
 ventana.add(mipanel);
 ventana.setSize(500, 400);
 ventana.setVisible(true);
 System.out.println("Aqui termina este programa");
 } // fin de main()
 } // fin de class Ejemplo1
