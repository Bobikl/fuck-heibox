package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: TransformOrigin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0014ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004\u0088\u0001\u0019\u0092\u0001\u00020\u0014ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/o2;", "", "", ak.aF, "(J)F", "d", "pivotFractionX", "pivotFractionY", "f", "(JFF)J", "", "n", "(J)Ljava/lang/String;", "", "m", "(J)I", "other", "", RXScreenCaptureService.KEY_HEIGHT, "(JLjava/lang/Object;)Z", "", ak.av, "J", "getPackedValue$annotations", "()V", "packedValue", "k", "l", "e", "(J)J", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@androidx.compose.runtime.m0
public final class o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f13931c = p2.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.o2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TransformOrigin.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/o2$a;", "", "Landroidx/compose/ui/graphics/o2;", "Center", "J", ak.av, "()J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final long a() {
            return o2.f13931c;
        }
    }

    private /* synthetic */ o2(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ o2 b(long j10) {
        return new o2(j10);
    }

    @androidx.compose.runtime.j2
    public static final float c(long j10) {
        return k(j10);
    }

    @androidx.compose.runtime.j2
    public static final float d(long j10) {
        return l(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return p2.a(f10, f11);
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = k(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = l(j10);
        }
        return f(j10, f10, f11);
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof o2) && j10 == ((o2) obj).getPackedValue();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    @kotlin.r0
    public static /* synthetic */ void j() {
    }

    public static final float k(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float l(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int m(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static String n(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return h(this.packedValue, obj);
    }

    public int hashCode() {
        return m(this.packedValue);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return n(this.packedValue);
    }
}
