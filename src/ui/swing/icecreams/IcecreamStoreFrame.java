package ui.swing.icecreams;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
/*
�����ǽ�Ÿġ�� ü��
��ĥ���� ���� �Ҹ���
���� �ӽ�Ĺ �Ҹ���
��������� ��ũƼ
�׷��̽� ��īĨ
��Ƽ �Ƹ�� �긮Ʋ
��ġ���Ʈ
�׸�Ƽ ���ϵ�

������	��	����
�̱���(100g)	1���� ��	3,200��
�̱�����(145g)	1���� ��	4,200��
������(190g)	2���� ��	5,300��
Ʈ������(300g)	3���� ��	8,200��
��Ƽ����(460g)	3���� ��	12,000��
��Ʈ��(620g)	4���� ��	15,000��
��Ƽ��(840g)	5���� ��	20,000��
��������(1000g)	6���� ��	23,000�� 
 */
public class IcecreamStoreFrame extends JFrame {
	
	public static final String[] ICE_NAMES = {
			"�����ǽ�Ÿġ�� ü��",
			"��ĥ���� ���� �Ҹ���",
			"���� �ӽ�Ĺ �Ҹ���",
			"��������� ��ũƼ",
			"�׷��̽� ��īĨ",
			"��Ƽ �Ƹ�� �긮Ʋ",
			"��ġ���Ʈ",
			"�׸�Ƽ ���ϵ�"	
	};
	
	public static final String[] ICE_BUNDLE_NAMES = {
		"�̱�","����","Ʈ����","��Ƽ","������"	
	};
	
	public static final int[] ICE_BUNDLE_LIMITS = {
		1,2,3,5,8	
	};
	
	//
	JCheckBox[] cbFlavors; //���̽�ũ�� 8��
	JRadioButton[] rdBundles; //���� 5��
	JLabel lbTitle, lbStatus;
	JButton btnCheckout; //����ϱ�
	//��ٱ���??
	//
	
	//FONT
	public static final Font fntBIG = new Font("�ü�",Font.BOLD, 30);
	public static final Font fntMIDIUM = new Font("����",Font.BOLD, 20);
	public static final Font fntSMALL = new Font("����", Font.BOLD, 19);
	
	
	
	public IcecreamStoreFrame() {
		super("���ѷ� ICECREAM STORE");
		setBounds(100,100,800,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ�
		
		lbTitle = new JLabel("���Ѹ�");
		lbTitle.setFont(fntBIG);
		lbTitle.setHorizontalAlignment(JLabel.CENTER);
		lbStatus = new JLabel();
		lbStatus.setFont(fntMIDIUM);
		
		JPanel pnCenter = new JPanel(new BorderLayout(15, 15));
		pnCenter.setBackground(new Color(166, 215, 219)); // 'Į������'�� Ȯ��
		
		JPanel pnBundles = new JPanel();
		pnBundles.setBorder(new LineBorder(Color.pink,2, true));
		
		pnBundles.setBackground(Color.gray);
		this.rdBundles = new JRadioButton[5];
		for (int i = 0; i < rdBundles.length; i++) {
			JRadioButton rd = new JRadioButton(ICE_BUNDLE_NAMES[i]);
			rd.setToolTipText(ICE_BUNDLE_LIMITS[i] + "���� ��!");
			pnBundles.add(rd);
		}
		
		
		
		
		
		

	btnCheckout = new JButton("���̽�ũ�� �ֹ��ϱ�!");
		
		
	}
	
	
	
}
