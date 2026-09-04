package com.ss.android.ttvecamera.focusmanager;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.n0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ITEFocusStrategy.java */
/* JADX INFO: loaded from: classes9.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f97416a = "FOCUS_TAG";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MeteringRectangle[] f97417b = {new MeteringRectangle(0, 0, 0, 0, 0)};

    /* JADX INFO: compiled from: ITEFocusStrategy.java */
    public interface a {
        int X();

        int b();

        void u(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder);
    }

    int a();

    void b(@n0 CaptureRequest.Builder builder);

    CameraCaptureSession.CaptureCallback c(@n0 CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z10);

    void d(@n0 CaptureRequest.Builder builder, @n0 Rect rect);

    CameraCaptureSession.CaptureCallback e(@n0 CaptureRequest.Builder builder, boolean z10);

    void f(@n0 CaptureRequest.Builder builder, @n0 Rect rect);
}
