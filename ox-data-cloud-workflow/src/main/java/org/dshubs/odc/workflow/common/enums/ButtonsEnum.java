

package org.dshubs.odc.workflow.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.HashMap;

/**
 * 按钮枚举
 *
 * @author 湖南牛数商智信息科技有限公司
 */
@Getter
@AllArgsConstructor
public enum ButtonsEnum {

    COMPLETE("提交"),

    STOP("终止"),

    ASSIGN("转派"),

    DELEGATE("委派"),

    BACK("退回"),

    TAKE_BACK("撤回");

    static HashMap<String, ButtonsEnum> lookup = new HashMap<>();

    static {
        for (ButtonsEnum typeEnum : EnumSet.allOf(ButtonsEnum.class)) {
            lookup.put(typeEnum.toString(), typeEnum);
        }
    }

    String value;

    public static ButtonsEnum get(String value) {
        return lookup.get(value);
    }
}
