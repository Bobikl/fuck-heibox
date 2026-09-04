package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.modifier.m;
import androidx.compose.ui.modifier.p;
import b1.i;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B\u000f\u0012\u0006\u0010&\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J/\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;", "Landroidx/compose/foundation/relocation/b;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/relocation/c;", "Lkotlin/Pair;", "Lb1/i;", "Lkotlinx/coroutines/d2;", "request", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "Lkotlin/b2;", "o", "(Lkotlin/Pair;Landroidx/compose/ui/layout/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "childCoordinates", "Lkotlin/Function0;", "boundsProvider", ak.av, "(Landroidx/compose/ui/layout/q;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/f;", "e", "Landroidx/compose/foundation/relocation/f;", "q", "()Landroidx/compose/foundation/relocation/f;", ak.aB, "(Landroidx/compose/foundation/relocation/f;)V", "responder", "f", "Lkotlin/Pair;", "newestReceivedRequest", "g", "newestDispatchedRequest", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "r", "()Landroidx/compose/foundation/relocation/c;", "value", "defaultParent", "<init>", "(Landroidx/compose/foundation/relocation/c;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class BringIntoViewResponderModifier extends b implements m<c>, c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public f responder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Pair<i, ? extends d2> newestReceivedRequest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Pair<i, ? extends d2> newestDispatchedRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(@dl.d c defaultParent) {
        super(defaultParent);
        f0.p(defaultParent, "defaultParent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(Pair<i, ? extends d2> pair, q qVar, kotlin.coroutines.c<? super b2> cVar) {
        this.newestDispatchedRequest = pair;
        i iVarE = pair.e();
        Object objG = r0.g(new BringIntoViewResponderModifier$dispatchRequest$2(this, qVar, iVarE, q().a(iVarE), null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @Override // androidx.compose.foundation.relocation.c
    @dl.e
    public Object a(@dl.d q qVar, @dl.d yh.a<i> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new BringIntoViewResponderModifier$bringChildIntoView$2(this, qVar, aVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public p<c> getKey() {
        return BringIntoViewKt.a();
    }

    @dl.d
    public final f q() {
        f fVar = this.responder;
        if (fVar != null) {
            return fVar;
        }
        f0.S("responder");
        return null;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c getValue() {
        return this;
    }

    public final void s(@dl.d f fVar) {
        f0.p(fVar, "<set-?>");
        this.responder = fVar;
    }
}
