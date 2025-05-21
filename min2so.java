package congtru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class min2so extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnTimMin;
    private JLabel lblKetQua;

    public min2so() {
        setTitle("Tìm số nhỏ nhất");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Thành phần giao diện
        panel.add(new JLabel("Nhập số thứ nhất:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập số thứ hai:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnTimMin = new JButton("Tìm số nhỏ nhất");
        panel.add(btnTimMin);

        lblKetQua = new JLabel("Kết quả hiển thị ở đây");
        panel.add(lblKetQua);

        // Sự kiện nút
        btnTimMin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    int min = Math.min(a, b);
                    lblKetQua.setText("Số nhỏ nhất là: " + min);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new min2so();
    }
}
