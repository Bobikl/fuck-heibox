package b1;

import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.j2;
import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: b1.d, reason: from toString */
/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0012\u0010\u001d\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0012\u0010\u001f\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010#\u001a\u00020 8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"Lb1/d;", "", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", "i", "Lb1/f;", w.c.R, "", ak.av, "(J)Z", "k", "", "toString", "F", "d", "()F", "m", "(F)V", "g", "o", "e", "n", "b", "l", RXScreenCaptureService.KEY_HEIGHT, "width", ak.aF, "height", "Lb1/m;", "f", "()J", UiKitSpanObj.TYPE_SIZE, "j", "()Z", "isEmpty", "<init>", "(FFFF)V", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
public final class MutableRect {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30359e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f30360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f30361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f30362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f30363d;

    public MutableRect(float f10, float f11, float f12, float f13) {
        this.f30360a = f10;
        this.f30361b = f11;
        this.f30362c = f12;
        this.f30363d = f13;
    }

    public final boolean a(long offset) {
        return f.p(offset) >= this.f30360a && f.p(offset) < this.f30362c && f.r(offset) >= this.f30361b && f.r(offset) < this.f30363d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF30363d() {
        return this.f30363d;
    }

    public final float c() {
        return getF30363d() - getF30361b();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF30360a() {
        return this.f30360a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getF30362c() {
        return this.f30362c;
    }

    public final long f() {
        return n.a(getF30362c() - getF30360a(), getF30363d() - getF30361b());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getF30361b() {
        return this.f30361b;
    }

    public final float h() {
        return getF30362c() - getF30360a();
    }

    @j2
    public final void i(float f10, float f11, float f12, float f13) {
        this.f30360a = Math.max(f10, this.f30360a);
        this.f30361b = Math.max(f11, this.f30361b);
        this.f30362c = Math.min(f12, this.f30362c);
        this.f30363d = Math.min(f13, this.f30363d);
    }

    public final boolean j() {
        return this.f30360a >= this.f30362c || this.f30361b >= this.f30363d;
    }

    public final void k(float f10, float f11, float f12, float f13) {
        this.f30360a = f10;
        this.f30361b = f11;
        this.f30362c = f12;
        this.f30363d = f13;
    }

    public final void l(float f10) {
        this.f30363d = f10;
    }

    public final void m(float f10) {
        this.f30360a = f10;
    }

    public final void n(float f10) {
        this.f30362c = f10;
    }

    public final void o(float f10) {
        this.f30361b = f10;
    }

    @dl.d
    public String toString() {
        return "MutableRect(" + c.a(this.f30360a, 1) + ", " + c.a(this.f30361b, 1) + ", " + c.a(this.f30362c, 1) + ", " + c.a(this.f30363d, 1) + ')';
    }
}
