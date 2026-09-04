package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: WhileSelect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
public final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f130416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f130417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f130418d;

    WhileSelectKt$whileSelect$1(kotlin.coroutines.c<? super WhileSelectKt$whileSelect$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f130417c = obj;
        this.f130418d |= Integer.MIN_VALUE;
        return WhileSelectKt.a(null, this);
    }
}
