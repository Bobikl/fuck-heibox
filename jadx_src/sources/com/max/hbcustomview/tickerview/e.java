package com.max.hbcustomview.tickerview;

import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TickerDrawMetrics.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f69663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69666d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Character, Float> f69664b = new HashMap(256);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TickerView.ScrollingDirection f69667e = TickerView.ScrollingDirection.ANY;

    e(Paint paint) {
        this.f69663a = paint;
        e();
    }

    float a() {
        return this.f69666d;
    }

    float b() {
        return this.f69665c;
    }

    float c(char c10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Character(c10)}, this, changeQuickRedirect, false, bb.c.f.yu, new Class[]{Character.TYPE}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (c10 == 0) {
            return 0.0f;
        }
        Float f10 = this.f69664b.get(Character.valueOf(c10));
        if (f10 != null) {
            return f10.floatValue();
        }
        float fMeasureText = this.f69663a.measureText(Character.toString(c10));
        this.f69664b.put(Character.valueOf(c10), Float.valueOf(fMeasureText));
        return fMeasureText;
    }

    TickerView.ScrollingDirection d() {
        return this.f69667e;
    }

    void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.xu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69664b.clear();
        Paint.FontMetrics fontMetrics = this.f69663a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        this.f69665c = f10 - f11;
        this.f69666d = -f11;
    }

    void f(TickerView.ScrollingDirection scrollingDirection) {
        this.f69667e = scrollingDirection;
    }
}
