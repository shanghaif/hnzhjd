package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("room_arrange")
public class RoomArrange implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:安保人员的attendance_id
	 */
	@TableField(value="guard_attendance_id",exist=true)
	java.lang.Integer guardAttendanceId;
	
	/**
	 * 属性描述:负责人的attendance_id
	 */
	@TableField(value="charger_attendance_id",exist=true)
	java.lang.Integer chargerAttendanceId;
	
	/**
	 * 属性描述:酒店id
	 */
	@TableField(value="hotel_id",exist=true)
	java.lang.Integer hotelId;
	
	/**
	 * 属性描述:接待访问id
	 */
	@TableField(value="reception_id",exist=true)
	java.lang.Integer receptionId;
	
	/**
	 * 属性描述:访问活动id
	 */
	@TableField(value="event_id",exist=true)
	java.lang.Integer eventId;
	
	/**
	 * 属性描述:起始日期，毫秒
	 */
	@TableField(value="start_time",exist=true)
	java.lang.Long startTime;
	
	/**
	 * 属性描述:居住结束日期，毫秒
	 */
	@TableField(value="end_time",exist=true)
	java.lang.Long endTime;

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
	
	
	public java.lang.Integer getGuardAttendanceId(){
		return this.guardAttendanceId;
	}
	
	public void setGuardAttendanceId(java.lang.Integer guardAttendanceId){
		this.guardAttendanceId=guardAttendanceId;
	}
	
	
	public java.lang.Integer getChargerAttendanceId(){
		return this.chargerAttendanceId;
	}
	
	public void setChargerAttendanceId(java.lang.Integer chargerAttendanceId){
		this.chargerAttendanceId=chargerAttendanceId;
	}
	
	
	public java.lang.Integer getHotelId(){
		return this.hotelId;
	}
	
	public void setHotelId(java.lang.Integer hotelId){
		this.hotelId=hotelId;
	}
	
	
	public java.lang.Integer getReceptionId(){
		return this.receptionId;
	}
	
	public void setReceptionId(java.lang.Integer receptionId){
		this.receptionId=receptionId;
	}
	
	
	public java.lang.Integer getEventId(){
		return this.eventId;
	}
	
	public void setEventId(java.lang.Integer eventId){
		this.eventId=eventId;
	}


	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", guardAttendanceId=").append(guardAttendanceId);			
			sb.append(", chargerAttendanceId=").append(chargerAttendanceId);			
			sb.append(", hotelId=").append(hotelId);			
			sb.append(", receptionId=").append(receptionId);			
			sb.append(", eventId=").append(eventId);			
			sb.append(", startTime=").append(startTime);
			sb.append(", endTime=").append(endTime);
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
        RoomArrange other = (RoomArrange) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getGuardAttendanceId() == null ? other.getId() == null : this.getGuardAttendanceId().equals(other.getGuardAttendanceId()))		
				        		&&(this.getChargerAttendanceId() == null ? other.getId() == null : this.getChargerAttendanceId().equals(other.getChargerAttendanceId()))		
				        		&&(this.getHotelId() == null ? other.getId() == null : this.getHotelId().equals(other.getHotelId()))		
				        		&&(this.getReceptionId() == null ? other.getId() == null : this.getReceptionId().equals(other.getReceptionId()))		
				        		&&(this.getEventId() == null ? other.getId() == null : this.getEventId().equals(other.getEventId()))		
				        		&&(this.getStartTime() == null ? other.getId() == null : this.getStartTime().equals(other.getStartTime()))
				        		&&(this.getEndTime() == null ? other.getId() == null : this.getEndTime().equals(other.getEndTime()))
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getGuardAttendanceId() == null) ? 0 : getGuardAttendanceId().hashCode());		
		        result = prime * result + ((getChargerAttendanceId() == null) ? 0 : getChargerAttendanceId().hashCode());		
		        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());		
		        result = prime * result + ((getReceptionId() == null) ? 0 : getReceptionId().hashCode());		
		        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());		
		        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
		        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		;
        return result;
    }

}
