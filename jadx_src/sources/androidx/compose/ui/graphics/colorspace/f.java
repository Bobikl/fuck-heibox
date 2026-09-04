package androidx.compose.ui.graphics.colorspace;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Illuminant.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\f\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f;", "", "Landroidx/compose/ui/graphics/colorspace/k;", "b", "Landroidx/compose/ui/graphics/colorspace/k;", ak.av, "()Landroidx/compose/ui/graphics/colorspace/k;", androidx.exifinterface.media.a.W4, ak.aF, "B", "d", "C", "e", "D50", "f", "D55", "g", "D60", RXScreenCaptureService.KEY_HEIGHT, "D65", "i", "D75", "j", androidx.exifinterface.media.a.S4, "", "k", "[F", "()[F", "D50Xyz", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f13774a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private f() {
    }

    @dl.d
    public final WhitePoint a() {
        return A;
    }

    @dl.d
    public final WhitePoint b() {
        return B;
    }

    @dl.d
    public final WhitePoint c() {
        return C;
    }

    @dl.d
    public final WhitePoint d() {
        return D50;
    }

    @dl.d
    public final float[] e() {
        return D50Xyz;
    }

    @dl.d
    public final WhitePoint f() {
        return D55;
    }

    @dl.d
    public final WhitePoint g() {
        return D60;
    }

    @dl.d
    public final WhitePoint h() {
        return D65;
    }

    @dl.d
    public final WhitePoint i() {
        return D75;
    }

    @dl.d
    public final WhitePoint j() {
        return E;
    }
}
