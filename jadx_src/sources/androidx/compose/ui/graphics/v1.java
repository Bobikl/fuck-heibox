package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u001fø\u0001\u0001¢\u0006\u0004\b&\u0010'J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001d\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010%\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/v1;", "Landroidx/compose/ui/graphics/c2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Landroidx/compose/ui/graphics/l0;", "e", "Ljava/util/List;", "colors", "", "f", "stops", "Lb1/f;", "g", "J", com.google.android.exoplayer2.text.ttml.d.f49794m0, RXScreenCaptureService.KEY_HEIGHT, "F", "radius", "Landroidx/compose/ui/graphics/m2;", "i", "I", "tileMode", "b", "()J", "intrinsicSize", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class v1 extends c2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<l0> colors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final List<Float> stops;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    private v1(List<l0> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }

    public /* synthetic */ v1(List list, List list2, long j10, float f10, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? m2.INSTANCE.a() : i10, null);
    }

    public /* synthetic */ v1(List list, List list2, long j10, float f10, int i10, kotlin.jvm.internal.u uVar) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.ui.graphics.a0
    /* JADX INFO: renamed from: b */
    public long getIntrinsicSize() {
        float f10 = this.radius;
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            return b1.m.f30386b.a();
        }
        float f11 = this.radius;
        float f12 = 2;
        return b1.n.a(f11 * f12, f11 * f12);
    }

    @Override // androidx.compose.ui.graphics.c2
    @dl.d
    public Shader c(long size) {
        float fT;
        float fM;
        if (b1.g.f(this.center)) {
            long jB = b1.n.b(size);
            fT = b1.f.p(jB);
            fM = b1.f.r(jB);
        } else {
            fT = (b1.f.p(this.center) > Float.POSITIVE_INFINITY ? 1 : (b1.f.p(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.t(size) : b1.f.p(this.center);
            fM = (b1.f.r(this.center) > Float.POSITIVE_INFINITY ? 1 : (b1.f.r(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.m(size) : b1.f.r(this.center);
        }
        List<l0> list = this.colors;
        List<Float> list2 = this.stops;
        long jA = b1.g.a(fT, fM);
        float f10 = this.radius;
        return d2.e(jA, f10 == Float.POSITIVE_INFINITY ? b1.m.q(size) / 2 : f10, list, list2, this.tileMode);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) other;
        if (kotlin.jvm.internal.f0.g(this.colors, v1Var.colors) && kotlin.jvm.internal.f0.g(this.stops, v1Var.stops) && b1.f.l(this.center, v1Var.center)) {
            return ((this.radius > v1Var.radius ? 1 : (this.radius == v1Var.radius ? 0 : -1)) == 0) && m2.h(this.tileMode, v1Var.tileMode);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + b1.f.s(this.center)) * 31) + Float.floatToIntBits(this.radius)) * 31) + m2.i(this.tileMode);
    }

    @dl.d
    public String toString() {
        String str;
        String str2 = "";
        if (b1.g.d(this.center)) {
            str = "center=" + ((Object) b1.f.y(this.center)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.radius;
        if ((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) m2.j(this.tileMode)) + ')';
    }
}
