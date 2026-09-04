package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.r;
import androidx.compose.ui.text.platform.s;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import xh.h;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\rJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\bJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\b\u0010$\u001a\u00020#H\u0016J'\u0010(\u001a\u00028\u0002\"\u0004\b\u0002\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00020&H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R0\u00101\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R$\u00105\u001a\u0012\u0012\u0004\u0012\u00028\u000002j\b\u0012\u0004\u0012\u00028\u0000`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R$\u0010:\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00107R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/caches/b;", "K", androidx.exifinterface.media.a.X4, "", "key", "value", "", "o", "(Ljava/lang/Object;Ljava/lang/Object;)I", "maxSize", "Lkotlin/b2;", "n", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "t", "m", "", "evicted", "oldValue", "newValue", "d", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "q", "e", "i", RXScreenCaptureService.KEY_HEIGHT, "j", ak.aF, "l", "f", "", "r", "", "toString", "R", "Lkotlin/Function0;", "block", ak.aB, "(Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/s;", ak.av, "Landroidx/compose/ui/text/platform/s;", Constants.KEY_MONIROT, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "p", "()I", UiKitSpanObj.TYPE_SIZE, "putCount", "createCount", "evictionCount", "hitCount", "missCount", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s monitor = r.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<K, V> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LinkedHashSet<K> keySet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    public b(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.maxSize = i10;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int o(K key, V value) {
        int iQ = q(key, value);
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException(("Negative size: " + key + n5.a.f132013h + value).toString());
    }

    @e
    protected V b(K key) {
        return null;
    }

    public final int c() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.createCount;
        }
        return i10;
    }

    protected void d(boolean evicted, K key, V oldValue, @e V newValue) {
    }

    public final void e() {
        t(-1);
    }

    public final int f() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    @e
    public final V g(K key) {
        synchronized (this.monitor) {
            V v10 = this.map.get(key);
            if (v10 != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v10;
            }
            this.missCount++;
            V vB = b(key);
            if (vB == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                V vPut = this.map.put(key, vB);
                this.keySet.remove(key);
                this.keySet.add(key);
                if (vPut != null) {
                    this.map.put(key, vPut);
                    v10 = vPut;
                } else {
                    this.size = p() + o(key, vB);
                }
                b2 b2Var = b2.f124493a;
            }
            if (v10 != null) {
                d(false, key, vB, v10);
                return v10;
            }
            t(this.maxSize);
            return vB;
        }
    }

    public final int h() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int i() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int j() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.missCount;
        }
        return i10;
    }

    @e
    public final V k(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            this.putCount++;
            this.size = p() + o(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size = p() - o(key, vPut);
            }
            if (this.keySet.contains(key)) {
                this.keySet.remove(key);
            }
            this.keySet.add(key);
        }
        if (vPut != null) {
            d(false, key, vPut, value);
        }
        t(this.maxSize);
        return vPut;
    }

    public final int l() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.putCount;
        }
        return i10;
    }

    @e
    public final V m(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            vRemove = this.map.remove(key);
            this.keySet.remove(key);
            if (vRemove != null) {
                this.size = p() - o(key, vRemove);
            }
            b2 b2Var = b2.f124493a;
        }
        if (vRemove != null) {
            d(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void n(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.monitor) {
            this.maxSize = i10;
            b2 b2Var = b2.f124493a;
        }
        t(i10);
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    public final int p() {
        int i10;
        synchronized (this.monitor) {
            i10 = this.size;
        }
        return i10;
    }

    protected int q(K key, V value) {
        return 1;
    }

    @dl.d
    public final Map<K, V> r() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            for (K k10 : this.keySet) {
                V v10 = this.map.get(k10);
                f0.m(v10);
                linkedHashMap.put(k10, v10);
            }
        }
        return linkedHashMap;
    }

    public final <R> R s(@dl.d yh.a<? extends R> block) {
        R rInvoke;
        f0.p(block, "block");
        synchronized (this.monitor) {
            try {
                rInvoke = block.invoke();
                c0.d(1);
            } finally {
                c0.d(1);
                c0.c(1);
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(int i10) {
        Object objU2;
        V v10;
        while (true) {
            synchronized (this.monitor) {
                if (p() < 0 || ((this.map.isEmpty() && p() != 0) || this.map.isEmpty() != this.keySet.isEmpty())) {
                    break;
                }
                if (p() <= i10 || this.map.isEmpty()) {
                    objU2 = null;
                    v10 = null;
                } else {
                    objU2 = CollectionsKt___CollectionsKt.u2(this.keySet);
                    v10 = this.map.get(objU2);
                    if (v10 == null) {
                        throw new IllegalStateException("inconsistent state");
                    }
                    w0.k(this.map).remove(objU2);
                    w0.a(this.keySet).remove(objU2);
                    int iP = p();
                    f0.m(objU2);
                    f0.m(v10);
                    this.size = iP - o(objU2, v10);
                    this.evictionCount++;
                }
                b2 b2Var = b2.f124493a;
            }
            if (objU2 == null && v10 == null) {
                return;
            }
            f0.m(objU2);
            f0.m(v10);
            d(true, objU2, v10, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    @dl.d
    public String toString() {
        String str;
        synchronized (this.monitor) {
            int i10 = this.hitCount;
            int i11 = this.missCount + i10;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
