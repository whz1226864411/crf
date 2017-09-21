package com.creat.secret.po;

import com.creat.secret.validgroup.ZlqkSaveGroup;
import com.creat.secret.validgroup.ZlqkUpdateGroup;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
public class ZlqkCustom extends Zlqk{

    @Valid
    @NotEmpty(message = "{zlqk.yyqkCustomList.notEmpty}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private List<YyqkCustom> yyqkCustomList;

    public List<YyqkCustom> getYyqkCustomList() {
        return yyqkCustomList;
    }

    public void setYyqkCustomList(List<YyqkCustom> yyqkCustomList) {
        this.yyqkCustomList = yyqkCustomList;
    }
}
