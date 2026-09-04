package com.tencent.ugc.beauty.decoder;

import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Stage {
    protected static final int DEFAULT_FRAME_COUNT = 3;
    private static final String TAG = "Stage";
    protected State mState = State.INIT;

    public enum State {
        INIT,
        SETUPED,
        ALL_DATA_READY,
        DONE
    }

    protected boolean isAllDataReady() {
        State state = this.mState;
        return state == State.ALL_DATA_READY || state == State.DONE;
    }

    public boolean isDone() {
        return this.mState == State.DONE;
    }

    public abstract void processFrame() throws ProcessException;

    public abstract void release();

    protected void setState(State state) {
        this.mState = state;
        if (State.DONE == state) {
            LiteavLog.i(TAG, this + "is done");
        }
    }

    public abstract void setup() throws SetupException;
}
