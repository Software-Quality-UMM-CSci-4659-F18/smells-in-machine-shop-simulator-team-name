package applications;

import applications.MachineShopSimulator.Job;
import dataStructures.LinkedQueue;

public class Machine {
    // data members
    private LinkedQueue jobQ; // queue of waiting jobs for this machine
    int changeTime; // machine change-over time
    int totalWait; // total delay at this machine
    int numTasks; // number of tasks processed on this machine
    Job activeJob; // job currently active on this machine

    // constructor
    public Machine() {
        setJobQ(new LinkedQueue());
    }

    public LinkedQueue getJobQ() {
        return jobQ;
    }

    public void setJobQ(LinkedQueue jobQ) {
        this.jobQ = jobQ;
    }
}