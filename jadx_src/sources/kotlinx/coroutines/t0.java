package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlin/coroutines/c;", "", ak.aF, "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", ak.av, "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class t0 {
    @dl.d
    public static final String a(@dl.d Object obj) {
        return obj.getClass().getSimpleName();
    }

    @dl.d
    public static final String b(@dl.d Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @dl.d
    public static final String c(@dl.d kotlin.coroutines.c<?> cVar) {
        Object objB;
        if (cVar instanceof kotlinx.coroutines.internal.l) {
            return cVar.toString();
        }
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        if (Result.e(objB) != null) {
            objB = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) objB;
    }
}
