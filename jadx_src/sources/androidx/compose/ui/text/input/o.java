package androidx.compose.ui.text.input;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImeAction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/o;", "", "", "n", "(I)Ljava/lang/String;", "", "m", "(I)I", "other", "", "k", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "j", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16755c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16756d = j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16757e = j(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16758f = j(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f16759g = j(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f16760h = j(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f16761i = j(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f16762j = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ImeAction.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/input/o$a;", "", "Landroidx/compose/ui/text/input/o;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "I", ak.av, "()I", d4.d.f108133a, "e", "Go", ak.aF, "Search", "g", "Send", RXScreenCaptureService.KEY_HEIGHT, "Previous", "f", "Next", "d", "Done", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return o.f16755c;
        }

        public final int b() {
            return o.f16762j;
        }

        public final int c() {
            return o.f16757e;
        }

        public final int d() {
            return o.f16761i;
        }

        public final int e() {
            return o.f16756d;
        }

        public final int f() {
            return o.f16760h;
        }

        public final int g() {
            return o.f16758f;
        }

        public final int h() {
            return o.f16759g;
        }
    }

    private /* synthetic */ o(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ o i(int i10) {
        return new o(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof o) && i10 == ((o) obj).getValue();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return i10;
    }

    @dl.d
    public static String n(int i10) {
        if (l(i10, f16756d)) {
            return d4.d.f108133a;
        }
        if (l(i10, f16755c)) {
            return UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME;
        }
        if (l(i10, f16757e)) {
            return "Go";
        }
        if (l(i10, f16758f)) {
            return "Search";
        }
        if (l(i10, f16759g)) {
            return "Send";
        }
        if (l(i10, f16760h)) {
            return "Previous";
        }
        if (l(i10, f16761i)) {
            return "Next";
        }
        return l(i10, f16762j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return m(this.value);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return n(this.value);
    }
}
