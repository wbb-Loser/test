package com.cy.pj.goods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Override
	public int deleteObjects(Integer... ids) {
		long t1=System.currentTimeMillis();
		int rows=goodsDao.deleteObjects(ids);
		long t2=System.currentTimeMillis();
		System.out.println("delete.time="+(t2-t1));
		return rows;
	}
}





