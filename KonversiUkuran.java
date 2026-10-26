import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KonversiUkuran implements ActionListener, KeyListener {

    JFrame frame = new JFrame("Pengubah Satuan");
    JTextField txtInput = new JTextField(10);
    JTextField txtHasil = new JTextField(10);
    String[] satuan = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
    JComboBox<String> cbAsal = new JComboBox<>(satuan);
    JComboBox<String> cbTujuan = new JComboBox<>(satuan);
    JButton btnConvert = new JButton("Convert");

    public KonversiUkuran() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 170);
        frame.setLocationRelativeTo(null);
                                     
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JLabel("Asal:"));
        p1.add(txtInput);
        p1.add(cbAsal);

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JLabel("Tujuan:"));
        p2.add(txtHasil);
        p2.add(cbTujuan);

        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(btnConvert);

        txtHasil.setEditable(false);

        btnConvert.addActionListener(this);
        txtInput.addKeyListener(this);

        frame.setLayout(new GridLayout(3, 1));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        frame.setVisible(true);
    }

    void hitung() {
        try {
            double nilai = Double.parseDouble(txtInput.getText());
            int langkah = cbTujuan.getSelectedIndex() - cbAsal.getSelectedIndex();
            double hasil = nilai * Math.pow(10, langkah);

            if (hasil % 1 == 0 && Math.abs(hasil) < 1e12) {
                txtHasil.setText(String.valueOf((long) hasil));
            } else {
                txtHasil.setText(String.valueOf(hasil));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hitung();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            hitung();
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KonversiUkuran();
    }
}