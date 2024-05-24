package org.assetnexus.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class NftBuyRequest implements Serializable {
    @NotBlank(message = "buyerAddress不能为空")
    private String buyerAddress;
    @NotBlank(message = "nftAddress不能为空")
    private String nftAddress;
    @NotBlank(message = "tokenId不能为空")
    private String tokenId;
}
