package com.max.xiaoheihe.module.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.bean.upload.UploadInfoObj;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: HeyboxUploadManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static c f93475e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<UploadInfoObj> f93476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Context f93477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f93473c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93474d = 8;

    /* JADX INFO: compiled from: HeyboxUploadManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.upload.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HeyboxUploadManager.kt */
        public static final class C0875a implements g.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f93478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.e f93479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f93480c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f93481d;

            C0875a(String str, g.e eVar, String str2, Context context) {
                this.f93478a = str;
                this.f93479b = eVar;
                this.f93480c = str2;
                this.f93481d = context;
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void a(float f10) {
                if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 46117, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                Log.d("UploadController", "onProgress: " + f10 + ' ' + this.f93478a);
                g.e eVar = this.f93479b;
                if (eVar != null) {
                    eVar.a(f10);
                }
                a aVar = c.f93473c;
                UploadInfoObj uploadInfoObjJ = aVar.b().j(this.f93478a);
                if (uploadInfoObjJ != null) {
                    uploadInfoObjJ.setProgressPercent(f10);
                }
                aVar.b().q();
                c.b(aVar.b());
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public boolean b() {
                return true;
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void c(@dl.e String[] strArr, @dl.e String str) {
                Map<String, String> paramsMap;
                if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 46115, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.d("UploadController", "onUploadSuccess " + this.f93478a);
                g.e eVar = this.f93479b;
                if (eVar != null) {
                    eVar.c(strArr, str);
                }
                if (strArr != null) {
                    String str2 = this.f93480c;
                    Context context = this.f93481d;
                    UploadInfoObj uploadInfoObjJ = c.f93473c.b().j(str2);
                    if (uploadInfoObjJ != null && uploadInfoObjJ.getVideoPostData() != null) {
                        PostDataObj videoPostData = uploadInfoObjJ.getVideoPostData();
                        if (videoPostData != null && (paramsMap = videoPostData.getParamsMap()) != null) {
                            paramsMap.putAll(PostUtils.f81983a.h(strArr[0]));
                        }
                        PostUtils.Companion.o(PostUtils.f81983a, context, uploadInfoObjJ.getVideoPostData(), 0, 4, null);
                    }
                }
                a aVar = c.f93473c;
                aVar.b().o(this.f93478a);
                c.b(aVar.b());
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public boolean d() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46118, new Class[0], Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                g.e eVar = this.f93479b;
                return eVar != null ? eVar.d() : h.c(this);
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void e(@dl.e String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46116, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.d("UploadController", "onUploadFail " + this.f93478a);
                g.e eVar = this.f93479b;
                if (eVar != null) {
                    eVar.e(str);
                }
                a aVar = c.f93473c;
                aVar.b().o(this.f93478a);
                c.b(aVar.b());
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final String a(@dl.d String path) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, 46113, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(path, "path");
            String str = path + System.currentTimeMillis();
            f0.o(str, "key.toString()");
            return str;
        }

        @dl.d
        @m
        public final c b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46112, new Class[0], c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            if (c.f93475e == null) {
                c.f93475e = new c(null);
            }
            c cVar = c.f93475e;
            f0.m(cVar);
            return cVar;
        }

        @m
        public final void c(@dl.d Context mContext, @dl.d io.reactivex.disposables.a compositeDisposable, @dl.e String str, @dl.e g.e eVar) {
            if (PatchProxy.proxy(new Object[]{mContext, compositeDisposable, str, eVar}, this, changeQuickRedirect, false, 46114, new Class[]{Context.class, io.reactivex.disposables.a.class, String.class, g.e.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(compositeDisposable, "compositeDisposable");
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                g.h(mContext, compositeDisposable, arrayList, "video", new C0875a(str, eVar, str, mContext));
            }
        }
    }

    private c() {
        s(new ArrayList());
        m();
    }

    public /* synthetic */ c(u uVar) {
        this();
    }

    public static final /* synthetic */ void b(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 46111, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.l();
    }

    @dl.d
    @m
    public static final String f(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 46109, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f93473c.a(str);
    }

    @dl.d
    @m
    public static final c g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 46108, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : f93473c.b();
    }

    private final void l() {
        Activity activityA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46107, new Class[0], Void.TYPE).isSupported || (activityA = com.max.hbutils.utils.e.b().a()) == null) {
            return;
        }
        activityA.sendBroadcast(new Intent(lb.a.Y));
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46106, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66125h0, null);
        k().clear();
        if (strO != null) {
            List<UploadInfoObj> listK = k();
            List listB = k.b(strO, UploadInfoObj.class);
            f0.o(listB, "deserializeList(uploadJs…ploadInfoObj::class.java)");
            listK.addAll(listB);
        }
    }

    @m
    public static final void u(@dl.d Context context, @dl.d io.reactivex.disposables.a aVar, @dl.e String str, @dl.e g.e eVar) {
        if (PatchProxy.proxy(new Object[]{context, aVar, str, eVar}, null, changeQuickRedirect, true, 46110, new Class[]{Context.class, io.reactivex.disposables.a.class, String.class, g.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f93473c.c(context, aVar, str, eVar);
    }

    public final void d(@dl.d UploadInfoObj uploadInfoObj) {
        if (PatchProxy.proxy(new Object[]{uploadInfoObj}, this, changeQuickRedirect, false, 46098, new Class[]{UploadInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uploadInfoObj, "uploadInfoObj");
        k().add(uploadInfoObj);
        q();
    }

    public final boolean e(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 46104, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(uploadInfoObj.getPath(), str) && f0.g(uploadInfoObj.getType(), str2)) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public final String h(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46102, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(uploadInfoObj.getPath(), str)) {
                return uploadInfoObj.getKey();
            }
        }
        return null;
    }

    @dl.e
    public final Context i() {
        return this.f93477b;
    }

    @dl.e
    public final UploadInfoObj j(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46097, new Class[]{String.class}, UploadInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UploadInfoObj) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(str, uploadInfoObj.getPath())) {
                return uploadInfoObj;
            }
        }
        return null;
    }

    @dl.d
    public final List<UploadInfoObj> k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46095, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<UploadInfoObj> list = this.f93476a;
        if (list != null) {
            return list;
        }
        f0.S("uploadList");
        return null;
    }

    public final void n(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46100, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(str, uploadInfoObj.getKey())) {
                k().remove(uploadInfoObj);
                q();
                return;
            }
        }
    }

    public final void o(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46101, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(str, uploadInfoObj.getPath())) {
                k().remove(uploadInfoObj);
                q();
                return;
            }
        }
    }

    public final void p(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 46103, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            if (f0.g(uploadInfoObj.getPath(), str)) {
                uploadInfoObj.setKey(str2);
                uploadInfoObj.setBucket(str3);
                uploadInfoObj.setCosPath(str4);
                q();
                return;
            }
        }
    }

    public final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46099, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.C(com.max.hbcache.c.f66125h0, k.r(k()));
    }

    public final void r(@dl.e Context context) {
        this.f93477b = context;
    }

    public final void s(@dl.d List<UploadInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 46096, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f93476a = list;
    }

    public final void t(@dl.d Context context, @dl.d io.reactivex.disposables.a compositeDisposable) {
        if (PatchProxy.proxy(new Object[]{context, compositeDisposable}, this, changeQuickRedirect, false, 46105, new Class[]{Context.class, io.reactivex.disposables.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(compositeDisposable, "compositeDisposable");
        if (com.max.hbcommon.utils.c.w(k())) {
            return;
        }
        for (UploadInfoObj uploadInfoObj : k()) {
            String path = uploadInfoObj.getPath();
            if (path != null) {
                File file = new File(path);
                if (uploadInfoObj.getVideoPostData() != null && file.exists()) {
                    if (!f0.g("tencent", uploadInfoObj.getType())) {
                        o(uploadInfoObj.getPath());
                    }
                    new ArrayList().add(path);
                    f93473c.c(context, compositeDisposable, path, null);
                }
            }
        }
    }
}
