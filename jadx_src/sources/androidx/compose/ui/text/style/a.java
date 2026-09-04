package androidx.compose.ui.text.style;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaselineShift.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/a;", "", "", "j", "(F)Ljava/lang/String;", "", "i", "(F)I", "other", "", "f", "(FLjava/lang/Object;)Z", "", ak.av, "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "multiplier", "e", "(F)F", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f16885c = e(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f16886d = e(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f16887e = e(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: BaselineShift.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/a$a;", "", "Landroidx/compose/ui/text/style/a;", "Superscript", "F", "e", "()F", "getSuperscript-y9eOQZs$annotations", "()V", "Subscript", ak.aF, "getSubscript-y9eOQZs$annotations", d4.d.f108133a, ak.av, "getNone-y9eOQZs$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
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

        public final float a() {
            return a.f16887e;
        }

        public final float c() {
            return a.f16886d;
        }

        public final float e() {
            return a.f16885c;
        }
    }

    private /* synthetic */ a(float f10) {
        this.multiplier = f10;
    }

    public static final /* synthetic */ a d(float f10) {
        return new a(f10);
    }

    public static float e(float f10) {
        return f10;
    }

    public static boolean f(float f10, Object obj) {
        if (obj instanceof a) {
            return f0.g(Float.valueOf(f10), Float.valueOf(((a) obj).k()));
        }
        return false;
    }

    public static final boolean g(float f10, float f11) {
        return f0.g(Float.valueOf(f10), Float.valueOf(f11));
    }

    public static int i(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static String j(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.multiplier, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return i(this.multiplier);
    }

    public final /* synthetic */ float k() {
        return this.multiplier;
    }

    public String toString() {
        return j(this.multiplier);
    }
}
