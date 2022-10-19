/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Christian
 */
public class Validaciones {

    public void txtCaracteres(KeyEvent evt) {
        char caract = evt.getKeyChar();
        if ((caract < 'a' || caract > 'z') && (caract < 'A' || caract > 'Z')
                && (caract != (char) KeyEvent.VK_BACK_SPACE) && (caract != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    public void txtnumeros (KeyEvent evt) {
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9') && (num != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public void txtDecimales(KeyEvent evt, JTextField textField) {
        char dec = evt.getKeyChar();
        if ((dec < '0' || dec > '9') && textField.getText().contains(".") && (dec != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if ((dec < '0' || dec > '9') && (dec != '.') && (dec != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

}
