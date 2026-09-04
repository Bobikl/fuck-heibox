package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.u1;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/flow/e;", "n", "(Lyh/p;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function0;", "f", "Lkotlin/Function1;", "g", "(Lyh/l;)Lkotlinx/coroutines/flow/e;", "", ak.aF, "", "d", "Lkotlin/sequences/m;", "e", "", "elements", "p", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;", "value", "o", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;", "m", "j", "", "", RXScreenCaptureService.KEY_HEIGHT, "", "", "i", "Lfi/l;", ak.av, "Lfi/o;", "b", "Lkotlinx/coroutines/channels/w;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a f129214b;

        public a(yh.a aVar) {
            this.f129214b = aVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objEmit = fVar.emit((Object) this.f129214b.invoke(), cVar);
            return objEmit == kotlin.coroutines.intrinsics.b.h() ? objEmit : b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f129274b;

        public b(Object obj) {
            this.f129274b = obj;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objEmit = fVar.emit((Object) this.f129274b, cVar);
            return objEmit == kotlin.coroutines.intrinsics.b.h() ? objEmit : b2.f124493a;
        }
    }

    @dl.d
    public static final e<Integer> a(@dl.d fi.l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(lVar);
    }

    @dl.d
    public static final e<Long> b(@dl.d fi.o oVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(oVar);
    }

    @dl.d
    public static final <T> e<T> c(@dl.d Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @dl.d
    public static final <T> e<T> d(@dl.d Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    @dl.d
    public static final <T> e<T> e(@dl.d kotlin.sequences.m<? extends T> mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(mVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> f(@dl.d yh.a<? extends T> aVar) {
        return new a(aVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> g(@dl.d yh.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    @dl.d
    public static final e<Integer> h(@dl.d int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    @dl.d
    public static final e<Long> i(@dl.d long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    @dl.d
    public static final <T> e<T> j(@dl.d T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    @dl.d
    public static final <T> e<T> k(@kotlin.b @dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    @dl.d
    public static final <T> e<T> l(@kotlin.b @dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new c(pVar, null, 0, null, 14, null);
    }

    @dl.d
    public static final <T> e<T> m() {
        return d.f129934b;
    }

    @dl.d
    public static final <T> e<T> n(@kotlin.b @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new m(pVar);
    }

    @dl.d
    public static final <T> e<T> o(T t10) {
        return new b(t10);
    }

    @dl.d
    public static final <T> e<T> p(@dl.d T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}
