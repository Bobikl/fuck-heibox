package androidx.compose.ui.text;

import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.i0, reason: from toString */
/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u00108\u001a\u000203\u0012\u0006\u0010(\u001a\u00020'ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u001b\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020.H\u0016R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b1\u00102R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010(\u001a\u00020'8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;R\u0017\u0010?\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010A\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\b@\u0010>R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010HR\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/text/i0;", "", "", "lineIndex", ak.aG, "", "visibleEnd", "o", "D", "", "v", "m", ak.aB, "t", androidx.constraintlayout.core.motion.utils.w.c.R, "q", "vertical", "r", "usePrimaryDirection", "j", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "y", ak.aF, "Lb1/f;", CommonNetImpl.POSITION, "x", "(J)I", "Lb1/i;", "d", "Landroidx/compose/ui/text/o0;", "C", "(I)J", "e", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/l1;", ak.aD, "Landroidx/compose/ui/text/h0;", "layoutInput", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, ak.av, "(Landroidx/compose/ui/text/h0;J)Landroidx/compose/ui/text/i0;", "other", "equals", "hashCode", "", "toString", "Landroidx/compose/ui/text/h0;", "l", "()Landroidx/compose/ui/text/h0;", "Landroidx/compose/ui/text/j;", "b", "Landroidx/compose/ui/text/j;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/text/j;", "multiParagraph", "J", "B", "()J", "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", androidx.exifinterface.media.a.W4, "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "()I", "lineCount", "<init>", "(Landroidx/compose/ui/text/h0;Landroidx/compose/ui/text/j;JLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextLayoutResult {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16652g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final j multiParagraph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float firstBaseline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<b1.i> placeholderRects;

    private TextLayoutResult(TextLayoutInput textLayoutInput, j jVar, long j10) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = jVar;
        this.size = j10;
        this.firstBaseline = jVar.f();
        this.lastBaseline = jVar.j();
        this.placeholderRects = jVar.D();
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, j jVar, long j10, kotlin.jvm.internal.u uVar) {
        this(textLayoutInput, jVar, j10);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i10 & 2) != 0) {
            j10 = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j10);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResult.o(i10, z10);
    }

    @dl.d
    public final List<b1.i> A() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.F(offset);
    }

    public final boolean D(int lineIndex) {
        return this.multiParagraph.G(lineIndex);
    }

    @dl.d
    public final TextLayoutResult a(@dl.d TextLayoutInput layoutInput, long size) {
        kotlin.jvm.internal.f0.p(layoutInput, "layoutInput");
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    @dl.d
    public final ResolvedTextDirection c(int offset) {
        return this.multiParagraph.b(offset);
    }

    @dl.d
    public final b1.i d(int offset) {
        return this.multiParagraph.c(offset);
    }

    @dl.d
    public final b1.i e(int offset) {
        return this.multiParagraph.d(offset);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        if (!kotlin.jvm.internal.f0.g(this.layoutInput, textLayoutResult.layoutInput) || !kotlin.jvm.internal.f0.g(this.multiParagraph, textLayoutResult.multiParagraph) || !s1.r.h(this.size, textLayoutResult.size)) {
            return false;
        }
        if (this.firstBaseline == textLayoutResult.firstBaseline) {
            return ((this.lastBaseline > textLayoutResult.lastBaseline ? 1 : (this.lastBaseline == textLayoutResult.lastBaseline ? 0 : -1)) == 0) && kotlin.jvm.internal.f0.g(this.placeholderRects, textLayoutResult.placeholderRects);
        }
        return false;
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) s1.r.j(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) s1.r.m(this.size)) < this.multiParagraph.getWidth();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + s1.r.n(this.size)) * 31) + Float.floatToIntBits(this.firstBaseline)) * 31) + Float.floatToIntBits(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.h(offset, usePrimaryDirection);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.k(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.m(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.o(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.p(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.r(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.s(lineIndex);
    }

    @dl.d
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) s1.r.p(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.t(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.u(lineIndex);
    }

    @dl.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final j getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.z(position);
    }

    @dl.d
    public final ResolvedTextDirection y(int offset) {
        return this.multiParagraph.A(offset);
    }

    @dl.d
    public final l1 z(int start, int end) {
        return this.multiParagraph.C(start, end);
    }
}
