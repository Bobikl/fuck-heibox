package androidx.work;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Data.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086\b¨\u0006\f"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroidx/work/e;", "b", "([Lkotlin/Pair;)Landroidx/work/e;", androidx.exifinterface.media.a.f23244d5, "key", "", ak.av, "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    public static final /* synthetic */ <T> boolean a(e eVar, String key) {
        f0.p(eVar, "<this>");
        f0.p(key, "key");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return eVar.C(key, Object.class);
    }

    @dl.d
    public static final e b(@dl.d Pair<String, ? extends Object>... pairs) throws Throwable {
        f0.p(pairs, "pairs");
        e.a aVar = new e.a();
        for (Pair<String, ? extends Object> pair : pairs) {
            aVar.b(pair.e(), pair.f());
        }
        e eVarA = aVar.a();
        f0.o(eVarA, "dataBuilder.build()");
        return eVarA;
    }
}
