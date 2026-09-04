package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.penfeizhou.animation.io.e;
import com.github.penfeizhou.animation.io.g;

/* JADX INFO: compiled from: Frame.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<R extends e, W extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final R f43274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43279f;

    public a(R r10) {
        this.f43274a = r10;
    }

    public abstract Bitmap a(Canvas canvas, Paint paint, int i10, Bitmap bitmap, W w10);
}
