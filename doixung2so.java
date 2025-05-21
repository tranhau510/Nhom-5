package congtru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class doixung2so extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnKiemTra;
    private JLabel lblKetQua;

    public doixung2so() {
        setTitle("Kiểm tra số đối xứng");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Nhập số thứ nhất:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập số thứ hai:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnKiemTra = new JButton("Kiểm tra đối xứng");
        panel.add(btnKiemTra);

        lblKetQua = new JLabel("Kết quả sẽ hiển thị ở đây");
        panel.add(lblKetQua);

        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    boolean isADoiXung = laSoDoiXung(a);
                    boolean isBDoiXung = laSoDoiXung(b);

                    String ketQua = "Số " + a + (isADoiXung ? " là" : " không là") + " số đối xứng.\n";
                    ketQua += "Số " + b + (isBDoiXung ? " là" : " không là") + " số đối xứng.";

                    lblKetQua.setText("<html>" + ketQua.replace("\n", "<br>") + "</html>");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    // Hàm kiểm tra số đối xứng
    private boolean laSoDoiXung(int n) {
        int original = n;
        int daoNguoc = 0;

        while (n > 0) {
            daoNguoc = daoNguoc * 10 + n % 10;
            n /= 10;
        }

        return original == daoNguoc;
    }

    public static void main(String[] args) {
        new doixung2so();
    }
}
