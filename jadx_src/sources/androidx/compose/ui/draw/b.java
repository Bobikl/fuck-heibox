package androidx.compose.ui.draw;

import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.x1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0014\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u0004\u0018\u00010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draw/b;", "", "", "i", "(Landroidx/compose/ui/graphics/g2;)Ljava/lang/String;", "", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/graphics/g2;)I", "other", "", "e", "(Landroidx/compose/ui/graphics/g2;Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/g2;", ak.av, "Landroidx/compose/ui/graphics/g2;", "g", "()Landroidx/compose/ui/graphics/g2;", "shape", "d", "(Landroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/graphics/g2;", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final g2 f13464c = d(x1.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final g2 f13465d = d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final g2 shape;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Blur.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/b$a;", "", "Landroidx/compose/ui/draw/b;", "Rectangle", "Landroidx/compose/ui/graphics/g2;", ak.av, "()Landroidx/compose/ui/graphics/g2;", "Unbounded", "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final g2 a() {
            return b.f13464c;
        }

        @dl.d
        public final g2 b() {
            return b.f13465d;
        }
    }

    private /* synthetic */ b(g2 g2Var) {
        this.shape = g2Var;
    }

    public static final /* synthetic */ b c(g2 g2Var) {
        return new b(g2Var);
    }

    @dl.d
    public static g2 d(@dl.e g2 g2Var) {
        return g2Var;
    }

    public static boolean e(g2 g2Var, Object obj) {
        return (obj instanceof b) && f0.g(g2Var, ((b) obj).j());
    }

    public static final boolean f(g2 g2Var, g2 g2Var2) {
        return f0.g(g2Var, g2Var2);
    }

    public static int h(g2 g2Var) {
        if (g2Var == null) {
            return 0;
        }
        return g2Var.hashCode();
    }

    public static String i(g2 g2Var) {
        return "BlurredEdgeTreatment(shape=" + g2Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.shape, obj);
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final g2 getShape() {
        return this.shape;
    }

    public int hashCode() {
        return h(this.shape);
    }

    public final /* synthetic */ g2 j() {
        return this.shape;
    }

    public String toString() {
        return i(this.shape);
    }
}
