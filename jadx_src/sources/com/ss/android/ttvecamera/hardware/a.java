package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TECameraBEWOProxy.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f97527e = "TECameraBEWOProxy";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f97528f = "Master";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f97529g = "Wide";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f97530h = "Tele";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f97531i = "Periscope";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f97532j = "SAT";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final CameraCharacteristics.Key<byte[]> f97533k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CaptureRequest.Key<Float> f97534l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final CaptureResult.Key<String> f97535m = null;

    public a(Context context) {
        super(context);
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public boolean A(CameraCharacteristics cameraCharacteristics) {
        return super.A(cameraCharacteristics);
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public void b(int i10, CameraManager cameraManager) {
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public String j() {
        return f97529g;
    }

    @Override // com.ss.android.ttvecamera.hardware.d
    public boolean z() {
        return super.z();
    }
}
