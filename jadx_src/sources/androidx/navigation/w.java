package androidx.navigation;

import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: NavControllerViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends androidx.lifecycle.w0 implements n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final b f25328c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final y0.b f25329d = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, b1> f25330b = new LinkedHashMap();

    /* JADX INFO: compiled from: NavControllerViewModel.kt */
    public static final class a implements y0.b {
        a() {
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends androidx.lifecycle.w0> T a(Class<T> modelClass) {
            kotlin.jvm.internal.f0.p(modelClass, "modelClass");
            return new w();
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ androidx.lifecycle.w0 b(Class cls, u2.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: compiled from: NavControllerViewModel.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,83:1\n374#2:84\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n79#1:84\n*E\n"})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final w a(@dl.d b1 viewModelStore) {
            kotlin.jvm.internal.f0.p(viewModelStore, "viewModelStore");
            return (w) new y0(viewModelStore, w.f25329d, null, 4, null).a(w.class);
        }
    }

    @dl.d
    @xh.m
    public static final w f(@dl.d b1 b1Var) {
        return f25328c.a(b1Var);
    }

    @Override // androidx.navigation.n0
    @dl.d
    public b1 b(@dl.d String backStackEntryId) {
        kotlin.jvm.internal.f0.p(backStackEntryId, "backStackEntryId");
        b1 b1Var = this.f25330b.get(backStackEntryId);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        this.f25330b.put(backStackEntryId, b1Var2);
        return b1Var2;
    }

    public final void e(@dl.d String backStackEntryId) {
        kotlin.jvm.internal.f0.p(backStackEntryId, "backStackEntryId");
        b1 b1VarRemove = this.f25330b.remove(backStackEntryId);
        if (b1VarRemove != null) {
            b1VarRemove.a();
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        Iterator<b1> it = this.f25330b.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f25330b.clear();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.f25330b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
