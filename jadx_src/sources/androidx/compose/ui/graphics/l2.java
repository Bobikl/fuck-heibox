package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/l2;", "Landroidx/compose/ui/graphics/c2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lb1/f;", "e", "J", com.google.android.exoplayer2.text.ttml.d.f49794m0, "", "Landroidx/compose/ui/graphics/l0;", "f", "Ljava/util/List;", "colors", "", "g", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class l2 extends c2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<l0> colors;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final List<Float> stops;

    private l2(long j10, List<l0> list, List<Float> list2) {
        this.center = j10;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ l2(long j10, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }

    public /* synthetic */ l2(long j10, List list, List list2, kotlin.jvm.internal.u uVar) {
        this(j10, list, list2);
    }

    @Override // androidx.compose.ui.graphics.c2
    @dl.d
    public Shader c(long size) {
        long jA;
        if (b1.g.f(this.center)) {
            jA = b1.n.b(size);
        } else {
            jA = b1.g.a((b1.f.p(this.center) > Float.POSITIVE_INFINITY ? 1 : (b1.f.p(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.t(size) : b1.f.p(this.center), b1.f.r(this.center) == Float.POSITIVE_INFINITY ? b1.m.m(size) : b1.f.r(this.center));
        }
        return d2.g(jA, this.colors, this.stops);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) other;
        return b1.f.l(this.center, l2Var.center) && kotlin.jvm.internal.f0.g(this.colors, l2Var.colors) && kotlin.jvm.internal.f0.g(this.stops, l2Var.stops);
    }

    public int hashCode() {
        int iS = ((b1.f.s(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iS + (list != null ? list.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        String str;
        if (b1.g.d(this.center)) {
            str = "center=" + ((Object) b1.f.y(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
