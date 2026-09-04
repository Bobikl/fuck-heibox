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
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\b\b\u0002\u0010!\u001a\u00020\u001eø\u0001\u0001¢\u0006\u0004\b%\u0010&J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001d\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001d\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/b1;", "Landroidx/compose/ui/graphics/c2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Landroidx/compose/ui/graphics/l0;", "e", "Ljava/util/List;", "colors", "", "f", "stops", "Lb1/f;", "g", "J", com.google.android.exoplayer2.text.ttml.d.f49798o0, RXScreenCaptureService.KEY_HEIGHT, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/m2;", "i", "I", "tileMode", "b", "()J", "intrinsicSize", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class b1 extends c2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<l0> colors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final List<Float> stops;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long start;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long end;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    private b1(List<l0> list, List<Float> list2, long j10, long j11, int i10) {
        this.colors = list;
        this.stops = list2;
        this.start = j10;
        this.end = j11;
        this.tileMode = i10;
    }

    public /* synthetic */ b1(List list, List list2, long j10, long j11, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? m2.INSTANCE.a() : i10, null);
    }

    public /* synthetic */ b1(List list, List list2, long j10, long j11, int i10, kotlin.jvm.internal.u uVar) {
        this(list, list2, j10, j11, i10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // androidx.compose.ui.graphics.a0
    /* JADX INFO: renamed from: b */
    public long getIntrinsicSize() {
        float fAbs;
        float fP = b1.f.p(this.start);
        float fAbs2 = Float.NaN;
        if ((Float.isInfinite(fP) || Float.isNaN(fP)) ? false : true) {
            float fP2 = b1.f.p(this.end);
            if ((Float.isInfinite(fP2) || Float.isNaN(fP2)) ? false : true) {
                fAbs = Math.abs(b1.f.p(this.start) - b1.f.p(this.end));
            } else {
                fAbs = Float.NaN;
            }
        } else {
            fAbs = Float.NaN;
        }
        float fR = b1.f.r(this.start);
        if ((Float.isInfinite(fR) || Float.isNaN(fR)) ? false : true) {
            float fR2 = b1.f.r(this.end);
            if ((Float.isInfinite(fR2) || Float.isNaN(fR2)) ? false : true) {
                fAbs2 = Math.abs(b1.f.r(this.start) - b1.f.r(this.end));
            }
        }
        return b1.n.a(fAbs, fAbs2);
    }

    @Override // androidx.compose.ui.graphics.c2
    @dl.d
    public Shader c(long size) {
        return d2.c(b1.g.a((b1.f.p(this.start) > Float.POSITIVE_INFINITY ? 1 : (b1.f.p(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.t(size) : b1.f.p(this.start), (b1.f.r(this.start) > Float.POSITIVE_INFINITY ? 1 : (b1.f.r(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.m(size) : b1.f.r(this.start)), b1.g.a((b1.f.p(this.end) > Float.POSITIVE_INFINITY ? 1 : (b1.f.p(this.end) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.m.t(size) : b1.f.p(this.end), b1.f.r(this.end) == Float.POSITIVE_INFINITY ? b1.m.m(size) : b1.f.r(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) other;
        return kotlin.jvm.internal.f0.g(this.colors, b1Var.colors) && kotlin.jvm.internal.f0.g(this.stops, b1Var.stops) && b1.f.l(this.start, b1Var.start) && b1.f.l(this.end, b1Var.end) && m2.h(this.tileMode, b1Var.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + b1.f.s(this.start)) * 31) + b1.f.s(this.end)) * 31) + m2.i(this.tileMode);
    }

    @dl.d
    public String toString() {
        String str;
        String str2 = "";
        if (b1.g.b(this.start)) {
            str = "start=" + ((Object) b1.f.y(this.start)) + ", ";
        } else {
            str = "";
        }
        if (b1.g.b(this.end)) {
            str2 = "end=" + ((Object) b1.f.y(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) m2.j(this.tileMode)) + ')';
    }
}
