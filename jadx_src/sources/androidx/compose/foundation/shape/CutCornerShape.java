package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.shape.h, reason: from toString */
/* JADX INFO: compiled from: CutCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/h;", "Landroidx/compose/foundation/shape/e;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/f1;", "e", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/f1;", "Landroidx/compose/foundation/shape/f;", "j", "", "toString", "", "other", "", "equals", "", "hashCode", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class CutCornerShape extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7554f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutCornerShape(@dl.d f topStart, @dl.d f topEnd, @dl.d f bottomEnd, @dl.d f bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        f0.p(topStart, "topStart");
        f0.p(topEnd, "topEnd");
        f0.p(bottomEnd, "bottomEnd");
        f0.p(bottomStart, "bottomStart");
    }

    @Override // androidx.compose.foundation.shape.e
    @dl.d
    public f1 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "layoutDirection");
        if (((topStart + topEnd) + bottomStart) + bottomEnd == 0.0f) {
            return new f1.b(b1.n.m(size));
        }
        l1 l1VarA = androidx.compose.ui.graphics.o.a();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f10 = layoutDirection == layoutDirection2 ? topStart : topEnd;
        l1VarA.f(0.0f, f10);
        l1VarA.h(f10, 0.0f);
        if (layoutDirection == layoutDirection2) {
            topStart = topEnd;
        }
        l1VarA.h(b1.m.t(size) - topStart, 0.0f);
        l1VarA.h(b1.m.t(size), topStart);
        float f11 = layoutDirection == layoutDirection2 ? bottomEnd : bottomStart;
        l1VarA.h(b1.m.t(size), b1.m.m(size) - f11);
        l1VarA.h(b1.m.t(size) - f11, b1.m.m(size));
        if (layoutDirection == layoutDirection2) {
            bottomEnd = bottomStart;
        }
        l1VarA.h(bottomEnd, b1.m.m(size));
        l1VarA.h(0.0f, b1.m.m(size) - bottomEnd);
        l1VarA.close();
        return new f1.a(l1VarA);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) other;
        return f0.g(getTopStart(), cutCornerShape.getTopStart()) && f0.g(getTopEnd(), cutCornerShape.getTopEnd()) && f0.g(getBottomEnd(), cutCornerShape.getBottomEnd()) && f0.g(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.e
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public CutCornerShape c(@dl.d f topStart, @dl.d f topEnd, @dl.d f bottomEnd, @dl.d f bottomStart) {
        f0.p(topStart, "topStart");
        f0.p(topEnd, "topEnd");
        f0.p(bottomEnd, "bottomEnd");
        f0.p(bottomStart, "bottomStart");
        return new CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    @dl.d
    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
