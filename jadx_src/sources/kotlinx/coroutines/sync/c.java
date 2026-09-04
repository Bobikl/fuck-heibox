package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.k;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/sync/c;", "", "owner", "", ak.av, "Lkotlin/b2;", "e", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "f", "b", "()Z", "isLocked", "Lkotlinx/coroutines/selects/e;", "d", "()Lkotlinx/coroutines/selects/e;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface c {

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @k(level = DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(c cVar, Object obj, kotlin.coroutines.c cVar2, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return cVar.e(obj, cVar2);
        }

        public static /* synthetic */ boolean c(c cVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return cVar.a(obj);
        }

        public static /* synthetic */ void d(c cVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            cVar.f(obj);
        }
    }

    boolean a(@dl.e Object owner);

    boolean b();

    boolean c(@dl.d Object owner);

    @dl.d
    kotlinx.coroutines.selects.e<Object, c> d();

    @dl.e
    Object e(@dl.e Object obj, @dl.d kotlin.coroutines.c<? super b2> cVar);

    void f(@dl.e Object obj);
}
