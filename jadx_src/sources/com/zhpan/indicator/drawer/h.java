package com.zhpan.indicator.drawer;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RoundRectDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/zhpan/indicator/drawer/h;", "Lcom/zhpan/indicator/drawer/g;", "Landroid/graphics/Canvas;", "canvas", "", "rx", "ry", "Lkotlin/b2;", ak.aG, "Lch/b;", "indicatorOptions", "<init>", "(Lch/b;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class h extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d ch.b indicatorOptions) {
        super(indicatorOptions);
        f0.q(indicatorOptions, "indicatorOptions");
    }

    @Override // com.zhpan.indicator.drawer.g
    protected void u(@dl.d Canvas canvas, float f10, float f11) {
        f0.q(canvas, "canvas");
        canvas.drawRoundRect(getMRectF(), f10, f11, getMPaint());
    }
}
