package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f1505i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f1506j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f1507k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f1508l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f1509m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f1510n = "ActivityResultRegistry";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f1511o = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f1512a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f1513b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<String, Integer> f1514c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, d> f1515d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<String> f1516e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Map<String, c<?>> f1517f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, Object> f1518g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Bundle f1519h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends g<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.a f1525b;

        a(String str, z.a aVar) {
            this.f1524a = str;
            this.f1525b = aVar;
        }

        @Override // androidx.activity.result.g
        @n0
        public z.a<I, ?> a() {
            return this.f1525b;
        }

        @Override // androidx.activity.result.g
        public void c(I i10, @p0 androidx.core.app.i iVar) throws Exception {
            Integer num = ActivityResultRegistry.this.f1514c.get(this.f1524a);
            if (num != null) {
                ActivityResultRegistry.this.f1516e.add(this.f1524a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1525b, i10, iVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f1516e.remove(this.f1524a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1525b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.g
        public void d() {
            ActivityResultRegistry.this.l(this.f1524a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends g<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.a f1528b;

        b(String str, z.a aVar) {
            this.f1527a = str;
            this.f1528b = aVar;
        }

        @Override // androidx.activity.result.g
        @n0
        public z.a<I, ?> a() {
            return this.f1528b;
        }

        @Override // androidx.activity.result.g
        public void c(I i10, @p0 androidx.core.app.i iVar) throws Exception {
            Integer num = ActivityResultRegistry.this.f1514c.get(this.f1527a);
            if (num != null) {
                ActivityResultRegistry.this.f1516e.add(this.f1527a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1528b, i10, iVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f1516e.remove(this.f1527a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1528b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.g
        public void d() {
            ActivityResultRegistry.this.l(this.f1527a);
        }
    }

    public static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.activity.result.a<O> f1530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z.a<?, O> f1531b;

        c(androidx.activity.result.a<O> aVar, z.a<?, O> aVar2) {
            this.f1530a = aVar;
            this.f1531b = aVar2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lifecycle f1532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<v> f1533b = new ArrayList<>();

        d(@n0 Lifecycle lifecycle) {
            this.f1532a = lifecycle;
        }

        void a(@n0 v vVar) {
            this.f1532a.a(vVar);
            this.f1533b.add(vVar);
        }

        void b() {
            Iterator<v> it = this.f1533b.iterator();
            while (it.hasNext()) {
                this.f1532a.d(it.next());
            }
            this.f1533b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f1513b.put(Integer.valueOf(i10), str);
        this.f1514c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, @p0 Intent intent, @p0 c<O> cVar) {
        if (cVar == null || cVar.f1530a == null || !this.f1516e.contains(str)) {
            this.f1518g.remove(str);
            this.f1519h.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            cVar.f1530a.a(cVar.f1531b.c(i10, intent));
            this.f1516e.remove(str);
        }
    }

    private int e() {
        int iNextInt = this.f1512a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f1513b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.f1512a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f1514c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @k0
    public final boolean b(int i10, int i11, @p0 Intent intent) {
        String str = this.f1513b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f1517f.get(str));
        return true;
    }

    @k0
    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.a<?> aVar;
        String str = this.f1513b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f1517f.get(str);
        if (cVar == null || (aVar = cVar.f1530a) == null) {
            this.f1519h.remove(str);
            this.f1518g.put(str, o10);
            return true;
        }
        if (!this.f1516e.remove(str)) {
            return true;
        }
        aVar.a(o10);
        return true;
    }

    @k0
    public abstract <I, O> void f(int i10, @n0 z.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, @p0 androidx.core.app.i iVar);

    public final void g(@p0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f1505i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f1506j);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f1516e = bundle.getStringArrayList(f1507k);
        this.f1512a = (Random) bundle.getSerializable(f1509m);
        this.f1519h.putAll(bundle.getBundle(f1508l));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f1514c.containsKey(str)) {
                Integer numRemove = this.f1514c.remove(str);
                if (!this.f1519h.containsKey(str)) {
                    this.f1513b.remove(numRemove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(@n0 Bundle bundle) {
        bundle.putIntegerArrayList(f1505i, new ArrayList<>(this.f1514c.values()));
        bundle.putStringArrayList(f1506j, new ArrayList<>(this.f1514c.keySet()));
        bundle.putStringArrayList(f1507k, new ArrayList<>(this.f1516e));
        bundle.putBundle(f1508l, (Bundle) this.f1519h.clone());
        bundle.putSerializable(f1509m, this.f1512a);
    }

    @n0
    public final <I, O> g<I> i(@n0 final String str, @n0 y yVar, @n0 final z.a<I, O> aVar, @n0 final androidx.activity.result.a<O> aVar2) {
        Lifecycle lifecycle = yVar.getLifecycle();
        if (lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + yVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f1515d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new v() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar2, @n0 Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f1517f.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f1517f.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f1518g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f1518g.get(str);
                    ActivityResultRegistry.this.f1518g.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f1519h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f1519h.remove(str);
                    aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                }
            }
        });
        this.f1515d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    public final <I, O> g<I> j(@n0 String str, @n0 z.a<I, O> aVar, @n0 androidx.activity.result.a<O> aVar2) {
        k(str);
        this.f1517f.put(str, new c<>(aVar2, aVar));
        if (this.f1518g.containsKey(str)) {
            Object obj = this.f1518g.get(str);
            this.f1518g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f1519h.getParcelable(str);
        if (activityResult != null) {
            this.f1519h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    @k0
    final void l(@n0 String str) {
        Integer numRemove;
        if (!this.f1516e.contains(str) && (numRemove = this.f1514c.remove(str)) != null) {
            this.f1513b.remove(numRemove);
        }
        this.f1517f.remove(str);
        if (this.f1518g.containsKey(str)) {
            Log.w(f1510n, "Dropping pending result for request " + str + ": " + this.f1518g.get(str));
            this.f1518g.remove(str);
        }
        if (this.f1519h.containsKey(str)) {
            Log.w(f1510n, "Dropping pending result for request " + str + ": " + this.f1519h.getParcelable(str));
            this.f1519h.remove(str);
        }
        d dVar = this.f1515d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f1515d.remove(str);
        }
    }
}
