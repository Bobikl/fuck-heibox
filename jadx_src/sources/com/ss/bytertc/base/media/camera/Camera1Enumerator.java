package com.ss.bytertc.base.media.camera;

import android.hardware.Camera;
import android.os.SystemClock;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.base.media.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;
    private final boolean isDesktopMode;

    public Camera1Enumerator() {
        this(true, false);
    }

    public Camera1Enumerator(boolean z10, boolean z11) {
        this.captureToTexture = z10;
        this.isDesktopMode = z11;
    }

    static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i10) {
        int i11;
        RXLogging.w(TAG, "Get supported formats for camera index " + i10 + ".");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Camera cameraOpen = null;
        try {
            try {
                RXLogging.w(TAG, "Opening camera with index " + i10);
                cameraOpen = Camera.open(i10);
                Camera.Parameters parameters = cameraOpen.getParameters();
                cameraOpen.release();
                ArrayList arrayList = new ArrayList();
                if (parameters != null) {
                    try {
                        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                        int i12 = 0;
                        if (supportedPreviewFpsRange != null) {
                            int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                            i12 = iArr[0];
                            i11 = iArr[1];
                        } else {
                            i11 = 0;
                        }
                        for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                            arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i12, i11));
                        }
                    } catch (Exception e10) {
                        RXLogging.e(TAG, "getSupportedFormats() failed on camera index " + i10, e10);
                    }
                }
                RXLogging.w(TAG, "Get supported formats for camera index " + i10 + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e11) {
                RXLogging.e(TAG, "Open camera failed on camera index " + i10, e11);
                ArrayList arrayList2 = new ArrayList();
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
                return arrayList2;
            }
        } catch (Throwable th2) {
            if (cameraOpen != null) {
                cameraOpen.release();
            }
            throw th2;
        }
    }

    static int getCameraIndex(String str) {
        RXLogging.w(TAG, "getCameraIndex: " + str);
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            if (str.equals(getDeviceName(i10))) {
                return i10;
            }
        }
        throw new IllegalArgumentException("No such camera: " + str);
    }

    @p0
    private static Camera.CameraInfo getCameraInfo(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i10, cameraInfo);
            return cameraInfo;
        } catch (Exception e10) {
            RXLogging.e(TAG, "getCameraInfo failed on index " + i10, e10);
            return null;
        }
    }

    @p0
    static String getDeviceName(int i10) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i10);
        if (cameraInfo == null) {
            return null;
        }
        return "Camera " + i10 + ", Facing " + (cameraInfo.facing == 1 ? "front" : com.alipay.sdk.m.x.d.f39542v) + ", Orientation " + cameraInfo.orientation;
    }

    static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i10) {
        if (cachedSupportedFormats == null) {
            cachedSupportedFormats = new ArrayList();
            for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
                cachedSupportedFormats.add(enumerateFormats(i11));
            }
        }
        return cachedSupportedFormats.get(i10);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture, this.isDesktopMode);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            String deviceName = getDeviceName(i10);
            if (deviceName != null) {
                arrayList.add(deviceName);
                RXLogging.w(TAG, "Index: " + i10 + ". " + deviceName);
            } else {
                RXLogging.e(TAG, "Index: " + i10 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public int getDeviceOrientation(String str) {
        return getCameraInfo(getCameraIndex(str)).orientation;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }
}
