package androidx.compose.ui;

import androidx.compose.runtime.m0;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import s1.r;

/* JADX INFO: renamed from: androidx.compose.ui.e, reason: from toString */
/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\b\u000bB\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/ui/c;", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/n;", ak.av, "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "", "b", ak.aF, "horizontalBias", "verticalBias", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "f", "()F", "g", "<init>", "(FF)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BiasAlignment implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float horizontalBias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float verticalBias;

    /* JADX INFO: renamed from: androidx.compose.ui.e$a, reason: from toString */
    /* JADX INFO: compiled from: Alignment.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/e$a;", "Landroidx/compose/ui/c$b;", "", "b", "", UiKitSpanObj.TYPE_SIZE, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", ak.av, "bias", ak.aF, "", "toString", "hashCode", "", "other", "", "equals", "F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Horizontal implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float bias;

        public Horizontal(float f10) {
            this.bias = f10;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        private final float getBias() {
            return this.bias;
        }

        public static /* synthetic */ Horizontal d(Horizontal horizontal, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontal.bias;
            }
            return horizontal.c(f10);
        }

        @Override // androidx.compose.ui.c.b
        public int a(int size, int space, @dl.d LayoutDirection layoutDirection) {
            f0.p(layoutDirection, "layoutDirection");
            return di.d.L0(((space - size) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
        }

        @dl.d
        public final Horizontal c(float bias) {
            return new Horizontal(bias);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Horizontal) && f0.g(Float.valueOf(this.bias), Float.valueOf(((Horizontal) other).bias));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        @dl.d
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.e$b, reason: from toString */
    /* JADX INFO: compiled from: Alignment.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/e$b;", "Landroidx/compose/ui/c$c;", "", "b", "", UiKitSpanObj.TYPE_SIZE, "space", ak.av, "bias", ak.aF, "", "toString", "hashCode", "", "other", "", "equals", "F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Vertical implements c.InterfaceC0079c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float bias;

        public Vertical(float f10) {
            this.bias = f10;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        private final float getBias() {
            return this.bias;
        }

        public static /* synthetic */ Vertical d(Vertical vertical, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = vertical.bias;
            }
            return vertical.c(f10);
        }

        @Override // androidx.compose.ui.c.InterfaceC0079c
        public int a(int size, int space) {
            return di.d.L0(((space - size) / 2.0f) * (1 + this.bias));
        }

        @dl.d
        public final Vertical c(float bias) {
            return new Vertical(bias);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Vertical) && f0.g(Float.valueOf(this.bias), Float.valueOf(((Vertical) other).bias));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        @dl.d
        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f10, float f11) {
        this.horizontalBias = f10;
        this.verticalBias = f11;
    }

    public static /* synthetic */ BiasAlignment e(BiasAlignment biasAlignment, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = biasAlignment.horizontalBias;
        }
        if ((i10 & 2) != 0) {
            f11 = biasAlignment.verticalBias;
        }
        return biasAlignment.d(f10, f11);
    }

    @Override // androidx.compose.ui.c
    public long a(long size, long space, @dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "layoutDirection");
        float fM = (r.m(space) - r.m(size)) / 2.0f;
        float fJ = (r.j(space) - r.j(size)) / 2.0f;
        float f10 = 1;
        return s1.o.a(di.d.L0(fM * ((layoutDirection == LayoutDirection.Ltr ? this.horizontalBias : (-1) * this.horizontalBias) + f10)), di.d.L0(fJ * (f10 + this.verticalBias)));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @dl.d
    public final BiasAlignment d(float horizontalBias, float verticalBias) {
        return new BiasAlignment(horizontalBias, verticalBias);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) other;
        return f0.g(Float.valueOf(this.horizontalBias), Float.valueOf(biasAlignment.horizontalBias)) && f0.g(Float.valueOf(this.verticalBias), Float.valueOf(biasAlignment.verticalBias));
    }

    public final float f() {
        return this.horizontalBias;
    }

    public final float g() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.horizontalBias) * 31) + Float.floatToIntBits(this.verticalBias);
    }

    @dl.d
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
