package iwms.spring_wechat.base.base;

import lombok.Data;

@Data
public class SystemReq {
    private String userId;
    private String factoryId;
    private String userTypeId;
    private String deptId;
    private String empTypeId;
    private String roleUserId;
    private String sysUserId;
    private String SaleOrderId;
    private String materialCategoryId;
    private String materialId;
    private String saleOrderDetailId;
    private String openId;
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSaleOrderDetailId() {
        return saleOrderDetailId;
    }

    public void setSaleOrderDetailId(String saleOrderDetailId) {
        this.saleOrderDetailId = saleOrderDetailId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialCategoryId() {
        return materialCategoryId;
    }

    public void setMaterialCategoryId(String materialCategoryId) {
        this.materialCategoryId = materialCategoryId;
    }

    public String getSaleOrderId() {
        return SaleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        SaleOrderId = saleOrderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(String empTypeId) {
        this.empTypeId = empTypeId;
    }

    public String getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(String roleUserId) {
        this.roleUserId = roleUserId;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }
}
