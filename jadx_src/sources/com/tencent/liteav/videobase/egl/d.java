package com.tencent.liteav.videobase.egl;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    public final int mErrorCode;
    private final String mErrorMessage;

    public d(int i10) {
        this(i10, "");
    }

    public d(int i10, String str) {
        super(str);
        this.mErrorCode = i10;
        this.mErrorMessage = str;
    }

    public d(int i10, String str, Throwable th2) {
        super(str, th2);
        this.mErrorCode = i10;
        this.mErrorMessage = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + ", " + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode + ", " + super.getMessage();
    }
}
