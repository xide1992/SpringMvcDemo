package com.xdz.repository;

import com.xdz.model.BookfinanceTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by xdz12530 on 2017/12/3.
 */
@Repository
public interface UserRepository extends JpaRepository<BookfinanceTableEntity, Integer> {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update BookfinanceTableEntity bf set bf.jobNo=:upJobNo, bf.jobName=:upJobName where bf.id=:upId")
    public void updateUser(@Param("upJobNo") Integer jobNo, @Param("upJobName") String jobName,@Param("upId") Integer id);
}
