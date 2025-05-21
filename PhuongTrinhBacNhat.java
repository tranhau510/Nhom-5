package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class PhuongTrinhBacNhat extends JFrame implements ActionListener {
    private JTextField txtA, txtB, txtKetQua;
    private JButton btnGiai;

    public PhuongTrinhBacNhat() {
        setTitle("Giải phương trình bậc nhất: ax + b = 0");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Label và TextField cho hệ số a
        JLabel lblA = new JLabel("Hệ số a:");
        lblA.setBounds(30, 30, 100, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(130, 30, 150, 25);
        add(txtA);

        // Label và TextField cho hệ số b
        JLabel lblB = new JLabel("Hệ số b:");
        lblB.setBounds(30, 70, 100, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(130, 70, 150, 25);
        add(txtB);

        // Nút giải
        btnGiai = new JButton("Giải");
        btnGiai.setBounds(100, 110, 100, 30);
        add(btnGiai);
        btnGiai.addActionListener(this);

        // Label và TextField cho kết quả
        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(130, 160, 150, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());

            String ketQua;
            if (a == 0) {
                if (b == 0) {
                    ketQua = "Phương trình vô số nghiệm";
                } else {
                    ketQua = "Phương trình vô nghiệm";
                }
            } else {
                double x = -b / a;
                ketQua = "x = " + x;
            }

            txtKetQua.setText(ketQua);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new PhuongTrinhBacNhat();
    }
}
