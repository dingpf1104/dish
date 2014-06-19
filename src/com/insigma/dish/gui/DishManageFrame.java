/*
 * DishManageFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.insigma.dish.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.insigma.dish.dao.DishDao;
import com.insigma.dish.dao.db.DAOFactory;
import com.insigma.dish.pojo.DishInfo;
import com.insigma.dish.pojo.DishSort;

/**
 *
 * @author  __USER__
 */
public class DishManageFrame extends javax.swing.JInternalFrame {

	/** Creates new form DishManageFrame */
	public DishManageFrame() {
		initComponents();
		//初始化弹出菜单
		initPopMenu();
		init();
	}

	private void initPopMenu() {
		JMenuItem jMenuDishAdd = new JMenuItem("新增菜品");
		JMenuItem jMenuDishSortAdd = new JMenuItem("新增类别");
		JMenuItem jMenuDishDel = new JMenuItem("删除");
		jPopupMenu1.add(jMenuDishAdd);
		jPopupMenu1.add(jMenuDishSortAdd);
		jPopupMenu1.add(jMenuDishDel);
		//给 每个 菜单项 添加监听事件
		jMenuDishAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DishAddActionPerformed(e);
			}
		});
		jMenuDishDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DishDelActionPerformed(e);
			}
			
		});
	}
	/**
	 * 弹出窗口：删除菜品或类别
	 * @param e
	 */
	private void DishDelActionPerformed(ActionEvent e) {
		//获得 节点数据
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)jTreeDishes.getLastSelectedPathComponent();
		Object nodeObj = node.getUserObject();
		if(nodeObj instanceof DishInfo){
			DishInfo nodeDish = (DishInfo)nodeObj;
			System.out.println("您好，我是"+ nodeDish.getName());
			JOptionPane.showMessageDialog(this, "您删除了菜品："+nodeDish);
		}else if(nodeObj instanceof DishSort){
			DishSort nodeSort = (DishSort)nodeObj;
			System.out.println("您好，我是"+ nodeSort.getName());
			JOptionPane.showMessageDialog(this, "您删除了类别："+nodeSort);
		}else if(nodeObj instanceof String){
			JOptionPane.showMessageDialog(this, "您不能删除根节点");
		}
		
	}

	/**
	 * 弹出窗口：新增菜品功能
	 * @param e
	 */
	private void DishAddActionPerformed(ActionEvent e) {
		//弹出菜品新增窗口
	}

	private void init() {
		//1、获取菜品数据和 菜品分类数据
		DishDao dishDao = DAOFactory.createDishDao();
		List<DishSort> dishSorts = dishDao.qryDishSortsAll();
		List<DishInfo> dishes = dishDao.qryDishesAll();
		//2、将数据 显示到JTree中
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("菜品管理");
		//如何优化 这个 节点赋值的循环
		for (DishSort dishSort : dishSorts) {
			DefaultMutableTreeNode sortNode = new DefaultMutableTreeNode(
					dishSort);
			for (DishInfo dishInfo : dishes) {
				//选择对应的菜品加入 对应类别
				if (dishSort.getSortId() == dishInfo.getDishSort().getSortId()) {
					DefaultMutableTreeNode dishNode = new DefaultMutableTreeNode(
							dishInfo);
					sortNode.add(dishNode);
				}
			}
			rootNode.add(sortNode);
		}
		DefaultTreeModel dModel = new DefaultTreeModel(rootNode);
		jTreeDishes.setModel(dModel);

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPopupMenu1 = new javax.swing.JPopupMenu();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTreeDishes = new javax.swing.JTree();
		jLabel1 = new javax.swing.JLabel();

		setClosable(true);
		setTitle("\u83dc\u54c1\u7ba1\u7406");

		jTreeDishes.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTreeDishesMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTreeDishes);

		jLabel1.setText("\u8bf7\u9009\u62e9\u4e00\u6761\u8bb0\u5f55\uff0c\u70b9\u51fb\u53f3\u952e\u8fdb\u884c\u83dc\u54c1\u7ba1\u7406\uff1a");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(65, 65,
																		65)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		388,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jLabel1))
								.addGap(74, 74, 74)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										289,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(21, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTreeDishesMouseClicked(java.awt.event.MouseEvent evt) {
		if(evt.getButton()==MouseEvent.BUTTON3){
			jPopupMenu1.show(evt.getComponent(),evt.getX(), evt.getY());
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPopupMenu jPopupMenu1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTree jTreeDishes;
	// End of variables declaration//GEN-END:variables

}