package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class Recreator implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f27381c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f27382d = "classes_to_restore";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f27383e = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d f27384b;

    /* JADX INFO: compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Recreator.kt */
    public static final class b implements androidx.savedstate.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Set<String> f27385a;

        public b(@dl.d androidx.savedstate.b registry) {
            f0.p(registry, "registry");
            this.f27385a = new LinkedHashSet();
            registry.j(Recreator.f27383e, this);
        }

        public final void a(@dl.d String className) {
            f0.p(className, "className");
            this.f27385a.add(className);
        }

        @Override // androidx.savedstate.b.c
        @dl.d
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f27382d, new ArrayList<>(this.f27385a));
            return bundle;
        }
    }

    public Recreator(@dl.d d owner) {
        f0.p(owner, "owner");
        this.f27384b = owner;
    }

    private final void b(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.b.a.class);
            f0.o(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    f0.o(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((androidx.savedstate.b.a) objNewInstance).a(this.f27384b);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        f0.p(source, "source");
        f0.p(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleB = this.f27384b.getSavedStateRegistry().b(f27383e);
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList(f27382d);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
