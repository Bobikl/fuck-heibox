package com.zhpan.indicator.drawer;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DashDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/zhpan/indicator/drawer/c;", "Lcom/zhpan/indicator/drawer/g;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/b2;", ak.aB, "Lch/b;", "indicatorOptions", "<init>", "(Lch/b;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class c extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d ch.b indicatorOptions) {
        super(indicatorOptions);
        f0.q(indicatorOptions, "indicatorOptions");
    }

    @Override // com.zhpan.indicator.drawer.g
    protected void s(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
        canvas.drawRect(getMRectF(), getMPaint());
    }
}
