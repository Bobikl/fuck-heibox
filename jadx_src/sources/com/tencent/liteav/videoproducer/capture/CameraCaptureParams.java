package com.tencent.liteav.videoproducer.capture;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class CameraCaptureParams extends CaptureSourceInterface.CaptureParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f100680a = null;

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public boolean equals(Object obj) {
        if (!(obj instanceof CameraCaptureParams)) {
            return false;
        }
        CameraCaptureParams cameraCaptureParams = (CameraCaptureParams) obj;
        return super.equals(cameraCaptureParams) && com.tencent.liteav.base.util.i.a(this.f100680a, cameraCaptureParams.f100680a);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, frontCamera: %b", super.toString(), this.f100680a);
    }
}
