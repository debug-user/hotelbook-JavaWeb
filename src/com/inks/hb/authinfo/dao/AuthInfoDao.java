package com.inks.hb.authinfo.dao;

import com.inks.hb.authinfo.pojo.AuthInfo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * AuthInfoDao
 */
public interface AuthInfoDao {

    /**
     * 增
     *
     * @param authInfo 完整的authInfo对象
     * @throws SQLException 数据库
     */
    void insertAuthInfo(AuthInfo authInfo) throws SQLException;

    /**
     * 删
     *
     * @param authId 权限ID
     * @throws SQLException 数据库
     */
    void deleteAuthInfo(int authId) throws SQLException;

    /**
     * 改
     *
     * @param authInfo 修改后的authInfo对象
     * @throws SQLException 数据库
     */
    void updateAuthInfo(AuthInfo authInfo) throws SQLException;

    /**
     * 查 - 长度
     *
     * @return 权限表长度
     * @throws SQLException 数据库
     */
    int queryAuthInfoNum() throws SQLException;

    /**
     * 查 - 权限ID
     *
     * @param authId 权限ID
     * @return 权限对象,如果未查到就返回无参构造器构建的对象
     * @throws SQLException 数据库
     */
    AuthInfo query(int authId) throws SQLException;

    /**
     * 查 - 权限项
     *
     * @param authItem 权限项
     * @return 权限对象,如果未查到就返回无参构造器构建的对象
     * @throws SQLException 数据库
     */
    AuthInfo query(String authItem) throws SQLException;

    /**
     * 查 - 分页查询
     * _
     * ____________________________________________________
     * _
     * _   注意：为了方便计算，传入的start在实际使用时已经减一
     * _   也就是数字1代表第一个数据。
     * ____________________________________________________
     * _
     *
     * @param start  开始位置, 第一个数据的起始坐标为0.
     * @param length 返回多少数据
     * @return 所有的权限表字段
     * @throws SQLException 数据库
     */
    ArrayList<AuthInfo> query(int start, int length) throws SQLException;

}