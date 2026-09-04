package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.umeng.socialize.common.SocializeConstants;

/* JADX INFO: compiled from: MediaStoreUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40872a = 512;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40873b = 384;

    private b() {
    }

    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && SocializeConstants.KEY_PLATFORM.equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
