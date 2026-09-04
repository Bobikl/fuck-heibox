package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class Glide implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f40515m = "image_manager_disk_cache";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f40516n = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f40517o = "Glide";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @b0("Glide.class")
    private static volatile Glide f40518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile boolean f40519q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.i f40520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f40521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f40522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f40523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f40524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f40525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f40526h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f40528j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b0("this")
    @p0
    private com.bumptech.glide.load.engine.prefill.b f40530l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("managers")
    private final List<j> f40527i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MemoryCategory f40529k = MemoryCategory.NORMAL;

    public interface a {
        @n0
        com.bumptech.glide.request.h build();
    }

    Glide(@n0 Context context, @n0 com.bumptech.glide.load.engine.i iVar, @n0 com.bumptech.glide.load.engine.cache.j jVar, @n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @n0 n nVar, @n0 com.bumptech.glide.manager.c cVar, int i10, @n0 a aVar, @n0 Map<Class<?>, k<?, ?>> map, @n0 List<com.bumptech.glide.request.g<Object>> list, @n0 List<y6.c> list2, @p0 y6.a aVar2, @n0 e eVar2) {
        this.f40520b = iVar;
        this.f40521c = eVar;
        this.f40524f = bVar;
        this.f40522d = jVar;
        this.f40525g = nVar;
        this.f40526h = cVar;
        this.f40528j = aVar;
        this.f40523e = new d(context, bVar, h.d(this, list2, aVar2), new com.bumptech.glide.request.target.k(), aVar, map, list, iVar, eVar2, i10);
    }

    private static void A(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @n0
    @Deprecated
    public static j D(@n0 Activity activity) {
        return F(activity.getApplicationContext());
    }

    @n0
    @Deprecated
    public static j E(@n0 Fragment fragment) {
        Activity activity = fragment.getActivity();
        m.f(activity, f40516n);
        return F(activity.getApplicationContext());
    }

    @n0
    public static j F(@n0 Context context) {
        return p(context).h(context);
    }

    @n0
    public static j G(@n0 View view) {
        return p(view.getContext()).i(view);
    }

    @n0
    public static j H(@n0 androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).j(fragment);
    }

    @n0
    public static j I(@n0 FragmentActivity fragmentActivity) {
        return p(fragmentActivity).k(fragmentActivity);
    }

    @j1
    @b0("Glide.class")
    static void a(@n0 Context context, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (f40519q) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f40519q = true;
        try {
            s(context, generatedAppGlideModule);
        } finally {
            f40519q = false;
        }
    }

    @j1
    public static void d() {
        u.c().i();
    }

    @n0
    public static Glide e(@n0 Context context) {
        if (f40518p == null) {
            GeneratedAppGlideModule generatedAppGlideModuleF = f(context.getApplicationContext());
            synchronized (Glide.class) {
                if (f40518p == null) {
                    a(context, generatedAppGlideModuleF);
                }
            }
        }
        return f40518p;
    }

    @p0
    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable(f40517o, 5)) {
                Log.w(f40517o, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            A(e10);
            return null;
        } catch (InstantiationException e11) {
            A(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            A(e12);
            return null;
        } catch (InvocationTargetException e13) {
            A(e13);
            return null;
        }
    }

    @p0
    public static File l(@n0 Context context) {
        return m(context, "image_manager_disk_cache");
    }

    @p0
    public static File m(@n0 Context context, @n0 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable(f40517o, 6)) {
                Log.e(f40517o, "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @n0
    private static n p(@p0 Context context) {
        m.f(context, f40516n);
        return e(context).o();
    }

    @j1
    public static void q(@n0 Context context, @n0 c cVar) {
        GeneratedAppGlideModule generatedAppGlideModuleF = f(context);
        synchronized (Glide.class) {
            if (f40518p != null) {
                z();
            }
            t(context, cVar, generatedAppGlideModuleF);
        }
    }

    @j1
    @Deprecated
    public static synchronized void r(Glide glide) {
        if (f40518p != null) {
            z();
        }
        f40518p = glide;
    }

    @b0("Glide.class")
    private static void s(@n0 Context context, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new c(), generatedAppGlideModule);
    }

    @b0("Glide.class")
    private static void t(@n0 Context context, @n0 c cVar, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<y6.c> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new y6.e(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<y6.c> it = listEmptyList.iterator();
            while (it.hasNext()) {
                y6.c next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable(f40517o, 3)) {
                        Log.d(f40517o, "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(f40517o, 3)) {
            Iterator<y6.c> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d(f40517o, "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.u(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<y6.c> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVar);
        }
        Glide glideB = cVar.b(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(glideB);
        f40518p = glideB;
    }

    @j1
    public static synchronized boolean u() {
        return f40518p != null;
    }

    @j1
    public static void z() {
        synchronized (Glide.class) {
            if (f40518p != null) {
                f40518p.j().getApplicationContext().unregisterComponentCallbacks(f40518p);
                f40518p.f40520b.m();
            }
            f40518p = null;
        }
    }

    public void B(int i10) {
        o.b();
        synchronized (this.f40527i) {
            Iterator<j> it = this.f40527i.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i10);
            }
        }
        this.f40522d.a(i10);
        this.f40521c.a(i10);
        this.f40524f.a(i10);
    }

    void C(j jVar) {
        synchronized (this.f40527i) {
            if (!this.f40527i.contains(jVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f40527i.remove(jVar);
        }
    }

    public void b() {
        o.a();
        this.f40520b.e();
    }

    public void c() {
        o.b();
        this.f40522d.b();
        this.f40521c.b();
        this.f40524f.b();
    }

    @n0
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
        return this.f40524f;
    }

    @n0
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
        return this.f40521c;
    }

    com.bumptech.glide.manager.c i() {
        return this.f40526h;
    }

    @n0
    public Context j() {
        return this.f40523e.getBaseContext();
    }

    @n0
    d k() {
        return this.f40523e;
    }

    @n0
    public Registry n() {
        return this.f40523e.i();
    }

    @n0
    public n o() {
        return this.f40525g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        B(i10);
    }

    public synchronized void v(@n0 com.bumptech.glide.load.engine.prefill.d.a... aVarArr) {
        if (this.f40530l == null) {
            this.f40530l = new com.bumptech.glide.load.engine.prefill.b(this.f40522d, this.f40521c, (DecodeFormat) this.f40528j.build().M().c(com.bumptech.glide.load.resource.bitmap.o.f41572g));
        }
        this.f40530l.c(aVarArr);
    }

    void w(j jVar) {
        synchronized (this.f40527i) {
            if (this.f40527i.contains(jVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f40527i.add(jVar);
        }
    }

    boolean x(@n0 p<?> pVar) {
        synchronized (this.f40527i) {
            Iterator<j> it = this.f40527i.iterator();
            while (it.hasNext()) {
                if (it.next().S(pVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @n0
    public MemoryCategory y(@n0 MemoryCategory memoryCategory) {
        o.b();
        this.f40522d.c(memoryCategory.getMultiplier());
        this.f40521c.c(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f40529k;
        this.f40529k = memoryCategory;
        return memoryCategory2;
    }
}
