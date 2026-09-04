package androidx.fragment.app.strictmode;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import dl.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.e;
import xh.m;

/* JADX INFO: compiled from: FragmentStrictMode.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f23832b = "FragmentStrictMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final FragmentStrictMode f23831a = new FragmentStrictMode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static b f23833c = b.f23835e;

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    public interface a {
        void a(@d Violation violation);
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        public static final C0170b f23834d = new C0170b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @d
        @e
        public static final b f23835e = new b(d1.k(), null, s0.z());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final Set<Flag> f23836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final a f23837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        private final Map<String, Set<Class<? extends Violation>>> f23838c;

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.e
            private a f23840b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @d
            private final Set<Flag> f23839a = new LinkedHashSet();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @d
            private final Map<String, Set<Class<? extends Violation>>> f23841c = new LinkedHashMap();

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a a(@d Class<? extends Fragment> fragmentClass, @d Class<? extends Violation> violationClass) {
                f0.p(fragmentClass, "fragmentClass");
                f0.p(violationClass, "violationClass");
                String fragmentClassString = fragmentClass.getName();
                f0.o(fragmentClassString, "fragmentClassString");
                return b(fragmentClassString, violationClass);
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a b(@d String fragmentClass, @d Class<? extends Violation> violationClass) {
                f0.p(fragmentClass, "fragmentClass");
                f0.p(violationClass, "violationClass");
                Set<Class<? extends Violation>> linkedHashSet = this.f23841c.get(fragmentClass);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.add(violationClass);
                this.f23841c.put(fragmentClass, linkedHashSet);
                return this;
            }

            @d
            public final b c() {
                if (this.f23840b == null && !this.f23839a.contains(Flag.PENALTY_DEATH)) {
                    m();
                }
                return new b(this.f23839a, this.f23840b, this.f23841c);
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a d() {
                this.f23839a.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a e() {
                this.f23839a.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a f() {
                this.f23839a.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a g() {
                this.f23839a.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a h() {
                this.f23839a.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a i() {
                this.f23839a.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a j() {
                this.f23839a.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a k() {
                this.f23839a.add(Flag.PENALTY_DEATH);
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a l(@d a listener) {
                f0.p(listener, "listener");
                this.f23840b = listener;
                return this;
            }

            @d
            @SuppressLint({"BuilderSetStyle"})
            public final a m() {
                this.f23839a.add(Flag.PENALTY_LOG);
                return this;
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        public static final class C0170b {
            private C0170b() {
            }

            public /* synthetic */ C0170b(u uVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@d Set<? extends Flag> flags, @dl.e a aVar, @d Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            f0.p(flags, "flags");
            f0.p(allowedViolations, "allowedViolations");
            this.f23836a = flags;
            this.f23837b = aVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f23838c = linkedHashMap;
        }

        @d
        public final Set<Flag> a() {
            return this.f23836a;
        }

        @dl.e
        public final a b() {
            return this.f23837b;
        }

        @d
        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.f23838c;
        }
    }

    private FragmentStrictMode() {
    }

    private final b d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                f0.o(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.Q0() != null) {
                    b bVarQ0 = parentFragmentManager.Q0();
                    f0.m(bVarQ0);
                    return bVarQ0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f23833c;
    }

    private final void e(final b bVar, final Violation violation) {
        Fragment fragmentA = violation.a();
        final String name = fragmentA.getClass().getName();
        if (bVar.a().contains(Flag.PENALTY_LOG)) {
            Log.d(f23832b, "Policy violation in " + name, violation);
        }
        if (bVar.b() != null) {
            t(fragmentA, new Runnable() { // from class: i2.a
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.f(bVar, violation);
                }
            });
        }
        if (bVar.a().contains(Flag.PENALTY_DEATH)) {
            t(fragmentA, new Runnable() { // from class: i2.b
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.g(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b policy, Violation violation) {
        f0.p(policy, "$policy");
        f0.p(violation, "$violation");
        policy.b().a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Violation violation) {
        f0.p(violation, "$violation");
        Log.e(f23832b, "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void h(Violation violation) {
        if (FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void i(@d Fragment fragment, @d String previousFragmentId) {
        f0.p(fragment, "fragment");
        f0.p(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(fragmentReuseViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.v(bVarD, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.e(bVarD, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void j(@d Fragment fragment, @dl.e ViewGroup viewGroup) {
        f0.p(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(fragmentTagUsageViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.v(bVarD, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void k(@d Fragment fragment) {
        f0.p(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(getRetainInstanceUsageViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.v(bVarD, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void l(@d Fragment fragment) {
        f0.p(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(getTargetFragmentRequestCodeUsageViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.v(bVarD, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void m(@d Fragment fragment) {
        f0.p(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(getTargetFragmentUsageViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.v(bVarD, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void o(@d Fragment fragment) {
        f0.p(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(setRetainInstanceUsageViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.v(bVarD, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void p(@d Fragment violatingFragment, @d Fragment targetFragment, int i10) {
        f0.p(violatingFragment, "violatingFragment");
        f0.p(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i10);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(setTargetFragmentUsageViolation);
        b bVarD = fragmentStrictMode.d(violatingFragment);
        if (bVarD.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.v(bVarD, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.e(bVarD, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void q(@d Fragment fragment, boolean z10) {
        f0.p(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z10);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(setUserVisibleHintViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.v(bVarD, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.e(bVarD, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void r(@d Fragment fragment, @d ViewGroup container) {
        f0.p(fragment, "fragment");
        f0.p(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(wrongFragmentContainerViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.v(bVarD, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.e(bVarD, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void s(@d Fragment fragment, @d Fragment expectedParentFragment, int i10) {
        f0.p(fragment, "fragment");
        f0.p(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i10);
        FragmentStrictMode fragmentStrictMode = f23831a;
        fragmentStrictMode.h(wrongNestedHierarchyViolation);
        b bVarD = fragmentStrictMode.d(fragment);
        if (bVarD.a().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.v(bVarD, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.e(bVarD, wrongNestedHierarchyViolation);
        }
    }

    private final void t(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerG = fragment.getParentFragmentManager().K0().g();
        f0.o(handlerG, "fragment.parentFragmentManager.host.handler");
        if (f0.g(handlerG.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerG.post(runnable);
        }
    }

    private final boolean v(b bVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = bVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (f0.g(cls2.getSuperclass(), Violation.class) || !CollectionsKt___CollectionsKt.R1(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    @d
    public final b c() {
        return f23833c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j1
    public final void n(@d Violation violation) {
        f0.p(violation, "violation");
        h(violation);
        Fragment fragmentA = violation.a();
        b bVarD = d(fragmentA);
        if (v(bVarD, fragmentA.getClass(), violation.getClass())) {
            e(bVarD, violation);
        }
    }

    public final void u(@d b bVar) {
        f0.p(bVar, "<set-?>");
        f23833c = bVar;
    }
}
