package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Separators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aK\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u0017\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001az\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019\"\b\b\u0000\u0010\u0002*\u00028\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "R", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/d1;", "Lkotlin/Function3;", "Lkotlin/coroutines/c;", "generator", "d", "(Landroidx/paging/d1;Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "separator", "", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndex", "e", "(Ljava/lang/Object;[III)Landroidx/paging/d1;", "", "Lkotlin/b2;", "b", "(Ljava/util/List;Ljava/lang/Object;[III)V", "adjacentPageBefore", "adjacentPageAfter", ak.av, "(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/d1;Landroidx/paging/d1;II)V", "Lkotlinx/coroutines/flow/e;", "Landroidx/paging/PageEvent;", "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", ak.aF, "(Lkotlinx/coroutines/flow/e;Landroidx/paging/TerminalSeparatorType;Lyh/q;)Lkotlinx/coroutines/flow/e;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class SeparatorsKt {
    public static final <R, T extends R> void a(@dl.d List<TransformablePage<R>> addSeparatorPage, @dl.e R r10, @dl.e TransformablePage<T> transformablePage, @dl.e TransformablePage<T> transformablePage2, int i10, int i11) {
        kotlin.jvm.internal.f0.p(addSeparatorPage, "$this$addSeparatorPage");
        int[] iArrK = transformablePage != null ? transformablePage.k() : null;
        int[] iArrK2 = transformablePage2 != null ? transformablePage2.k() : null;
        if (iArrK != null && iArrK2 != null) {
            iArrK = CollectionsKt___CollectionsKt.P5(CollectionsKt___CollectionsKt.l5(ArraysKt___ArraysKt.s9(kotlin.collections.m.T3(iArrK, iArrK2))));
        } else if (iArrK == null && iArrK2 != null) {
            iArrK = iArrK2;
        } else if (iArrK == null || iArrK2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        b(addSeparatorPage, r10, iArrK, i10, i11);
    }

    public static final <T> void b(@dl.d List<TransformablePage<T>> addSeparatorPage, @dl.e T t10, @dl.d int[] originalPageOffsets, int i10, int i11) {
        kotlin.jvm.internal.f0.p(addSeparatorPage, "$this$addSeparatorPage");
        kotlin.jvm.internal.f0.p(originalPageOffsets, "originalPageOffsets");
        if (t10 == null) {
            return;
        }
        addSeparatorPage.add(e(t10, originalPageOffsets, i10, i11));
    }

    @dl.d
    public static final <T extends R, R> kotlinx.coroutines.flow.e<PageEvent<R>> c(@dl.d final kotlinx.coroutines.flow.e<? extends PageEvent<T>> insertEventSeparators, @dl.d TerminalSeparatorType terminalSeparatorType, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> generator) {
        kotlin.jvm.internal.f0.p(insertEventSeparators, "$this$insertEventSeparators");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(generator, "generator");
        final SeparatorState separatorState = new SeparatorState(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(generator, null));
        return new kotlinx.coroutines.flow.e<PageEvent<R>>() { // from class: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* JADX INFO: renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f<PageEvent<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f26275b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ SeparatorsKt$insertEventSeparators$$inlined$map$1 f26276c;

                /* JADX INFO: renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", i = {}, l = {135, 135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26277b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f26278c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f26279d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f26277b = obj;
                        this.f26278c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, SeparatorsKt$insertEventSeparators$$inlined$map$1 separatorsKt$insertEventSeparators$$inlined$map$1) {
                    this.f26275b = fVar;
                    this.f26276c = separatorsKt$insertEventSeparators$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f26278c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26278c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f26277b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f26278c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) anonymousClass1.f26279d;
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
                    kotlinx.coroutines.flow.f fVar3 = this.f26275b;
                    SeparatorState separatorState = separatorState;
                    anonymousClass1.f26279d = fVar3;
                    anonymousClass1.f26278c = 1;
                    Object objM = separatorState.m((PageEvent) obj, anonymousClass1);
                    if (objM == objH) {
                        return objH;
                    }
                    obj2 = objM;
                    fVar = fVar3;
                    anonymousClass1.f26279d = null;
                    anonymousClass1.f26278c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = insertEventSeparators.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d0 -> B:29:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final <R, T extends R> java.lang.Object d(@dl.d androidx.paging.TransformablePage<T> r11, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> r12, @dl.d kotlin.coroutines.c<? super androidx.paging.TransformablePage<R>> r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.d(androidx.paging.d1, yh.q, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    public static final <T> TransformablePage<T> e(@dl.d T separator, @dl.d int[] originalPageOffsets, int i10, int i11) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(originalPageOffsets, "originalPageOffsets");
        return new TransformablePage<>(originalPageOffsets, kotlin.collections.s.k(separator), i10, kotlin.collections.s.k(Integer.valueOf(i11)));
    }
}
