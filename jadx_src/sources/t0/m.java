package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExtendedFabPrimaryTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010\u000bR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR \u0010,\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000bR \u0010.\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000bR \u00100\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u000bR \u00102\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000bR\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lt0/m;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "ContainerHeight", ak.aF, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "FocusContainerElevation", "e", "FocusIconColor", "f", "FocusLabelTextColor", "g", "HoverContainerElevation", RXScreenCaptureService.KEY_HEIGHT, "HoverIconColor", "i", "HoverLabelTextColor", "j", "IconColor", "k", "IconSize", "l", "LabelTextColor", "m", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "n", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LoweredContainerElevation", "o", "LoweredFocusContainerElevation", "p", "LoweredHoverContainerElevation", "q", "LoweredPressedContainerElevation", "r", "PressedContainerElevation", ak.aB, "PressedIconColor", "t", "PressedLabelTextColor", ak.aG, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m f140008a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140009b = ColorSchemeKeyTokens.PrimaryContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f140011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f140013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f140016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f140023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f140025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f140026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f140027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140029v;

    static {
        l lVar = l.f139980a;
        f140010c = lVar.d();
        f140011d = s1.h.g((float) 56.0d);
        f140012e = ShapeKeyTokens.CornerLarge;
        f140013f = lVar.d();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        f140014g = colorSchemeKeyTokens;
        f140015h = colorSchemeKeyTokens;
        f140016i = lVar.e();
        f140017j = colorSchemeKeyTokens;
        f140018k = colorSchemeKeyTokens;
        f140019l = colorSchemeKeyTokens;
        f140020m = s1.h.g((float) 24.0d);
        f140021n = colorSchemeKeyTokens;
        f140022o = TypographyKeyTokens.LabelLarge;
        f140023p = lVar.b();
        f140024q = lVar.b();
        f140025r = lVar.c();
        f140026s = lVar.b();
        f140027t = lVar.d();
        f140028u = colorSchemeKeyTokens;
        f140029v = colorSchemeKeyTokens;
    }

    private m() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140009b;
    }

    public final float b() {
        return f140010c;
    }

    public final float c() {
        return f140011d;
    }

    @dl.d
    public final ShapeKeyTokens d() {
        return f140012e;
    }

    public final float e() {
        return f140013f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f140014g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140015h;
    }

    public final float h() {
        return f140016i;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140017j;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140018k;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140019l;
    }

    public final float l() {
        return f140020m;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140021n;
    }

    @dl.d
    public final TypographyKeyTokens n() {
        return f140022o;
    }

    public final float o() {
        return f140023p;
    }

    public final float p() {
        return f140024q;
    }

    public final float q() {
        return f140025r;
    }

    public final float r() {
        return f140026s;
    }

    public final float s() {
        return f140027t;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f140028u;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140029v;
    }
}
