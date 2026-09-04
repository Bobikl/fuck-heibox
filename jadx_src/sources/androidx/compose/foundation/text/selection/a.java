package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.a;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000 K*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001 B4\u0012\u0006\u0010D\u001a\u00020@\u0012\u0006\u0010I\u001a\u00020E\u0012\b\u0010M\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010R\u001a\u00020N\u0012\u0006\u0010W\u001a\u00020Sø\u0001\u0001¢\u0006\u0004\bd\u0010eJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\r\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u000f\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J@\u0010 \u001a\u00028\u0000\"\u0004\b\u0001\u0010\u001a*\u00028\u00012\b\b\u0002\u0010\u001b\u001a\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eH\u0084\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000bH\u0004J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0004J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0004J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0004J\r\u0010(\u001a\u00028\u0000¢\u0006\u0004\b(\u0010\u0004J\r\u0010)\u001a\u00028\u0000¢\u0006\u0004\b)\u0010\u0004J&\u0010+\u001a\u00028\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u00028\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b-\u0010,J\u0006\u0010.\u001a\u00020\u000bJ\u0006\u0010/\u001a\u00020\u000bJ\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0004J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0004J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u0004J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00028\u0000¢\u0006\u0004\b7\u0010\u0004J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0004J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0004J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b;\u00105J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b=\u00105J\r\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010\u0004J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010\u0004J\r\u0010?\u001a\u00028\u0000¢\u0006\u0004\b?\u0010\u0004R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010CR \u0010I\u001a\u00020E8\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\f\n\u0004\bF\u0010\u0005\u001a\u0004\bG\u0010HR\u0019\u0010M\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b+\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010W\u001a\u00020S8\u0006¢\u0006\f\n\u0004\b-\u0010T\u001a\u0004\bU\u0010VR+\u0010[\u001a\u00020E8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\u0012\n\u0004\b'\u0010\u0005\u001a\u0004\bX\u0010H\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010A\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/foundation/text/selection/a;", androidx.exifinterface.media.a.f23244d5, "", "M", "()Landroidx/compose/foundation/text/selection/a;", "J", "L", "O", "", androidx.exifinterface.media.a.S4, "Landroidx/compose/ui/text/i0;", "", "currentOffset", "q", "y", "m", "j", "linesAmount", "F", "e0", "g0", "f0", androidx.constraintlayout.core.motion.utils.w.c.R, ak.aF, RXScreenCaptureService.KEY_WIDTH, "v", "U", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "block", ak.av, "(Ljava/lang/Object;ZLyh/l;)Landroidx/compose/foundation/text/selection/a;", "b0", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "c0", "Y", "f", "H", "P", "or", "d", "(Lyh/l;)Landroidx/compose/foundation/text/selection/a;", "e", "x", "o", androidx.exifinterface.media.a.R4, "R", "I", "Q", "p", "()Ljava/lang/Integer;", androidx.exifinterface.media.a.W4, "N", "K", "X", "G", "l", androidx.exifinterface.media.a.T4, "i", androidx.exifinterface.media.a.X4, "Z", "Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/d;", ak.aG, "()Landroidx/compose/ui/text/d;", "originalText", "Landroidx/compose/ui/text/o0;", "b", "t", "()J", "originalSelection", "Landroidx/compose/ui/text/i0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/ui/text/i0;", "layoutResult", "Landroidx/compose/ui/text/input/x;", "Landroidx/compose/ui/text/input/x;", ak.aB, "()Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/foundation/text/selection/u;", "Landroidx/compose/foundation/text/selection/u;", "C", "()Landroidx/compose/foundation/text/selection/u;", "state", "B", "d0", "(J)V", "selection", "g", "a0", "(Landroidx/compose/ui/text/d;)V", "annotatedString", "", "D", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/d;JLandroidx/compose/ui/text/i0;Landroidx/compose/ui/text/input/x;Landroidx/compose/foundation/text/selection/u;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public abstract class a<T extends a<T>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8342i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.d originalText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long originalSelection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x offsetMapping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.text.d annotatedString;

    private a(androidx.compose.ui.text.d dVar, long j10, TextLayoutResult textLayoutResult, x xVar, u uVar) {
        this.originalText = dVar;
        this.originalSelection = j10;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = xVar;
        this.state = uVar;
        this.selection = j10;
        this.annotatedString = dVar;
    }

    public /* synthetic */ a(androidx.compose.ui.text.d dVar, long j10, TextLayoutResult textLayoutResult, x xVar, u uVar, kotlin.jvm.internal.u uVar2) {
        this(dVar, j10, textLayoutResult, xVar, uVar);
    }

    private final boolean E() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.y(o0.i(this.selection)) : null) != ResolvedTextDirection.Rtl;
    }

    private final int F(TextLayoutResult textLayoutResult, int i10) {
        int iE0 = e0();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(textLayoutResult.e(iE0).t()));
        }
        int iQ = textLayoutResult.q(iE0) + i10;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= textLayoutResult.n()) {
            return D().length();
        }
        float fM = textLayoutResult.m(iQ) - 1;
        Float cachedX = this.state.getCachedX();
        f0.m(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((E() && fFloatValue >= textLayoutResult.t(iQ)) || (!E() && fFloatValue <= textLayoutResult.s(iQ))) {
            return textLayoutResult.o(iQ, true);
        }
        return this.offsetMapping.a(textLayoutResult.x(b1.g.a(cachedX.floatValue(), fM)));
    }

    private final T J() {
        int iO;
        getState().b();
        if ((D().length() > 0) && (iO = o()) != -1) {
            b0(iO);
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T L() {
        Integer numP;
        getState().b();
        if ((D().length() > 0) && (numP = p()) != null) {
            b0(numP.intValue());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T M() {
        int iX;
        getState().b();
        if ((D().length() > 0) && (iX = x()) != -1) {
            b0(iX);
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T O() {
        Integer numA;
        getState().b();
        if ((D().length() > 0) && (numA = A()) != null) {
            b0(numA.intValue());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public static /* synthetic */ a b(a aVar, Object obj, boolean z10, yh.l block, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        f0.p(block, "block");
        if (z10) {
            aVar.getState().b();
        }
        if (aVar.D().length() > 0) {
            block.invoke(obj);
        }
        f0.n(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (a) obj;
    }

    private final int c(int offset) {
        return fi.u.B(offset, D().length() - 1);
    }

    private final int e0() {
        return this.offsetMapping.b(o0.i(this.selection));
    }

    private final int f0() {
        return this.offsetMapping.b(o0.k(this.selection));
    }

    private final int g0() {
        return this.offsetMapping.b(o0.l(this.selection));
    }

    private final int j(TextLayoutResult textLayoutResult, int i10) {
        return this.offsetMapping.a(textLayoutResult.o(textLayoutResult.q(i10), true));
    }

    static /* synthetic */ int k(a aVar, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = aVar.f0();
        }
        return aVar.j(textLayoutResult, i10);
    }

    private final int m(TextLayoutResult textLayoutResult, int i10) {
        return this.offsetMapping.a(textLayoutResult.u(textLayoutResult.q(i10)));
    }

    static /* synthetic */ int n(a aVar, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = aVar.g0();
        }
        return aVar.m(textLayoutResult, i10);
    }

    private final int q(TextLayoutResult textLayoutResult, int i10) {
        if (i10 >= this.originalText.length()) {
            return this.originalText.length();
        }
        long jC = textLayoutResult.C(c(i10));
        return o0.i(jC) <= i10 ? q(textLayoutResult, i10 + 1) : this.offsetMapping.a(o0.i(jC));
    }

    static /* synthetic */ int r(a aVar, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = aVar.e0();
        }
        return aVar.q(textLayoutResult, i10);
    }

    private final int v() {
        return androidx.compose.foundation.text.m.a(D(), o0.k(this.selection));
    }

    private final int w() {
        return androidx.compose.foundation.text.m.b(D(), o0.l(this.selection));
    }

    private final int y(TextLayoutResult textLayoutResult, int i10) {
        if (i10 < 0) {
            return 0;
        }
        long jC = textLayoutResult.C(c(i10));
        return o0.n(jC) >= i10 ? y(textLayoutResult, i10 - 1) : this.offsetMapping.a(o0.n(jC));
    }

    static /* synthetic */ int z(a aVar, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = aVar.e0();
        }
        return aVar.y(textLayoutResult, i10);
    }

    @dl.e
    public final Integer A() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(z(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    @dl.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final u getState() {
        return this.state;
    }

    @dl.d
    public final String D() {
        return this.annotatedString.getText();
    }

    @dl.d
    public final T G() {
        TextLayoutResult textLayoutResult;
        if ((D().length() > 0) && (textLayoutResult = this.layoutResult) != null) {
            b0(F(textLayoutResult, 1));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T H() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                M();
            } else {
                J();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T I() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                O();
            } else {
                L();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T K() {
        getState().b();
        if (D().length() > 0) {
            b0(v());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T N() {
        getState().b();
        if (D().length() > 0) {
            b0(w());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T P() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                J();
            } else {
                M();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T Q() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                L();
            } else {
                O();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T R() {
        getState().b();
        if (D().length() > 0) {
            b0(D().length());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T S() {
        getState().b();
        if (D().length() > 0) {
            b0(0);
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T T() {
        Integer numI;
        getState().b();
        if ((D().length() > 0) && (numI = i()) != null) {
            b0(numI.intValue());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T U() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                W();
            } else {
                T();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T V() {
        getState().b();
        if (D().length() > 0) {
            if (E()) {
                T();
            } else {
                W();
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T W() {
        Integer numL;
        getState().b();
        if ((D().length() > 0) && (numL = l()) != null) {
            b0(numL.intValue());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T X() {
        TextLayoutResult textLayoutResult;
        if ((D().length() > 0) && (textLayoutResult = this.layoutResult) != null) {
            b0(F(textLayoutResult, -1));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T Y() {
        getState().b();
        if (D().length() > 0) {
            c0(0, D().length());
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T Z() {
        if (D().length() > 0) {
            this.selection = p0.b(o0.n(this.originalSelection), o0.i(this.selection));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    protected final <U> T a(U u10, boolean z10, @dl.d yh.l<? super U, b2> block) {
        f0.p(block, "block");
        if (z10) {
            getState().b();
        }
        if (D().length() > 0) {
            block.invoke(u10);
        }
        f0.n(u10, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u10;
    }

    public final void a0(@dl.d androidx.compose.ui.text.d dVar) {
        f0.p(dVar, "<set-?>");
        this.annotatedString = dVar;
    }

    protected final void b0(int i10) {
        c0(i10, i10);
    }

    protected final void c0(int i10, int i11) {
        this.selection = p0.b(i10, i11);
    }

    @dl.d
    public final T d(@dl.d yh.l<? super T, b2> or) {
        f0.p(or, "or");
        getState().b();
        if (D().length() > 0) {
            if (o0.h(this.selection)) {
                f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda-4");
                or.invoke(this);
            } else if (E()) {
                b0(o0.l(this.selection));
            } else {
                b0(o0.k(this.selection));
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void d0(long j10) {
        this.selection = j10;
    }

    @dl.d
    public final T e(@dl.d yh.l<? super T, b2> or) {
        f0.p(or, "or");
        getState().b();
        if (D().length() > 0) {
            if (o0.h(this.selection)) {
                f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda-5");
                or.invoke(this);
            } else if (E()) {
                b0(o0.k(this.selection));
            } else {
                b0(o0.l(this.selection));
            }
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final T f() {
        getState().b();
        if (D().length() > 0) {
            b0(o0.i(this.selection));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.d getAnnotatedString() {
        return this.annotatedString;
    }

    @dl.e
    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @dl.e
    public final Integer i() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @dl.e
    public final Integer l() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(n(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int o() {
        return androidx.compose.foundation.text.n.a(this.annotatedString.getText(), o0.i(this.selection));
    }

    @dl.e
    public final Integer p() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(r(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final x getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    @dl.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final androidx.compose.ui.text.d getOriginalText() {
        return this.originalText;
    }

    public final int x() {
        return androidx.compose.foundation.text.n.b(this.annotatedString.getText(), o0.i(this.selection));
    }
}
