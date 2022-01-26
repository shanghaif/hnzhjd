package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("room_arrange_detail")
public class RoomArrangeDetail implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:安排id
	 */
	@TableField(value="arrange_id",exist=true)
	java.lang.Integer arrangeId;
	
	/**
	 * 属性描述:房间号
	 */
	@TableField(value="room_number",exist=true)
	java.lang.String roomNumber;
	
	/**
	 * 属性描述:入住人员
	 */
	@TableField(value="attendance_id",exist=true)
	java.lang.Integer attendanceId;
	
	/**
	 * 属性描述:备注
	 */
	@TableField(value="remark",exist=true)
	java.lang.String remark;
	
	/**
	 * 属性描述:房间电话
	 */
	@TableField(value="telephone",exist=true)
	java.lang.String telephone;
	
	/**
	 * 属性描述:时间为毫秒，0为每天都居住，其他为特定时间居住；添加时，请支持批量插入
	 */
	@TableField(value="date",exist=true)
	java.lang.Long date;

	/**
	 * 属性描述:0=正常 1=删除
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;

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
	
	
	public java.lang.Integer getArrangeId(){
		return this.arrangeId;
	}
	
	public void setArrangeId(java.lang.Integer arrangeId){
		this.arrangeId=arrangeId;
	}
	
	
	public java.lang.String getRoomNumber(){
		return this.roomNumber;
	}
	
	public void setRoomNumber(java.lang.String roomNumber){
		this.roomNumber=roomNumber;
	}
	
	
	public java.lang.Integer getAttendanceId(){
		return this.attendanceId;
	}
	
	public void setAttendanceId(java.lang.Integer attendanceId){
		this.attendanceId=attendanceId;
	}
	
	
	public java.lang.String getRemark(){
		return this.remark;
	}
	
	public void setRemark(java.lang.String remark){
		this.remark=remark;
	}
	
	
	public java.lang.String getTelephone(){
		return this.telephone;
	}
	
	public void setTelephone(java.lang.String telephone){
		this.telephone=telephone;
	}
	
	
	public java.lang.Long getDate(){
		return this.date;
	}
	
	public void setDate(java.lang.Long date){
		this.date=date;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", arrangeId=").append(arrangeId);			
			sb.append(", roomNumber=").append(roomNumber);			
			sb.append(", attendanceId=").append(attendanceId);			
			sb.append(", remark=").append(remark);			
			sb.append(", telephone=").append(telephone);			
			sb.append(", date=").append(date);			
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
        RoomArrangeDetail other = (RoomArrangeDetail) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getArrangeId() == null ? other.getId() == null : this.getArrangeId().equals(other.getArrangeId()))		
				        		&&(this.getRoomNumber() == null ? other.getId() == null : this.getRoomNumber().equals(other.getRoomNumber()))		
				        		&&(this.getAttendanceId() == null ? other.getId() == null : this.getAttendanceId().equals(other.getAttendanceId()))		
				        		&&(this.getRemark() == null ? other.getId() == null : this.getRemark().equals(other.getRemark()))		
				        		&&(this.getTelephone() == null ? other.getId() == null : this.getTelephone().equals(other.getTelephone()))		
				        		&&(this.getDate() == null ? other.getId() == null : this.getDate().equals(other.getDate()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getArrangeId() == null) ? 0 : getArrangeId().hashCode());		
		        result = prime * result + ((getRoomNumber() == null) ? 0 : getRoomNumber().hashCode());		
		        result = prime * result + ((getAttendanceId() == null) ? 0 : getAttendanceId().hashCode());		
		        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());		
		        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());		
		        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());		
		;
        return result;
    }

}
