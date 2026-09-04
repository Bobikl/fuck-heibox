package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class t0 {
    @dl.d
    public static final Rect A(@dl.d Rect rect, int i10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i10;
        rect2.left *= i10;
        rect2.right *= i10;
        rect2.bottom *= i10;
        return rect2;
    }

    @dl.d
    public static final RectF B(@dl.d RectF rectF, float f10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @dl.d
    public static final RectF C(@dl.d RectF rectF, int i10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        float f10 = i10;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @dl.d
    public static final Rect D(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @dl.d
    public static final RectF E(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return new RectF(rect);
    }

    @dl.d
    public static final Region F(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return new Region(rect);
    }

    @dl.d
    public static final Region G(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @dl.d
    public static final RectF H(@dl.d RectF rectF, @dl.d Matrix m10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(m10, "m");
        m10.mapRect(rectF);
        return rectF;
    }

    @dl.d
    public static final Region I(@dl.d Rect rect, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region = new Region(rect);
        region.op(r10, Region.Op.XOR);
        return region;
    }

    @dl.d
    public static final Region J(@dl.d RectF rectF, @dl.d RectF r10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r10.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @dl.d
    @SuppressLint({"CheckResult"})
    public static final Rect a(@dl.d Rect rect, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Rect rect2 = new Rect(rect);
        rect2.intersect(r10);
        return rect2;
    }

    @dl.d
    @SuppressLint({"CheckResult"})
    public static final RectF b(@dl.d RectF rectF, @dl.d RectF r10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.intersect(r10);
        return rectF2;
    }

    public static final float c(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@dl.d RectF rectF) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@dl.d Rect rect, @dl.d Point p10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        return rect.contains(p10.x, p10.y);
    }

    public static final boolean l(@dl.d RectF rectF, @dl.d PointF p10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        return rectF.contains(p10.x, p10.y);
    }

    @dl.d
    public static final Rect m(@dl.d Rect rect, int i10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i11 = -i10;
        rect2.offset(i11, i11);
        return rect2;
    }

    @dl.d
    public static final Rect n(@dl.d Rect rect, @dl.d Point xy) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    @dl.d
    public static final RectF o(@dl.d RectF rectF, float f10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f11 = -f10;
        rectF2.offset(f11, f11);
        return rectF2;
    }

    @dl.d
    public static final RectF p(@dl.d RectF rectF, @dl.d PointF xy) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }

    @dl.d
    public static final Region q(@dl.d Rect rect, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region = new Region(rect);
        region.op(r10, Region.Op.DIFFERENCE);
        return region;
    }

    @dl.d
    public static final Region r(@dl.d RectF rectF, @dl.d RectF r10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r10.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @dl.d
    public static final Rect s(@dl.d Rect rect, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r10);
        return rect2;
    }

    @dl.d
    public static final RectF t(@dl.d RectF rectF, @dl.d RectF r10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r10);
        return rectF2;
    }

    @dl.d
    public static final Rect u(@dl.d Rect rect, int i10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i10, i10);
        return rect2;
    }

    @dl.d
    public static final Rect v(@dl.d Rect rect, @dl.d Point xy) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    @dl.d
    public static final Rect w(@dl.d Rect rect, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r10);
        return rect2;
    }

    @dl.d
    public static final RectF x(@dl.d RectF rectF, float f10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f10, f10);
        return rectF2;
    }

    @dl.d
    public static final RectF y(@dl.d RectF rectF, @dl.d PointF xy) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    @dl.d
    public static final RectF z(@dl.d RectF rectF, @dl.d RectF r10) {
        kotlin.jvm.internal.f0.p(rectF, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r10);
        return rectF2;
    }
}
