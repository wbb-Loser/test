package com.cy.pj.goods.service;

public interface GoodsService {

	 /**
	  * 基于多个id执行业务删除
	  * @param ids
	  * @return
	  */
	 int deleteObjects(Integer...ids);
}
