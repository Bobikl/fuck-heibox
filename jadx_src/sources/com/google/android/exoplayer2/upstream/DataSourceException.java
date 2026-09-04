package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f50857c = 2008;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50858b;

    public DataSourceException(int i10) {
        this.f50858b = i10;
    }

    public DataSourceException(@androidx.annotation.p0 String str, int i10) {
        super(str);
        this.f50858b = i10;
    }

    public DataSourceException(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
        super(str, th2);
        this.f50858b = i10;
    }

    public DataSourceException(@androidx.annotation.p0 Throwable th2, int i10) {
        super(th2);
        this.f50858b = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f50858b == 2008) {
                return true;
            }
        }
        return false;
    }
}
