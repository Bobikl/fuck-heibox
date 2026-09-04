package com.google.android.gms.common.api;

import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52348a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52349b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f52350c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f52351d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52352e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f52353f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52354g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f52355h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f52356i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f52357j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f52358k = 13;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f52359l = 14;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f52360m = 15;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f52361n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f52362o = 17;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f52363p = 19;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f52364q = 20;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f52365r = 21;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f52366s = 22;

    @v8.a
    protected a() {
    }

    @n0
    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i10;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
