package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {bb.c.b.f30829o1}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$filterNot$1 extends SuspendLambda implements yh.p<Object, kotlin.coroutines.c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f128861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$filterNot$1(yh.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$filterNot$1> cVar) {
        super(2, cVar);
        this.f128861d = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.f128861d, cVar);
        channelsKt__DeprecatedKt$filterNot$1.f128860c = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128859b;
        if (i10 == 0) {
            t0.n(obj);
            Object obj2 = this.f128860c;
            yh.p<Object, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f128861d;
            this.f128859b = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.a(!((Boolean) obj).booleanValue());
    }
}
