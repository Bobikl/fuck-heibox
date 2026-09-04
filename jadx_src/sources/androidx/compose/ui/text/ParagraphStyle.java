package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.u, reason: from toString */
/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001Bj\b\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018ø\u0001\u0001¢\u0006\u0004\bA\u0010BB:\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0001¢\u0006\u0004\bA\u0010CBR\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0001¢\u0006\u0004\bA\u0010DJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002JA\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015Js\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020 H\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u0010<\u001a\u0004\b7\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/u;", "", "Landroidx/compose/ui/text/y;", "other", ak.aB, "q", "t", "Landroidx/compose/ui/text/style/h;", com.google.android.exoplayer2.text.ttml.d.Q, "Landroidx/compose/ui/text/style/j;", "textDirection", "Ls1/u;", "lineHeight", "Landroidx/compose/ui/text/style/o;", "textIndent", ak.av, "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;)Landroidx/compose/ui/text/u;", "platformStyle", "Landroidx/compose/ui/text/style/g;", "lineHeightStyle", "e", "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/style/g;)Landroidx/compose/ui/text/u;", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", ak.aF, "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;)Landroidx/compose/ui/text/u;", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/style/h;", "n", "()Landroidx/compose/ui/text/style/h;", "b", "Landroidx/compose/ui/text/style/j;", "o", "()Landroidx/compose/ui/text/style/j;", "J", "k", "()J", "d", "Landroidx/compose/ui/text/style/o;", "p", "()Landroidx/compose/ui/text/style/o;", "Landroidx/compose/ui/text/y;", "m", "()Landroidx/compose/ui/text/y;", "f", "Landroidx/compose/ui/text/style/g;", "l", "()Landroidx/compose/ui/text/style/g;", "g", "Landroidx/compose/ui/text/style/f;", "i", "()Landroidx/compose/ui/text/style/f;", "getLineBreak$annotations", "()V", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/style/e;", "()Landroidx/compose/ui/text/style/e;", "getHyphens$annotations", "<init>", "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/style/g;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Lkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/j;JLandroidx/compose/ui/text/style/o;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/style/g;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class ParagraphStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.style.h textAlign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.style.j textDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final TextIndent textIndent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final PlatformParagraphStyle platformStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final LineHeightStyle lineHeightStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final LineBreak lineBreak;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.style.e hyphens;

    private ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar) {
        this(hVar, jVar, j10, oVar, null, null, null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? s1.u.f139249b.b() : j10, (i10 & 8) != 0 ? null : oVar, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar) {
        this(hVar, jVar, j10, oVar, platformParagraphStyle, gVar, null, null, null);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? s1.u.f139249b.b() : j10, (i10 & 8) != 0 ? null : oVar, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) == 0 ? gVar : null, null);
    }

    private ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar) {
        this.textAlign = hVar;
        this.textDirection = jVar;
        this.lineHeight = j10;
        this.textIndent = oVar;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = gVar;
        this.lineBreak = lineBreak;
        this.hyphens = eVar;
        if (s1.u.j(j10, s1.u.f139249b.b())) {
            return;
        }
        if (s1.u.n(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + s1.u.n(j10) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? s1.u.f139249b.b() : j10, (i10 & 8) != 0 ? null : oVar, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : gVar, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) == 0 ? eVar : null, null);
    }

    @g
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, LineBreak lineBreak, androidx.compose.ui.text.style.e eVar, kotlin.jvm.internal.u uVar) {
        this(hVar, jVar, j10, oVar, platformParagraphStyle, gVar, lineBreak, eVar);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, kotlin.jvm.internal.u uVar) {
        this(hVar, jVar, j10, oVar, platformParagraphStyle, gVar);
    }

    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, kotlin.jvm.internal.u uVar) {
        this(hVar, jVar, j10, oVar);
    }

    public static /* synthetic */ ParagraphStyle b(ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = paragraphStyle.textAlign;
        }
        if ((i10 & 2) != 0) {
            jVar = paragraphStyle.textDirection;
        }
        androidx.compose.ui.text.style.j jVar2 = jVar;
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            oVar = paragraphStyle.textIndent;
        }
        return paragraphStyle.a(hVar, jVar2, j11, oVar);
    }

    public static /* synthetic */ ParagraphStyle f(ParagraphStyle paragraphStyle, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.j jVar, long j10, TextIndent oVar, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = paragraphStyle.textAlign;
        }
        if ((i10 & 2) != 0) {
            jVar = paragraphStyle.textDirection;
        }
        androidx.compose.ui.text.style.j jVar2 = jVar;
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            oVar = paragraphStyle.textIndent;
        }
        TextIndent oVar2 = oVar;
        if ((i10 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i10 & 32) != 0) {
            gVar = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.e(hVar, jVar2, j11, oVar2, platformParagraphStyle2, gVar);
    }

    @g
    public static /* synthetic */ void h() {
    }

    @g
    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ ParagraphStyle r(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.q(paragraphStyle2);
    }

    private final PlatformParagraphStyle s(PlatformParagraphStyle other) {
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        if (platformParagraphStyle == null) {
            return other;
        }
        return other == null ? platformParagraphStyle : platformParagraphStyle.d(other);
    }

    @dl.d
    public final ParagraphStyle a(@dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, null);
    }

    @dl.d
    @g
    public final ParagraphStyle c(@dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent, @dl.e PlatformParagraphStyle platformStyle, @dl.e LineHeightStyle lineHeightStyle, @dl.e LineBreak lineBreak, @dl.e androidx.compose.ui.text.style.e hyphens) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, null);
    }

    @dl.d
    public final ParagraphStyle e(@dl.e androidx.compose.ui.text.style.h textAlign, @dl.e androidx.compose.ui.text.style.j textDirection, long lineHeight, @dl.e TextIndent textIndent, @dl.e PlatformParagraphStyle platformStyle, @dl.e LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return kotlin.jvm.internal.f0.g(this.textAlign, paragraphStyle.textAlign) && kotlin.jvm.internal.f0.g(this.textDirection, paragraphStyle.textDirection) && s1.u.j(this.lineHeight, paragraphStyle.lineHeight) && kotlin.jvm.internal.f0.g(this.textIndent, paragraphStyle.textIndent) && kotlin.jvm.internal.f0.g(this.platformStyle, paragraphStyle.platformStyle) && kotlin.jvm.internal.f0.g(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && kotlin.jvm.internal.f0.g(this.lineBreak, paragraphStyle.lineBreak) && kotlin.jvm.internal.f0.g(this.hyphens, paragraphStyle.hyphens);
    }

    @dl.e
    @g
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.style.e getHyphens() {
        return this.hyphens;
    }

    public int hashCode() {
        androidx.compose.ui.text.style.h hVar = this.textAlign;
        int iK = (hVar != null ? androidx.compose.ui.text.style.h.k(hVar.getValue()) : 0) * 31;
        androidx.compose.ui.text.style.j jVar = this.textDirection;
        int iJ = (((iK + (jVar != null ? androidx.compose.ui.text.style.j.j(jVar.getValue()) : 0)) * 31) + s1.u.o(this.lineHeight)) * 31;
        TextIndent oVar = this.textIndent;
        int iHashCode = (iJ + (oVar != null ? oVar.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle gVar = this.lineHeightStyle;
        int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        LineBreak lineBreak = this.lineBreak;
        int iHashCode4 = (iHashCode3 + (lineBreak != null ? lineBreak.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.e eVar = this.hyphens;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    @dl.e
    @g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final LineBreak getLineBreak() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    @dl.e
    /* JADX INFO: renamed from: l, reason: from getter */
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final androidx.compose.ui.text.style.h getTextAlign() {
        return this.textAlign;
    }

    @dl.e
    /* JADX INFO: renamed from: o, reason: from getter */
    public final androidx.compose.ui.text.style.j getTextDirection() {
        return this.textDirection;
    }

    @dl.e
    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @j2
    @dl.d
    public final ParagraphStyle q(@dl.e ParagraphStyle other) {
        if (other == null) {
            return this;
        }
        long j10 = s1.v.s(other.lineHeight) ? this.lineHeight : other.lineHeight;
        TextIndent oVar = other.textIndent;
        if (oVar == null) {
            oVar = this.textIndent;
        }
        TextIndent oVar2 = oVar;
        androidx.compose.ui.text.style.h hVar = other.textAlign;
        if (hVar == null) {
            hVar = this.textAlign;
        }
        androidx.compose.ui.text.style.h hVar2 = hVar;
        androidx.compose.ui.text.style.j jVar = other.textDirection;
        if (jVar == null) {
            jVar = this.textDirection;
        }
        androidx.compose.ui.text.style.j jVar2 = jVar;
        PlatformParagraphStyle platformParagraphStyleS = s(other.platformStyle);
        LineHeightStyle gVar = other.lineHeightStyle;
        if (gVar == null) {
            gVar = this.lineHeightStyle;
        }
        LineHeightStyle gVar2 = gVar;
        LineBreak lineBreak = other.lineBreak;
        if (lineBreak == null) {
            lineBreak = this.lineBreak;
        }
        LineBreak lineBreak2 = lineBreak;
        androidx.compose.ui.text.style.e eVar = other.hyphens;
        if (eVar == null) {
            eVar = this.hyphens;
        }
        return new ParagraphStyle(hVar2, jVar2, j10, oVar2, platformParagraphStyleS, gVar2, lineBreak2, eVar, null);
    }

    @j2
    @dl.d
    public final ParagraphStyle t(@dl.d ParagraphStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return q(other);
    }

    @dl.d
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + ((Object) s1.u.u(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + this.lineBreak + ", hyphens=" + this.hyphens + ')';
    }
}
