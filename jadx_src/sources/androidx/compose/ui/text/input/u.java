package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyboardCapitalization.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/u;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", "g", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16772c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16773d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16774e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16775f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.u$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: KeyboardCapitalization.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/input/u$a;", "", "Landroidx/compose/ui/text/input/u;", d4.d.f108133a, "I", "b", "()I", "Characters", ak.av, "Words", "d", "Sentences", ak.aF, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return u.f16773d;
        }

        public final int b() {
            return u.f16772c;
        }

        public final int c() {
            return u.f16775f;
        }

        public final int d() {
            return u.f16774e;
        }
    }

    private /* synthetic */ u(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ u e(int i10) {
        return new u(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof u) && i10 == ((u) obj).getValue();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @dl.d
    public static String j(int i10) {
        if (h(i10, f16772c)) {
            return d4.d.f108133a;
        }
        if (h(i10, f16773d)) {
            return "Characters";
        }
        if (h(i10, f16774e)) {
            return "Words";
        }
        return h(i10, f16775f) ? "Sentences" : "Invalid";
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
