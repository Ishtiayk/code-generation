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
* @ClassName: ItemSku0
* @Description:
* @author wyh
* @date 2020-07-30
*/
@Data
@Accessors(chain = true)
public class ItemSku0DO implements Serializable{


    /**
     * 
     */
	private Long id;

    /**
     * 
     */
	private Date createTime;

    /**
     * 
     */
	private Date updateTime;

    /**
     * 逻辑删除标示 1：删除
     */
	private Integer isDelete;

    /**
     * 关联的item_id
     */
	private Long itemId;

    /**
     * item_sku_id
     */
	private Long itemSkuId;

    /**
     * b端货品id
     */
	private Long productId;

    /**
     * b端sku id
     */
	private Long productSkuId;

    /**
     * item_sku版本号
     */
	private Long version;

    /**
     * sku状态
     */
	private Integer status;

    /**
     * 库存状态,默认不售罄 dto不透出
     */
	private Integer inventoryStatus;

    /**
     * sku图片
     */
	private String imageUrl;

    /**
     * b端sku维度feature
     */
	private String feature;

    /**
     * 可信赖的重量, 不管重量来源
     */
	private Long confirmWeight;

    /**
     * seller_sku编码,大卖家才有
     */
	private String merchantSkuCode;

    /**
     * 多国hs_code, 税率
     */
	private String hsTable;

    /**
     * sku属性kv串
     */
	private String attributeInfo;

}



