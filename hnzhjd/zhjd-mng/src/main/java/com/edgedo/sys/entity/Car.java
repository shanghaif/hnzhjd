package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("car")
public class Car implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:组织id
	 */
	@TableField(value="org_id",exist=true)
	java.lang.Integer orgId;
	
	/**
	 * 属性描述:车型名称
	 */
	@TableField(value="name",exist=true)
	java.lang.String name;
	
	/**
	 * 属性描述:车牌号
	 */
	@TableField(value="code",exist=true)
	java.lang.String code;
	
	/**
	 * 属性描述:备注
	 */
	@TableField(value="remark",exist=true)
	java.lang.String remark;
	
	/**
	 * 属性描述:座位数
	 */
	@TableField(value="seats",exist=true)
	java.lang.Integer seats;

	/**
	 * 属性描述:0=正常 1=删除
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;

	@TableField(value="car_type",exist=true)
	java.lang.String carType;

	/**
	 * 组织id对应的组织部门
	 */
	java.lang.String orgDepartment;

	public String getOrgDepartment() {
		return orgDepartment;
	}

	public void setOrgDepartment(String orgDepartment) {
		this.orgDepartment = orgDepartment;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public java.lang.Integer getId(){
		return this.id;
	}
	
	public void setId(java.lang.Integer id){
		this.id=id;
	}
	
	
	public java.lang.Integer getOrgId(){
		return this.orgId;
	}
	
	public void setOrgId(java.lang.Integer orgId){
		this.orgId=orgId;
	}
	
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public void setName(java.lang.String name){
		this.name=name;
	}
	
	
	public java.lang.String getCode(){
		return this.code;
	}
	
	public void setCode(java.lang.String code){
		this.code=code;
	}
	
	
	public java.lang.String getRemark(){
		return this.remark;
	}
	
	public void setRemark(java.lang.String remark){
		this.remark=remark;
	}
	
	
	public java.lang.Integer getSeats(){
		return this.seats;
	}
	
	public void setSeats(java.lang.Integer seats){
		this.seats=seats;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", orgId=").append(orgId);			
			sb.append(", name=").append(name);			
			sb.append(", code=").append(code);			
			sb.append(", remark=").append(remark);			
			sb.append(", seats=").append(seats);
			sb.append(", carType=").append(carType);
			sb.append(", orgDepartment=").append(orgDepartment);
        sb.append("]");
        return sb.toString();
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Car other = (Car) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getOrgId() == null ? other.getId() == null : this.getOrgId().equals(other.getOrgId()))		
				        		&&(this.getName() == null ? other.getId() == null : this.getName().equals(other.getName()))		
				        		&&(this.getCode() == null ? other.getId() == null : this.getCode().equals(other.getCode()))		
				        		&&(this.getRemark() == null ? other.getId() == null : this.getRemark().equals(other.getRemark()))		
				        		&&(this.getSeats() == null ? other.getId() == null : this.getSeats().equals(other.getSeats()))
								&&(this.getCarType() == null ? other.getId() == null : this.getCarType().equals(other.getCarType()))
    							&&(this.getOrgDepartment() == null ? other.getId() == null : this.getOrgDepartment().equals(other.getOrgDepartment()));
	}


  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());		
		        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());		
		        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());		
		        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());		
		        result = prime * result + ((getSeats() == null) ? 0 : getSeats().hashCode());
				result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
				result = prime * result + ((getOrgDepartment() == null) ? 0 : getOrgDepartment().hashCode());
		;
        return result;
    }

}
