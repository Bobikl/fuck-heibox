package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final float a(@dl.d PointF pointF) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@dl.d Point point) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return point.x;
    }

    public static final float c(@dl.d PointF pointF) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@dl.d Point point) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return point.y;
    }

    @dl.d
    public static final Point e(@dl.d Point point, float f10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return new Point(Math.round(point.x / f10), Math.round(point.y / f10));
    }

    @dl.d
    public static final PointF f(@dl.d PointF pointF, float f10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return new PointF(pointF.x / f10, pointF.y / f10);
    }

    @dl.d
    public static final Point g(@dl.d Point point, int i10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i11 = -i10;
        point2.offset(i11, i11);
        return point2;
    }

    @dl.d
    public static final Point h(@dl.d Point point, @dl.d Point p10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(-p10.x, -p10.y);
        return point2;
    }

    @dl.d
    public static final PointF i(@dl.d PointF pointF, float f10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f11 = -f10;
        pointF2.offset(f11, f11);
        return pointF2;
    }

    @dl.d
    public static final PointF j(@dl.d PointF pointF, @dl.d PointF p10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(-p10.x, -p10.y);
        return pointF2;
    }

    @dl.d
    public static final Point k(@dl.d Point point, int i10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i10, i10);
        return point2;
    }

    @dl.d
    public static final Point l(@dl.d Point point, @dl.d Point p10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(p10.x, p10.y);
        return point2;
    }

    @dl.d
    public static final PointF m(@dl.d PointF pointF, float f10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f10, f10);
        return pointF2;
    }

    @dl.d
    public static final PointF n(@dl.d PointF pointF, @dl.d PointF p10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(p10.x, p10.y);
        return pointF2;
    }

    @dl.d
    public static final Point o(@dl.d Point point, float f10) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return new Point(Math.round(point.x * f10), Math.round(point.y * f10));
    }

    @dl.d
    public static final PointF p(@dl.d PointF pointF, float f10) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return new PointF(pointF.x * f10, pointF.y * f10);
    }

    @dl.d
    public static final Point q(@dl.d PointF pointF) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @dl.d
    public static final PointF r(@dl.d Point point) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return new PointF(point);
    }

    @dl.d
    public static final Point s(@dl.d Point point) {
        kotlin.jvm.internal.f0.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @dl.d
    public static final PointF t(@dl.d PointF pointF) {
        kotlin.jvm.internal.f0.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
