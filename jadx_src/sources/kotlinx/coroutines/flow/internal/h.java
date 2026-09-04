package kotlinx.coroutines.flow.internal;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.r0;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0081\b¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Lkotlinx/coroutines/flow/f;", "owner", "Lkotlin/b2;", "b", "", UCropPlusActivity.ARG_INDEX, ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h {
    @r0
    public static final int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@dl.d AbortFlowException abortFlowException, @dl.d kotlinx.coroutines.flow.f<?> fVar) {
        if (abortFlowException.owner != fVar) {
            throw abortFlowException;
        }
    }
}
