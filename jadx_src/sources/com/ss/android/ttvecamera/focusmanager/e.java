package com.ss.android.ttvecamera.focusmanager;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusSettings;

/* JADX INFO: compiled from: TEFocusStrategyBase.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public abstract class e implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected TEFocusSettings f97437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected TECameraSettings f97438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f97439e = true;

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public void d(@n0 CaptureRequest.Builder builder, @n0 Rect rect) {
        builder.setTag(b.f97416a);
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public void f(@n0 CaptureRequest.Builder builder, @n0 Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag(b.f97416a);
    }

    public void g(TECameraSettings tECameraSettings) {
        this.f97438d = tECameraSettings;
        this.f97439e = tECameraSettings.f97092j;
    }

    public void h(TEFocusSettings tEFocusSettings) {
        this.f97437c = tEFocusSettings;
    }
}
