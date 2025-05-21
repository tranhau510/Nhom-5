package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class Gui_app extends JFrame implements ActionListener {
    // Khai báo các thành phần giao diện
    private JTextField txtSoDau, txtSoCuoi, txtThanhTien;
    private JButton btnTinh;

    public Gui_app() {
        setTitle("Tính Tiền Nước");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhãn và ô nhập Số đầu
        JLabel lblSoDau = new JLabel("Số đầu:");
        lblSoDau.setBounds(30, 30, 100, 25);
        add(lblSoDau);

        txtSoDau = new JTextField();
        txtSoDau.setBounds(120, 30, 120, 25);
        add(txtSoDau);

        // Nhãn và ô nhập Số cuối
        JLabel lblSoCuoi = new JLabel("Số cuối:");
        lblSoCuoi.setBounds(30, 70, 100, 25);
        add(lblSoCuoi);

        txtSoCuoi = new JTextField();
        txtSoCuoi.setBounds(120, 70, 120, 25);
        add(txtSoCuoi);

        // Nút tính tiền
        btnTinh = new JButton("Tính tiền");
        btnTinh.setBounds(90, 110, 100, 30);
        add(btnTinh);
        btnTinh.addActionListener(this);

        // Nhãn và ô hiển thị thành tiền
        JLabel lblThanhTien = new JLabel("Thành tiền:");
        lblThanhTien.setBounds(30, 160, 100, 25);
        add(lblThanhTien);

        txtThanhTien = new JTextField();
        txtThanhTien.setBounds(120, 160, 120, 25);
        txtThanhTien.setEditable(false); // không cho nhập
        add(txtThanhTien);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int soDau = Integer.parseInt(txtSoDau.getText());
            int soCuoi = Integer.parseInt(txtSoCuoi.getText());

            if (soCuoi > soDau) {
                JOptionPane.showMessageDialog(this, "Số cuối phải bé hơn số đầu");
                return;
            }

            int thanhTien = (soDau - soCuoi) * 10000;
            txtThanhTien.setText(String.valueOf(thanhTien));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new Gui_app();
    }
}
