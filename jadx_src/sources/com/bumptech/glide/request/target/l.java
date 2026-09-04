package com.bumptech.glide.request.target;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.z0;

/* JADX INFO: compiled from: NotificationTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class l extends e<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RemoteViews f41917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f41918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Notification f41921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41922g;

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        this.f41918c = (Context) com.bumptech.glide.util.m.f(context, "Context must not be null!");
        this.f41921f = (Notification) com.bumptech.glide.util.m.f(notification, "Notification object can not be null!");
        this.f41917b = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f41922g = i12;
        this.f41919d = i13;
        this.f41920e = str;
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, null);
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void a(@p0 Bitmap bitmap) {
        this.f41917b.setImageViewBitmap(this.f41922g, bitmap);
        b();
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void b() {
        ((NotificationManager) com.bumptech.glide.util.m.e((NotificationManager) this.f41918c.getSystemService("notification"))).notify(this.f41920e, this.f41919d, this.f41921f);
    }

    @Override // com.bumptech.glide.request.target.p
    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onLoadCleared(@p0 Drawable drawable) {
        a(null);
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        a(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    @z0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
        onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
    }
}
