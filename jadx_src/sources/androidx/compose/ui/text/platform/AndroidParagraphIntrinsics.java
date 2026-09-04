package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.font.v;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(R\u001a\u0010-\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b&\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010<R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010<R\u0014\u0010A\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010@¨\u0006D"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/r;", "", ak.av, "Ljava/lang/String;", "l", "()Ljava/lang/String;", "text", "Landroidx/compose/ui/text/q0;", "b", "Landroidx/compose/ui/text/q0;", "k", "()Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", ak.aF, "Ljava/util/List;", "j", "()Ljava/util/List;", "spanStyles", "Landroidx/compose/ui/text/w;", "d", "i", "placeholders", "Landroidx/compose/ui/text/font/v$b;", "e", "Landroidx/compose/ui/text/font/v$b;", "g", "()Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/l;", "Landroidx/compose/ui/text/platform/l;", "n", "()Landroidx/compose/ui/text/platform/l;", "textPaint", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "", "Landroidx/compose/ui/text/platform/t;", "resolvedTypefaces", "", "I", "m", "()I", "textDirectionHeuristic", "Ls1/e;", "density", "Ls1/e;", "f", "()Ls1/e;", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "", "()Z", "hasStaleResolvedFonts", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/q0;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/v$b;Ls1/e;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidParagraphIntrinsics implements androidx.compose.ui.text.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v.b fontFamilyResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final s1.e f16841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l textPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<t> resolvedTypefaces;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    public AndroidParagraphIntrinsics(@dl.d String text, @dl.d TextStyle style, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, @dl.d v.b fontFamilyResolver, @dl.d s1.e density) {
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(spanStyles, "spanStyles");
        f0.p(placeholders, "placeholders");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(density, "density");
        this.text = text;
        this.style = style;
        this.spanStyles = spanStyles;
        this.placeholders = placeholders;
        this.fontFamilyResolver = fontFamilyResolver;
        this.f16841f = density;
        l lVar = new l(1, density.getF139217b());
        this.textPaint = lVar;
        this.resolvedTypefaces = new ArrayList();
        int iB = g.b(style.K(), style.D());
        this.textDirectionHeuristic = iB;
        yh.r<v, FontWeight, g0, h0, Typeface> rVar = new yh.r<v, FontWeight, g0, h0, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ Typeface U0(v vVar, FontWeight fontWeight, g0 g0Var, h0 h0Var) {
                return a(vVar, fontWeight, g0Var.j(), h0Var.getValue());
            }

            @dl.d
            public final Typeface a(@dl.e v vVar, @dl.d FontWeight fontWeight, int i10, int i11) {
                f0.p(fontWeight, "fontWeight");
                t tVar = new t(this.f16847b.getFontFamilyResolver().b(vVar, fontWeight, i10, i11));
                this.f16847b.resolvedTypefaces.add(tVar);
                return tVar.c();
            }
        };
        CharSequence charSequenceA = f.a(text, lVar.getTextSize(), style, CollectionsKt___CollectionsKt.y4(kotlin.collections.s.k(new androidx.compose.ui.text.d.Range(androidx.compose.ui.text.platform.extensions.e.a(lVar, style.X(), rVar, density), 0, text.length())), spanStyles), placeholders, density, rVar);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceA, lVar, iB);
    }

    @Override // androidx.compose.ui.text.r
    public float a() {
        return this.layoutIntrinsics.c();
    }

    @Override // androidx.compose.ui.text.r
    public float b() {
        return this.layoutIntrinsics.b();
    }

    @Override // androidx.compose.ui.text.r
    public boolean c() {
        List<t> list = this.resolvedTypefaces;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).d()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final s1.e getF16841f() {
        return this.f16841f;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final v.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @dl.d
    public final List<androidx.compose.ui.text.d.Range<Placeholder>> i() {
        return this.placeholders;
    }

    @dl.d
    public final List<androidx.compose.ui.text.d.Range<SpanStyle>> j() {
        return this.spanStyles;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final l getTextPaint() {
        return this.textPaint;
    }
}
