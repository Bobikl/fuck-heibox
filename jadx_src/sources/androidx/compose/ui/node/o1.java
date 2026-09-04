package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\f*\u00020\u0002H\u0000\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/n1;", androidx.exifinterface.media.a.f23244d5, "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", ak.av, "(Landroid/view/View;ILyh/a;)Landroidx/compose/ui/node/n1;", "", "key", "d", "Landroidx/compose/ui/node/n0;", ak.aF, "b", "I", "viewAdaptersKey", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f15354a = d("ViewAdapter");

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends n1> T a(@dl.d View view, int i10, @dl.d yh.a<? extends T> factory) {
        n1 n1Var;
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(factory, "factory");
        n0 n0VarB = b(view);
        List<n1> listE = n0VarB.e();
        int size = listE.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                n1Var = null;
                break;
            }
            n1Var = listE.get(i11);
            if (n1Var.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = n1Var instanceof n1 ? (T) n1Var : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        n0VarB.e().add(tInvoke);
        return tInvoke;
    }

    @dl.d
    public static final n0 b(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        int i10 = f15354a;
        Object tag = view.getTag(i10);
        n0 n0Var = tag instanceof n0 ? (n0) tag : null;
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0();
        view.setTag(i10, n0Var2);
        return n0Var2;
    }

    @dl.e
    public static final n0 c(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        Object tag = view.getTag(f15354a);
        if (tag instanceof n0) {
            return (n0) tag;
        }
        return null;
    }

    public static final int d(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return key.hashCode() | 50331648;
    }
}
