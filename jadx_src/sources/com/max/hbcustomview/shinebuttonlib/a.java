package com.max.hbcustomview.shinebuttonlib;

import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MySpringInterpolator.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements Interpolator {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f69458a;

    public a(float f10) {
        this.f69458a = f10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.tp, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        double dPow = Math.pow(2.0d, (-10.0f) * f10);
        float f11 = this.f69458a;
        return (float) ((dPow * Math.sin((((double) (f10 - (f11 / 4.0f))) * 6.283185307179586d) / ((double) f11))) + 1.0d);
    }
}
