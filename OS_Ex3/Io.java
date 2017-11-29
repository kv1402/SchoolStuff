/**
 * This class implements functionality associated with
 * the I/O device of the simulated system.
 */
public class Io implements Constants {
    /** A reference to the GUI interface */
    private Gui gui;
    /** The queue of processes waiting to perform I/O */
    private Queue ioQueue;
    /** The process that is currently performing I/O */
    private Process activeProcess;
    /** A reference to the statistics collector */
    private Statistics statistics;
    /** The average duration of an I/O operation */
    private long avgIoTime;

    /**
     * Creates a new I/O device with the given parameters.
     * @param gui			A reference to the GUI interface.
     * @param ioQueue		The I/O queue to be used.
     * @param avgIoTime		The average duration of an I/O operation.
     * @param statistics	A reference to the statistics collector.
     */
    public Io(Gui gui, Queue ioQueue, long avgIoTime, Statistics statistics) {
        this.gui = gui;
        this.ioQueue = ioQueue;
        this.avgIoTime = avgIoTime;
        this.statistics = statistics;
    }

    /**
     * Adds a process to the I/O queue, and initiates an I/O operation
     * if the device is free.
     * @param requestingProcess	The process to be added to the I/O queue.
     * @param clock				The time of the request.
     * @return					The event ending the I/O operation, or null
     *							if no operation was initiated.
     */
    public Event addIoRequest(Process requestingProcess, long clock) {
        // Add the process to the I/O queue
        ioQueue.insert(requestingProcess);
        requestingProcess.calculateTimeToNextIoOperation();
        // Check if a new I/O operation can be started
        return startIoOperation(clock);
    }

    /**
     * Starts a new I/O operation if the I/O device is free and there are
     * processes waiting to perform I/O.
     * @param clock		The global time.
     * @return			An event describing the end of the I/O operation that was started,
     *					or null	if no operation was initiated.
     */
    public Event startIoOperation(long clock) {
        if(activeProcess == null) {
            // The device is free
            if(!ioQueue.isEmpty()) {
                // Let the first process in the queue start I/O
                activeProcess = (Process)ioQueue.removeNext();
                activeProcess.enteredIo(clock);
                gui.setIoActive(activeProcess);
                // Update statistics
                statistics.nofProcessedIoOperations++;
                // Calculate the duration of the I/O operation and return the END_IO event
                int ioOperationTime = 1 + (int)(2*Math.random()*avgIoTime);
                return new Event(END_IO, clock + ioOperationTime);
            }
            else
                // No processes are waiting for I/O
                return null;
        }
        else
            // Another process is already doing I/O
            return null;
    }

    /**
     * This method is called when a discrete amount of time has passed.
     * @param timePassed	The amount of time that has passed since the last call to this method.
     */
    public void timePassed(long timePassed) {
        statistics.ioQueueLengthTime += ioQueue.getQueueLength()*timePassed;
        if(ioQueue.getQueueLength() > statistics.ioQueueLargestLength) {
            statistics.ioQueueLargestLength = ioQueue.getQueueLength();
        }
    }

    /**
     * Removes the process currently doing I/O from the I/O device.
     * @return	The process that was doing I/O, or null if no process was doing I/O.
     */
    public Process removeActiveProcess() {
        Process p = activeProcess;
        activeProcess = null;
        gui.setIoActive(null);
        return p;
    }
}
