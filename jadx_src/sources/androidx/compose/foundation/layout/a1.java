package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(30)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bc\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H&J\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/a1;", "", "Landroid/graphics/Insets;", "insets", "", "f", "", "x", "y", "d", ak.av, "b", "oldInsets", "newValue", "e", "Lb1/f;", "available", ak.aF, "(J)J", "Ls1/x;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public interface a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f6292a;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0007*\u0004\t\r\u0011\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/a1$a;", "", "Landroidx/compose/foundation/layout/k1;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/a1;", ak.av, "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/a1;", "androidx/compose/foundation/layout/a1$a$b", "b", "Landroidx/compose/foundation/layout/a1$a$b;", "LeftSideCalculator", "androidx/compose/foundation/layout/a1$a$d", ak.aF, "Landroidx/compose/foundation/layout/a1$a$d;", "TopSideCalculator", "androidx/compose/foundation/layout/a1$a$c", "d", "Landroidx/compose/foundation/layout/a1$a$c;", "RightSideCalculator", "androidx/compose/foundation/layout/a1$a$a", "e", "Landroidx/compose/foundation/layout/a1$a$a;", "BottomSideCalculator", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f6292a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final b LeftSideCalculator = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d TopSideCalculator = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c RightSideCalculator = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final C0050a BottomSideCalculator = new C0050a();

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.a1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/layout/a1$a$a", "Landroidx/compose/foundation/layout/a1;", "Landroid/graphics/Insets;", "insets", "", "f", "", "x", "y", "d", "oldInsets", "newValue", "e", "Lb1/f;", "available", ak.aF, "(J)J", "Ls1/x;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0050a implements a1 {
            C0050a() {
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float a(float f10, float f11) {
                return z0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float b(float f10, float f11) {
                return z0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public long c(long available) {
                return b1.g.a(0.0f, b1.f.r(available));
            }

            @Override // androidx.compose.foundation.layout.a1
            public float d(float x10, float y10) {
                return -y10;
            }

            @Override // androidx.compose.foundation.layout.a1
            @dl.d
            public Insets e(@dl.d Insets oldInsets, int newValue) {
                kotlin.jvm.internal.f0.p(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
                kotlin.jvm.internal.f0.o(insetsOf, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.a1
            public int f(@dl.d Insets insets) {
                kotlin.jvm.internal.f0.p(insets, "insets");
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.a1
            public long g(long available, float remaining) {
                return s1.y.a(0.0f, s1.x.n(available) + remaining);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.a1$a$b */
        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/layout/a1$a$b", "Landroidx/compose/foundation/layout/a1;", "Landroid/graphics/Insets;", "insets", "", "f", "", "x", "y", "d", "oldInsets", "newValue", "e", "Lb1/f;", "available", ak.aF, "(J)J", "Ls1/x;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class b implements a1 {
            b() {
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float a(float f10, float f11) {
                return z0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float b(float f10, float f11) {
                return z0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public long c(long available) {
                return b1.g.a(b1.f.p(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.a1
            public float d(float x10, float y10) {
                return x10;
            }

            @Override // androidx.compose.foundation.layout.a1
            @dl.d
            public Insets e(@dl.d Insets oldInsets, int newValue) {
                kotlin.jvm.internal.f0.p(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
                kotlin.jvm.internal.f0.o(insetsOf, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.a1
            public int f(@dl.d Insets insets) {
                kotlin.jvm.internal.f0.p(insets, "insets");
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.a1
            public long g(long available, float remaining) {
                return s1.y.a(s1.x.l(available) - remaining, 0.0f);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.a1$a$c */
        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/layout/a1$a$c", "Landroidx/compose/foundation/layout/a1;", "Landroid/graphics/Insets;", "insets", "", "f", "", "x", "y", "d", "oldInsets", "newValue", "e", "Lb1/f;", "available", ak.aF, "(J)J", "Ls1/x;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class c implements a1 {
            c() {
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float a(float f10, float f11) {
                return z0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float b(float f10, float f11) {
                return z0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public long c(long available) {
                return b1.g.a(b1.f.p(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.a1
            public float d(float x10, float y10) {
                return -x10;
            }

            @Override // androidx.compose.foundation.layout.a1
            @dl.d
            public Insets e(@dl.d Insets oldInsets, int newValue) {
                kotlin.jvm.internal.f0.p(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
                kotlin.jvm.internal.f0.o(insetsOf, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.a1
            public int f(@dl.d Insets insets) {
                kotlin.jvm.internal.f0.p(insets, "insets");
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.a1
            public long g(long available, float remaining) {
                return s1.y.a(s1.x.l(available) + remaining, 0.0f);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.a1$a$d */
        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/layout/a1$a$d", "Landroidx/compose/foundation/layout/a1;", "Landroid/graphics/Insets;", "insets", "", "f", "", "x", "y", "d", "oldInsets", "newValue", "e", "Lb1/f;", "available", ak.aF, "(J)J", "Ls1/x;", "remaining", "g", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class d implements a1 {
            d() {
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float a(float f10, float f11) {
                return z0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public /* synthetic */ float b(float f10, float f11) {
                return z0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.a1
            public long c(long available) {
                return b1.g.a(0.0f, b1.f.r(available));
            }

            @Override // androidx.compose.foundation.layout.a1
            public float d(float x10, float y10) {
                return y10;
            }

            @Override // androidx.compose.foundation.layout.a1
            @dl.d
            public Insets e(@dl.d Insets oldInsets, int newValue) {
                kotlin.jvm.internal.f0.p(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
                kotlin.jvm.internal.f0.o(insetsOf, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.a1
            public int f(@dl.d Insets insets) {
                kotlin.jvm.internal.f0.p(insets, "insets");
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.a1
            public long g(long available, float remaining) {
                return s1.y.a(0.0f, s1.x.n(available) - remaining);
            }
        }

        private Companion() {
        }

        @dl.d
        public final a1 a(int side, @dl.d LayoutDirection layoutDirection) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            k1.Companion companion = k1.INSTANCE;
            if (k1.p(side, companion.h())) {
                return LeftSideCalculator;
            }
            if (k1.p(side, companion.k())) {
                return TopSideCalculator;
            }
            if (k1.p(side, companion.i())) {
                return RightSideCalculator;
            }
            if (k1.p(side, companion.e())) {
                return BottomSideCalculator;
            }
            if (k1.p(side, companion.j())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (k1.p(side, companion.f())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
        }
    }

    float a(float x10, float y10);

    float b(float x10, float y10);

    long c(long available);

    float d(float x10, float y10);

    @dl.d
    Insets e(@dl.d Insets oldInsets, int newValue);

    int f(@dl.d Insets insets);

    long g(long available, float remaining);
}
