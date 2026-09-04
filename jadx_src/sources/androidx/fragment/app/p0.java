package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.core.view.j1;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p0 {
    static final int A = 7;
    static final int B = 8;
    static final int C = 9;
    static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    public static final int L = 4100;
    public static final int M = 8197;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f23774t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f23775u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f23776v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f23777w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f23778x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f23779y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f23780z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f23781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f23782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f23783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f23784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f23785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f23786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f23787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f23788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f23789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f23790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    String f23791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f23792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f23793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f23795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f23796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f23797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f23798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f23799s;

    /* JADX INFO: compiled from: FragmentTransaction.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f23801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Lifecycle.State f23807h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Lifecycle.State f23808i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f23800a = i10;
            this.f23801b = fragment;
            this.f23802c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f23807h = state;
            this.f23808i = state;
        }

        a(int i10, @androidx.annotation.n0 Fragment fragment, Lifecycle.State state) {
            this.f23800a = i10;
            this.f23801b = fragment;
            this.f23802c = false;
            this.f23807h = fragment.mMaxState;
            this.f23808i = state;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f23800a = i10;
            this.f23801b = fragment;
            this.f23802c = z10;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f23807h = state;
            this.f23808i = state;
        }

        a(a aVar) {
            this.f23800a = aVar.f23800a;
            this.f23801b = aVar.f23801b;
            this.f23802c = aVar.f23802c;
            this.f23803d = aVar.f23803d;
            this.f23804e = aVar.f23804e;
            this.f23805f = aVar.f23805f;
            this.f23806g = aVar.f23806g;
            this.f23807h = aVar.f23807h;
            this.f23808i = aVar.f23808i;
        }
    }

    @Deprecated
    public p0() {
        this.f23783c = new ArrayList<>();
        this.f23790j = true;
        this.f23798r = false;
        this.f23781a = null;
        this.f23782b = null;
    }

    p0(@androidx.annotation.n0 s sVar, @androidx.annotation.p0 ClassLoader classLoader) {
        this.f23783c = new ArrayList<>();
        this.f23790j = true;
        this.f23798r = false;
        this.f23781a = sVar;
        this.f23782b = classLoader;
    }

    p0(@androidx.annotation.n0 s sVar, @androidx.annotation.p0 ClassLoader classLoader, @androidx.annotation.n0 p0 p0Var) {
        this(sVar, classLoader);
        Iterator<a> it = p0Var.f23783c.iterator();
        while (it.hasNext()) {
            this.f23783c.add(new a(it.next()));
        }
        this.f23784d = p0Var.f23784d;
        this.f23785e = p0Var.f23785e;
        this.f23786f = p0Var.f23786f;
        this.f23787g = p0Var.f23787g;
        this.f23788h = p0Var.f23788h;
        this.f23789i = p0Var.f23789i;
        this.f23790j = p0Var.f23790j;
        this.f23791k = p0Var.f23791k;
        this.f23794n = p0Var.f23794n;
        this.f23795o = p0Var.f23795o;
        this.f23792l = p0Var.f23792l;
        this.f23793m = p0Var.f23793m;
        if (p0Var.f23796p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f23796p = arrayList;
            arrayList.addAll(p0Var.f23796p);
        }
        if (p0Var.f23797q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f23797q = arrayList2;
            arrayList2.addAll(p0Var.f23797q);
        }
        this.f23798r = p0Var.f23798r;
    }

    @androidx.annotation.n0
    private Fragment q(@androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        s sVar = this.f23781a;
        if (sVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f23782b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentA = sVar.a(classLoader, cls.getName());
        if (bundle != null) {
            fragmentA.setArguments(bundle);
        }
        return fragmentA;
    }

    @androidx.annotation.n0
    public final p0 A(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        return B(i10, cls, bundle, null);
    }

    @androidx.annotation.n0
    public final p0 B(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return z(i10, q(cls, bundle), str);
    }

    @androidx.annotation.n0
    public p0 C(@androidx.annotation.n0 Runnable runnable) {
        s();
        if (this.f23799s == null) {
            this.f23799s = new ArrayList<>();
        }
        this.f23799s.add(runnable);
        return this;
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 D(boolean z10) {
        return M(z10);
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 E(@d1 int i10) {
        this.f23794n = i10;
        this.f23795o = null;
        return this;
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 F(@androidx.annotation.p0 CharSequence charSequence) {
        this.f23794n = 0;
        this.f23795o = charSequence;
        return this;
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 G(@d1 int i10) {
        this.f23792l = i10;
        this.f23793m = null;
        return this;
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 H(@androidx.annotation.p0 CharSequence charSequence) {
        this.f23792l = 0;
        this.f23793m = charSequence;
        return this;
    }

    @androidx.annotation.n0
    public p0 I(@androidx.annotation.a @androidx.annotation.b int i10, @androidx.annotation.a @androidx.annotation.b int i11) {
        return J(i10, i11, 0, 0);
    }

    @androidx.annotation.n0
    public p0 J(@androidx.annotation.a @androidx.annotation.b int i10, @androidx.annotation.a @androidx.annotation.b int i11, @androidx.annotation.a @androidx.annotation.b int i12, @androidx.annotation.a @androidx.annotation.b int i13) {
        this.f23784d = i10;
        this.f23785e = i11;
        this.f23786f = i12;
        this.f23787g = i13;
        return this;
    }

    @androidx.annotation.n0
    public p0 K(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Lifecycle.State state) {
        i(new a(10, fragment, state));
        return this;
    }

    @androidx.annotation.n0
    public p0 L(@androidx.annotation.p0 Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    @androidx.annotation.n0
    public p0 M(boolean z10) {
        this.f23798r = z10;
        return this;
    }

    @androidx.annotation.n0
    public p0 N(int i10) {
        this.f23788h = i10;
        return this;
    }

    @androidx.annotation.n0
    @Deprecated
    public p0 O(@e1 int i10) {
        return this;
    }

    @androidx.annotation.n0
    public p0 P(@androidx.annotation.n0 Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    @androidx.annotation.n0
    public p0 b(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Fragment fragment) {
        t(i10, fragment, null, 1);
        return this;
    }

    @androidx.annotation.n0
    public p0 c(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 String str) {
        t(i10, fragment, str, 1);
        return this;
    }

    @androidx.annotation.n0
    public final p0 d(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        return b(i10, q(cls, bundle));
    }

    @androidx.annotation.n0
    public final p0 e(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return c(i10, q(cls, bundle), str);
    }

    p0 f(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    @androidx.annotation.n0
    public p0 g(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 String str) {
        t(0, fragment, str, 1);
        return this;
    }

    @androidx.annotation.n0
    public final p0 h(@androidx.annotation.n0 Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return g(q(cls, bundle), str);
    }

    void i(a aVar) {
        this.f23783c.add(aVar);
        aVar.f23803d = this.f23784d;
        aVar.f23804e = this.f23785e;
        aVar.f23805f = this.f23786f;
        aVar.f23806g = this.f23787g;
    }

    @androidx.annotation.n0
    public p0 j(@androidx.annotation.n0 View view, @androidx.annotation.n0 String str) {
        if (r0.f()) {
            String strX0 = j1.x0(view);
            if (strX0 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f23796p == null) {
                this.f23796p = new ArrayList<>();
                this.f23797q = new ArrayList<>();
            } else {
                if (this.f23797q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f23796p.contains(strX0)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strX0 + "' has already been added to the transaction.");
                }
            }
            this.f23796p.add(strX0);
            this.f23797q.add(str);
        }
        return this;
    }

    @androidx.annotation.n0
    public p0 k(@androidx.annotation.p0 String str) {
        if (!this.f23790j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f23789i = true;
        this.f23791k = str;
        return this;
    }

    @androidx.annotation.n0
    public p0 l(@androidx.annotation.n0 Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    @androidx.annotation.k0
    public abstract void o();

    @androidx.annotation.k0
    public abstract void p();

    @androidx.annotation.n0
    public p0 r(@androidx.annotation.n0 Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    @androidx.annotation.n0
    public p0 s() {
        if (this.f23789i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f23790j = false;
        return this;
    }

    void t(int i10, Fragment fragment, @androidx.annotation.p0 String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        i(new a(i11, fragment));
    }

    @androidx.annotation.n0
    public p0 u(@androidx.annotation.n0 Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.f23790j;
    }

    public boolean w() {
        return this.f23783c.isEmpty();
    }

    @androidx.annotation.n0
    public p0 x(@androidx.annotation.n0 Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    @androidx.annotation.n0
    public p0 y(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Fragment fragment) {
        return z(i10, fragment, null);
    }

    @androidx.annotation.n0
    public p0 z(@androidx.annotation.d0 int i10, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        t(i10, fragment, str, 2);
        return this;
    }
}
