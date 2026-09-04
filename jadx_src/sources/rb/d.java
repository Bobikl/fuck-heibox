package rb;

import android.os.Bundle;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: StateSaver.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f138869b = "uuid_%s_%s";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f138868a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ConcurrentHashMap<String, Bundle> f138870c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final WeakHashMap<Object, String> f138871d = new WeakHashMap<>();

    private d() {
    }

    private final void b(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.f32115yf, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f138870c.remove(str);
    }

    private final String c(Object obj) {
        String strW2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Bf, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        v0 v0Var = v0.f124986a;
        Object[] objArr = new Object[2];
        objArr[0] = obj.getClass().getName();
        String str = "null";
        if ((obj instanceof c) && (strW2 = ((c) obj).W2()) != null) {
            str = strW2;
        }
        objArr[1] = str;
        String str2 = String.format(f138869b, Arrays.copyOf(objArr, 2));
        f0.o(str2, "format(...)");
        return str2;
    }

    private final String d(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Af, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        WeakHashMap<Object, String> weakHashMap = f138871d;
        String str = weakHashMap.get(obj);
        if (str != null) {
            return str;
        }
        String string = UUID.randomUUID().toString();
        weakHashMap.put(obj, string);
        return string;
    }

    private final Bundle e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.f32098xf, new Class[]{String.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        ConcurrentHashMap<String, Bundle> concurrentHashMap = f138870c;
        Bundle bundle = concurrentHashMap.containsKey(str) ? concurrentHashMap.get(str) : null;
        b(str);
        return bundle;
    }

    private final String f(Object obj, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, bundle}, this, changeQuickRedirect, false, bb.c.e.Cf, new Class[]{Object.class, Bundle.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        WeakHashMap<Object, String> weakHashMap = f138871d;
        String string = weakHashMap.containsKey(obj) ? weakHashMap.get(obj) : bundle.getString(c(obj), null);
        if (string != null) {
            weakHashMap.put(obj, string);
        }
        return string;
    }

    private final void i(String str, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, bb.c.e.f32081wf, new Class[]{String.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("StateSaver, saveToMemory, uuid = " + str + ", bundle = " + bundle);
        f138870c.put(str, bundle);
    }

    public final void a(@dl.d Object target, boolean z10) {
        String strRemove;
        if (PatchProxy.proxy(new Object[]{target, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f32132zf, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        if (!z10 || (strRemove = f138871d.remove(target)) == null) {
            return;
        }
        b(strRemove);
    }

    public final void g(@dl.d Object target, @dl.e Bundle bundle) {
        String strF;
        if (PatchProxy.proxy(new Object[]{target, bundle}, this, changeQuickRedirect, false, bb.c.e.f32064vf, new Class[]{Object.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        if (bundle == null || (strF = f(target, bundle)) == null) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StateSaver, restoreInstanceState, target = ");
        sb2.append(target);
        sb2.append(", saveKey = ");
        boolean z10 = target instanceof c;
        sb2.append(z10 ? ((c) target).W2() : "null");
        sb2.append(", uuid = ");
        sb2.append(strF);
        sb2.append(", state = ");
        sb2.append(bundle);
        sb2.append(", mUuidBundleMap = ");
        sb2.append(f138870c);
        aVar.q(sb2.toString());
        if (z10) {
            ((c) target).p3(e(strF));
        }
    }

    public final void h(@dl.d Object target, @dl.d Bundle systemOutState, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{target, systemOutState, bundle}, this, changeQuickRedirect, false, bb.c.e.f32047uf, new Class[]{Object.class, Bundle.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        f0.p(systemOutState, "systemOutState");
        String strD = d(target);
        systemOutState.putString(c(target), strD);
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StateSaver, saveInstanceState, target = ");
        sb2.append(target);
        sb2.append(", saveKey = ");
        sb2.append(target instanceof c ? ((c) target).W2() : "null");
        sb2.append(", processKillState = ");
        sb2.append(bundle);
        sb2.append("nonConfigState = ");
        sb2.append(systemOutState);
        aVar.q(sb2.toString());
        if (bundle != null) {
            f138868a.i(strD, bundle);
        }
    }
}
