package com.tzy.api.service;

import com.tzy.api.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tzy
 * @create 2019-09-21 21:57
 */
public interface RoleService {
    public Role getRole(Long id);
    public int deleteRole(Role role);
    public int insertRole(Role role);

    public int updataRole(Role role);

    public List<Role> findRoles(String roleName, String note);
}
