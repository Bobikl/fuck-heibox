package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.core.app.b3;
import androidx.core.app.v2;
import androidx.core.app.x2;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FragmentManager implements l0 {
    private static final String S = "android:support:fragments";
    private static final String T = "state";
    private static final String U = "result_";
    private static final String V = "fragment_";
    private static boolean W = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String X = "FragmentManager";
    public static final int Y = 1;
    private static final String Z = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private androidx.activity.result.g<Intent> D;
    private androidx.activity.result.g<IntentSenderRequest> E;
    private androidx.activity.result.g<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private h0 P;
    private FragmentStrictMode.b Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23557b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f23559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f23560e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f23562g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<o> f23568m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private t<?> f23577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.q f23578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Fragment f23579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    Fragment f23580y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f23556a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f23558c = new o0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f23561f = new w(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.o f23563h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f23564i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, BackStackState> f23565j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Bundle> f23566k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, n> f23567l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x f23569n = new x(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList<i0> f23570o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.core.util.d<Configuration> f23571p = new androidx.core.util.d() { // from class: androidx.fragment.app.y
        @Override // androidx.core.util.d
        public final void accept(Object obj) {
            this.f23896b.g1((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.core.util.d<Integer> f23572q = new androidx.core.util.d() { // from class: androidx.fragment.app.z
        @Override // androidx.core.util.d
        public final void accept(Object obj) {
            this.f23899b.h1((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.core.util.d<androidx.core.app.b0> f23573r = new androidx.core.util.d() { // from class: androidx.fragment.app.a0
        @Override // androidx.core.util.d
        public final void accept(Object obj) {
            this.f23687b.i1((androidx.core.app.b0) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.core.util.d<b3> f23574s = new androidx.core.util.d() { // from class: androidx.fragment.app.b0
        @Override // androidx.core.util.d
        public final void accept(Object obj) {
            this.f23691b.j1((b3) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.core.view.p0 f23575t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f23576u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.s f23581z = null;
    private androidx.fragment.app.s A = new d();
    private a1 B = null;
    private a1 C = new e();
    ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    private Runnable R = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f23586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23587c;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(@androidx.annotation.n0 Parcel parcel) {
            this.f23586b = parcel.readString();
            this.f23587c = parcel.readInt();
        }

        LaunchedFragmentInfo(@androidx.annotation.n0 String str, int i10) {
            this.f23586b = str;
            this.f23587c = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f23586b);
            parcel.writeInt(this.f23587c);
        }
    }

    public class a implements androidx.activity.result.a<Map<String, Boolean>> {
        a() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.X, "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f23586b;
            int i11 = launchedFragmentInfoPollFirst.f23587c;
            Fragment fragmentI = FragmentManager.this.f23558c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w(FragmentManager.X, "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends androidx.activity.o {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            FragmentManager.this.T0();
        }
    }

    public class c implements androidx.core.view.p0 {
        c() {
        }

        @Override // androidx.core.view.p0
        public void a(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }

        @Override // androidx.core.view.p0
        public void b(@androidx.annotation.n0 Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // androidx.core.view.p0
        public void c(@androidx.annotation.n0 Menu menu) {
            FragmentManager.this.W(menu);
        }

        @Override // androidx.core.view.p0
        public boolean d(@androidx.annotation.n0 MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }
    }

    public class d extends androidx.fragment.app.s {
        d() {
        }

        @Override // androidx.fragment.app.s
        @androidx.annotation.n0
        public Fragment a(@androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 String str) {
            return FragmentManager.this.K0().b(FragmentManager.this.K0().f(), str, null);
        }
    }

    public class e implements a1 {
        e() {
        }

        @Override // androidx.fragment.app.a1
        @androidx.annotation.n0
        public SpecialEffectsController a(@androidx.annotation.n0 ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    public class g implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f23594b;

        g(Fragment fragment) {
            this.f23594b = fragment;
        }

        @Override // androidx.fragment.app.i0
        public void a(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
            this.f23594b.onAttachFragment(fragment);
        }
    }

    public class h implements androidx.activity.result.a<ActivityResult> {
        h() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.G.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w(FragmentManager.X, "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.f23586b;
            int i10 = launchedFragmentInfoPollLast.f23587c;
            Fragment fragmentI = FragmentManager.this.f23558c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, activityResult.b(), activityResult.a());
                return;
            }
            Log.w(FragmentManager.X, "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements androidx.activity.result.a<ActivityResult> {
        i() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.X, "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f23586b;
            int i10 = launchedFragmentInfoPollFirst.f23587c;
            Fragment fragmentI = FragmentManager.this.f23558c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, activityResult.b(), activityResult.a());
                return;
            }
            Log.w(FragmentManager.X, "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public interface j {
        @androidx.annotation.p0
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @d1
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @androidx.annotation.p0
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @d1
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @androidx.annotation.p0
        String getName();
    }

    public class k implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23598a;

        k(String str) {
            this.f23598a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.f23598a);
        }
    }

    public static class l extends z.a<IntentSenderRequest, ActivityResult> {
        l() {
        }

        @Override // z.a
        @androidx.annotation.n0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@androidx.annotation.n0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(z.b.n.f141828b);
            Intent intentA = intentSenderRequest.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra(z.b.m.f141826b)) != null) {
                intent.putExtra(z.b.m.f141826b, bundleExtra);
                intentA.removeExtra(z.b.m.f141826b);
                if (intentA.getBooleanExtra(FragmentManager.Z, false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra(z.b.n.f141829c, intentSenderRequest);
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // z.a
        @androidx.annotation.n0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @androidx.annotation.p0 Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void a(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void b(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Context context) {
        }

        public void c(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void d(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void e(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void f(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void g(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Context context) {
        }

        public void h(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void i(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void j(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Bundle bundle) {
        }

        public void k(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void l(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }

        public void m(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 View view, @androidx.annotation.p0 Bundle bundle) {
        }

        public void n(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
        }
    }

    public static class n implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lifecycle f23600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f23601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.lifecycle.v f23602c;

        n(@androidx.annotation.n0 Lifecycle lifecycle, @androidx.annotation.n0 k0 k0Var, @androidx.annotation.n0 androidx.lifecycle.v vVar) {
            this.f23600a = lifecycle;
            this.f23601b = k0Var;
            this.f23602c = vVar;
        }

        @Override // androidx.fragment.app.k0
        public void a(@androidx.annotation.n0 String str, @androidx.annotation.n0 Bundle bundle) {
            this.f23601b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f23600a.b().isAtLeast(state);
        }

        public void c() {
            this.f23600a.d(this.f23602c);
        }
    }

    public interface o {
        @androidx.annotation.k0
        void a(@androidx.annotation.n0 Fragment fragment, boolean z10);

        @androidx.annotation.k0
        void b(@androidx.annotation.n0 Fragment fragment, boolean z10);

        @androidx.annotation.k0
        void onBackStackChanged();
    }

    public interface p {
        boolean a(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2);
    }

    public class q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f23603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f23604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f23605c;

        q(String str, int i10, int i11) {
            this.f23603a = str;
            this.f23604b = i10;
            this.f23605c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f23580y;
            if (fragment == null || this.f23604b >= 0 || this.f23603a != null || !fragment.getChildFragmentManager().w1()) {
                return FragmentManager.this.A1(arrayList, arrayList2, this.f23603a, this.f23604b, this.f23605c);
            }
            return false;
        }
    }

    public class r implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23607a;

        r(String str) {
            this.f23607a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.L1(arrayList, arrayList2, this.f23607a);
        }
    }

    public class s implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23609a;

        s(String str) {
            this.f23609a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.T1(arrayList, arrayList2, this.f23609a);
        }
    }

    private void A() {
        t<?> tVar = this.f23577v;
        boolean zIsChangingConfigurations = true;
        if (tVar instanceof c1) {
            zIsChangingConfigurations = this.f23558c.q().p();
        } else if (tVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) this.f23577v.f()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it = this.f23565j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f23489b.iterator();
                while (it2.hasNext()) {
                    this.f23558c.q().f(it2.next(), false);
                }
            }
        }
    }

    private Set<SpecialEffectsController> B() {
        HashSet hashSet = new HashSet();
        Iterator<m0> it = this.f23558c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.s(viewGroup, P0()));
            }
        }
        return hashSet;
    }

    private Set<SpecialEffectsController> C(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<p0.a> it = arrayList.get(i10).f23783c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f23801b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @androidx.annotation.n0
    private h0 D0(@androidx.annotation.n0 Fragment fragment) {
        return this.P.i(fragment);
    }

    private ViewGroup G0(@androidx.annotation.n0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f23578w.d()) {
            View viewC = this.f23578w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void G1(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f23798r) {
                if (i11 != i10) {
                    m0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f23798r) {
                        i11++;
                    }
                }
                m0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m0(arrayList, arrayList2, i11, size);
        }
    }

    private void I1() {
        if (this.f23568m != null) {
            for (int i10 = 0; i10 < this.f23568m.size(); i10++) {
                this.f23568m.get(i10).onBackStackChanged();
            }
        }
    }

    static int P1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    @androidx.annotation.p0
    static Fragment R0(@androidx.annotation.n0 View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void T(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null || !fragment.equals(o0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean X0(int i10) {
        return W || Log.isLoggable(X, i10);
    }

    private boolean Y0(@androidx.annotation.n0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.v();
    }

    private boolean Z0() {
        Fragment fragment = this.f23579x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f23579x.getParentFragmentManager().Z0();
    }

    private void a0(int i10) {
        try {
            this.f23557b = true;
            this.f23558c.d(i10);
            n1(i10, false);
            Iterator<SpecialEffectsController> it = B().iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            this.f23557b = false;
            j0(true);
        } catch (Throwable th2) {
            this.f23557b = false;
            throw th2;
        }
    }

    private void c2(@androidx.annotation.n0 Fragment fragment) {
        ViewGroup viewGroupG0 = G0(fragment);
        if (viewGroupG0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = R.id.visible_removing_fragment_view_tag;
        if (viewGroupG0.getTag(i10) == null) {
            viewGroupG0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupG0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    private void d0() {
        if (this.L) {
            this.L = false;
            e2();
        }
    }

    private void e2() {
        Iterator<m0> it = this.f23558c.l().iterator();
        while (it.hasNext()) {
            r1(it.next());
        }
    }

    @Deprecated
    public static void f0(boolean z10) {
        W = z10;
    }

    private void f2(RuntimeException runtimeException) {
        Log.e(X, runtimeException.getMessage());
        Log.e(X, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new w0(X));
        t<?> tVar = this.f23577v;
        if (tVar != null) {
            try {
                tVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e(X, "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            e0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e(X, "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void g0() {
        Iterator<SpecialEffectsController> it = B().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(Configuration configuration) {
        if (Z0()) {
            H(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(Integer num) {
        if (Z0() && num.intValue() == 80) {
            N(false);
        }
    }

    private void h2() {
        synchronized (this.f23556a) {
            if (this.f23556a.isEmpty()) {
                this.f23563h.setEnabled(C0() > 0 && c1(this.f23579x));
            } else {
                this.f23563h.setEnabled(true);
            }
        }
    }

    private void i0(boolean z10) {
        if (this.f23557b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f23577v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f23577v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            w();
        }
        if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(androidx.core.app.b0 b0Var) {
        if (Z0()) {
            O(b0Var.b(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(b3 b3Var) {
        if (Z0()) {
            V(b3Var.b(), false);
        }
    }

    private static void l0(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.Q(-1);
                aVar.W();
            } else {
                aVar.Q(1);
                aVar.V();
            }
            i10++;
        }
    }

    private void m0(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<o> arrayList3;
        boolean z10 = arrayList.get(i10).f23798r;
        ArrayList<Fragment> arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.f23558c.p());
        Fragment fragmentO0 = O0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            fragmentO0 = !arrayList2.get(i12).booleanValue() ? aVar.X(this.O, fragmentO0) : aVar.Z(this.O, fragmentO0);
            z11 = z11 || aVar.f23789i;
        }
        this.O.clear();
        if (!z10 && this.f23576u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<p0.a> it = arrayList.get(i13).f23783c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f23801b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f23558c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && (arrayList3 = this.f23568m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(x0(it2.next()));
            }
            for (o oVar : this.f23568m) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    oVar.a((Fragment) it3.next(), zBooleanValue);
                }
            }
            for (o oVar2 : this.f23568m) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    oVar2.b((Fragment) it4.next(), zBooleanValue);
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = aVar2.f23783c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f23783c.get(size).f23801b;
                    if (fragment2 != null) {
                        D(fragment2).m();
                    }
                }
            } else {
                Iterator<p0.a> it5 = aVar2.f23783c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = it5.next().f23801b;
                    if (fragment3 != null) {
                        D(fragment3).m();
                    }
                }
            }
        }
        n1(this.f23576u, true);
        for (SpecialEffectsController specialEffectsController : C(arrayList, i10, i11)) {
            specialEffectsController.v(zBooleanValue);
            specialEffectsController.t();
            specialEffectsController.k();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.P >= 0) {
                aVar3.P = -1;
            }
            aVar3.Y();
            i10++;
        }
        if (z11) {
            I1();
        }
    }

    private int p0(@androidx.annotation.p0 String str, int i10, boolean z10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f23559d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f23559d.size() - 1;
        }
        int size = this.f23559d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f23559d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i10 >= 0 && i10 == aVar.P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f23559d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f23559d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i10 < 0 || i10 != aVar2.P)) {
                return size;
            }
            size--;
        }
        return size;
    }

    @androidx.annotation.n0
    public static <F extends Fragment> F q0(@androidx.annotation.n0 View view) {
        F f10 = (F) v0(view);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @androidx.annotation.n0
    static FragmentManager u0(@androidx.annotation.n0 View view) {
        Fragment fragmentV0 = v0(view);
        if (fragmentV0 != null) {
            if (fragmentV0.isAdded()) {
                return fragmentV0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentV0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        FragmentActivity fragmentActivity = null;
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @androidx.annotation.p0
    static Fragment v0(@androidx.annotation.n0 View view) {
        while (view != null) {
            Fragment fragmentR0 = R0(view);
            if (fragmentR0 != null) {
                return fragmentR0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void w() {
        if (e1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void w0() {
        Iterator<SpecialEffectsController> it = B().iterator();
        while (it.hasNext()) {
            it.next().o();
        }
    }

    private void x() {
        this.f23557b = false;
        this.N.clear();
        this.M.clear();
    }

    private Set<Fragment> x0(@androidx.annotation.n0 androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f23783c.size(); i10++) {
            Fragment fragment = aVar.f23783c.get(i10).f23801b;
            if (fragment != null && aVar.f23789i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean y0(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f23556a) {
            if (this.f23556a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f23556a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f23556a.get(i10).a(arrayList, arrayList2);
                }
                this.f23556a.clear();
                this.f23577v.g().removeCallbacks(this.R);
                return zA;
            } catch (Throwable th2) {
                this.f23556a.clear();
                this.f23577v.g().removeCallbacks(this.R);
                throw th2;
            }
        }
    }

    private boolean z1(@androidx.annotation.p0 String str, int i10, int i11) {
        j0(false);
        i0(true);
        Fragment fragment = this.f23580y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().w1()) {
            return true;
        }
        boolean zA1 = A1(this.M, this.N, str, i10, i11);
        if (zA1) {
            this.f23557b = true;
            try {
                G1(this.M, this.N);
                x();
            } catch (Throwable th2) {
                x();
                throw th2;
            }
        }
        h2();
        d0();
        this.f23558c.b();
        return zA1;
    }

    @androidx.annotation.n0
    List<Fragment> A0() {
        return this.f23558c.m();
    }

    boolean A1(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, @androidx.annotation.p0 String str, int i10, int i11) {
        int iP0 = p0(str, i10, (i11 & 1) != 0);
        if (iP0 < 0) {
            return false;
        }
        for (int size = this.f23559d.size() - 1; size >= iP0; size--) {
            arrayList.add(this.f23559d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    @androidx.annotation.n0
    public j B0(int i10) {
        return this.f23559d.get(i10);
    }

    public void B1(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.n0 String str, @androidx.annotation.n0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            f2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public int C0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f23559d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void C1(@androidx.annotation.n0 m mVar, boolean z10) {
        this.f23569n.o(mVar, z10);
    }

    @androidx.annotation.n0
    m0 D(@androidx.annotation.n0 Fragment fragment) {
        m0 m0VarO = this.f23558c.o(fragment.mWho);
        if (m0VarO != null) {
            return m0VarO;
        }
        m0 m0Var = new m0(this.f23569n, this.f23558c, fragment);
        m0Var.o(this.f23577v.f().getClassLoader());
        m0Var.t(this.f23576u);
        return m0Var;
    }

    void D1(@androidx.annotation.n0 Fragment fragment) {
        if (X0(2)) {
            Log.v(X, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f23558c.v(fragment);
            if (Y0(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            c2(fragment);
        }
    }

    void E(@androidx.annotation.n0 Fragment fragment) {
        if (X0(2)) {
            Log.v(X, "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (X0(2)) {
                Log.v(X, "remove from detach: " + fragment);
            }
            this.f23558c.v(fragment);
            if (Y0(fragment)) {
                this.H = true;
            }
            c2(fragment);
        }
    }

    @androidx.annotation.n0
    androidx.fragment.app.q E0() {
        return this.f23578w;
    }

    public void E1(@androidx.annotation.n0 i0 i0Var) {
        this.f23570o.remove(i0Var);
    }

    void F() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(4);
    }

    @androidx.annotation.p0
    public Fragment F0(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.n0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentO0 = o0(string);
        if (fragmentO0 == null) {
            f2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentO0;
    }

    public void F1(@androidx.annotation.n0 o oVar) {
        ArrayList<o> arrayList = this.f23568m;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    void G() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(0);
    }

    void H(@androidx.annotation.n0 Configuration configuration, boolean z10) {
        if (z10 && (this.f23577v instanceof androidx.core.content.o0)) {
            f2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.H(configuration, true);
                }
            }
        }
    }

    @androidx.annotation.n0
    public androidx.fragment.app.s H0() {
        androidx.fragment.app.s sVar = this.f23581z;
        if (sVar != null) {
            return sVar;
        }
        Fragment fragment = this.f23579x;
        return fragment != null ? fragment.mFragmentManager.H0() : this.A;
    }

    void H1(@androidx.annotation.n0 Fragment fragment) {
        this.P.r(fragment);
    }

    boolean I(@androidx.annotation.n0 MenuItem menuItem) {
        if (this.f23576u < 1) {
            return false;
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.n0
    o0 I0() {
        return this.f23558c;
    }

    void J() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(1);
    }

    @androidx.annotation.n0
    public List<Fragment> J0() {
        return this.f23558c.p();
    }

    void J1(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 g0 g0Var) {
        if (this.f23577v instanceof c1) {
            f2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.s(g0Var);
        N1(parcelable);
    }

    boolean K(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
        if (this.f23576u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null && b1(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f23560e != null) {
            for (int i10 = 0; i10 < this.f23560e.size(); i10++) {
                Fragment fragment2 = this.f23560e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f23560e = arrayList;
        return z10;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public t<?> K0() {
        return this.f23577v;
    }

    public void K1(@androidx.annotation.n0 String str) {
        h0(new r(str), false);
    }

    void L() {
        this.K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        Object obj = this.f23577v;
        if (obj instanceof androidx.core.content.p0) {
            ((androidx.core.content.p0) obj).removeOnTrimMemoryListener(this.f23572q);
        }
        Object obj2 = this.f23577v;
        if (obj2 instanceof androidx.core.content.o0) {
            ((androidx.core.content.o0) obj2).removeOnConfigurationChangedListener(this.f23571p);
        }
        Object obj3 = this.f23577v;
        if (obj3 instanceof v2) {
            ((v2) obj3).removeOnMultiWindowModeChangedListener(this.f23573r);
        }
        Object obj4 = this.f23577v;
        if (obj4 instanceof x2) {
            ((x2) obj4).removeOnPictureInPictureModeChangedListener(this.f23574s);
        }
        Object obj5 = this.f23577v;
        if ((obj5 instanceof androidx.core.view.v) && this.f23579x == null) {
            ((androidx.core.view.v) obj5).removeMenuProvider(this.f23575t);
        }
        this.f23577v = null;
        this.f23578w = null;
        this.f23579x = null;
        if (this.f23562g != null) {
            this.f23563h.remove();
            this.f23562g = null;
        }
        androidx.activity.result.g<Intent> gVar = this.D;
        if (gVar != null) {
            gVar.d();
            this.E.d();
            this.F.d();
        }
    }

    @androidx.annotation.n0
    LayoutInflater.Factory2 L0() {
        return this.f23561f;
    }

    boolean L1(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, @androidx.annotation.n0 String str) {
        BackStackState backStackStateRemove = this.f23565j.remove(str);
        if (backStackStateRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        for (androidx.fragment.app.a aVar : arrayList) {
            if (aVar.Q) {
                Iterator<p0.a> it = aVar.f23783c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f23801b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.a> it2 = backStackStateRemove.a(this, map).iterator();
        while (true) {
            boolean z10 = false;
            while (it2.hasNext()) {
                if (it2.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    void M() {
        a0(1);
    }

    @androidx.annotation.n0
    x M0() {
        return this.f23569n;
    }

    void M1(@androidx.annotation.p0 Parcelable parcelable) {
        if (this.f23577v instanceof androidx.savedstate.d) {
            f2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        N1(parcelable);
    }

    void N(boolean z10) {
        if (z10 && (this.f23577v instanceof androidx.core.content.p0)) {
            f2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.N(true);
                }
            }
        }
    }

    @androidx.annotation.p0
    Fragment N0() {
        return this.f23579x;
    }

    void N1(@androidx.annotation.p0 Parcelable parcelable) {
        m0 m0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(U) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f23577v.f().getClassLoader());
                this.f23566k.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(V) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f23577v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f23558c.y(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f23558c.w();
        Iterator<String> it = fragmentManagerState.f23611b.iterator();
        while (it.hasNext()) {
            Bundle bundleC = this.f23558c.C(it.next(), null);
            if (bundleC != null) {
                Fragment fragmentH = this.P.h(((FragmentState) bundleC.getParcelable("state")).f23620c);
                if (fragmentH != null) {
                    if (X0(2)) {
                        Log.v(X, "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    m0Var = new m0(this.f23569n, this.f23558c, fragmentH, bundleC);
                } else {
                    m0Var = new m0(this.f23569n, this.f23558c, this.f23577v.f().getClassLoader(), H0(), bundleC);
                }
                Fragment fragmentK = m0Var.k();
                fragmentK.mSavedFragmentState = bundleC;
                fragmentK.mFragmentManager = this;
                if (X0(2)) {
                    Log.v(X, "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                m0Var.o(this.f23577v.f().getClassLoader());
                this.f23558c.s(m0Var);
                m0Var.t(this.f23576u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.f23558c.c(fragment.mWho)) {
                if (X0(2)) {
                    Log.v(X, "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f23611b);
                }
                this.P.r(fragment);
                fragment.mFragmentManager = this;
                m0 m0Var2 = new m0(this.f23569n, this.f23558c, fragment);
                m0Var2.t(1);
                m0Var2.m();
                fragment.mRemoving = true;
                m0Var2.m();
            }
        }
        this.f23558c.x(fragmentManagerState.f23612c);
        if (fragmentManagerState.f23613d != null) {
            this.f23559d = new ArrayList<>(fragmentManagerState.f23613d.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f23613d;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = backStackRecordStateArr[i10].b(this);
                if (X0(2)) {
                    Log.v(X, "restoreAllState: back stack #" + i10 + " (index " + aVarB.P + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new w0(X));
                    aVarB.U("  ", printWriter, false);
                    printWriter.close();
                }
                this.f23559d.add(aVarB);
                i10++;
            }
        } else {
            this.f23559d = null;
        }
        this.f23564i.set(fragmentManagerState.f23614e);
        String str3 = fragmentManagerState.f23615f;
        if (str3 != null) {
            Fragment fragmentO0 = o0(str3);
            this.f23580y = fragmentO0;
            T(fragmentO0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f23616g;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f23565j.put(arrayList.get(i11), fragmentManagerState.f23617h.get(i11));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.f23618i);
    }

    void O(boolean z10, boolean z11) {
        if (z11 && (this.f23577v instanceof v2)) {
            f2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.O(z10, true);
                }
            }
        }
    }

    @androidx.annotation.p0
    public Fragment O0() {
        return this.f23580y;
    }

    @Deprecated
    g0 O1() {
        if (this.f23577v instanceof c1) {
            f2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.n();
    }

    void P(@androidx.annotation.n0 Fragment fragment) {
        Iterator<i0> it = this.f23570o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @androidx.annotation.n0
    a1 P0() {
        a1 a1Var = this.B;
        if (a1Var != null) {
            return a1Var;
        }
        Fragment fragment = this.f23579x;
        return fragment != null ? fragment.mFragmentManager.P0() : this.C;
    }

    void Q() {
        for (Fragment fragment : this.f23558c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Q();
            }
        }
    }

    @androidx.annotation.p0
    public FragmentStrictMode.b Q0() {
        return this.Q;
    }

    Parcelable Q1() {
        if (this.f23577v instanceof androidx.savedstate.d) {
            f2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle bundleF1 = f1();
        if (bundleF1.isEmpty()) {
            return null;
        }
        return bundleF1;
    }

    boolean R(@androidx.annotation.n0 MenuItem menuItem) {
        if (this.f23576u < 1) {
            return false;
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.n0
    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
    public Bundle f1() {
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.I = true;
        this.P.t(true);
        ArrayList<String> arrayListZ = this.f23558c.z();
        HashMap<String, Bundle> mapN = this.f23558c.n();
        if (!mapN.isEmpty()) {
            ArrayList<String> arrayListA = this.f23558c.A();
            BackStackRecordState[] backStackRecordStateArr = null;
            ArrayList<androidx.fragment.app.a> arrayList = this.f23559d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f23559d.get(i10));
                    if (X0(2)) {
                        Log.v(X, "saveAllState: adding back stack #" + i10 + ": " + this.f23559d.get(i10));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f23611b = arrayListZ;
            fragmentManagerState.f23612c = arrayListA;
            fragmentManagerState.f23613d = backStackRecordStateArr;
            fragmentManagerState.f23614e = this.f23564i.get();
            Fragment fragment = this.f23580y;
            if (fragment != null) {
                fragmentManagerState.f23615f = fragment.mWho;
            }
            fragmentManagerState.f23616g.addAll(this.f23565j.keySet());
            fragmentManagerState.f23617h.addAll(this.f23565j.values());
            fragmentManagerState.f23618i = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f23566k.keySet()) {
                bundle.putBundle(U + str, this.f23566k.get(str));
            }
            for (String str2 : mapN.keySet()) {
                bundle.putBundle(V + str2, mapN.get(str2));
            }
        } else if (X0(2)) {
            Log.v(X, "saveAllState: no fragments!");
        }
        return bundle;
    }

    void S(@androidx.annotation.n0 Menu menu) {
        if (this.f23576u < 1) {
            return;
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    @androidx.annotation.n0
    androidx.lifecycle.b1 S0(@androidx.annotation.n0 Fragment fragment) {
        return this.P.o(fragment);
    }

    public void S1(@androidx.annotation.n0 String str) {
        h0(new s(str), false);
    }

    void T0() {
        j0(true);
        if (this.f23563h.isEnabled()) {
            w1();
        } else {
            this.f23562g.f();
        }
    }

    boolean T1(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, @androidx.annotation.n0 String str) {
        int i10;
        int iP0 = p0(str, -1, true);
        if (iP0 < 0) {
            return false;
        }
        for (int i11 = iP0; i11 < this.f23559d.size(); i11++) {
            androidx.fragment.app.a aVar = this.f23559d.get(i11);
            if (!aVar.f23798r) {
                f2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = iP0; i12 < this.f23559d.size(); i12++) {
            androidx.fragment.app.a aVar2 = this.f23559d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (p0.a aVar3 : aVar2.f23783c) {
                Fragment fragment = aVar3.f23801b;
                if (fragment != null) {
                    if (!aVar3.f23802c || (i10 = aVar3.f23800a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i13 = aVar3.f23800a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb2.append(" in ");
                sb2.append(aVar2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                f2(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                f2(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.A0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f23559d.size() - iP0);
        for (int i14 = iP0; i14 < this.f23559d.size(); i14++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f23559d.size() - 1; size >= iP0; size--) {
            androidx.fragment.app.a aVarRemove = this.f23559d.remove(size);
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(aVarRemove);
            aVar4.R();
            arrayList4.set(size - iP0, new BackStackRecordState(aVar4));
            aVarRemove.Q = true;
            arrayList.add(aVarRemove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f23565j.put(str, backStackState);
        return true;
    }

    void U() {
        a0(5);
    }

    void U0(@androidx.annotation.n0 Fragment fragment) {
        if (X0(2)) {
            Log.v(X, "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        c2(fragment);
    }

    @androidx.annotation.p0
    public Fragment.SavedState U1(@androidx.annotation.n0 Fragment fragment) {
        m0 m0VarO = this.f23558c.o(fragment.mWho);
        if (m0VarO == null || !m0VarO.k().equals(fragment)) {
            f2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m0VarO.q();
    }

    void V(boolean z10, boolean z11) {
        if (z11 && (this.f23577v instanceof x2)) {
            f2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.V(z10, true);
                }
            }
        }
    }

    void V0(@androidx.annotation.n0 Fragment fragment) {
        if (fragment.mAdded && Y0(fragment)) {
            this.H = true;
        }
    }

    void V1() {
        synchronized (this.f23556a) {
            boolean z10 = true;
            if (this.f23556a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f23577v.g().removeCallbacks(this.R);
                this.f23577v.g().post(this.R);
                h2();
            }
        }
    }

    boolean W(@androidx.annotation.n0 Menu menu) {
        boolean z10 = false;
        if (this.f23576u < 1) {
            return false;
        }
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null && b1(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean W0() {
        return this.K;
    }

    void W1(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        ViewGroup viewGroupG0 = G0(fragment);
        if (viewGroupG0 == null || !(viewGroupG0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG0).setDrawDisappearingViewsLast(!z10);
    }

    void X() {
        h2();
        T(this.f23580y);
    }

    public void X1(@androidx.annotation.n0 androidx.fragment.app.s sVar) {
        this.f23581z = sVar;
    }

    void Y() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(7);
    }

    void Y1(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Lifecycle.State state) {
        if (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void Z() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(5);
    }

    void Z1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null || (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f23580y;
            this.f23580y = fragment;
            T(fragment2);
            T(this.f23580y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.l0
    public final void a(@androidx.annotation.n0 String str, @androidx.annotation.n0 Bundle bundle) {
        n nVar = this.f23567l.get(str);
        if (nVar == null || !nVar.b(Lifecycle.State.STARTED)) {
            this.f23566k.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (X0(2)) {
            Log.v(X, "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    boolean a1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void a2(@androidx.annotation.n0 a1 a1Var) {
        this.B = a1Var;
    }

    @Override // androidx.fragment.app.l0
    public final void b(@androidx.annotation.n0 String str) {
        n nVarRemove = this.f23567l.remove(str);
        if (nVarRemove != null) {
            nVarRemove.c();
        }
        if (X0(2)) {
            Log.v(X, "Clearing FragmentResultListener for key " + str);
        }
    }

    void b0() {
        this.J = true;
        this.P.t(true);
        a0(4);
    }

    boolean b1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void b2(@androidx.annotation.p0 FragmentStrictMode.b bVar) {
        this.Q = bVar;
    }

    @Override // androidx.fragment.app.l0
    @SuppressLint({"SyntheticAccessor"})
    public final void c(@androidx.annotation.n0 final String str, @androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 final k0 k0Var) {
        final Lifecycle lifecycle = yVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.v
            public void d(@androidx.annotation.n0 androidx.lifecycle.y yVar2, @androidx.annotation.n0 Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.f23566k.get(str)) != null) {
                    k0Var.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f23567l.remove(str);
                }
            }
        };
        n nVarPut = this.f23567l.put(str, new n(lifecycle, k0Var, vVar));
        if (nVarPut != null) {
            nVarPut.c();
        }
        if (X0(2)) {
            Log.v(X, "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + k0Var);
        }
        lifecycle.a(vVar);
    }

    void c0() {
        a0(2);
    }

    boolean c1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.O0()) && c1(fragmentManager.f23579x);
    }

    @Override // androidx.fragment.app.l0
    public final void d(@androidx.annotation.n0 String str) {
        this.f23566k.remove(str);
        if (X0(2)) {
            Log.v(X, "Clearing fragment result with key " + str);
        }
    }

    boolean d1(int i10) {
        return this.f23576u >= i10;
    }

    void d2(@androidx.annotation.n0 Fragment fragment) {
        if (X0(2)) {
            Log.v(X, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void e0(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f23558c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f23560e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f23560e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f23559d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f23559d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.T(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f23564i.get());
        synchronized (this.f23556a) {
            int size3 = this.f23556a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    p pVar = this.f23556a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(pVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f23577v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f23578w);
        if (this.f23579x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f23579x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f23576u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public boolean e1() {
        return this.I || this.J;
    }

    public void g2(@androidx.annotation.n0 m mVar) {
        this.f23569n.p(mVar);
    }

    void h0(@androidx.annotation.n0 p pVar, boolean z10) {
        if (!z10) {
            if (this.f23577v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            w();
        }
        synchronized (this.f23556a) {
            if (this.f23577v == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f23556a.add(pVar);
                V1();
            }
        }
    }

    boolean j0(boolean z10) {
        i0(z10);
        boolean z11 = false;
        while (y0(this.M, this.N)) {
            this.f23557b = true;
            try {
                G1(this.M, this.N);
                x();
                z11 = true;
            } catch (Throwable th2) {
                x();
                throw th2;
            }
        }
        h2();
        d0();
        this.f23558c.b();
        return z11;
    }

    void k0(@androidx.annotation.n0 p pVar, boolean z10) {
        if (z10 && (this.f23577v == null || this.K)) {
            return;
        }
        i0(z10);
        if (pVar.a(this.M, this.N)) {
            this.f23557b = true;
            try {
                G1(this.M, this.N);
                x();
            } catch (Throwable th2) {
                x();
                throw th2;
            }
        }
        h2();
        d0();
        this.f23558c.b();
    }

    void k1(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 String[] strArr, int i10) {
        if (this.F == null) {
            this.f23577v.m(fragment, strArr, i10);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.F.b(strArr);
    }

    void l1(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (this.D == null) {
            this.f23577v.q(fragment, intent, i10, bundle);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra(z.b.m.f141826b, bundle);
        }
        this.D.b(intent);
    }

    void m(androidx.fragment.app.a aVar) {
        if (this.f23559d == null) {
            this.f23559d = new ArrayList<>();
        }
        this.f23559d.add(aVar);
    }

    void m1(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E == null) {
            this.f23577v.r(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(Z, true);
            } else {
                intent2 = intent;
            }
            if (X0(2)) {
                Log.v(X, "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra(z.b.m.f141826b, bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.a(intentSender).b(intent2).c(i12, i11).a();
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (X0(2)) {
            Log.v(X, "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.E.b(intentSenderRequestA);
    }

    m0 n(@androidx.annotation.n0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.i(fragment, str);
        }
        if (X0(2)) {
            Log.v(X, "add: " + fragment);
        }
        m0 m0VarD = D(fragment);
        fragment.mFragmentManager = this;
        this.f23558c.s(m0VarD);
        if (!fragment.mDetached) {
            this.f23558c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Y0(fragment)) {
                this.H = true;
            }
        }
        return m0VarD;
    }

    @androidx.annotation.k0
    public boolean n0() {
        boolean zJ0 = j0(true);
        w0();
        return zJ0;
    }

    void n1(int i10, boolean z10) {
        t<?> tVar;
        if (this.f23577v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f23576u) {
            this.f23576u = i10;
            this.f23558c.u();
            e2();
            if (this.H && (tVar = this.f23577v) != null && this.f23576u == 7) {
                tVar.s();
                this.H = false;
            }
        }
    }

    public void o(@androidx.annotation.n0 i0 i0Var) {
        this.f23570o.add(i0Var);
    }

    @androidx.annotation.p0
    Fragment o0(@androidx.annotation.n0 String str) {
        return this.f23558c.f(str);
    }

    void o1() {
        if (this.f23577v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.t(false);
        for (Fragment fragment : this.f23558c.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void p(@androidx.annotation.n0 o oVar) {
        if (this.f23568m == null) {
            this.f23568m = new ArrayList<>();
        }
        this.f23568m.add(oVar);
    }

    void p1(@androidx.annotation.n0 FragmentContainerView fragmentContainerView) {
        View view;
        for (m0 m0Var : this.f23558c.l()) {
            Fragment fragmentK = m0Var.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                m0Var.b();
            }
        }
    }

    void q(@androidx.annotation.n0 Fragment fragment) {
        this.P.c(fragment);
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public p0 q1() {
        return u();
    }

    int r() {
        return this.f23564i.getAndIncrement();
    }

    @androidx.annotation.p0
    public Fragment r0(@androidx.annotation.d0 int i10) {
        return this.f23558c.g(i10);
    }

    void r1(@androidx.annotation.n0 m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (fragmentK.mDeferStart) {
            if (this.f23557b) {
                this.L = true;
            } else {
                fragmentK.mDeferStart = false;
                m0Var.m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void s(@androidx.annotation.n0 t<?> tVar, @androidx.annotation.n0 androidx.fragment.app.q qVar, @androidx.annotation.p0 Fragment fragment) {
        String str;
        androidx.lifecycle.y yVar;
        if (this.f23577v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f23577v = tVar;
        this.f23578w = qVar;
        this.f23579x = fragment;
        if (fragment != null) {
            o(new g(fragment));
        } else if (tVar instanceof i0) {
            o((i0) tVar);
        }
        if (this.f23579x != null) {
            h2();
        }
        if (tVar instanceof androidx.activity.s) {
            androidx.activity.s sVar = (androidx.activity.s) tVar;
            OnBackPressedDispatcher onBackPressedDispatcher = sVar.getOnBackPressedDispatcher();
            this.f23562g = onBackPressedDispatcher;
            if (fragment != null) {
                yVar = sVar;
                yVar = fragment;
            }
            yVar = sVar;
            onBackPressedDispatcher.c(yVar, this.f23563h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.D0(fragment);
        } else if (tVar instanceof c1) {
            this.P = h0.k(((c1) tVar).getViewModelStore());
        } else {
            this.P = new h0(false);
        }
        this.P.t(e1());
        this.f23558c.B(this.P);
        Object obj = this.f23577v;
        if ((obj instanceof androidx.savedstate.d) && fragment == null) {
            androidx.savedstate.b savedStateRegistry = ((androidx.savedstate.d) obj).getSavedStateRegistry();
            savedStateRegistry.j(S, new androidx.savedstate.b.c() { // from class: androidx.fragment.app.c0
                @Override // androidx.savedstate.b.c
                public final Bundle saveState() {
                    return this.f23696a.f1();
                }
            });
            Bundle bundleB = savedStateRegistry.b(S);
            if (bundleB != null) {
                N1(bundleB);
            }
        }
        Object obj2 = this.f23577v;
        if (obj2 instanceof androidx.activity.result.i) {
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.i) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = activityResultRegistry.j(str2 + "StartActivityForResult", new z.b.m(), new h());
            this.E = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new l(), new i());
            this.F = activityResultRegistry.j(str2 + "RequestPermissions", new z.b.k(), new a());
        }
        Object obj3 = this.f23577v;
        if (obj3 instanceof androidx.core.content.o0) {
            ((androidx.core.content.o0) obj3).addOnConfigurationChangedListener(this.f23571p);
        }
        Object obj4 = this.f23577v;
        if (obj4 instanceof androidx.core.content.p0) {
            ((androidx.core.content.p0) obj4).addOnTrimMemoryListener(this.f23572q);
        }
        Object obj5 = this.f23577v;
        if (obj5 instanceof v2) {
            ((v2) obj5).addOnMultiWindowModeChangedListener(this.f23573r);
        }
        Object obj6 = this.f23577v;
        if (obj6 instanceof x2) {
            ((x2) obj6).addOnPictureInPictureModeChangedListener(this.f23574s);
        }
        Object obj7 = this.f23577v;
        if ((obj7 instanceof androidx.core.view.v) && fragment == null) {
            ((androidx.core.view.v) obj7).addMenuProvider(this.f23575t);
        }
    }

    @androidx.annotation.p0
    public Fragment s0(@androidx.annotation.p0 String str) {
        return this.f23558c.h(str);
    }

    public void s1() {
        h0(new q(null, -1, 0), false);
    }

    void t(@androidx.annotation.n0 Fragment fragment) {
        if (X0(2)) {
            Log.v(X, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f23558c.a(fragment);
            if (X0(2)) {
                Log.v(X, "add from attach: " + fragment);
            }
            if (Y0(fragment)) {
                this.H = true;
            }
        }
    }

    Fragment t0(@androidx.annotation.n0 String str) {
        return this.f23558c.i(str);
    }

    public void t1(int i10, int i11) {
        u1(i10, i11, false);
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f23579x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f23579x)));
            sb2.append(z5.g.f141884d);
        } else {
            t<?> tVar = this.f23577v;
            if (tVar != null) {
                sb2.append(tVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f23577v)));
                sb2.append(z5.g.f141884d);
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    @androidx.annotation.n0
    public p0 u() {
        return new androidx.fragment.app.a(this);
    }

    void u1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            h0(new q(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean v() {
        boolean zY0 = false;
        for (Fragment fragment : this.f23558c.m()) {
            if (fragment != null) {
                zY0 = Y0(fragment);
            }
            if (zY0) {
                return true;
            }
        }
        return false;
    }

    public void v1(@androidx.annotation.p0 String str, int i10) {
        h0(new q(str, -1, i10), false);
    }

    @androidx.annotation.k0
    public boolean w1() {
        return z1(null, -1, 0);
    }

    public boolean x1(int i10, int i11) {
        if (i10 >= 0) {
            return z1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void y(@androidx.annotation.n0 String str) {
        h0(new k(str), false);
    }

    @androidx.annotation.k0
    public boolean y1(@androidx.annotation.p0 String str, int i10) {
        return z1(str, -1, i10);
    }

    boolean z(@androidx.annotation.n0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.n0 ArrayList<Boolean> arrayList2, @androidx.annotation.n0 String str) {
        if (L1(arrayList, arrayList2, str)) {
            return A1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    int z0() {
        return this.f23558c.k();
    }
}
