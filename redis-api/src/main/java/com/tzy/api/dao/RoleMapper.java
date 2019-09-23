package com.tzy.api.dao;

import com.tzy.api.bean.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tzy
 * @create 2019-09-21 21:17
 */
@Repository
public interface RoleMapper {

    public Role getRole(Long id);
    public int deleteRole(Role role);
    public int insertRole(Role role);

    public int updataRole(Role role);

    public List<Role> findRoles(@Param("roleName") String roleName,@Param("note") String note);
}
