package com.zhpan.indicator.drawer;

import android.animation.ArgbEvaluator;
import android.graphics.Paint;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 -2\u00020\u0001:\u0002\u0010\u0007B\u0011\b\u0000\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b6\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00060\u0006R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0014J0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0012\u001a\u00060\u0006R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\"\u00101\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b'\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/zhpan/indicator/drawer/a;", "Lcom/zhpan/indicator/drawer/f;", "", "k", "widthMeasureSpec", "heightMeasureSpec", "Lcom/zhpan/indicator/drawer/a$b;", "b", "j", "", "changed", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", ak.av, "Lcom/zhpan/indicator/drawer/a$b;", "mMeasureResult", "", "F", "g", "()F", "o", "(F)V", "maxWidth", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "p", "minWidth", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "f", "()Landroid/graphics/Paint;", "n", "(Landroid/graphics/Paint;)V", "mPaint", "Landroid/animation/ArgbEvaluator;", "e", "Landroid/animation/ArgbEvaluator;", "()Landroid/animation/ArgbEvaluator;", "l", "(Landroid/animation/ArgbEvaluator;)V", "argbEvaluator", "i", "()Z", "isWidthEquals", "Lch/b;", "mIndicatorOptions", "Lch/b;", "()Lch/b;", "m", "(Lch/b;)V", "<init>", "indicator_release"}, k = 1, mv = {1, 4, 0})
public abstract class a implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f108073g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f108074h = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b mMeasureResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Paint mPaint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private ArgbEvaluator argbEvaluator;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private ch.b f108081f;

    /* JADX INFO: compiled from: BaseDrawer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/zhpan/indicator/drawer/a$b;", "", "", "measureWidth", "measureHeight", "Lkotlin/b2;", "d", "(II)V", "<set-?>", ak.av, "I", "b", "()I", "e", "(I)V", ak.aF, "<init>", "(Lcom/zhpan/indicator/drawer/a;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int measureWidth;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int measureHeight;

        public b() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMeasureHeight() {
            return this.measureHeight;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMeasureWidth() {
            return this.measureWidth;
        }

        public final void c(int i10) {
            this.measureHeight = i10;
        }

        public final void d(int measureWidth, int measureHeight) {
            this.measureWidth = measureWidth;
            this.measureHeight = measureHeight;
        }

        public final void e(int i10) {
            this.measureWidth = i10;
        }
    }

    public a(@dl.d ch.b mIndicatorOptions) {
        f0.q(mIndicatorOptions, "mIndicatorOptions");
        this.f108081f = mIndicatorOptions;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mMeasureResult = new b();
        if (this.f108081f.getF35650c() == 4 || this.f108081f.getF35650c() == 5) {
            this.argbEvaluator = new ArgbEvaluator();
        }
    }

    private final int k() {
        float f35651d = this.f108081f.getF35651d() - 1;
        return ((int) ((this.f108081f.getF35654g() * f35651d) + this.maxWidth + (f35651d * this.minWidth))) + 6;
    }

    @Override // com.zhpan.indicator.drawer.f
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // com.zhpan.indicator.drawer.f
    @dl.d
    public b b(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxWidth = u.t(this.f108081f.getF35656i(), this.f108081f.getF35657j());
        this.minWidth = u.A(this.f108081f.getF35656i(), this.f108081f.getF35657j());
        if (this.f108081f.getF35648a() == 1) {
            this.mMeasureResult.d(j(), k());
        } else {
            this.mMeasureResult.d(k(), j());
        }
        return this.mMeasureResult;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ArgbEvaluator getArgbEvaluator() {
        return this.argbEvaluator;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ch.b getF108081f() {
        return this.f108081f;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Paint getMPaint() {
        return this.mPaint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    protected final boolean i() {
        return this.f108081f.getF35656i() == this.f108081f.getF35657j();
    }

    protected int j() {
        return ((int) this.f108081f.m()) + 3;
    }

    public final void l(@dl.e ArgbEvaluator argbEvaluator) {
        this.argbEvaluator = argbEvaluator;
    }

    public final void m(@dl.d ch.b bVar) {
        f0.q(bVar, "<set-?>");
        this.f108081f = bVar;
    }

    public final void n(@dl.d Paint paint) {
        f0.q(paint, "<set-?>");
        this.mPaint = paint;
    }

    public final void o(float f10) {
        this.maxWidth = f10;
    }

    public final void p(float f10) {
        this.minWidth = f10;
    }
}
