package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OutlinedButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010R \u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006R\u0017\u0010&\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010\u0010R\u0017\u0010(\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010R\u0017\u0010*\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b+\u0010\u0010R\u0017\u0010,\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010R\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u0010\u0010R \u00102\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00104\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u0010\u000e\u001a\u0004\b5\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lt0/j0;", "", "Ls1/h;", "ContainerHeight", "F", ak.av, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledOutlineColor", "e", "FocusLabelTextColor", "g", "FocusOutlineColor", RXScreenCaptureService.KEY_HEIGHT, "HoverLabelTextColor", "j", "HoverOutlineColor", "k", "LabelTextColor", "n", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "o", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "OutlineColor", "p", "OutlineWidth", "q", "PressedLabelTextColor", ak.aB, "PressedOutlineColor", "t", "DisabledIconColor", ak.aF, "FocusIconColor", "f", "HoverIconColor", "i", "IconColor", "l", "IconSize", "m", "PressedIconColor", "r", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j0 f139922a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f139923b = s1.h.g((float) 40.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139924c = ShapeKeyTokens.CornerFull;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f139926e = 0.38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f139928g = 0.12f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f139936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f139940s = 0.38f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f139944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139945x;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139925d = colorSchemeKeyTokens;
        f139927f = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        f139929h = colorSchemeKeyTokens2;
        f139930i = colorSchemeKeyTokens2;
        f139931j = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Outline;
        f139932k = colorSchemeKeyTokens3;
        f139933l = colorSchemeKeyTokens2;
        f139934m = TypographyKeyTokens.LabelLarge;
        f139935n = colorSchemeKeyTokens3;
        f139936o = s1.h.g((float) 1.0d);
        f139937p = colorSchemeKeyTokens2;
        f139938q = colorSchemeKeyTokens3;
        f139939r = colorSchemeKeyTokens;
        f139941t = colorSchemeKeyTokens2;
        f139942u = colorSchemeKeyTokens2;
        f139943v = colorSchemeKeyTokens2;
        f139944w = s1.h.g((float) 18.0d);
        f139945x = colorSchemeKeyTokens2;
    }

    private j0() {
    }

    public final float a() {
        return f139923b;
    }

    @dl.d
    public final ShapeKeyTokens b() {
        return f139924c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139939r;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139925d;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139927f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139941t;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f139929h;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139930i;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139942u;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139931j;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139932k;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139943v;
    }

    public final float m() {
        return f139944w;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139933l;
    }

    @dl.d
    public final TypographyKeyTokens o() {
        return f139934m;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139935n;
    }

    public final float q() {
        return f139936o;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139945x;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139937p;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f139938q;
    }
}
