package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.max.xiaoheihe.bean.CropRectObj;
import com.max.xiaoheihe.bean.IconCfgObj;
import com.max.xiaoheihe.bean.ImageInjectInfo;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.PhotoZoomObj;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.SourceType;
import com.max.xiaoheihe.bean.StatusBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.WebUrlCheckResult;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPrivacyJsObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.CropRatioInfo;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@com.max.hbcommon.base.hblifeevent.activity.b(lifeEvents = {com.max.xiaoheihe.module.proxy.a.class})
@ig.d(path = {lb.d.f131251s4})
public class WebActionActivity extends BaseActivity implements com.max.xiaoheihe.module.webview.c, com.max.xiaoheihe.app.c, com.max.xiaoheihe.module.account.p0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f94258j4 = 111;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final String f94259k4 = "window_active_js";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final String f94260l4 = "web_img_url";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final String f94261m4 = "upload_feedback_pubg";

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final int f94262n4 = 1000;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final int f94263o4 = 1001;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    protected static Intent f94264p4;
    protected boolean G2;
    protected String G3;
    protected String J3;
    protected String K3;
    View L;
    protected String L3;
    ImageView M;
    protected String[] M3;
    protected TextView N;
    protected String[] N3;
    ImageView O;
    protected WebProtocolObj O3;
    TextView P;
    protected WebviewFragment P3;
    protected String Q;
    protected String R;
    protected String T;
    protected String U;
    protected SteamPrivacyJsObj U3;
    protected MallOrderNotifyObj V;
    protected String V3;
    protected String W;
    protected String X;
    protected LoadingDialog X3;
    protected String Y;
    private File Y3;
    protected String Z;
    protected HashMap<String, String> Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected String f94265a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    protected ArrayList<TagJsObj> f94266a4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected String f94267b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected String f94269c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private WebProtocolObj f94270c4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    protected BgConfigObj f94274g4;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected String f94277p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected boolean f94278p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected boolean f94279p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected boolean f94280x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected String f94281x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected boolean f94282y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    protected boolean f94283y2;
    protected String S = "";
    protected List<LocalMedia> Q3 = new ArrayList();
    protected ArrayList<Bitmap> R3 = new ArrayList<>();
    protected ArrayList<String> S3 = new ArrayList<>();
    protected ArrayList<String> T3 = new ArrayList<>();
    protected boolean W3 = false;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private boolean f94268b4 = false;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private HashMap<String, Draft> f94271d4 = new HashMap<>();

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    protected boolean f94272e4 = true;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    protected boolean f94273f4 = false;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private boolean f94275h4 = false;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    protected UMShareListener f94276i4 = new o();

    public class a implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f94284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f94286c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.WebActionActivity$a$a, reason: collision with other inner class name */
        public class C0890a implements oe.t<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0890a() {
            }

            @Override // oe.t
            public void onCancel() {
            }

            @Override // oe.t
            public void onResult(ArrayList<LocalMedia> arrayList) {
                if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47050, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList)) {
                    return;
                }
                WebActionActivity webActionActivity = null;
                Context context = a.this.f94284a;
                if (context instanceof WebActionActivity) {
                    webActionActivity = (WebActionActivity) context;
                } else if (com.max.hbutils.utils.e.b().a() instanceof WebActionActivity) {
                    webActionActivity = (WebActionActivity) com.max.hbutils.utils.e.b().a();
                }
                WebActionActivity webActionActivity2 = webActionActivity;
                if (webActionActivity2 != null) {
                    String strValueOf = a.this.f94285b.valueOf("cut");
                    if (com.max.hbcommon.utils.c.u(strValueOf)) {
                        WebActionActivity.l2(webActionActivity2, arrayList);
                        return;
                    }
                    PhotoZoomObj photoZoomObj = (PhotoZoomObj) new Gson().fromJson(strValueOf, PhotoZoomObj.class);
                    int iQ = com.max.hbutils.utils.n.q(photoZoomObj.getWidth());
                    int iQ2 = com.max.hbutils.utils.n.q(photoZoomObj.getHeight());
                    Uri uriF = FileProvider.f(webActionActivity2, "com.max.xiaoheihe.fileprovider", new File(arrayList.get(0).G()));
                    if (iQ <= 0 || iQ2 <= 0) {
                        return;
                    }
                    com.max.mediaselector.e.m(uriF, webActionActivity2, 1000, WebActionActivity.k2(webActionActivity2), iQ, iQ2);
                }
            }
        }

        a(Context context, WebProtocolObj webProtocolObj, boolean z10) {
            this.f94284a = context;
            this.f94285b = webProtocolObj;
            this.f94286c = z10;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47049, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.mediaselector.e.j(this.f94284a, com.max.hbutils.utils.n.q(this.f94285b.valueOf("count")), new C0890a(), true, com.max.hbcommon.utils.c.x(this.f94285b.valueOf("gif")), this.f94286c, true);
        }
    }

    public class b implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94289b;

        b(String str, String str2) {
            this.f94288a = str;
            this.f94289b = str2;
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
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 47051, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f94288a.equals("video")) {
                WebActionActivity.this.N3 = strArr;
            } else {
                WebActionActivity.this.M3 = strArr;
            }
            com.max.xiaoheihe.utils.a0.g().d(this.f94289b);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47052, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            LoadingDialog loadingDialog = WebActionActivity.this.X3;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            com.max.xiaoheihe.utils.a0.g().d(this.f94289b);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<WebUrlCheckResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94291b;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 47055, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WebActionActivity.B2(WebActionActivity.this);
            }
        }

        c(String str) {
            this.f94291b = str;
        }

        public void onNext(Result<WebUrlCheckResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47053, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            String strategy = result.getResult().getStrategy();
            if ("allow".equals(strategy)) {
                WebActionActivity.this.K3(result.getResult().getRedirected_url());
                return;
            }
            if ("warn".equals(strategy)) {
                WebActionActivity.m2(WebActionActivity.this, this.f94291b);
                return;
            }
            if ("forbid".equals(strategy)) {
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) WebActionActivity.this).f66601b);
                fVar.l(result.getResult().getDesc());
                com.max.hbcommon.view.a aVarD = fVar.d();
                aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a());
                aVarD.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47054, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WebUrlCheckResult>) obj);
        }
    }

    public class d implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94294a;

        public class a implements oe.t<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.t
            public void onCancel() {
            }

            @Override // oe.t
            public void onResult(ArrayList<LocalMedia> arrayList) {
                if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47057, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList)) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<LocalMedia> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Uri.fromFile(new File(it.next().G())));
                }
                WebActionActivity.v2(WebActionActivity.this, arrayList2, null);
            }
        }

        d(WebProtocolObj webProtocolObj) {
            this.f94294a = webProtocolObj;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            String src;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47056, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            int iQ = com.max.hbutils.utils.n.q(this.f94294a.valueOf("image_pick_count"));
            ArrayList arrayList = (ArrayList) this.f94294a.listOf("image_urls", String.class);
            String strValueOf = this.f94294a.valueOf("image_id");
            if (!com.max.hbcommon.utils.c.u(strValueOf) && WebActionActivity.this.f94271d4.get(strValueOf) != null) {
                Draft draft = (Draft) WebActionActivity.this.f94271d4.get(strValueOf);
                if (draft == null || (src = draft.getSrc()) == null) {
                    return;
                }
                WebActionActivity.p2(WebActionActivity.this, Uri.fromFile(new File(src)), draft);
                return;
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                com.max.mediaselector.e.k(((BaseActivity) WebActionActivity.this).f66601b, iQ, new a(), true, false, false, true, false);
            } else {
                if (arrayList == null) {
                    return;
                }
                WebActionActivity.r2(WebActionActivity.this, (String) arrayList.get(0));
            }
        }
    }

    public class e implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f94297a;

        e(List list) {
            this.f94297a = list;
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
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 47058, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            for (int i10 = 0; i10 < this.f94297a.size(); i10++) {
                ((ImageInjectInfo) this.f94297a.get(i10)).setImage_url(strArr[i10]);
            }
            WebActionActivity.x2(WebActionActivity.this, this.f94297a);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
        }
    }

    public class f extends com.max.hbimage.image.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(String str) {
            super(str);
        }

        @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
        public void onLoadFailed(@androidx.annotation.p0 Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 47060, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("图片加载失败");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.max.hbimage.image.o
        public void onResourceReady(@androidx.annotation.n0 File file, @androidx.annotation.p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, 47059, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            LoadingDialog loadingDialog = WebActionActivity.this.X3;
            if (loadingDialog != null && loadingDialog.i()) {
                WebActionActivity.this.X3.c();
            }
            if (file.exists()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Uri.fromFile(file));
                WebActionActivity.v2(WebActionActivity.this, arrayList, null);
            }
        }

        @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@androidx.annotation.n0 File file, @androidx.annotation.p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, 47061, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady(file, fVar);
        }
    }

    public class g extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47048, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebActionActivity.this.b2();
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebviewFragment webviewFragment;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47062, new Class[]{View.class}, Void.TYPE).isSupported || (webviewFragment = WebActionActivity.this.P3) == null || !webviewFragment.isAdded()) {
                return;
            }
            WebActionActivity.this.P3.X6();
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94302b;

        i(IconCfgObj iconCfgObj) {
            this.f94302b = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47063, new Class[]{View.class}, Void.TYPE).isSupported || this.f94302b.getProtocol() == null) {
                return;
            }
            com.max.xiaoheihe.utils.l0.f95687b.C(((BaseActivity) WebActionActivity.this).f66601b, WebActionActivity.this.P3.U6(), this.f94302b.getProtocol(), WebActionActivity.this.P3);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94304b;

        j(IconCfgObj iconCfgObj) {
            this.f94304b = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47064, new Class[]{View.class}, Void.TYPE).isSupported || this.f94304b.getProtocol() == null) {
                return;
            }
            com.max.xiaoheihe.utils.l0.f95687b.C(((BaseActivity) WebActionActivity.this).f66601b, WebActionActivity.this.P3.U6(), this.f94304b.getProtocol(), WebActionActivity.this.P3);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47065, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UMImage uMImage = com.max.hbcommon.utils.c.u(WebActionActivity.this.f94267b0) ? null : new UMImage(((BaseActivity) WebActionActivity.this).f66601b, WebActionActivity.this.f94267b0);
            Activity activity = ((BaseActivity) WebActionActivity.this).f66601b;
            WebActionActivity webActionActivity = WebActionActivity.this;
            com.max.hbshare.d.E(activity, new HBShareData(false, true, webActionActivity.Y, webActionActivity.f94265a0, webActionActivity.Z, null, uMImage, webActionActivity.f94276i4));
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47066, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.i0.o().isLoginFlag()) {
                ((BaseActivity) WebActionActivity.this).f66601b.startActivity(new Intent(((BaseActivity) WebActionActivity.this).f66601b, (Class<?>) MainActivity.class));
                WebActionActivity.B2(WebActionActivity.this);
            } else {
                ((BaseActivity) WebActionActivity.this).f66601b.startActivity(new Intent(((BaseActivity) WebActionActivity.this).f66601b, (Class<?>) RegisterOrLoginActivityV2.class));
                WebActionActivity.B2(WebActionActivity.this);
            }
        }
    }

    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47067, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebActionActivity.B2(WebActionActivity.this);
        }
    }

    public class n extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 47077, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WebActionActivity.this.finish();
            }
        }

        public class b implements DialogInterface.OnDismissListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
            }
        }

        n() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public WebResourceResponse a(WebView webView, WebResourceRequest webResourceRequest) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 47068, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebResourceResponse) patchProxyResultProxy.result;
            }
            WebResourceResponse webResourceResponseL3 = WebActionActivity.this.L3(webView, webResourceRequest);
            return webResourceResponseL3 != null ? webResourceResponseL3 : super.a(webView, webResourceRequest);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47075, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && "public".equals(webProtocolObj.valueOf("type")) && ITagManager.SUCCESS.equals(webProtocolObj.valueOf("state"))) {
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) WebActionActivity.this).f66601b);
                fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.make_public_success));
                fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.make_public_success_desc));
                com.max.hbcommon.view.a aVarD = fVar.d();
                aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a());
                aVarD.setOnDismissListener(new b());
                aVarD.show();
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void e(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47070, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.e(webView, str);
            WebActionActivity.this.M3(webView, str);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47071, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.g(webView, str, i10, i11);
            WebActionActivity.this.N3(webView, str, i10, i11);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47069, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.i(webView, str, i10, i11);
            WebActionActivity.this.O3(webView, str, i10, i11);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void j(boolean z10) {
            if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47076, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && WebActionActivity.this.isActive()) {
                ((BaseActivity) WebActionActivity.this).f66616q.setInStack(Boolean.valueOf(z10));
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void k(WebView webView, int i10) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10)}, this, changeQuickRedirect, false, 47072, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.k(webView, i10);
            WebActionActivity.this.P3(webView, i10);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void n(WebView webView, Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{webView, bitmap}, this, changeQuickRedirect, false, 47073, new Class[]{WebView.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            WebActionActivity.this.w3(bitmap);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (!PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47074, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.l0.i0(webView.getUrl(), str)) {
                WebActionActivity webActionActivity = WebActionActivity.this;
                if (webActionActivity.W3) {
                    return;
                }
                if (((BaseActivity) webActionActivity).f66616q != null && ((BaseActivity) WebActionActivity.this).f66616q.getVisibility() == 0) {
                    ((BaseActivity) WebActionActivity.this).f66616q.setTitle(str);
                }
                TextView textView = WebActionActivity.this.N;
                if (textView == null || textView.getVisibility() != 0) {
                    return;
                }
                WebActionActivity.this.N.setText(str);
            }
        }
    }

    public class o implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47080, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            WebActionActivity.this.A3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 47079, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(WebActionActivity.this.getString(R.string.share_fail));
            WebActionActivity.this.A3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47078, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(WebActionActivity.this.getString(R.string.share_success));
            WebActionActivity.this.A3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    static /* synthetic */ void B2(WebActionActivity webActionActivity) {
        if (PatchProxy.proxy(new Object[]{webActionActivity}, null, changeQuickRedirect, true, 47040, new Class[]{WebActionActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.F3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        final WebviewFragment webviewFragmentN2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47014, new Class[0], Void.TYPE).isSupported || (webviewFragmentN2 = N2()) == null) {
            return;
        }
        LoadingDialog loadingDialog = this.X3;
        if (loadingDialog != null && loadingDialog.i()) {
            this.X3.c();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = this.M3;
        if (strArr != null && !com.max.hbcommon.utils.c.v(strArr) && !com.max.hbcommon.utils.c.w(this.S3)) {
            for (int i10 = 0; i10 < this.M3.length && i10 < this.S3.size(); i10++) {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                map.put("url", this.M3[i10]);
                map.put("type", "image");
                map.put("thumb", this.S3.get(i10));
                arrayList.add(map);
                map2.put("url", this.M3[i10]);
                map2.put("type", "image");
                map2.put("thumb", AccelWorldStringKt.f(this.S3.get(i10)));
                arrayList2.add(map2);
            }
        }
        String[] strArr2 = this.N3;
        if (strArr2 != null && !com.max.hbcommon.utils.c.v(strArr2) && !com.max.hbcommon.utils.c.w(this.T3)) {
            for (int i11 = 0; i11 < this.N3.length && i11 < this.T3.size(); i11++) {
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                map3.put("url", this.N3[i11]);
                map3.put("type", "video");
                map3.put("thumb", this.T3.get(i11));
                arrayList.add(map3);
                map4.put("url", this.N3[i11]);
                map4.put("type", "video");
                map4.put("thumb", AccelWorldStringKt.f(this.T3.get(i11)));
                arrayList2.add(map4);
            }
        }
        final String str = String.format("javascript:clientUploadCallback(%s)", com.max.hbutils.utils.k.p(arrayList));
        final JsonArray asJsonArray = new Gson().toJsonTree(arrayList2).getAsJsonArray();
        com.max.hbcommon.utils.d.b("cqtest", str);
        final WebView webViewU6 = webviewFragmentN2.U6();
        runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.module.webview.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f94698b.q3(webviewFragmentN2, asJsonArray, webViewU6, str);
            }
        });
        this.S3.clear();
        this.T3.clear();
        this.Q3.clear();
        this.M3 = null;
        this.N3 = null;
    }

    private void C3(ViewGroup viewGroup, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47009, new Class[]{ViewGroup.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_game_web_option);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_game_web_exit);
        View viewFindViewById = viewGroup.findViewById(R.id.v_game_web_line);
        if (z10) {
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.black));
            imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.black));
            viewFindViewById.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.black_alpha10));
            viewGroup.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f66601b, R.color.transparent, 16.0f), this.f66601b, R.color.black_alpha10, 0.5f));
            return;
        }
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
        imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
        viewFindViewById.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha20));
        viewGroup.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f66601b, R.color.black_alpha15, 16.0f), this.f66601b, R.color.white_alpha20, 0.5f));
    }

    private void F3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46996, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strH = com.max.xiaoheihe.accelworld.j.h(WebviewFragment.f94359a5);
        WebviewFragment webviewFragment = this.P3;
        if (webviewFragment == null || !webviewFragment.j7()) {
            finish();
        } else {
            com.max.xiaoheihe.accelworld.j.e(strH, this.P3, new t.b() { // from class: com.max.xiaoheihe.module.webview.g
                @Override // com.max.xiaoheihe.module.webview.t.b
                public final void a(JsonObject jsonObject) {
                    WebActionActivity.r3(jsonObject);
                }
            }, new t.a() { // from class: com.max.xiaoheihe.module.webview.j
                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    this.f94720a.s3();
                }
            }, null);
        }
    }

    private Uri G2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47011, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        File file = new File(com.max.xiaoheihe.utils.d.T());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + "web_cut.jpg");
        this.Y3 = file2;
        if (!file2.exists()) {
            try {
                this.Y3.createNewFile();
            } catch (IOException unused) {
                com.max.hbcommon.utils.d.b("zzzz", "creat file IOException");
            }
        }
        return com.max.xiaoheihe.utils.d.w0(this.f66601b, this.Y3);
    }

    private void G3(List<String> list, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 47016, new Class[]{List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), list, str, new b(str, str2));
    }

    private void H2(ArrayList<Uri> arrayList, ArrayList<Draft> arrayList2) {
        if (!PatchProxy.proxy(new Object[]{arrayList, arrayList2}, this, changeQuickRedirect, false, 47029, new Class[]{ArrayList.class, ArrayList.class}, Void.TYPE).isSupported && isActive()) {
            File file = new File(PictureVideoEditPostFragment.g7(this.f66601b));
            if (!file.exists()) {
                file.mkdirs();
            }
            UCrop uCropOf = !com.max.hbcommon.utils.c.w(arrayList2) ? UCrop.of(arrayList, Uri.fromFile(file), arrayList2) : UCrop.of(arrayList, Uri.fromFile(file));
            CropRectObj cropRectObj = null;
            if (this.f94270c4.objectOf("force_ratio", CropRectObj.class) != null) {
                cropRectObj = (CropRectObj) this.f94270c4.objectOf("force_ratio", CropRectObj.class);
            } else {
                List listListOf = this.f94270c4.listOf("ratios", CropRectObj.class);
                if (listListOf != null) {
                    cropRectObj = (CropRectObj) listListOf.get(0);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            if (cropRectObj == null) {
                return;
            }
            arrayList3.add(new CropRatioInfo(com.max.hbutils.utils.n.q(cropRectObj.getW()), com.max.hbutils.utils.n.q(cropRectObj.getH()), false, null, null, false));
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_RATIO_LIST, arrayList3);
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_ONLY_CROP, true);
            uCropOf.startWithType(this.f66601b, 1);
        }
    }

    private void H3(List<ImageInjectInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 47025, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ImageInjectInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getLocal_url().replaceAll(ImageInjectInfo.local_prefix, ""));
        }
        com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), arrayList, "bbs", new e(list));
    }

    private void I2(Uri uri, Draft draft) {
        if (PatchProxy.proxy(new Object[]{uri, draft}, this, changeQuickRedirect, false, 47027, new Class[]{Uri.class, Draft.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<Uri> arrayList = new ArrayList<>();
        arrayList.add(uri);
        H2(arrayList, null);
    }

    private void J2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47028, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.X3;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.X3 = new LoadingDialog(this.f66601b, getString(R.string.loading), false).r();
        }
        Glide.F(com.max.hbimage.image.l.a()).u().load(str).z1(new f(str));
    }

    public static Intent K2(Context context, String str, String str2, boolean z10, boolean z11) {
        Object[] objArr = {context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 46991, new Class[]{Context.class, String.class, String.class, cls, cls}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", str);
        HashMap map = new HashMap();
        if (z11) {
            StatusBarCfgObj statusBarCfgObj = new StatusBarCfgObj();
            statusBarCfgObj.setStyle(AccelWorldLottieKt.f76443a);
            map.put("status_bar", new Gson().toJson(statusBarCfgObj));
        }
        if (str2 != null) {
            NavBarCfgObj navBarCfgObj = new NavBarCfgObj();
            navBarCfgObj.setTitle(str2);
            map.put("navigation_bar", new Gson().toJson(navBarCfgObj));
        }
        WebProtocolObj webProtocolObj = new WebProtocolObj();
        webProtocolObj.setFull_screen(z10);
        webProtocolObj.setKvPair(map);
        intent.putExtra("web_protocol", webProtocolObj);
        return intent;
    }

    public static void O2(WebProtocolObj webProtocolObj, Context context) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj, context}, null, changeQuickRedirect, true, 47010, new Class[]{WebProtocolObj.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("video"));
        a aVar = new a(context, webProtocolObj, zX);
        if (zX) {
            PermissionManager.f71603a.Q(null, (AppCompatActivity) context, aVar);
        } else {
            PermissionManager.f71603a.R(null, (AppCompatActivity) context, aVar);
        }
    }

    private ArrayList<String> Q2(List<String> list, boolean z10) throws Throwable {
        byte[] bArr;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47017, new Class[]{List.class, Boolean.TYPE}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (z10) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = new FileInputStream(it.next());
                } catch (FileNotFoundException e10) {
                    e10.printStackTrace();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[fileInputStream.available()];
                    while (true) {
                        try {
                            int i10 = fileInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                    bArr = new byte[2048];
                }
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                if (strEncodeToString != null) {
                    arrayList.add(strEncodeToString);
                }
            }
        } else {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                String strS = com.max.mediaselector.utils.c.u().s(it2.next());
                if (strS != null) {
                    arrayList.add(strS);
                }
            }
        }
        return arrayList;
    }

    private void S2(final ArrayList<String> arrayList, final ArrayList<String> arrayList2) {
        int i10;
        if (PatchProxy.proxy(new Object[]{arrayList, arrayList2}, this, changeQuickRedirect, false, 47013, new Class[]{ArrayList.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a0.g().k(f94261m4);
        if (com.max.hbcommon.utils.c.w(arrayList2)) {
            i10 = 0;
        } else {
            this.T3 = Q2(arrayList2, false);
            com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.webview.o
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f94759a.f3(arrayList2);
                }
            }, f94261m4);
            i10 = 1;
        }
        if (!com.max.hbcommon.utils.c.w(arrayList)) {
            this.S3 = Q2(arrayList, true);
            com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.webview.p
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f94762a.g3(arrayList);
                }
            }, f94261m4);
            i10++;
        }
        com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.webview.q
            @Override // com.max.xiaoheihe.utils.a0.a
            public final void a() {
                this.f94765a.B3();
            }
        }, f94261m4);
        com.max.xiaoheihe.utils.a0.g().o(f94261m4, i10);
    }

    private void T2(List<LocalMedia> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 47012, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.X3;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.X3 = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
        }
        if (list != null && list.size() > 0) {
            this.Q3.addAll(list);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (LocalMedia localMedia : this.Q3) {
            if (com.max.mediaselector.lib.config.f.i(localMedia.A())) {
                arrayList2.add(localMedia.G());
            } else {
                arrayList.add(localMedia.G());
            }
        }
        S2(arrayList, arrayList2);
    }

    private void V2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47023, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().oa(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    private void Y2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47000, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.c(R.id.fragment_container, w.R3(str), "");
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    private void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46998, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        int iE1 = -1;
        if (!com.max.hbcommon.utils.c.u(this.S) && (this.S.contains("game/pubg/get_match_detail") || this.S.contains("game/pubg/get_single_match_detail"))) {
            iE1 = getResources().getColor(R.color.text_primary_1_color);
        } else if (!com.max.hbcommon.utils.c.u(this.S) && (this.S.contains("game/pubg/battle_report") || this.S.contains("game/pubg/weapon_proficiency"))) {
            iE1 = Color.parseColor("#131415");
        } else if (!com.max.hbcommon.utils.c.u(this.S) && this.S.contains("game/pubg/daily_report")) {
            iE1 = Color.parseColor("#3B1C05");
        } else if (!com.max.hbcommon.utils.c.u(this.Q)) {
            iE1 = com.max.xiaoheihe.utils.d.e1(this.Q);
        }
        u uVarL = new u(this.S).f(iE1).p(this.f94281x2).u(this.f94283y2).r(this.G2).e(this.f94279p3).q(this.U).s(this.V).h(this.W).o(this.G3).t(new ProxyAddressObj(this.f94269c0, this.f94277p1)).j(false).B(this.O3).n(false).A(this.f94272e4).z(this.f94273f4).g(this.f94274g4).y(null).d(this.f94275h4).l(new IpDirectObj(this.Z3, this.f94266a4));
        if (this.f94268b4) {
            uVarL.v(true);
        }
        WebviewFragment webviewFragmentA = uVarL.a();
        this.P3 = webviewFragmentA;
        webviewFragmentA.O7(this.J3);
        if (this.U3 != null) {
            this.P3.getArguments().putSerializable("steam_privacy_js", this.U3);
        }
        this.P3.Y7(new n());
        p0VarU.z(R.id.fragment_container, this.P3, "");
        p0VarU.P(this.P3);
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f3(ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47038, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        G3(arrayList, "video", f94261m4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g3(ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47037, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        G3(arrayList, "bbs", f94261m4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h3(String str, String str2, final String str3) {
        WebviewFragment webviewFragmentN2;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 47031, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (webviewFragmentN2 = N2()) == null) {
            return;
        }
        com.max.xiaoheihe.accelworld.j.f(str, webviewFragmentN2, str2, new t.a() { // from class: com.max.xiaoheihe.module.webview.k
            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                this.f94748a.k3(str3);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47033, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("webcropimage", "jsresult ==" + str);
    }

    static /* synthetic */ Uri k2(WebActionActivity webActionActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webActionActivity}, null, changeQuickRedirect, true, 47041, new Class[]{WebActionActivity.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : webActionActivity.G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k3(String str) {
        WebView webViewU6;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47032, new Class[]{String.class}, Void.TYPE).isSupported || (webViewU6 = N2().U6()) == null) {
            return;
        }
        webViewU6.evaluateJavascript(str, new ValueCallback() { // from class: com.max.xiaoheihe.module.webview.n
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                WebActionActivity.i3((String) obj);
            }
        });
    }

    static /* synthetic */ void l2(WebActionActivity webActionActivity, List list) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, list}, null, changeQuickRedirect, true, 47042, new Class[]{WebActionActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.T2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l3(JsonArray jsonArray, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonArray, jsonObject}, null, changeQuickRedirect, true, 47036, new Class[]{JsonArray.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        jsonObject.add("data", jsonArray);
    }

    static /* synthetic */ void m2(WebActionActivity webActionActivity, String str) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, str}, null, changeQuickRedirect, true, 47043, new Class[]{WebActionActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.Y2(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n3(String str) {
    }

    static /* synthetic */ void p2(WebActionActivity webActionActivity, Uri uri, Draft draft) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, uri, draft}, null, changeQuickRedirect, true, 47044, new Class[]{WebActionActivity.class, Uri.class, Draft.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.I2(uri, draft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p3(WebView webView, String str) {
        if (PatchProxy.proxy(new Object[]{webView, str}, null, changeQuickRedirect, true, 47035, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || webView == null) {
            return;
        }
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.max.xiaoheihe.module.webview.h
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                WebActionActivity.n3((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q3(WebviewFragment webviewFragment, final JsonArray jsonArray, final WebView webView, final String str) {
        if (!PatchProxy.proxy(new Object[]{webviewFragment, jsonArray, webView, str}, this, changeQuickRedirect, false, 47034, new Class[]{WebviewFragment.class, JsonArray.class, WebView.class, String.class}, Void.TYPE).isSupported && isActive() && webviewFragment.isActive()) {
            com.max.xiaoheihe.accelworld.j.e("clientUploadCallback", webviewFragment, new t.b() { // from class: com.max.xiaoheihe.module.webview.l
                @Override // com.max.xiaoheihe.module.webview.t.b
                public final void a(JsonObject jsonObject) {
                    WebActionActivity.l3(jsonArray, jsonObject);
                }
            }, new t.a() { // from class: com.max.xiaoheihe.module.webview.m
                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    WebActionActivity.p3(webView, str);
                }
            }, null);
        }
    }

    static /* synthetic */ void r2(WebActionActivity webActionActivity, String str) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, str}, null, changeQuickRedirect, true, 47045, new Class[]{WebActionActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.J2(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r3(JsonObject jsonObject) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P3.H6(WebviewFragment.f94359a5, null);
    }

    static /* synthetic */ void v2(WebActionActivity webActionActivity, ArrayList arrayList, ArrayList arrayList2) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, arrayList, arrayList2}, null, changeQuickRedirect, true, 47046, new Class[]{WebActionActivity.class, ArrayList.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.H2(arrayList, arrayList2);
    }

    static /* synthetic */ void x2(WebActionActivity webActionActivity, List list) {
        if (PatchProxy.proxy(new Object[]{webActionActivity, list}, null, changeQuickRedirect, true, 47047, new Class[]{WebActionActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        webActionActivity.y3(list);
    }

    private void y3(List<ImageInjectInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 47026, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        final String str = "'" + com.max.hbutils.utils.k.p(list) + "'";
        final String strValueOf = this.f94270c4.valueOf("callback");
        final String str2 = String.format("javascript:%s(%s)", strValueOf, str);
        runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.module.webview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f94768b.h3(strValueOf, str, str2);
            }
        });
    }

    public void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Bitmap bitmap : this.R3) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        System.gc();
    }

    public void B0(boolean z10) {
        TextView appbarTitleTextView;
        ImageView appbarNavButtonView;
        ImageView appbarActionButtonView;
        TextView appbarActionTextView;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46997, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66616q.getVisibility() == 0) {
            appbarTitleTextView = this.f66616q.getAppbarTitleTextView();
            appbarNavButtonView = this.f66616q.getAppbarNavButtonView();
            appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
            appbarActionTextView = this.f66616q.getAppbarActionTextView();
        } else {
            appbarTitleTextView = this.N;
            appbarNavButtonView = this.M;
            appbarActionButtonView = this.O;
            appbarActionTextView = this.P;
        }
        int color = this.f66601b.getResources().getColor(z10 ? R.color.text_primary_1_color : R.color.white);
        if (appbarTitleTextView != null) {
            appbarTitleTextView.setTextColor(color);
        }
        if (appbarNavButtonView != null) {
            appbarNavButtonView.setColorFilter(color);
        }
        if (appbarActionButtonView != null) {
            appbarActionButtonView.setColorFilter(color);
        }
        if (appbarActionTextView != null) {
            appbarActionTextView.setTextColor(color);
        }
    }

    public void D3(String str) {
        this.K3 = str;
    }

    public void I3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47001, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K3(null);
    }

    public void K3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47002, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        a3();
        if (!com.max.hbcommon.utils.c.u(str)) {
            this.S = str;
        }
        e3();
    }

    public void L2(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 46994, new Class[]{Intent.class}, Void.TYPE).isSupported || intent == null) {
            return;
        }
        this.Q = intent.getStringExtra("title_bgColor");
        this.R = intent.getStringExtra("title_textColor");
        this.S = intent.getStringExtra("pageurl");
        this.T = intent.getStringExtra("download_url");
        this.J3 = intent.getStringExtra(WebviewFragment.f94379z4);
        this.U = intent.getStringExtra("message");
        this.V = (MallOrderNotifyObj) intent.getSerializableExtra(WebviewFragment.f94376w4);
        this.W = intent.getStringExtra("welcome");
        this.X = intent.getStringExtra("title");
        this.f94280x1 = intent.getBooleanExtra("isfullScreen", false);
        this.f94283y2 = "true".equalsIgnoreCase(intent.getStringExtra("isPullRefresh"));
        this.Y = intent.getStringExtra("shareTitle");
        this.Z = intent.getStringExtra("shareUrl");
        this.f94265a0 = intent.getStringExtra("shareDesc");
        this.f94267b0 = intent.getStringExtra("shareImgUrl");
        this.f94282y1 = intent.getBooleanExtra("showShare", false);
        this.f94278p2 = intent.getBooleanExtra("active_js", false);
        this.f94269c0 = intent.getStringExtra("host");
        this.f94277p1 = intent.getStringExtra(HeyboxMicFragment.f93763y);
        this.O3 = (WebProtocolObj) intent.getSerializableExtra("web_protocol");
        this.U3 = (SteamPrivacyJsObj) intent.getSerializableExtra("steam_privacy_js");
        this.V3 = intent.getStringExtra("game_name");
        this.Z3 = (HashMap) intent.getSerializableExtra("hosts");
        this.f94266a4 = (ArrayList) intent.getSerializableExtra(WebviewFragment.K4);
        this.f94268b4 = intent.getBooleanExtra(WebviewFragment.N4, false);
        WebProtocolObj webProtocolObj = this.O3;
        if (webProtocolObj != null) {
            this.f94272e4 = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf(WebviewFragment.Q4));
            this.f94273f4 = com.max.hbcommon.utils.c.x(this.O3.valueOf(WebviewFragment.P4));
            this.f94274g4 = (BgConfigObj) this.O3.objectOf(WebviewFragment.R4, BgConfigObj.class);
        }
        if (getIntent() != null) {
            this.f94275h4 = intent.getBooleanExtra(WebviewFragment.T4, false);
        }
    }

    public WebResourceResponse L3(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    public void M3(WebView webView, String str) {
    }

    public WebviewFragment N2() {
        return this.P3;
    }

    public void N3(WebView webView, String str, int i10, int i11) {
    }

    public void O3(WebView webView, String str, int i10, int i11) {
    }

    @Override // com.max.xiaoheihe.app.c
    public void P(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 47019, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(1);
    }

    public void P1(@androidx.annotation.p0 String str) {
        WebviewFragment webviewFragmentN2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47030, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragmentN2 = N2()) == null) {
            return;
        }
        String url = webviewFragmentN2.U6().getUrl();
        if (com.max.hbcommon.utils.c.u(url)) {
            return;
        }
        AccelWorldScreenShotKt.d(str, new SourceInfoObj(SourceType.web.getKey(), url));
    }

    public String P2() {
        return this.K3;
    }

    public void P3(WebView webView, int i10) {
    }

    public String W2() {
        return this.V3;
    }

    public void X2(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47024, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f94270c4 = webProtocolObj;
        PermissionManager.f71603a.S((AppCompatActivity) this.f66601b, new d(webProtocolObj));
    }

    @Override // com.max.xiaoheihe.app.c
    public void Y(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 47021, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a3() {
        int color;
        TitleBar titleBar;
        TextView appbarTitleTextView;
        ImageView appbarNavButtonView;
        ImageView appbarActionButtonView;
        TextView appbarActionTextView;
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f94280x1) {
            this.L.setVisibility(0);
            com.max.hbutils.utils.t.X(this.f66601b, 0, this.L);
            this.O.setVisibility(0);
            Drawable drawable = this.f66601b.getResources().getDrawable(R.drawable.common_share);
            drawable.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.O.setImageDrawable(drawable);
            this.O.setOnClickListener(new h());
        } else {
            WebProtocolObj webProtocolObj = this.O3;
            if (webProtocolObj != null) {
                boolean zIsFull_screen = webProtocolObj.isFull_screen();
                if (zIsFull_screen) {
                    this.L.setVisibility(0);
                    com.max.hbutils.utils.t.X(this.f66601b, 0, this.L);
                } else {
                    this.L.setVisibility(8);
                }
                StatusBarCfgObj status_bar = this.O3.getStatus_bar();
                if (status_bar == null || !AccelWorldLottieKt.f76443a.equalsIgnoreCase(status_bar.getStyle())) {
                    color = this.f66601b.getResources().getColor(R.color.text_primary_1_color);
                    com.max.hbutils.utils.t.M(this.f66601b, true);
                } else {
                    com.max.hbutils.utils.t.M(this.f66601b, false);
                    color = this.f66601b.getResources().getColor(R.color.white);
                }
                NavBarCfgObj navBarCfgObj = (NavBarCfgObj) this.O3.objectOf("navigation_bar", NavBarCfgObj.class);
                if (navBarCfgObj != null) {
                    if (zIsFull_screen) {
                        View view2 = this.L;
                        appbarTitleTextView = this.N;
                        appbarNavButtonView = this.M;
                        appbarActionButtonView = this.O;
                        appbarActionTextView = this.P;
                        view2.setBackgroundResource(R.color.transparent);
                        view = view2;
                    } else {
                        titleBar = this.f66616q;
                        appbarTitleTextView = titleBar.getAppbarTitleTextView();
                        appbarNavButtonView = this.f66616q.getAppbarNavButtonView();
                        appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
                        appbarActionTextView = this.f66616q.getAppbarActionTextView();
                        this.f66616q.a0();
                        titleBar.setBackgroundColor(getResources().getColor(R.color.appbar_bg_color));
                        if (this.f66616q.getVisibility() == 0) {
                            view = titleBar;
                            this.f66617r.setVisibility(0);
                            view = titleBar;
                        }
                    }
                    view = titleBar;
                    view.setVisibility(0);
                    appbarTitleTextView.setVisibility(0);
                    if (navBarCfgObj.getTitle() != null) {
                        appbarTitleTextView.setText(navBarCfgObj.getTitle());
                        this.W3 = true;
                    }
                    appbarTitleTextView.setTextColor(color);
                    appbarNavButtonView.setColorFilter(color);
                    appbarActionButtonView.setColorFilter(color);
                    appbarActionTextView.setTextColor(color);
                    IconCfgObj right_icon = navBarCfgObj.getRight_icon();
                    if (right_icon != null && right_icon.isEnabled() && right_icon.getProtocol() != null) {
                        if (com.max.hbcommon.utils.c.u(right_icon.getTitle())) {
                            appbarActionButtonView.setImageResource(R.drawable.common_share);
                            appbarActionButtonView.setOnClickListener(new j(right_icon));
                            appbarActionButtonView.setVisibility(0);
                        } else {
                            appbarActionTextView.setText(right_icon.getTitle());
                            appbarActionTextView.setOnClickListener(new i(right_icon));
                            appbarActionTextView.setVisibility(0);
                        }
                    }
                } else if (!zIsFull_screen) {
                    this.f66616q.a0();
                    this.f66616q.setVisibility(0);
                    this.f66616q.getAppbarTitleTextView().setVisibility(0);
                }
                WebCfgObj webview = this.O3.getWebview();
                if (webview != null) {
                    this.S = webview.getUrl();
                    this.Q = webview.getBg();
                    this.f94283y2 = webview.isRefresh();
                    this.G2 = webview.isDisable_navi();
                    this.f94279p3 = webview.isAllow_display_keyboard();
                }
                if (this.O3.isNetwork()) {
                    this.G3 = this.O3.valueOf("network_js");
                }
                if (com.max.hbcommon.utils.c.x(this.O3.valueOf("show_loading"))) {
                    this.f94281x2 = WebviewFragment.V4;
                }
            } else {
                com.max.hbutils.utils.t.M(this.f66601b, true);
                this.f66616q.setVisibility(0);
                this.f66616q.a0();
                this.f66617r.setVisibility(0);
                String str = this.X;
                if (str != null) {
                    this.f66616q.setTitle(str);
                }
                if (this.f94282y1) {
                    this.f66616q.setActionIcon(R.drawable.common_share);
                    this.f66616q.setActionIconOnClickListener(new k());
                }
                if ("yes".equals(this.W)) {
                    this.f66616q.setNavigationOnClickListener(new l());
                }
            }
        }
        if (this.f66616q.getVisibility() == 0) {
            this.f66616q.setInStack();
            this.f66616q.a0();
            this.f66616q.getAppbarNavButtonView().setVisibility(0);
        }
        if (this.L.getVisibility() == 0) {
            this.M.setVisibility(0);
            this.M.setImageResource(R.drawable.common_arrow_single_10x18);
            this.M.setOnClickListener(new m());
        }
        if (this.f94275h4) {
            this.f66616q.setVisibility(8);
            this.L.setVisibility(8);
        }
    }

    @Override // com.max.xiaoheihe.app.c
    public void b0(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 47020, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(3);
    }

    public void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("yes".equals(this.W)) {
            startActivity(com.max.xiaoheihe.utils.i0.o().isLoginFlag() ? new Intent(this, (Class<?>) MainActivity.class) : new Intent(this, (Class<?>) RegisterOrLoginActivityV2.class));
        }
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47004, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f94278p2) {
            Intent intent = new Intent();
            intent.putExtra(f94259k4, this.K3);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46993, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("WebActionActivity, installViews");
        setContentView(R.layout.activity_web_action);
        this.L = findViewById(R.id.web_view_title_bar);
        this.M = (ImageView) findViewById(R.id.iv_web_view_nav_button);
        this.N = (TextView) findViewById(R.id.tv_web_view_title);
        this.O = (ImageView) findViewById(R.id.iv_web_view_action_button);
        this.P = (TextView) findViewById(R.id.tv_web_view_action);
        getOnBackPressedDispatcher().c(this, new g(true));
        L2(getIntent());
        if (t3()) {
            return;
        }
        I3();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47007, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
        if (i10 == 69) {
            if (i11 != -1 || intent == null) {
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
            List list = (List) intent.getSerializableExtra(UCrop.EXTRA_MULTI_DRAFT);
            if (com.max.hbcommon.utils.c.w(parcelableArrayListExtra)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < parcelableArrayListExtra.size(); i12++) {
                ImageInjectInfo imageInjectInfo = new ImageInjectInfo();
                String strGenerateId = ImageInjectInfo.generateId(((Uri) parcelableArrayListExtra.get(i12)).getPath());
                imageInjectInfo.setId(strGenerateId);
                imageInjectInfo.setLocal_url(((Uri) parcelableArrayListExtra.get(i12)).getPath());
                arrayList.add(imageInjectInfo);
                this.f94271d4.put(strGenerateId, (Draft) list.get(0));
            }
            y3(arrayList);
            H3(arrayList);
            return;
        }
        if (i10 == 111) {
            if (i11 == -1) {
                this.L3 = intent.getStringExtra(f94259k4);
                return;
            }
            return;
        }
        if (i10 != 1000) {
            if (i10 == 1001 && i11 == -1) {
                com.max.xiaoheihe.module.mall.o.l(this.f66601b);
                return;
            }
            return;
        }
        if (i11 == -1) {
            revokeUriPermission(com.max.xiaoheihe.utils.d.w0(this.f66601b, this.Y3), 2);
            File file = this.Y3;
            if (file == null || !file.exists()) {
                return;
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(this.Y3.getAbsolutePath());
            S2(arrayList2, null);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47008, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.team.b bVar = com.max.xiaoheihe.module.team.b.f92383a;
        if (bVar.b(this.S)) {
            bVar.a(this.f66601b);
        }
        super.onDestroy();
        UMShareAPI.get(this).release();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46992, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResumeFragments();
        if (com.max.hbcommon.utils.c.u(this.L3)) {
            return;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
        if (fragmentR0 instanceof WebviewFragment) {
            ((WebviewFragment) fragmentR0).H6(this.L3, null);
        }
    }

    public boolean t3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46999, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        WebProtocolObj webProtocolObj = this.O3;
        String url = (webProtocolObj == null || webProtocolObj.getWebview() == null || com.max.hbcommon.utils.c.u(this.O3.getWebview().getUrl())) ? this.S : this.O3.getWebview().getUrl();
        if (com.max.hbcommon.utils.c.u(url)) {
            return false;
        }
        boolean z10 = !t0.f94779a.g(com.max.xiaoheihe.utils.l0.s(url));
        if (z10) {
            V2(url);
        }
        return z10;
    }

    @Override // com.max.xiaoheihe.app.c
    public void u(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 47022, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(0);
    }

    public void u3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47018, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f94260l4, str);
        setResult(-1, intent);
        F3();
    }

    public void w3(Bitmap bitmap) {
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47003, new Class[]{Bitmap.class}, Void.TYPE).isSupported || bitmap == null) {
            return;
        }
        this.R3.add(bitmap);
        if (com.max.hbcommon.utils.c.u(this.S) || !(this.S.contains("game/pubg/get_match_detail") || this.S.contains("game/pubg/get_single_match_detail"))) {
            viewFindViewById = this.f66602c.inflate(R.layout.layout_share_web, (ViewGroup) Z0(), false).findViewById(R.id.vg_content);
            QRCodeShareView qRCodeShareView = (QRCodeShareView) viewFindViewById.findViewById(R.id.v_qr_code);
            qRCodeShareView.setBackgroundResource(R.color.white);
            if (!com.max.hbcommon.utils.c.u(this.S) && this.S.contains("game/pubg/weaspon/mastery/web")) {
                qRCodeShareView.setLogo(R.drawable.ic_heybox_pubg_logo);
                qRCodeShareView.setColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
            }
            if (!com.max.hbcommon.utils.c.u(this.T)) {
                qRCodeShareView.setUrl(this.T);
            }
        } else {
            viewFindViewById = this.f66602c.inflate(R.layout.layout_share_pubg, (ViewGroup) Z0(), false);
            QRCodeShareView qRCodeShareView2 = (QRCodeShareView) viewFindViewById.findViewById(R.id.v_qr_code);
            qRCodeShareView2.setLogo(R.drawable.ic_heybox_pubg_logo);
            qRCodeShareView2.setColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
        }
        ((ImageView) viewFindViewById.findViewById(R.id.iv_share_image)).setImageBitmap(bitmap);
        viewFindViewById.measure(0, 0);
        Bitmap bitmapL = com.max.hbimage.b.l(viewFindViewById, viewFindViewById.getMeasuredWidth(), viewFindViewById.getMeasuredHeight());
        this.R3.add(bitmapL);
        if (bitmapL != null) {
            com.max.hbshare.d.E(this.f66601b, new HBShareData(true, true, null, this.Y, this.Z, null, new UMImage(this.f66601b, bitmapL), this.f94276i4));
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.fail));
        }
    }

    @Override // com.max.xiaoheihe.module.webview.c
    public void z0(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47015, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || N2() == null) {
            return;
        }
        N2().L7(i10);
    }
}
