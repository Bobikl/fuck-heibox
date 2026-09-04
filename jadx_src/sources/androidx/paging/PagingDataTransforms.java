package androidx.paging;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PagingDataTransforms.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "PagingDataTransforms")
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ai\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\b\u0004\u0010\u0007\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001aH\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0007\u001a`\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\t\u001aN\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\rH\u0007\u001aP\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\rH\u0007\u001ap\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162.\u0010\u0019\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a^\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00028\u0000H\u0007¢\u0006\u0004\b \u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "R", "Landroidx/paging/o0;", "Lkotlin/Function2;", "Landroidx/paging/PageEvent;", "Lkotlin/coroutines/c;", "transform", "r", "(Landroidx/paging/o0;Lyh/p;)Landroidx/paging/o0;", "q", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function1;", "p", "", "d", ak.aF, "", "predicate", "b", ak.av, "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", "Lkotlin/Function3;", "generator", "l", "(Landroidx/paging/o0;Landroidx/paging/TerminalSeparatorType;Lyh/q;)Landroidx/paging/o0;", "k", ChannelListActivity.q.f79586f, RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/paging/o0;Landroidx/paging/TerminalSeparatorType;Ljava/lang/Object;)Landroidx/paging/o0;", "e", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class PagingDataTransforms {
    @dl.d
    @xh.h(name = "filter")
    @androidx.annotation.j
    public static final <T> o0<T> a(@dl.d o0<T> filter, @dl.d Executor executor, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(filter, "$this$filter");
        kotlin.jvm.internal.f0.p(executor, "executor");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        return new o0<>(new PagingDataTransforms$filter$$inlined$transform$2(filter.e(), executor, predicate), filter.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @androidx.annotation.j
    public static final /* synthetic */ <T> o0<T> b(o0<T> filter, final yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> predicate) {
        kotlin.jvm.internal.f0.p(filter, "$this$filter");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        final kotlinx.coroutines.flow.e<PageEvent<T>> eVarE = filter.e();
        return new o0<>(new kotlinx.coroutines.flow.e<PageEvent<T>>() { // from class: androidx.paging.PagingDataTransforms$filter$$inlined$transform$1

            /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$filter$$inlined$transform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "androidx/paging/PagingDataTransforms$transform$$inlined$map$6$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<PageEvent<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f26046b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PagingDataTransforms$filter$$inlined$transform$1 f26047c;

                /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$filter$$inlined$transform$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "androidx/paging/PagingDataTransforms$transform$$inlined$map$6$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {136, 136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26048b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f26049c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f26050d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f26048b = obj;
                        this.f26049c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, PagingDataTransforms$filter$$inlined$transform$1 pagingDataTransforms$filter$$inlined$transform$1) {
                    this.f26046b = fVar;
                    this.f26047c = pagingDataTransforms$filter$$inlined$transform$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f26049c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26049c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f26048b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f26049c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) anonymousClass1.f26050d;
                            kotlin.t0.n(obj2);
                            fVar = fVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                    kotlin.t0.n(obj2);
                    kotlinx.coroutines.flow.f fVar3 = this.f26046b;
                    yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar = predicate;
                    anonymousClass1.f26050d = fVar3;
                    anonymousClass1.f26049c = 1;
                    Object objA = ((PageEvent) obj).a(pVar, anonymousClass1);
                    if (objA == objH) {
                        return objH;
                    }
                    obj2 = objA;
                    fVar = fVar3;
                    anonymousClass1.f26050d = null;
                    anonymousClass1.f26049c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarE.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, filter.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @dl.d
    @androidx.annotation.j
    public static final <T, R> o0<R> c(@dl.d o0<T> flatMap, @dl.d Executor executor, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(flatMap, "$this$flatMap");
        kotlin.jvm.internal.f0.p(executor, "executor");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return new o0<>(new PagingDataTransforms$flatMap$$inlined$transform$2(flatMap.e(), executor, transform), flatMap.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @androidx.annotation.j
    public static final /* synthetic */ <T, R> o0<R> d(o0<T> flatMap, final yh.p<? super T, ? super kotlin.coroutines.c<? super Iterable<? extends R>>, ? extends Object> transform) {
        kotlin.jvm.internal.f0.p(flatMap, "$this$flatMap");
        kotlin.jvm.internal.f0.p(transform, "transform");
        final kotlinx.coroutines.flow.e<PageEvent<T>> eVarE = flatMap.e();
        return new o0<>(new kotlinx.coroutines.flow.e<PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$1

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "androidx/paging/PagingDataTransforms$transform$$inlined$map$4$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f<PageEvent<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f26069b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PagingDataTransforms$flatMap$$inlined$transform$1 f26070c;

                /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "androidx/paging/PagingDataTransforms$transform$$inlined$map$4$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {136, 136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26071b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f26072c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f26073d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f26071b = obj;
                        this.f26072c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, PagingDataTransforms$flatMap$$inlined$transform$1 pagingDataTransforms$flatMap$$inlined$transform$1) {
                    this.f26069b = fVar;
                    this.f26070c = pagingDataTransforms$flatMap$$inlined$transform$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f26072c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26072c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f26071b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f26072c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) anonymousClass1.f26073d;
                            kotlin.t0.n(obj2);
                            fVar = fVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                    kotlin.t0.n(obj2);
                    kotlinx.coroutines.flow.f fVar3 = this.f26069b;
                    yh.p<? super T, ? super kotlin.coroutines.c<? super Iterable<? extends R>>, ? extends Object> pVar = transform;
                    anonymousClass1.f26073d = fVar3;
                    anonymousClass1.f26072c = 1;
                    Object objC = ((PageEvent) obj).c(pVar, anonymousClass1);
                    if (objC == objH) {
                        return objH;
                    }
                    obj2 = objC;
                    fVar = fVar3;
                    anonymousClass1.f26073d = null;
                    anonymousClass1.f26072c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarE.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, flatMap.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <T> o0<T> e(@dl.d o0<T> insertFooterItem, @dl.d TerminalSeparatorType terminalSeparatorType, @dl.d T item) {
        kotlin.jvm.internal.f0.p(insertFooterItem, "$this$insertFooterItem");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(item, "item");
        return l(insertFooterItem, terminalSeparatorType, new PagingDataTransforms$insertFooterItem$1(item, null));
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <T> o0<T> f(@dl.d o0<T> o0Var, @dl.d T t10) {
        return g(o0Var, null, t10, 1, null);
    }

    public static /* synthetic */ o0 g(o0 o0Var, TerminalSeparatorType terminalSeparatorType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return e(o0Var, terminalSeparatorType, obj);
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <T> o0<T> h(@dl.d o0<T> insertHeaderItem, @dl.d TerminalSeparatorType terminalSeparatorType, @dl.d T item) {
        kotlin.jvm.internal.f0.p(insertHeaderItem, "$this$insertHeaderItem");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(item, "item");
        return l(insertHeaderItem, terminalSeparatorType, new PagingDataTransforms$insertHeaderItem$1(item, null));
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <T> o0<T> i(@dl.d o0<T> o0Var, @dl.d T t10) {
        return j(o0Var, null, t10, 1, null);
    }

    public static /* synthetic */ o0 j(o0 o0Var, TerminalSeparatorType terminalSeparatorType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return h(o0Var, terminalSeparatorType, obj);
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <R, T extends R> o0<R> k(@dl.d o0<T> insertSeparators, @dl.d TerminalSeparatorType terminalSeparatorType, @dl.d Executor executor, @dl.d yh.p<? super T, ? super T, ? extends R> generator) {
        kotlin.jvm.internal.f0.p(insertSeparators, "$this$insertSeparators");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(executor, "executor");
        kotlin.jvm.internal.f0.p(generator, "generator");
        return l(insertSeparators, terminalSeparatorType, new PagingDataTransforms$insertSeparators$1(executor, generator, null));
    }

    @androidx.annotation.j
    public static final /* synthetic */ <T extends R, R> o0<R> l(o0<T> insertSeparators, TerminalSeparatorType terminalSeparatorType, yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> generator) {
        kotlin.jvm.internal.f0.p(insertSeparators, "$this$insertSeparators");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(generator, "generator");
        return new o0<>(SeparatorsKt.c(insertSeparators.e(), terminalSeparatorType, generator), insertSeparators.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @dl.d
    @androidx.annotation.j
    @xh.i
    public static final <R, T extends R> o0<R> m(@dl.d o0<T> o0Var, @dl.d Executor executor, @dl.d yh.p<? super T, ? super T, ? extends R> pVar) {
        return n(o0Var, null, executor, pVar, 1, null);
    }

    public static /* synthetic */ o0 n(o0 o0Var, TerminalSeparatorType terminalSeparatorType, Executor executor, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return k(o0Var, terminalSeparatorType, executor, pVar);
    }

    public static /* synthetic */ o0 o(o0 o0Var, TerminalSeparatorType terminalSeparatorType, yh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return l(o0Var, terminalSeparatorType, qVar);
    }

    @dl.d
    @androidx.annotation.j
    public static final <T, R> o0<R> p(@dl.d o0<T> map, @dl.d Executor executor, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(map, "$this$map");
        kotlin.jvm.internal.f0.p(executor, "executor");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return new o0<>(new PagingDataTransforms$map$$inlined$transform$2(map.e(), executor, transform), map.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @androidx.annotation.j
    public static final /* synthetic */ <T, R> o0<R> q(o0<T> map, final yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> transform) {
        kotlin.jvm.internal.f0.p(map, "$this$map");
        kotlin.jvm.internal.f0.p(transform, "transform");
        final kotlinx.coroutines.flow.e<PageEvent<T>> eVarE = map.e();
        return new o0<>(new kotlinx.coroutines.flow.e<PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms$map$$inlined$transform$1

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "androidx/paging/PagingDataTransforms$transform$$inlined$map$2$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f<PageEvent<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f26107b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PagingDataTransforms$map$$inlined$transform$1 f26108c;

                /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "androidx/paging/PagingDataTransforms$transform$$inlined$map$2$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {136, 136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26109b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f26110c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f26111d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f26109b = obj;
                        this.f26110c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, PagingDataTransforms$map$$inlined$transform$1 pagingDataTransforms$map$$inlined$transform$1) {
                    this.f26107b = fVar;
                    this.f26108c = pagingDataTransforms$map$$inlined$transform$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f26110c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26110c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f26109b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f26110c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) anonymousClass1.f26111d;
                            kotlin.t0.n(obj2);
                            fVar = fVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                    kotlin.t0.n(obj2);
                    kotlinx.coroutines.flow.f fVar3 = this.f26107b;
                    yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar = transform;
                    anonymousClass1.f26111d = fVar3;
                    anonymousClass1.f26110c = 1;
                    Object objE = ((PageEvent) obj).e(pVar, anonymousClass1);
                    if (objE == objH) {
                        return objH;
                    }
                    obj2 = objE;
                    fVar = fVar3;
                    anonymousClass1.f26111d = null;
                    anonymousClass1.f26110c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarE.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, map.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    private static final <T, R> o0<R> r(o0<T> o0Var, yh.p<? super PageEvent<T>, ? super kotlin.coroutines.c<? super PageEvent<R>>, ? extends Object> pVar) {
        return new o0<>(new PagingDataTransforms$transform$$inlined$map$1(o0Var.e(), pVar), o0Var.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }
}
