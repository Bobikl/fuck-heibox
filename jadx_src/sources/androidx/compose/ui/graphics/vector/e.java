package androidx.compose.ui.graphics.vector;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0000J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ6\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJ6\u0010\"\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ&\u0010#\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ&\u0010$\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ&\u0010%\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ&\u0010&\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010(\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ>\u0010/\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ>\u00100\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/vector/e;", "", "Landroidx/compose/ui/graphics/vector/f;", "node", ak.av, "", "g", "d", "", "x", "y", "l", "dx", "dy", "m", "j", "k", RXScreenCaptureService.KEY_HEIGHT, "i", "t", ak.aG, "x1", "y1", "x2", "y2", "x3", "y3", "e", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "f", "p", "q", "n", "o", "r", ak.aB, "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "b", ak.aF, "", "Ljava/util/List;", "nodes", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<f> nodes = new ArrayList();

    private final e a(f node) {
        this.nodes.add(node);
        return this;
    }

    @dl.d
    public final e b(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x10, float y10) {
        return a(new f.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x10, y10));
    }

    @dl.d
    public final e c(float a10, float b10, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
        return a(new f.RelativeArcTo(a10, b10, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
    }

    @dl.d
    public final e d() {
        return a(f.b.f14235c);
    }

    @dl.d
    public final e e(float x10, float y10, float x11, float y11, float x12, float y12) {
        return a(new f.CurveTo(x10, y10, x11, y11, x12, y12));
    }

    @dl.d
    public final e f(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        return a(new f.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
    }

    @dl.d
    public final List<f> g() {
        return this.nodes;
    }

    @dl.d
    public final e h(float x10) {
        return a(new f.HorizontalTo(x10));
    }

    @dl.d
    public final e i(float dx) {
        return a(new f.RelativeHorizontalTo(dx));
    }

    @dl.d
    public final e j(float x10, float y10) {
        return a(new f.LineTo(x10, y10));
    }

    @dl.d
    public final e k(float dx, float dy) {
        return a(new f.RelativeLineTo(dx, dy));
    }

    @dl.d
    public final e l(float x10, float y10) {
        return a(new f.MoveTo(x10, y10));
    }

    @dl.d
    public final e m(float dx, float dy) {
        return a(new f.RelativeMoveTo(dx, dy));
    }

    @dl.d
    public final e n(float x10, float y10, float x11, float y11) {
        return a(new f.QuadTo(x10, y10, x11, y11));
    }

    @dl.d
    public final e o(float dx1, float dy1, float dx2, float dy2) {
        return a(new f.RelativeQuadTo(dx1, dy1, dx2, dy2));
    }

    @dl.d
    public final e p(float x10, float y10, float x11, float y11) {
        return a(new f.ReflectiveCurveTo(x10, y10, x11, y11));
    }

    @dl.d
    public final e q(float dx1, float dy1, float dx2, float dy2) {
        return a(new f.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
    }

    @dl.d
    public final e r(float x10, float y10) {
        return a(new f.ReflectiveQuadTo(x10, y10));
    }

    @dl.d
    public final e s(float dx1, float dy1) {
        return a(new f.RelativeReflectiveQuadTo(dx1, dy1));
    }

    @dl.d
    public final e t(float y10) {
        return a(new f.VerticalTo(y10));
    }

    @dl.d
    public final e u(float dy) {
        return a(new f.RelativeVerticalTo(dy));
    }
}
