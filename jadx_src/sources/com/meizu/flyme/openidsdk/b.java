package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile b f96240e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f96241f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f96247h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenId f96242a = new OpenId("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OpenId f96243b = new OpenId("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OpenId f96245d = new OpenId("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OpenId f96244c = new OpenId("aaid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SupportInfo f96246g = new SupportInfo();

    private b() {
    }

    private static native ValueData a(Cursor cursor);

    public static final native b a();

    private static native String a(PackageManager packageManager, String str);

    public static native void a(String str);

    public static native void a(boolean z10);

    private static native boolean a(Context context);

    private native String b(Context context, OpenId openId);

    private static native String b(PackageManager packageManager, String str);

    private native synchronized void b(Context context);

    public final native String a(Context context, OpenId openId);

    public final native boolean a(Context context, boolean z10);
}
