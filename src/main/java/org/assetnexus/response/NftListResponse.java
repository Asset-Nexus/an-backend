package org.assetnexus.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaomi
 * @since 2024/4/25 13:19
 */
@Data
public class NftListResponse implements Serializable {
    private static final long serialVersionUID = 5025424611329427663L;
    private Long id;
    private String title;
    private String fileUrl;
    private String tag;
    private BigDecimal price;
}
