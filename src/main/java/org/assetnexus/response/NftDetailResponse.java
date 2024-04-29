package org.assetnexus.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaomi
 * @since 2024/4/28 13:07
 */
@Data
public class NftDetailResponse implements Serializable {

    private static final long serialVersionUID = 8041897387882980884L;
    private Long id;
    private String fileUrl;
    private String tag;
    private String title;
    private BigDecimal price;
    private String desc;
    private String author;
    private String contractAddress;
    private Boolean authorized;
    private String toAddress;
}
