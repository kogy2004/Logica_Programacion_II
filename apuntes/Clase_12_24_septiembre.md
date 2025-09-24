# Clase 12 - 24 de septiembre

## Interfases

### Clases

* Jframe: Representa un ventana. contenedor superior
* JBotton: Representa un boton
* JTectFrield: Representa un campo de texto
* JLabel: Representa un etiqueta
* JCheckBox: Representa una casilla de verificación.
* JRadioButton: Representa un botón de opción.
* JComboBox: Representa un cuadro combinado.
* JList: Representa una lista.
* JTable: Representa una tabla.
* JTree: Representa un árbol.
* FlowLayout: Distribucion tipo flujo
* ActionListener: Accion por defecto

### Metodos

> Gui1.java

```java
package interfases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui1 extends JFrame {
    
    JButton botonCopiar;
    JTextField campoValor, resultado;
    
    public Gui1() {
        setLayout(new FlowLayout());
        add(new JLabel("valor "));
        campoValor = new JTextField(5);
        add(campoValor);
        botonCopiar = new JButton("copiar");
        add(botonCopiar);
        botonCopiar.addActionListener(new OyenteBoton());
        add(new JLabel(" Copia "));
        resultado = new JTextField(6);
        add(resultado);
        setSize(400, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Gui1 ventana = new Gui1();
    }
    
    class OyenteBoton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String valor = campoValor.getText();
            resultado.setText(valor);
        }
        
    }
}
```

> Gui2.java

```java
package interfases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui2 extends JFrame {

    JButton calcularSalario;
    JTextField nombreEmpleado, salarioEmpleado, porcentajeBonificacion, salarioTotal;

    public Gui2() {
        setLayout(new FlowLayout());
        add(new JLabel("Nombre del empleado: "));
        nombreEmpleado = new JTextField(7);
        add(nombreEmpleado);

        add(new JLabel("salario del empleado: "));
        salarioEmpleado = new JTextField(7);
        add(salarioEmpleado);

        add(new JLabel("Porcentaje de bonificacion: "));
        porcentajeBonificacion = new JTextField(7);
        add(porcentajeBonificacion);

        calcularSalario = new JButton("Calcular");
        add(calcularSalario);
        calcularSalario.addActionListener(new Gui2.calcular());
        

        add(new JLabel("Salario total: "));
        salarioTotal = new JTextField(7);
        add(salarioTotal);
        salarioTotal.setEditable(false);
        

        setSize(1000, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui2 ventana = new Gui2();
    }

    class calcular implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double salario = Double.parseDouble(salarioEmpleado.getText());
            double porcentaje = Double.parseDouble(porcentajeBonificacion.getText());
            double total = salario+salario*(porcentaje/100);
            salarioTotal.setText(String.valueOf(total));
        }
    }

}
```

> Gui3.java

```java
package interfases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui3 extends JFrame {

    JButton calcular;
    JTextField entrada1, entrada2, salida;
    JRadioButton suma, resta, multiplicacion, division;
    ButtonGroup grupobotones;

    public Gui3() {
        setLayout(new GridLayout(5, 2));

        entrada1 = new JTextField(7);
        add(entrada1);
        entrada2 = new JTextField(7);
        add(entrada2);

        add(new JLabel("Total: "));

        salida = new JTextField(7);
        add(salida);
        salida.setEditable(false);

        grupobotones = new ButtonGroup();
        suma = new JRadioButton("Suma");
        resta = new JRadioButton("Resta");
        multiplicacion = new JRadioButton("Multiplicacion");
        division = new JRadioButton("Division");

        grupobotones.add(suma);
        add(suma);
        grupobotones.add(resta);
        add(resta);
        grupobotones.add(multiplicacion);
        add(multiplicacion);
        grupobotones.add(division);
        add(division);

        calcular = new JButton("Calcular");
        add(calcular);
        calcular.addActionListener(new Gui3.calcularOperacion());

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora basica");

    }

    class calcularOperacion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (suma.isSelected()) salida.setText(String.valueOf(Double.parseDouble(entrada1.getText()) + Double.parseDouble(entrada2.getText())));
            
            if (resta.isSelected()) salida.setText(String.valueOf(Double.parseDouble(entrada1.getText()) - Double.parseDouble(entrada2.getText())));
            
            if (multiplicacion.isSelected()) salida.setText(String.valueOf(Double.parseDouble(entrada1.getText()) * Double.parseDouble(entrada2.getText())));
            
            if (division.isSelected()) salida.setText(String.valueOf(Double.parseDouble(entrada1.getText()) / Double.parseDouble(entrada2.getText())));
        }
    }

    public static void main(String[] args) {
        Gui3 ventana = new Gui3();
    }

}
```

> Gui4.java

```java
package interfases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui4 extends JFrame {

    JTextField nombre;
    JComboBox ciudades;

    public Gui4() {
        setLayout(new FlowLayout());

        add(new JLabel("Nombre: "));
        nombre = new JTextField(7);
        add(nombre);

        add(new JLabel("Ciudad: "));

        ciudades = new JComboBox();
        ciudades.addItem("Bogota");
        ciudades.addItem("Medellin");
        ciudades.addItem("Cali");
        ciudades.addItem("Barranquilla");
        ciudades.addItem("Bucaramanga");

        add(ciudades);
        ciudades.addActionListener(new Gui4.accion());
        
        
        setSize(350, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui4 ventana = new Gui4();
    }

    class accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null, nombre.getText()+" vive en "+ciudades.getSelectedItem().toString());
        }


    }
}
```
