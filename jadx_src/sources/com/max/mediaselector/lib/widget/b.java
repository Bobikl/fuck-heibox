package com.max.mediaselector.lib.widget;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: SlideSelectionHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements com.max.mediaselector.lib.widget.a.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f75629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0610b f75630b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet<Integer> f75631c;

    /* JADX INFO: compiled from: SlideSelectionHandler.java */
    public interface a {
        void a(int i10, int i11, boolean z10, boolean z11);

        Set<Integer> t();
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SlideSelectionHandler.java */
    public interface InterfaceC0610b {
        void a(int i10);

        void b(int i10, boolean z10);
    }

    public b(a aVar) {
        this.f75629a = aVar;
    }

    private void d(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Sa, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75629a.a(i10, i11, z10, false);
    }

    @Override // com.max.mediaselector.lib.widget.a.b
    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.Qa, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75631c = null;
        InterfaceC0610b interfaceC0610b = this.f75630b;
        if (interfaceC0610b != null) {
            interfaceC0610b.a(i10);
        }
    }

    @Override // com.max.mediaselector.lib.widget.a.b
    public void b(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.Pa, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75631c = new HashSet<>();
        Set<Integer> setT = this.f75629a.t();
        if (setT != null) {
            this.f75631c.addAll(setT);
        }
        boolean zContains = this.f75631c.contains(Integer.valueOf(i10));
        this.f75629a.a(i10, i10, !this.f75631c.contains(Integer.valueOf(i10)), true);
        InterfaceC0610b interfaceC0610b = this.f75630b;
        if (interfaceC0610b != null) {
            interfaceC0610b.b(i10, zContains);
        }
    }

    @Override // com.max.mediaselector.lib.widget.a.c
    public void c(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Ra, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        while (i10 <= i11) {
            d(i10, i10, z10 != this.f75631c.contains(Integer.valueOf(i10)));
            i10++;
        }
    }

    public b e(InterfaceC0610b interfaceC0610b) {
        this.f75630b = interfaceC0610b;
        return this;
    }
}
