package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectableValueKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009b\u0001\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a§\u0001\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a»\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0007\u001a\f\u0010#\u001a\u00020\u0000*\u00020\u0000H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/n;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "shape", "", "clip", "f", "(Landroidx/compose/ui/n;FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;Z)Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "b", "(Landroidx/compose/ui/n;FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;)Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/l0;", "ambientShadowColor", "spotShadowColor", "d", "(Landroidx/compose/ui/n;FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;JJ)Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/b2;", "Lkotlin/t;", "block", ak.av, RXScreenCaptureService.KEY_HEIGHT, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class GraphicsLayerModifierKt {
    @androidx.compose.runtime.j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super v0, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        return nVar.s0(new BlockGraphicsLayerModifier(block, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("graphicsLayer");
                x0Var.getProperties().c("block", block);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @androidx.compose.runtime.j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @kotlin.s0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n graphicsLayer, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 shape, boolean z10, y1 y1Var) {
        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return d(graphicsLayer, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, y1Var, w0.b(), w0.b());
    }

    @androidx.compose.runtime.j2
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n graphicsLayer, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final float f16, final float f17, final float f18, final float f19, final long j10, @dl.d final g2 shape, final boolean z10, @dl.e final y1 y1Var, final long j11, final long j12) {
        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return graphicsLayer.s0(new SimpleGraphicsLayerModifier(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, y1Var, j11, j12, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("graphicsLayer");
                x0Var.getProperties().c("scaleX", Float.valueOf(f10));
                x0Var.getProperties().c("scaleY", Float.valueOf(f11));
                x0Var.getProperties().c("alpha", Float.valueOf(f12));
                x0Var.getProperties().c("translationX", Float.valueOf(f13));
                x0Var.getProperties().c("translationY", Float.valueOf(f14));
                x0Var.getProperties().c("shadowElevation", Float.valueOf(f15));
                x0Var.getProperties().c("rotationX", Float.valueOf(f16));
                x0Var.getProperties().c("rotationY", Float.valueOf(f17));
                x0Var.getProperties().c("rotationZ", Float.valueOf(f18));
                x0Var.getProperties().c("cameraDistance", Float.valueOf(f19));
                x0Var.getProperties().c("transformOrigin", o2.b(j10));
                x0Var.getProperties().c("shape", shape);
                x0Var.getProperties().c("clip", Boolean.valueOf(z10));
                x0Var.getProperties().c("renderEffect", y1Var);
                x0Var.getProperties().c("ambientShadowColor", l0.n(j11));
                x0Var.getProperties().c("spotShadowColor", l0.n(j12));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n e(androidx.compose.ui.n nVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, y1 y1Var, long j11, long j12, int i10, Object obj) {
        return d(nVar, (i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & 256) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? o2.INSTANCE.a() : j10, (i10 & 2048) != 0 ? x1.a() : g2Var, (i10 & 4096) != 0 ? false : z10, (i10 & 8192) != 0 ? null : y1Var, (i10 & 16384) != 0 ? w0.b() : j11, (i10 & 32768) != 0 ? w0.b() : j12);
    }

    @androidx.compose.runtime.j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @kotlin.s0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.n f(androidx.compose.ui.n graphicsLayer, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 shape, boolean z10) {
        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return e(graphicsLayer, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, null, 0L, 0L, 49152, null);
    }

    @androidx.compose.runtime.j2
    @dl.d
    public static final androidx.compose.ui.n h(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return InspectableValueKt.e() ? nVar.s0(e(androidx.compose.ui.n.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null)) : nVar;
    }
}
