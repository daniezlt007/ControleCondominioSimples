/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utilitarios;

import com.controle.view.FrmCadCondominio;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniel
 */
public class Formatados {
    
    private static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat DATEFORMATCOMPLETO = new SimpleDateFormat("dd/MM/yyyy -- HH:mm:ss");

    public boolean verificarSeEntradaENumeroInteger(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Nessa pesquisa informe um número.");
            return false;
        }
    }

    public boolean verificarSeEntradaENumeroDouble(String entrada) {
        try {
            Double.parseDouble(entrada);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Informe um número para preço.");
            return false;
        }
    }

    public String formatarValorDoubleParaString(Double valor) {
        String valorFinal = "";
        DecimalFormat nf = new DecimalFormat("0.00");
        valorFinal = nf.format(valor);
        return valorFinal;
    }

    public String dateParaDataEHora(Date cal) {
        //System.out.println(cal.getTime());
        return DATEFORMATCOMPLETO.format(cal.getTime());
    }

    public Double formatarValorStringParaDouble(String valor) {
        String valorFinal = valor.replace(",", ".");

        return Double.parseDouble(valorFinal);
    }
    
    public Integer formatarValorIntegerParaString(String valor){
        return Integer.parseInt(valor);
    }

    public String tirarAVirgulaDoValor(String valor) {
        String valorFinal = valor.replace(",", ".");

        return valorFinal;
    }
    
    public Double calcularDescontoICMS(Double porc, Double valor) {
        Double resultado = 0.0;
        resultado = valor - (valor * (porc / 100));
        return resultado;
    }

    public Calendar stringToCalendar(String data) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(DATEFORMAT.parse(data));
            return c;
        } catch (ParseException ex) {
            Logger.getLogger(Formatados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String calendarToString(Calendar cal) {
        return DATEFORMAT.format(cal.getTime());
    }

    public String pegarSenha(char[] pass) {
        String senha = "";
        for (int i = 0; i < pass.length; i++) {
            senha += pass[i];
        }
        return senha;
    }

    public static void abrirDialogCentralizado(JDialog dialog) {
        dialog.setLocation((dialog.getParent().getWidth() - dialog.getWidth()) / 2,
                (dialog.getParent().getHeight() - dialog.getHeight()) / 2);
        dialog.setVisible(true);
    }

    /*public boolean verificarSeUsuarioEOAdmin(Integer id) {
        Usuario user = new UsuarioDao().obterPorId(id);
        if (user.getLogin().equals("admin")) {
            return true;
        }
        return false;
    }*/

    public static String retData() {
        return new SimpleDateFormat("dd/MM/yyyy -- hh:mm:ss").format(new Date()).toString();
    }
    
    public static void mascara(JFormattedTextField j, String n){
        try {
            MaskFormatter s = new MaskFormatter(n);
            s.install(j);
        } catch (ParseException ex) {
            Logger.getLogger(FrmCadCondominio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
