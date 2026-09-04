package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001Bª\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00106\u001a\u00020\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T\u0012\b\b\u0002\u0010F\u001a\u00020\u0004\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010Nø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R-\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR-\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b\u0019\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010/\u001a\u0004\b!\u00100\"\u0004\b1\u00102R+\u00106\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR-\u0010<\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\b\r\u00109\"\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\bE\u0010\nR$\u0010M\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bH\u0010J\"\u0004\bK\u0010LR$\u0010S\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010O\u001a\u0004\bD\u0010P\"\u0004\bQ\u0010RR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/platform/d1;", "", "Landroidx/compose/ui/text/d0;", "C", "Landroidx/compose/ui/graphics/l0;", ak.av, "J", ak.aF, "()J", "q", "(J)V", "color", "Ls1/u;", "b", "f", "t", com.google.android.exoplayer2.text.ttml.d.J, "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/k0;", "i", "()Landroidx/compose/ui/text/font/k0;", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/text/font/k0;)V", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", "d", "Landroidx/compose/ui/text/font/g0;", "g", "()Landroidx/compose/ui/text/font/g0;", ak.aG, "(Landroidx/compose/ui/text/font/g0;)V", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "e", "Landroidx/compose/ui/text/font/h0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/ui/text/font/h0;", "v", "(Landroidx/compose/ui/text/font/h0;)V", "fontSynthesis", "Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/v;", "()Landroidx/compose/ui/text/font/v;", "r", "(Landroidx/compose/ui/text/font/v;)V", com.google.android.exoplayer2.text.ttml.d.K, "", "Ljava/lang/String;", "()Ljava/lang/String;", ak.aB, "(Ljava/lang/String;)V", "fontFeatureSettings", "j", "x", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "Landroidx/compose/ui/text/style/a;", "()Landroidx/compose/ui/text/style/a;", "p", "(Landroidx/compose/ui/text/style/a;)V", "baselineShift", "Landroidx/compose/ui/text/style/m;", "Landroidx/compose/ui/text/style/m;", "n", "()Landroidx/compose/ui/text/style/m;", "B", "(Landroidx/compose/ui/text/style/m;)V", "textGeometricTransform", "l", "o", UiKitSpanObj.TYPE_BACKGROUND, "Landroidx/compose/ui/text/style/i;", "m", "Landroidx/compose/ui/text/style/i;", "()Landroidx/compose/ui/text/style/i;", androidx.exifinterface.media.a.W4, "(Landroidx/compose/ui/text/style/i;)V", com.google.android.exoplayer2.text.ttml.d.P, "Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/e2;", "()Landroidx/compose/ui/graphics/e2;", ak.aD, "(Landroidx/compose/ui/graphics/e2;)V", "shadow", "Lp1/f;", "localeList", "Lp1/f;", "k", "()Lp1/f;", "y", "(Lp1/f;)V", "<init>", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Lkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.font.g0 fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.font.h0 fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.font.v fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.style.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private LocaleList f15841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.style.i textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Shadow shadow;

    private d1(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow) {
        this.color = j10;
        this.fontSize = j11;
        this.fontWeight = fontWeight;
        this.fontStyle = g0Var;
        this.fontSynthesis = h0Var;
        this.fontFamily = vVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j12;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.f15841k = localeList;
        this.background = j13;
        this.textDecoration = iVar;
        this.shadow = shadow;
    }

    public /* synthetic */ d1(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : shadow, null);
    }

    public /* synthetic */ d1(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, androidx.compose.ui.text.style.i iVar, Shadow shadow, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, localeList, j13, iVar, shadow);
    }

    public final void A(@dl.e androidx.compose.ui.text.style.i iVar) {
        this.textDecoration = iVar;
    }

    public final void B(@dl.e TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    @dl.d
    public final SpanStyle C() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.f15841k, this.background, this.textDecoration, this.shadow, (kotlin.jvm.internal.u) null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.style.a getBaselineShift() {
        return this.baselineShift;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.compose.ui.text.font.v getFontFamily() {
        return this.fontFamily;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.font.g0 getFontStyle() {
        return this.fontStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: h, reason: from getter */
    public final androidx.compose.ui.text.font.h0 getFontSynthesis() {
        return this.fontSynthesis;
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    @dl.e
    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocaleList getF15841k() {
        return this.f15841k;
    }

    @dl.e
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.compose.ui.text.style.i getTextDecoration() {
        return this.textDecoration;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final void o(long j10) {
        this.background = j10;
    }

    public final void p(@dl.e androidx.compose.ui.text.style.a aVar) {
        this.baselineShift = aVar;
    }

    public final void q(long j10) {
        this.color = j10;
    }

    public final void r(@dl.e androidx.compose.ui.text.font.v vVar) {
        this.fontFamily = vVar;
    }

    public final void s(@dl.e String str) {
        this.fontFeatureSettings = str;
    }

    public final void t(long j10) {
        this.fontSize = j10;
    }

    public final void u(@dl.e androidx.compose.ui.text.font.g0 g0Var) {
        this.fontStyle = g0Var;
    }

    public final void v(@dl.e androidx.compose.ui.text.font.h0 h0Var) {
        this.fontSynthesis = h0Var;
    }

    public final void w(@dl.e FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public final void x(long j10) {
        this.letterSpacing = j10;
    }

    public final void y(@dl.e LocaleList localeList) {
        this.f15841k = localeList;
    }

    public final void z(@dl.e Shadow shadow) {
        this.shadow = shadow;
    }
}
