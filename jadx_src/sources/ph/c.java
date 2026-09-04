package ph;

import kotlin.contracts.InvocationKind;
import kotlin.u;
import kotlin.u0;

/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@f
@sh.b
public interface c {

    /* JADX INFO: compiled from: ContractBuilder.kt */
    public static final class a {
        public static /* synthetic */ ph.a a(c cVar, u uVar, InvocationKind invocationKind, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i10 & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return cVar.d(uVar, invocationKind);
        }
    }

    @dl.d
    @sh.b
    g a();

    @dl.d
    @sh.b
    g b(@dl.e Object obj);

    @dl.d
    @sh.b
    h c();

    @dl.d
    @sh.b
    <R> ph.a d(@dl.d u<? extends R> uVar, @dl.d InvocationKind invocationKind);
}
