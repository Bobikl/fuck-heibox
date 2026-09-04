package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends p0 implements FragmentManager.j, FragmentManager.p {
    private static final String R = "FragmentManager";
    final FragmentManager N;
    boolean O;
    int P;
    boolean Q;

    a(@androidx.annotation.n0 FragmentManager fragmentManager) {
        super(fragmentManager.H0(), fragmentManager.K0() != null ? fragmentManager.K0().f().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    a(@androidx.annotation.n0 a aVar) {
        super(aVar.N.H0(), aVar.N.K0() != null ? aVar.N.K0().f().getClassLoader() : null, aVar);
        this.P = -1;
        this.Q = false;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 K(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Lifecycle.State state) {
        if (fragment.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.K(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 L(@androidx.annotation.p0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.N) {
            return super.L(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 P(@androidx.annotation.n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.P(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void Q(int i10) {
        if (this.f23789i) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f23783c.size();
            for (int i11 = 0; i11 < size; i11++) {
                p0.a aVar = this.f23783c.get(i11);
                Fragment fragment = aVar.f23801b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f23801b + " to " + aVar.f23801b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void R() {
        int size = this.f23783c.size() - 1;
        while (size >= 0) {
            p0.a aVar = this.f23783c.get(size);
            if (aVar.f23802c) {
                if (aVar.f23800a == 8) {
                    aVar.f23802c = false;
                    this.f23783c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f23801b.mContainerId;
                    aVar.f23800a = 2;
                    aVar.f23802c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        p0.a aVar2 = this.f23783c.get(i11);
                        if (aVar2.f23802c && aVar2.f23801b.mContainerId == i10) {
                            this.f23783c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int S(boolean z10) {
        if (this.O) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
            T("  ", printWriter);
            printWriter.close();
        }
        this.O = true;
        if (this.f23789i) {
            this.P = this.N.r();
        } else {
            this.P = -1;
        }
        this.N.h0(this, z10);
        return this.P;
    }

    public void T(String str, PrintWriter printWriter) {
        U(str, printWriter, true);
    }

    public void U(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f23791k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.f23788h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f23788h));
            }
            if (this.f23784d != 0 || this.f23785e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f23784d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f23785e));
            }
            if (this.f23786f != 0 || this.f23787g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f23786f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f23787g));
            }
            if (this.f23792l != 0 || this.f23793m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f23792l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f23793m);
            }
            if (this.f23794n != 0 || this.f23795o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f23794n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f23795o);
            }
        }
        if (this.f23783c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f23783c.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0.a aVar = this.f23783c.get(i10);
            switch (aVar.f23800a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f23800a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f23801b);
            if (z10) {
                if (aVar.f23803d != 0 || aVar.f23804e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f23803d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f23804e));
                }
                if (aVar.f23805f != 0 || aVar.f23806g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f23805f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f23806g));
                }
            }
        }
    }

    void V() {
        int size = this.f23783c.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0.a aVar = this.f23783c.get(i10);
            Fragment fragment = aVar.f23801b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f23788h);
                fragment.setSharedElementNames(this.f23796p, this.f23797q);
            }
            switch (aVar.f23800a) {
                case 1:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, false);
                    this.N.n(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f23800a);
                case 3:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.D1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.U0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, false);
                    this.N.d2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.E(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, false);
                    this.N.t(fragment);
                    break;
                case 8:
                    this.N.Z1(fragment);
                    break;
                case 9:
                    this.N.Z1(null);
                    break;
                case 10:
                    this.N.Y1(fragment, aVar.f23808i);
                    break;
            }
        }
    }

    void W() {
        for (int size = this.f23783c.size() - 1; size >= 0; size--) {
            p0.a aVar = this.f23783c.get(size);
            Fragment fragment = aVar.f23801b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.P1(this.f23788h));
                fragment.setSharedElementNames(this.f23797q, this.f23796p);
            }
            switch (aVar.f23800a) {
                case 1:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, true);
                    this.N.D1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f23800a);
                case 3:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.d2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, true);
                    this.N.U0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f23803d, aVar.f23804e, aVar.f23805f, aVar.f23806g);
                    this.N.W1(fragment, true);
                    this.N.E(fragment);
                    break;
                case 8:
                    this.N.Z1(null);
                    break;
                case 9:
                    this.N.Z1(fragment);
                    break;
                case 10:
                    this.N.Y1(fragment, aVar.f23807h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    Fragment X(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f23783c.size()) {
            p0.a aVar = this.f23783c.get(i10);
            int i11 = aVar.f23800a;
            if (i11 == 1) {
                arrayList.add(aVar.f23801b);
            } else if (i11 == 2) {
                Fragment fragment3 = aVar.f23801b;
                int i12 = fragment3.mContainerId;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i12) {
                        if (fragment4 == fragment3) {
                            z10 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f23783c.add(i10, new p0.a(9, fragment4, true));
                                i10++;
                                fragment2 = null;
                            }
                            p0.a aVar2 = new p0.a(3, fragment4, true);
                            aVar2.f23803d = aVar.f23803d;
                            aVar2.f23805f = aVar.f23805f;
                            aVar2.f23804e = aVar.f23804e;
                            aVar2.f23806g = aVar.f23806g;
                            this.f23783c.add(i10, aVar2);
                            arrayList.remove(fragment4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f23783c.remove(i10);
                    i10--;
                } else {
                    aVar.f23800a = 1;
                    aVar.f23802c = true;
                    arrayList.add(fragment3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f23801b);
                Fragment fragment5 = aVar.f23801b;
                if (fragment5 == fragment2) {
                    this.f23783c.add(i10, new p0.a(9, fragment5));
                    i10++;
                    fragment2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f23801b);
            } else if (i11 == 8) {
                this.f23783c.add(i10, new p0.a(9, fragment2, true));
                aVar.f23802c = true;
                i10++;
                fragment2 = aVar.f23801b;
            }
            i10++;
        }
        return fragment2;
    }

    public void Y() {
        if (this.f23799s != null) {
            for (int i10 = 0; i10 < this.f23799s.size(); i10++) {
                this.f23799s.get(i10).run();
            }
            this.f23799s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment Z(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f23783c.size() - 1; size >= 0; size--) {
            p0.a aVar = this.f23783c.get(size);
            int i10 = aVar.f23800a;
            if (i10 == 1) {
                arrayList.remove(aVar.f23801b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f23801b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f23801b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f23801b;
                        break;
                    case 10:
                        aVar.f23808i = aVar.f23807h;
                        break;
                }
            } else {
                arrayList.add(aVar.f23801b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public boolean a(@androidx.annotation.n0 ArrayList<a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f23789i) {
            return true;
        }
        this.N.m(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.p0
    public CharSequence getBreadCrumbShortTitle() {
        return this.f23794n != 0 ? this.N.K0().f().getText(this.f23794n) : this.f23795o;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbShortTitleRes() {
        return this.f23794n;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.p0
    public CharSequence getBreadCrumbTitle() {
        return this.f23792l != 0 ? this.N.K0().f().getText(this.f23792l) : this.f23793m;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbTitleRes() {
        return this.f23792l;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getId() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.p0
    public String getName() {
        return this.f23791k;
    }

    @Override // androidx.fragment.app.p0
    public int m() {
        return S(false);
    }

    @Override // androidx.fragment.app.p0
    public int n() {
        return S(true);
    }

    @Override // androidx.fragment.app.p0
    public void o() {
        s();
        this.N.k0(this, false);
    }

    @Override // androidx.fragment.app.p0
    public void p() {
        s();
        this.N.k0(this, true);
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 r(@androidx.annotation.n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.r(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.p0
    void t(int i10, Fragment fragment, @androidx.annotation.p0 String str, int i11) {
        super.t(i10, fragment, str, i11);
        fragment.mFragmentManager = this.N;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            sb2.append(" #");
            sb2.append(this.P);
        }
        if (this.f23791k != null) {
            sb2.append(" ");
            sb2.append(this.f23791k);
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 u(@androidx.annotation.n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.u(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.p0
    public boolean w() {
        return this.f23783c.isEmpty();
    }

    @Override // androidx.fragment.app.p0
    @androidx.annotation.n0
    public p0 x(@androidx.annotation.n0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.x(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
