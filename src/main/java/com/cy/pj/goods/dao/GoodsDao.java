package com.cy.pj.goods.dao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * 告诉mybatis,此接口类型的实现类,由系统底层(MyBatis
 * 框架)创建,并将实现类的对象存储到spring容器.
 */
@Mapper
public interface GoodsDao {
  /**
      *  基于多个id执行删除操作
   * @param ids
   * @return
   */
  int deleteObjects(@Param("ids")Integer... ids);
  /**
   * mybatis 中注解方式定义sql映射,例如@Delete
   * @param id 商品id
   * @return 删除的行数
   */
  @Delete("delete from tb_goods where id=#{id}")
  int deleteById(Integer id);
}





