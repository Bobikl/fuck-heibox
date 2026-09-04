package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", ak.aF, "(Lyh/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "b", "(Lyh/l;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", ak.av, "(Lyh/l;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lyh/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class OnUndeliveredElementKt {
    @dl.d
    public static final <E> yh.l<Throwable, b2> a(@dl.d final yh.l<? super E, b2> lVar, final E e10, @dl.d final CoroutineContext coroutineContext) {
        return new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) throws IllegalAccessException, InvocationTargetException {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Throwable th2) throws IllegalAccessException, InvocationTargetException {
                OnUndeliveredElementKt.b(lVar, e10, coroutineContext);
            }
        };
    }

    public static final <E> void b(@dl.d yh.l<? super E, b2> lVar, E e10, @dl.d CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionC = c(lVar, e10, null);
        if (undeliveredElementExceptionC != null) {
            kotlinx.coroutines.n0.b(coroutineContext, undeliveredElementExceptionC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final <E> UndeliveredElementException c(@dl.d yh.l<? super E, b2> lVar, E e10, @dl.e UndeliveredElementException undeliveredElementException) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th2);
            }
            kotlin.o.a(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(yh.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
