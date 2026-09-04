package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OutlinedCardTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b*\u0010\u000bR \u0010+\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000bR\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lt0/k0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerSurfaceTintLayerColor", "d", "DisabledContainerElevation", "e", "DisabledOutlineColor", "f", "DraggedContainerElevation", "g", "DraggedOutlineColor", RXScreenCaptureService.KEY_HEIGHT, "FocusContainerElevation", "i", "FocusOutlineColor", "j", "HoverContainerElevation", "k", "HoverOutlineColor", "l", "IconColor", "m", "IconSize", "n", "OutlineColor", "o", "OutlineWidth", "p", "PressedContainerElevation", "q", "PressedOutlineColor", "r", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k0 f139960a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139961b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f139965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f139967h = 0.12f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f139968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f139970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f139972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f139975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f139977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f139978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139979t;

    static {
        l lVar = l.f139980a;
        f139962c = lVar.a();
        f139963d = ShapeKeyTokens.CornerMedium;
        f139964e = ColorSchemeKeyTokens.SurfaceTint;
        f139965f = lVar.a();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Outline;
        f139966g = colorSchemeKeyTokens;
        f139968i = lVar.d();
        f139969j = colorSchemeKeyTokens;
        f139970k = lVar.a();
        f139971l = ColorSchemeKeyTokens.OnSurface;
        f139972m = lVar.b();
        f139973n = colorSchemeKeyTokens;
        f139974o = ColorSchemeKeyTokens.Primary;
        f139975p = s1.h.g((float) 24.0d);
        f139976q = colorSchemeKeyTokens;
        f139977r = s1.h.g((float) 1.0d);
        f139978s = lVar.a();
        f139979t = colorSchemeKeyTokens;
    }

    private k0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139961b;
    }

    public final float b() {
        return f139962c;
    }

    @dl.d
    public final ShapeKeyTokens c() {
        return f139963d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139964e;
    }

    public final float e() {
        return f139965f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139966g;
    }

    public final float g() {
        return f139968i;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139969j;
    }

    public final float i() {
        return f139970k;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139971l;
    }

    public final float k() {
        return f139972m;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139973n;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139974o;
    }

    public final float n() {
        return f139975p;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139976q;
    }

    public final float p() {
        return f139977r;
    }

    public final float q() {
        return f139978s;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139979t;
    }
}
