package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class UCLN_2so extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTinh;

    public UCLN_2so() {
        setTitle("Tìm ƯCLN của 2 số");
        setSize(320, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhãn và ô nhập số 1
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(130, 30, 130, 25);
        add(txtSo1);

        // Nhãn và ô nhập số 2
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(130, 70, 130, 25);
        add(txtSo2);

        // Nút tính ƯCLN
        btnTinh = new JButton("Tìm ƯCLN");
        btnTinh.setBounds(90, 110, 120, 30);
        add(btnTinh);
        btnTinh.addActionListener(this);

        // Nhãn và ô kết quả
        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(130, 160, 130, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        setVisible(true);
    }

    // Hàm tìm ƯCLN bằng thuật toán Euclid
    private int ucln(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a); // trả về số dương
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            int kq = ucln(so1, so2);
            txtKetQua.setText("ƯCLN là: " + kq);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new UCLN_2so();
    }
}
