package org.dshubs.odc.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.dshubs.odc.domain.entity.NoticeAnnex;
import org.apache.ibatis.annotations.Mapper;


/**
* 公告附件数据访问层
*
* @author daisicheng 2022-03-21
*/
@Mapper
public interface NoticeAnnexMapper extends BaseMapper<NoticeAnnex> {

}
