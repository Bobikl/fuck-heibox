package androidx.compose.ui.draw;

import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.DpRect;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010\b\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005J\u001f\u0010\n\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005R\"\u0010\u0011\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00198Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Ls1/e;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "Lkotlin/t;", "block", "Landroidx/compose/ui/draw/k;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/drawscope/d;", "i", "Landroidx/compose/ui/draw/c;", "b", "Landroidx/compose/ui/draw/c;", "()Landroidx/compose/ui/draw/c;", "j", "(Landroidx/compose/ui/draw/c;)V", "cacheParams", ak.aF, "Landroidx/compose/ui/draw/k;", "g", "()Landroidx/compose/ui/draw/k;", "k", "(Landroidx/compose/ui/draw/k;)V", "drawResult", "Lb1/m;", "()J", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getDensity", "()F", "density", "C1", "fontScale", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class CacheDrawScope implements s1.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13432d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private c cacheParams = m.f13473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k drawResult;

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.cacheParams.getDensity().getF139218c();
    }

    @Override // s1.e
    public /* synthetic */ float E(int i10) {
        return s1.d.e(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ float E1(float f10) {
        return s1.d.h(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ float F(float f10) {
        return s1.d.d(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ long J(long j10) {
        return s1.d.j(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ int J1(long j10) {
        return s1.d.a(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long M(float f10) {
        return s1.d.k(this, f10);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getCacheParams() {
        return this.cacheParams;
    }

    public final long c() {
        return this.cacheParams.c();
    }

    @Override // s1.e
    public /* synthetic */ int e1(float f10) {
        return s1.d.b(this, f10);
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getDrawResult() {
        return this.drawResult;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.cacheParams.getDensity().getF139217b();
    }

    @dl.d
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    @dl.d
    public final k h(@dl.d final yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> block) {
        f0.p(block, "block");
        return i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                f0.p(onDrawWithContent, "$this$onDrawWithContent");
                block.invoke(onDrawWithContent);
                onDrawWithContent.T0();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return b2.f124493a;
            }
        });
    }

    @Override // s1.e
    public /* synthetic */ b1.i h0(DpRect dpRect) {
        return s1.d.i(this, dpRect);
    }

    @dl.d
    public final k i(@dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.d, b2> block) {
        f0.p(block, "block");
        k kVar = new k(block);
        this.drawResult = kVar;
        return kVar;
    }

    public final void j(@dl.d c cVar) {
        f0.p(cVar, "<set-?>");
        this.cacheParams = cVar;
    }

    public final void k(@dl.e k kVar) {
        this.drawResult = kVar;
    }

    @Override // s1.e
    public /* synthetic */ float k1(long j10) {
        return s1.d.g(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long n(long j10) {
        return s1.d.f(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ float q(long j10) {
        return s1.d.c(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long r(int i10) {
        return s1.d.m(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ long s(float f10) {
        return s1.d.l(this, f10);
    }
}
