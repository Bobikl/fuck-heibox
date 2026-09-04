package com.tencent.liteav.videoproducer.capture.a;

import android.hardware.Camera;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f100724a = new b();

    private b() {
    }

    public static Camera.AutoFocusCallback a() {
        return f100724a;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        LiteavLog.d("CameraController", "onAutoFocus success: %b", Boolean.valueOf(z10));
    }
}
