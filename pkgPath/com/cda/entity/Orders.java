package com.cda.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单 
 * </p>
 *
 * @author cda
 * @since 2021-11-13
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID 同时也是订单编号
     */
    private String orderId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 产品名称（多个产品用,隔开）
     */
    private String untitled;

    /**
     * 收货人快照
     */
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    private String receiverAddress;

    /**
     * 订单总价格
     */
    private BigDecimal totalAmount;

    /**
     * 实际支付总价格
     */
    private Integer actualAmount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    private Integer payType;

    /**
     * 订单备注
     */
    private String orderRemark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    private String status;

    /**
     * 配送方式
     */
    private String deliveryType;

    /**
     * 物流单号
     */
    private String deliveryFlowId;

    /**
     * 订单运费 默认可以为零，代表包邮
     */
    private BigDecimal orderFreight;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    private Integer deleteStatus;

    /**
     * 创建时间（成交时间）
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 付款时间
     */
    private LocalDateTime payTime;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 完成时间
     */
    private LocalDateTime flishTime;

    /**
     * 取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    private Integer closeType;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUntitled() {
        return untitled;
    }

    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Integer actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryFlowId() {
        return deliveryFlowId;
    }

    public void setDeliveryFlowId(String deliveryFlowId) {
        this.deliveryFlowId = deliveryFlowId;
    }

    public BigDecimal getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(BigDecimal orderFreight) {
        this.orderFreight = orderFreight;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDateTime getFlishTime() {
        return flishTime;
    }

    public void setFlishTime(LocalDateTime flishTime) {
        this.flishTime = flishTime;
    }

    public LocalDateTime getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(LocalDateTime cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getCloseType() {
        return closeType;
    }

    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }

    @Override
    public String toString() {
        return "Orders{" +
        "orderId=" + orderId +
        ", userId=" + userId +
        ", untitled=" + untitled +
        ", receiverName=" + receiverName +
        ", receiverMobile=" + receiverMobile +
        ", receiverAddress=" + receiverAddress +
        ", totalAmount=" + totalAmount +
        ", actualAmount=" + actualAmount +
        ", payType=" + payType +
        ", orderRemark=" + orderRemark +
        ", status=" + status +
        ", deliveryType=" + deliveryType +
        ", deliveryFlowId=" + deliveryFlowId +
        ", orderFreight=" + orderFreight +
        ", deleteStatus=" + deleteStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", payTime=" + payTime +
        ", deliveryTime=" + deliveryTime +
        ", flishTime=" + flishTime +
        ", cancelTime=" + cancelTime +
        ", closeType=" + closeType +
        "}";
    }
}
