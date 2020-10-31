package jp.co.internous.ecsite.model.form;

import java.io.Serializable;


public class GoodsForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	
	
	//setter & getter
	public void setId(long id) {
		this.id = id;
	}
	public long getId(){
		return id;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName(){
		return goodsName;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	public long getPrice(){
		return price;
	}	
}