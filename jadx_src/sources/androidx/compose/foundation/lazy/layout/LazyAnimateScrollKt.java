package androidx.compose.foundation.lazy.layout;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a'\u0010\t\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0017\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lkotlin/b2;", "d", "Landroidx/compose/foundation/lazy/layout/e;", "", UCropPlusActivity.ARG_INDEX, "scrollOffset", ak.aF, "(Landroidx/compose/foundation/lazy/layout/e;IILkotlin/coroutines/c;)Ljava/lang/Object;", "Ls1/h;", ak.av, "F", "TargetDistance", "b", "BoundDistance", "", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyAnimateScrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f7021a = s1.h.g(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f7022b = s1.h.g(1500);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f7023c = false;

    @dl.e
    public static final Object c(@dl.d e eVar, int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objB = eVar.b(new LazyAnimateScrollKt$animateScrollToItem$2(i10, eVar, i11, null), cVar);
        return objB == kotlin.coroutines.intrinsics.b.h() ? objB : b2.f124493a;
    }

    private static final void d(yh.a<String> aVar) {
    }
}
