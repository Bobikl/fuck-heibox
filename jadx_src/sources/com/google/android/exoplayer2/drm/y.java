package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: DrmUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44760a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44761b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44762c = 3;

    /* JADX INFO: compiled from: DrmUtil.java */
    @w0(18)
    public static final class a {
        private a() {
        }

        @androidx.annotation.u
        public static boolean a(@androidx.annotation.p0 Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        @androidx.annotation.u
        public static boolean b(@androidx.annotation.p0 Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    @w0(21)
    public static final class b {
        private b() {
        }

        @androidx.annotation.u
        public static boolean a(@androidx.annotation.p0 Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        @androidx.annotation.u
        public static int b(Throwable th2) {
            return u0.e0(u0.f0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    @w0(23)
    public static final class c {
        private c() {
        }

        @androidx.annotation.u
        public static boolean a(@androidx.annotation.p0 Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private y() {
    }

    public static int a(Exception exc, int i10) {
        int i11 = u0.f51536a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.b(exc)) {
            return 6002;
        }
        if (i11 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (exc instanceof KeysExpiredException) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
