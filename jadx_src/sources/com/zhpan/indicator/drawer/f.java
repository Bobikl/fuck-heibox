package com.zhpan.indicator.drawer;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H&J\u001c\u0010\u000f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lcom/zhpan/indicator/drawer/f;", "", "", "changed", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", ak.av, "widthMeasureSpec", "heightMeasureSpec", "Lcom/zhpan/indicator/drawer/a$b;", "Lcom/zhpan/indicator/drawer/a;", "b", "Landroid/graphics/Canvas;", "canvas", ak.aF, "indicator_release"}, k = 1, mv = {1, 4, 0})
public interface f {
    void a(boolean z10, int i10, int i11, int i12, int i13);

    @dl.d
    a.b b(int widthMeasureSpec, int heightMeasureSpec);

    void c(@dl.d Canvas canvas);
}
