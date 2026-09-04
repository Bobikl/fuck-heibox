package com.tencent.liteav.videoproducer2;

import android.os.Looper;
import android.view.OrientationEventListener;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.x;
import com.tencent.liteav.videobase.videobase.SystemDisplayInfo;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class SystemNotificationMonitor extends OrientationEventListener implements x.a {
    private static final int SENSOR_ROTATION_DETECTION_THRESHOLD = 30;
    private l mDisplayRotation;
    private int mLastOrientation;
    private volatile long mListenerPtr;
    private l mSensorRotation;
    private volatile x mTimer;

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100864a;

        static {
            int[] iArr = new int[l.values().length];
            f100864a = iArr;
            try {
                iArr[l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100864a[l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100864a[l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100864a[l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SystemNotificationMonitor() {
        super(ContextUtils.getApplicationContext());
        this.mLastOrientation = -1;
        this.mTimer = null;
        this.mListenerPtr = 0L;
        this.mSensorRotation = null;
        this.mDisplayRotation = null;
    }

    private l getSensorRotationByDisplayRotation(l lVar) {
        if (lVar == null) {
            return l.NORMAL;
        }
        int i10 = AnonymousClass1.f100864a[lVar.ordinal()];
        if (i10 == 1) {
            return l.ROTATION_270;
        }
        if (i10 != 2) {
            return i10 != 3 ? l.NORMAL : l.ROTATION_90;
        }
        return l.ROTATION_180;
    }

    private l getSensorRotationCorrection() {
        if (this.mListenerPtr == 0) {
            return null;
        }
        int iNativeGetGravitySensorRotationCorrection = nativeGetGravitySensorRotationCorrection(this.mListenerPtr);
        if (l.b(iNativeGetGravitySensorRotationCorrection)) {
            return l.a(iNativeGetGravitySensorRotationCorrection);
        }
        return null;
    }

    private static native synchronized int nativeGetGravitySensorRotationCorrection(long j10);

    private static native void nativeSensorChanged(long j10, int i10, int i11);

    private synchronized void notifyOrientationChanged() {
        int i10;
        if (this.mListenerPtr == 0) {
            return;
        }
        if (getSensorRotationCorrection() != null) {
            i10 = getSensorRotationCorrection().mValue;
        } else {
            l lVar = this.mSensorRotation;
            i10 = lVar != null ? lVar.mValue : 0;
        }
        l lVar2 = this.mDisplayRotation;
        nativeSensorChanged(this.mListenerPtr, i10, lVar2 != null ? lVar2.mValue : 0);
    }

    public synchronized void initialize(long j10) {
        this.mListenerPtr = j10;
        if (this.mTimer != null) {
            return;
        }
        super.enable();
        this.mTimer = new x(Looper.getMainLooper(), this);
        this.mTimer.a(1000);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        l lVar;
        if (i10 == -1) {
            return;
        }
        int i11 = this.mLastOrientation;
        if (i11 == -1 || Math.abs(i10 - i11) > 30) {
            this.mLastOrientation = i10;
            if (i10 <= 45) {
                lVar = l.NORMAL;
            } else if (i10 <= 135) {
                lVar = l.ROTATION_90;
            } else if (i10 <= 225) {
                lVar = l.ROTATION_180;
            } else if (i10 <= 315) {
                lVar = l.ROTATION_270;
            } else {
                lVar = l.NORMAL;
            }
            if (this.mSensorRotation != lVar) {
                this.mSensorRotation = lVar;
                this.mDisplayRotation = l.a(SystemDisplayInfo.getDisplayRotationDegree());
                notifyOrientationChanged();
            }
        }
    }

    @Override // com.tencent.liteav.base.util.x.a
    public void onTimeout() {
        l lVarA = l.a(SystemDisplayInfo.getDisplayRotationDegree());
        if (this.mDisplayRotation == lVarA) {
            return;
        }
        this.mDisplayRotation = lVarA;
        if (this.mSensorRotation == null) {
            this.mSensorRotation = getSensorRotationByDisplayRotation(lVarA);
        }
        notifyOrientationChanged();
    }

    public synchronized void uninitialize() {
        super.disable();
        this.mListenerPtr = 0L;
        if (this.mTimer != null) {
            this.mTimer.a();
            this.mTimer = null;
        }
    }
}
