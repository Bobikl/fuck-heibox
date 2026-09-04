package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: StepTaskExecuteManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile a0 f95328f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, ArrayDeque<a>> f95329a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Integer> f95330b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, AtomicInteger> f95331c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayDeque<a> f95332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f95333e;

    /* JADX INFO: compiled from: StepTaskExecuteManager.java */
    public interface a {
        void a();
    }

    private a0() {
        this.f95329a.put("default", new ArrayDeque<>());
        this.f95330b.put("default", 1);
        this.f95331c.put("default", new AtomicInteger(0));
    }

    private void e() {
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48865, new Class[0], Void.TYPE).isSupported || (aVar = this.f95333e) == null) {
            return;
        }
        aVar.a();
    }

    private Integer f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48866, new Class[]{String.class}, Integer.class);
        return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : this.f95330b.get(str);
    }

    public static a0 g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48864, new Class[0], a0.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0) patchProxyResultProxy.result;
        }
        if (f95328f == null) {
            synchronized (a0.class) {
                f95328f = new a0();
            }
        }
        return f95328f;
    }

    private void l(String str, Integer num) {
        if (PatchProxy.proxy(new Object[]{str, num}, this, changeQuickRedirect, false, 48867, new Class[]{String.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95330b.put(str, num);
    }

    public boolean a(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 48872, new Class[]{a.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(aVar, "default");
    }

    public boolean b(a aVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str}, this, changeQuickRedirect, false, 48873, new Class[]{a.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        ArrayDeque<a> arrayDeque = this.f95329a.get(str);
        this.f95332d = arrayDeque;
        if (arrayDeque == null) {
            ArrayDeque<a> arrayDeque2 = new ArrayDeque<>();
            this.f95332d = arrayDeque2;
            this.f95329a.put(str, arrayDeque2);
        }
        this.f95332d.offer(aVar);
        return true;
    }

    public boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48870, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d("default");
    }

    public boolean d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48871, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayDeque<a> arrayDeque = this.f95329a.get(str);
        this.f95332d = arrayDeque;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return false;
        }
        int iIntValue = f(str).intValue();
        AtomicInteger atomicInteger = this.f95331c.get(str);
        Objects.requireNonNull(atomicInteger);
        if (atomicInteger.getAndIncrement() + 1 == iIntValue) {
            for (int i10 = 0; i10 < this.f95332d.size() && i10 < iIntValue; i10++) {
                this.f95333e = this.f95332d.poll();
                e();
            }
            this.f95331c.put(str, new AtomicInteger(0));
        }
        return true;
    }

    public Integer h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48877, new Class[0], Integer.class);
        return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : i("default");
    }

    public Integer i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48878, new Class[]{String.class}, Integer.class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer) patchProxyResultProxy.result;
        }
        ArrayDeque<a> arrayDeque = this.f95329a.get(str);
        this.f95332d = arrayDeque;
        if (arrayDeque != null) {
            return Integer.valueOf(arrayDeque.size());
        }
        return -1;
    }

    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48868, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f95329a.clear();
        this.f95329a.put("default", new ArrayDeque<>());
        this.f95330b.clear();
        this.f95330b.put("default", 1);
        this.f95331c.clear();
        this.f95331c.put("default", new AtomicInteger(0));
    }

    public void k(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48869, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayDeque<a> arrayDeque = this.f95329a.get(str);
        this.f95332d = arrayDeque;
        if (arrayDeque != null) {
            arrayDeque.clear();
        }
        this.f95331c.put(str, new AtomicInteger(0));
    }

    public void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48874, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n("default");
    }

    public void n(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48875, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        o(str, 1);
    }

    public void o(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 48876, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l(str, Integer.valueOf(i10));
        ArrayDeque<a> arrayDeque = this.f95329a.get(str);
        this.f95332d = arrayDeque;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < this.f95332d.size() && i11 < i10; i11++) {
            this.f95333e = this.f95332d.poll();
            e();
        }
    }
}
