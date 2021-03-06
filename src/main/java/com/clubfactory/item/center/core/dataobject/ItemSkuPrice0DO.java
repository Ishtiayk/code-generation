/**
*@Author: wyh
*@Date: 2020-07-30
*/
package com.clubfactory.item.center.core.dataobject;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;

/**
* @ClassName: ItemSkuPrice0
* @Description:
* @author wyh
* @date 2020-07-30
*/
@Data
@Accessors(chain = true)
public class ItemSkuPrice0DO implements Serializable{


    /**
     * id
     */
	private Long id;

    /**
     * 更新时间精确到毫秒
     */
	private Date updateTime;

    /**
     * 
     */
	private Date createTime;

    /**
     * item_id
     */
	private Long itemId;

    /**
     * item_sku_id
     */
	private Long itemSkuId;

    /**
     * 国家
     */
	private String country;

    /**
     * 展示价(吊牌价, 原价, 市场价,  划线价)
     */
	private BigDecimal compareAtPrice;

    /**
     * 普通购买价(销售价)
     */
	private BigDecimal price;

    /**
     * 会员购买价(会员价)
     */
	private BigDecimal memberOnlyPrice;

    /**
     * 币种
     */
	private String currency;

}



