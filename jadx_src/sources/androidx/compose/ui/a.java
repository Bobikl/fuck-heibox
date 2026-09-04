package androidx.compose.ui;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010!\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u001f¨\u0006&"}, d2 = {"Landroidx/compose/ui/a;", "", "Landroidx/compose/ui/c;", "b", "Landroidx/compose/ui/c;", "m", "()Landroidx/compose/ui/c;", "getTopLeft$annotations", "()V", "TopLeft", ak.aF, "o", "getTopRight$annotations", "TopRight", "d", "e", "getCenterLeft$annotations", "CenterLeft", "g", "getCenterRight$annotations", "CenterRight", "f", ak.av, "getBottomLeft$annotations", "BottomLeft", "getBottomRight$annotations", "BottomRight", "Landroidx/compose/ui/c$b;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/c$b;", "i", "()Landroidx/compose/ui/c$b;", "getLeft$annotations", "Left", "k", "getRight$annotations", "Right", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f13397a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c.b Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c.b Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13406j = 0;

    private a() {
    }

    @j2
    public static /* synthetic */ void b() {
    }

    @j2
    public static /* synthetic */ void d() {
    }

    @j2
    public static /* synthetic */ void f() {
    }

    @j2
    public static /* synthetic */ void h() {
    }

    @j2
    public static /* synthetic */ void j() {
    }

    @j2
    public static /* synthetic */ void l() {
    }

    @j2
    public static /* synthetic */ void n() {
    }

    @j2
    public static /* synthetic */ void p() {
    }

    @dl.d
    public final c a() {
        return BottomLeft;
    }

    @dl.d
    public final c c() {
        return BottomRight;
    }

    @dl.d
    public final c e() {
        return CenterLeft;
    }

    @dl.d
    public final c g() {
        return CenterRight;
    }

    @dl.d
    public final c.b i() {
        return Left;
    }

    @dl.d
    public final c.b k() {
        return Right;
    }

    @dl.d
    public final c m() {
        return TopLeft;
    }

    @dl.d
    public final c o() {
        return TopRight;
    }
}
