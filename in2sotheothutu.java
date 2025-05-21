package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class in2sotheothutu extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnSapXep;

    public in2sotheothutu() {
        setTitle("Sắp xếp 2 số theo thứ tự tăng dần");
        setSize(330, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhãn và ô nhập số thứ nhất
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(130, 30, 150, 25);
        add(txtSo1);

        // Nhãn và ô nhập số thứ hai
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(130, 70, 150, 25);
        add(txtSo2);

        // Nút sắp xếp
        btnSapXep = new JButton("Sắp xếp tăng dần");
        btnSapXep.setBounds(80, 110, 160, 30);
        add(btnSapXep);
        btnSapXep.addActionListener(this);

        // Nhãn và ô kết quả
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
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            String ketQua = (so1 < so2) ? so1 + ", " + so2 : so2 + ", " + so1;
            txtKetQua.setText(ketQua);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new in2sotheothutu();
    }
}
