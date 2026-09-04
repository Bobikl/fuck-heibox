package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/node/n1;", androidx.exifinterface.media.a.f23244d5, "", "id", "Lkotlin/Function0;", "factory", "d", "(ILyh/a;)Landroidx/compose/ui/node/n1;", "Landroid/view/View;", sd.b.f139384b, "Landroid/view/ViewGroup;", "parent", "Lkotlin/b2;", ak.av, ak.aF, "b", "I", "getId", "()I", "", "Ljava/util/List;", "e", "()Ljava/util/List;", "adapters", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class n0 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<n1> adapters = new ArrayList();

    @Override // androidx.compose.ui.node.n1
    public void a(@dl.d View view, @dl.d ViewGroup parent) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(parent, "parent");
        List<n1> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.n1
    public void b(@dl.d View view, @dl.d ViewGroup parent) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(parent, "parent");
        List<n1> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.n1
    public void c(@dl.d View view, @dl.d ViewGroup parent) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(parent, "parent");
        List<n1> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(view, parent);
        }
    }

    @dl.d
    public final <T extends n1> T d(int id2, @dl.d yh.a<? extends T> factory) {
        n1 n1Var;
        kotlin.jvm.internal.f0.p(factory, "factory");
        List<n1> listE = e();
        int size = listE.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                n1Var = null;
                break;
            }
            n1Var = listE.get(i10);
            if (n1Var.getId() == id2) {
                break;
            }
            i10++;
        }
        T t10 = n1Var instanceof n1 ? (T) n1Var : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        e().add(tInvoke);
        return tInvoke;
    }

    @dl.d
    public final List<n1> e() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.n1
    public int getId() {
        return this.id;
    }
}
