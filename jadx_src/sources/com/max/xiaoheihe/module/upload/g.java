package com.max.xiaoheihe.module.upload;

import android.content.Context;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.module.account.utils.l;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: UploadController.java */
/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f93524a = "bbs";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f93525b = "avatar";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f93526c = "video";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f93527d = "develop";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f93528e = "tencent";

    /* JADX INFO: compiled from: UploadController.java */
    public class a implements d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.reactivex.disposables.a f93529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f93531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f93532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f93533e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UploadController.java */
        public class C0877a implements l.k0<Boolean> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f93534a;

            C0877a(String str) {
                this.f93534a = str;
            }

            @Override // com.max.xiaoheihe.module.account.utils.l.k0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 46204, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public void b(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 46203, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!bool.booleanValue()) {
                    g.b(a.this.f93533e, this.f93534a);
                } else {
                    a aVar = a.this;
                    g.a(aVar.f93530b, aVar.f93529a, aVar.f93531c, aVar.f93532d, aVar.f93533e, Boolean.TRUE);
                }
            }
        }

        a(io.reactivex.disposables.a aVar, Context context, List list, String str, e eVar) {
            this.f93529a = aVar;
            this.f93530b = context;
            this.f93531c = list;
            this.f93532d = str;
            this.f93533e = eVar;
        }

        @Override // com.max.xiaoheihe.module.upload.g.d
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46202, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            g.c(this.f93529a, new C0877a(str));
        }
    }

    /* JADX INFO: compiled from: UploadController.java */
    public class b implements d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.reactivex.disposables.a f93536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f93538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f93539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f93540e;

        /* JADX INFO: compiled from: UploadController.java */
        public class a implements l.k0<Boolean> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f93541a;

            a(String str) {
                this.f93541a = str;
            }

            @Override // com.max.xiaoheihe.module.account.utils.l.k0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 46207, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public void b(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 46206, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!bool.booleanValue()) {
                    g.b(b.this.f93540e, this.f93541a);
                } else {
                    b bVar = b.this;
                    g.d(bVar.f93537b, bVar.f93536a, bVar.f93538c, bVar.f93539d, bVar.f93540e, Boolean.TRUE);
                }
            }
        }

        b(io.reactivex.disposables.a aVar, Context context, List list, String str, e eVar) {
            this.f93536a = aVar;
            this.f93537b = context;
            this.f93538c = list;
            this.f93539d = str;
            this.f93540e = eVar;
        }

        @Override // com.max.xiaoheihe.module.upload.g.d
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46205, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            g.c(this.f93536a, new a(str));
        }
    }

    /* JADX INFO: compiled from: UploadController.java */
    public class c extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.k0 f93543b;

        c(l.k0 k0Var) {
            this.f93543b = k0Var;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 46209, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<JsonObject> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46208, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            Boolean boolValueOf = Boolean.valueOf(result.getResult().get("is_overseas").getAsBoolean());
            l.k0 k0Var = this.f93543b;
            if (k0Var != null) {
                k0Var.a(boolValueOf);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46210, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    /* JADX INFO: compiled from: UploadController.java */
    public interface d {
        void a(String str);
    }

    /* JADX INFO: compiled from: UploadController.java */
    public interface e {
        void a(float f10);

        boolean b();

        void c(String[] strArr, String str);

        boolean d();

        void e(String str);
    }

    static /* synthetic */ void a(Context context, io.reactivex.disposables.a aVar, List list, String str, e eVar, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar, bool}, null, changeQuickRedirect, true, 46198, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        i(context, aVar, list, str, eVar, bool);
    }

    static /* synthetic */ void b(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, 46199, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        l(eVar, str);
    }

    static /* synthetic */ void c(io.reactivex.disposables.a aVar, l.k0 k0Var) {
        if (PatchProxy.proxy(new Object[]{aVar, k0Var}, null, changeQuickRedirect, true, 46200, new Class[]{io.reactivex.disposables.a.class, l.k0.class}, Void.TYPE).isSupported) {
            return;
        }
        f(aVar, k0Var);
    }

    static /* synthetic */ void d(Context context, io.reactivex.disposables.a aVar, List list, String str, e eVar, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar, bool}, null, changeQuickRedirect, true, 46201, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        k(context, aVar, list, str, eVar, bool);
    }

    public static void e(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46197, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f.l(str);
    }

    private static void f(io.reactivex.disposables.a aVar, l.k0<Boolean> k0Var) {
        if (PatchProxy.proxy(new Object[]{aVar, k0Var}, null, changeQuickRedirect, true, 46194, new Class[]{io.reactivex.disposables.a.class, l.k0.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) i.a().Z4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new c(k0Var)));
    }

    public static void g(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46196, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f.n(str);
    }

    public static void h(Context context, io.reactivex.disposables.a aVar, List<String> list, String str, e eVar) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar}, null, changeQuickRedirect, true, 46190, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class}, Void.TYPE).isSupported) {
            return;
        }
        i(context, aVar, list, str, eVar, Boolean.FALSE);
    }

    private static void i(Context context, io.reactivex.disposables.a aVar, List<String> list, String str, e eVar, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar, bool}, null, changeQuickRedirect, true, 46191, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(it.next()));
        }
        new f(context, bool).e(aVar, arrayList, str, eVar, bool.booleanValue() ? null : new a(aVar, context, list, str, eVar));
    }

    public static void j(Context context, io.reactivex.disposables.a aVar, List<Uri> list, String str, e eVar) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar}, null, changeQuickRedirect, true, 46192, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class}, Void.TYPE).isSupported) {
            return;
        }
        k(context, aVar, list, str, eVar, Boolean.FALSE);
    }

    private static void k(Context context, io.reactivex.disposables.a aVar, List<Uri> list, String str, e eVar, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{context, aVar, list, str, eVar, bool}, null, changeQuickRedirect, true, 46193, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, String.class, e.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        new f(context, bool).f(aVar, list, str, eVar, new b(aVar, context, list, str, eVar));
    }

    private static void l(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, 46195, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.e(str);
        if (eVar.d()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("上传失败 error: " + str);
        }
    }
}
