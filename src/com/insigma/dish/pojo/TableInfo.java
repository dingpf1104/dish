package com.insigma.dish.pojo;

public class TableInfo {
	private int tableID;
	private int tableState;
	
	public TableInfo(int tableID, int tableState) {
		super();
		this.tableID = tableID;
		this.tableState = tableState;
	}
	public int getTableID() {
		return tableID;
	}
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}
	public int getTableState() {
		return tableState;
	}
	public void setTableState(int tableState) {
		this.tableState = tableState;
	}
	@Override
	public String toString() {
		return tableID + "号桌--" + (tableState==0?"可用":"不可用");
	}
	
}
