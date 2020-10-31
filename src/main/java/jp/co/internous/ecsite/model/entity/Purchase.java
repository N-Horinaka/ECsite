package jp.co.internous.ecsite.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="goods_id")
	private long goodsId;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="item_count")
	private long itemCount;
	
	@Column(name="total")
	private long total;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	
	//setter
	public void setId(long id) {
		this.id = id;
	}
	//getter
	public long getId() {
		return id;
	}
	
	//setter
	public void setUserId(int userId) {
		this.userId = userId;
	}
	//getter
	public long getUserId() {
		return userId;
	}
	
	//setter
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	//getter
	public long getGoodsId() {
		return goodsId;
	}
	
	//setter
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	//getter
	public String getGoodsName() {
		return goodsName;
	}
	
	
	//setter
	public void setItemCount(long itemCount) {
		this.itemCount = itemCount;
	}
	//getter
	public long getItemCount() {
		return itemCount;
	}
	
	//setter
	public void setTotal(long total) {
		this.total = total;
	}
	//getter
	public long getTotal() {
		return total;
	}

	//setter
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	//getter
	public Timestamp getCreatedAt() {
		return createdAt;
	}	
}