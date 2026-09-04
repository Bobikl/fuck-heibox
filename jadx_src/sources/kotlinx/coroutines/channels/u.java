package kotlinx.coroutines.channels;

import com.max.hblogistics.AddressListActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/u;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel;", "element", "", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "K", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/channels/a0;", "list", "Lkotlinx/coroutines/channels/p;", "closed", "Lkotlin/b2;", "k0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/p;)V", "", "g0", "()Z", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "C", "isBufferAlwaysFull", "D", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class u<E> extends AbstractChannel<E> {
    public u(@dl.e yh.l<? super E, b2> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object I(E element) {
        y<?> yVarN;
        do {
            Object objI = super.I(element);
            o0 o0Var = a.f129024d;
            if (objI == o0Var) {
                return o0Var;
            }
            if (objI != a.f129025e) {
                if (objI instanceof p) {
                    return objI;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objI).toString());
            }
            yVarN = N(element);
            if (yVarN == null) {
                return o0Var;
            }
        } while (!(yVarN instanceof p));
        return yVarN;
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object K(E element, @dl.d kotlinx.coroutines.selects.f<?> select) {
        Object objM;
        while (true) {
            if (f0()) {
                objM = super.K(element, select);
            } else {
                objM = select.m(j(element));
                if (objM == null) {
                    objM = a.f129024d;
                }
            }
            if (objM == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            o0 o0Var = a.f129024d;
            if (objM == o0Var) {
                return o0Var;
            }
            if (objM != a.f129025e && objM != kotlinx.coroutines.internal.c.f130153b) {
                if (objM instanceof p) {
                    return objM;
                }
                throw new IllegalStateException(("Invalid result " + objM).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean g0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean h0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void k0(@dl.d Object list, @dl.d p<?> closed) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionC = null;
        if (list != null) {
            if (list instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) list;
                UndeliveredElementException undeliveredElementExceptionC2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var instanceof b.a) {
                        yh.l<E, b2> lVar = this.f129030b;
                        undeliveredElementExceptionC2 = lVar != null ? OnUndeliveredElementKt.c(lVar, ((b.a) a0Var).element, undeliveredElementExceptionC2) : null;
                    } else {
                        a0Var.m0(closed);
                    }
                }
                undeliveredElementExceptionC = undeliveredElementExceptionC2;
            } else {
                a0 a0Var2 = (a0) list;
                if (a0Var2 instanceof b.a) {
                    yh.l<E, b2> lVar2 = this.f129030b;
                    if (lVar2 != null) {
                        undeliveredElementExceptionC = OnUndeliveredElementKt.c(lVar2, ((b.a) a0Var2).element, null);
                    }
                } else {
                    a0Var2.m0(closed);
                }
            }
        }
        if (undeliveredElementExceptionC != null) {
            throw undeliveredElementExceptionC;
        }
    }
}
