package org.dshubs.odc.workflow.entity.query;

import lombok.Data;

@Data
public class BaseQueryVo {
    private Integer current = 1;
    private Integer size = 10;
    private String tenantId;
    private String orderRule;
    private String userId;
}
