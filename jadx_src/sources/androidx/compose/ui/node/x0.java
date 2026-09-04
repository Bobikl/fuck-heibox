package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007R&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007R&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007R&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\n\u0010\u0007R&\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/x0;", "", "Landroidx/compose/ui/node/v0;", "Landroidx/compose/ui/n$d;", "b", "I", ak.av, "()I", "Any", "Landroidx/compose/ui/node/v;", ak.aF, "e", "Layout", "Landroidx/compose/ui/node/h;", "d", "Draw", "Landroidx/compose/ui/node/j1;", "j", "Semantics", "Landroidx/compose/ui/node/f1;", "f", "i", "PointerInput", "Landroidx/compose/ui/modifier/j;", "g", "Locals", "Landroidx/compose/ui/node/d1;", RXScreenCaptureService.KEY_HEIGHT, "ParentData", "Landroidx/compose/ui/node/t;", "LayoutAware", "Landroidx/compose/ui/node/j;", "GlobalPositionAware", "Landroidx/compose/ui/node/o;", "k", "IntermediateMeasure", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final x0 f15398a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int Any = v0.b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int Layout = v0.b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int Draw = v0.b(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int Semantics = v0.b(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int PointerInput = v0.b(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final int Locals = v0.b(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final int ParentData = v0.b(64);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final int LayoutAware = v0.b(128);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final int GlobalPositionAware = v0.b(256);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final int IntermediateMeasure = v0.b(512);

    private x0() {
    }

    public final int a() {
        return Any;
    }

    public final int b() {
        return Draw;
    }

    public final int c() {
        return GlobalPositionAware;
    }

    public final int d() {
        return IntermediateMeasure;
    }

    public final int e() {
        return Layout;
    }

    public final int f() {
        return LayoutAware;
    }

    public final int g() {
        return Locals;
    }

    public final int h() {
        return ParentData;
    }

    public final int i() {
        return PointerInput;
    }

    public final int j() {
        return Semantics;
    }
}
