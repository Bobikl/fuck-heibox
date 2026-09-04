package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.y;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1", f = "Multicaster.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1$invokeSuspend$$inlined$transform$1<T> extends SuspendLambda implements p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f26525d;

    /* JADX INFO: renamed from: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1"}, k = 1, mv = {1, 4, 2})
    public static final class AnonymousClass1 implements f<ChannelManager.b.AbstractC0200b.c<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f26527c;

        /* JADX INFO: renamed from: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1$1", "emit"}, k = 3, mv = {1, 4, 2})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1", f = "Multicaster.kt", i = {0}, l = {134}, m = "emit", n = {"it"}, s = {"L$0"})
        public static final class C02021 extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26528b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f26529c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f26531e;

            public C02021(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f26528b = obj;
                this.f26529c |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(f fVar) {
            this.f26527c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
            C02021 c02021;
            ChannelManager.b.AbstractC0200b.c cVar2;
            if (cVar instanceof C02021) {
                c02021 = (C02021) cVar;
                int i10 = c02021.f26529c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c02021.f26529c = i10 - Integer.MIN_VALUE;
                } else {
                    c02021 = new C02021(cVar);
                }
            } else {
                c02021 = new C02021(cVar);
            }
            Object obj2 = c02021.f26528b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = c02021.f26529c;
            if (i11 == 0) {
                t0.n(obj2);
                f fVar = this.f26527c;
                cVar2 = (ChannelManager.b.AbstractC0200b.c) obj;
                Object objB = cVar2.b();
                c02021.f26531e = cVar2;
                c02021.f26529c = 1;
                if (fVar.emit(objB, c02021) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = (ChannelManager.b.AbstractC0200b.c) c02021.f26531e;
                t0.n(obj2);
            }
            y<b2> yVarA = cVar2.a();
            b2 b2Var = b2.f124493a;
            yVarA.A(b2Var);
            return b2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$invokeSuspend$$inlined$transform$1(e eVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26525d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Multicaster$flow$1$invokeSuspend$$inlined$transform$1 multicaster$flow$1$invokeSuspend$$inlined$transform$1 = new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(this.f26525d, cVar);
        multicaster$flow$1$invokeSuspend$$inlined$transform$1.f26523b = obj;
        return multicaster$flow$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((Multicaster$flow$1$invokeSuspend$$inlined$transform$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26524c;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f26523b;
            e eVar = this.f26525d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVar);
            this.f26524c = 1;
            if (eVar.a(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
