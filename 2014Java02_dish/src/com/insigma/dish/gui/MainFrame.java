/*
 * MainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.insigma.dish.gui;

import java.beans.PropertyVetoException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.skin.SubstanceFieldOfWheatLookAndFeel;

import com.insigma.dish.pojo.EmployeInfo;
import com.insigma.dish.util.Utils;

/**
 *
 * @author  __USER__
 */
public class MainFrame extends javax.swing.JFrame {

	/** Creates new form MainFrame */
	public MainFrame() {
		initComponents();
		setLocationRelativeTo(null);
		Utils.setTitleImage(this);
	}

	public MainFrame(EmployeInfo emp) {
		this();
		this.emp = emp;
		init();
	}

	private void init() {
		jLabelName.setText(emp.getName());
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jToolBar1 = new javax.swing.JToolBar();
		jButtonAddOrder = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JToolBar.Separator();
		jButtonQryOrder = new javax.swing.JButton();
		jSeparator4 = new javax.swing.JToolBar.Separator();
		jButtonInitTable = new javax.swing.JButton();
		jSplitPane1 = new javax.swing.JSplitPane();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabelName = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabelName1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jDesktopPane1 = new javax.swing.JDesktopPane();
		jSeparator2 = new javax.swing.JSeparator();
		jSeparator3 = new javax.swing.JSeparator();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuOrderAdd = new javax.swing.JMenuItem();
		jMenuOrderQry = new javax.swing.JMenuItem();
		jMenuTableInit = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuDishAdd = new javax.swing.JMenuItem();
		jMenuDishManage = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuEmpAdd = new javax.swing.JMenuItem();
		jMenuEmpQry = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuPurviewSort = new javax.swing.JMenuItem();
		jMenuPurviewAssign = new javax.swing.JMenuItem();
		jMenu6 = new javax.swing.JMenu();
		jMenuYearStatistics = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu7 = new javax.swing.JMenu();
		jMenuPassModify = new javax.swing.JMenuItem();
		jMenuSelfModify = new javax.swing.JMenuItem();
		jMenuExit = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuAbout = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u722a\u54c72\u70b9\u9910\u7cfb\u7edf");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jToolBar1.setRollover(true);

		jButtonAddOrder
				.setIcon(new javax.swing.ImageIcon(
						getClass()
								.getResource(
										"/javax/swing/plaf/metal/icons/ocean/iconify-pressed.gif"))); // NOI18N
		jButtonAddOrder.setFocusable(false);
		jButtonAddOrder
				.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonAddOrder
				.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonAddOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddOrderActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonAddOrder);
		jToolBar1.add(jSeparator1);

		jButtonQryOrder
				.setIcon(new javax.swing.ImageIcon(
						getClass()
								.getResource(
										"/javax/swing/plaf/metal/icons/ocean/maximize-pressed.gif"))); // NOI18N
		jButtonQryOrder.setFocusable(false);
		jButtonQryOrder
				.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonQryOrder
				.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonQryOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQryOrderActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonQryOrder);
		jToolBar1.add(jSeparator4);

		jButtonInitTable.setFont(new java.awt.Font("隶书", 0, 14));
		jButtonInitTable.setText("\u521d\u59cb\u5316\u9910\u684c");
		jToolBar1.add(jButtonInitTable);

		jSplitPane1.setDividerLocation(138);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						0, 0, 0)), "\u6b22\u8fce\u60a8",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("隶书", 0, 16)));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/com/insigma/dish/images/Catch900017.jpg"))); // NOI18N

		jLabelName.setFont(new java.awt.Font("隶书", 0, 14));
		jLabelName.setText("\u5f20\u4e09\u4e30");

		jLabel2.setFont(new java.awt.Font("隶书", 0, 14));
		jLabel2.setText("\u89d2\u8272\uff1a");

		jLabel3.setFont(new java.awt.Font("隶书", 0, 14));
		jLabel3.setText("\u59d3\u540d\uff1a");

		jLabelName1.setFont(new java.awt.Font("隶书", 0, 14));
		jLabelName1.setText("\u7ba1\u7406\u5458");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												45,
																												Short.MAX_VALUE)
																										.addGap(4,
																												4,
																												4)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabelName1)
																						.addComponent(
																								jLabelName))))
										.addGap(22, 22, 22)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2))
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jLabelName1)
																		.addGroup(
																				jPanel2Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabelName)
																						.addGap(25,
																								25,
																								25))))
										.addGap(24, 24, 24)));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						0, 0, 0)), "\u5feb\u6377\u83dc\u5355",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("隶书", 0, 16)));

		jButton5.setFont(new java.awt.Font("隶书", 0, 14));
		jButton5.setText("\u5bc6\u7801\u4fee\u6539");

		jButton6.setFont(new java.awt.Font("隶书", 0, 14));
		jButton6.setText("\u8d44\u6599\u4fee\u6539");

		jButton8.setFont(new java.awt.Font("隶书", 0, 14));
		jButton8.setText("\u5b89\u5168\u9000\u51fa");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton5)
														.addComponent(jButton6)
														.addComponent(jButton8))
										.addContainerGap(24, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addContainerGap(162, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jSplitPane1.setLeftComponent(jPanel1);
		jSplitPane1.setRightComponent(jDesktopPane1);

		jMenuBar1.setFont(new java.awt.Font("宋体", 0, 18));

		jMenu1.setText("\u8ba2\u5355\u7ba1\u7406");
		jMenu1.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuOrderAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_A,
				java.awt.event.InputEvent.SHIFT_MASK));
		jMenuOrderAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuOrderAdd.setText("\u8ba2\u5355\u65b0\u589e");
		jMenuOrderAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuOrderAddActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuOrderAdd);

		jMenuOrderQry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_B,
				java.awt.event.InputEvent.SHIFT_MASK));
		jMenuOrderQry.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuOrderQry.setText("\u8ba2\u5355\u67e5\u770b");
		jMenuOrderQry.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuOrderQryActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuOrderQry);

		jMenuTableInit.setText("\u9910\u684c\u521d\u59cb\u5316");
		jMenu1.add(jMenuTableInit);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u83dc\u8272\u7ba1\u7406");
		jMenu2.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuDishAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuDishAdd.setText("\u83dc\u54c1\u65b0\u589e");
		jMenu2.add(jMenuDishAdd);

		jMenuDishManage.setText("\u83dc\u54c1\u7ba1\u7406");
		jMenuDishManage.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuDishManageActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuDishManage);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u5458\u5de5\u7ba1\u7406");
		jMenu3.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuEmpAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuEmpAdd.setText("\u5458\u5de5\u65b0\u589e");
		jMenu3.add(jMenuEmpAdd);

		jMenuEmpQry
				.setText("\u5458\u5de5\u67e5\u8be2\uff08\u4fee\u6539 \u5220\u9664\uff09");
		jMenu3.add(jMenuEmpQry);

		jMenuBar1.add(jMenu3);

		jMenu4.setText("\u6743\u9650\u7ba1\u7406");
		jMenu4.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuPurviewSort.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(
						"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuPurviewSort.setText("\u89d2\u8272\u6743\u9650\u5206\u7c7b");
		jMenu4.add(jMenuPurviewSort);

		jMenuPurviewAssign.setText("\u5458\u5de5\u6743\u9650\u5206\u914d");
		jMenu4.add(jMenuPurviewAssign);

		jMenuBar1.add(jMenu4);

		jMenu6.setText("\u4ea4\u6613\u7edf\u8ba1");
		jMenu6.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuYearStatistics.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(
						"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuYearStatistics.setText("\u5e74\u5ea6\u7edf\u8ba1");
		jMenuYearStatistics
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jMenuYearStatisticsActionPerformed(evt);
					}
				});
		jMenu6.add(jMenuYearStatistics);

		jMenuItem2.setText("\u6708\u5ea6\u7edf\u8ba1");
		jMenu6.add(jMenuItem2);

		jMenuBar1.add(jMenu6);

		jMenu7.setText("\u7cfb\u7edf\u7ba1\u7406");
		jMenu7.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuPassModify.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(
						"/javax/swing/plaf/metal/icons/ocean/collapsed.gif"))); // NOI18N
		jMenuPassModify.setText("\u5bc6\u7801\u4fee\u6539");
		jMenu7.add(jMenuPassModify);

		jMenuSelfModify.setText("\u4e2a\u4eba\u8d44\u6599\u4fee\u6539");
		jMenu7.add(jMenuSelfModify);

		jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/org/jvnet/lafwidget/tree/dnd/icons/drop-not-allowed.png"))); // NOI18N
		jMenuExit.setText("\u5b89\u5168\u9000\u51fa");
		jMenuExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuExitActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuExit);

		jMenuBar1.add(jMenu7);

		jMenu5.setText("\u5e2e\u52a9");
		jMenu5.setFont(new java.awt.Font("隶书", 0, 18));

		jMenuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/javax/swing/plaf/metal/icons/ocean/expanded.gif"))); // NOI18N
		jMenuAbout.setText("About");
		jMenu5.add(jMenuAbout);

		jMenuBar1.add(jMenu5);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jToolBar1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(585, Short.MAX_VALUE))
				.addComponent(jSeparator3,
						javax.swing.GroupLayout.DEFAULT_SIZE, 755,
						Short.MAX_VALUE)
				.addComponent(jSeparator2,
						javax.swing.GroupLayout.DEFAULT_SIZE, 755,
						Short.MAX_VALUE)
				.addComponent(jSplitPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 755,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jSeparator3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jToolBar1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSplitPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										461, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jMenuYearStatisticsActionPerformed(
			java.awt.event.ActionEvent evt) {
		YearStatisticsFrame yearStatisticsFrame = new YearStatisticsFrame();
		jDesktopPane1.add(yearStatisticsFrame);
		try {
			yearStatisticsFrame.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yearStatisticsFrame.setVisible(true);
	}

	private void jMenuDishManageActionPerformed(java.awt.event.ActionEvent evt) {
		DishManageFrame dishManageFrame = new DishManageFrame();
		jDesktopPane1.add(dishManageFrame);
		try {
			dishManageFrame.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dishManageFrame.setVisible(true);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuOrderQryActionPerformed(java.awt.event.ActionEvent evt) {
		jButtonQryOrderActionPerformed(evt);
	}

	private void jMenuOrderAddActionPerformed(java.awt.event.ActionEvent evt) {
		jButtonAddOrderActionPerformed(evt);
	}

	private void jButtonQryOrderActionPerformed(java.awt.event.ActionEvent evt) {
		OrderQueryFrame orderQueryFrame = new OrderQueryFrame();
		jDesktopPane1.add(orderQueryFrame);
		try {
			orderQueryFrame.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		orderQueryFrame.setVisible(true);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButtonAddOrderActionPerformed(java.awt.event.ActionEvent evt) {
		OrderAddFrame orderAddFrame = new OrderAddFrame(emp);

		if (Utils.isExitJInternalFrame(jDesktopPane1, orderAddFrame)) {
			//找到桌面变量
			jDesktopPane1.add(orderAddFrame);
			orderAddFrame.setVisible(true);
			try {
				orderAddFrame.setMaximum(true);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButtonAddOrder;
	private javax.swing.JButton jButtonInitTable;
	private javax.swing.JButton jButtonQryOrder;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabelName;
	private javax.swing.JLabel jLabelName1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenuItem jMenuAbout;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuDishAdd;
	private javax.swing.JMenuItem jMenuDishManage;
	private javax.swing.JMenuItem jMenuEmpAdd;
	private javax.swing.JMenuItem jMenuEmpQry;
	private javax.swing.JMenuItem jMenuExit;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuOrderAdd;
	private javax.swing.JMenuItem jMenuOrderQry;
	private javax.swing.JMenuItem jMenuPassModify;
	private javax.swing.JMenuItem jMenuPurviewAssign;
	private javax.swing.JMenuItem jMenuPurviewSort;
	private javax.swing.JMenuItem jMenuSelfModify;
	private javax.swing.JMenuItem jMenuTableInit;
	private javax.swing.JMenuItem jMenuYearStatistics;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JToolBar.Separator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JToolBar.Separator jSeparator4;
	private javax.swing.JSplitPane jSplitPane1;
	private javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables
	private EmployeInfo emp;

}