package com.edgedo.sys.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("restaurant_arrange")
public class RestaurantArrange implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:会餐开始时间
	 */
	@TableField(value="use_time",exist=true)
	java.util.Date useTime;
	
	/**
	 * 属性描述:会餐结束时间
	 */
	@TableField(value="end_time",exist=true)
	java.util.Date endTime;
	
	/**
	 * 属性描述:用餐场所id
	 */
	@TableField(value="restaurant_id",exist=true)
	java.lang.Integer restaurantId;
	
	/**
	 * 属性描述:安保负责人。对应attendance_id
	 */
	@TableField(value="guard_attendance_id",exist=true)
	java.lang.Integer guardAttendanceId;
	
	/**
	 * 属性描述:接待负责人。对应attendance_id
	 */
	@TableField(value="charger_attendance_id",exist=true)
	java.lang.Integer chargerAttendanceId;
	
	/**
	 * 属性描述:宴会安排的文档地址（传一个word文档）
	 */
	@TableField(value="banquet_doc",exist=true)
	java.lang.String banquetDoc;
	
	/**
	 * 属性描述:陪同人员描述，参考设计稿
	 */
	@TableField(value="participant_brief",exist=true)
	java.lang.String participantBrief;
	
	/**
	 * 属性描述:会餐人员，逗号分隔的attendance_id
	 */
	@TableField(value="attendees",exist=true)
	java.lang.String attendees;
	
	/**
	 * 属性描述:用餐人员的座位分布图片
	 */
	@TableField(value="attendees_placement",exist=true)
	java.lang.String attendeesPlacement;
	
	/**
	 * 属性描述:桌号（或桌名或包间名）。相当于车辆安排里的group，但这个需要编辑手输
	 */
	@TableField(value="dining_table",exist=true)
	java.lang.String diningTable;
	
	/**
	 * 属性描述:来访id
	 */
	@TableField(value="reception_id",exist=true)
	java.lang.Integer receptionId;
	
	/**
	 * 属性描述:活动id
	 */
	@TableField(value="event_id",exist=true)
	java.lang.Integer eventId;

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

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public java.lang.Integer getRestaurantId(){
		return this.restaurantId;
	}
	
	public void setRestaurantId(java.lang.Integer restaurantId){
		this.restaurantId=restaurantId;
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
	
	
	public java.lang.String getBanquetDoc(){
		return this.banquetDoc;
	}
	
	public void setBanquetDoc(java.lang.String banquetDoc){
		this.banquetDoc=banquetDoc;
	}
	
	
	public java.lang.String getParticipantBrief(){
		return this.participantBrief;
	}
	
	public void setParticipantBrief(java.lang.String participantBrief){
		this.participantBrief=participantBrief;
	}
	
	
	public java.lang.String getAttendees(){
		return this.attendees;
	}
	
	public void setAttendees(java.lang.String attendees){
		this.attendees=attendees;
	}
	
	
	public java.lang.String getAttendeesPlacement(){
		return this.attendeesPlacement;
	}
	
	public void setAttendeesPlacement(java.lang.String attendeesPlacement){
		this.attendeesPlacement=attendeesPlacement;
	}
	
	
	public java.lang.String getDiningTable(){
		return this.diningTable;
	}
	
	public void setDiningTable(java.lang.String diningTable){
		this.diningTable=diningTable;
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
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", useTime=").append(useTime);
			sb.append(", endTime=").append(endTime);
			sb.append(", restaurantId=").append(restaurantId);			
			sb.append(", guardAttendanceId=").append(guardAttendanceId);			
			sb.append(", chargerAttendanceId=").append(chargerAttendanceId);			
			sb.append(", banquetDoc=").append(banquetDoc);			
			sb.append(", participantBrief=").append(participantBrief);			
			sb.append(", attendees=").append(attendees);			
			sb.append(", attendeesPlacement=").append(attendeesPlacement);			
			sb.append(", diningTable=").append(diningTable);			
			sb.append(", receptionId=").append(receptionId);			
			sb.append(", eventId=").append(eventId);			
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
        RestaurantArrange other = (RestaurantArrange) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getUseTime() == null ? other.getId() == null : this.getUseTime().equals(other.getUseTime()))
				        		&&(this.getEndTime() == null ? other.getId() == null : this.getEndTime().equals(other.getEndTime()))
				        		&&(this.getRestaurantId() == null ? other.getId() == null : this.getRestaurantId().equals(other.getRestaurantId()))		
				        		&&(this.getGuardAttendanceId() == null ? other.getId() == null : this.getGuardAttendanceId().equals(other.getGuardAttendanceId()))		
				        		&&(this.getChargerAttendanceId() == null ? other.getId() == null : this.getChargerAttendanceId().equals(other.getChargerAttendanceId()))		
				        		&&(this.getBanquetDoc() == null ? other.getId() == null : this.getBanquetDoc().equals(other.getBanquetDoc()))		
				        		&&(this.getParticipantBrief() == null ? other.getId() == null : this.getParticipantBrief().equals(other.getParticipantBrief()))		
				        		&&(this.getAttendees() == null ? other.getId() == null : this.getAttendees().equals(other.getAttendees()))		
				        		&&(this.getAttendeesPlacement() == null ? other.getId() == null : this.getAttendeesPlacement().equals(other.getAttendeesPlacement()))		
				        		&&(this.getDiningTable() == null ? other.getId() == null : this.getDiningTable().equals(other.getDiningTable()))		
				        		&&(this.getReceptionId() == null ? other.getId() == null : this.getReceptionId().equals(other.getReceptionId()))		
				        		&&(this.getEventId() == null ? other.getId() == null : this.getEventId().equals(other.getEventId()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
		        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		        result = prime * result + ((getRestaurantId() == null) ? 0 : getRestaurantId().hashCode());		
		        result = prime * result + ((getGuardAttendanceId() == null) ? 0 : getGuardAttendanceId().hashCode());		
		        result = prime * result + ((getChargerAttendanceId() == null) ? 0 : getChargerAttendanceId().hashCode());		
		        result = prime * result + ((getBanquetDoc() == null) ? 0 : getBanquetDoc().hashCode());		
		        result = prime * result + ((getParticipantBrief() == null) ? 0 : getParticipantBrief().hashCode());		
		        result = prime * result + ((getAttendees() == null) ? 0 : getAttendees().hashCode());		
		        result = prime * result + ((getAttendeesPlacement() == null) ? 0 : getAttendeesPlacement().hashCode());		
		        result = prime * result + ((getDiningTable() == null) ? 0 : getDiningTable().hashCode());		
		        result = prime * result + ((getReceptionId() == null) ? 0 : getReceptionId().hashCode());		
		        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());		
		;
        return result;
    }

}
