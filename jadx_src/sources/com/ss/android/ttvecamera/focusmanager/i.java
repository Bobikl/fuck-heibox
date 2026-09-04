package com.ss.android.ttvecamera.focusmanager;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TEVideoFocusAndMeterStrategy.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public class i extends c {
    public i(@n0 b.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.c, com.ss.android.ttvecamera.focusmanager.b
    public void b(@n0 CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
