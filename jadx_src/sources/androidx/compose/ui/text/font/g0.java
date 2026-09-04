package androidx.compose.ui.text.font;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: FontStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/g0;", "", "", "i", "(I)Ljava/lang/String;", "", RXScreenCaptureService.KEY_HEIGHT, "(I)I", "other", "", "e", "(ILjava/lang/Object;)Z", ak.av, "I", "g", "()I", "value", "d", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16551c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16552d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.g0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000R \u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/g0$a;", "", "", "Landroidx/compose/ui/text/font/g0;", ak.aF, "Normal", "I", "b", "()I", "Italic", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return g0.f16552d;
        }

        public final int b() {
            return g0.f16551c;
        }

        @dl.d
        public final List<g0> c() {
            return CollectionsKt__CollectionsKt.L(g0.c(b()), g0.c(a()));
        }
    }

    private /* synthetic */ g0(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ g0 c(int i10) {
        return new g0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof g0) && i10 == ((g0) obj).j();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @dl.d
    public static String i(int i10) {
        if (f(i10, f16551c)) {
            return "Normal";
        }
        return f(i10, f16552d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return h(this.value);
    }

    public final /* synthetic */ int j() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return i(this.value);
    }
}
