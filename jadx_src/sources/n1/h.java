package n1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.x;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LineHeightStyleSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\f\u001a\u00020\u0014\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0001\u0010#\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Ln1/h;", "Landroid/text/style/LineHeightSpan;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lkotlin/b2;", ak.av, "", "text", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "spanStartVertical", "lineHeight", "chooseHeight", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "", "trimFirstLineTop", "b", "(IIZ)Ln1/h;", "", "F", "f", "()F", "trimLastLineBottom", "Z", "g", "()Z", "<set-?>", "firstAscentDiff", "I", "d", "()I", "lastDescentDiff", "e", "topRatio", "<init>", "(FIIZZF)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f131949n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f131952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f131953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f131954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f131955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f131956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f131957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f131958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f131959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f131960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f131961m;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
        this.f131950b = f10;
        this.f131951c = i10;
        this.f131952d = i11;
        this.f131953e = z10;
        this.f131954f = z11;
        this.f131955g = f11;
        boolean z12 = true;
        if (!(0.0f <= f11 && f11 <= 1.0f)) {
            if (!(f11 == -1.0f)) {
                z12 = false;
            }
        }
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.f131950b);
        int i10 = iCeil - iA;
        float fAbs = this.f131955g;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (i10 <= 0 ? Math.ceil(i10 * fAbs) : Math.ceil(i10 * (1.0f - fAbs)));
        int i11 = fontMetricsInt.descent;
        int i12 = iCeil2 + i11;
        this.f131958j = i12;
        int i13 = i12 - iCeil;
        this.f131957i = i13;
        if (this.f131953e) {
            i13 = fontMetricsInt.ascent;
        }
        this.f131956h = i13;
        if (this.f131954f) {
            i12 = i11;
        }
        this.f131959k = i12;
        this.f131960l = fontMetricsInt.ascent - i13;
        this.f131961m = i12 - i11;
    }

    public static /* synthetic */ h c(h hVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = hVar.f131953e;
        }
        return hVar.b(i10, i11, z10);
    }

    @dl.d
    public final h b(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new h(this.f131950b, startIndex, endIndex, trimFirstLineTop, this.f131954f, this.f131955g);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@dl.d CharSequence text, int i10, int i11, int i12, int i13, @dl.d Paint.FontMetricsInt fontMetricsInt) {
        f0.p(text, "text");
        f0.p(fontMetricsInt, "fontMetricsInt");
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f131951c;
        boolean z11 = i11 == this.f131952d;
        if (z10 && z11 && this.f131953e && this.f131954f) {
            return;
        }
        if (z10) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f131956h : this.f131957i;
        fontMetricsInt.descent = z11 ? this.f131959k : this.f131958j;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF131960l() {
        return this.f131960l;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF131961m() {
        return this.f131961m;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getF131950b() {
        return this.f131950b;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF131954f() {
        return this.f131954f;
    }
}
