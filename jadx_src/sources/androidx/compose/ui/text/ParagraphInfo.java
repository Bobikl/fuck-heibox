package androidx.compose.ui.text;

import androidx.compose.ui.graphics.l1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.o, reason: from toString */
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0002J\n\u0010\b\u001a\u00020\u0007*\u00020\u0007J\n\u0010\t\u001a\u00020\u0007*\u00020\u0007J\u0017\u0010\u000b\u001a\u00020\n*\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u00020\r*\u00020\rJ\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000fJ\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\fJ\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007HÆ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b/\u0010.R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b0\u0010.\"\u0004\b1\u00102R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00102R\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00105\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/ui/text/o;", "", "", "C", "y", "D", ak.aD, "", androidx.exifinterface.media.a.W4, androidx.exifinterface.media.a.S4, "Lb1/f;", "B", "(J)J", "Lb1/i;", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/ui/graphics/l1;", "v", "Landroidx/compose/ui/text/o0;", "x", "Landroidx/compose/ui/text/n;", ak.av, "b", ak.aF, "d", "e", "f", "g", "paragraph", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "startLineIndex", "endLineIndex", "top", "bottom", RXScreenCaptureService.KEY_HEIGHT, "", "toString", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/n;", "n", "()Landroidx/compose/ui/text/n;", "I", "o", "()I", "k", "p", "t", "(I)V", "l", ak.aB, "F", "q", "()F", ak.aG, "(F)V", "j", "r", "m", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "<init>", "(Landroidx/compose/ui/text/n;IIIIFF)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ParagraphInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final n paragraph;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int startLineIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private int endLineIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private float top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private float bottom;

    public ParagraphInfo(@dl.d n paragraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        kotlin.jvm.internal.f0.p(paragraph, "paragraph");
        this.paragraph = paragraph;
        this.startIndex = i10;
        this.endIndex = i11;
        this.startLineIndex = i12;
        this.endLineIndex = i13;
        this.top = f10;
        this.bottom = f11;
    }

    public /* synthetic */ ParagraphInfo(n nVar, int i10, int i11, int i12, int i13, float f10, float f11, int i14, kotlin.jvm.internal.u uVar) {
        this(nVar, i10, i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? -1 : i13, (i14 & 32) != 0 ? -1.0f : f10, (i14 & 64) != 0 ? -1.0f : f11);
    }

    public static /* synthetic */ ParagraphInfo i(ParagraphInfo paragraphInfo, n nVar, int i10, int i11, int i12, int i13, float f10, float f11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            nVar = paragraphInfo.paragraph;
        }
        if ((i14 & 2) != 0) {
            i10 = paragraphInfo.startIndex;
        }
        int i15 = i10;
        if ((i14 & 4) != 0) {
            i11 = paragraphInfo.endIndex;
        }
        int i16 = i11;
        if ((i14 & 8) != 0) {
            i12 = paragraphInfo.startLineIndex;
        }
        int i17 = i12;
        if ((i14 & 16) != 0) {
            i13 = paragraphInfo.endLineIndex;
        }
        int i18 = i13;
        if ((i14 & 32) != 0) {
            f10 = paragraphInfo.top;
        }
        float f12 = f10;
        if ((i14 & 64) != 0) {
            f11 = paragraphInfo.bottom;
        }
        return paragraphInfo.h(nVar, i15, i16, i17, i18, f12, f11);
    }

    public final float A(float f10) {
        return f10 + this.top;
    }

    public final long B(long j10) {
        return b1.g.a(b1.f.p(j10), b1.f.r(j10) - this.top);
    }

    public final int C(int i10) {
        return fi.u.I(i10, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int D(int i10) {
        return i10 - this.startLineIndex;
    }

    public final float E(float f10) {
        return f10 - this.top;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getParagraph() {
        return this.paragraph;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return kotlin.jvm.internal.f0.g(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && kotlin.jvm.internal.f0.g(Float.valueOf(this.top), Float.valueOf(paragraphInfo.top)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.bottom), Float.valueOf(paragraphInfo.bottom));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @dl.d
    public final ParagraphInfo h(@dl.d n paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        kotlin.jvm.internal.f0.p(paragraph, "paragraph");
        return new ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.startLineIndex) * 31) + this.endLineIndex) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.bottom);
    }

    public final float j() {
        return this.bottom;
    }

    public final int k() {
        return this.endIndex;
    }

    public final int l() {
        return this.endLineIndex;
    }

    public final int m() {
        return this.endIndex - this.startIndex;
    }

    @dl.d
    public final n n() {
        return this.paragraph;
    }

    public final int o() {
        return this.startIndex;
    }

    public final int p() {
        return this.startLineIndex;
    }

    public final float q() {
        return this.top;
    }

    public final void r(float f10) {
        this.bottom = f10;
    }

    public final void s(int i10) {
        this.endLineIndex = i10;
    }

    public final void t(int i10) {
        this.startLineIndex = i10;
    }

    @dl.d
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public final void u(float f10) {
        this.top = f10;
    }

    @dl.d
    public final l1 v(@dl.d l1 l1Var) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        l1Var.d(b1.g.a(0.0f, this.top));
        return l1Var;
    }

    @dl.d
    public final b1.i w(@dl.d b1.i iVar) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        return iVar.S(b1.g.a(0.0f, this.top));
    }

    public final long x(long j10) {
        return p0.b(y(o0.n(j10)), y(o0.i(j10)));
    }

    public final int y(int i10) {
        return i10 + this.startIndex;
    }

    public final int z(int i10) {
        return i10 + this.startLineIndex;
    }
}
