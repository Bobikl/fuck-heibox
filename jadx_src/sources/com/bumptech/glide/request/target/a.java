package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: AppWidgetTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends e<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f41886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f41887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RemoteViews f41888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f41889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41890f;

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        this.f41889e = (Context) com.bumptech.glide.util.m.f(context, "Context can not be null!");
        this.f41888d = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f41887c = (ComponentName) com.bumptech.glide.util.m.f(componentName, "ComponentName can not be null!");
        this.f41890f = i12;
        this.f41886b = null;
    }

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f41889e = (Context) com.bumptech.glide.util.m.f(context, "Context can not be null!");
        this.f41888d = (RemoteViews) com.bumptech.glide.util.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f41886b = (int[]) com.bumptech.glide.util.m.f(iArr, "WidgetIds can not be null!");
        this.f41890f = i12;
        this.f41887c = null;
    }

    public a(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }

    public a(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    private void a(@p0 Bitmap bitmap) {
        this.f41888d.setImageViewBitmap(this.f41890f, bitmap);
        b();
    }

    private void b() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f41889e);
        ComponentName componentName = this.f41887c;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f41888d);
        } else {
            appWidgetManager.updateAppWidget(this.f41886b, this.f41888d);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadCleared(@p0 Drawable drawable) {
        a(null);
    }

    public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        a(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
        onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
    }
}
