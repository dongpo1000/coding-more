package com.codingmore.service;

import java.util.List;

import com.codingmore.model.Users;

/**
 * 用户缓存
 */
public interface IUsersCacheService {
     /**
     * 删除后台用户缓存
     */
    void delUsers(Long usersId);

    /**
     * 删除后台用户资源列表缓存
     */
    void delResourceList(Long usersId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRole(Long roleId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     */
    void delResourceListByResource(Long resourceId);

    /**
     * 获取缓存后台用户信息
     */
    Users getUsers(String username);

    /**
     * 设置缓存后台用户信息
     */
    void setUsers(Users users);

    /**
     * 获取缓存后台用户资源列表
     */
    // List<UmsResource> getResourceList(Long usersId);

    /**
     * 设置后台后台用户资源列表
     */
    // void setResourceList(Long usersId, List<UmsResource> resourceList);
}