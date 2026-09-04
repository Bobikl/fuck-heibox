package com.max.xiaoheihe.module.bbs.post_edit;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.CachedPagingDataKt;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.loader.repository.GalleryMediaRepository;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostModuleListObj;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.b2;

/* JADX INFO: compiled from: PostTabActivityViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostTabActivityViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f82616x = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private PostEditAutoSaveManager<PostEditAutoSaveData> f82617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<PostToolsV2TabType> f82620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final LiveData<PostToolsV2TabType> f82621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<PostType> f82622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final LiveData<PostType> f82623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<e> f82624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final LiveData<e> f82625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Pair<Boolean, Uri>> f82626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final LiveData<Pair<Boolean, Uri>> f82627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private WeakReference<yh.a<b2>> f82628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Pair<Result<PostModuleListObj>, Throwable>> f82631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final LiveData<Pair<Result<PostModuleListObj>, Throwable>> f82632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82636w;

    /* JADX INFO: compiled from: PostTabActivityViewModel.kt */
    public static final class a implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f82637a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30672, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
        }
    }

    /* JADX INFO: compiled from: PostTabActivityViewModel.kt */
    public static final class b extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f82638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<Uri, b2> f82639c;

        /* JADX WARN: Multi-variable type inference failed */
        b(yh.a<b2> aVar, yh.l<? super Uri, b2> lVar) {
            this.f82638b = aVar;
            this.f82639c = lVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30673, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            this.f82638b.invoke();
        }

        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 30674, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(file, "file");
            Log.d("PostTabActivityViewModel-dbg", "[triggerSaveGameShotImage][onNext]\npath: " + file.getAbsolutePath() + "\nexists: " + file.exists());
            if (file.exists()) {
                yh.l<Uri, b2> lVar = this.f82639c;
                Uri uriFromFile = Uri.fromFile(file);
                kotlin.jvm.internal.f0.o(uriFromFile, "fromFile(file)");
                lVar.invoke(uriFromFile);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30675, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    public PostTabActivityViewModel() {
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.i0<Boolean> i0Var = new androidx.lifecycle.i0<>(bool);
        this.f82618e = i0Var;
        this.f82619f = i0Var;
        androidx.lifecycle.i0<PostToolsV2TabType> i0Var2 = new androidx.lifecycle.i0<>();
        this.f82620g = i0Var2;
        this.f82621h = i0Var2;
        androidx.lifecycle.i0<PostType> i0Var3 = new androidx.lifecycle.i0<>();
        this.f82622i = i0Var3;
        this.f82623j = i0Var3;
        androidx.lifecycle.i0<e> i0Var4 = new androidx.lifecycle.i0<>();
        this.f82624k = i0Var4;
        this.f82625l = i0Var4;
        androidx.lifecycle.i0<Pair<Boolean, Uri>> i0Var5 = new androidx.lifecycle.i0<>();
        this.f82626m = i0Var5;
        this.f82627n = i0Var5;
        androidx.lifecycle.i0<Boolean> i0Var6 = new androidx.lifecycle.i0<>();
        this.f82629p = i0Var6;
        this.f82630q = Transformations.a(i0Var6);
        androidx.lifecycle.i0<Pair<Result<PostModuleListObj>, Throwable>> i0Var7 = new androidx.lifecycle.i0<>();
        this.f82631r = i0Var7;
        this.f82632s = i0Var7;
        androidx.lifecycle.i0<Boolean> i0Var8 = new androidx.lifecycle.i0<>();
        this.f82633t = i0Var8;
        this.f82634u = i0Var8;
        androidx.lifecycle.i0<Boolean> i0Var9 = new androidx.lifecycle.i0<>(bool);
        this.f82635v = i0Var9;
        this.f82636w = i0Var9;
    }

    public static /* synthetic */ void H(PostTabActivityViewModel postTabActivityViewModel, boolean z10, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{postTabActivityViewModel, new Byte(z10 ? (byte) 1 : (byte) 0), aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 30661, new Class[]{PostTabActivityViewModel.class, Boolean.TYPE, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        postTabActivityViewModel.G(z10, aVar);
    }

    public static /* synthetic */ boolean w(PostTabActivityViewModel postTabActivityViewModel, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postTabActivityViewModel, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 30655, new Class[]{PostTabActivityViewModel.class, String.class, Integer.TYPE, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return postTabActivityViewModel.v(str);
    }

    public final void A(@dl.d PostType editPostType) {
        if (PatchProxy.proxy(new Object[]{editPostType}, this, changeQuickRedirect, false, 30653, new Class[]{PostType.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(editPostType, "editPostType");
        this.f82622i.o(editPostType);
    }

    public final void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30652, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82618e.o(Boolean.TRUE);
    }

    public final void C(@dl.d e event) {
        if (PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, 30658, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(event, "event");
        if (w(this, null, 1, null)) {
            this.f82624k.o(event);
        }
    }

    public final void D(@dl.d Pair<Boolean, ? extends Uri> event) {
        if (PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, 30659, new Class[]{Pair.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(event, "event");
        kotlinx.coroutines.k.f(androidx.lifecycle.x0.a(this), null, null, new PostTabActivityViewModel$notifyGameShotPostToolV2Event$1(event, this, null), 3, null);
    }

    public final void E(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30663, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f82635v.o(Boolean.valueOf(z10));
    }

    public final void F(@dl.d PostToolsV2TabType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 30656, new Class[]{PostToolsV2TabType.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        if (w(this, null, 1, null)) {
            this.f82620g.o(type);
        }
    }

    public final void G(boolean z10, @dl.e yh.a<b2> aVar) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), aVar}, this, changeQuickRedirect, false, 30660, new Class[]{Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported && w(this, null, 1, null)) {
            this.f82628o = new WeakReference<>(aVar);
            this.f82629p.o(Boolean.valueOf(z10));
        }
    }

    public final void I(@dl.d Pair<? extends Result<PostModuleListObj>, ? extends Throwable> resultOrException) {
        if (PatchProxy.proxy(new Object[]{resultOrException}, this, changeQuickRedirect, false, 30662, new Class[]{Pair.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(resultOrException, "resultOrException");
        this.f82631r.o(resultOrException);
    }

    public final void J(@dl.d yh.a<Boolean> checkResumedCallback) {
        if (PatchProxy.proxy(new Object[]{checkResumedCallback}, this, changeQuickRedirect, false, 30665, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(checkResumedCallback, "checkResumedCallback");
        if (!ad.a.a(ad.a.f1218y, false) && this.f82617d == null) {
            this.f82617d = new PostEditAutoSaveManager<>(androidx.lifecycle.x0.a(this), checkResumedCallback, 0L, 4, null);
        }
    }

    public final void K(@dl.e WeakReference<yh.a<b2>> weakReference) {
        this.f82628o = weakReference;
    }

    public final void L(@dl.d com.max.xiaoheihe.module.bbs.post_edit.auto_save.c<PostEditAutoSaveData> provider) {
        if (PatchProxy.proxy(new Object[]{provider}, this, changeQuickRedirect, false, 30666, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.auto_save.c.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(provider, "provider");
        PostEditAutoSaveManager<PostEditAutoSaveData> postEditAutoSaveManager = this.f82617d;
        if (postEditAutoSaveManager != null) {
            postEditAutoSaveManager.j(provider);
        }
    }

    public final void M(@dl.d Context context, @dl.e String str, @dl.d yh.l<? super Uri, b2> onSaveNext, @dl.d yh.a<b2> onError) {
        Object objB;
        String absolutePath;
        if (PatchProxy.proxy(new Object[]{context, str, onSaveNext, onError}, this, changeQuickRedirect, false, 30664, new Class[]{Context.class, String.class, yh.l.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(onSaveNext, "onSaveNext");
        kotlin.jvm.internal.f0.p(onError, "onError");
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = context.getCacheDir().getAbsolutePath();
            }
            c((b) com.max.hbimage.b.i(absolutePath, a.f82637a, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(onError, onSaveNext)));
            objB = kotlin.Result.b(b2.f124493a);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = kotlin.Result.e(objB);
        if (thE != null) {
            Log.d("PostTabActivityViewModel-dbg", "[triggerSaveGameShotImage] error: " + thE);
            onError.invoke();
        }
    }

    @dl.d
    public final LiveData<PostType> h() {
        return this.f82623j;
    }

    @dl.d
    public final LiveData<Pair<Result<PostModuleListObj>, Throwable>> i() {
        return this.f82632s;
    }

    @dl.d
    public final LiveData<Boolean> k() {
        return this.f82619f;
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<androidx.paging.o0<LocalMedia>> m(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30650, new Class[]{Context.class}, kotlinx.coroutines.flow.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlinx.coroutines.flow.e) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        return CachedPagingDataKt.a(GalleryMediaRepository.f75278a.a(context), androidx.lifecycle.x0.a(this));
    }

    @dl.d
    public final LiveData<Boolean> n() {
        return this.f82634u;
    }

    @dl.d
    public final LiveData<e> o() {
        return this.f82625l;
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<androidx.paging.o0<LocalMedia>> p(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30651, new Class[]{Context.class}, kotlinx.coroutines.flow.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlinx.coroutines.flow.e) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        return CachedPagingDataKt.a(GalleryMediaRepository.f75278a.b(context), androidx.lifecycle.x0.a(this));
    }

    @dl.d
    public final LiveData<Pair<Boolean, Uri>> r() {
        return this.f82627n;
    }

    @dl.e
    public final WeakReference<yh.a<b2>> s() {
        return this.f82628o;
    }

    @dl.d
    public final LiveData<PostToolsV2TabType> t() {
        return this.f82621h;
    }

    @dl.d
    public final LiveData<Boolean> u() {
        return this.f82630q;
    }

    public final boolean v(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30654, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (kotlin.jvm.internal.f0.g(str, "draft_box") || kotlin.jvm.internal.f0.g(str, PostTabActivity.G3)) ? false : true;
    }

    @dl.d
    public final LiveData<Boolean> x() {
        return this.f82636w;
    }

    public final void y(@dl.d Activity context) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30657, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            this.f82633t.o(Boolean.valueOf(Build.VERSION.SDK_INT >= 33 ? com.max.hbpermission.d.b(BaseApplication.a(), "android.permission.READ_MEDIA_IMAGES") : com.max.hbpermission.d.d(BaseApplication.a(), new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})));
            objB = kotlin.Result.b(b2.f124493a);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        if (kotlin.Result.e(objB) != null) {
            this.f82633t.o(Boolean.FALSE);
        }
    }

    public final void z() {
        PostEditAutoSaveManager<PostEditAutoSaveData> postEditAutoSaveManager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30667, new Class[0], Void.TYPE).isSupported || (postEditAutoSaveManager = this.f82617d) == null) {
            return;
        }
        postEditAutoSaveManager.i();
    }
}
