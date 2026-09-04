package androidx.compose.ui.text.input;

import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u0018B\u001a\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u00106\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b<\u0010=B\u001c\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0011\u0012\u0006\u00106\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b<\u0010>J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u000f\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR*\u0010'\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010*\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b,\u0010$R$\u00100\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u001f\u00103\u001a\u0004\u0018\u0001018@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u00102R\u001d\u00106\u001a\u0002018@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00107\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00058@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u0014\u0010;\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/input/i;", "", "", "m", "()Z", "", UCropPlusActivity.ARG_INDEX, "", "d", "(I)C", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/text/d;", "text", "Lkotlin/b2;", "n", "(IILandroidx/compose/ui/text/d;)V", "", "o", "(IILjava/lang/String;)V", ak.aF, "(II)V", "r", "p", ak.av, "()V", "b", "toString", ak.aG, "()Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/input/y;", "Landroidx/compose/ui/text/input/y;", "gapBuffer", "value", "I", "l", "()I", "t", "(I)V", "selectionStart", "k", ak.aB, "selectionEnd", "<set-?>", "g", "compositionStart", "e", "f", "compositionEnd", "Landroidx/compose/ui/text/o0;", "()Landroidx/compose/ui/text/o0;", "composition", "j", "()J", "selection", "cursor", RXScreenCaptureService.KEY_HEIGHT, "q", "i", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "<init>", "(Landroidx/compose/ui/text/d;JLkotlin/jvm/internal/u;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16728g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16729h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y gapBuffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int selectionStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int compositionStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    private i(androidx.compose.ui.text.d dVar, long j10) {
        this.gapBuffer = new y(dVar.getText());
        this.selectionStart = o0.l(j10);
        this.selectionEnd = o0.k(j10);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iL = o0.l(j10);
        int iK = o0.k(j10);
        if (iL < 0 || iL > dVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + dVar.length());
        }
        if (iK < 0 || iK > dVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + dVar.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }

    public /* synthetic */ i(androidx.compose.ui.text.d dVar, long j10, kotlin.jvm.internal.u uVar) {
        this(dVar, j10);
    }

    private i(String str, long j10) {
        this(new androidx.compose.ui.text.d(str, null, null, 6, null), j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ i(String str, long j10, kotlin.jvm.internal.u uVar) {
        this(str, j10);
    }

    private final void s(int i10) {
        if (i10 >= 0) {
            this.selectionEnd = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i10).toString());
    }

    private final void t(int i10) {
        if (i10 >= 0) {
            this.selectionStart = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i10).toString());
    }

    public final void a() {
        o(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void b() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void c(int start, int end) {
        long jB = p0.b(start, end);
        this.gapBuffer.d(start, end, "");
        long jA = j.a(p0.b(this.selectionStart, this.selectionEnd), jB);
        t(o0.l(jA));
        s(o0.k(jA));
        if (m()) {
            long jA2 = j.a(p0.b(this.compositionStart, this.compositionEnd), jB);
            if (o0.h(jA2)) {
                b();
            } else {
                this.compositionStart = o0.l(jA2);
                this.compositionEnd = o0.k(jA2);
            }
        }
    }

    public final char d(int index) {
        return this.gapBuffer.a(index);
    }

    @dl.e
    public final o0 e() {
        if (m()) {
            return o0.b(p0.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int h() {
        int i10 = this.selectionStart;
        int i11 = this.selectionEnd;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int i() {
        return this.gapBuffer.b();
    }

    public final long j() {
        return p0.b(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean m() {
        return this.compositionStart != -1;
    }

    public final void n(int start, int end, @dl.d androidx.compose.ui.text.d text) {
        kotlin.jvm.internal.f0.p(text, "text");
        o(start, end, text.getText());
    }

    public final void o(int start, int end, @dl.d String text) {
        kotlin.jvm.internal.f0.p(text, "text");
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            this.gapBuffer.d(start, end, text);
            t(text.length() + start);
            s(start + text.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void q(int i10) {
        r(i10, i10);
    }

    public final void r(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            t(start);
            s(end);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    @dl.d
    public String toString() {
        return this.gapBuffer.toString();
    }

    @dl.d
    public final androidx.compose.ui.text.d u() {
        return new androidx.compose.ui.text.d(toString(), null, null, 6, null);
    }
}
