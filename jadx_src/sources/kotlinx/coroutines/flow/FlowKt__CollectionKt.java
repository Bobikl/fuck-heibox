package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "", "destination", "", "b", "(Lkotlinx/coroutines/flow/e;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "", "d", "(Lkotlinx/coroutines/flow/e;Ljava/util/Set;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "C", ak.av, "(Lkotlinx/coroutines/flow/e;Ljava/util/Collection;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: compiled from: Collection.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "C", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements f {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f129300b;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        a(Collection collection) {
            this.f129300b = collection;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129300b.add(t10);
            return b2.f124493a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T, C extends Collection<? super T>> Object a(@dl.d e<? extends T> eVar, @dl.d C c10, @dl.d kotlin.coroutines.c<? super C> cVar) throws Throwable {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        if (cVar instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) cVar;
            int i10 = flowKt__CollectionKt$toCollection$1.f129303d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.f129303d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(cVar);
            }
        } else {
            flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(cVar);
        }
        Object obj = flowKt__CollectionKt$toCollection$1.f129302c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__CollectionKt$toCollection$1.f129303d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.f129301b;
            t0.n(obj);
            return collection;
        }
        t0.n(obj);
        f<? super Object> aVar = new a<>(c10);
        flowKt__CollectionKt$toCollection$1.f129301b = c10;
        flowKt__CollectionKt$toCollection$1.f129303d = 1;
        return eVar.a(aVar, flowKt__CollectionKt$toCollection$1) == objH ? objH : c10;
    }

    @dl.e
    public static final <T> Object b(@dl.d e<? extends T> eVar, @dl.d List<T> list, @dl.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        return g.V1(eVar, list, cVar);
    }

    public static /* synthetic */ Object c(e eVar, List list, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return g.W1(eVar, list, cVar);
    }

    @dl.e
    public static final <T> Object d(@dl.d e<? extends T> eVar, @dl.d Set<T> set, @dl.d kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        return g.V1(eVar, set, cVar);
    }

    public static /* synthetic */ Object e(e eVar, Set set, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return g.Y1(eVar, set, cVar);
    }
}
