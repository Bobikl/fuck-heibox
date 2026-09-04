package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129303d;

    FlowKt__CollectionKt$toCollection$1(kotlin.coroutines.c<? super FlowKt__CollectionKt$toCollection$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129302c = obj;
        this.f129303d |= Integer.MIN_VALUE;
        return g.V1(null, null, this);
    }
}
