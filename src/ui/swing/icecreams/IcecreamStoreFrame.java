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
구운피스타치오 체리
시칠리안 레몬 소르베
샤인 머스캣 소르베
퍼지브라우니 밀크티
그레이스 모카칩
솔티 아몬드 브리틀
피치요거트
그린티 마일드

사이즈	맛	가격
싱글컵(100g)	1가지 맛	3,200원
싱글퀸컵(145g)	1가지 맛	4,200원
더블컵(190g)	2가지 맛	5,300원
트리플컵(300g)	3가지 맛	8,200원
멀티플컵(460g)	3가지 맛	12,000원
쿼트컵(620g)	4가지 맛	15,000원
파티컵(840g)	5가지 맛	20,000원
프랜즈컵(1000g)	6가지 맛	23,000원 
 */
public class IcecreamStoreFrame extends JFrame {
	
	public static final String[] ICE_NAMES = {
			"구운피스타치오 체리",
			"시칠리안 레몬 소르베",
			"샤인 머스캣 소르베",
			"퍼지브라우니 밀크티",
			"그레이스 모카칩",
			"솔티 아몬드 브리틀",
			"피치요거트",
			"그린티 마일드"	
	};
	
	public static final String[] ICE_BUNDLE_NAMES = {
		"싱글","더블","트리플","파티","프렌즈"	
	};
	
	public static final int[] ICE_BUNDLE_LIMITS = {
		1,2,3,5,8	
	};
	
	//
	JCheckBox[] cbFlavors; //아이스크림 8개
	JRadioButton[] rdBundles; //번들 5종
	JLabel lbTitle, lbStatus;
	JButton btnCheckout; //계산하기
	//장바구니??
	//
	
	//FONT
	public static final Font fntBIG = new Font("궁서",Font.BOLD, 30);
	public static final Font fntMIDIUM = new Font("굴림",Font.BOLD, 20);
	public static final Font fntSMALL = new Font("바탕", Font.BOLD, 19);
	
	
	
	public IcecreamStoreFrame() {
		super("나뚜루 ICECREAM STORE");
		setBounds(100,100,800,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기
		
		lbTitle = new JLabel("나뚜르");
		lbTitle.setFont(fntBIG);
		lbTitle.setHorizontalAlignment(JLabel.CENTER);
		lbStatus = new JLabel();
		lbStatus.setFont(fntMIDIUM);
		
		JPanel pnCenter = new JPanel(new BorderLayout(15, 15));
		pnCenter.setBackground(new Color(166, 215, 219)); // '칼라질라'로 확인
		
		JPanel pnBundles = new JPanel();
		pnBundles.setBorder(new LineBorder(Color.pink,2, true));
		
		pnBundles.setBackground(Color.gray);
		this.rdBundles = new JRadioButton[5];
		for (int i = 0; i < rdBundles.length; i++) {
			JRadioButton rd = new JRadioButton(ICE_BUNDLE_NAMES[i]);
			rd.setToolTipText(ICE_BUNDLE_LIMITS[i] + "가지 맛!");
			pnBundles.add(rd);
		}
		
		
		
		
		
		

	btnCheckout = new JButton("아이스크림 주문하기!");
		
		
	}
	
	
	
}
