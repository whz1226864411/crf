package com.creat.secret.po;

import com.creat.secret.validgroup.TjxmSaveGroup;
import com.creat.secret.validgroup.TjxmUpdateGroup;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
public class TjxmCustom extends Tjxm{
    @Valid
    @NotEmpty(message = "{tjxmCustom.ndtCustomList.notEmpty}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private List<NdtCustom> ndtCustomList;

    public List<NdtCustom> getNdtCustomList() {
        return ndtCustomList;
    }

    public void setNdtCustomList(List<NdtCustom> ndtCustomList) {
        this.ndtCustomList = ndtCustomList;
    }
}
