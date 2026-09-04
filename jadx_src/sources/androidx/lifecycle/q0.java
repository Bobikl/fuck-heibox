package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.e1;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f24237g = "values";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f24238h = "keys";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<String, Object> f24240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, androidx.savedstate.b.c> f24241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<String, b<?>> f24242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<String, kotlinx.coroutines.flow.j<Object>> f24243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.savedstate.b.c f24244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f24236f = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final Class<? extends Object>[] f24239i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final q0 a(@dl.e Bundle bundle, @dl.e Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new q0();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.f0.o(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new q0(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(q0.f24237g);
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new q0(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean b(@dl.e Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : q0.f24239i) {
                kotlin.jvm.internal.f0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    public static final class b<T> extends i0<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @dl.d
        private String f24245m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private q0 f24246n;

        public b(@dl.e q0 q0Var, @dl.d String key) {
            kotlin.jvm.internal.f0.p(key, "key");
            this.f24245m = key;
            this.f24246n = q0Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.e q0 q0Var, @dl.d String key, T t10) {
            super(t10);
            kotlin.jvm.internal.f0.p(key, "key");
            this.f24245m = key;
            this.f24246n = q0Var;
        }

        @Override // androidx.lifecycle.i0, androidx.lifecycle.LiveData
        public void r(T t10) {
            q0 q0Var = this.f24246n;
            if (q0Var != null) {
                q0Var.f24240a.put(this.f24245m, t10);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) q0Var.f24243d.get(this.f24245m);
                if (jVar != null) {
                    jVar.setValue(t10);
                }
            }
            super.r(t10);
        }

        public final void s() {
            this.f24246n = null;
        }
    }

    public q0() {
        this.f24240a = new LinkedHashMap();
        this.f24241b = new LinkedHashMap();
        this.f24242c = new LinkedHashMap();
        this.f24243d = new LinkedHashMap();
        this.f24244e = new androidx.savedstate.b.c() { // from class: androidx.lifecycle.p0
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return q0.p(this.f24235a);
            }
        };
    }

    public q0(@dl.d Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.f0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24240a = linkedHashMap;
        this.f24241b = new LinkedHashMap();
        this.f24242c = new LinkedHashMap();
        this.f24243d = new LinkedHashMap();
        this.f24244e = new androidx.savedstate.b.c() { // from class: androidx.lifecycle.p0
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return q0.p(this.f24235a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final q0 g(@dl.e Bundle bundle, @dl.e Bundle bundle2) {
        return f24236f.a(bundle, bundle2);
    }

    private final <T> i0<T> k(String str, boolean z10, T t10) {
        b<?> bVar;
        b<?> bVar2 = this.f24242c.get(str);
        b<?> bVar3 = bVar2 instanceof i0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.f24240a.containsKey(str)) {
            bVar = new b<>(this, str, this.f24240a.get(str));
        } else if (z10) {
            this.f24240a.put(str, t10);
            bVar = new b<>(this, str, t10);
        } else {
            bVar = new b<>(this, str);
        }
        this.f24242c.put(str, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle p(q0 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.s0.D0(this$0.f24241b).entrySet()) {
            this$0.q((String) entry.getKey(), ((androidx.savedstate.b.c) entry.getValue()).saveState());
        }
        Set<String> setKeySet = this$0.f24240a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f24240a.get(str));
        }
        return androidx.core.os.e.b(kotlin.c1.a("keys", arrayList), kotlin.c1.a(f24237g, arrayList2));
    }

    @androidx.annotation.k0
    public final void e(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        this.f24241b.remove(key);
    }

    @androidx.annotation.k0
    public final boolean f(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return this.f24240a.containsKey(key);
    }

    @androidx.annotation.k0
    @dl.e
    public final <T> T h(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        try {
            return (T) this.f24240a.get(key);
        } catch (ClassCastException unused) {
            n(key);
            return null;
        }
    }

    @dl.d
    @androidx.annotation.k0
    public final <T> i0<T> i(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        i0<T> i0VarK = k(key, false, null);
        kotlin.jvm.internal.f0.n(i0VarK, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return i0VarK;
    }

    @dl.d
    @androidx.annotation.k0
    public final <T> i0<T> j(@dl.d String key, T t10) {
        kotlin.jvm.internal.f0.p(key, "key");
        return k(key, true, t10);
    }

    @dl.d
    @androidx.annotation.k0
    public final <T> kotlinx.coroutines.flow.u<T> l(@dl.d String key, T t10) {
        kotlin.jvm.internal.f0.p(key, "key");
        Map<String, kotlinx.coroutines.flow.j<Object>> map = this.f24243d;
        kotlinx.coroutines.flow.j<Object> jVarA = map.get(key);
        if (jVarA == null) {
            if (!this.f24240a.containsKey(key)) {
                this.f24240a.put(key, t10);
            }
            jVarA = kotlinx.coroutines.flow.v.a(this.f24240a.get(key));
            this.f24243d.put(key, jVarA);
            map.put(key, jVarA);
        }
        kotlinx.coroutines.flow.u<T> uVarM = kotlinx.coroutines.flow.g.m(jVarA);
        kotlin.jvm.internal.f0.n(uVarM, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return uVarM;
    }

    @dl.d
    @androidx.annotation.k0
    public final Set<String> m() {
        return e1.C(e1.C(this.f24240a.keySet(), this.f24241b.keySet()), this.f24242c.keySet());
    }

    @androidx.annotation.k0
    @dl.e
    public final <T> T n(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        T t10 = (T) this.f24240a.remove(key);
        b<?> bVarRemove = this.f24242c.remove(key);
        if (bVarRemove != null) {
            bVarRemove.s();
        }
        this.f24243d.remove(key);
        return t10;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.savedstate.b.c o() {
        return this.f24244e;
    }

    @androidx.annotation.k0
    public final <T> void q(@dl.d String key, @dl.e T t10) {
        kotlin.jvm.internal.f0.p(key, "key");
        if (!f24236f.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            kotlin.jvm.internal.f0.m(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.f24242c.get(key);
        b<?> bVar2 = bVar instanceof i0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.r(t10);
        } else {
            this.f24240a.put(key, t10);
        }
        kotlinx.coroutines.flow.j<Object> jVar = this.f24243d.get(key);
        if (jVar == null) {
            return;
        }
        jVar.setValue(t10);
    }

    @androidx.annotation.k0
    public final void r(@dl.d String key, @dl.d androidx.savedstate.b.c provider) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(provider, "provider");
        this.f24241b.put(key, provider);
    }
}
