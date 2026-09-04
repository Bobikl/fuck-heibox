package androidx.compose.ui.graphics;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.h2, reason: from toString */
/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0017\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/h2;", "Landroidx/compose/ui/graphics/a0;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/graphics/h1;", "p", "", "alpha", "Lkotlin/b2;", ak.av, "(JLandroidx/compose/ui/graphics/h1;F)V", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/l0;", ak.aF, "J", "()J", "value", "<init>", "(JLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class SolidColor extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    private SolidColor(long j10) {
        super(null);
        this.value = j10;
    }

    public /* synthetic */ SolidColor(long j10, kotlin.jvm.internal.u uVar) {
        this(j10);
    }

    @Override // androidx.compose.ui.graphics.a0
    public void a(long size, @dl.d h1 p10, float alpha) {
        long jW;
        kotlin.jvm.internal.f0.p(p10, "p");
        p10.f(1.0f);
        if (alpha == 1.0f) {
            jW = this.value;
        } else {
            long j10 = this.value;
            jW = l0.w(j10, l0.A(j10) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p10.i(jW);
        if (p10.getInternalShader() != null) {
            p10.y(null);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && l0.y(this.value, ((SolidColor) other).value);
    }

    public int hashCode() {
        return l0.K(this.value);
    }

    @dl.d
    public String toString() {
        return "SolidColor(value=" + ((Object) l0.L(this.value)) + ')';
    }
}
