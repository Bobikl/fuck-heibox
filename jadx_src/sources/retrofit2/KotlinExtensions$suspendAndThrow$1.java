package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/c;", "", "continuation", "", "suspendAndThrow"}, k = 3, mv = {1, 4, 0})
@kotlin.coroutines.jvm.internal.d(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f138905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f138906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f138907d;

    KotlinExtensions$suspendAndThrow$1(kotlin.coroutines.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f138905b = obj;
        this.f138906c |= Integer.MIN_VALUE;
        return KotlinExtensions.e(null, this);
    }
}
