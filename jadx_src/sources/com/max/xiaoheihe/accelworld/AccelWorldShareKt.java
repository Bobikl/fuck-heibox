package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.share.DouYinConfig;
import com.max.xiaoheihe.bean.share.PostConfigObj;
import com.max.xiaoheihe.bean.share.ScreenReportObj;
import com.max.xiaoheihe.bean.share.ScreenShareInfoObj;
import com.max.xiaoheihe.bean.share.ScreenUploadInfo;
import com.max.xiaoheihe.bean.share.ShareImageDialogConfigObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldShare.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldShare.kt\ncom/max/xiaoheihe/accelworld/AccelWorldShareKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1855#2,2:379\n*S KotlinDebug\n*F\n+ 1 AccelWorldShare.kt\ncom/max/xiaoheihe/accelworld/AccelWorldShareKt\n*L\n297#1:379,2\n*E\n"})
public final class AccelWorldShareKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldShare.kt */
    public static final class a extends com.max.hbshare.c.b {
        a(b bVar) {
            super("roll_room", bVar);
        }
    }

    /* JADX INFO: compiled from: AccelWorldShare.kt */
    public static final class b implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, bb.c.m.ay, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.m.Zx, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: AccelWorldShare.kt */
    public static final class c implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Bitmap> f76461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f76462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f76463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<BBSTopicObj> f76465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f76466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f76467g;

        c(List<Bitmap> list, boolean z10, Context context, String str, List<BBSTopicObj> list2, List<String> list3, String str2) {
            this.f76461a = list;
            this.f76462b = z10;
            this.f76463c = context;
            this.f76464d = str;
            this.f76465e = list2;
            this.f76466f = list3;
            this.f76467g = str2;
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oy, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Bitmap bitmap : this.f76461a) {
                File fileQ0 = com.max.hbimage.b.q0(bitmap, this.f76462b ? com.max.xiaoheihe.utils.d.T() : com.max.xiaoheihe.utils.d.Q());
                if (fileQ0 != null) {
                    com.max.hbimage.b.l0(this.f76463c, fileQ0.getAbsolutePath());
                    if (fileQ0.exists()) {
                        arrayList.add(fileQ0);
                        arrayList2.add(bitmap);
                    }
                }
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.save_fail));
                return;
            }
            if (this.f76462b) {
                com.max.hbutils.utils.c.f("保存成功");
            }
            PostUtils.Companion companion = PostUtils.f81983a;
            Context context = this.f76463c;
            PostUtils.Companion.y(companion, (Activity) context, arrayList, arrayList2, this.f76464d, this.f76465e, this.f76466f, this.f76467g, null, AccelWorldShareKt.e(context), 128, null);
            ((FragmentActivity) this.f76463c).finish();
        }
    }

    /* JADX INFO: compiled from: AccelWorldShare.kt */
    public static final class d implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f76468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f76469b;

        d(Ref.IntRef intRef, yh.a<b2> aVar) {
            this.f76468a = intRef;
            this.f76469b = aVar;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.m.py, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            Ref.IntRef intRef = this.f76468a;
            int i10 = intRef.f124889b - 1;
            intRef.f124889b = i10;
            if (i10 == 0) {
                this.f76469b.invoke();
            }
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.m.qy, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            Ref.IntRef intRef = this.f76468a;
            int i10 = intRef.f124889b - 1;
            intRef.f124889b = i10;
            if (i10 == 0) {
                this.f76469b.invoke();
            }
        }
    }

    public static final /* synthetic */ Object a(FragmentActivity fragmentActivity, UiKitViewObj uiKitViewObj, ViewGroup viewGroup, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentActivity, uiKitViewObj, viewGroup, cVar}, null, changeQuickRedirect, true, bb.c.m.Yx, new Class[]{FragmentActivity.class, UiKitViewObj.class, ViewGroup.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : f(fragmentActivity, uiKitViewObj, viewGroup, cVar);
    }

    public static final /* synthetic */ void b(Context context, ScreenShareInfoObj screenShareInfoObj, ScreenStyleInfoObj screenStyleInfoObj, List list, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, screenShareInfoObj, screenStyleInfoObj, list, bVar}, null, changeQuickRedirect, true, bb.c.m.Xx, new Class[]{Context.class, ScreenShareInfoObj.class, ScreenStyleInfoObj.class, List.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        l(context, screenShareInfoObj, screenStyleInfoObj, list, bVar);
    }

    public static final void c(@dl.e Context context, @dl.e WebProtocolObj webProtocolObj) {
        HBShareProtocolData hBShareProtocolDataA0;
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj}, null, changeQuickRedirect, true, bb.c.m.Vx, new Class[]{Context.class, WebProtocolObj.class}, Void.TYPE).isSupported || webProtocolObj == null || context == null || (hBShareProtocolDataA0 = l0.a0(webProtocolObj)) == null) {
            return;
        }
        com.max.hbshare.c.b bVar = new com.max.hbshare.c.b(hBShareProtocolDataA0.getSrc(), new a(new b()), hBShareProtocolDataA0.getReport_extra());
        if (l0.l(context, hBShareProtocolDataA0, bVar)) {
            return;
        }
        k(context, hBShareProtocolDataA0, bVar);
    }

    public static final void d(@dl.d Context mContext, @dl.d final List<Bitmap> shareBitmapList, @dl.e ScreenUploadInfo screenUploadInfo, @dl.e final ScreenShareInfoObj screenShareInfoObj, @dl.e final ScreenStyleInfoObj screenStyleInfoObj, @dl.e final com.max.hbshare.c.b bVar, @dl.d final q0 scope, @dl.d io.reactivex.disposables.a compositeDisposable) {
        Boolean only_upload;
        Boolean upload;
        if (PatchProxy.proxy(new Object[]{mContext, shareBitmapList, screenUploadInfo, screenShareInfoObj, screenStyleInfoObj, bVar, scope, compositeDisposable}, null, changeQuickRedirect, true, bb.c.m.Nx, new Class[]{Context.class, List.class, ScreenUploadInfo.class, ScreenShareInfoObj.class, ScreenStyleInfoObj.class, com.max.hbshare.c.b.class, q0.class, io.reactivex.disposables.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(shareBitmapList, "shareBitmapList");
        f0.p(scope, "scope");
        f0.p(compositeDisposable, "compositeDisposable");
        boolean zBooleanValue = (screenUploadInfo == null || (upload = screenUploadInfo.getUpload()) == null) ? false : upload.booleanValue();
        boolean zBooleanValue2 = (screenUploadInfo == null || (only_upload = screenUploadInfo.getOnly_upload()) == null) ? false : only_upload.booleanValue();
        if (com.max.hbcommon.utils.c.w(shareBitmapList)) {
            return;
        }
        if (!zBooleanValue) {
            l(mContext, screenShareInfoObj, screenStyleInfoObj, shareBitmapList, bVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator<Bitmap> it = shareBitmapList.iterator();
        while (it.hasNext()) {
            File fileQ0 = com.max.hbimage.b.q0(it.next(), com.max.xiaoheihe.utils.d.Q());
            if (fileQ0 != null && fileQ0.exists()) {
                arrayList.add(fileQ0.getAbsolutePath());
                arrayList2.add(fileQ0);
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            com.max.hbutils.utils.x.m(Integer.valueOf(R.string.fail));
            return;
        }
        final WeakReference weakReference = new WeakReference(mContext);
        final boolean z10 = zBooleanValue2;
        com.max.xiaoheihe.module.upload.g.h(mContext, compositeDisposable, arrayList, "bbs", new com.max.xiaoheihe.module.upload.g.e() { // from class: com.max.xiaoheihe.accelworld.AccelWorldShareKt$fastShotScreenShotShareDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            private final void f() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ey, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList2)) {
                    return;
                }
                for (File file : arrayList2) {
                    if (file != null) {
                        file.delete();
                    }
                }
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public /* synthetic */ void a(float f10) {
                com.max.xiaoheihe.module.upload.h.b(this, f10);
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public /* synthetic */ boolean b() {
                return com.max.xiaoheihe.module.upload.h.a(this);
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void c(@dl.d String[] urls, @dl.d String extra) {
                if (PatchProxy.proxy(new Object[]{urls, extra}, this, changeQuickRedirect, false, bb.c.m.cy, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(urls, "urls");
                f0.p(extra, "extra");
                f();
                kotlinx.coroutines.k.f(scope, null, null, new AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1(weakReference, urls, z10, screenShareInfoObj, screenStyleInfoObj, shareBitmapList, bVar, null), 3, null);
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public boolean d() {
                return false;
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void e(@dl.d String error) {
                if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, bb.c.m.dy, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(error, "error");
                f();
                kotlinx.coroutines.k.f(scope, null, null, new AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadFail$1(null), 3, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.google.gson.JsonObject] */
    @dl.e
    public static final JsonObject e(@dl.e Context context) {
        WebView webViewU6;
        String url;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Qx, new Class[]{Context.class}, JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.max.hbminiprogram.h hVar = context instanceof com.max.hbminiprogram.h ? (com.max.hbminiprogram.h) context : null;
        if (hVar != null) {
            ?? jsonObject = new JsonObject();
            jsonObject.addProperty("source", ob.b.f132259k);
            jsonObject.addProperty("mini_program_id", hVar.B());
            Fragment fragmentT = hVar.T();
            WebviewFragment webviewFragment = fragmentT instanceof WebviewFragment ? (WebviewFragment) fragmentT : null;
            if (webviewFragment != null && (webViewU6 = webviewFragment.U6()) != null && (url = webViewU6.getUrl()) != null) {
                jsonObject.addProperty("mini_program_url", url);
            }
            objectRef.f124891b = jsonObject;
        }
        return (JsonObject) objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    private static final Object f(FragmentActivity fragmentActivity, UiKitViewObj uiKitViewObj, ViewGroup viewGroup, kotlin.coroutines.c<? super Bitmap> cVar) throws Throwable {
        AccelWorldShareKt$getUiKitBitmap$1 accelWorldShareKt$getUiKitBitmap$1;
        HBUiKitView hBUiKitView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentActivity, uiKitViewObj, viewGroup, cVar}, null, changeQuickRedirect, true, bb.c.m.Ux, new Class[]{FragmentActivity.class, UiKitViewObj.class, ViewGroup.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AccelWorldShareKt$getUiKitBitmap$1) {
            accelWorldShareKt$getUiKitBitmap$1 = (AccelWorldShareKt$getUiKitBitmap$1) cVar;
            int i10 = accelWorldShareKt$getUiKitBitmap$1.f76489d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                accelWorldShareKt$getUiKitBitmap$1.f76489d = i10 - Integer.MIN_VALUE;
            } else {
                accelWorldShareKt$getUiKitBitmap$1 = new AccelWorldShareKt$getUiKitBitmap$1(cVar);
            }
        } else {
            accelWorldShareKt$getUiKitBitmap$1 = new AccelWorldShareKt$getUiKitBitmap$1(cVar);
        }
        Object obj = accelWorldShareKt$getUiKitBitmap$1.f76488c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = accelWorldShareKt$getUiKitBitmap$1.f76489d;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            viewGroup.setClipChildren(false);
            ScrollView scrollView = new ScrollView(fragmentActivity);
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            viewGroup.addView(scrollView, 0);
            HBUiKitView hBUiKitView2 = new HBUiKitView(fragmentActivity);
            hBUiKitView2.setDataToCreate(uiKitViewObj);
            scrollView.addView(hBUiKitView2);
            scrollView.setOverScrollMode(2);
            scrollView.setClipChildren(false);
            scrollView.setFillViewport(true);
            hBUiKitView2.invalidate();
            hBUiKitView2.requestLayout();
            accelWorldShareKt$getUiKitBitmap$1.f76487b = hBUiKitView2;
            accelWorldShareKt$getUiKitBitmap$1.f76489d = 1;
            if (DelayKt.b(500L, accelWorldShareKt$getUiKitBitmap$1) == objH) {
                return objH;
            }
            hBUiKitView = hBUiKitView2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hBUiKitView = (HBUiKitView) accelWorldShareKt$getUiKitBitmap$1.f76487b;
            kotlin.t0.n(obj);
        }
        return ViewUtils.U(hBUiKitView);
    }

    public static final void g(@dl.d Context mContext, @dl.d List<Bitmap> shareBitmapList, boolean z10, @dl.e String str, @dl.e List<BBSTopicObj> list, @dl.e List<String> list2, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{mContext, shareBitmapList, new Byte(z10 ? (byte) 1 : (byte) 0), str, list, list2, str2}, null, changeQuickRedirect, true, bb.c.m.Px, new Class[]{Context.class, List.class, Boolean.TYPE, String.class, List.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(shareBitmapList, "shareBitmapList");
        if (mContext instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) mContext;
            if (fragmentActivity.isFinishing()) {
                return;
            }
            PermissionManager.f71603a.T(fragmentActivity, new c(shareBitmapList, z10, mContext, str, list, list2, str2));
        }
    }

    public static final void h(@dl.d Context context, @dl.d List<String> urlList, @dl.d yh.a<b2> onPreloadComplete) {
        if (PatchProxy.proxy(new Object[]{context, urlList, onPreloadComplete}, null, changeQuickRedirect, true, bb.c.m.Tx, new Class[]{Context.class, List.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(urlList, "urlList");
        f0.p(onPreloadComplete, "onPreloadComplete");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f124889b = urlList.size();
        Iterator<T> it = urlList.iterator();
        while (it.hasNext()) {
            com.max.hbimage.b.Y(context, (String) it.next(), new d(intRef, onPreloadComplete));
        }
    }

    public static final void i(@dl.d final FragmentActivity activity, @dl.e List<String> list, @dl.e final UiKitViewObj uiKitViewObj, @dl.e final ScreenShareInfoObj screenShareInfoObj, @dl.e final ScreenStyleInfoObj screenStyleInfoObj) {
        if (PatchProxy.proxy(new Object[]{activity, list, uiKitViewObj, screenShareInfoObj, screenStyleInfoObj}, null, changeQuickRedirect, true, bb.c.m.Sx, new Class[]{FragmentActivity.class, List.class, UiKitViewObj.class, ScreenShareInfoObj.class, ScreenStyleInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (uiKitViewObj != null) {
            final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.accelworld.AccelWorldShareKt$showCustomUIScreenshotShareDialog$show$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.accelworld.AccelWorldShareKt$showCustomUIScreenshotShareDialog$show$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: AccelWorldShare.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldShareKt$showCustomUIScreenshotShareDialog$show$1$1", f = "AccelWorldShare.kt", i = {}, l = {bb.c.b.f30715j2}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f76495b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ FragmentActivity f76496c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ UiKitViewObj f76497d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ com.max.hbutils.utils.b f76498e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ WeakReference<FragmentActivity> f76499f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ ScreenShareInfoObj f76500g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ ScreenStyleInfoObj f76501h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FragmentActivity fragmentActivity, UiKitViewObj uiKitViewObj, com.max.hbutils.utils.b bVar, WeakReference<FragmentActivity> weakReference, ScreenShareInfoObj screenShareInfoObj, ScreenStyleInfoObj screenStyleInfoObj, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f76496c = fragmentActivity;
                        this.f76497d = uiKitViewObj;
                        this.f76498e = bVar;
                        this.f76499f = weakReference;
                        this.f76500g = screenShareInfoObj;
                        this.f76501h = screenStyleInfoObj;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.wy, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f76496c, this.f76497d, this.f76498e, this.f76499f, this.f76500g, this.f76501h, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.yy, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.xy, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        ScreenReportObj report;
                        ScreenReportObj report2;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.vy, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f76495b;
                        if (i10 == 0) {
                            kotlin.t0.n(obj);
                            FragmentActivity fragmentActivity = this.f76496c;
                            UiKitViewObj uiKitViewObj = this.f76497d;
                            FrameLayout frameLayoutC = this.f76498e.c();
                            f0.m(frameLayoutC);
                            this.f76495b = 1;
                            obj = AccelWorldShareKt.a(fragmentActivity, uiKitViewObj, frameLayoutC, this);
                            if (obj == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                        }
                        Bitmap bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                            WeakReference<FragmentActivity> weakReference = this.f76499f;
                            ScreenShareInfoObj screenShareInfoObj = this.f76500g;
                            ScreenStyleInfoObj screenStyleInfoObj = this.f76501h;
                            FragmentActivity it = weakReference.get();
                            if (it != null) {
                                f0.o(it, "it");
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(bitmap);
                                b2 b2Var = b2.f124493a;
                                AccelWorldShareKt.b(it, screenShareInfoObj, screenStyleInfoObj, arrayList, new com.max.hbshare.c.b((screenShareInfoObj == null || (report2 = screenShareInfoObj.getReport()) == null) ? null : report2.getSrc(), null, (screenShareInfoObj == null || (report = screenShareInfoObj.getReport()) == null) ? null : report.getExtra()));
                            }
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uy, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ty, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    WeakReference weakReference = new WeakReference(activity);
                    com.max.hbutils.utils.b bVar = new com.max.hbutils.utils.b(activity);
                    bVar.f();
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(activity), null, null, new AnonymousClass1(activity, uiKitViewObj, bVar, weakReference, screenShareInfoObj, screenStyleInfoObj, null), 3, null);
                    bVar.d();
                }
            };
            if (list == null || list.isEmpty()) {
                aVar.invoke();
            } else {
                f0.m(list);
                h(activity, list, new yh.a<b2>() { // from class: com.max.xiaoheihe.accelworld.AccelWorldShareKt$showCustomUIScreenshotShareDialog$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.sy, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ry, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        aVar.invoke();
                    }
                });
            }
        }
    }

    private static final void j(Context context, List<Bitmap> list, ShareImageDialogConfigObj shareImageDialogConfigObj, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, list, shareImageDialogConfigObj, bVar}, null, changeQuickRedirect, true, bb.c.m.Rx, new Class[]{Context.class, List.class, ShareImageDialogConfigObj.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported || !(context instanceof FragmentActivity) || ((FragmentActivity) context).isFinishing()) {
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.B4(list);
        shareImageDialogFragmentX4.C4(shareImageDialogConfigObj);
        shareImageDialogFragmentX4.S4(bVar);
        try {
            shareImageDialogFragmentX4.show(((FragmentActivity) context).getSupportFragmentManager(), "TAG_SHARE_IMAGE");
        } catch (Exception e10) {
            com.max.heybox.hblog.g.f74531b.u(e10);
        }
    }

    private static final void k(Context context, HBShareProtocolData hBShareProtocolData, com.max.hbshare.c.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, hBShareProtocolData, bVar}, null, changeQuickRedirect, true, bb.c.m.Wx, new Class[]{Context.class, HBShareProtocolData.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        UMImage uMImage = !com.max.hbcommon.utils.c.u(hBShareProtocolData.getImg_url()) ? new UMImage(context, hBShareProtocolData.getImg_url()) : new UMImage(context, R.drawable.share_thumbnail);
        HBShareData hBShareData = hBShareProtocolData.toHBShareData();
        hBShareData.setUmImage(uMImage);
        hBShareData.setShareListener(bVar);
        com.max.hbshare.d.E(context, hBShareData);
    }

    private static final void l(Context context, ScreenShareInfoObj screenShareInfoObj, ScreenStyleInfoObj screenStyleInfoObj, List<Bitmap> list, com.max.hbshare.c.b bVar) {
        String str;
        List<BBSTopicObj> list2;
        String str2;
        String str3;
        List<String> list3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        String strValueOf;
        List<BBSTopicObj> topic_infos;
        String string;
        String default_content;
        List<String> hashtags;
        String tips;
        String douyin_bg_url;
        boolean zX = false;
        if (PatchProxy.proxy(new Object[]{context, screenShareInfoObj, screenStyleInfoObj, list, bVar}, null, changeQuickRedirect, true, bb.c.m.Ox, new Class[]{Context.class, ScreenShareInfoObj.class, ScreenStyleInfoObj.class, List.class, com.max.hbshare.c.b.class}, Void.TYPE).isSupported) {
            return;
        }
        String douyin_hashtag = null;
        if (screenShareInfoObj != null) {
            PostConfigObj post_config = screenShareInfoObj.getPost_config();
            if (post_config != null) {
                topic_infos = post_config.getTopic_infos();
                boolean zG = f0.g(Boolean.TRUE, post_config.getPost_now());
                JsonObject image_extra = post_config.getImage_extra();
                JsonObject jsonObjectDeepCopy = image_extra != null ? image_extra.deepCopy() : null;
                if (jsonObjectDeepCopy == null) {
                    jsonObjectDeepCopy = new JsonObject();
                }
                string = jsonObjectDeepCopy.toString();
                default_content = post_config.getDefault_content();
                hashtags = post_config.getHashtags();
                tips = post_config.getTips();
                strValueOf = post_config.getPost_extra_params() != null ? String.valueOf(post_config.getPost_extra_params()) : null;
                zX = zG;
            } else {
                strValueOf = null;
                topic_infos = null;
                string = null;
                default_content = null;
                hashtags = null;
                tips = null;
            }
            DouYinConfig douyin_config = screenShareInfoObj.getDouyin_config();
            if (douyin_config != null) {
                douyin_hashtag = douyin_config.getDouyin_hashtag();
                douyin_bg_url = douyin_config.getDouyin_bg_url();
            } else {
                douyin_bg_url = null;
            }
            str2 = douyin_hashtag;
            str5 = strValueOf;
            list2 = topic_infos;
            str3 = douyin_bg_url;
            str = string;
            str4 = default_content;
            list3 = hashtags;
            str6 = tips;
            z10 = zX;
            zX = com.max.hbcommon.utils.c.x(screenShareInfoObj.getSave_to_disk());
        } else {
            str = null;
            list2 = null;
            str2 = null;
            str3 = null;
            list3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            z10 = false;
        }
        if (z10) {
            g(context, list, zX, str, list2, list3, str5);
        } else {
            j(context, list, new ShareImageDialogConfigObj(null, null, null, str, list2, str2, str3, null, list3, str4, null, screenStyleInfoObj, str5, str6, null, 16384, null), bVar);
        }
    }
}
