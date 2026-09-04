package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CircularProgressIndicatorTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lt0/e;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Ls1/h;", "ActiveIndicatorWidth", "F", "b", "()F", "FourColorActiveIndicatorFourColor", "d", "FourColorActiveIndicatorOneColor", "e", "FourColorActiveIndicatorThreeColor", "f", "FourColorActiveIndicatorTwoColor", "g", "Size", RXScreenCaptureService.KEY_HEIGHT, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f139649a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f139652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f139657i;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f139650b = colorSchemeKeyTokens;
        f139651c = ShapeKeyTokens.CornerNone;
        f139652d = s1.h.g((float) 4.0d);
        f139653e = ColorSchemeKeyTokens.TertiaryContainer;
        f139654f = colorSchemeKeyTokens;
        f139655g = ColorSchemeKeyTokens.Tertiary;
        f139656h = ColorSchemeKeyTokens.PrimaryContainer;
        f139657i = s1.h.g((float) 48.0d);
    }

    private e() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139650b;
    }

    public final float b() {
        return f139652d;
    }

    @dl.d
    public final ShapeKeyTokens c() {
        return f139651c;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139653e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139654f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139655g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f139656h;
    }

    public final float h() {
        return f139657i;
    }
}
