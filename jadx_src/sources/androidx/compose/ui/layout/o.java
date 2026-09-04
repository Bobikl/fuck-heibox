package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b+\u0010,J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u0003*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\f*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001J\u001a\u0010\u001a\u001a\u00020\u0011*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u0007*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u0007*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u0007*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010'\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/o;", "Landroidx/compose/ui/layout/l0;", "Ls1/e;", "Ls1/h;", "", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "q", "(J)F", "", "F", "(F)F", androidx.exifinterface.media.a.S4, "(I)F", "Lb1/m;", "Ls1/l;", "n", "(J)J", "E1", "k1", "Ls1/k;", "Lb1/i;", "h0", "J", "M", "(F)J", ak.aB, "r", "(I)J", "Landroidx/compose/ui/unit/LayoutDirection;", "b", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "C1", "fontScale", "<init>", "(Ls1/e;Landroidx/compose/ui/unit/LayoutDirection;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class o implements l0, s1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ s1.e f15033c;

    public o(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        this.layoutDirection = layoutDirection;
        this.f15033c = density;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.f15033c.getF139218c();
    }

    @Override // s1.e
    @j2
    public float E(int i10) {
        return this.f15033c.E(i10);
    }

    @Override // s1.e
    @j2
    public float E1(float f10) {
        return this.f15033c.E1(f10);
    }

    @Override // s1.e
    @j2
    public float F(float f10) {
        return this.f15033c.F(f10);
    }

    @Override // s1.e
    @j2
    public long J(long j10) {
        return this.f15033c.J(j10);
    }

    @Override // s1.e
    @j2
    public int J1(long j10) {
        return this.f15033c.J1(j10);
    }

    @Override // s1.e
    @j2
    public long M(float f10) {
        return this.f15033c.M(f10);
    }

    @Override // s1.e
    @j2
    public int e1(float f10) {
        return this.f15033c.e1(f10);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.f15033c.getF139217b();
    }

    @Override // androidx.compose.ui.layout.n
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // s1.e
    @j2
    @dl.d
    public b1.i h0(@dl.d DpRect dpRect) {
        kotlin.jvm.internal.f0.p(dpRect, "<this>");
        return this.f15033c.h0(dpRect);
    }

    @Override // s1.e
    @j2
    public float k1(long j10) {
        return this.f15033c.k1(j10);
    }

    @Override // s1.e
    @j2
    public long n(long j10) {
        return this.f15033c.n(j10);
    }

    @Override // androidx.compose.ui.layout.l0
    public /* synthetic */ j0 p1(int i10, int i11, Map map, yh.l lVar) {
        return k0.a(this, i10, i11, map, lVar);
    }

    @Override // s1.e
    @j2
    public float q(long j10) {
        return this.f15033c.q(j10);
    }

    @Override // s1.e
    @j2
    public long r(int i10) {
        return this.f15033c.r(i10);
    }

    @Override // s1.e
    @j2
    public long s(float f10) {
        return this.f15033c.s(f10);
    }
}
