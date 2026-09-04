package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Transition implements Cloneable {
    private static final String H = "Transition";
    static final boolean I = false;
    public static final int J = 1;
    private static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    private static final int O = 4;
    private static final String P = "instance";
    private static final String Q = "name";
    private static final String R = "id";
    private static final String S = "itemId";
    private static final int[] T = {2, 1, 3, 4};
    private static final PathMotion U = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> V = new ThreadLocal<>();
    w D;
    private f E;
    private androidx.collection.a<String, String> F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<z> f27772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<z> f27773v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27753b = getClass().getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27754c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f27755d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f27756e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<Integer> f27757f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<View> f27758g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f27759h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<Class<?>> f27760i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Integer> f27761j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<View> f27762k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Class<?>> f27763l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<String> f27764m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<Integer> f27765n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<View> f27766o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList<Class<?>> f27767p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a0 f27768q = new a0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a0 f27769r = new a0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    TransitionSet f27770s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f27771t = T;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f27774w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList<Animator> f27775x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27776y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f27777z = false;
    private boolean A = false;
    private ArrayList<h> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private PathMotion G = U;

    public class a extends PathMotion {
        a() {
        }

        @Override // androidx.transition.PathMotion
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f27778b;

        b(androidx.collection.a aVar) {
            this.f27778b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27778b.remove(animator);
            Transition.this.f27775x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f27775x.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.s();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f27781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f27782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        z f27783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b1 f27784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Transition f27785e;

        d(View view, String str, Transition transition, b1 b1Var, z zVar) {
            this.f27781a = view;
            this.f27782b = str;
            this.f27783c = zVar;
            this.f27784d = b1Var;
            this.f27785e = transition;
        }
    }

    public static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t10);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(@androidx.annotation.n0 Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    public interface h {
        void a(@androidx.annotation.n0 Transition transition);

        void b(@androidx.annotation.n0 Transition transition);

        void c(@androidx.annotation.n0 Transition transition);

        void d(@androidx.annotation.n0 Transition transition);

        void e(@androidx.annotation.n0 Transition transition);
    }

    public Transition() {
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27908c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            w0(jK);
        }
        long jK2 = androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            E0(jK2);
        }
        int iL = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iL > 0) {
            y0(AnimationUtils.loadInterpolator(context, iL));
        }
        String strM = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            z0(k0(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private ArrayList<Class<?>> D(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        if (cls != null) {
            return z10 ? e.a(arrayList, cls) : e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> E(ArrayList<View> arrayList, View view, boolean z10) {
        if (view != null) {
            return z10 ? e.a(arrayList, view) : e.b(arrayList, view);
        }
        return arrayList;
    }

    private static androidx.collection.a<Animator, d> R() {
        androidx.collection.a<Animator, d> aVar = V.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        V.set(aVar2);
        return aVar2;
    }

    private static boolean c0(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    private static boolean e0(z zVar, z zVar2, String str) {
        Object obj = zVar.f27973a.get(str);
        Object obj2 = zVar2.f27973a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void f(androidx.collection.a<View, z> aVar, androidx.collection.a<View, z> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            z zVarK = aVar.k(i10);
            if (d0(zVarK.f27974b)) {
                this.f27772u.add(zVarK);
                this.f27773v.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            z zVarK2 = aVar2.k(i11);
            if (d0(zVarK2.f27974b)) {
                this.f27773v.add(zVarK2);
                this.f27772u.add(null);
            }
        }
    }

    private void f0(androidx.collection.a<View, z> aVar, androidx.collection.a<View, z> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && d0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && d0(view)) {
                z zVar = aVar.get(viewValueAt);
                z zVar2 = aVar2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.f27772u.add(zVar);
                    this.f27773v.add(zVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private static void g(a0 a0Var, View view, z zVar) {
        a0Var.f27822a.put(view, zVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (a0Var.f27823b.indexOfKey(id2) >= 0) {
                a0Var.f27823b.put(id2, null);
            } else {
                a0Var.f27823b.put(id2, view);
            }
        }
        String strX0 = j1.x0(view);
        if (strX0 != null) {
            if (a0Var.f27825d.containsKey(strX0)) {
                a0Var.f27825d.put(strX0, null);
            } else {
                a0Var.f27825d.put(strX0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (a0Var.f27824c.i(itemIdAtPosition) < 0) {
                    j1.Q1(view, true);
                    a0Var.f27824c.m(itemIdAtPosition, view);
                    return;
                }
                View viewG = a0Var.f27824c.g(itemIdAtPosition);
                if (viewG != null) {
                    j1.Q1(viewG, false);
                    a0Var.f27824c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    private void g0(androidx.collection.a<View, z> aVar, androidx.collection.a<View, z> aVar2) {
        z zVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewG = aVar.g(size);
            if (viewG != null && d0(viewG) && (zVarRemove = aVar2.remove(viewG)) != null && d0(zVarRemove.f27974b)) {
                this.f27772u.add(aVar.i(size));
                this.f27773v.add(zVarRemove);
            }
        }
    }

    private static boolean h(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    private void h0(androidx.collection.a<View, z> aVar, androidx.collection.a<View, z> aVar2, androidx.collection.x0<View> x0Var, androidx.collection.x0<View> x0Var2) {
        View viewG;
        int iV = x0Var.v();
        for (int i10 = 0; i10 < iV; i10++) {
            View viewW = x0Var.w(i10);
            if (viewW != null && d0(viewW) && (viewG = x0Var2.g(x0Var.l(i10))) != null && d0(viewG)) {
                z zVar = aVar.get(viewW);
                z zVar2 = aVar2.get(viewG);
                if (zVar != null && zVar2 != null) {
                    this.f27772u.add(zVar);
                    this.f27773v.add(zVar2);
                    aVar.remove(viewW);
                    aVar2.remove(viewG);
                }
            }
        }
    }

    private void i0(androidx.collection.a<View, z> aVar, androidx.collection.a<View, z> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewK = aVar3.k(i10);
            if (viewK != null && d0(viewK) && (view = aVar4.get(aVar3.g(i10))) != null && d0(view)) {
                z zVar = aVar.get(viewK);
                z zVar2 = aVar2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.f27772u.add(zVar);
                    this.f27773v.add(zVar2);
                    aVar.remove(viewK);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void j0(a0 a0Var, a0 a0Var2) {
        androidx.collection.a<View, z> aVar = new androidx.collection.a<>(a0Var.f27822a);
        androidx.collection.a<View, z> aVar2 = new androidx.collection.a<>(a0Var2.f27822a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f27771t;
            if (i10 >= iArr.length) {
                f(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                g0(aVar, aVar2);
            } else if (i11 == 2) {
                i0(aVar, aVar2, a0Var.f27825d, a0Var2.f27825d);
            } else if (i11 == 3) {
                f0(aVar, aVar2, a0Var.f27823b, a0Var2.f27823b);
            } else if (i11 == 4) {
                h0(aVar, aVar2, a0Var.f27824c, a0Var2.f27824c);
            }
            i10++;
        }
    }

    private void k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f27761j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f27762k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f27763l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f27763l.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    z zVar = new z(view);
                    if (z10) {
                        m(zVar);
                    } else {
                        j(zVar);
                    }
                    zVar.f27975c.add(this);
                    l(zVar);
                    if (z10) {
                        g(this.f27768q, view, zVar);
                    } else {
                        g(this.f27769r, view, zVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f27765n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f27766o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f27767p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f27767p.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private static int[] k0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 3;
            } else if (P.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 2;
            } else if (S.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            }
            i10++;
        }
        return iArr;
    }

    private void t0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            i(animator);
        }
    }

    private ArrayList<Integer> w(ArrayList<Integer> arrayList, int i10, boolean z10) {
        if (i10 > 0) {
            return z10 ? e.a(arrayList, Integer.valueOf(i10)) : e.b(arrayList, Integer.valueOf(i10));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> x(ArrayList<T> arrayList, T t10, boolean z10) {
        if (t10 != null) {
            return z10 ? e.a(arrayList, t10) : e.b(arrayList, t10);
        }
        return arrayList;
    }

    public void A0(@androidx.annotation.p0 PathMotion pathMotion) {
        if (pathMotion == null) {
            this.G = U;
        } else {
            this.G = pathMotion;
        }
    }

    @androidx.annotation.n0
    public Transition B(@androidx.annotation.n0 Class<?> cls, boolean z10) {
        this.f27763l = D(this.f27763l, cls, z10);
        return this;
    }

    public void B0(@androidx.annotation.p0 w wVar) {
        this.D = wVar;
    }

    @androidx.annotation.n0
    public Transition C(@androidx.annotation.n0 String str, boolean z10) {
        this.f27764m = x(this.f27764m, str, z10);
        return this;
    }

    @androidx.annotation.n0
    public Transition E0(long j10) {
        this.f27754c = j10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void F(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> aVarR = R();
        int size = aVarR.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        b1 b1VarD = l0.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(aVarR);
        aVarR.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) aVar.k(i10);
            if (dVar.f27781a != null && b1VarD != null && b1VarD.equals(dVar.f27784d)) {
                ((Animator) aVar.g(i10)).end();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void F0() {
        if (this.f27776y == 0) {
            ArrayList<h> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h) arrayList2.get(i10)).b(this);
                }
            }
            this.A = false;
        }
        this.f27776y++;
    }

    public long G() {
        return this.f27755d;
    }

    @androidx.annotation.p0
    public Rect H() {
        f fVar = this.E;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    String H0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f27755d != -1) {
            str2 = str2 + "dur(" + this.f27755d + ") ";
        }
        if (this.f27754c != -1) {
            str2 = str2 + "dly(" + this.f27754c + ") ";
        }
        if (this.f27756e != null) {
            str2 = str2 + "interp(" + this.f27756e + ") ";
        }
        if (this.f27757f.size() <= 0 && this.f27758g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f27757f.size() > 0) {
            for (int i10 = 0; i10 < this.f27757f.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f27757f.get(i10);
            }
        }
        if (this.f27758g.size() > 0) {
            for (int i11 = 0; i11 < this.f27758g.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f27758g.get(i11);
            }
        }
        return str3 + ")";
    }

    @androidx.annotation.p0
    public f J() {
        return this.E;
    }

    @androidx.annotation.p0
    public TimeInterpolator K() {
        return this.f27756e;
    }

    z M(View view, boolean z10) {
        TransitionSet transitionSet = this.f27770s;
        if (transitionSet != null) {
            return transitionSet.M(view, z10);
        }
        ArrayList<z> arrayList = z10 ? this.f27772u : this.f27773v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = arrayList.get(i11);
            if (zVar == null) {
                return null;
            }
            if (zVar.f27974b == view) {
                i10 = i11;
                break;
            }
        }
        if (i10 >= 0) {
            return (z10 ? this.f27773v : this.f27772u).get(i10);
        }
        return null;
    }

    @androidx.annotation.n0
    public String O() {
        return this.f27753b;
    }

    @androidx.annotation.n0
    public PathMotion P() {
        return this.G;
    }

    @androidx.annotation.p0
    public w Q() {
        return this.D;
    }

    public long S() {
        return this.f27754c;
    }

    @androidx.annotation.n0
    public List<Integer> T() {
        return this.f27757f;
    }

    @androidx.annotation.p0
    public List<String> U() {
        return this.f27759h;
    }

    @androidx.annotation.p0
    public List<Class<?>> V() {
        return this.f27760i;
    }

    @androidx.annotation.n0
    public List<View> X() {
        return this.f27758g;
    }

    @androidx.annotation.p0
    public String[] Y() {
        return null;
    }

    @androidx.annotation.p0
    public z Z(@androidx.annotation.n0 View view, boolean z10) {
        TransitionSet transitionSet = this.f27770s;
        if (transitionSet != null) {
            return transitionSet.Z(view, z10);
        }
        return (z10 ? this.f27768q : this.f27769r).f27822a.get(view);
    }

    @androidx.annotation.n0
    public Transition a(@androidx.annotation.n0 h hVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(hVar);
        return this;
    }

    @androidx.annotation.n0
    public Transition b(@androidx.annotation.d0 int i10) {
        if (i10 != 0) {
            this.f27757f.add(Integer.valueOf(i10));
        }
        return this;
    }

    public boolean b0(@androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        if (zVar == null || zVar2 == null) {
            return false;
        }
        String[] strArrY = Y();
        if (strArrY == null) {
            Iterator<String> it = zVar.f27973a.keySet().iterator();
            while (it.hasNext()) {
                if (e0(zVar, zVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrY) {
            if (!e0(zVar, zVar2, str)) {
            }
        }
        return false;
        return true;
    }

    @androidx.annotation.n0
    public Transition c(@androidx.annotation.n0 View view) {
        this.f27758g.add(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        for (int size = this.f27775x.size() - 1; size >= 0; size--) {
            this.f27775x.get(size).cancel();
        }
        ArrayList<h> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((h) arrayList2.get(i10)).e(this);
        }
    }

    @androidx.annotation.n0
    public Transition d(@androidx.annotation.n0 Class<?> cls) {
        if (this.f27760i == null) {
            this.f27760i = new ArrayList<>();
        }
        this.f27760i.add(cls);
        return this;
    }

    boolean d0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f27761j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f27762k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f27763l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f27763l.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f27764m != null && j1.x0(view) != null && this.f27764m.contains(j1.x0(view))) {
            return false;
        }
        if ((this.f27757f.size() == 0 && this.f27758g.size() == 0 && (((arrayList = this.f27760i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f27759h) == null || arrayList2.isEmpty()))) || this.f27757f.contains(Integer.valueOf(id2)) || this.f27758g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f27759h;
        if (arrayList6 != null && arrayList6.contains(j1.x0(view))) {
            return true;
        }
        if (this.f27760i != null) {
            for (int i11 = 0; i11 < this.f27760i.size(); i11++) {
                if (this.f27760i.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.n0
    public Transition e(@androidx.annotation.n0 String str) {
        if (this.f27759h == null) {
            this.f27759h = new ArrayList<>();
        }
        this.f27759h.add(str);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void i(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (G() >= 0) {
            animator.setDuration(G());
        }
        if (S() >= 0) {
            animator.setStartDelay(S() + animator.getStartDelay());
        }
        if (K() != null) {
            animator.setInterpolator(K());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void j(@androidx.annotation.n0 z zVar);

    void l(z zVar) {
        String[] strArrB;
        if (this.D == null || zVar.f27973a.isEmpty() || (strArrB = this.D.b()) == null) {
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= strArrB.length) {
                z10 = true;
                break;
            } else if (!zVar.f27973a.containsKey(strArrB[i10])) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        this.D.a(zVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void l0(View view) {
        if (this.A) {
            return;
        }
        for (int size = this.f27775x.size() - 1; size >= 0; size--) {
            androidx.transition.a.b(this.f27775x.get(size));
        }
        ArrayList<h> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((h) arrayList2.get(i10)).c(this);
            }
        }
        this.f27777z = true;
    }

    public abstract void m(@androidx.annotation.n0 z zVar);

    void m0(ViewGroup viewGroup) {
        d dVar;
        this.f27772u = new ArrayList<>();
        this.f27773v = new ArrayList<>();
        j0(this.f27768q, this.f27769r);
        androidx.collection.a<Animator, d> aVarR = R();
        int size = aVarR.size();
        b1 b1VarD = l0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = aVarR.g(i10);
            if (animatorG != null && (dVar = aVarR.get(animatorG)) != null && dVar.f27781a != null && b1VarD.equals(dVar.f27784d)) {
                z zVar = dVar.f27783c;
                View view = dVar.f27781a;
                z zVarZ = Z(view, true);
                z zVarM = M(view, true);
                if (zVarZ == null && zVarM == null) {
                    zVarM = this.f27769r.f27822a.get(view);
                }
                if (!(zVarZ == null && zVarM == null) && dVar.f27785e.b0(zVar, zVarM)) {
                    if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        aVarR.remove(animatorG);
                    }
                }
            }
        }
        r(viewGroup, this.f27768q, this.f27769r, this.f27772u, this.f27773v);
        u0();
    }

    void n(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        o(z10);
        if ((this.f27757f.size() > 0 || this.f27758g.size() > 0) && (((arrayList = this.f27759h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f27760i) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f27757f.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f27757f.get(i10).intValue());
                if (viewFindViewById != null) {
                    z zVar = new z(viewFindViewById);
                    if (z10) {
                        m(zVar);
                    } else {
                        j(zVar);
                    }
                    zVar.f27975c.add(this);
                    l(zVar);
                    if (z10) {
                        g(this.f27768q, viewFindViewById, zVar);
                    } else {
                        g(this.f27769r, viewFindViewById, zVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f27758g.size(); i11++) {
                View view = this.f27758g.get(i11);
                z zVar2 = new z(view);
                if (z10) {
                    m(zVar2);
                } else {
                    j(zVar2);
                }
                zVar2.f27975c.add(this);
                l(zVar2);
                if (z10) {
                    g(this.f27768q, view, zVar2);
                } else {
                    g(this.f27769r, view, zVar2);
                }
            }
        } else {
            k(viewGroup, z10);
        }
        if (z10 || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f27768q.f27825d.remove(this.F.g(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f27768q.f27825d.put(this.F.k(i13), view2);
            }
        }
    }

    @androidx.annotation.n0
    public Transition n0(@androidx.annotation.n0 h hVar) {
        ArrayList<h> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    void o(boolean z10) {
        if (z10) {
            this.f27768q.f27822a.clear();
            this.f27768q.f27823b.clear();
            this.f27768q.f27824c.b();
        } else {
            this.f27769r.f27822a.clear();
            this.f27769r.f27823b.clear();
            this.f27769r.f27824c.b();
        }
    }

    @androidx.annotation.n0
    public Transition o0(@androidx.annotation.d0 int i10) {
        if (i10 != 0) {
            this.f27757f.remove(Integer.valueOf(i10));
        }
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.C = new ArrayList<>();
            transition.f27768q = new a0();
            transition.f27769r = new a0();
            transition.f27772u = null;
            transition.f27773v = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @androidx.annotation.n0
    public Transition p0(@androidx.annotation.n0 View view) {
        this.f27758g.remove(view);
        return this;
    }

    @androidx.annotation.p0
    public Animator q(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        return null;
    }

    @androidx.annotation.n0
    public Transition q0(@androidx.annotation.n0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f27760i;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void r(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList<z> arrayList, ArrayList<z> arrayList2) {
        Animator animatorQ;
        int i10;
        View view;
        Animator animator;
        z zVar;
        Animator animator2;
        z zVar2;
        androidx.collection.a<Animator, d> aVarR = R();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            z zVar3 = arrayList.get(i11);
            z zVar4 = arrayList2.get(i11);
            if (zVar3 != null && !zVar3.f27975c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f27975c.contains(this)) {
                zVar4 = null;
            }
            if (zVar3 == null && zVar4 == null) {
                i10 = size;
            } else if (!(zVar3 == null || zVar4 == null || b0(zVar3, zVar4)) || (animatorQ = q(viewGroup, zVar3, zVar4)) == null) {
                i10 = size;
            } else {
                if (zVar4 != null) {
                    view = zVar4.f27974b;
                    String[] strArrY = Y();
                    if (strArrY != null && strArrY.length > 0) {
                        zVar2 = new z(view);
                        i10 = size;
                        z zVar5 = a0Var2.f27822a.get(view);
                        if (zVar5 != null) {
                            int i12 = 0;
                            while (i12 < strArrY.length) {
                                Map<String, Object> map = zVar2.f27973a;
                                String str = strArrY[i12];
                                map.put(str, zVar5.f27973a.get(str));
                                i12++;
                                strArrY = strArrY;
                            }
                        }
                        int size2 = aVarR.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                animator2 = animatorQ;
                                break;
                            }
                            d dVar = aVarR.get(aVarR.g(i13));
                            if (dVar.f27783c != null && dVar.f27781a == view && dVar.f27782b.equals(O()) && dVar.f27783c.equals(zVar2)) {
                                animator2 = null;
                                break;
                            }
                            i13++;
                        }
                    } else {
                        i10 = size;
                        animator2 = animatorQ;
                        zVar2 = null;
                    }
                    animator = animator2;
                    zVar = zVar2;
                } else {
                    i10 = size;
                    view = zVar3.f27974b;
                    animator = animatorQ;
                    zVar = null;
                }
                if (animator != null) {
                    w wVar = this.D;
                    if (wVar != null) {
                        long jC = wVar.c(viewGroup, this, zVar3, zVar4);
                        sparseIntArray.put(this.C.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    aVarR.put(animator, new d(view, O(), this, l0.d(viewGroup), zVar));
                    this.C.add(animator);
                    jMin = jMin;
                }
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i14));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i14)) - jMin) + animator3.getStartDelay());
            }
        }
    }

    @androidx.annotation.n0
    public Transition r0(@androidx.annotation.n0 String str) {
        ArrayList<String> arrayList = this.f27759h;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void s() {
        int i10 = this.f27776y - 1;
        this.f27776y = i10;
        if (i10 == 0) {
            ArrayList<h> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((h) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f27768q.f27824c.v(); i12++) {
                View viewW = this.f27768q.f27824c.w(i12);
                if (viewW != null) {
                    j1.Q1(viewW, false);
                }
            }
            for (int i13 = 0; i13 < this.f27769r.f27824c.v(); i13++) {
                View viewW2 = this.f27769r.f27824c.w(i13);
                if (viewW2 != null) {
                    j1.Q1(viewW2, false);
                }
            }
            this.A = true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void s0(View view) {
        if (this.f27777z) {
            if (!this.A) {
                for (int size = this.f27775x.size() - 1; size >= 0; size--) {
                    androidx.transition.a.c(this.f27775x.get(size));
                }
                ArrayList<h> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((h) arrayList2.get(i10)).a(this);
                    }
                }
            }
            this.f27777z = false;
        }
    }

    @androidx.annotation.n0
    public Transition t(@androidx.annotation.d0 int i10, boolean z10) {
        this.f27765n = w(this.f27765n, i10, z10);
        return this;
    }

    public String toString() {
        return H0("");
    }

    @androidx.annotation.n0
    public Transition u(@androidx.annotation.n0 View view, boolean z10) {
        this.f27766o = E(this.f27766o, view, z10);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void u0() {
        F0();
        androidx.collection.a<Animator, d> aVarR = R();
        for (Animator animator : this.C) {
            if (aVarR.containsKey(animator)) {
                F0();
                t0(animator, aVarR);
            }
        }
        this.C.clear();
        s();
    }

    @androidx.annotation.n0
    public Transition v(@androidx.annotation.n0 Class<?> cls, boolean z10) {
        this.f27767p = D(this.f27767p, cls, z10);
        return this;
    }

    void v0(boolean z10) {
        this.f27774w = z10;
    }

    @androidx.annotation.n0
    public Transition w0(long j10) {
        this.f27755d = j10;
        return this;
    }

    public void x0(@androidx.annotation.p0 f fVar) {
        this.E = fVar;
    }

    @androidx.annotation.n0
    public Transition y(@androidx.annotation.d0 int i10, boolean z10) {
        this.f27761j = w(this.f27761j, i10, z10);
        return this;
    }

    @androidx.annotation.n0
    public Transition y0(@androidx.annotation.p0 TimeInterpolator timeInterpolator) {
        this.f27756e = timeInterpolator;
        return this;
    }

    @androidx.annotation.n0
    public Transition z(@androidx.annotation.n0 View view, boolean z10) {
        this.f27762k = E(this.f27762k, view, z10);
        return this;
    }

    public void z0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f27771t = T;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!c0(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (h(iArr, i10)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f27771t = (int[]) iArr.clone();
    }
}
