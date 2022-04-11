package org.dshubs.odc.app.service.impl;

import org.dshubs.odc.mybatis.app.service.BaseServiceImpl;
import org.dshubs.odc.app.service.FileEditLogService;
import org.dshubs.odc.infra.mapper.FileEditLogMapper;
import org.dshubs.odc.domain.entity.FileEditLog;
import org.springframework.stereotype.Service;


/**
 * 文件更改版本表逻辑控制层
 *
 * @author Mr.zhou 2022-04-11
 */
@Service
public class FileEditLogServiceImpl extends BaseServiceImpl<FileEditLogMapper,FileEditLog> implements FileEditLogService {

}

