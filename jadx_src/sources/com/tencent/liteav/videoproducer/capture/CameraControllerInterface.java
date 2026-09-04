package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.w;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public abstract class CameraControllerInterface {
    public static final int CAMERA_ERROR_DEVICE = 4;
    public static final int CAMERA_ERROR_DISABLED = 2;
    public static final int CAMERA_ERROR_OCCUPIED = 1;
    public static final int CAMERA_ERROR_SERVER_DIED = 3;
    public static final int CAMERA_ERROR_UNKNOWN = 0;
    private static final String TAG = "CameraControllerInterface";

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100681a;

        static {
            int[] iArr = new int[a.values().length];
            f100681a = iArr;
            try {
                iArr[a.CAMERA_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100681a[a.CAMERA_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum a {
        MOCK(0),
        CAMERA_1(1),
        CAMERA_2(2);

        private final int mValue;

        a(int i10) {
            this.mValue = i10;
        }

        public static a a(int i10) {
            for (a aVar : values()) {
                if (aVar.mValue == i10) {
                    return aVar;
                }
            }
            return CAMERA_1;
        }
    }

    public static CameraControllerInterface createCameraController(int i10, final Handler handler) {
        CameraControllerInterface aVar;
        a aVarA = a.a(i10);
        if (AnonymousClass1.f100681a[aVarA.ordinal()] != 1) {
            aVar = new com.tencent.liteav.videoproducer.capture.a.a();
        } else {
            handler.getClass();
            aVar = new com.tencent.liteav.videoproducer.capture.b.a(new w(handler) { // from class: com.tencent.liteav.videoproducer.capture.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f100706a;

                {
                    this.f100706a = handler;
                }

                @Override // com.tencent.liteav.base.util.w
                public final void a(Runnable runnable) {
                    this.f100706a.post(runnable);
                }
            });
        }
        LiteavLog.i(TAG, "createCameraController, CameraAPIType:" + aVarA + ", return camera controller: " + aVar);
        return aVar;
    }

    public static boolean hasCameraPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || LiteavSystemInfo.getSystemOSVersionInt() < 23 || applicationContext.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0;
    }

    public abstract void enableCameraFpsCorrectionLogic(boolean z10);

    public abstract void enableTapToFocus(boolean z10);

    public abstract l getCameraSystemRotation();

    public abstract int getCameraSystemRotationValue();

    public abstract int getMaxZoom();

    public abstract Size getPreviewSize();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusPositionInPreviewSupported();

    public abstract boolean isCurrentPreviewSizeAspectRatioMatch(int i10, int i11, boolean z10);

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public abstract void setCameraRotationCorrectionValue(int i10);

    public abstract void setExposureCompensation(float f10);

    public abstract void setZoom(float f10);

    public abstract void startAutoFocusAtPosition(int i10, int i11);

    public abstract boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback);

    public abstract void stopCapture();

    public abstract void turnOnTorch(boolean z10);
}
