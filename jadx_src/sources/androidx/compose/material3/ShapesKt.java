package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0013\u0010\b\u001a\u00020\u0006*\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/shape/e;", "e", ak.av, "Landroidx/compose/material3/i1;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "value", "Landroidx/compose/ui/graphics/g2;", "b", "d", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", ak.aF, "()Landroidx/compose/runtime/j1;", "LocalShapes", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ShapesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<Shapes> f10485a = CompositionLocalKt.e(new yh.a<Shapes>() { // from class: androidx.compose.material3.ShapesKt$LocalShapes$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shapes invoke() {
            return new Shapes(null, null, null, null, null, 31, null);
        }
    });

    /* JADX INFO: compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10487a;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            f10487a = iArr;
        }
    }

    @dl.d
    public static final androidx.compose.foundation.shape.e a(@dl.d androidx.compose.foundation.shape.e eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        float f10 = (float) 0.0d;
        return androidx.compose.foundation.shape.e.d(eVar, androidx.compose.foundation.shape.g.c(s1.h.g(f10)), null, null, androidx.compose.foundation.shape.g.c(s1.h.g(f10)), 6, null);
    }

    @dl.d
    public static final g2 b(@dl.d Shapes shapes, @dl.d ShapeKeyTokens value) {
        kotlin.jvm.internal.f0.p(shapes, "<this>");
        kotlin.jvm.internal.f0.p(value, "value");
        switch (a.f10487a[value.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return e(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return e(shapes.getExtraSmall());
            case 5:
                return androidx.compose.foundation.shape.o.k();
            case 6:
                return shapes.getLarge();
            case 7:
                return a(shapes.getLarge());
            case 8:
                return e(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return androidx.compose.ui.graphics.x1.a();
            case 11:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @dl.d
    public static final androidx.compose.runtime.j1<Shapes> c() {
        return f10485a;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final g2 d(@dl.d ShapeKeyTokens shapeKeyTokens, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(shapeKeyTokens, "<this>");
        pVar.T(-612531606);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-612531606, i10, -1, "androidx.compose.material3.toShape (Shapes.kt:174)");
        }
        g2 g2VarB = b(o0.f12059a.b(pVar, 6), shapeKeyTokens);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarB;
    }

    @dl.d
    public static final androidx.compose.foundation.shape.e e(@dl.d androidx.compose.foundation.shape.e eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        float f10 = (float) 0.0d;
        return androidx.compose.foundation.shape.e.d(eVar, null, null, androidx.compose.foundation.shape.g.c(s1.h.g(f10)), androidx.compose.foundation.shape.g.c(s1.h.g(f10)), 3, null);
    }
}
