package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

public interface SellerDAO {
	Seller findBySid(int sid);
}
