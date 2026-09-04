package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends androidx.lifecycle.w0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f23712i = "FragmentManager";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final androidx.lifecycle.y0.b f23713j = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23717e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, Fragment> f23714b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, h0> f23715c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.b1> f23716d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23718f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23719g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23720h = false;

    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    public class a implements androidx.lifecycle.y0.b {
        a() {
        }

        @Override // androidx.lifecycle.y0.b
        @androidx.annotation.n0
        public <T extends androidx.lifecycle.w0> T a(@androidx.annotation.n0 Class<T> cls) {
            return new h0(true);
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ androidx.lifecycle.w0 b(Class cls, u2.a aVar) {
            return androidx.lifecycle.z0.b(this, cls, aVar);
        }
    }

    h0(boolean z10) {
        this.f23717e = z10;
    }

    private void g(@androidx.annotation.n0 String str, boolean z10) {
        h0 h0Var = this.f23715c.get(str);
        if (h0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(h0Var.f23715c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h0Var.f((String) it.next(), true);
                }
            }
            h0Var.onCleared();
            this.f23715c.remove(str);
        }
        androidx.lifecycle.b1 b1Var = this.f23716d.get(str);
        if (b1Var != null) {
            b1Var.a();
            this.f23716d.remove(str);
        }
    }

    @androidx.annotation.n0
    static h0 k(androidx.lifecycle.b1 b1Var) {
        return (h0) new androidx.lifecycle.y0(b1Var, f23713j).a(h0.class);
    }

    void c(@androidx.annotation.n0 Fragment fragment) {
        if (this.f23720h) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f23714b.containsKey(fragment.mWho)) {
                return;
            }
            this.f23714b.put(fragment.mWho, fragment);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void e(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        g(fragment.mWho, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f23714b.equals(h0Var.f23714b) && this.f23715c.equals(h0Var.f23715c) && this.f23716d.equals(h0Var.f23716d);
    }

    void f(@androidx.annotation.n0 String str, boolean z10) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z10);
    }

    @androidx.annotation.p0
    Fragment h(String str) {
        return this.f23714b.get(str);
    }

    public int hashCode() {
        return (((this.f23714b.hashCode() * 31) + this.f23715c.hashCode()) * 31) + this.f23716d.hashCode();
    }

    @androidx.annotation.n0
    h0 i(@androidx.annotation.n0 Fragment fragment) {
        h0 h0Var = this.f23715c.get(fragment.mWho);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f23717e);
        this.f23715c.put(fragment.mWho, h0Var2);
        return h0Var2;
    }

    @androidx.annotation.n0
    Collection<Fragment> m() {
        return new ArrayList(this.f23714b.values());
    }

    @androidx.annotation.p0
    @Deprecated
    g0 n() {
        if (this.f23714b.isEmpty() && this.f23715c.isEmpty() && this.f23716d.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, h0> entry : this.f23715c.entrySet()) {
            g0 g0VarN = entry.getValue().n();
            if (g0VarN != null) {
                map.put(entry.getKey(), g0VarN);
            }
        }
        this.f23719g = true;
        if (this.f23714b.isEmpty() && map.isEmpty() && this.f23716d.isEmpty()) {
            return null;
        }
        return new g0(new ArrayList(this.f23714b.values()), map, new HashMap(this.f23716d));
    }

    @androidx.annotation.n0
    androidx.lifecycle.b1 o(@androidx.annotation.n0 Fragment fragment) {
        androidx.lifecycle.b1 b1Var = this.f23716d.get(fragment.mWho);
        if (b1Var != null) {
            return b1Var;
        }
        androidx.lifecycle.b1 b1Var2 = new androidx.lifecycle.b1();
        this.f23716d.put(fragment.mWho, b1Var2);
        return b1Var2;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f23718f = true;
    }

    boolean p() {
        return this.f23718f;
    }

    void r(@androidx.annotation.n0 Fragment fragment) {
        if (this.f23720h) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f23714b.remove(fragment.mWho) != null) && FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Deprecated
    void s(@androidx.annotation.p0 g0 g0Var) {
        this.f23714b.clear();
        this.f23715c.clear();
        this.f23716d.clear();
        if (g0Var != null) {
            Collection<Fragment> collectionB = g0Var.b();
            if (collectionB != null) {
                for (Fragment fragment : collectionB) {
                    if (fragment != null) {
                        this.f23714b.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, g0> mapA = g0Var.a();
            if (mapA != null) {
                for (Map.Entry<String, g0> entry : mapA.entrySet()) {
                    h0 h0Var = new h0(this.f23717e);
                    h0Var.s(entry.getValue());
                    this.f23715c.put(entry.getKey(), h0Var);
                }
            }
            Map<String, androidx.lifecycle.b1> mapC = g0Var.c();
            if (mapC != null) {
                this.f23716d.putAll(mapC);
            }
        }
        this.f23719g = false;
    }

    void t(boolean z10) {
        this.f23720h = z10;
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f23714b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f23715c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f23716d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    boolean u(@androidx.annotation.n0 Fragment fragment) {
        if (this.f23714b.containsKey(fragment.mWho)) {
            return this.f23717e ? this.f23718f : !this.f23719g;
        }
        return true;
    }
}
