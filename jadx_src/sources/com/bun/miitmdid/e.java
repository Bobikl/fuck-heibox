package com.bun.miitmdid;

import android.content.Context;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IPermissionCallbackListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f42071a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f42072b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AtomicLong f42073c = new AtomicLong(5000);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f42074d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f42075e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f42076f = true;

    public e(boolean z10, long j10) {
        AtomicLong atomicLong;
        l0.a(z10);
        if (j10 <= 0) {
            atomicLong = f42073c;
            j10 = 5000;
        } else {
            atomicLong = f42073c;
        }
        atomicLong.set(j10);
    }

    public e(boolean z10, long j10, boolean z11, boolean z12, boolean z13) {
        AtomicLong atomicLong;
        l0.a(z10);
        if (j10 <= 0) {
            atomicLong = f42073c;
            j10 = 5000;
        } else {
            atomicLong = f42073c;
        }
        atomicLong.set(j10);
        a(z11, z12, z13);
    }

    public static native String a();

    public static native void a(Context context, IPermissionCallbackListener iPermissionCallbackListener);

    public static native boolean a(Context context, String str);

    public static native int b();

    public final native int a(int i10, IdSupplier idSupplier);

    public native int a(Context context, IIdentifierListener iIdentifierListener);

    public native void a(boolean z10, boolean z11, boolean z12);
}
