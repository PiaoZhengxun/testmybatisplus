package com.neusoft.testmybatisplus.service;

import com.neusoft.testmybatisplus.dto.DeptInfo;
import com.neusoft.testmybatisplus.dto.Message;
import com.neusoft.testmybatisplus.dto.QueryCondition4;
import com.neusoft.testmybatisplus.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.testmybatisplus.mapper.UserinfoMapper;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author junghoon
 * @since 2023-09-24
 */
public interface IUserinfoService extends IService<Userinfo> {

    public Message insertUserinfo(Userinfo userinfo);
    public Message insertUserinfo2(Userinfo userinfo);

    public Message verifyUserinfo(Userinfo userinfo);

//    public Userinfo getUserinfoByUserid(int userid);
    public Message updateUserinfoByUserid(Userinfo userinfo);
    public Message updateUserinfoByUserid2(Userinfo userinfo);
    public Message updateUserinfoByUserid3(Userinfo userinfo);

    public Message deleteUserinfoByUserid(int userid);

    public Message searchByMultiCondition4(QueryCondition4 queryCondition4);
    public Message searchByMultiCondition42(QueryCondition4 queryCondition4);
    public Message searchByCondition4(QueryCondition4 queryCondition4);

    public Message findUserinfoByUserids(int[] userids);

    public Message findAllDeptInfo();
    public Message findAllDeptInfo2();

}
