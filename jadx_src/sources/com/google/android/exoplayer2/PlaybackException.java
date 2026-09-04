package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
public class PlaybackException extends Exception implements i {
    public static final int A = 5001;
    public static final int B = 5002;
    public static final int C = 6000;
    public static final int D = 6001;
    public static final int E = 6002;
    public static final int F = 6003;
    public static final int G = 6004;
    public static final int H = 6005;
    public static final int I = 6006;
    public static final int J = 6007;
    public static final int K = 6008;
    public static final int L = 1000000;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    protected static final int R = 1000;
    public static final i.a<PlaybackException> S = new i.a() { // from class: com.google.android.exoplayer2.y2
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43517d = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43518e = 1001;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43519f = 1002;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43520g = 1003;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43521h = 1004;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43522i = 2000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43523j = 2001;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43524k = 2002;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f43525l = 2003;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43526m = 2004;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f43527n = 2005;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f43528o = 2006;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f43529p = 2007;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f43530q = 2008;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f43531r = 3001;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f43532s = 3002;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f43533t = 3003;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f43534u = 3004;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f43535v = 4001;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f43536w = 4002;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f43537x = 4003;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f43538y = 4004;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f43539z = 4005;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43541c;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    protected PlaybackException(Bundle bundle) {
        this(bundle.getString(h(2)), e(bundle), bundle.getInt(h(0), 1000), bundle.getLong(h(1), SystemClock.elapsedRealtime()));
    }

    public PlaybackException(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
        this(str, th2, i10, com.google.android.exoplayer2.util.e.f51387a.b());
    }

    protected PlaybackException(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f43540b = i10;
        this.f43541c = j10;
    }

    private static RemoteException b(@androidx.annotation.p0 String str) {
        return new RemoteException(str);
    }

    private static Throwable c(Class<?> cls, @androidx.annotation.p0 String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    @androidx.annotation.p0
    private static Throwable e(Bundle bundle) {
        String string = bundle.getString(h(3));
        String string2 = bundle.getString(h(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable thC = Throwable.class.isAssignableFrom(cls) ? c(cls, string2) : null;
            if (thC != null) {
                return thC;
            }
        } catch (Throwable unused) {
        }
        return b(string2);
    }

    public static String g(int i10) {
        if (i10 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i10 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i10) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i10) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i10) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i10) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i10) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case 6001:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case 6002:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case 6003:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    protected static String h(int i10) {
        return Integer.toString(i10, 36);
    }

    @androidx.annotation.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(h(0), this.f43540b);
        bundle.putLong(h(1), this.f43541c);
        bundle.putString(h(2), getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(h(3), cause.getClass().getName());
            bundle.putString(h(4), cause.getMessage());
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    @androidx.annotation.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(@androidx.annotation.p0 com.google.android.exoplayer2.PlaybackException r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L60
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L60
        L12:
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L3c
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = com.google.android.exoplayer2.util.u0.c(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = com.google.android.exoplayer2.util.u0.c(r2, r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.f43540b
            int r3 = r7.f43540b
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = com.google.android.exoplayer2.util.u0.c(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.f43541c
            long r4 = r7.f43541c
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            return r0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.PlaybackException.d(com.google.android.exoplayer2.PlaybackException):boolean");
    }

    public final String f() {
        return g(this.f43540b);
    }
}
