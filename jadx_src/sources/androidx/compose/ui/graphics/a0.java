package androidx.compose.ui.graphics;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR#\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0011\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/a0;", "", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/graphics/h1;", "p", "", "alpha", "Lkotlin/b2;", ak.av, "(JLandroidx/compose/ui/graphics/h1;F)V", "J", "b", "()J", "intrinsicSize", "<init>", "()V", "Landroidx/compose/ui/graphics/c2;", "Landroidx/compose/ui/graphics/h2;", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.a0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Brush.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J_\u0010\r\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J_\u0010\u0017\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0016J_\u0010\u001c\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0018J_\u0010\u001f\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JA\u0010!\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JK\u0010#\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/a0$a;", "", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/l0;", "colorStops", "Lb1/f;", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/m2;", "tileMode", "Landroidx/compose/ui/graphics/a0;", "f", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/a0;", "", "colors", "e", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/a0;", "startX", "endX", ak.av, "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/a0;", "b", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/a0;", "startY", "endY", "q", "r", com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", "j", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/a0;", "i", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/a0;", "n", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/a0;", "m", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/a0;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ a0 c(Companion companion, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.a(list, f10, f11, i10);
        }

        public static /* synthetic */ a0 d(Companion companion, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.b(pairArr, f10, f11, i10);
        }

        public static /* synthetic */ a0 g(Companion companion, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = b1.f.f30364b.e();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = b1.f.f30364b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.e(list, j12, j13, i10);
        }

        public static /* synthetic */ a0 h(Companion companion, Pair[] pairArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = b1.f.f30364b.e();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = b1.f.f30364b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.f(pairArr, j12, j13, i10);
        }

        public static /* synthetic */ a0 k(Companion companion, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = b1.f.f30364b.c();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.i(list, j11, f11, i10);
        }

        public static /* synthetic */ a0 l(Companion companion, Pair[] pairArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = b1.f.f30364b.c();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.j(pairArr, j11, f11, i10);
        }

        public static /* synthetic */ a0 o(Companion companion, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = b1.f.f30364b.c();
            }
            return companion.m(list, j10);
        }

        public static /* synthetic */ a0 p(Companion companion, Pair[] pairArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = b1.f.f30364b.c();
            }
            return companion.n(pairArr, j10);
        }

        public static /* synthetic */ a0 s(Companion companion, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.q(list, f10, f11, i10);
        }

        public static /* synthetic */ a0 t(Companion companion, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m2.INSTANCE.a();
            }
            return companion.r(pairArr, f10, f11, i10);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 a(@dl.d List<l0> colors, float startX, float endX, int tileMode) {
            kotlin.jvm.internal.f0.p(colors, "colors");
            return e(colors, b1.g.a(startX, 0.0f), b1.g.a(endX, 0.0f), tileMode);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 b(@dl.d Pair<Float, l0>[] colorStops, float startX, float endX, int tileMode) {
            kotlin.jvm.internal.f0.p(colorStops, "colorStops");
            return f((Pair[]) Arrays.copyOf(colorStops, colorStops.length), b1.g.a(startX, 0.0f), b1.g.a(endX, 0.0f), tileMode);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 e(@dl.d List<l0> colors, long start, long end, int tileMode) {
            kotlin.jvm.internal.f0.p(colors, "colors");
            return new b1(colors, null, start, end, tileMode, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 f(@dl.d Pair<Float, l0>[] colorStops, long start, long end, int tileMode) {
            kotlin.jvm.internal.f0.p(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair : colorStops) {
                arrayList.add(l0.n(pair.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.e().floatValue()));
            }
            return new b1(arrayList, arrayList2, start, end, tileMode, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 i(@dl.d List<l0> colors, long center, float radius, int tileMode) {
            kotlin.jvm.internal.f0.p(colors, "colors");
            return new v1(colors, null, center, radius, tileMode, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 j(@dl.d Pair<Float, l0>[] colorStops, long center, float radius, int tileMode) {
            kotlin.jvm.internal.f0.p(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair : colorStops) {
                arrayList.add(l0.n(pair.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.e().floatValue()));
            }
            return new v1(arrayList, arrayList2, center, radius, tileMode, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 m(@dl.d List<l0> colors, long center) {
            kotlin.jvm.internal.f0.p(colors, "colors");
            return new l2(center, colors, null, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 n(@dl.d Pair<Float, l0>[] colorStops, long center) {
            kotlin.jvm.internal.f0.p(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair : colorStops) {
                arrayList.add(l0.n(pair.f().M()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, l0> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.e().floatValue()));
            }
            return new l2(center, arrayList, arrayList2, null);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 q(@dl.d List<l0> colors, float startY, float endY, int tileMode) {
            kotlin.jvm.internal.f0.p(colors, "colors");
            return e(colors, b1.g.a(0.0f, startY), b1.g.a(0.0f, endY), tileMode);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final a0 r(@dl.d Pair<Float, l0>[] colorStops, float startY, float endY, int tileMode) {
            kotlin.jvm.internal.f0.p(colorStops, "colorStops");
            return f((Pair[]) Arrays.copyOf(colorStops, colorStops.length), b1.g.a(0.0f, startY), b1.g.a(0.0f, endY), tileMode);
        }
    }

    private a0() {
        this.intrinsicSize = b1.m.f30386b.a();
    }

    public /* synthetic */ a0(kotlin.jvm.internal.u uVar) {
        this();
    }

    public abstract void a(long size, @dl.d h1 p10, float alpha);

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }
}
