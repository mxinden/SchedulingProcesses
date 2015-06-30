/**
 * Created by indenml on 21.06.15.
 */
public class Process {

    private String ProcessID;
    private Integer ProcessingTime;
    private Integer ArrivalTime;
    private Float IOBlockProbability;
    private Integer IOBlockTime;

    public Process(String ProceddID, Integer ProcessingTime, Integer ArrivalTime, Float IOBlockProbability, Integer IOBlockTime){

        this.ProcessID = ProceddID;
        this.ProcessingTime = ProcessingTime;
        this.ArrivalTime = ArrivalTime;
        this.IOBlockProbability = IOBlockProbability;
        this.IOBlockTime = IOBlockTime;

    }

    public void setProcessingTime(Integer processingTime) {
        ProcessingTime = processingTime;
    }

    public Float getIOBlockProbability() {
        return IOBlockProbability;
    }

    public String getProcessID() {
        return ProcessID;
    }

    public Integer getProcessingTime() { return ProcessingTime; }

    public Integer getArrivalTime() {
        return ArrivalTime;
    }

    public Integer getIOBlockTime() {
        return IOBlockTime;
    }

    public Process clone(){ return new Process(this.ProcessID, this.ProcessingTime, this.ArrivalTime, this.IOBlockProbability, this.IOBlockTime);}
}
