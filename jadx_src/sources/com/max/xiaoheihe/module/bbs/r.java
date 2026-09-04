package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.j1;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbimage.preview.PreviewInfo;
import com.max.hbshare.bean.HBShareData;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: HBImagePreviewFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class r extends com.previewlibrary.view.a implements com.max.hbcommon.base.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final a f83189u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f83190v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f83191w = "save";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f83192x = "share";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f83193y = "delete";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final String f83194z = "parse";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private PreviewInfo f83195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f83196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private Toast f83197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.a f83198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final UMShareListener f83199t = new g();

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class b implements fg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // fg.b
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 26458, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.previewlibrary.view.a) r.this).f96347f.setVisibility(8);
            if (drawable != null) {
                r rVar = r.this;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((BitmapDrawable) drawable).getBitmap());
                kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap((it as BitmapDrawable).bitmap)");
                new a0(bitmapCreateBitmap, rVar.f83195p).execute(new String[0]);
            }
            String strS = ((com.previewlibrary.view.a) r.this).f96343b.s();
            if (strS != null) {
                if (!(strS.length() == 0)) {
                    ((com.previewlibrary.view.a) r.this).f96349h.setVisibility(0);
                    j1.g(((com.previewlibrary.view.a) r.this).f96349h).b(1.0f).s(1000L).y();
                    return;
                }
            }
            ((com.previewlibrary.view.a) r.this).f96349h.setVisibility(8);
        }

        @Override // fg.b
        public void onLoadFailed(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 26459, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.previewlibrary.view.a) r.this).f96347f.setVisibility(8);
            ((com.previewlibrary.view.a) r.this).f96349h.setVisibility(8);
            if (drawable != null) {
                ((com.previewlibrary.view.a) r.this).f96345d.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26460, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (((com.previewlibrary.view.a) r.this).f96345d.x()) {
                return false;
            }
            r.e4(r.this);
            return true;
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class d implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f83202a = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26461, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26462, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (r.this.isActive()) {
                super.onError(e10);
                r.U3(r.this);
                r rVar = r.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r.this.getString(R.string.save_fail));
                sb2.append(e10.getMessage() != null ? StringsKt__IndentKt.p(String.valueOf(e10.getMessage())) : "");
                r.f4(rVar, sb2.toString());
            }
        }

        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 26463, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(file, "file");
            if (r.this.isActive()) {
                super.onNext(file);
                com.max.hbimage.b.l0(r.this.getContext(), file.getAbsolutePath());
                r.U3(r.this);
                r rVar = r.this;
                String strZ = com.max.xiaoheihe.utils.d.Z();
                kotlin.jvm.internal.f0.o(strZ, "getImgSavedSuccessToast()");
                r.f4(rVar, strZ);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26464, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class f implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f83205a;

            a(r rVar) {
                this.f83205a = rVar;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 26467, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                r.c4(this.f83205a);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 26466, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        f() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            String strX3;
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26465, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(r.f83191w, keyDescObj.getKey())) {
                r.this.k4();
                return;
            }
            if (kotlin.jvm.internal.f0.g("share", keyDescObj.getKey())) {
                r.d4(r.this);
                return;
            }
            if (kotlin.jvm.internal.f0.g("delete", keyDescObj.getKey())) {
                com.max.xiaoheihe.view.l.D(r.this.getActivity(), com.max.xiaoheihe.utils.d.n0(R.string.delete_img_confirm), "", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a(r.this));
            } else {
                if (!kotlin.jvm.internal.f0.g(r.f83194z, keyDescObj.getKey()) || (strX3 = r.X3(r.this)) == null) {
                    return;
                }
                r rVar = r.this;
                com.max.hbqrcode.b.d(r.b4(rVar), rVar.requireActivity(), strX3);
            }
        }
    }

    /* JADX INFO: compiled from: HBImagePreviewFragment.kt */
    public static final class g implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 26470, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(r.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 26469, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(r.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 26468, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }
    }

    public static final /* synthetic */ void U3(r rVar) {
        if (PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26451, new Class[]{r.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.g4();
    }

    public static final /* synthetic */ String X3(r rVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26455, new Class[]{r.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : rVar.h4();
    }

    public static final /* synthetic */ io.reactivex.disposables.a b4(r rVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26456, new Class[]{r.class}, io.reactivex.disposables.a.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : rVar.i4();
    }

    public static final /* synthetic */ void c4(r rVar) {
        if (PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26454, new Class[]{r.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.j4();
    }

    public static final /* synthetic */ void d4(r rVar) {
        if (PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26453, new Class[]{r.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.l4();
    }

    public static final /* synthetic */ void e4(r rVar) {
        if (PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, 26457, new Class[]{r.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.m4();
    }

    public static final /* synthetic */ void f4(r rVar, String str) {
        if (PatchProxy.proxy(new Object[]{rVar, str}, null, changeQuickRedirect, true, 26452, new Class[]{r.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.n4(str);
    }

    private final void g4() {
        Toast toast;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26441, new Class[0], Void.TYPE).isSupported || (toast = this.f83197r) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(toast);
        toast.cancel();
    }

    private final String h4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26442, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PreviewInfo previewInfo = this.f83195p;
        if (previewInfo != null) {
            return previewInfo.d();
        }
        return null;
    }

    private final io.reactivex.disposables.a i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26435, new Class[0], io.reactivex.disposables.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.a) patchProxyResultProxy.result;
        }
        if (this.f83198s == null) {
            this.f83198s = new io.reactivex.disposables.a();
        }
        return this.f83198s;
    }

    private final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26445, new Class[0], Void.TYPE).isSupported || this.f83195p == null) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        PreviewInfo previewInfo = this.f83195p;
        kotlin.jvm.internal.f0.m(previewInfo);
        String strA = previewInfo.a();
        PreviewInfo previewInfo2 = this.f83195p;
        kotlin.jvm.internal.f0.m(previewInfo2);
        io.reactivex.g0 g0VarJ5 = eVarA.s5(strA, previewInfo2.getUrl()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q());
        kotlin.jvm.internal.f0.o(g0VarJ5, "createHeyBoxService()\n  …ribeWith(ToastObserver())");
        addDisposable((io.reactivex.disposables.b) g0VarJ5);
    }

    private final void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26444, new Class[0], Void.TYPE).isSupported || this.f83195p == null) {
            return;
        }
        Context context = getContext();
        Context context2 = getContext();
        PreviewInfo previewInfo = this.f83195p;
        kotlin.jvm.internal.f0.m(previewInfo);
        com.max.hbshare.d.E(context, new HBShareData(true, false, null, null, null, null, new UMImage(context2, previewInfo.getUrl()), this.f83199t, null, null, null, null, null, bb.c.k.L0, null));
    }

    private final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26443, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if ((activity != null && activity.isFinishing()) || getActivity() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(f83191w);
        keyDescObj.setDesc(getString(R.string.save));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("share");
        keyDescObj2.setDesc(getString(R.string.share));
        arrayList.add(keyDescObj2);
        PreviewInfo previewInfo = this.f83195p;
        if (!com.max.hbcommon.utils.c.u(previewInfo != null ? previewInfo.a() : null) && kotlin.jvm.internal.f0.g("1", com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_basic_permission())) {
            KeyDescObj keyDescObj3 = new KeyDescObj();
            keyDescObj3.setKey("delete");
            keyDescObj3.setDesc(getString(R.string.delete));
            arrayList.add(keyDescObj3);
        }
        if (!com.max.hbcommon.utils.c.u(h4())) {
            KeyDescObj keyDescObj4 = new KeyDescObj();
            keyDescObj4.setKey(f83194z);
            keyDescObj4.setDesc("识别二维码");
            arrayList.add(keyDescObj4);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(requireActivity(), arrayList, false);
        heyBoxPopupMenu.R(new f());
        heyBoxPopupMenu.show();
    }

    private final void n4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26440, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Toast toastMakeText = Toast.makeText(getContext(), str, 0);
        this.f83197r = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
    }

    @Override // com.previewlibrary.view.a
    @dl.d
    public fg.b M3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26446, new Class[0], fg.b.class);
        return patchProxyResultProxy.isSupported ? (fg.b) patchProxyResultProxy.result : new b();
    }

    public final void addDisposable(@dl.d io.reactivex.disposables.b disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, changeQuickRedirect, false, 26438, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(disposable, "disposable");
        if (i4() == null) {
            this.f83198s = new io.reactivex.disposables.a();
        }
        io.reactivex.disposables.a aVarI4 = i4();
        if (aVarI4 != null) {
            aVarI4.c(disposable);
        }
    }

    public final void clearCompositeDisposable() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26439, new Class[0], Void.TYPE).isSupported || i4() == null) {
            return;
        }
        io.reactivex.disposables.a aVarI4 = i4();
        kotlin.jvm.internal.f0.m(aVarI4);
        aVarI4.f();
    }

    @Override // com.max.hbcommon.base.f
    @dl.e
    public Context getViewContext() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26450, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : getContext();
    }

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        return this.f83196q;
    }

    @SuppressLint({"AutoDispose"})
    public final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26436, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g4();
        String string = getString(R.string.saving);
        kotlin.jvm.internal.f0.o(string, "getString(R.string.saving)");
        n4(string);
        PreviewInfo previewInfo = this.f83195p;
        io.reactivex.g0 g0VarJ5 = com.max.hbimage.b.i(com.max.xiaoheihe.utils.d.T(), d.f83202a, previewInfo != null ? previewInfo.getUrl() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e());
        kotlin.jvm.internal.f0.o(g0VarJ5, "@SuppressLint(\"AutoDispo…       })\n        )\n    }");
        addDisposable((io.reactivex.disposables.b) g0VarJ5);
    }

    @Override // com.previewlibrary.view.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        g4();
    }

    @Override // com.previewlibrary.view.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26448, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.f83196q = false;
        clearCompositeDisposable();
    }

    @Override // com.previewlibrary.view.a, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26447, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        this.f83196q = true;
        this.f83195p = (PreviewInfo) this.f96343b;
        this.f96345d.setMaximumScale(10.0f);
        if (this.f96345d.isHardwareAccelerated()) {
            this.f96345d.setLayerType(1, null);
        }
        this.f96345d.setOnLongClickListener(new c());
    }

    public final void reload() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26437, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f96345d.f96384e = false;
        String url = this.f96343b.getUrl();
        kotlin.jvm.internal.f0.o(url, "beanViewInfo.url");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.f0.o(locale, "getDefault()");
        String lowerCase = url.toLowerCase(locale);
        kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!StringsKt__StringsKt.W2(lowerCase, com.max.mediaselector.lib.config.f.f75143v, false, 2, null)) {
            com.previewlibrary.b.a().b().d(this, this.f96343b.getUrl(), this.f96345d, this.f96348g);
        } else {
            this.f96345d.setZoomable(false);
            com.previewlibrary.b.a().b().a(this, this.f96343b.getUrl(), this.f96345d, this.f96348g);
        }
    }
}
