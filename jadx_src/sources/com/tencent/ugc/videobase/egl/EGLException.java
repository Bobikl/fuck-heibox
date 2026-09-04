package com.tencent.ugc.videobase.egl;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class EGLException extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    private final int mErrorCode;
    private final String mErrorMessage;

    public EGLException(int i10) {
        this(i10, "");
    }

    public EGLException(int i10, String str) {
        super(str);
        this.mErrorCode = i10;
        this.mErrorMessage = str;
    }

    public EGLException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.mErrorCode = i10;
        this.mErrorMessage = str;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + ", " + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode + ", " + super.getMessage();
    }
}
