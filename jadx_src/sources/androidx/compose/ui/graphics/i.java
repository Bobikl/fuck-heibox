package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0000\u001a%\u0010\b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\r*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\rH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u0010*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\u0010H\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u0013*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0019\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\t\u001a\u001a\u0010\u001a\u001a\u00020\u0018*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\r*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u001d\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\rH\u0000\u001a\u001a\u0010\u001f\u001a\u00020\u001e*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001b\u001a%\u0010 \u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\t\u001a\u001a\u0010\"\u001a\u00020!*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001b\u001a%\u0010#\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\t\u001a\u0010\u0010$\u001a\u00020\r*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010%\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\rH\u0000\u001a\u001a\u0010'\u001a\u00020&*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001b\u001a%\u0010(\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020&H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\t\u001a \u0010+\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u000e\u0010\u000b\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*H\u0000\u001a\u001a\u0010-\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010,H\u0000*\n\u0010.\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/h1;", ak.av, "Landroid/graphics/Paint;", "k", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/x;", "mode", "Lkotlin/b2;", "n", "(Landroid/graphics/Paint;I)V", "Landroidx/compose/ui/graphics/m0;", "value", "p", "", "b", "l", "", ak.aF, "m", "Landroidx/compose/ui/graphics/l0;", "d", "(Landroid/graphics/Paint;)J", "o", "(Landroid/graphics/Paint;J)V", "Landroidx/compose/ui/graphics/j1;", "x", "j", "(Landroid/graphics/Paint;)I", "i", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/ui/graphics/j2;", "f", "t", "Landroidx/compose/ui/graphics/k2;", "g", ak.aG, RXScreenCaptureService.KEY_HEIGHT, "v", "Landroidx/compose/ui/graphics/r0;", "e", "q", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aB, "Landroidx/compose/ui/graphics/m1;", "r", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13862c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            f13860a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            f13861b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            f13862c = iArr3;
        }
    }

    @dl.d
    public static final h1 a() {
        return new h();
    }

    public static final float b(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean c(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long d(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return n0.b(paint.getColor());
    }

    public static final int e(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return !paint.isFilterBitmap() ? r0.INSTANCE.d() : r0.INSTANCE.b();
    }

    public static final int f(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f13861b[strokeCap.ordinal()];
        if (i10 == 1) {
            return j2.INSTANCE.a();
        }
        if (i10 != 2) {
            return i10 != 3 ? j2.INSTANCE.a() : j2.INSTANCE.c();
        }
        return j2.INSTANCE.b();
    }

    public static final int g(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f13862c[strokeJoin.ordinal()];
        if (i10 == 1) {
            return k2.INSTANCE.b();
        }
        if (i10 != 2) {
            return i10 != 3 ? k2.INSTANCE.b() : k2.INSTANCE.c();
        }
        return k2.INSTANCE.a();
    }

    public static final float h(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float i(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int j(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : a.f13860a[style.ordinal()]) == 1 ? j1.INSTANCE.b() : j1.INSTANCE.a();
    }

    @dl.d
    public static final Paint k() {
        return new Paint(7);
    }

    public static final void l(@dl.d Paint paint, float f10) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void m(@dl.d Paint paint, boolean z10) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setAntiAlias(z10);
    }

    public static final void n(@dl.d Paint setNativeBlendMode, int i10) {
        kotlin.jvm.internal.f0.p(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            s2.f14005a.a(setNativeBlendMode, i10);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.c(i10)));
        }
    }

    public static final void o(@dl.d Paint setNativeColor, long j10) {
        kotlin.jvm.internal.f0.p(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(n0.s(j10));
    }

    public static final void p(@dl.d Paint paint, @dl.e m0 m0Var) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setColorFilter(m0Var != null ? d.d(m0Var) : null);
    }

    public static final void q(@dl.d Paint setNativeFilterQuality, int i10) {
        kotlin.jvm.internal.f0.p(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!r0.h(i10, r0.INSTANCE.d()));
    }

    public static final void r(@dl.d Paint paint, @dl.e m1 m1Var) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        k kVar = (k) m1Var;
        paint.setPathEffect(kVar != null ? kVar.getNativePathEffect() : null);
    }

    public static final void s(@dl.d Paint paint, @dl.e Shader shader) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void t(@dl.d Paint setNativeStrokeCap, int i10) {
        Paint.Cap cap;
        kotlin.jvm.internal.f0.p(setNativeStrokeCap, "$this$setNativeStrokeCap");
        j2.Companion companion = j2.INSTANCE;
        if (j2.g(i10, companion.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (j2.g(i10, companion.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = j2.g(i10, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public static final void u(@dl.d Paint setNativeStrokeJoin, int i10) {
        Paint.Join join;
        kotlin.jvm.internal.f0.p(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        k2.Companion companion = k2.INSTANCE;
        if (k2.g(i10, companion.b())) {
            join = Paint.Join.MITER;
        } else if (k2.g(i10, companion.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = k2.g(i10, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public static final void v(@dl.d Paint paint, float f10) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void w(@dl.d Paint paint, float f10) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    public static final void x(@dl.d Paint setNativeStyle, int i10) {
        kotlin.jvm.internal.f0.p(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(j1.f(i10, j1.INSTANCE.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
