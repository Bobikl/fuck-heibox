package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes6.dex */
public class o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f23762e = "FragmentManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f23763a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, m0> f23764b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f23765c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h0 f23766d;

    o0() {
    }

    @androidx.annotation.p0
    ArrayList<String> A() {
        synchronized (this.f23763a) {
            if (this.f23763a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f23763a.size());
            for (Fragment fragment : this.f23763a) {
                arrayList.add(fragment.mWho);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    void B(@androidx.annotation.n0 h0 h0Var) {
        this.f23766d = h0Var;
    }

    @androidx.annotation.p0
    Bundle C(@androidx.annotation.n0 String str, @androidx.annotation.p0 Bundle bundle) {
        return bundle != null ? this.f23765c.put(str, bundle) : this.f23765c.remove(str);
    }

    void a(@androidx.annotation.n0 Fragment fragment) {
        if (this.f23763a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f23763a) {
            this.f23763a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f23764b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@androidx.annotation.n0 String str) {
        return this.f23764b.get(str) != null;
    }

    void d(int i10) {
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                m0Var.t(i10);
            }
        }
    }

    void e(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f23764b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : this.f23764b.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    Fragment fragmentK = m0Var.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f23763a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f23763a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @androidx.annotation.p0
    Fragment f(@androidx.annotation.n0 String str) {
        m0 m0Var = this.f23764b.get(str);
        if (m0Var != null) {
            return m0Var.k();
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment g(@androidx.annotation.d0 int i10) {
        for (int size = this.f23763a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f23763a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment h(@androidx.annotation.p0 String str) {
        if (str != null) {
            for (int size = this.f23763a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f23763a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment i(@androidx.annotation.n0 String str) {
        Fragment fragmentFindFragmentByWho;
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null && (fragmentFindFragmentByWho = m0Var.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(@androidx.annotation.n0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f23763a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f23763a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f23763a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f23763a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f23764b.size();
    }

    @androidx.annotation.n0
    List<m0> l() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    @androidx.annotation.n0
    List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @androidx.annotation.n0
    HashMap<String, Bundle> n() {
        return this.f23765c;
    }

    @androidx.annotation.p0
    m0 o(@androidx.annotation.n0 String str) {
        return this.f23764b.get(str);
    }

    @androidx.annotation.n0
    List<Fragment> p() {
        ArrayList arrayList;
        if (this.f23763a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f23763a) {
            arrayList = new ArrayList(this.f23763a);
        }
        return arrayList;
    }

    h0 q() {
        return this.f23766d;
    }

    @androidx.annotation.p0
    Bundle r(@androidx.annotation.n0 String str) {
        return this.f23765c.get(str);
    }

    void s(@androidx.annotation.n0 m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f23764b.put(fragmentK.mWho, m0Var);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f23766d.c(fragmentK);
            } else {
                this.f23766d.r(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void t(@androidx.annotation.n0 m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (fragmentK.mRetainInstance) {
            this.f23766d.r(fragmentK);
        }
        if (this.f23764b.get(fragmentK.mWho) == m0Var && this.f23764b.put(fragmentK.mWho, null) != null && FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void u() {
        Iterator<Fragment> it = this.f23763a.iterator();
        while (it.hasNext()) {
            m0 m0Var = this.f23764b.get(it.next().mWho);
            if (m0Var != null) {
                m0Var.m();
            }
        }
        for (m0 m0Var2 : this.f23764b.values()) {
            if (m0Var2 != null) {
                m0Var2.m();
                Fragment fragmentK = m0Var2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f23765c.containsKey(fragmentK.mWho)) {
                        C(fragmentK.mWho, m0Var2.r());
                    }
                    t(m0Var2);
                }
            }
        }
    }

    void v(@androidx.annotation.n0 Fragment fragment) {
        synchronized (this.f23763a) {
            this.f23763a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void w() {
        this.f23764b.clear();
    }

    void x(@androidx.annotation.p0 List<String> list) {
        this.f23763a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void y(@androidx.annotation.n0 HashMap<String, Bundle> map) {
        this.f23765c.clear();
        this.f23765c.putAll(map);
    }

    @androidx.annotation.n0
    ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f23764b.size());
        for (m0 m0Var : this.f23764b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                C(fragmentK.mWho, m0Var.r());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
