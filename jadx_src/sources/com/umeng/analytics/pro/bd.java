package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: TUnion.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class bd<T extends bd<?, ?>, F extends ba> implements at<T, F> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f104562c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f104563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected F f104564b;

    /* JADX INFO: compiled from: TUnion.java */
    public static class a extends cc<bd> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.f104564b = null;
            bdVar.f104563a = null;
            bsVar.j();
            bn bnVarL = bsVar.l();
            Object objA = bdVar.a(bsVar, bnVarL);
            bdVar.f104563a = objA;
            if (objA != null) {
                bdVar.f104564b = (F) bdVar.a(bnVarL.f104629c);
            }
            bsVar.m();
            bsVar.l();
            bsVar.k();
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.d());
            bsVar.a(bdVar.c(bdVar.f104564b));
            bdVar.a(bsVar);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: TUnion.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: TUnion.java */
    public static class c extends cd<bd> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.f104564b = null;
            bdVar.f104563a = null;
            short sV = bsVar.v();
            Object objA = bdVar.a(bsVar, sV);
            bdVar.f104563a = objA;
            if (objA != null) {
                bdVar.f104564b = (F) bdVar.a(sV);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.f104564b.a());
            bdVar.b(bsVar);
        }
    }

    /* JADX INFO: compiled from: TUnion.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f104562c = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
    }

    protected bd() {
        this.f104564b = null;
        this.f104563a = null;
    }

    protected bd(F f10, Object obj) {
        a(f10, obj);
    }

    protected bd(bd<T, F> bdVar) {
        if (!bdVar.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.f104564b = bdVar.f104564b;
        this.f104563a = a(bdVar.f104563a);
    }

    private static Object a(Object obj) {
        if (obj instanceof at) {
            return ((at) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return au.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(a(entry.getKey()), a(entry.getValue()));
        }
        return map2;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    public F a() {
        return this.f104564b;
    }

    protected abstract F a(short s10);

    public Object a(int i10) {
        return a(a((short) i10));
    }

    public Object a(F f10) {
        if (f10 == this.f104564b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f10 + " because union's set field is " + this.f104564b);
    }

    protected abstract Object a(bs bsVar, bn bnVar) throws az;

    protected abstract Object a(bs bsVar, short s10) throws az;

    public void a(int i10, Object obj) {
        a(a((short) i10), obj);
    }

    public void a(F f10, Object obj) {
        b(f10, obj);
        this.f104564b = f10;
        this.f104563a = obj;
    }

    protected abstract void a(bs bsVar) throws az;

    public Object b() {
        return this.f104563a;
    }

    protected abstract void b(F f10, Object obj) throws ClassCastException;

    protected abstract void b(bs bsVar) throws az;

    public boolean b(int i10) {
        return b(a((short) i10));
    }

    public boolean b(F f10) {
        return this.f104564b == f10;
    }

    protected abstract bn c(F f10);

    public boolean c() {
        return this.f104564b != null;
    }

    @Override // com.umeng.analytics.pro.at
    public final void clear() {
        this.f104564b = null;
        this.f104563a = null;
    }

    protected abstract bx d();

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f104562c.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" ");
        if (a() != null) {
            Object objB = b();
            sb2.append(c(a()).f104627a);
            sb2.append(":");
            if (objB instanceof ByteBuffer) {
                au.a((ByteBuffer) objB, sb2);
            } else {
                sb2.append(objB.toString());
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f104562c.get(bsVar.D()).b().a(bsVar, this);
    }
}
