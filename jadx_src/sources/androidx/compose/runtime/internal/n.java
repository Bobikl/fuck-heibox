package androidx.compose.runtime.internal;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.o0;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LiveLiteral.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001a\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007\"@\u0010\u000f\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u000bj\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u000e\"*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlin/b2;", ak.av, androidx.exifinterface.media.a.f23244d5, "", "key", "value", "Landroidx/compose/runtime/m2;", "d", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/m2;", "", "e", "Ljava/util/HashMap;", "Landroidx/compose/runtime/a1;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "liveLiteralCache", "", "<set-?>", "b", "Z", "()Z", "isLiveLiteralsEnabled$annotations", "()V", "isLiveLiteralsEnabled", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, a1<Object>> f13010a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f13011b;

    @o0
    public static final void a() {
        f13011b = true;
    }

    public static final boolean b() {
        return f13011b;
    }

    @o0
    @androidx.compose.runtime.m
    public static /* synthetic */ void c() {
    }

    @o0
    @dl.d
    @androidx.compose.runtime.m
    public static final <T> m2<T> d(@dl.d String key, T t10) {
        f0.p(key, "key");
        HashMap<String, a1<Object>> map = f13010a;
        a1<Object> a1VarG = map.get(key);
        if (a1VarG == null) {
            a1VarG = h2.g(t10, null, 2, null);
            map.put(key, a1VarG);
        }
        f0.n(a1VarG, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return a1VarG;
    }

    @o0
    public static final void e(@dl.d String key, @dl.e Object obj) {
        boolean z10;
        f0.p(key, "key");
        HashMap<String, a1<Object>> map = f13010a;
        a1<Object> a1Var = map.get(key);
        if (a1Var == null) {
            a1<Object> a1VarG = h2.g(obj, null, 2, null);
            map.put(key, a1VarG);
            z10 = false;
            a1Var = a1VarG;
        } else {
            z10 = true;
        }
        a1<Object> a1Var2 = a1Var;
        if (z10) {
            a1Var2.setValue(obj);
        }
    }
}
