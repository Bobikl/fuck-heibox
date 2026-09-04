package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: RenderIntent.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/i;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", "g", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13796c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13797d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f13798e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13799f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.i$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RenderIntent.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/i$a;", "", "Landroidx/compose/ui/graphics/colorspace/i;", "Perceptual", "I", "b", "()I", "Relative", ak.aF, androidx.exifinterface.media.a.f23304l1, "d", "Absolute", ak.av, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a() {
            return i.f13799f;
        }

        public final int b() {
            return i.f13796c;
        }

        public final int c() {
            return i.f13797d;
        }

        public final int d() {
            return i.f13798e;
        }
    }

    private /* synthetic */ i(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ i e(int i10) {
        return new i(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).getValue();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @dl.d
    public static String j(int i10) {
        if (h(i10, f13796c)) {
            return "Perceptual";
        }
        if (h(i10, f13797d)) {
            return "Relative";
        }
        if (h(i10, f13798e)) {
            return androidx.exifinterface.media.a.f23304l1;
        }
        return h(i10, f13799f) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return j(this.value);
    }
}
