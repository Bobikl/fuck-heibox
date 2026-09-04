package com.ishumei.smantifraud;

import android.os.Handler;
import android.os.HandlerThread;
import com.ishumei.smantifraud.l1111l111111Il.l11l111l1lll;
import com.ishumei.smantifraud.l111l11111lIl.l111l11111I1l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbsDetector extends l11l111l1lll {
    protected static final int DEFAULT_INTERVAL = 5000;
    protected static final int MIN_INTERVAL = 1000;
    protected boolean isEmergency;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    protected int mIntervalMs = 5000;
    private final Runnable mTimeTask = new Runnable() { // from class: com.ishumei.smantifraud.AbsDetector.1
        @Override // java.lang.Runnable
        public final void run() {
            AbsDetector.this.detect();
            AbsDetector.this.mHandler.postDelayed(AbsDetector.this.mTimeTask, AbsDetector.this.mIntervalMs);
        }
    };
    private int mCurrentSerial = l111l11111I1l.l1111l111111Il().l1111l111111Il(getEventId());

    protected boolean detect() {
        return false;
    }

    protected synchronized int getAndIncrementSerial() {
        int i10;
        i10 = this.mCurrentSerial;
        if (i10 >= Integer.MAX_VALUE) {
            this.mCurrentSerial = 0;
        } else {
            this.mCurrentSerial = i10 + 1;
        }
        l111l11111I1l.l1111l111111Il().l1111l111111Il(getEventId(), this.mCurrentSerial);
        return i10;
    }

    public abstract String getEventId();

    public VDataListener getListener() {
        return this.mListener;
    }

    protected int getVersionCode() {
        return 0;
    }

    protected synchronized void start() {
    }

    protected synchronized void startTimer() {
        if (this.mHandlerThread != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sm-detector-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.mHandlerThread.getLooper());
        this.mHandler = handler;
        handler.postDelayed(this.mTimeTask, this.mIntervalMs);
    }

    protected synchronized void stop() {
    }

    protected synchronized void stopTimer() {
        try {
            if (this.mHandlerThread == null) {
                return;
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.mHandlerThread.quitSafely();
            this.mHandlerThread = null;
        } catch (Exception unused) {
        }
    }
}
