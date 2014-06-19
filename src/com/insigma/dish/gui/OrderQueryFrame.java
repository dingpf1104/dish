/*
 * QueryOrder.java
 *
 * Created on __DATE__, __TIME__
 */

package com.insigma.dish.gui;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.insigma.dish.dao.db.DAOFactory;
import com.insigma.dish.pojo.DishInfo;
import com.insigma.dish.pojo.OrderVO;
import com.insigma.dish.util.Utils;

/**
 *
 * @author  __USER__
 */
public class OrderQueryFrame extends javax.swing.JInternalFrame {

	/** Creates new form QueryOrder */
	public OrderQueryFrame() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		labOrderNo = new javax.swing.JLabel();
		labTableNo = new javax.swing.JLabel();
		labFeeState = new javax.swing.JLabel();
		txtOrderId = new javax.swing.JTextField();
		txtTableId = new javax.swing.JTextField();
		cobFeeState = new javax.swing.JComboBox();
		btnQuery = new javax.swing.JButton();
		btnAdd = new javax.swing.JButton();
		labRemind = new javax.swing.JLabel();
		btnPay = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		tabGroupOrder = new javax.swing.JTable();
		jSeparator1 = new javax.swing.JSeparator();
		jButtonQryDetail = new javax.swing.JButton();

		setClosable(true);
		setTitle("\u8ba2\u5355\u67e5\u770b");

		labOrderNo.setText("\u8ba2\u5355\u53f7\uff1a");

		labTableNo.setText("\u684c\u53f7\uff1a");

		labFeeState.setText("\u4ed8\u6b3e\u72b6\u6001\uff1a");

		cobFeeState.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"未收费", "已收费" }));

		btnQuery.setText("\u67e5\u8be2");
		btnQuery.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnQueryActionPerformed(evt);
			}
		});

		btnAdd.setText("\u8ba2\u5355\u65b0\u589e");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		labRemind
				.setText("\u63d0\u9192\uff1a\u9009\u4e2d\u8bb0\u5f55 \u4fee\u6539\u3001\u5220\u9664\u3001\u6536\u6b3e\u3001\u67e5\u770b\u8ba2\u5355\u8be6\u7ec6");

		btnPay.setText("\u6536\u6b3e");
		btnPay.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPayActionPerformed(evt);
			}
		});

		tabGroupOrder.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "订单号",
						"桌号", "总价", "收银员" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(tabGroupOrder);

		jButtonQryDetail.setText("\u8ba2\u5355\u8be6\u7ec6");
		jButtonQryDetail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQryDetailActionPerformed(evt);
			}
		});

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
																.addContainerGap()
																.addComponent(
																		labOrderNo)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		txtOrderId,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		labTableNo)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		txtTableId,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		61,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		labFeeState)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		cobFeeState,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(163,
																		163,
																		163)
																.addComponent(
																		btnQuery)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btnAdd))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jSeparator1,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jScrollPane2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						426,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(161,
																		161,
																		161)
																.addComponent(
																		btnPay)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButtonQryDetail))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		labRemind,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		324,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(20, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(labOrderNo)
												.addComponent(labTableNo)
												.addComponent(labFeeState)
												.addComponent(
														cobFeeState,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														txtOrderId,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														txtTableId,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnAdd)
												.addComponent(btnQuery))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										96,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnPay)
												.addComponent(jButtonQryDetail))
								.addGap(12, 12, 12).addComponent(labRemind)
								.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButtonQryDetailActionPerformed(java.awt.event.ActionEvent evt) {
		OrderQryDetailFrame orderQryDetailFrame = new OrderQryDetailFrame();
		this.getParent().add(orderQryDetailFrame);
				//居中
		int x = (this.getParent().getWidth() - orderQryDetailFrame.getWidth()) / 2;
		int y = (this.getParent().getHeight() - orderQryDetailFrame.getHeight()) / 2;
		orderQryDetailFrame.setLocation(x, y);
		orderQryDetailFrame.setVisible(true);
	}

	private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
		OrderAddFrame orderAddFrame = new OrderAddFrame();
		this.getParent().add(orderAddFrame);
		int x = (this.getParent().getWidth() - orderAddFrame.getWidth()) / 2;
		int y = (this.getParent().getHeight() - orderAddFrame.getHeight()) / 2;
		orderAddFrame.setLocation(x, y);
		orderAddFrame.setVisible(true);
	}

	private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {
		//1、先获得查询条件字段
		String orderId = txtOrderId.getText();
		String tableId = txtTableId.getText();
		String state = (String)cobFeeState.getSelectedItem();
		//数据处理
		int table = 0;
		if(!"".equals(tableId)){
			table = Integer.valueOf(tableId);
		}
		int feeState = 0;
		if("已收费".equals(state)){
			feeState = 1;
		}
		//2、查询数据库 订单数据
		List<OrderVO> orderVOs = DAOFactory.createOrderDao().qryOrdersByCondition(orderId, table, feeState);
		DefaultTableModel dModel = new DefaultTableModel(new String[] { "订单号",
				"桌号", "总价", "收银员" }, 0);
		for (OrderVO ovo : orderVOs) {
			dModel.addRow(new String[] { ovo.getOrderId(),
					String.valueOf(ovo.getTableID()), String.valueOf(ovo.getTotalPrice()),
					ovo.getName() });
		}
		tabGroupOrder.setModel(dModel);
		
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnPay;
	private javax.swing.JButton btnQuery;
	private javax.swing.JComboBox cobFeeState;
	private javax.swing.JButton jButtonQryDetail;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JLabel labFeeState;
	private javax.swing.JLabel labOrderNo;
	private javax.swing.JLabel labRemind;
	private javax.swing.JLabel labTableNo;
	private javax.swing.JTable tabGroupOrder;
	private javax.swing.JTextField txtOrderId;
	private javax.swing.JTextField txtTableId;
	// End of variables declaration//GEN-END:variables

}