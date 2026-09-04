package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.shape.c, reason: from toString */
/* JADX INFO: compiled from: AbsoluteRoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/shape/c;", "Landroidx/compose/foundation/shape/e;", "", "Lb1/a;", "k", "(F)J", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/f1;", "e", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/f1;", "Landroidx/compose/foundation/shape/f;", "j", "", "toString", "", "other", "", "equals", "", "hashCode", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class AbsoluteRoundedCornerShape extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7547f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsoluteRoundedCornerShape(@dl.d f topLeft, @dl.d f topRight, @dl.d f bottomRight, @dl.d f bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
        f0.p(topLeft, "topLeft");
        f0.p(topRight, "topRight");
        f0.p(bottomRight, "bottomRight");
        f0.p(bottomLeft, "bottomLeft");
    }

    private final long k(float f10) {
        return b1.b.b(f10, 0.0f, 2, null);
    }

    @Override // androidx.compose.foundation.shape.e
    @dl.d
    public f1 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "layoutDirection");
        return ((((topStart + topEnd) + bottomEnd) + bottomStart) > 0.0f ? 1 : ((((topStart + topEnd) + bottomEnd) + bottomStart) == 0.0f ? 0 : -1)) == 0 ? new f1.b(b1.n.m(size)) : new f1.c(b1.l.c(b1.n.m(size), b1.b.b(topStart, 0.0f, 2, null), b1.b.b(topEnd, 0.0f, 2, null), b1.b.b(bottomEnd, 0.0f, 2, null), b1.b.b(bottomStart, 0.0f, 2, null)));
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) other;
        return f0.g(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && f0.g(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && f0.g(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && f0.g(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.e
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbsoluteRoundedCornerShape c(@dl.d f topStart, @dl.d f topEnd, @dl.d f bottomEnd, @dl.d f bottomStart) {
        f0.p(topStart, "topStart");
        f0.p(topEnd, "topEnd");
        f0.p(bottomEnd, "bottomEnd");
        f0.p(bottomStart, "bottomStart");
        return new AbsoluteRoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    @dl.d
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }
}
