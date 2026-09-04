package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n1;
import androidx.compose.ui.graphics.x;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b\"\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0014\u0010\u0015\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\"\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e\"\u0014\u0010\u0019\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e\"\u0014\u0010\u001b\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e\"\u0014\u0010!\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000b\"\u0014\u0010#\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000e\"\u0014\u0010%\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000e\"\u0014\u0010'\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000e\"\u0014\u0010)\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000e\"\u0014\u0010+\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000e\"\u001a\u00100\u001a\u00020,8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0012\u0010/\"\u001a\u00103\u001a\u0002018\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b\u0014\u0010/\"\u001a\u00106\u001a\u0002048\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b\u0016\u0010/\"\u001a\u0010;\u001a\u0002078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\u0018\u0010:\"\u001a\u0010>\u001a\u00020<8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b\u0010\u0010/\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/e;", "Lkotlin/b2;", "Lkotlin/t;", "block", "", "Landroidx/compose/ui/graphics/vector/f;", ak.av, "", "pathStr", "b", "Ljava/lang/String;", "DefaultGroupName", "", "F", "DefaultRotation", ak.aF, "DefaultPivotX", "d", "DefaultPivotY", "e", "DefaultScaleX", "f", "DefaultScaleY", "g", "DefaultTranslationX", RXScreenCaptureService.KEY_HEIGHT, "DefaultTranslationY", "i", "Ljava/util/List;", "()Ljava/util/List;", "EmptyPath", "j", "DefaultPathName", "k", "DefaultStrokeLineWidth", "l", "DefaultStrokeLineMiter", "m", "DefaultTrimPathStart", "n", "DefaultTrimPathEnd", "o", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/j2;", "p", "I", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/k2;", "q", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/x;", "r", "DefaultTintBlendMode", "Landroidx/compose/ui/graphics/l0;", ak.aB, "J", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/n1;", "t", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f14337a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f14338b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f14339c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f14340d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f14341e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f14342f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f14343g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f14344h = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f14346j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f14347k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f14348l = 4.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f14349m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f14350n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f14351o = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final List<f> f14345i = CollectionsKt__CollectionsKt.E();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f14352p = j2.INSTANCE.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f14353q = k2.INSTANCE.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f14354r = x.INSTANCE.z();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f14355s = l0.INSTANCE.s();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f14356t = n1.INSTANCE.b();

    @dl.d
    public static final List<f> a(@dl.d yh.l<? super e, b2> block) {
        f0.p(block, "block");
        e eVar = new e();
        block.invoke(eVar);
        return eVar.g();
    }

    @dl.d
    public static final List<f> b(@dl.e String str) {
        return str == null ? f14345i : new h().p(str).C();
    }

    public static final int c() {
        return f14356t;
    }

    public static final int d() {
        return f14352p;
    }

    public static final int e() {
        return f14353q;
    }

    public static final int f() {
        return f14354r;
    }

    public static final long g() {
        return f14355s;
    }

    @dl.d
    public static final List<f> h() {
        return f14345i;
    }
}
