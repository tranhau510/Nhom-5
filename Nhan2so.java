package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class Nhan2so extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnNhan;

    public Nhan2so() {
        setTitle("Nhân 2 Số");
        setSize(300, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhãn và ô nhập số 1
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(130, 30, 120, 25);
        add(txtSo1);

        // Nhãn và ô nhập số 2
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(130, 70, 120, 25);
        add(txtSo2);

        // Nút nhân
        btnNhan = new JButton("Nhân");
        btnNhan.setBounds(90, 110, 100, 30);
        add(btnNhan);
        btnNhan.addActionListener(this);

        // Nhãn và ô hiển thị kết quả
        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(130, 160, 120, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());
            double ketQua = so1 * so2;
            txtKetQua.setText(String.valueOf(ketQua));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new Nhan2so();
    }
}
