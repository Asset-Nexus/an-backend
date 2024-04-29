package org.assetnexus.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiaomi
 * @since 2024/4/28 16:36
 */
@Data
public class NftAuthorizeRequest implements Serializable {
    private static final long serialVersionUID = -1524238434451180228L;
    private Long id;
    private String fromAddress;
    private String toAddress;
    private String signature;
}
