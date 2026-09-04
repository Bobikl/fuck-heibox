package androidx.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
public class z0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final i0.d<K, V> f3758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i0.b f3759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3765i;

    public z0(@androidx.annotation.f0(from = 1, to = Long.MAX_VALUE) int i10) {
        this.f3757a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f3758b = new i0.d<>(0, 0.75f);
        this.f3759c = new i0.b();
    }

    private final int n(K k10, V v10) {
        int iP = p(k10, v10);
        if (iP >= 0) {
            return iP;
        }
        throw new IllegalStateException(("Negative size: " + k10 + n5.a.f132013h + v10).toString());
    }

    @dl.e
    protected V a(@dl.d K key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return null;
    }

    public final int b() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3762f;
        }
        return i10;
    }

    protected void c(boolean z10, @dl.d K key, @dl.d V oldValue, @dl.e V v10) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(oldValue, "oldValue");
    }

    public final void d() {
        r(-1);
    }

    public final int e() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3763g;
        }
        return i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @dl.e
    public final V f(@dl.d K key) {
        V v10;
        kotlin.jvm.internal.f0.p(key, "key");
        synchronized (this.f3759c) {
            V vA = this.f3758b.a(key);
            if (vA != null) {
                this.f3764h++;
                return vA;
            }
            this.f3765i++;
            V vA2 = a(key);
            if (vA2 == null) {
                return null;
            }
            synchronized (this.f3759c) {
                this.f3762f++;
                v10 = (V) this.f3758b.d(key, vA2);
                if (v10 != null) {
                    this.f3758b.d(key, v10);
                } else {
                    this.f3760d += n(key, vA2);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                }
            }
            if (v10 != null) {
                c(false, key, vA2, v10);
                return v10;
            }
            r(this.f3757a);
            return vA2;
        }
    }

    public final int g() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3764h;
        }
        return i10;
    }

    public final int h() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3757a;
        }
        return i10;
    }

    public final int i() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3765i;
        }
        return i10;
    }

    @dl.e
    public final V j(@dl.d K key, @dl.d V value) {
        V vD;
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(value, "value");
        synchronized (this.f3759c) {
            this.f3761e++;
            this.f3760d += n(key, value);
            vD = this.f3758b.d(key, value);
            if (vD != null) {
                this.f3760d -= n(key, vD);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        if (vD != null) {
            c(false, key, vD, value);
        }
        r(this.f3757a);
        return vD;
    }

    public final int k() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3761e;
        }
        return i10;
    }

    @dl.e
    public final V l(@dl.d K key) {
        V vE;
        kotlin.jvm.internal.f0.p(key, "key");
        synchronized (this.f3759c) {
            vE = this.f3758b.e(key);
            if (vE != null) {
                this.f3760d -= n(key, vE);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        if (vE != null) {
            c(false, key, vE, null);
        }
        return vE;
    }

    public void m(@androidx.annotation.f0(from = 1, to = Long.MAX_VALUE) int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.f3759c) {
            this.f3757a = i10;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        r(i10);
    }

    public final int o() {
        int i10;
        synchronized (this.f3759c) {
            i10 = this.f3760d;
        }
        return i10;
    }

    protected int p(@dl.d K key, @dl.d V value) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final Map<K, V> q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f3759c) {
            Iterator<T> it = this.f3758b.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f3759c) {
                if (!(this.f3760d >= 0 && (!this.f3758b.c() || this.f3760d == 0))) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
                }
                if (this.f3760d > i10 && !this.f3758b.c()) {
                    Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.z2(this.f3758b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f3758b.e((K) key);
                    this.f3760d -= n(key, value);
                    this.f3763g++;
                }
                return;
            }
            c(true, key, value, null);
        }
    }

    @dl.d
    public String toString() {
        String str;
        synchronized (this.f3759c) {
            int i10 = this.f3764h;
            int i11 = this.f3765i + i10;
            str = "LruCache[maxSize=" + this.f3757a + ",hits=" + this.f3764h + ",misses=" + this.f3765i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
