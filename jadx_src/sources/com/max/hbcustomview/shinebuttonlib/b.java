package com.max.hbcustomview.shinebuttonlib;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ShineAnimator.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends ValueAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f69459b = 1.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f69460c = 1500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Canvas f69461d;

    b() {
        setFloatValues(1.0f, 1.5f);
        setDuration(this.f69460c);
        setStartDelay(200L);
        setInterpolator(new DecelerateInterpolator());
    }

    b(long j10, float f10, long j11) {
        setFloatValues(1.0f, f10);
        setDuration(j10);
        setStartDelay(j11);
        setInterpolator(new LinearInterpolator());
    }

    public void a(Canvas canvas) {
        this.f69461d = canvas;
    }

    public void b(ShineView shineView, int i10, int i11) {
        Object[] objArr = {shineView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Jp, new Class[]{ShineView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        start();
    }
}
