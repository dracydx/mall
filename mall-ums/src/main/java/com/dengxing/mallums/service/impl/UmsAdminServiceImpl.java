package com.dengxing.mallums.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.dengxing.mallcommon.api.CommonResult;
import com.dengxing.mallcommon.constant.AuthConstant;
import com.dengxing.mallcommon.domain.UserDto;
import com.dengxing.mallums.entity.UmsAdmin;
import com.dengxing.mallums.dao.UmsAdminDao;
import com.dengxing.mallums.entity.UmsRole;
import com.dengxing.mallums.service.AuthService;
import com.dengxing.mallums.service.UmsAdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Struct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 后台用户表(UmsAdmin)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 14:57:45
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {
    @Resource
    private UmsAdminDao umsAdminDao;
    @Autowired
    private AuthService authService;




    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdmin queryById(Long id) {
        return this.umsAdminDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsAdmin> queryAllByLimit(int offset, int limit) {
        return this.umsAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin insert(UmsAdmin umsAdmin) {
        this.umsAdminDao.insert(umsAdmin);
        return umsAdmin;
    }

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin update(UmsAdmin umsAdmin) {
        this.umsAdminDao.update(umsAdmin);
        return this.queryById(umsAdmin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsAdminDao.deleteById(id) > 0;
    }

    @Override
    public CommonResult login(String username, String password) {

        if (StrUtil.isEmpty(username) || StrUtil.isEmpty(password)) {
            throw new RuntimeException("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
        params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
        params.put("client_secret", "123456");
        params.put("grant_type", "password");
        params.put("username", username);
        params.put("password", password);
        CommonResult accessToken = authService.getAccessToken(params);
        return accessToken;
    }


    @Override
    public UserDto loadUserByUsername(String username) {
        UmsAdmin umsAdmin = umsAdminDao.queryByName(username);
        if (umsAdmin != null) {
            UserDto userDTO = new UserDto();
            BeanUtils.copyProperties(umsAdmin, userDTO);
            return userDTO;
        }
        return null;
    }
}