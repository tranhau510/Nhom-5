package congtru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cong2so extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnCong;
    private JLabel lblKetQua;

    public cong2so() {
        setTitle("Cộng 2 số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        // Tạo panel chứa các thành phần
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Các thành phần giao diện
        panel.add(new JLabel("Nhập số a:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập số b:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnCong = new JButton("Cộng");
        panel.add(btnCong);

        lblKetQua = new JLabel("Kết quả sẽ hiển thị ở đây");
        panel.add(lblKetQua);

        // Bắt sự kiện khi bấm nút
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int tong = a + b;
                    lblKetQua.setText("Tổng: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm panel vào cửa sổ
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new cong2so(); // Khởi động ứng dụng
    }
}

