package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a6\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a:\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020\u001aH\u0080\u0010\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "e", "addedContext", "d", "", ak.aF, "originalContext", "appendContext", "isNewCoroutine", ak.av, androidx.exifinterface.media.a.f23244d5, "", "countOrElement", "Lkotlin/Function0;", "block", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lyh/a;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", "continuation", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;Ljava/lang/Object;Lyh/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/o3;", "g", "Lkotlin/coroutines/jvm/internal/c;", "f", "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class CoroutineContextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f128676a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zC = c(coroutineContext);
        boolean zC2 = c(coroutineContext2);
        if (!zC && !zC2) {
            return coroutineContext.I(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f124694b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.g(emptyCoroutineContext, new yh.p<CoroutineContext, CoroutineContext.a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext invoke(@dl.d CoroutineContext coroutineContext4, @dl.d CoroutineContext.a aVar) {
                if (!(aVar instanceof j0)) {
                    return coroutineContext4.I(aVar);
                }
                CoroutineContext.a aVarF = objectRef.f124891b.f(aVar.getKey());
                if (aVarF != null) {
                    Ref.ObjectRef<CoroutineContext> objectRef2 = objectRef;
                    objectRef2.f124891b = objectRef2.f124891b.d(aVar.getKey());
                    return coroutineContext4.I(((j0) aVar).n(aVarF));
                }
                j0 j0VarT = (j0) aVar;
                if (z10) {
                    j0VarT = j0VarT.t();
                }
                return coroutineContext4.I(j0VarT);
            }
        });
        if (zC2) {
            objectRef.f124891b = ((CoroutineContext) objectRef.f124891b).g(emptyCoroutineContext, new yh.p<CoroutineContext, CoroutineContext.a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineContext invoke(@dl.d CoroutineContext coroutineContext4, @dl.d CoroutineContext.a aVar) {
                    return aVar instanceof j0 ? coroutineContext4.I(((j0) aVar).t()) : coroutineContext4.I(aVar);
                }
            });
        }
        return coroutineContext3.I((CoroutineContext) objectRef.f124891b);
    }

    @dl.e
    public static final String b(@dl.d CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.g(Boolean.FALSE, new yh.p<Boolean, CoroutineContext.a, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @dl.d
            public final Boolean a(boolean z10, @dl.d CoroutineContext.a aVar) {
                return Boolean.valueOf(z10 || (aVar instanceof j0));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.a aVar) {
                return a(bool.booleanValue(), aVar);
            }
        })).booleanValue();
    }

    @dl.d
    @z1
    public static final CoroutineContext d(@dl.d CoroutineContext coroutineContext, @dl.d CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.I(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @dl.d
    @t1
    public static final CoroutineContext e(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(q0Var.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextA == e1.a() || coroutineContextA.f(kotlin.coroutines.d.f124698w1) != null) ? coroutineContextA : coroutineContextA.I(e1.a());
    }

    @dl.e
    public static final o3<?> f(@dl.d kotlin.coroutines.jvm.internal.c cVar) {
        while (!(cVar instanceof a1) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof o3) {
                return (o3) cVar;
            }
        }
        return null;
    }

    @dl.e
    public static final o3<?> g(@dl.d kotlin.coroutines.c<?> cVar, @dl.d CoroutineContext coroutineContext, @dl.e Object obj) {
        if (!(cVar instanceof kotlin.coroutines.jvm.internal.c)) {
            return null;
        }
        if (!(coroutineContext.f(p3.f130299b) != null)) {
            return null;
        }
        o3<?> o3VarF = f((kotlin.coroutines.jvm.internal.c) cVar);
        if (o3VarF != null) {
            o3VarF.M1(coroutineContext, obj);
        }
        return o3VarF;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[DONT_GENERATE] */
    public static final <T> T h(@dl.d kotlin.coroutines.c<?> cVar, @dl.e Object obj, @dl.d yh.a<? extends T> aVar) {
        CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
        Object objC = ThreadContextKt.c(context, obj);
        o3<?> o3VarG = objC != ThreadContextKt.f130141a ? g(cVar, context, objC) : null;
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            if (o3VarG == null || o3VarG.L1()) {
                ThreadContextKt.a(context, objC);
            }
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final <T> T i(@dl.d CoroutineContext coroutineContext, @dl.e Object obj, @dl.d yh.a<? extends T> aVar) {
        Object objC = ThreadContextKt.c(coroutineContext, obj);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            ThreadContextKt.a(coroutineContext, objC);
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
