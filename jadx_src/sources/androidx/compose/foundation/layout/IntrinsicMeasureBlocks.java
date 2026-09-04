package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR5\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR5\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR5\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR5\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR5\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR5\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/m;", "", "HorizontalMinWidth", "Lyh/q;", "d", "()Lyh/q;", "VerticalMinWidth", RXScreenCaptureService.KEY_HEIGHT, "HorizontalMinHeight", ak.aF, "VerticalMinHeight", "g", "HorizontalMaxWidth", "b", "VerticalMaxWidth", "f", "HorizontalMaxHeight", ak.av, "VerticalMaxHeight", "e", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class IntrinsicMeasureBlocks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final IntrinsicMeasureBlocks f5997a = new IntrinsicMeasureBlocks();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f5998b = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            AnonymousClass1 anonymousClass1 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.l1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.w(measurables, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f5999c = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.w(measurables, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.l1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6000d = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.w(measurables, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.L0(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6001e = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            AnonymousClass1 anonymousClass1 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.L0(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.w(measurables, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6002f = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            AnonymousClass1 anonymousClass1 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.w(measurables, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6003g = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.w(measurables, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6004h = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.w(measurables, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f6005i = new yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @dl.d
        public final Integer a(@dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10, int i11) {
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            AnonymousClass1 anonymousClass1 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.V(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new yh.p<androidx.compose.ui.layout.m, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @dl.d
                public final Integer a(@dl.d androidx.compose.ui.layout.m intrinsicSize, int i12) {
                    kotlin.jvm.internal.f0.p(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.w1(i12));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.m mVar, Integer num) {
                    return a(mVar, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.w(measurables, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends androidx.compose.ui.layout.m> list, Integer num, Integer num2) {
            return a(list, num.intValue(), num2.intValue());
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> a() {
        return f6004h;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> b() {
        return f6002f;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> c() {
        return f6000d;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> d() {
        return f5998b;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> e() {
        return f6005i;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> f() {
        return f6003g;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> g() {
        return f6001e;
    }

    @dl.d
    public final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> h() {
        return f5999c;
    }
}
