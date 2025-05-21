package congtru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tru2so extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnTru;
    private JLabel lblKetQua;

    public tru2so() {
        setTitle("Trừ 2 số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        // Panel chứa các thành phần
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Các thành phần giao diện
        panel.add(new JLabel("Nhập số a:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập số b:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnTru = new JButton("Trừ");
        panel.add(btnTru);

        lblKetQua = new JLabel("Kết quả sẽ hiển thị ở đây");
        panel.add(lblKetQua);

        // Bắt sự kiện khi nhấn nút
        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int hieu = a - b;
                    lblKetQua.setText("Hiệu: " + hieu);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tru2so(); // Khởi chạy chương trình
    }
}
