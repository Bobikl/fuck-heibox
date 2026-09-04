package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: CameraConfigImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f61790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Point f61791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Point f61792c;

    private Point a(Camera.Parameters parameters, Point point, boolean z10) {
        List<Camera.Size> supportedPreviewSizes = !z10 ? parameters.getSupportedPreviewSizes() : parameters.getSupportedPictureSizes();
        if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
            return a(supportedPreviewSizes, point);
        }
        Log.e("CameraManager", "CameraConfigImpl::findCameraResolution camera not support");
        return new Point(0, 0);
    }

    private Point a(List<Camera.Size> list, Point point) {
        double d10 = ((double) point.x) / ((double) point.y);
        int i10 = 0;
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        for (Camera.Size size : list) {
            int i12 = size.width;
            int i13 = size.height;
            if (i12 == point.x && i13 == point.y) {
                return new Point(i12, i13);
            }
            if (i12 * i13 >= 153600.0d) {
                double d11 = (((double) i12) / ((double) i13)) - d10;
                if (Math.abs(d11) < dAbs) {
                    dAbs = Math.abs(d11);
                    i11 = i13;
                    i10 = i12;
                }
            }
        }
        return new Point(i10, i11);
    }

    private void a(Camera.Parameters parameters) {
        e0 e0Var = this.f61790a;
        if (e0Var == null) {
            return;
        }
        String strF = e0Var.f();
        if (!strF.equals(kotlinx.coroutines.s0.f130317e) && !strF.equals("torch")) {
            strF = kotlinx.coroutines.s0.f130317e;
        }
        parameters.setFlashMode(strF);
    }

    public static void a(Camera.Parameters parameters, boolean z10) {
        try {
            Method method = Camera.Parameters.class.getMethod("setScanOptEnable", Boolean.TYPE);
            if (method != null) {
                method.invoke(parameters, Boolean.valueOf(z10));
                Log.i("CameraManager", "setScanOptEnable isOpt " + z10);
            }
        } catch (IllegalAccessException unused) {
            Log.e("CameraManager", "setScanOptEnable reflection IllegalAccessException");
        } catch (NoSuchMethodException unused2) {
            Log.e("CameraManager", "setScanOptEnable reflection NoSuchMethodException");
        } catch (InvocationTargetException unused3) {
            Log.e("CameraManager", "setScanOptEnable reflection InvocationTargetException");
        } catch (Exception unused4) {
            Log.e("CameraManager", "setScanOptEnable reflection Exception");
        }
    }

    private void a(Camera camera, Point point, Point point2) {
        if (this.f61790a == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(point.x, point.y);
        if (this.f61790a.c() == 0) {
            parameters.setPictureSize(point2.x, point2.y);
        }
        if (this.f61790a.b() != 1) {
            a(parameters);
        }
        c(parameters);
        b(parameters);
        if (this.f61790a.e()) {
            parameters.setRecordingHint(true);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            a(parameters, true);
        }
        camera.setParameters(parameters);
    }

    private void b(Camera.Parameters parameters) {
        if (parameters.isZoomSupported()) {
            parameters.setZoom(1);
        } else {
            Log.w("CameraManager", "initCameraParameters::setDefaultZoom not support zoom");
        }
    }

    private void c(Camera.Parameters parameters) {
        String str;
        String[] strArr = {"continuous-picture", "continuous-video", "auto"};
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            Log.w("CameraManager", "setFocusMode failed, use default");
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                str = null;
                break;
            }
            str = strArr[i10];
            if (supportedFocusModes.contains(str)) {
                break;
            } else {
                i10++;
            }
        }
        if (str != null) {
            Log.i("CameraManager", "setFocusMode: " + str);
            parameters.setFocusMode(str);
        }
    }

    Point a() {
        return this.f61791b;
    }

    void a(Camera camera, e0 e0Var) {
        if (camera == null || e0Var == null) {
            throw new IllegalArgumentException("initCameraParameters param is invalid");
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f61790a = e0Var;
        this.f61791b = a(parameters, e0Var.a(), false);
        Log.d("CameraManager", "initCameraParameters previewCameraSize: " + this.f61791b.toString());
        if (e0Var.c() == 0) {
            this.f61792c = a(parameters, e0Var.a(), true);
            Log.d("CameraManager", "initCameraParameters pictureCameraSize: " + this.f61792c.toString());
        }
        a(camera, this.f61791b, this.f61792c);
    }
}
