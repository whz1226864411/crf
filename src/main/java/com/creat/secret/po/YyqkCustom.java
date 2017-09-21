package com.creat.secret.po;

import com.creat.secret.validgroup.ZlqkSaveGroup;
import com.creat.secret.validgroup.ZlqkUpdateGroup;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by whz on 2017/8/25.
 */
public class YyqkCustom extends Yyqk{
    @Valid
    @NotEmpty(message = "{yyqk.xyndList.notEmpty}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private List<Xynd> xxydList;

    public List<Xynd> getXxydList() {
        return xxydList;
    }

    public void setXxydList(List<Xynd> xyndList) {
        this.xxydList = xyndList;
    }
}
