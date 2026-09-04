package androidx.compose.foundation.relocation;

import androidx.compose.foundation.t;
import androidx.compose.ui.layout.q;
import b1.i;
import b1.n;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.s;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "Landroidx/compose/foundation/relocation/b;", "Lb1/i;", "rect", "Lkotlin/b2;", "e", "(Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/c;", "defaultParent", "<init>", "(Landroidx/compose/foundation/relocation/c;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class BringIntoViewRequesterModifier extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(@dl.d c defaultParent) {
        super(defaultParent);
        f0.p(defaultParent, "defaultParent");
    }

    @dl.e
    public final Object e(@dl.e final i iVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA;
        c cVarD = d();
        q qVarC = c();
        return (qVarC != null && (objA = cVarD.a(qVarC, new yh.a<i>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterModifier$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i invoke() {
                i iVar2 = iVar;
                if (iVar2 != null) {
                    return iVar2;
                }
                q qVarC2 = this.c();
                if (qVarC2 != null) {
                    return n.m(s.f(qVarC2.a()));
                }
                return null;
            }
        }, cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objA : b2.f124493a;
    }
}
