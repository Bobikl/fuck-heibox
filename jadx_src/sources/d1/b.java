package d1;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.u;
import xh.f;

/* JADX INFO: compiled from: HapticFeedbackType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u000eB\u0012\u0012\u0006\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\f\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Ld1/b;", "", "", "f", "(I)Ljava/lang/String;", "", "e", "(I)I", "other", "", ak.aF, "(ILjava/lang/Object;)Z", "value", "b", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
@f
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f108126b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108127a;

    /* JADX INFO: compiled from: HapticFeedbackType.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000R\u001a\u0010\u0007\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Ld1/b$a;", "", "", "Ld1/b;", ak.aF, ak.av, "()I", "LongPress", "b", "TextHandleMove", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final int a() {
            return d.f108129a.a();
        }

        public final int b() {
            return d.f108129a.b();
        }

        @dl.d
        public final List<b> c() {
            return CollectionsKt__CollectionsKt.L(b.a(a()), b.a(b()));
        }
    }

    private /* synthetic */ b(int i10) {
        this.f108127a = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).getF108127a();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return i10;
    }

    @dl.d
    public static String f(int i10) {
        a aVar = f108126b;
        if (d(i10, aVar.a())) {
            return "LongPress";
        }
        return d(i10, aVar.b()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return c(this.f108127a, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ int getF108127a() {
        return this.f108127a;
    }

    public int hashCode() {
        return e(this.f108127a);
    }

    @dl.d
    public String toString() {
        return f(this.f108127a);
    }
}
