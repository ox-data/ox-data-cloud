package org.dshubs.odc.app.service.impl;

import org.dshubs.odc.mybatis.app.service.BaseServiceImpl;
import org.dshubs.odc.app.service.OauthRoleService;
import org.dshubs.odc.infra.mapper.OauthRoleMapper;
import org.dshubs.odc.domain.entity.OauthRole;
import org.springframework.stereotype.Service;


/**
 * 角色逻辑控制层
 *
 * @author wangxian 2022-03-04
 */
@Service
public class OauthRoleServiceImpl extends BaseServiceImpl<OauthRoleMapper,OauthRole> implements OauthRoleService {

}

