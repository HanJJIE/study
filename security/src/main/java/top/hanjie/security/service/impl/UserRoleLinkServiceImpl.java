package top.hanjie.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hanjie.security.entity.UserRoleLink;
import top.hanjie.security.mapper.UserRoleLinkMapper;
import top.hanjie.security.service.UserRoleLinkService;

/**
 * 用户与角色关联接口实现
 *
 * @author 黄汉杰
 */
@Service
public class UserRoleLinkServiceImpl
        extends ServiceImpl<UserRoleLinkMapper, UserRoleLink>
        implements UserRoleLinkService {

}