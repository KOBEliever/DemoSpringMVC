package com.cqu.ssm.controller;

import com.cqu.ssm.entity.Doc;
import com.cqu.ssm.service.DocService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Doc)表控制层
 *
 * @author makejava
 * @since 2022-06-16 10:25:48
 */
@RestController
@RequestMapping("doc")
public class DocController {
    /**
     * 服务对象
     */
    @Resource
    private DocService docService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Doc> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.docService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param doc 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Doc> add(Doc doc) {
        return ResponseEntity.ok(this.docService.insert(doc));
    }

    /**
     * 编辑数据
     *
     * @param doc 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Doc> edit(Doc doc) {
        return ResponseEntity.ok(this.docService.update(doc));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.docService.deleteById(id));
    }

}

