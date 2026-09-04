package cn.fly.verify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GnssStatus;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"MissingPermission"})
public class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gr f36808a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f36811d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Class<?> f36813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f36815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Object f36816i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile List f36809b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List f36810c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f36812e = f();

    public interface a {
        void a();
    }

    private gr() {
    }

    public static gr a() {
        if (f36808a == null) {
            synchronized (gr.class) {
                if (f36808a == null) {
                    f36808a = new gr();
                }
            }
        }
        return f36808a;
    }

    private List a(Context context, int i10, int i11, boolean z10) {
        Object objB;
        Object objB2;
        ArrayList arrayList = new ArrayList();
        try {
            if (fz.d.b(bq.a("039efDedekelejedem'kg0ekegejgjgjejelUf4emgefefehjfmfmeihdfffhhjeigfhifegegdffhifh")) || fz.d.b(bq.a("041ef@edekelejedemXkg]ekegejgjgjejelHfIemgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh"))) {
                if (this.f36811d == null) {
                    this.f36811d = fz.d.a(bq.a("008h%el8dej]ejel=f"));
                }
                if (this.f36811d == null) {
                    return null;
                }
                synchronized (this) {
                    if (i10 != 0) {
                        try {
                            if (a(this.f36811d, bq.a("003Efk<kHgj"))) {
                                a(context, bq.a("003'fk2k!gj"), i10 * 1000);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if ((i11 != 0) && a(this.f36811d, bq.a("007fgj'ghelekfi"))) {
                        a(context, bq.a("007fgj<ghelekfi"), i11 * 1000);
                    }
                }
            }
            if (this.f36810c.isEmpty() && z10) {
                Object objB3 = b(bq.a("003%fk3kGgj"));
                if (objB3 != null) {
                    this.f36810c.add(objB3);
                }
                if (this.f36810c.isEmpty() && (objB2 = b(bq.a("007fgjAghelekfi"))) != null) {
                    this.f36810c.add(objB2);
                }
                if (this.f36810c.isEmpty() && (objB = b("passive")) != null) {
                    this.f36810c.add(objB);
                }
            }
            if (!this.f36810c.isEmpty()) {
                for (Object obj : this.f36810c) {
                    if (obj != null) {
                        this.f36809b.add(gi.a(gi.a(bq.a("025ef?edekelejedem(h_elVdej ejel%fRemgfelUdejFejelLf")), obj));
                        arrayList.add(gi.a(gi.a(bq.a("025efPedekelejedem8hWelAdej ejelUfSemgfel<dej1ejel7f")), obj));
                    }
                }
                this.f36814g = System.currentTimeMillis();
                this.f36810c.clear();
            }
        } catch (Throwable th3) {
            es.a().a(th3);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0007, B:6:0x000f, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:13:0x002f, B:14:0x0047), top: B:19:0x0007 }] */
    private List a(boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z10) {
            this.f36809b.clear();
        } else {
            try {
                if (this.f36809b.isEmpty() || System.currentTimeMillis() - this.f36814g > 180000) {
                    this.f36809b.clear();
                } else {
                    for (Object obj : this.f36809b) {
                        if (obj != null) {
                            arrayList.add(gi.a(gi.a(bq.a("025efEedekelejedem!h3elQdej9ejelJf)emgfelSdej0ejelEf")), obj));
                        }
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return arrayList;
    }

    private void a(Context context, String str, long j10) {
        if (Build.VERSION.SDK_INT > 25) {
            try {
                Object objA = fh.a(context, str, j10);
                if (objA != null) {
                    this.f36810c.add(objA);
                    return;
                }
                return;
            } catch (Throwable th2) {
                es.a().a("[212] cur err " + th2, new Object[0]);
            }
        }
        b(context, str, j10);
    }

    private boolean a(Object obj, String str) {
        return dt.e() && ((Boolean) gi.a(obj, bq.a("0173ejgjhmekeleeejedGg7ekhj%fe<ggUhgUed"), Boolean.FALSE, str)).booleanValue();
    }

    private Object b(String str) {
        if (Build.VERSION.SDK_INT > 25) {
            try {
                return fh.a(ax.g(), str);
            } catch (Throwable unused) {
            }
        }
        return fe.a(ax.g()).b(str);
    }

    private void b(Context context, String str, long j10) {
        if (dt.e()) {
            try {
                fe.a(context).a(str, 1000L, 0.0f, this.f36812e);
                wait(j10);
            } catch (Throwable th2) {
                es.a().a(th2);
            }
            i();
        }
    }

    private void d() {
        if (dt.g()) {
            try {
                if (fz.d.b(bq.a("039ef.edekelejedem,kgBekegejgjgjejel9f.emgefefehjfmfmeihdfffhhjeigfhifegegdffhifh"))) {
                    if (this.f36811d == null) {
                        this.f36811d = fz.d.a(bq.a("008hUelIdej[ejelAf"));
                    }
                    if (this.f36811d == null) {
                        return;
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 31 && ax.g().getApplicationInfo().targetSdkVersion < 31) {
                        bq.a().b().post(new Runnable() { // from class: cn.fly.verify.gr.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    gi.a(gr.this.f36811d, bq.a("020e]ededje<k]gjfmOjej<ehgjgfejgj9jgfgSek"), new Object[]{gr.this.e()}, (Class<?>[]) new Class[]{Class.forName(bq.a("026efFedekelejedem3hNel1dej9ejelRf,emjeLk$gjfm^jej,ehgj") + "$" + bq.a("008WgfejgjFjgfgGek"))});
                                    es.a().a("[212] rg < 31", new Object[0]);
                                } catch (Throwable th2) {
                                    es.a().a(th2, "%s", "[cl]");
                                }
                            }
                        });
                    } else if (i10 >= 31) {
                        gi.a(this.f36811d, bq.a("026[ek-gVfkejgj+jgPekjeUf*gjgjfmUjej7ehgjfe!ehhJggRedBfi"), new Object[]{g(), bq.a().b()}, (Class<?>[]) new Class[]{GnssStatus.Callback.class, Handler.class});
                        es.a().a("[212] rg >= 31", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2, "%s", "[212]");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object e() throws Throwable {
        HashMap map = new HashMap();
        final int iIdentityHashCode = System.identityHashCode(map);
        map.put(bq.a("0181elFf*je[kYgjfm.jejLehgjfeMief9fkBgMed"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.2
            @Override // cn.fly.verify.gi.a
            public Object a(Object[] objArr) {
                if (objArr == null || ((Integer) objArr[0]).intValue() != 4) {
                    return null;
                }
                gr.this.h();
                return null;
            }
        });
        map.put("equals", new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.3
            @Override // cn.fly.verify.gi.a
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    Object obj = objArr[0];
                    if (obj != null) {
                        return Boolean.valueOf(obj.hashCode() == iIdentityHashCode);
                    }
                }
                return Boolean.FALSE;
            }
        });
        map.put(bq.a("008ieRgj.iGfeeled?g"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.4
            @Override // cn.fly.verify.gi.a
            public Object a(Object[] objArr) {
                return Integer.valueOf(iIdentityHashCode);
            }
        });
        return gi.a(map, (Class<?>[]) new Class[]{Class.forName(bq.a("026efPedekelejedem9hNel8dejXejel;f_emjeQkVgjfmVjejMehgj") + "$" + bq.a("008'gfejgj%jgfg)ek"))});
    }

    private Object f() {
        HashMap map = new HashMap();
        final int iIdentityHashCode = System.identityHashCode(map);
        try {
            map.put(bq.a("017^el?fJgfelXdej[ejelJfNfe iefXfk*gBed"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.5
                @Override // cn.fly.verify.gi.a
                public Object a(Object[] objArr) {
                    gr grVar;
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                es.a().a("[212] oncge" + objArr[0], new Object[0]);
                                Object obj = objArr[0];
                                if (obj instanceof List) {
                                    gr.this.f36810c.addAll((List) obj);
                                } else {
                                    gr.this.f36810c.add(objArr[0]);
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                es.a().a(th2);
                                synchronized (grVar) {
                                    return null;
                                }
                            } finally {
                                synchronized (gr.this) {
                                    notifyAll();
                                }
                            }
                        }
                    }
                    gr.this.i();
                    synchronized (gr.this) {
                        notifyAll();
                    }
                    return null;
                }
            });
            map.put("equals", new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.6
                @Override // cn.fly.verify.gi.a
                public Object a(Object[] objArr) {
                    Object obj;
                    es.a().a("equals " + objArr, new Object[0]);
                    if (objArr == null || (obj = objArr[0]) == null) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(obj.hashCode() == iIdentityHashCode);
                }
            });
            map.put(bq.a("008ie[gj3i:feeled8g"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.gr.7
                @Override // cn.fly.verify.gi.a
                public Object a(Object[] objArr) {
                    es.a().a(bq.a("008ie9gj^iCfeeledNg"), new Object[0]);
                    return Integer.valueOf(iIdentityHashCode);
                }
            });
            return gi.a(map, (Class<?>[]) new Class[]{j()});
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private GnssStatus.Callback g() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new GnssStatus.Callback() { // from class: cn.fly.verify.gr.8
                @Override // android.location.GnssStatus.Callback
                public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                    super.onSatelliteStatusChanged(gnssStatus);
                    gr.this.h();
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            a aVar = this.f36815h;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            es.a().a(th2, "%s", "[cl]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f36812e != null) {
            gi.a(this.f36811d, bq.a("013 ek?gRegelee:g1fl*k<edUejgMgj"), new Object[]{this.f36812e}, (Class<?>[]) new Class[]{j()}, (Object) null);
        }
    }

    private Class<?> j() {
        if (this.f36813f == null) {
            try {
                this.f36813f = Class.forName(bq.a("033ef7edekelejedemIh.el[dej3ejel'fSemgfel7dej0ejel>fFgfejgj5jgfg%ek"));
            } catch (Throwable unused) {
            }
        }
        return this.f36813f;
    }

    public List a(Context context, int i10, int i11, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (az.a().c()) {
            arrayList.addAll(a(z11));
            if (arrayList.isEmpty()) {
                synchronized (gr.class) {
                    arrayList.addAll(a(z11));
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(a(context, i10, i11, z10));
                    }
                }
            }
        } else {
            arrayList.add(az.a().l());
        }
        return arrayList;
    }

    public void a(a aVar) {
        this.f36815h = aVar;
        d();
    }

    public void a(Object obj) {
        if (obj != null) {
            this.f36816i = obj;
        }
    }

    public boolean a(String str) {
        return (bq.a("003Sfk_k%gj").equalsIgnoreCase(str) && fz.d.b(bq.a("039ef_edekelejedemZkgCekegejgjgjejelVfPemgefefehjfmfmeihdfffhhjeigfhifegegdffhifh"))) || (bq.a("007fgjSghelekfi").equalsIgnoreCase(str) && fz.d.b(bq.a("039ef,edekelejedemWkg7ekegejgjgjejelGf1emgefefehjfmfmeihdfffhhjeigfhifegegdffhifh"))) || ((bq.a("007fgj3ghelekfi").equalsIgnoreCase(str) && fz.d.b(bq.a("041ef'edekelejedem9kg?ekegejgjgjejel:fSemgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh"))) || (("passive".equalsIgnoreCase(str) && fz.d.b(bq.a("039ef%edekelejedemJkgXekegejgjgjejel!f-emgefefehjfmfmeihdfffhhjeigfhifegegdffhifh"))) || ("passive".equalsIgnoreCase(str) && fz.d.b(bq.a("041ef:edekelejedem<kg,ekegejgjgjejel>f(emgefefehjfmfmeifehigehkfmhjeigfhifegegdffhifh")))));
    }

    public Object b() {
        return this.f36816i;
    }

    public Object c() {
        return b(bq.a("0033fk9kBgj"));
    }
}
