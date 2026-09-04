package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f100926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f100927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f100928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f100929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ThreadPoolExecutor f100930e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f100927b = iAvailableProcessors;
        int i10 = iAvailableProcessors + 1;
        f100928c = i10;
        int i11 = (iAvailableProcessors * 2) + 1;
        f100929d = i11;
        f100930e = new ThreadPoolExecutor(i10, i11, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    public static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
                return iAvailable;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e10.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return 0;
        }
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f100926a != null && str.startsWith("content")) {
            try {
                return a(f100926a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int a(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            return str.length() <= 0 ? i10 : Integer.parseInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static boolean a(int i10) {
        return i10 == 36 || i10 == 46;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
