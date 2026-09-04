package androidx.compose.ui.modifier;

import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c1;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\b\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00000\u0006H\u0007\u001a+\u0010\u000b\u001a\u00020\u00002\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\t\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u000f\u001a\u00020\u000022\u0010\u000e\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\u00060\t\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/modifier/h;", ak.av, androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", "b", "Lkotlin/Pair;", "entry", ak.aF, "", Constants.PARAM_KEYS, "d", "([Landroidx/compose/ui/modifier/c;)Landroidx/compose/ui/modifier/h;", "", "entries", "e", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/h;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @androidx.compose.ui.g
    @dl.d
    public static final h a() {
        return b.f15063b;
    }

    @androidx.compose.ui.g
    @dl.d
    public static final <T> h b(@dl.d c<T> key) {
        f0.p(key, "key");
        return new q(key);
    }

    @androidx.compose.ui.g
    @dl.d
    public static final <T> h c(@dl.d Pair<? extends c<T>, ? extends T> entry) {
        f0.p(entry, "entry");
        q qVar = new q(entry.e());
        qVar.c(entry.e(), entry.f());
        return qVar;
    }

    @androidx.compose.ui.g
    @dl.d
    public static final h d(@dl.d c<?>... keys) {
        f0.p(keys, "keys");
        ArrayList arrayList = new ArrayList(keys.length);
        for (c<?> cVar : keys) {
            arrayList.add(c1.a(cVar, null));
        }
        Object[] array = arrayList.toArray(new Pair[0]);
        f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Pair[] pairArr = (Pair[]) array;
        return new o((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @androidx.compose.ui.g
    @dl.d
    public static final h e(@dl.d Pair<? extends c<?>, ? extends Object>... entries) {
        f0.p(entries, "entries");
        return new o((Pair[]) Arrays.copyOf(entries, entries.length));
    }
}
