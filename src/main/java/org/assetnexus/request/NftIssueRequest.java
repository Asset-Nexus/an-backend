package org.assetnexus.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaomi
 * @since 2024/4/28 16:01
 */
@Data
public class NftIssueRequest implements Serializable {

    @NotBlank(message = "id不能为空")
    private String id;
    @NotNull(message = "价格不能为空")
    private BigDecimal price;
}
