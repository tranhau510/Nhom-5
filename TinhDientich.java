package MinhTriet;

import javax.swing.*;
import java.awt.event.*;

public class TinhDientich extends JFrame implements ActionListener {
    private JTextField txtChieuDai, txtChieuRong, txtDienTich;
    private JButton btnTinh;

    public TinhDientich() {
        setTitle("Tính Diện Tích Hình Chữ Nhật");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Nhãn và ô nhập chiều dài
        JLabel lblChieuDai = new JLabel("Chiều dài:");
        lblChieuDai.setBounds(30, 30, 100, 25);
        add(lblChieuDai);

        txtChieuDai = new JTextField();
        txtChieuDai.setBounds(140, 30, 150, 25);
        add(txtChieuDai);

        // Nhãn và ô nhập chiều rộng
        JLabel lblChieuRong = new JLabel("Chiều rộng:");
        lblChieuRong.setBounds(30, 70, 100, 25);
        add(lblChieuRong);

        txtChieuRong = new JTextField();
        txtChieuRong.setBounds(140, 70, 150, 25);
        add(txtChieuRong);

        // Nút tính diện tích
        btnTinh = new JButton("Tính diện tích");
        btnTinh.setBounds(100, 110, 140, 30);
        add(btnTinh);
        btnTinh.addActionListener(this);

        // Nhãn và ô hiển thị diện tích
        JLabel lblDienTich = new JLabel("Diện tích:");
        lblDienTich.setBounds(30, 160, 100, 25);
        add(lblDienTich);

        txtDienTich = new JTextField();
        txtDienTich.setBounds(140, 160, 150, 25);
        txtDienTich.setEditable(false);
        add(txtDienTich);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double chieuDai = Double.parseDouble(txtChieuDai.getText());
            double chieuRong = Double.parseDouble(txtChieuRong.getText());

            if (chieuDai <= 0 || chieuRong <= 0) {
                JOptionPane.showMessageDialog(this, "Chiều dài và chiều rộng phải > 0");
                return;
            }

            double dienTich = chieuDai * chieuRong;
            txtDienTich.setText(String.valueOf(dienTich));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        new TinhDientich();
    }
}

