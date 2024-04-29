package org.assetnexus.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaomi
 * @since 2024/4/25 12:58
 */
@Data
public class NftListRequest implements Serializable {
    private static final long serialVersionUID = 2331411515116609398L;
    private String title;
    private String tag;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}
