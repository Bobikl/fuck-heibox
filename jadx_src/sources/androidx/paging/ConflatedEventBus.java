package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConflatedEventBus.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/paging/ConflatedEventBus;", "", androidx.exifinterface.media.a.f23244d5, "data", "Lkotlin/b2;", "b", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/j;", "Lkotlin/Pair;", "", ak.av, "Lkotlinx/coroutines/flow/j;", "state", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/e;", "()Lkotlinx/coroutines/flow/e;", "flow", "initialValue", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class ConflatedEventBus<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.flow.j<Pair<Integer, T>> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<T> flow;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConflatedEventBus() {
        kotlin.jvm.internal.u uVar = null;
        this(uVar, 1, uVar);
    }

    public ConflatedEventBus(@dl.e T t10) {
        final kotlinx.coroutines.flow.j<Pair<Integer, T>> jVarA = kotlinx.coroutines.flow.v.a(new Pair(Integer.MIN_VALUE, t10));
        this.state = jVarA;
        this.flow = new kotlinx.coroutines.flow.e<T>() { // from class: androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<Pair<? extends Integer, ? extends T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f25464b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ConflatedEventBus$$special$$inlined$mapNotNull$1 f25465c;

                /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f25466b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f25467c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f25468d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f25466b = obj;
                        this.f25467c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, ConflatedEventBus$$special$$inlined$mapNotNull$1 conflatedEventBus$$special$$inlined$mapNotNull$1) {
                    this.f25464b = fVar;
                    this.f25465c = conflatedEventBus$$special$$inlined$mapNotNull$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f25467c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f25467c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f25466b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f25467c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        kotlinx.coroutines.flow.f fVar = this.f25464b;
                        Object objF = ((Pair) obj).f();
                        if (objF == null) {
                            return b2.f124493a;
                        }
                        anonymousClass1.f25467c = 1;
                        if (fVar.emit(objF, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = jVarA.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    public /* synthetic */ ConflatedEventBus(Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : obj);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<T> a() {
        return this.flow;
    }

    public final void b(@dl.d T data) {
        kotlin.jvm.internal.f0.p(data, "data");
        kotlinx.coroutines.flow.j<Pair<Integer, T>> jVar = this.state;
        jVar.setValue(new Pair<>(Integer.valueOf(jVar.getValue().e().intValue() + 1), data));
    }
}
