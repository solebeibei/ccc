package com.ly.dao.base.impl;

import com.ly.dao.base.GenericBaseDAO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

/**
 * Created by liyang21 on 2016/9/3.
 */
@Repository("genericBaseDAO")
public class GenericBaseDAOImpl implements GenericBaseDAO {
    @Resource
    private SqlSession sqlSession;
    private static final Logger log = LoggerFactory.getLogger(GenericBaseDAOImpl.class);


    @Override
    public <E> E executeForObject(String sqlID, Object bindParams, Class<E> clazz) {
        if (log.isDebugEnabled()) {
            log.debug("executeForObject Start.");
        }

        E rObj = null;
        try {
            // 执行SQL：取得记录
            Object obj = sqlSession.selectOne(sqlID, bindParams);
            if (log.isDebugEnabled() && obj != null) {
                log.debug("Return type:" + obj.getClass().getName());
            }
            if (clazz != null && obj != null) {
                rObj = (E) clazz.cast(obj);
            }
        } catch (ClassCastException e) {
            throw new ClassCastException();
        }
        if (log.isDebugEnabled()) {
            log.debug("executeForObject End.");
        }

        return rObj;
    }

    @Override
    public Map<String, Object> executeForMap(String sqlID, Object bindParams) {
        if (log.isDebugEnabled()) {
            log.debug("executeForMap Start.");
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> rObj = this.executeForObject(sqlID, bindParams, Map.class);

        if (log.isDebugEnabled()) {
            log.debug("executeForMap End.");
        }

        return rObj;
    }

    @Override
    public <E> E[] executeForObjectArray(String sqlID, Object bindParams, Class<E> clazz) {

        if (log.isDebugEnabled()) {
            log.debug("executeForObjectArray Start.");
        }
        if (clazz == null) {
            throw new ClassCastException();
        }

        E[] retArray;
        try {
            // 执行SQL：取得记录
            List<E> list = sqlSession.selectList(sqlID, bindParams);
            retArray = (E[]) Array.newInstance(clazz, list.size());
            list.toArray(retArray);
        } catch (ArrayStoreException e) {
            throw new ArrayStoreException();
        }

        if (log.isDebugEnabled()) {
            log.debug("executeForObjectArray End.");
        }

        return retArray;
    }

    @Override
    public Map<String, Object>[] executeForMapArray(String sqlID, Object bindParams) {

        if (log.isDebugEnabled()) {
            log.debug("executeForMapArray Start.");
        }
        @SuppressWarnings("unchecked")
        Map<String, Object>[] map = executeForObjectArray(sqlID, bindParams, Map.class);

        if (log.isDebugEnabled()) {
            log.debug("executeForMapArray End.");
        }

        return map;
    }

    @Override
    public <E> E[] executeForObjectArray(String sqlID, Object bindParams, Class<E> clazz, int beginIndex, int maxCount) {
        return null;
    }

    @Override
    public Map<String, Object>[] executeForMapArray(String sqlID, Object bindParams, int beginIndex, int maxCount) {
        return null;
    }

    @Override
    public <E> List<E> executeForObjectList(String sqlID, Object bindParams) {
        if (log.isDebugEnabled()) {
            log.debug("executeForObjectList Start.");
        }
        // 执行SQL：取得记录
        List<E> list = sqlSession.selectList(sqlID, bindParams);

        if (log.isDebugEnabled()) {
            log.debug("executeForObjectList End.");
        }

        return list;
    }

    @Override
    public List<Map<String, Object>> executeForMapList(String sqlID, Object bindParams) {
        return null;
    }

    @Override
    public int execute(String sqlID, Object bindParams) {

        if (log.isDebugEnabled()) {
            log.debug("execute Start.");
        }
        // 执行SQL: 更新数据
        int row = sqlSession.update(sqlID, bindParams);

        if (log.isDebugEnabled()) {
            log.debug("execute End. success count:" + row);
        }
        return row;
    }

    @Override
    public <E> List<E> executeForObjectList(String sqlID) {
        if (log.isDebugEnabled()) {
            log.debug("executeForObjectList Start.");
        }
        // 执行SQL：取得记录
        List<E> list = sqlSession.selectList(sqlID);

        if (log.isDebugEnabled()) {
            log.debug("executeForObjectList End.");
        }

        return list;
    }
}
