package com.ss.bytertc.audio.device.hwearback;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseEarback implements IHardWareEarback {
    public static final int RESULT_INVALID_STATE = -2;
    public static final int RESULT_OP_FAILED = -1;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "BaseEarback";
    protected final Context context;
    private volatile EarbackState state = EarbackState.IDLE;
    protected final WebRtcAudioEarBack webRtcAudioEarBack;

    public enum EarbackState {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        RUNNING
    }

    protected BaseEarback(Context context, WebRtcAudioEarBack webRtcAudioEarBack) {
        this.context = context;
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    private void changeState(EarbackState earbackState) {
        RXLogging.i(TAG, "changeState: " + this.state + " -> " + earbackState);
        EarbackState earbackState2 = this.state;
        this.state = earbackState;
        if (earbackState2 != earbackState) {
            onStateChanged(earbackState2, earbackState);
        }
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int close() {
        RXLogging.i(TAG, "close() with state: " + this.state);
        if (this.state != EarbackState.RUNNING) {
            return -2;
        }
        if (!onClose()) {
            return -1;
        }
        changeState(EarbackState.INITIALIZED);
        return 0;
    }

    public EarbackState getState() {
        return this.state;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int init() {
        RXLogging.i(TAG, "init() with state: " + this.state);
        if (this.state.ordinal() >= EarbackState.INITIALIZED.ordinal()) {
            this.webRtcAudioEarBack.onHardwareEarbackSupported(isSupport());
        } else if (this.state == EarbackState.INITIALIZING) {
            return 0;
        }
        changeState(EarbackState.INITIALIZING);
        onInit();
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        if (this.state.ordinal() < EarbackState.INITIALIZED.ordinal()) {
            return false;
        }
        return onIsSupportCall();
    }

    protected abstract boolean onClose();

    protected abstract void onInit();

    protected synchronized void onInitResult(boolean z10) {
        if (this.state == EarbackState.INITIALIZING) {
            this.state = z10 ? EarbackState.INITIALIZED : EarbackState.IDLE;
            this.webRtcAudioEarBack.onHardwareEarbackSupported(z10 && isSupport());
        }
    }

    protected abstract boolean onIsSupportCall();

    protected abstract boolean onOpen();

    protected abstract void onRelease();

    protected synchronized void onStateChanged(EarbackState earbackState, EarbackState earbackState2) {
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int open() {
        RXLogging.i(TAG, "open() with state: " + this.state);
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.RUNNING;
        if (earbackState == earbackState2) {
            return 0;
        }
        if (this.state == EarbackState.INITIALIZED && isSupport()) {
            if (!onOpen()) {
                return -1;
            }
            changeState(earbackState2);
            return 0;
        }
        return -2;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int release() {
        RXLogging.i(TAG, "release() with state: " + this.state);
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.IDLE;
        if (earbackState == earbackState2) {
            return 0;
        }
        onRelease();
        changeState(earbackState2);
        return 0;
    }
}
