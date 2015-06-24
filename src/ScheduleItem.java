/**
 * Created by indenml on 24.06.15.
 */
public class ScheduleItem {
    String itemID;
    Integer startTime;
    Integer endTime;
    Boolean finished;

    public ScheduleItem(String itemID, Integer startTime, Integer endTime, Boolean finished){
        this.itemID = itemID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.finished = finished;
    }

    public String getItemID() {
        return itemID;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public Boolean getFinished() {
        return finished;
    }
}