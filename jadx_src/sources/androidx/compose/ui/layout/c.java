package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/c;", "", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f14993a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ContentScale.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/c$a;", "", "Landroidx/compose/ui/layout/c;", "b", "Landroidx/compose/ui/layout/c;", ak.av, "()Landroidx/compose/ui/layout/c;", "getCrop$annotations", "()V", "Crop", ak.aF, "i", "getFit$annotations", "Fit", "d", "e", "getFillHeight$annotations", "FillHeight", "g", "getFillWidth$annotations", "FillWidth", "f", "k", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/layout/g;", "m", "()Landroidx/compose/ui/layout/g;", "getNone$annotations", d4.d.f108133a, RXScreenCaptureService.KEY_HEIGHT, "getFillBounds$annotations", "FillBounds", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f14993a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c Crop = new C0090a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c Fit = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c FillHeight = new C0091c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c FillWidth = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c Inside = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c FillBounds = new b();

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$a", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0090a implements c {
            C0090a() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                float f10 = androidx.compose.ui.layout.d.f(srcSize, dstSize);
                return o1.a(f10, f10);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$b */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$b", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class b implements c {
            b() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                return o1.a(androidx.compose.ui.layout.d.h(srcSize, dstSize), androidx.compose.ui.layout.d.e(srcSize, dstSize));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$c", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0091c implements c {
            C0091c() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                float fE = androidx.compose.ui.layout.d.e(srcSize, dstSize);
                return o1.a(fE, fE);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$d */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$d", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class d implements c {
            d() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                float fH = androidx.compose.ui.layout.d.h(srcSize, dstSize);
                return o1.a(fH, fH);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$e */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$e", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class e implements c {
            e() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                float fG = androidx.compose.ui.layout.d.g(srcSize, dstSize);
                return o1.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a$f */
        /* JADX INFO: compiled from: ContentScale.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/c$a$f", "Landroidx/compose/ui/layout/c;", "Lb1/m;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", ak.av, "(JJ)J", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class f implements c {
            f() {
            }

            @Override // androidx.compose.ui.layout.c
            public long a(long srcSize, long dstSize) {
                if (b1.m.t(srcSize) <= b1.m.t(dstSize) && b1.m.m(srcSize) <= b1.m.m(dstSize)) {
                    return o1.a(1.0f, 1.0f);
                }
                float fG = androidx.compose.ui.layout.d.g(srcSize, dstSize);
                return o1.a(fG, fG);
            }
        }

        private Companion() {
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

        @j2
        public static /* synthetic */ void h() {
        }

        @j2
        public static /* synthetic */ void j() {
        }

        @j2
        public static /* synthetic */ void l() {
        }

        @j2
        public static /* synthetic */ void n() {
        }

        @dl.d
        public final c a() {
            return Crop;
        }

        @dl.d
        public final c c() {
            return FillBounds;
        }

        @dl.d
        public final c e() {
            return FillHeight;
        }

        @dl.d
        public final c g() {
            return FillWidth;
        }

        @dl.d
        public final c i() {
            return Fit;
        }

        @dl.d
        public final c k() {
            return Inside;
        }

        @dl.d
        public final FixedScale m() {
            return None;
        }
    }

    long a(long srcSize, long dstSize);
}
