package com.ss.bytertc.audio.device.router;

import com.bytedance.realx.base.RXLogging;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes10.dex */
public class AudioRouteController implements IAudioRouteCallback {
    public static int EVENT_ONLY_LOG = 0;
    public static int EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE = 1;
    private static final String TAG = "AudioRouteController";

    @AudioRouteDeviceManager.RoutingDeviceType
    private int currentRouting = -1;
    private boolean isMediaMode = true;
    private ReadWriteLock lock;
    private AudioRouteDeviceManager mAudioRouteDeviceManager;
    private long nativeAudioRouteControllerPtr;
    private Lock rLock;
    private Lock wLock;

    private AudioRouteController(long j10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = this.lock.writeLock();
        this.nativeAudioRouteControllerPtr = j10;
        this.mAudioRouteDeviceManager = new AudioRouteDeviceManager(this);
    }

    private String getCaptureDeviceName() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getCaptureDeviceName();
        } finally {
            this.rLock.unlock();
        }
    }

    private String getRenderDeviceName() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getRenderDeviceName();
        } finally {
            this.rLock.unlock();
        }
    }

    private String getSessionInfo() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getSessionInfo();
        } finally {
            this.rLock.unlock();
        }
    }

    private int init() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0 && initAudioRouteDeviceManager() == 0) {
                return this.mAudioRouteDeviceManager.getDeviceState();
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    private int initAudioRouteDeviceManager() {
        int iInit = this.mAudioRouteDeviceManager.init();
        if (iInit != 0) {
            release();
            RXLogging.e(TAG, "init failed. code: " + iInit);
        }
        return iInit;
    }

    private native void onDeviceEvent(long j10, int i10, boolean z10);

    private native void onError(long j10, int i10);

    private int release() {
        this.wLock.lock();
        RXLogging.i(TAG, "AudioRouteController: release begin");
        int iRelease = 0;
        try {
            this.nativeAudioRouteControllerPtr = 0L;
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                iRelease = audioRouteDeviceManager.release();
                this.mAudioRouteDeviceManager = null;
            }
            this.currentRouting = -1;
            this.isMediaMode = true;
            return iRelease;
        } finally {
            RXLogging.i(TAG, "AudioRouteController: release end");
            this.wLock.unlock();
        }
    }

    private void restartBluetoothSco() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                audioRouteDeviceManager.restartBluetoothSco();
            }
        } finally {
            this.rLock.unlock();
        }
    }

    private int setAudioRoute(@AudioRouteDeviceManager.RoutingDeviceType int i10, boolean z10) {
        int audioRoute;
        StringBuilder sb2;
        this.rLock.lock();
        RXLogging.i(TAG, "AudioRouteController: setAudioRoute, begin, routing: " + i10 + ", isMediaMode: " + z10);
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                audioRoute = -5;
                sb2 = new StringBuilder();
            } else {
                this.isMediaMode = z10;
                audioRoute = this.mAudioRouteDeviceManager.setAudioRoute(i10, z10);
                this.currentRouting = audioRoute == 0 ? i10 : this.currentRouting;
                sb2 = new StringBuilder();
            }
            sb2.append("AudioRouteController: setAudioRoute, end, routing: ");
            sb2.append(i10);
            sb2.append(", isMediaMode: ");
            sb2.append(z10);
            String string = sb2.toString();
            return audioRoute;
        } finally {
            RXLogging.i(TAG, "AudioRouteController: setAudioRoute, end, routing: " + i10 + ", isMediaMode: " + z10);
            this.rLock.unlock();
        }
    }

    private int setSkipBluetoothConnectPermissionAbility(boolean z10) {
        int deviceState;
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0) {
                AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
                if (audioRouteDeviceManager != null) {
                    audioRouteDeviceManager.release();
                    this.mAudioRouteDeviceManager.setSkipBluetoothConnectPermissionAbility(z10, this);
                    if (initAudioRouteDeviceManager() == 0) {
                        deviceState = this.mAudioRouteDeviceManager.getDeviceState();
                    }
                } else {
                    deviceState = 0;
                }
                return deviceState;
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onDeviceEvent(int i10, boolean z10) {
        this.rLock.lock();
        RXLogging.i(TAG, "onDeviceEvent, begin, deviceType: " + i10 + ", connected: " + z10);
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            RXLogging.e(TAG, "AudioRouteController: onDeviceEvent(Java) deviceType:" + i10 + ", connected:" + z10);
            onDeviceEvent(this.nativeAudioRouteControllerPtr, i10, z10);
        } finally {
            RXLogging.i(TAG, "AudioRouteController: onDeviceEvent, end");
            this.rLock.unlock();
        }
    }

    @Override // com.ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onError(int i10, String str) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            RXLogging.e(TAG, "AudioRouteController: ERROR-" + i10 + ":" + str);
            if (i10 == EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE) {
                onError(this.nativeAudioRouteControllerPtr, i10);
            }
        } finally {
            this.rLock.unlock();
        }
    }
}
