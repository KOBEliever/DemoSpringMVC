package com.cqu.ssm.service.impl;

import com.cqu.ssm.entity.Doc;
import com.cqu.ssm.dao.DocDao;
import com.cqu.ssm.service.DocService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Doc)表服务实现类
 *
 * @author makejava
 * @since 2022-06-16 10:25:49
 */
@Service("docService")
public class DocServiceImpl implements DocService {
    @Resource
    private DocDao docDao;

    /**
     * 通过ID查询单条数据
     *
     * @param docId 主键
     * @return 实例对象
     */
    @Override
    public Doc queryById(Long docId) {
        return this.docDao.queryById(docId);
    }



    /**
     * 新增数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    @Override
    public Doc insert(Doc doc) {
        this.docDao.insert(doc);
        return doc;
    }

    /**
     * 修改数据
     *
     * @param doc 实例对象
     * @return 实例对象
     */
    @Override
    public Doc update(Doc doc) {
        this.docDao.update(doc);
        return this.queryById(doc.getDocId());
    }

    /**
     * 通过主键删除数据
     *
     * @param docId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long docId) {
        return this.docDao.deleteById(docId) > 0;
    }
}
