package com.sankuai.waimai.router.service;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.generated.ServiceLoaderInit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ServiceLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public class g<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class, g> f96554c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.sankuai.waimai.router.utils.b f96555d = new a("ServiceLoader");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, f> f96556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f96557b;

    /* JADX INFO: compiled from: ServiceLoader.java */
    public class a extends com.sankuai.waimai.router.utils.b {
        a(String str) {
            super(str);
        }

        @Override // com.sankuai.waimai.router.utils.b
        protected void a() {
            try {
                ServiceLoaderInit.class.getMethod(lg.a.f131415h, new Class[0]).invoke(null, new Object[0]);
                com.sankuai.waimai.router.core.c.f("[ServiceLoader] init class invoked", new Object[0]);
            } catch (Exception e10) {
                com.sankuai.waimai.router.core.c.e(e10);
            }
        }
    }

    /* JADX INFO: compiled from: ServiceLoader.java */
    public static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f96558e = new b();

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            super(null, 0 == true ? 1 : 0);
        }

        @Override // com.sankuai.waimai.router.service.g
        @n0
        public List e() {
            return Collections.emptyList();
        }

        @Override // com.sankuai.waimai.router.service.g
        @n0
        public List g(d dVar) {
            return Collections.emptyList();
        }

        @Override // com.sankuai.waimai.router.service.g
        @n0
        public List<Class> h() {
            return Collections.emptyList();
        }

        @Override // com.sankuai.waimai.router.service.g
        public String toString() {
            return "EmptyServiceLoader";
        }
    }

    private g(Class cls) {
        this.f96556a = new HashMap<>();
        if (cls == null) {
            this.f96557b = "";
        } else {
            this.f96557b = cls.getName();
        }
    }

    /* synthetic */ g(Class cls, a aVar) {
        this(cls);
    }

    @p0
    private <T extends I> T a(@p0 f fVar, @p0 d dVar) {
        if (fVar == null) {
            return null;
        }
        Class clsC = fVar.c();
        if (!fVar.f()) {
            if (dVar == null) {
                try {
                    dVar = h.a();
                } catch (Exception e10) {
                    com.sankuai.waimai.router.core.c.e(e10);
                }
            }
            T t10 = (T) dVar.a(clsC);
            com.sankuai.waimai.router.core.c.f("[ServiceLoader] create instance: %s, result = %s", clsC, t10);
            return t10;
        }
        try {
            return (T) com.sankuai.waimai.router.utils.g.a(clsC, dVar);
        } catch (Exception e11) {
            com.sankuai.waimai.router.core.c.e(e11);
        }
        return null;
    }

    public static void j() {
        f96555d.c();
    }

    public static <T> g<T> k(Class<T> cls) {
        f96555d.b();
        if (cls == null) {
            com.sankuai.waimai.router.core.c.e(new NullPointerException("ServiceLoader.load的class参数不应为空"));
            return b.f96558e;
        }
        Map<Class, g> map = f96554c;
        g<T> gVar = map.get(cls);
        if (gVar == null) {
            synchronized (map) {
                gVar = map.get(cls);
                if (gVar == null) {
                    gVar = new g<>(cls);
                    map.put(cls, gVar);
                }
            }
        }
        return gVar;
    }

    public static void l(Class cls, String str, Class cls2, boolean z10) {
        Map<Class, g> map = f96554c;
        g gVar = map.get(cls);
        if (gVar == null) {
            gVar = new g(cls);
            map.put(cls, gVar);
        }
        gVar.m(str, cls2, z10);
    }

    private void m(String str, Class cls, boolean z10) {
        if (str == null || cls == null) {
            return;
        }
        this.f96556a.put(str, new f(str, cls, z10));
    }

    public <T extends I> T b(String str) {
        return (T) a(this.f96556a.get(str), null);
    }

    public <T extends I> T c(String str, Context context) {
        return (T) a(this.f96556a.get(str), new com.sankuai.waimai.router.service.a(context));
    }

    public <T extends I> T d(String str, d dVar) {
        return (T) a(this.f96556a.get(str), dVar);
    }

    @n0
    public <T extends I> List<T> e() {
        return g(null);
    }

    @n0
    public <T extends I> List<T> f(Context context) {
        return g(new com.sankuai.waimai.router.service.a(context));
    }

    @n0
    public <T extends I> List<T> g(d dVar) {
        Collection<f> collectionValues = this.f96556a.values();
        if (collectionValues.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionValues.size());
        Iterator<f> it = collectionValues.iterator();
        while (it.hasNext()) {
            Object objA = a(it.next(), dVar);
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    @n0
    public <T extends I> List<Class<T>> h() {
        ArrayList arrayList = new ArrayList(this.f96556a.size());
        Iterator<f> it = this.f96556a.values().iterator();
        while (it.hasNext()) {
            Class clsC = it.next().c();
            if (clsC != null) {
                arrayList.add(clsC);
            }
        }
        return arrayList;
    }

    public <T extends I> Class<T> i(String str) {
        return this.f96556a.get(str).c();
    }

    public String toString() {
        return "ServiceLoader (" + this.f96557b + ")";
    }
}
