package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.b2;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class u0 {

    /* JADX INFO: compiled from: Region.kt */
    public static final class a implements Iterator<Rect>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final RegionIterator f20758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Rect f20759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20760d;

        a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f20758b = regionIterator;
            Rect rect = new Rect();
            this.f20759c = rect;
            this.f20760d = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.f20760d) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f20759c);
            this.f20760d = this.f20758b.next(this.f20759c);
            return rect;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20760d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @dl.d
    public static final Region a(@dl.d Region region, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.INTERSECT);
        return region2;
    }

    @dl.d
    public static final Region b(@dl.d Region region, @dl.d Region r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean c(@dl.d Region region, @dl.d Point p10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        return region.contains(p10.x, p10.y);
    }

    public static final void d(@dl.d Region region, @dl.d yh.l<? super Rect, b2> action) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.invoke(rect);
            }
        }
    }

    @dl.d
    public static final Iterator<Rect> e(@dl.d Region region) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        return new a(region);
    }

    @dl.d
    public static final Region f(@dl.d Region region, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.DIFFERENCE);
        return region2;
    }

    @dl.d
    public static final Region g(@dl.d Region region, @dl.d Region r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.DIFFERENCE);
        return region2;
    }

    @dl.d
    public static final Region h(@dl.d Region region) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @dl.d
    public static final Region i(@dl.d Region region, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.union(r10);
        return region2;
    }

    @dl.d
    public static final Region j(@dl.d Region region, @dl.d Region r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.UNION);
        return region2;
    }

    @dl.d
    public static final Region k(@dl.d Region region, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.union(r10);
        return region2;
    }

    @dl.d
    public static final Region l(@dl.d Region region, @dl.d Region r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.UNION);
        return region2;
    }

    @dl.d
    public static final Region m(@dl.d Region region) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @dl.d
    public static final Region n(@dl.d Region region, @dl.d Rect r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.XOR);
        return region2;
    }

    @dl.d
    public static final Region o(@dl.d Region region, @dl.d Region r10) {
        kotlin.jvm.internal.f0.p(region, "<this>");
        kotlin.jvm.internal.f0.p(r10, "r");
        Region region2 = new Region(region);
        region2.op(r10, Region.Op.XOR);
        return region2;
    }
}
