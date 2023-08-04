/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author David
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame {

    private JTextField numeroUno;
    private JTextField numeroDos;
    private JTextField Operador;
    private JTextField Resultado;

    private double primerNumero;
    private double segundoNumero;
    private String operadorActual;
    private double resultadoFinal;

    public calcu() {
        // Configuración de la ventana principal
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal que contiene todo el contenido
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());

        // Panel para los campos de texto
        JPanel txt = new JPanel();
        txt.setLayout(new GridLayout(1, 4));
        numeroUno = new JTextField(20);
        numeroUno.setText("0");
        numeroUno.setFont(new Font("Arial", Font.PLAIN, 40));
        numeroUno.setHorizontalAlignment(JTextField.RIGHT);

        numeroDos = new JTextField(20);
        numeroDos.setText("0");
        numeroDos.setFont(new Font("Arial", Font.PLAIN, 40));
        numeroDos.setHorizontalAlignment(JTextField.RIGHT);

        Operador = new JTextField(5);
        Operador.setText(" ");
        Operador.setEditable(false);
        Operador.setFont(new Font("Arial", Font.PLAIN, 40));
        Operador.setHorizontalAlignment(JTextField.RIGHT);

        Resultado = new JTextField(20);
        Resultado.setText(" ");
        Resultado.setEditable(false);
        Resultado.setFont(new Font("Arial", Font.PLAIN, 40));
        Resultado.setHorizontalAlignment(JTextField.RIGHT);

        txt.add(numeroUno);
        txt.add(Operador);
        txt.add(numeroDos);
        txt.add(Box.createHorizontalGlue());
        txt.add(Resultado);

        // Panel para los botones
        JPanel panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3, 5, 5));

        JButton boton0 = new JButton("0");
        boton0.setFont(new Font("Arial", Font.BOLD, 60));
        boton0.setBackground(new Color(144, 238, 144));
        boton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "0");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "0");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("0");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

        JButton boton1 = new JButton("1");
        boton1.setFont(new Font("Arial", Font.BOLD, 60));
        boton1.setBackground(new Color(144, 238, 144));
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "1");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "1");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("1");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

        JButton boton2 = new JButton("2");
        boton2.setFont(new Font("Arial", Font.BOLD, 60));
        boton2.setBackground(new Color(144, 238, 144));
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "2");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "2");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("2");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

        // Botón 3
        JButton boton3 = new JButton("3");
        boton3.setFont(new Font("Arial", Font.BOLD, 60));
        boton3.setBackground(new Color(144, 238, 144));
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "3");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "3");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("3");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

// Botón 4
        JButton boton4 = new JButton("4");
        boton4.setFont(new Font("Arial", Font.BOLD, 60));
        boton4.setBackground(new Color(144, 238, 144));
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "4");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "4");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("4");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

        // Botón 5
        JButton boton5 = new JButton("5");
        boton5.setFont(new Font("Arial", Font.BOLD, 60));
        boton5.setBackground(new Color(144, 238, 144));
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "5");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "5");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("5");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

// Botón 6
        JButton boton6 = new JButton("6");
        boton6.setFont(new Font("Arial", Font.BOLD, 60));
        boton6.setBackground(new Color(144, 238, 144));
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "6");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "6");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("6");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

// Botón 7
        JButton boton7 = new JButton("7");
        boton7.setFont(new Font("Arial", Font.BOLD, 60));
        boton7.setBackground(new Color(144, 238, 144));
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "7");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "7");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("7");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

// Botón 8
        JButton boton8 = new JButton("8");
        boton8.setFont(new Font("Arial", Font.BOLD, 60));
        boton8.setBackground(new Color(144, 238, 144));
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "8");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "8");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("8");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

// Botón 9
        JButton boton9 = new JButton("9");
        boton9.setFont(new Font("Arial", Font.BOLD, 60));
        boton9.setBackground(new Color(144, 238, 144));
        boton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals(" ")) {
                    String textoOperador = Operador.getText();
                    if (esOperador(textoOperador)) {
                        numeroDos.setText(numeroDos.getText() + "9");
                        segundoNumero = Double.parseDouble(numeroDos.getText());
                    } else {
                        numeroUno.setText(numeroUno.getText() + "9");
                        primerNumero = Double.parseDouble(numeroUno.getText());
                    }
                } else {
                    Resultado.setText(" ");
                    numeroUno.setText("9");
                    Operador.setText(" ");
                    numeroDos.setText(" ");
                }
            }
        });

        // Botón reset
        JButton botonReset = new JButton("C");
        botonReset.setFont(new Font("Arial", Font.BOLD, 60));
        botonReset.setBackground(new Color(144, 238, 144));
        botonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numeroUno.setText(" ");
                primerNumero = 0;
                numeroDos.setText(" ");
                segundoNumero = 0;
                Operador.setText(" ");
                operadorActual = (" ");
                Resultado.setText(" ");
                resultadoFinal = 0;
            }
        });

        // Botón Salir
        JButton botonExit = new JButton("Salir");
        botonExit.setFont(new Font("Arial", Font.BOLD, 60));
        botonExit.setBackground(new Color(144, 238, 144));
        botonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });

        panelNumeros.add(boton1);
        panelNumeros.add(boton2);
        panelNumeros.add(boton3);
        panelNumeros.add(boton4);
        panelNumeros.add(boton5);
        panelNumeros.add(boton6);
        panelNumeros.add(boton7);
        panelNumeros.add(boton8);
        panelNumeros.add(boton9);
        panelNumeros.add(botonExit);
        panelNumeros.add(boton0);
        panelNumeros.add(botonReset);

        JPanel panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(4, 2, 5, 5));

        // Botón Suma (+)
        JButton botonSuma = new JButton("+");
        botonSuma.setFont(new Font("Arial", Font.BOLD, 60));
        botonSuma.setBackground(new Color(144, 238, 144));
        botonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals("Error")) {
                    JOptionPane.showMessageDialog(null, "Para continuar, pulsa el botón C", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else if (!Resultado.getText().equals(" ")) {
                    numeroUno.setText(Resultado.getText());
                    primerNumero = Double.parseDouble(numeroUno.getText());
                    numeroDos.setText(" ");
                    segundoNumero = 0;
                    Operador.setText("+");
                    Resultado.setText(" ");
                } else {
                    Operador.setText("+");
                }
                operadorActual = "+";
            }
        });

// Botón Resta (-)
        JButton botonResta = new JButton("-");
        botonResta.setFont(new Font("Arial", Font.BOLD, 60));
        botonResta.setBackground(new Color(144, 238, 144));
        botonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals("Error")) {
                    JOptionPane.showMessageDialog(null, "Para continuar, pulsa el botón C", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else if (!Resultado.getText().equals(" ")) {
                    numeroUno.setText(Resultado.getText());
                    primerNumero = Double.parseDouble(numeroUno.getText());
                    numeroDos.setText(" ");
                    segundoNumero = 0;
                    Operador.setText("-");
                    Resultado.setText(" ");
                } else {
                    Operador.setText("-");
                }
                operadorActual = "-";
            }
        });

// Botón Multiplicación (*)
        JButton botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setFont(new Font("Arial", Font.BOLD, 60));
        botonMultiplicacion.setBackground(new Color(144, 238, 144));
        botonMultiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals("Error")) {
                    JOptionPane.showMessageDialog(null, "Para continuar, pulsa el botón C", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else if (!Resultado.getText().equals(" ")) {
                    numeroUno.setText(Resultado.getText());
                    primerNumero = Double.parseDouble(numeroUno.getText());
                    numeroDos.setText(" ");
                    segundoNumero = 0;
                    Operador.setText("*");
                    Resultado.setText(" ");
                } else {
                    Operador.setText("*");
                }
                operadorActual = "*";
            }
        });

// Botón División (/)
        JButton botonDivision = new JButton("/");
        botonDivision.setFont(new Font("Arial", Font.BOLD, 60));
        botonDivision.setBackground(new Color(144, 238, 144));
        botonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals("Error")) {
                    JOptionPane.showMessageDialog(null, "Para continuar, pulsa el botón C", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else if (!Resultado.getText().equals(" ")) {
                    numeroUno.setText(Resultado.getText());
                    primerNumero = Double.parseDouble(numeroUno.getText());
                    numeroDos.setText(" ");
                    segundoNumero = 0;
                    Operador.setText("/");
                    Resultado.setText(" ");
                } else {
                    Operador.setText("/");
                }
                operadorActual = "/";
            }
        });

        // Botón Igual (=)
        JButton botonIgual = new JButton("=");
        botonIgual.setFont(new Font("Arial", Font.BOLD, 60));
        botonIgual.setBackground(new Color(211, 211, 211));
        botonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Resultado.getText().equals("Error")) {
                    JOptionPane.showMessageDialog(null, "Para continuar, pulsa el botón C", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    switch (operadorActual) {
                        case "+":
                            resultadoFinal = primerNumero + segundoNumero;
                            Resultado.setText(Double.toString(resultadoFinal));
                            primerNumero = 0;
                            numeroUno.setText(" ");
                            segundoNumero = 0;
                            numeroDos.setText(" ");
                            Operador.setText(" ");
                            break;
                        case "-":
                            resultadoFinal = primerNumero - segundoNumero;
                            Resultado.setText(Double.toString(resultadoFinal));
                            primerNumero = 0;
                            numeroUno.setText(" ");
                            segundoNumero = 0;
                            numeroDos.setText(" ");
                            Operador.setText(" ");
                            break;
                        case "*":
                            resultadoFinal = primerNumero * segundoNumero;
                            Resultado.setText(Double.toString(resultadoFinal));
                            primerNumero = 0;
                            segundoNumero = 0;
                            break;
                        case "/":
                            segundoNumero = Double.parseDouble(numeroDos.getText());
                            if (segundoNumero == 0) {
                                Resultado.setText("Error");
                                primerNumero = 0;
                                numeroUno.setText(" ");
                                segundoNumero = 0;
                                numeroDos.setText(" ");
                                Operador.setText(" ");
                            } else {
                                resultadoFinal = primerNumero / segundoNumero;
                                Resultado.setText(Double.toString(resultadoFinal));
                                primerNumero = 0;
                                numeroUno.setText(" ");
                                segundoNumero = 0;
                                numeroDos.setText(" ");
                                Operador.setText(" ");
                            }
                            break;
                        default:
                            resultadoFinal = 0;
                            Resultado.setText(" ");
                            primerNumero = 0;
                            numeroUno.setText(" ");
                            segundoNumero = 0;
                            numeroDos.setText(" ");
                            Operador.setText(" ");
                            Resultado.setText(Double.toString(resultadoFinal));
                            break;
                    }
                }
            }
        });

        panelOperaciones.add(botonSuma);
        panelOperaciones.add(botonResta);
        panelOperaciones.add(botonMultiplicacion);
        panelOperaciones.add(botonDivision);
        panelOperaciones.add(botonIgual);

        // Agregar el panelBotones y el txt al contenedor principal
        contenedor.add(txt, BorderLayout.NORTH);
        contenedor.add(panelNumeros, BorderLayout.WEST);
        contenedor.add(panelOperaciones, BorderLayout.EAST);

        // Establecer el contenido del JFrame y mostrar la ventana
        setContentPane(contenedor);
        pack();
        setVisible(true);
    }

    // Método para verificar si el texto es un operador (+, -, *, /)
    private boolean esOperador(String texto) {
        return texto.equals("+") || texto.equals("-") || texto.equals("*") || texto.equals("/");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                calcu calcu = new calcu();
            }
        });
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
