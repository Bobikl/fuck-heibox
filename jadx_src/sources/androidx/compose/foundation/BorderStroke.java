package androidx.compose.foundation;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.g, reason: from toString */
/* JADX INFO: compiled from: BorderStroke.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/g;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ls1/h;", "width", "Landroidx/compose/ui/graphics/a0;", "brush", ak.av, "(FLandroidx/compose/ui/graphics/a0;)Landroidx/compose/foundation/g;", "F", "d", "()F", "b", "Landroidx/compose/ui/graphics/a0;", ak.aF, "()Landroidx/compose/ui/graphics/a0;", "<init>", "(FLandroidx/compose/ui/graphics/a0;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class BorderStroke {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.graphics.a0 brush;

    private BorderStroke(float f10, androidx.compose.ui.graphics.a0 a0Var) {
        this.width = f10;
        this.brush = a0Var;
    }

    public /* synthetic */ BorderStroke(float f10, androidx.compose.ui.graphics.a0 a0Var, kotlin.jvm.internal.u uVar) {
        this(f10, a0Var);
    }

    public static /* synthetic */ BorderStroke b(BorderStroke borderStroke, float f10, androidx.compose.ui.graphics.a0 a0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStroke.width;
        }
        if ((i10 & 2) != 0) {
            a0Var = borderStroke.brush;
        }
        return borderStroke.a(f10, a0Var);
    }

    @dl.d
    public final BorderStroke a(float width, @dl.d androidx.compose.ui.graphics.a0 brush) {
        kotlin.jvm.internal.f0.p(brush, "brush");
        return new BorderStroke(width, brush, null);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.graphics.a0 getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) other;
        return s1.h.l(this.width, borderStroke.width) && kotlin.jvm.internal.f0.g(this.brush, borderStroke.brush);
    }

    public int hashCode() {
        return (s1.h.n(this.width) * 31) + this.brush.hashCode();
    }

    @dl.d
    public String toString() {
        return "BorderStroke(width=" + ((Object) s1.h.s(this.width)) + ", brush=" + this.brush + ')';
    }
}
