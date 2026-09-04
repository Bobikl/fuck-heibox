package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilledTonalButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b)\u0010\u000bR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00104\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b5\u0010\u000bR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lt0/w;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "ContainerHeight", ak.aF, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledContainerColor", "e", "DisabledContainerElevation", "f", "DisabledLabelTextColor", RXScreenCaptureService.KEY_HEIGHT, "FocusContainerElevation", "i", "FocusLabelTextColor", "k", "HoverContainerElevation", "l", "HoverLabelTextColor", "n", "LabelTextColor", "q", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "r", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedContainerElevation", ak.aB, "PressedLabelTextColor", ak.aG, "DisabledIconColor", "g", "FocusIconColor", "j", "HoverIconColor", "m", "IconColor", "o", "IconSize", "p", "PressedIconColor", "t", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w f140476a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140477b = ColorSchemeKeyTokens.SecondaryContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f140479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f140483h = 0.12f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f140485j = 0.38f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f140486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f140495t = 0.38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f140499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140500y;

    static {
        l lVar = l.f139980a;
        f140478c = lVar.a();
        f140479d = s1.h.g((float) 40.0d);
        f140480e = ShapeKeyTokens.CornerFull;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f140481f = colorSchemeKeyTokens;
        f140482g = lVar.a();
        f140484i = colorSchemeKeyTokens;
        f140486k = lVar.a();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        f140487l = colorSchemeKeyTokens2;
        f140488m = lVar.b();
        f140489n = colorSchemeKeyTokens2;
        f140490o = colorSchemeKeyTokens2;
        f140491p = TypographyKeyTokens.LabelLarge;
        f140492q = lVar.a();
        f140493r = colorSchemeKeyTokens2;
        f140494s = colorSchemeKeyTokens;
        f140496u = colorSchemeKeyTokens2;
        f140497v = colorSchemeKeyTokens2;
        f140498w = colorSchemeKeyTokens2;
        f140499x = s1.h.g((float) 18.0d);
        f140500y = colorSchemeKeyTokens2;
    }

    private w() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140477b;
    }

    public final float b() {
        return f140478c;
    }

    public final float c() {
        return f140479d;
    }

    @dl.d
    public final ShapeKeyTokens d() {
        return f140480e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140481f;
    }

    public final float f() {
        return f140482g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140494s;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f140484i;
    }

    public final float i() {
        return f140486k;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140496u;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140487l;
    }

    public final float l() {
        return f140488m;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140497v;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140489n;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140498w;
    }

    public final float p() {
        return f140499x;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140490o;
    }

    @dl.d
    public final TypographyKeyTokens r() {
        return f140491p;
    }

    public final float s() {
        return f140492q;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f140500y;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140493r;
    }
}
