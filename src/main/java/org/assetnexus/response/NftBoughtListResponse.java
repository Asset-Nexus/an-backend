package org.assetnexus.response;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiaomi
 * @since 2024/4/25 13:19
 */
@Data
public class NftBoughtListResponse implements Serializable {
    private String title;
    private String fileUrl;
    private String tag;
    private String author;
    private String description;
    private Date tradeTime;
}
