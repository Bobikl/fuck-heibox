package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ElevatedButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006R \u00106\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000bR\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Lt0/j;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "ContainerHeight", ak.aF, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerSurfaceTintLayerColor", "e", "DisabledContainerColor", "f", "DisabledContainerElevation", "g", "DisabledLabelTextColor", "i", "FocusContainerElevation", "j", "FocusLabelTextColor", "l", "HoverContainerElevation", "m", "HoverLabelTextColor", "o", "LabelTextColor", "r", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ak.aB, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedContainerElevation", "t", "PressedLabelTextColor", "v", "DisabledIconColor", RXScreenCaptureService.KEY_HEIGHT, "FocusIconColor", "k", "HoverIconColor", "n", "IconColor", "p", "IconSize", "q", "PressedIconColor", ak.aG, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j f139896a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139897b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f139899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f139903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f139904i = 0.12f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f139906k = 0.38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f139907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f139909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f139913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139915t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f139916u = 0.38f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139919x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f139920y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139921z;

    static {
        l lVar = l.f139980a;
        f139898c = lVar.b();
        f139899d = s1.h.g((float) 40.0d);
        f139900e = ShapeKeyTokens.CornerFull;
        f139901f = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139902g = colorSchemeKeyTokens;
        f139903h = lVar.a();
        f139905j = colorSchemeKeyTokens;
        f139907l = lVar.b();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        f139908m = colorSchemeKeyTokens2;
        f139909n = lVar.c();
        f139910o = colorSchemeKeyTokens2;
        f139911p = colorSchemeKeyTokens2;
        f139912q = TypographyKeyTokens.LabelLarge;
        f139913r = lVar.b();
        f139914s = colorSchemeKeyTokens2;
        f139915t = colorSchemeKeyTokens;
        f139917v = colorSchemeKeyTokens2;
        f139918w = colorSchemeKeyTokens2;
        f139919x = colorSchemeKeyTokens2;
        f139920y = s1.h.g((float) 18.0d);
        f139921z = colorSchemeKeyTokens2;
    }

    private j() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139897b;
    }

    public final float b() {
        return f139898c;
    }

    public final float c() {
        return f139899d;
    }

    @dl.d
    public final ShapeKeyTokens d() {
        return f139900e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139901f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139902g;
    }

    public final float g() {
        return f139903h;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139915t;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139905j;
    }

    public final float j() {
        return f139907l;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139917v;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139908m;
    }

    public final float m() {
        return f139909n;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139918w;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139910o;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139919x;
    }

    public final float q() {
        return f139920y;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139911p;
    }

    @dl.d
    public final TypographyKeyTokens s() {
        return f139912q;
    }

    public final float t() {
        return f139913r;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139921z;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139914s;
    }
}
