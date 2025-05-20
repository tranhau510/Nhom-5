package MinhTriet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
	  private JTextField txtA, txtB, txtKetQua;
	    private JButton btnTinh;
	    
	    public Test (){
	    	setTitle("Cộng hai số a + b");
	        setSize(300, 200);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // căn giữa cửa sổ

	        // Tạo các thành phần
	        JLabel lblA = new JLabel("Nhập a:");
	        JLabel lblB = new JLabel("Nhập b:");
	        JLabel lblKetQua = new JLabel("Kết quả:");

	        txtA = new JTextField(10);
	        txtB = new JTextField(10);
	        txtKetQua = new JTextField(10);
	        txtKetQua.setEditable(false); // không cho sửa kết quả

	        btnTinh = new JButton("Tính tổng");

	        // Thêm sự kiện cho nút
	        btnTinh.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double a = Double.parseDouble(txtA.getText());
	                    double b = Double.parseDouble(txtB.getText());
	                    double tong = a + b;
	                    txtKetQua.setText(String.valueOf(tong));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        // Sắp xếp giao diện
	        setLayout(new GridLayout(4, 2, 5, 5));
	        add(lblA); add(txtA);
	        add(lblB); add(txtB);
	        add(lblKetQua); add(txtKetQua);
	        add(new JLabel()); add(btnTinh); // trống 1 ô để canh phải nút

	        setVisible(true);
	    }
	    
	    public static void main(String[] args) {
			new Test();
		}
}
