package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class TimSoLonNhat2So extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTimMax;

    public TimSoLonNhat2So() {
        setTitle("Tìm số lớn nhất trong 2 số");
        setSize(320, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhập số thứ nhất
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(130, 30, 130, 25);
        add(txtSo1);

        // Nhập số thứ hai
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(130, 70, 130, 25);
        add(txtSo2);

        // Nút tìm số lớn nhất
        btnTimMax = new JButton("Tìm số lớn nhất");
        btnTimMax.setBounds(80, 110, 150, 30);
        add(btnTimMax);
        btnTimMax.addActionListener(this);

        // Kết quả
        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(130, 160, 130, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());

            double max = (so1 > so2) ? so1 : so2;
            txtKetQua.setText("Số lớn nhất là: " + max);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new TimSoLonNhat2So();
    }
}
