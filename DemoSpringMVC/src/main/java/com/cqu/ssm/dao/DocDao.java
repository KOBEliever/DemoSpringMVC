package com.cqu.ssm.dao;

import com.cqu.ssm.entity.Doc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Doc)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-16 10:25:49
 */
public interface DocDao {

    /**
     * 通过ID查询单条数据
     *
     * @param docId 主键
     * @return 实例对象
     */
    Doc queryById(Long docId);


    /**
     * 统计总行数
     *
     * @param doc 查询条件
     * @return 总行数
     */
    long count(Doc doc);

    /**
     * 新增数据
     *
     * @param doc 实例对象
     * @return 影响行数
     */
    int insert(Doc doc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Doc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doc> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Doc> entities);

    /**
     * 修改数据
     *
     * @param doc 实例对象
     * @return 影响行数
     */
    int update(Doc doc);

    /**
     * 通过主键删除数据
     *
     * @param docId 主键
     * @return 影响行数
     */
    int deleteById(Long docId);

}

