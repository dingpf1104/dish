package com.insigma.dish.util;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.StandardChartTheme;

public class Utils {
	/**
	 * 设置标题图片
	 * @param f
	 */
	public static void setTitleImage(JFrame f){
		//标题图片设置
		try {
			Toolkit tk=Toolkit.getDefaultToolkit();
			String path = URLDecoder.decode(Class.class.getResource("/com/insigma/dish/images/conch1.png").getPath(), "UTF-8");
			Image image=tk.createImage(path); /*conch1.png是你的图标*/ 
			f.setIconImage(image); 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 随机订单号生成
	 * @return
	 */
	public static String num2String(){
		int num = (int) (100000000*Math.random());
		DecimalFormat decimalFormat = new DecimalFormat("00000000");
		String numString = decimalFormat.format(num);
		
		numString = new SimpleDateFormat("MMdd").format(new Date()) + numString;
		
		return numString;
	}
	/**
	 * 日期格式化
	 * @param pattern
	 * @param date
	 * @return
	 */
	public static String dateFmt(String pattern,Date date){
		return new SimpleDateFormat(pattern).format(date);
	}
	public static Date dateParse(String pattern,String date){
		Date parDate = null;
		try {
			parDate =  new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return parDate;
	}
	
	
	/**
	 * 判断桌面  是否存在  当前的 窗口
	 * @param jDesktopPane
	 * @param frame
	 * @return
	 */
	public static Boolean isExitJInternalFrame(JDesktopPane jDesktopPane, JInternalFrame frame){
		JInternalFrame[] jInternalFrames = jDesktopPane.getAllFrames();
		for (JInternalFrame jInternalFrame : jInternalFrames) {
			if(jInternalFrame.getClass().getName().equals(frame.getClass().getName())){
				return false;
			}
		}
		return true;
	}
	public static void setChartTheme(){
		//创建主题样式  
		StandardChartTheme standardChartTheme=new StandardChartTheme("CN");  
		//设置标题字体  
		standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));  
		//设置图例的字体  
		standardChartTheme.setRegularFont(new Font("宋书",Font.PLAIN,15));  
		//设置轴向的字体  
		standardChartTheme.setLargeFont(new Font("宋书",Font.PLAIN,15));  
		//应用主题样式  
		ChartFactory.setChartTheme(standardChartTheme); 
	}
	
	
	public static void main(String[] args) {
		System.out.println(num2String());
	}

}
