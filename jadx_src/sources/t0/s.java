package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilledButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b)\u0010\u000bR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00104\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b5\u0010\u000bR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lt0/s;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "ContainerHeight", ak.aF, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledContainerColor", "e", "DisabledContainerElevation", "f", "DisabledLabelTextColor", RXScreenCaptureService.KEY_HEIGHT, "FocusContainerElevation", "i", "FocusLabelTextColor", "k", "HoverContainerElevation", "l", "HoverLabelTextColor", "n", "LabelTextColor", "q", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "r", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedContainerElevation", ak.aB, "PressedLabelTextColor", ak.aG, "DisabledIconColor", "g", "FocusIconColor", "j", "HoverIconColor", "m", "IconColor", "o", "IconSize", "p", "PressedIconColor", "t", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s f140298a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140299b = ColorSchemeKeyTokens.Primary;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f140301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f140305h = 0.12f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f140307j = 0.38f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f140308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f140317t = 0.38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f140321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140322y;

    static {
        l lVar = l.f139980a;
        f140300c = lVar.a();
        f140301d = s1.h.g((float) 40.0d);
        f140302e = ShapeKeyTokens.CornerFull;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f140303f = colorSchemeKeyTokens;
        f140304g = lVar.a();
        f140306i = colorSchemeKeyTokens;
        f140308k = lVar.a();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnPrimary;
        f140309l = colorSchemeKeyTokens2;
        f140310m = lVar.b();
        f140311n = colorSchemeKeyTokens2;
        f140312o = colorSchemeKeyTokens2;
        f140313p = TypographyKeyTokens.LabelLarge;
        f140314q = lVar.a();
        f140315r = colorSchemeKeyTokens2;
        f140316s = colorSchemeKeyTokens;
        f140318u = colorSchemeKeyTokens2;
        f140319v = colorSchemeKeyTokens2;
        f140320w = colorSchemeKeyTokens2;
        f140321x = s1.h.g((float) 18.0d);
        f140322y = colorSchemeKeyTokens2;
    }

    private s() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140299b;
    }

    public final float b() {
        return f140300c;
    }

    public final float c() {
        return f140301d;
    }

    @dl.d
    public final ShapeKeyTokens d() {
        return f140302e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140303f;
    }

    public final float f() {
        return f140304g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140316s;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f140306i;
    }

    public final float i() {
        return f140308k;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140318u;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140309l;
    }

    public final float l() {
        return f140310m;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140319v;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140311n;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140320w;
    }

    public final float p() {
        return f140321x;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140312o;
    }

    @dl.d
    public final TypographyKeyTokens r() {
        return f140313p;
    }

    public final float s() {
        return f140314q;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f140322y;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140315r;
    }
}
