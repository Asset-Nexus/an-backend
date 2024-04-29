package org.assetnexus.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaomi
 * @since 2024/4/28 16:01
 */
@Data
public class NftCreateRequest implements Serializable {
    private static final long serialVersionUID = -3098426623316596166L;
    private String id;
    private String title;
    private String tag;
    private String fileUrl;
    private BigDecimal price;
    private String desc;
    private String author;
    private String contractAddress;
    private String fromAddress;
}
