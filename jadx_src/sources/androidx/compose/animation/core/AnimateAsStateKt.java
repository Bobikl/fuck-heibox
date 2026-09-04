package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0001\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u001aO\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aU\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0012\u001aU\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u0001\u001a\u00020\u001d2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0012\u001a\u007f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b$\u0010%\u001aO\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b&\u0010'\u001aK\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001aK\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aK\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0001\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010+\u001aE\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b-\u0010.\u001aE\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b/\u00100\u001aK\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010+\u001aK\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u0001\u001a\u00020\u001d2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010+\u001au\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b3\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\r058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00107\"\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0010058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u00107\"\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u00107\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u00107\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/h;", "animationSpec", "visibilityThreshold", "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/Function1;", "Lkotlin/b2;", "finishedListener", "Landroidx/compose/runtime/m2;", "e", "(FLandroidx/compose/animation/core/h;FLjava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Ls1/h;", ak.aF, "(FLandroidx/compose/animation/core/h;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Lb1/m;", "r", "(JLandroidx/compose/animation/core/h;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Lb1/f;", "m", "Lb1/i;", "o", "(Lb1/i;Landroidx/compose/animation/core/h;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "", "g", "(ILandroidx/compose/animation/core/h;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Ls1/n;", "j", "Ls1/r;", "k", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "typeConverter", ak.aB, "(Ljava/lang/Object;Landroidx/compose/animation/core/f1;Landroidx/compose/animation/core/h;Ljava/lang/Object;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "f", "(FLandroidx/compose/animation/core/h;FLyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "d", "(FLandroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "q", "(JLandroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "n", "p", "(Lb1/i;Landroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", RXScreenCaptureService.KEY_HEIGHT, "(ILandroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "i", "l", "t", "(Ljava/lang/Object;Landroidx/compose/animation/core/f1;Landroidx/compose/animation/core/h;Ljava/lang/Object;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/core/z0;", ak.av, "Landroidx/compose/animation/core/z0;", "defaultAnimation", "b", "dpDefaultSpring", "sizeDefaultSpring", "offsetDefaultSpring", "rectDefaultSpring", "intDefaultSpring", "intOffsetDefaultSpring", "intSizeDefaultSpring", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class AnimateAsStateKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final z0<Float> f4131a = i.o(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final z0<s1.h> f4132b = i.o(0.0f, 0.0f, s1.h.d(x1.a(s1.h.f139219c)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final z0<b1.m> f4133c = i.o(0.0f, 0.0f, b1.m.c(x1.d(b1.m.f30386b)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z0<b1.f> f4134d = i.o(0.0f, 0.0f, b1.f.d(x1.c(b1.f.f30364b)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final z0<b1.i> f4135e = i.o(0.0f, 0.0f, x1.h(b1.i.f30369e), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final z0<Integer> f4136f = i.o(0.0f, 0.0f, Integer.valueOf(x1.b(kotlin.jvm.internal.d0.f124911a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final z0<s1.n> f4137g = i.o(0.0f, 0.0f, s1.n.b(x1.f(s1.n.f139237b)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final z0<s1.r> f4138h = i.o(0.0f, 0.0f, s1.r.b(x1.g(s1.r.f139246b)), 3, null);

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<s1.h> c(float f10, @dl.e h<s1.h> hVar, @dl.e String str, @dl.e yh.l<? super s1.h, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1407150062);
        h<s1.h> hVar2 = (i11 & 2) != 0 ? f4132b : hVar;
        String str2 = (i11 & 4) != 0 ? "DpAnimation" : str;
        yh.l<? super s1.h, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:107)");
        }
        int i12 = i10 << 6;
        m2<s1.h> m2VarS = s(s1.h.d(f10), VectorConvertersKt.g(s1.h.f139219c), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 d(float f10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(704104481);
        if ((i11 & 2) != 0) {
            hVar = f4132b;
        }
        h hVar2 = hVar;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        yh.l lVar2 = lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(704104481, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:456)");
        }
        m2 m2VarS = s(s1.h.d(f10), VectorConvertersKt.g(s1.h.f139219c), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (458752 & (i10 << 9)), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<Float> e(float f10, @dl.e h<Float> hVar, float f11, @dl.e String str, @dl.e yh.l<? super Float, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(668842840);
        h<Float> hVar2 = (i11 & 2) != 0 ? f4131a : hVar;
        float f12 = (i11 & 4) != 0 ? 0.01f : f11;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        yh.l<? super Float, b2> lVar2 = (i11 & 16) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:61)");
        }
        pVar.T(841393615);
        if (hVar2 == f4131a) {
            Float fValueOf = Float.valueOf(f12);
            pVar.T(1157296644);
            boolean zS = pVar.s(fValueOf);
            Object objU = pVar.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = i.o(0.0f, 0.0f, Float.valueOf(f12), 3, null);
                pVar.N(objU);
            }
            pVar.c0();
            hVar2 = (h) objU;
        }
        pVar.c0();
        int i12 = i10 << 3;
        m2<Float> m2VarS = s(Float.valueOf(f10), VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), hVar2, Float.valueOf(f12), str2, lVar2, pVar, (i12 & bb.c.g.f32954lc) | (i10 & 14) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 f(float f10, h hVar, float f11, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1091643291);
        if ((i11 & 2) != 0) {
            hVar = f4131a;
        }
        h hVar2 = hVar;
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        float f12 = f11;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        yh.l lVar2 = lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1091643291, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:439)");
        }
        m2<Float> m2VarE = e(f10, hVar2, f12, null, lVar2, pVar, (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (57344 & (i10 << 3)), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarE;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<Integer> g(int i10, @dl.e h<Integer> hVar, @dl.e String str, @dl.e yh.l<? super Integer, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        pVar.T(428074472);
        h<Integer> hVar2 = (i12 & 2) != 0 ? f4136f : hVar;
        String str2 = (i12 & 4) != 0 ? "IntAnimation" : str;
        yh.l<? super Integer, b2> lVar2 = (i12 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(428074472, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:267)");
        }
        int i13 = i11 << 6;
        m2<Integer> m2VarS = s(Integer.valueOf(i10), VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a), hVar2, null, str2, lVar2, pVar, (i11 & 14) | ((i11 << 3) & bb.c.b.f30796me) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 h(int i10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i11, int i12) {
        pVar.T(-842612981);
        if ((i12 & 2) != 0) {
            hVar = f4136f;
        }
        h hVar2 = hVar;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        yh.l lVar2 = lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-842612981, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:522)");
        }
        m2 m2VarS = s(Integer.valueOf(i10), VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a), hVar2, null, null, lVar2, pVar, (i11 & 14) | ((i11 << 3) & bb.c.b.f30796me) | (458752 & (i11 << 9)), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 i(long j10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1010307371);
        h hVar2 = (i11 & 2) != 0 ? f4137g : hVar;
        yh.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1010307371, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:537)");
        }
        m2 m2VarS = s(s1.n.b(j10), VectorConvertersKt.i(s1.n.f139237b), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<s1.n> j(long j10, @dl.e h<s1.n> hVar, @dl.e String str, @dl.e yh.l<? super s1.n, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-696782904);
        h<s1.n> hVar2 = (i11 & 2) != 0 ? f4137g : hVar;
        String str2 = (i11 & 4) != 0 ? "IntOffsetAnimation" : str;
        yh.l<? super s1.n, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-696782904, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:307)");
        }
        int i12 = i10 << 6;
        m2<s1.n> m2VarS = s(s1.n.b(j10), VectorConvertersKt.i(s1.n.f139237b), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<s1.r> k(long j10, @dl.e h<s1.r> hVar, @dl.e String str, @dl.e yh.l<? super s1.r, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(582576328);
        h<s1.r> hVar2 = (i11 & 2) != 0 ? f4138h : hVar;
        String str2 = (i11 & 4) != 0 ? "IntSizeAnimation" : str;
        yh.l<? super s1.r, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(582576328, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:345)");
        }
        int i12 = i10 << 6;
        m2<s1.r> m2VarS = s(s1.r.b(j10), VectorConvertersKt.j(s1.r.f139246b), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 l(long j10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1749239765);
        h hVar2 = (i11 & 2) != 0 ? f4138h : hVar;
        yh.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1749239765, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:552)");
        }
        m2 m2VarS = s(s1.r.b(j10), VectorConvertersKt.j(s1.r.f139246b), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<b1.f> m(long j10, @dl.e h<b1.f> hVar, @dl.e String str, @dl.e yh.l<? super b1.f, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(357896800);
        h<b1.f> hVar2 = (i11 & 2) != 0 ? f4134d : hVar;
        String str2 = (i11 & 4) != 0 ? "OffsetAnimation" : str;
        yh.l<? super b1.f, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(357896800, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:188)");
        }
        int i12 = i10 << 6;
        m2<b1.f> m2VarS = s(b1.f.d(j10), VectorConvertersKt.b(b1.f.f30364b), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 n(long j10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-456513133);
        h hVar2 = (i11 & 2) != 0 ? f4134d : hVar;
        yh.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-456513133, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:492)");
        }
        m2 m2VarS = s(b1.f.d(j10), VectorConvertersKt.b(b1.f.f30364b), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<b1.i> o(@dl.d b1.i targetValue, @dl.e h<b1.i> hVar, @dl.e String str, @dl.e yh.l<? super b1.i, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        pVar.T(536062978);
        h<b1.i> hVar2 = (i11 & 2) != 0 ? f4135e : hVar;
        String str2 = (i11 & 4) != 0 ? "RectAnimation" : str;
        yh.l<? super b1.i, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(536062978, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:229)");
        }
        int i12 = i10 << 6;
        m2<b1.i> m2VarS = s(targetValue, VectorConvertersKt.c(b1.i.f30369e), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 p(b1.i targetValue, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        pVar.T(-782613967);
        if ((i11 & 2) != 0) {
            hVar = f4135e;
        }
        h hVar2 = hVar;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        yh.l lVar2 = lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-782613967, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:507)");
        }
        m2 m2VarS = s(targetValue, VectorConvertersKt.c(b1.i.f30369e), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (458752 & (i10 << 9)), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 q(long j10, h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(875212471);
        h hVar2 = (i11 & 2) != 0 ? f4133c : hVar;
        yh.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(875212471, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:474)");
        }
        m2 m2VarS = s(b1.m.c(j10), VectorConvertersKt.d(b1.m.f30386b), hVar2, null, null, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<b1.m> r(long j10, @dl.e h<b1.m> hVar, @dl.e String str, @dl.e yh.l<? super b1.m, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1374633148);
        h<b1.m> hVar2 = (i11 & 2) != 0 ? f4133c : hVar;
        String str2 = (i11 & 4) != 0 ? "SizeAnimation" : str;
        yh.l<? super b1.m, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1374633148, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:148)");
        }
        int i12 = i10 << 6;
        m2<b1.m> m2VarS = s(b1.m.c(j10), VectorConvertersKt.d(b1.m.f30386b), hVar2, null, str2, lVar2, pVar, (i10 & 14) | ((i10 << 3) & bb.c.b.f30796me) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final <T, V extends p> m2<T> s(final T t10, @dl.d f1<T, V> typeConverter, @dl.e h<T> hVar, @dl.e T t11, @dl.e String str, @dl.e yh.l<? super T, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        h<T> hVarN;
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        pVar.T(-1994373980);
        if ((i11 & 4) != 0) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = i.o(0.0f, 0.0f, null, 7, null);
                pVar.N(objU);
            }
            pVar.c0();
            hVarN = (h) objU;
        } else {
            hVarN = hVar;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        yh.l<? super T, b2> lVar2 = (i11 & 32) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:389)");
        }
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU2 == companion.a()) {
            objU2 = new Animatable(t10, typeConverter, t12, str2);
            pVar.N(objU2);
        }
        pVar.c0();
        Animatable animatable = (Animatable) objU2;
        m2 m2VarT = e2.t(lVar2, pVar, (i10 >> 15) & 14);
        if (t12 != null && (hVarN instanceof z0)) {
            z0 z0Var = (z0) hVarN;
            if (!kotlin.jvm.internal.f0.g(z0Var.h(), t12)) {
                hVarN = i.n(z0Var.getDampingRatio(), z0Var.getStiffness(), t12);
            }
        }
        m2 m2VarT2 = e2.t(hVarN, pVar, 0);
        pVar.T(-492369756);
        Object objU3 = pVar.U();
        if (objU3 == companion.a()) {
            objU3 = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
            pVar.N(objU3);
        }
        pVar.c0();
        final kotlinx.coroutines.channels.k kVar = (kotlinx.coroutines.channels.k) objU3;
        EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kVar.v(t10);
            }
        }, pVar, 0);
        EffectsKt.h(kVar, new AnimateAsStateKt$animateValueAsState$3(kVar, animatable, m2VarT2, m2VarT, null), pVar, 72);
        m2<T> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 t(Object obj, f1 typeConverter, h hVar, Object obj2, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        h hVar2;
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        pVar.T(-846382129);
        if ((i11 & 4) != 0) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = i.o(0.0f, 0.0f, null, 7, null);
                pVar.N(objU);
            }
            pVar.c0();
            hVar2 = (h) objU;
        } else {
            hVar2 = hVar;
        }
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        yh.l lVar2 = (i11 & 16) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-846382129, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:567)");
        }
        int i12 = i10 & 8;
        m2 m2VarS = s(obj, typeConverter, hVar2, obj3, "ValueAnimation", lVar2, pVar, (i12 << 9) | i12 | 24576 | (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc) | ((i10 << 3) & 458752), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> yh.l<T, b2> u(m2<? extends yh.l<? super T, b2>> m2Var) {
        return m2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> h<T> v(m2<? extends h<T>> m2Var) {
        return m2Var.getValue();
    }
}
