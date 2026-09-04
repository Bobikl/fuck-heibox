package e1;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xh.f;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u000eB\u0014\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\f\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Le1/a;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", "e", "(ILjava/lang/Object;)Z", "value", "d", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
@f
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final C1069a f118531b = new C1069a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f118532c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f118533d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118534a;

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InputModeManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Le1/a$a;", "", "Le1/a;", "Touch", "I", "b", "()I", "Keyboard", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class C1069a {
        private C1069a() {
        }

        public /* synthetic */ C1069a(u uVar) {
            this();
        }

        public final int a() {
            return a.f118533d;
        }

        public final int b() {
            return a.f118532c;
        }
    }

    private /* synthetic */ a(int i10) {
        this.f118534a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).getF118534a();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @d
    public static String h(int i10) {
        if (f(i10, f118532c)) {
            return "Touch";
        }
        return f(i10, f118533d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f118534a, obj);
    }

    public int hashCode() {
        return g(this.f118534a);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ int getF118534a() {
        return this.f118534a;
    }

    @d
    public String toString() {
        return h(this.f118534a);
    }
}
