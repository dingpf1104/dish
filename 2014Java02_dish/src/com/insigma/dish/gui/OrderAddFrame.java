/*
 * OrderAddFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.insigma.dish.gui;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.insigma.dish.dao.OrderDao;
import com.insigma.dish.dao.db.DAOFactory;
import com.insigma.dish.pojo.DishInfo;
import com.insigma.dish.pojo.EmployeInfo;
import com.insigma.dish.pojo.OrderInfo;
import com.insigma.dish.util.Utils;

/**
 *
 * @author  __USER__
 */
public class OrderAddFrame extends javax.swing.JInternalFrame {

	/** Creates new form OrderAddFrame */
	public OrderAddFrame() {
		initComponents();
		//去掉标题栏
		((BasicInternalFrameUI) getUI()).setNorthPane(null);
	}

	public OrderAddFrame(EmployeInfo emp) {
		this();
		this.emp = emp;
		init();
	}

	private void init() {
		jLabelOrderId.setText(Utils.num2String());
		jLabelOrderTime.setText(Utils
				.dateFmt("yyyy-MM-dd HH:mm:ss", new Date()));
		jLabelEmpName.setText(emp.getName());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jListShowDish = new javax.swing.JList();
		jTextFieldOrderPrice = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButtonAddOrder = new javax.swing.JButton();
		jLabelOrderId = new javax.swing.JLabel();
		jLabelOrderTime = new javax.swing.JLabel();
		jButtonQryTable = new javax.swing.JButton();
		jLabelTableId = new javax.swing.JLabel();
		jButtonQryDish = new javax.swing.JButton();
		jButtonDelDish = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabelEmpName = new javax.swing.JLabel();
		jButtonclose = new javax.swing.JButton();
		jLabelTableId1 = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setTitle("\u8ba2\u5355\u65b0\u589e");

		jLabel1.setText("\u8ba2\u5355\u7f16\u53f7\uff1a");

		jLabel2.setText("\u4e0b\u5355\u65f6\u95f4\uff1a");

		jLabel3.setText("\u9009\u62e9\u684c\u53f7\uff1a");

		jLabel4.setText("\u9009\u62e9\u83dc\u54c1\uff1a");

		jLabel5.setText("\u603b\u4ef7\uff1a");

		jListShowDish.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(jListShowDish);

		jTextFieldOrderPrice.setEditable(false);

		jLabel6.setText("\u6536\u8d39\u72b6\u6001\uff1a");

		jLabel7.setText("\u6536\u94f6\u5458\uff1a");

		jButtonAddOrder.setText("\u751f\u6210\u8ba2\u5355");
		jButtonAddOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddOrderActionPerformed(evt);
			}
		});

		jLabelOrderId.setText("052900000001");

		jLabelOrderTime.setText("2014-05-29 12:00:00");

		jButtonQryTable.setText("\u9009\u62e9\u9910\u684c");
		jButtonQryTable.setOpaque(false);
		jButtonQryTable.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQryTableActionPerformed(evt);
			}
		});

		jLabelTableId.setText("X");

		jButtonQryDish.setText("\u9009\u62e9\u83dc\u54c1");
		jButtonQryDish.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQryDishActionPerformed(evt);
			}
		});

		jButtonDelDish.setText("\u5220\u9664\u83dc\u54c1");

		jLabel8.setText("\u672a\u6536\u8d39");

		jLabelEmpName.setText("\u6076\u9b54");

		jButtonclose.setText("\u5173\u95ed\u7a97\u53e3");
		jButtonclose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtoncloseActionPerformed(evt);
			}
		});

		jLabelTableId1.setText("\u53f7\u684c");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(35, 35,
																		35)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabelOrderTime,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										282,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabelOrderId,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										282,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel6)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel8,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										282,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel7)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabelEmpName,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										283,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel4)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jButtonQryDish))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel3)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabelTableId)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabelTableId1)))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jButtonDelDish)
																												.addComponent(
																														jButtonQryTable)))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(70, 70,
																		70)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldOrderPrice,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										69,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						jScrollPane1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						314,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(129,
																		129,
																		129)
																.addComponent(
																		jButtonAddOrder)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jButtonclose)))
								.addGap(67, 67, 67)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(jLabelOrderId))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabelOrderTime))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(jButtonQryTable)
												.addComponent(jLabelTableId)
												.addComponent(jLabelTableId1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jButtonQryDish)
												.addComponent(jButtonDelDish))
								.addGap(6, 6, 6)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(
														jTextFieldOrderPrice,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jLabel8))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(jLabelEmpName))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonAddOrder)
												.addComponent(jButtonclose))
								.addGap(22, 22, 22)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButtonAddOrderActionPerformed(java.awt.event.ActionEvent evt) {
		OrderDao orderDao = DAOFactory.createOrderDao();
		//组装下 订单插入数据
		List<OrderInfo> list = new ArrayList<OrderInfo>();
		ListModel<DishInfo> dModel = jListShowDish.getModel();
		for (int i = 0; i < dModel.getSize(); i++) {
			OrderInfo order = new OrderInfo(jLabelOrderId.getText(), Utils.dateParse(
					"yyyy-MM-dd HH:mm:ss", jLabelOrderTime.getText()),
					Integer.valueOf(jLabelTableId.getText()),
					dModel.getElementAt(i).getDishID(),
					dModel.getElementAt(i).getPrice(),
					"0",emp.getEmployeID());
			list.add(order);
		}
		boolean flag = orderDao.addOrder(list);
		if(flag){
			JOptionPane.showMessageDialog(this, "保存订单成功");
		}else{
			JOptionPane.showMessageDialog(this, "保存订单失败");
		}
		this.dispose();
	}

	private void jButtoncloseActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonQryDishActionPerformed(java.awt.event.ActionEvent evt) {
		DishQueryFrame dishQueryFrame = new DishQueryFrame();
		dishQueryFrame.setOrderAddFrame(this);
		this.getParent().add(dishQueryFrame);
		//居中
		int x = (this.getParent().getWidth() - dishQueryFrame.getWidth()) / 2;
		int y = (this.getParent().getHeight() - dishQueryFrame.getHeight()) / 2;
		dishQueryFrame.setLocation(x, y);
		//最后步 显示
		dishQueryFrame.setVisible(true);
	}

	private void jButtonQryTableActionPerformed(java.awt.event.ActionEvent evt) {
		TableQueryFrame tableQueryFrame = new TableQueryFrame();
		tableQueryFrame.setOrderAddFrame(this);
		this.getParent().add(tableQueryFrame);
		//居中
		int x = (this.getParent().getWidth() - tableQueryFrame.getWidth()) / 2;
		int y = (this.getParent().getHeight() - tableQueryFrame.getHeight()) / 2;
		tableQueryFrame.setLocation(x, y);
		//最后步 显示
		tableQueryFrame.setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAddOrder;
	private javax.swing.JButton jButtonDelDish;
	private javax.swing.JButton jButtonQryDish;
	private javax.swing.JButton jButtonQryTable;
	private javax.swing.JButton jButtonclose;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabelEmpName;
	private javax.swing.JLabel jLabelOrderId;
	private javax.swing.JLabel jLabelOrderTime;
	private javax.swing.JLabel jLabelTableId;
	private javax.swing.JLabel jLabelTableId1;
	private javax.swing.JList jListShowDish;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextFieldOrderPrice;
	// End of variables declaration//GEN-END:variables
	private EmployeInfo emp;

	public javax.swing.JLabel getjLabelTableId() {
		return jLabelTableId;
	}

	public javax.swing.JList getjListShowDish() {
		return jListShowDish;
	}

	public javax.swing.JTextField getjTextFieldOrderPrice() {
		return jTextFieldOrderPrice;
	}

}