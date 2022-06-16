package com.cqu.ssm.service;

import com.cqu.ssm.entity.Doc;


/**
 * (Doc)表服务接口
 *
 * @author makejava
 * @since 2022-06-16 10:25:49
 */
public interface DocService {

    /**
     * 通过ID查询单条数据
     *
     * @param docId 主键
     * @return 实例对象
     */
    Doc queryById(Long docId);



    /**
     * 新增数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    Doc insert(Doc doc);

    /**
     * 修改数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    Doc update(Doc doc);

    /**
     * 通过主键删除数据
     *
     * @param docId 主键
     * @return 是否成功
     */
    boolean deleteById(Long docId);

}
