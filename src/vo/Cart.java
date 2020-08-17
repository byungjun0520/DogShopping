package vo;

import java.net.URLEncoder;
// 장바구니 항목 하나의 정보를 저장하는 클래스
public class Cart {
	
	private String image;
	private String kind;
	private int price;
	private int qty;
	private String encodingkind;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getEncodingkind() {
		try {
			encodingkind = URLEncoder.encode(kind, "UTF-8");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return encodingkind;
	}

}
