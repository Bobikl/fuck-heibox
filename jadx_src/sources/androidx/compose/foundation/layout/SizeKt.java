package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a)\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a-\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\n\u001aA\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0004\u001a!\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0004\u001a!\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0004\u001a)\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\n\u001a!\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\r\u001a-\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\n\u001a-\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\n\u001aA\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u0016\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 H\u0007\u001a\u0016\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 H\u0007\u001a\u0016\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 H\u0007\u001a \u0010)\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0007\u001a \u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020*2\b\b\u0002\u0010(\u001a\u00020'H\u0007\u001a \u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020,2\b\b\u0002\u0010(\u001a\u00020'H\u0007\u001a-\u0010.\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\n\u001a\u0010\u00100\u001a\u00020/2\u0006\u0010!\u001a\u00020 H\u0002\u001a\u0010\u00101\u001a\u00020/2\u0006\u0010!\u001a\u00020 H\u0002\u001a\u0010\u00102\u001a\u00020/2\u0006\u0010!\u001a\u00020 H\u0002\u001a\u0018\u00104\u001a\u0002032\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002\u001a\u0018\u00105\u001a\u0002032\u0006\u0010&\u001a\u00020*2\u0006\u0010(\u001a\u00020'H\u0002\u001a\u0018\u00106\u001a\u0002032\u0006\u0010&\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0002\"\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107\"\u0014\u00109\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00107\"\u0014\u0010:\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00107\"\u0014\u0010<\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010;\"\u0014\u0010=\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010;\"\u0014\u0010>\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;\"\u0014\u0010?\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010;\"\u0014\u0010A\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010;\"\u0014\u0010B\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"Landroidx/compose/ui/n;", "Ls1/h;", "width", "H", "(Landroidx/compose/ui/n;F)Landroidx/compose/ui/n;", "height", "o", UiKitSpanObj.TYPE_SIZE, "C", androidx.exifinterface.media.a.S4, "(Landroidx/compose/ui/n;FF)Landroidx/compose/ui/n;", "Ls1/l;", "D", "(Landroidx/compose/ui/n;J)Landroidx/compose/ui/n;", org.apache.tools.ant.types.selectors.o.f136588l, org.apache.tools.ant.types.selectors.o.f136589m, "I", "p", "minWidth", "minHeight", "maxWidth", "maxHeight", "F", "(Landroidx/compose/ui/n;FFFF)Landroidx/compose/ui/n;", ak.aD, "r", ak.aG, RXScreenCaptureService.KEY_WIDTH, "v", androidx.exifinterface.media.a.W4, ak.aB, "x", "", Progress.G, "m", "i", "k", "Landroidx/compose/ui/c$b;", "align", "", "unbounded", "O", "Landroidx/compose/ui/c$c;", "K", "Landroidx/compose/ui/c;", "M", "g", "Landroidx/compose/foundation/layout/FillModifier;", ak.aF, ak.av, "b", "Landroidx/compose/foundation/layout/WrapContentModifier;", "f", "d", "e", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxWidth", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentWidthCenter", "WrapContentWidthStart", "WrapContentHeightCenter", "WrapContentHeightTop", RXScreenCaptureService.KEY_HEIGHT, "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class SizeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final FillModifier f6097a = c(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final FillModifier f6098b = a(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final FillModifier f6099c = b(1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final WrapContentModifier f6105i;

    static {
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        f6100d = f(companion.m(), false);
        f6101e = f(companion.u(), false);
        f6102f = d(companion.q(), false);
        f6103g = d(companion.w(), false);
        f6104h = e(companion.i(), false);
        f6105i = e(companion.C(), false);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n A(@dl.d androidx.compose.ui.n requiredWidthIn, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.s0(new SizeModifier(f10, 0.0f, f11, 0.0f, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredWidthIn");
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136588l, s1.h.d(f10));
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136589m, s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.n B(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return A(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n C(@dl.d androidx.compose.ui.n size, final float f10) {
        kotlin.jvm.internal.f0.p(size, "$this$size");
        return size.s0(new SizeModifier(f10, f10, f10, f10, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(UiKitSpanObj.TYPE_SIZE);
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n D(@dl.d androidx.compose.ui.n size, long j10) {
        kotlin.jvm.internal.f0.p(size, "$this$size");
        return E(size, s1.l.p(j10), s1.l.m(j10));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n E(@dl.d androidx.compose.ui.n size, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(size, "$this$size");
        return size.s0(new SizeModifier(f10, f11, f10, f11, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(UiKitSpanObj.TYPE_SIZE);
                x0Var.getProperties().c("width", s1.h.d(f10));
                x0Var.getProperties().c("height", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n F(@dl.d androidx.compose.ui.n sizeIn, final float f10, final float f11, final float f12, final float f13) {
        kotlin.jvm.internal.f0.p(sizeIn, "$this$sizeIn");
        return sizeIn.s0(new SizeModifier(f10, f11, f12, f13, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("sizeIn");
                x0Var.getProperties().c("minWidth", s1.h.d(f10));
                x0Var.getProperties().c("minHeight", s1.h.d(f11));
                x0Var.getProperties().c("maxWidth", s1.h.d(f12));
                x0Var.getProperties().c("maxHeight", s1.h.d(f13));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n G(androidx.compose.ui.n nVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.f139219c.e();
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.f139219c.e();
        }
        return F(nVar, f10, f11, f12, f13);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n H(@dl.d androidx.compose.ui.n width, final float f10) {
        kotlin.jvm.internal.f0.p(width, "$this$width");
        return width.s0(new SizeModifier(f10, 0.0f, f10, 0.0f, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("width");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 10, null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n I(@dl.d androidx.compose.ui.n widthIn, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(widthIn, "$this$widthIn");
        return widthIn.s0(new SizeModifier(f10, 0.0f, f11, 0.0f, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("widthIn");
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136588l, s1.h.d(f10));
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136589m, s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.n J(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return I(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n K(@dl.d androidx.compose.ui.n nVar, @dl.d androidx.compose.ui.c.InterfaceC0079c align, boolean z10) {
        WrapContentModifier wrapContentModifierD;
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(align, "align");
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        if (!kotlin.jvm.internal.f0.g(align, companion.q()) || z10) {
            wrapContentModifierD = (!kotlin.jvm.internal.f0.g(align, companion.w()) || z10) ? d(align, z10) : f6103g;
        } else {
            wrapContentModifierD = f6102f;
        }
        return nVar.s0(wrapContentModifierD);
    }

    public static /* synthetic */ androidx.compose.ui.n L(androidx.compose.ui.n nVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0079c = androidx.compose.ui.c.INSTANCE.q();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K(nVar, interfaceC0079c, z10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n M(@dl.d androidx.compose.ui.n nVar, @dl.d androidx.compose.ui.c align, boolean z10) {
        WrapContentModifier wrapContentModifierE;
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(align, "align");
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        if (!kotlin.jvm.internal.f0.g(align, companion.i()) || z10) {
            wrapContentModifierE = (!kotlin.jvm.internal.f0.g(align, companion.C()) || z10) ? e(align, z10) : f6105i;
        } else {
            wrapContentModifierE = f6104h;
        }
        return nVar.s0(wrapContentModifierE);
    }

    public static /* synthetic */ androidx.compose.ui.n N(androidx.compose.ui.n nVar, androidx.compose.ui.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(nVar, cVar, z10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n O(@dl.d androidx.compose.ui.n nVar, @dl.d androidx.compose.ui.c.b align, boolean z10) {
        WrapContentModifier wrapContentModifierF;
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(align, "align");
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        if (!kotlin.jvm.internal.f0.g(align, companion.m()) || z10) {
            wrapContentModifierF = (!kotlin.jvm.internal.f0.g(align, companion.u()) || z10) ? f(align, z10) : f6101e;
        } else {
            wrapContentModifierF = f6100d;
        }
        return nVar.s0(wrapContentModifierF);
    }

    public static /* synthetic */ androidx.compose.ui.n P(androidx.compose.ui.n nVar, androidx.compose.ui.c.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.m();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O(nVar, bVar, z10);
    }

    private static final FillModifier a(final float f10) {
        return new FillModifier(Direction.Vertical, f10, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillHeightModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("fillMaxHeight");
                $receiver.getProperties().c(Progress.G, Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    private static final FillModifier b(final float f10) {
        return new FillModifier(Direction.Both, f10, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillSizeModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("fillMaxSize");
                $receiver.getProperties().c(Progress.G, Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    private static final FillModifier c(final float f10) {
        return new FillModifier(Direction.Horizontal, f10, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillWidthModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("fillMaxWidth");
                $receiver.getProperties().c(Progress.G, Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    private static final WrapContentModifier d(final androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, final boolean z10) {
        return new WrapContentModifier(Direction.Vertical, z10, new yh.p<s1.r, LayoutDirection, s1.n>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$1
            {
                super(2);
            }

            public final long a(long j10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 1>");
                return s1.o.a(0, interfaceC0079c.a(0, s1.r.j(j10)));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar, LayoutDirection layoutDirection) {
                return s1.n.b(a(rVar.getF139248a(), layoutDirection));
            }
        }, interfaceC0079c, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("wrapContentHeight");
                $receiver.getProperties().c("align", interfaceC0079c);
                $receiver.getProperties().c("unbounded", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    private static final WrapContentModifier e(final androidx.compose.ui.c cVar, final boolean z10) {
        return new WrapContentModifier(Direction.Both, z10, new yh.p<s1.r, LayoutDirection, s1.n>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$1
            {
                super(2);
            }

            public final long a(long j10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                return cVar.a(s1.r.f139246b.a(), j10, layoutDirection);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar, LayoutDirection layoutDirection) {
                return s1.n.b(a(rVar.getF139248a(), layoutDirection));
            }
        }, cVar, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("wrapContentSize");
                $receiver.getProperties().c("align", cVar);
                $receiver.getProperties().c("unbounded", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    private static final WrapContentModifier f(final androidx.compose.ui.c.b bVar, final boolean z10) {
        return new WrapContentModifier(Direction.Horizontal, z10, new yh.p<s1.r, LayoutDirection, s1.n>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$1
            {
                super(2);
            }

            public final long a(long j10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                return s1.o.a(bVar.a(0, s1.r.m(j10), layoutDirection), 0);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar, LayoutDirection layoutDirection) {
                return s1.n.b(a(rVar.getF139248a(), layoutDirection));
            }
        }, bVar, new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 $receiver) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                $receiver.d("wrapContentWidth");
                $receiver.getProperties().c("align", bVar);
                $receiver.getProperties().c("unbounded", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        });
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n g(@dl.d androidx.compose.ui.n defaultMinSize, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.s0(new UnspecifiedConstraintsModifier(f10, f11, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("defaultMinSize");
                x0Var.getProperties().c("minWidth", s1.h.d(f10));
                x0Var.getProperties().c("minHeight", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n h(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return g(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n i(@dl.d androidx.compose.ui.n nVar, float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f6098b : a(f10));
    }

    public static /* synthetic */ androidx.compose.ui.n j(androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return i(nVar, f10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n nVar, float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f6099c : b(f10));
    }

    public static /* synthetic */ androidx.compose.ui.n l(androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return k(nVar, f10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n m(@dl.d androidx.compose.ui.n nVar, float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? f6097a : c(f10));
    }

    public static /* synthetic */ androidx.compose.ui.n n(androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return m(nVar, f10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n o(@dl.d androidx.compose.ui.n height, final float f10) {
        kotlin.jvm.internal.f0.p(height, "$this$height");
        return height.s0(new SizeModifier(0.0f, f10, 0.0f, f10, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("height");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 5, null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n p(@dl.d androidx.compose.ui.n heightIn, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(heightIn, "$this$heightIn");
        return heightIn.s0(new SizeModifier(0.0f, f10, 0.0f, f11, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("heightIn");
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136588l, s1.h.d(f10));
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136589m, s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.n q(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return p(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n r(@dl.d androidx.compose.ui.n requiredHeight, final float f10) {
        kotlin.jvm.internal.f0.p(requiredHeight, "$this$requiredHeight");
        return requiredHeight.s0(new SizeModifier(0.0f, f10, 0.0f, f10, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredHeight");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 5, null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n s(@dl.d androidx.compose.ui.n requiredHeightIn, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.s0(new SizeModifier(0.0f, f10, 0.0f, f11, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredHeightIn");
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136588l, s1.h.d(f10));
                x0Var.getProperties().c(org.apache.tools.ant.types.selectors.o.f136589m, s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.n t(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return s(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n u(@dl.d androidx.compose.ui.n requiredSize, final float f10) {
        kotlin.jvm.internal.f0.p(requiredSize, "$this$requiredSize");
        return requiredSize.s0(new SizeModifier(f10, f10, f10, f10, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredSize");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n v(@dl.d androidx.compose.ui.n requiredSize, long j10) {
        kotlin.jvm.internal.f0.p(requiredSize, "$this$requiredSize");
        return w(requiredSize, s1.l.p(j10), s1.l.m(j10));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n w(@dl.d androidx.compose.ui.n requiredSize, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(requiredSize, "$this$requiredSize");
        return requiredSize.s0(new SizeModifier(f10, f11, f10, f11, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredSize");
                x0Var.getProperties().c("width", s1.h.d(f10));
                x0Var.getProperties().c("height", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n x(@dl.d androidx.compose.ui.n requiredSizeIn, final float f10, final float f11, final float f12, final float f13) {
        kotlin.jvm.internal.f0.p(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.s0(new SizeModifier(f10, f11, f12, f13, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredSizeIn");
                x0Var.getProperties().c("minWidth", s1.h.d(f10));
                x0Var.getProperties().c("minHeight", s1.h.d(f11));
                x0Var.getProperties().c("maxWidth", s1.h.d(f12));
                x0Var.getProperties().c("maxHeight", s1.h.d(f13));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n y(androidx.compose.ui.n nVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.f139219c.e();
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.f139219c.e();
        }
        return x(nVar, f10, f11, f12, f13);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n z(@dl.d androidx.compose.ui.n requiredWidth, final float f10) {
        kotlin.jvm.internal.f0.p(requiredWidth, "$this$requiredWidth");
        return requiredWidth.s0(new SizeModifier(f10, 0.0f, f10, 0.0f, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("requiredWidth");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 10, null));
    }
}
