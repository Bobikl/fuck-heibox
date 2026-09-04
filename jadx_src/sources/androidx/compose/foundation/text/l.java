package androidx.compose.foundation.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b2\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R \u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b%\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R \u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b)\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\r\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b+\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/text/l;", "", "Landroidx/compose/ui/input/key/a;", "b", "J", ak.av, "()J", androidx.exifinterface.media.a.W4, ak.aF, "d", "C", "l", "H", "e", "t", androidx.exifinterface.media.a.X4, "f", ak.aG, "X", "g", "v", "Z", RXScreenCaptureService.KEY_HEIGHT, "Backslash", "i", "DirectionLeft", "j", "DirectionRight", "k", "DirectionUp", "DirectionDown", "m", "q", "PageUp", "n", "p", "PageDown", "o", "MoveHome", "MoveEnd", "Insert", "r", "Enter", ak.aB, "Backspace", "Delete", "Paste", "Cut", RXScreenCaptureService.KEY_WIDTH, "Tab", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f8087a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long A = androidx.compose.ui.input.key.f.a(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long C = androidx.compose.ui.input.key.f.a(31);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long H = androidx.compose.ui.input.key.f.a(36);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long V = androidx.compose.ui.input.key.f.a(50);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long X = androidx.compose.ui.input.key.f.a(52);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long Z = androidx.compose.ui.input.key.f.a(54);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long Backslash = androidx.compose.ui.input.key.f.a(73);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionLeft = androidx.compose.ui.input.key.f.a(21);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionRight = androidx.compose.ui.input.key.f.a(22);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionUp = androidx.compose.ui.input.key.f.a(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionDown = androidx.compose.ui.input.key.f.a(20);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long PageUp = androidx.compose.ui.input.key.f.a(92);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long PageDown = androidx.compose.ui.input.key.f.a(93);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long MoveHome = androidx.compose.ui.input.key.f.a(122);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long MoveEnd = androidx.compose.ui.input.key.f.a(123);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long Insert = androidx.compose.ui.input.key.f.a(124);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Enter = androidx.compose.ui.input.key.f.a(66);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long Backspace = androidx.compose.ui.input.key.f.a(67);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long Delete = androidx.compose.ui.input.key.f.a(112);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long Paste = androidx.compose.ui.input.key.f.a(bb.c.b.f30942t2);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long Cut = androidx.compose.ui.input.key.f.a(bb.c.b.f30898r2);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long Tab = androidx.compose.ui.input.key.f.a(61);

    private l() {
    }

    public final long a() {
        return A;
    }

    public final long b() {
        return Backslash;
    }

    public final long c() {
        return Backspace;
    }

    public final long d() {
        return C;
    }

    public final long e() {
        return Cut;
    }

    public final long f() {
        return Delete;
    }

    public final long g() {
        return DirectionDown;
    }

    public final long h() {
        return DirectionLeft;
    }

    public final long i() {
        return DirectionRight;
    }

    public final long j() {
        return DirectionUp;
    }

    public final long k() {
        return Enter;
    }

    public final long l() {
        return H;
    }

    public final long m() {
        return Insert;
    }

    public final long n() {
        return MoveEnd;
    }

    public final long o() {
        return MoveHome;
    }

    public final long p() {
        return PageDown;
    }

    public final long q() {
        return PageUp;
    }

    public final long r() {
        return Paste;
    }

    public final long s() {
        return Tab;
    }

    public final long t() {
        return V;
    }

    public final long u() {
        return X;
    }

    public final long v() {
        return Z;
    }
}
