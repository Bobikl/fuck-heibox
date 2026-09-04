package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Elevation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Ls1/h;", "target", "Landroidx/compose/foundation/interaction/d;", "from", "to", "Lkotlin/b2;", "d", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/d;Landroidx/compose/foundation/interaction/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/b0;", ak.av, "Landroidx/compose/animation/core/b0;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/e1;", "b", "Landroidx/compose/animation/core/e1;", "DefaultIncomingSpec", ak.aF, "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.b0 f12141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.e1<s1.h> f12142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.e1<s1.h> f12143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.e1<s1.h> f12144d;

    static {
        androidx.compose.animation.core.v vVar = new androidx.compose.animation.core.v(0.4f, 0.0f, 0.6f, 1.0f);
        f12141a = vVar;
        f12142b = new androidx.compose.animation.core.e1<>(120, 0, androidx.compose.animation.core.d0.b(), 2, null);
        f12143c = new androidx.compose.animation.core.e1<>(150, 0, vVar, 2, null);
        f12144d = new androidx.compose.animation.core.e1<>(120, 0, vVar, 2, null);
    }

    @dl.e
    public static final Object d(@dl.d Animatable<s1.h, ?> animatable, float f10, @dl.e androidx.compose.foundation.interaction.d dVar, @dl.e androidx.compose.foundation.interaction.d dVar2, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        androidx.compose.animation.core.h<s1.h> hVarB;
        if (dVar2 != null) {
            hVarB = u.f12137a.a(dVar2);
        } else {
            hVarB = dVar != null ? u.f12137a.b(dVar) : null;
        }
        androidx.compose.animation.core.h<s1.h> hVar = hVarB;
        if (hVar != null) {
            Object objI = Animatable.i(animatable, s1.h.d(f10), hVar, null, null, cVar, 12, null);
            return objI == kotlin.coroutines.intrinsics.b.h() ? objI : kotlin.b2.f124493a;
        }
        Object objB = animatable.B(s1.h.d(f10), cVar);
        return objB == kotlin.coroutines.intrinsics.b.h() ? objB : kotlin.b2.f124493a;
    }

    public static /* synthetic */ Object e(Animatable animatable, float f10, androidx.compose.foundation.interaction.d dVar, androidx.compose.foundation.interaction.d dVar2, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            dVar2 = null;
        }
        return d(animatable, f10, dVar, dVar2, cVar);
    }
}
