package com.nordicsemi.nrfUARTv2;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class ReconnectJobService extends JobService {
    private static final String TAG = ReconnectJobService.class.getSimpleName();
    boolean isWorking = false;
    boolean jobCancelled = false;

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "Job started!");
        isWorking = true;
        startWorkOnNewThread(params);
        return isWorking;
    }

    private void startWorkOnNewThread(final JobParameters params) {
        new Thread(new Runnable() {
            public void run() {
                doWork(params);
            }
        }).start();
    }

    private void doWork(JobParameters params) {
        //do stuff
        //finished
        Log.d(TAG, "Job finished!");
        isWorking = false;
        boolean needsReschedule = false;
        jobFinished(params, needsReschedule);
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
