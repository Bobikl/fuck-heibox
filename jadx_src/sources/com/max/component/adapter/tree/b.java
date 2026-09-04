package com.max.component.adapter.tree;

import com.max.component.adapter.tree.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TreeNode.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nTreeNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeNode.kt\ncom/max/component/adapter/tree/TreeNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1#2:99\n1549#3:100\n1620#3,3:101\n*S KotlinDebug\n*F\n+ 1 TreeNode.kt\ncom/max/component/adapter/tree/TreeNode\n*L\n89#1:100\n89#1:101,3\n*E\n"})
public final class b<T extends com.max.component.adapter.tree.a> implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f65454i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f65455j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private T f65456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private b<T> f65457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private List<b<T>> f65458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f65461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f65462h;

    /* JADX INFO: compiled from: TreeNode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public b(@dl.d T content) {
        f0.p(content, "content");
        this.f65456b = content;
        this.f65458d = new ArrayList();
        this.f65462h = -1;
    }

    @dl.d
    public final b<T> a(@dl.d b<T> node) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{node}, this, changeQuickRedirect, false, bb.c.b.f30826nl, new Class[]{b.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(node, "node");
        this.f65458d.add(node);
        node.f65457c = this;
        return this;
    }

    @dl.d
    public b<T> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.sl, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b<T> bVar = new b<>(this.f65456b);
        bVar.f65459e = this.f65459e;
        return bVar;
    }

    public final void c() {
        if (this.f65459e) {
            this.f65459e = false;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.tl, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b();
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30872pl, new Class[0], Void.TYPE).isSupported || this.f65458d.isEmpty()) {
            return;
        }
        Iterator<b<T>> it = this.f65458d.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void e() {
        if (this.f65459e) {
            return;
        }
        this.f65459e = true;
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ql, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e();
        if (this.f65458d.isEmpty()) {
            return;
        }
        Iterator<b<T>> it = this.f65458d.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @dl.e
    public final b<T> g(@dl.d String key) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, bb.c.b.f30849ol, new Class[]{String.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        Iterator<T> it = this.f65458d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (f0.g(((b) next).f65461g, key)) {
                return (b) next;
            }
        }
        next = null;
        return (b) next;
    }

    @dl.d
    public final List<b<T>> h() {
        return this.f65458d;
    }

    @dl.d
    public final T i() {
        return this.f65456b;
    }

    public final int j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30803ml, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (p()) {
            this.f65462h = 0;
        } else if (this.f65462h == -1) {
            b<T> bVar = this.f65457c;
            this.f65462h = bVar != null ? bVar.j() + 1 : 0;
        }
        return this.f65462h;
    }

    @dl.e
    public final String k() {
        return this.f65461g;
    }

    @dl.e
    public final b<T> l() {
        return this.f65457c;
    }

    public final boolean m() {
        return this.f65459e;
    }

    public final boolean n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30780ll, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f65458d.isEmpty();
    }

    public final boolean o() {
        return this.f65460f;
    }

    public final boolean p() {
        return this.f65457c == null;
    }

    @dl.d
    public final b<T> q() {
        this.f65460f = true;
        return this;
    }

    public final void r(@dl.d List<b<T>> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.f30757kl, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f65458d = list;
    }

    public final void s(@dl.d T t10) {
        if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.f30734jl, new Class[]{com.max.component.adapter.tree.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(t10, "<set-?>");
        this.f65456b = t10;
    }

    public final void t(boolean z10) {
        this.f65459e = z10;
    }

    @dl.d
    public String toString() {
        String string;
        T t10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.rl, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TreeNode(content=");
        sb2.append(this.f65456b);
        sb2.append(", parent=");
        b<T> bVar = this.f65457c;
        if (bVar == null || (t10 = bVar.f65456b) == null || (string = t10.toString()) == null) {
            string = "null";
        }
        sb2.append(string);
        sb2.append(", childList=");
        List<b<T>> list = this.f65458d;
        ArrayList arrayList = new ArrayList(t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).f65456b.toString());
        }
        sb2.append(arrayList);
        sb2.append(", isExpand=");
        sb2.append(this.f65459e);
        sb2.append(')');
        return sb2.toString();
    }

    public final void u(@dl.e String str) {
        this.f65461g = str;
    }

    public final void v(boolean z10) {
        this.f65460f = z10;
    }

    public final void w(@dl.e b<T> bVar) {
        this.f65457c = bVar;
    }

    public final boolean x() {
        boolean z10 = !this.f65459e;
        this.f65459e = z10;
        return z10;
    }

    @dl.d
    public final b<T> y() {
        this.f65460f = false;
        return this;
    }
}
