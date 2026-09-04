package com.zhpan.indicator.drawer;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DrawerProxy.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\u0012\u001a\u00060\u0010R\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0018\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/zhpan/indicator/drawer/e;", "Lcom/zhpan/indicator/drawer/f;", "Lch/b;", "indicatorOptions", "Lkotlin/b2;", "d", "", "changed", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", ak.av, "widthMeasureSpec", "heightMeasureSpec", "Lcom/zhpan/indicator/drawer/a$b;", "Lcom/zhpan/indicator/drawer/a;", "b", "Landroid/graphics/Canvas;", "canvas", ak.aF, "e", "Lcom/zhpan/indicator/drawer/f;", "mIDrawer", "<init>", "(Lch/b;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f mIDrawer;

    public e(@dl.d ch.b indicatorOptions) {
        f0.q(indicatorOptions, "indicatorOptions");
        d(indicatorOptions);
    }

    private final void d(ch.b bVar) {
        this.mIDrawer = d.f108086a.a(bVar);
    }

    @Override // com.zhpan.indicator.drawer.f
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // com.zhpan.indicator.drawer.f
    @dl.d
    public a.b b(int widthMeasureSpec, int heightMeasureSpec) {
        f fVar = this.mIDrawer;
        if (fVar == null) {
            f0.S("mIDrawer");
        }
        return fVar.b(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // com.zhpan.indicator.drawer.f
    public void c(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
        f fVar = this.mIDrawer;
        if (fVar == null) {
            f0.S("mIDrawer");
        }
        fVar.c(canvas);
    }

    public final void e(@dl.d ch.b indicatorOptions) {
        f0.q(indicatorOptions, "indicatorOptions");
        d(indicatorOptions);
    }
}
