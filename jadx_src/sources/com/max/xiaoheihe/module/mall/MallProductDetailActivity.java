package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.p0;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hblogistics.AddAddressActivity;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131200l2)
public class MallProductDetailActivity extends BaseActivity implements i.d {
    private static final String U = "sku_id";
    private static final String V = "h_src";
    public static final String W = "show_purchase_dialog";
    private static final String X = "mall_purchase";
    private static final String Y = "mall_select";
    private static final int Z = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private WebviewFragment M;
    private String N;
    private String O;
    private MallSkuObj P;
    private String Q;
    private String R;

    @BindView(R.id.vg_purchase)
    View mPurchaseView;
    private String L = "clickBuyButton";
    private boolean S = false;
    private UMShareListener T = new e();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40339, new Class[]{View.class}, Void.TYPE).isSupported || MallProductDetailActivity.this.P == null) {
                return;
            }
            UMImage uMImage = !com.max.hbcommon.utils.c.u(MallProductDetailActivity.this.P.getHead_img()) ? new UMImage(((BaseActivity) MallProductDetailActivity.this).f66601b, MallProductDetailActivity.this.P.getHead_img()) : new UMImage(((BaseActivity) MallProductDetailActivity.this).f66601b, R.drawable.share_thumbnail);
            String str = "";
            if (MallProductDetailActivity.this.O == null || MallProductDetailActivity.this.O.equals("")) {
                com.max.hbcommon.utils.d.b("cqtest", "null hsrc");
            } else {
                str = "&h_src=" + MallProductDetailActivity.this.O;
            }
            com.max.hbshare.d.E(((BaseActivity) MallProductDetailActivity.this).f66601b, new HBShareData(false, true, String.format(MallProductDetailActivity.this.getString(R.string.mall_share_title), MallProductDetailActivity.this.P.getName()), MallProductDetailActivity.this.getString(R.string.mall_share_desc), String.format(lb.a.X2, MallProductDetailActivity.this.N) + str, null, uMImage, MallProductDetailActivity.this.T));
        }
    }

    public class b extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 40341, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (WebProtocolObj.PROTOCOL_TYPE_OPEN_ADDRESS_LIST.equals(webProtocolObj.getProtocol_type())) {
                com.max.xiaoheihe.base.router.b.C(((BaseActivity) MallProductDetailActivity.this).f66601b, true).C(1).A();
            } else if (WebProtocolObj.PROTOCOL_TYPE_OPEN_PURCHASE_VIEW.equals(webProtocolObj.getProtocol_type())) {
                String strValueOf = !com.max.hbcommon.utils.c.u(webProtocolObj.valueOf("sku_id")) ? webProtocolObj.valueOf("sku_id") : MallProductDetailActivity.this.N;
                MallProductDetailActivity mallProductDetailActivity = MallProductDetailActivity.this;
                MallCartUtils.G(mallProductDetailActivity, mallProductDetailActivity.getSupportFragmentManager(), MallProductDetailActivity.this.O, i.O, strValueOf, MallProductDetailActivity.this.Q);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void e(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 40342, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.e(webView, str);
            com.max.heybox.hblog.g.W("MallProductDetailActivity onJSPrepared " + str);
            MallProductDetailActivity.this.S = true;
            if (com.max.hbcommon.utils.c.x(MallProductDetailActivity.this.R)) {
                MallProductDetailActivity.this.mPurchaseView.performClick();
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void h(WebView webView, int i10, int i11, int i12, int i13) {
            Object[] objArr = {webView, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40340, new Class[]{WebView.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            Math.min((i11 * 1.0f) / ViewUtils.f(((BaseActivity) MallProductDetailActivity.this).f66601b, 200.0f), 1.0f);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40343, new Class[]{View.class}, Void.TYPE).isSupported && MallProductDetailActivity.this.S && i0.e(((BaseActivity) MallProductDetailActivity.this).f66601b)) {
                MallProductDetailActivity.Y1(MallProductDetailActivity.this);
                if (MallProductDetailActivity.this.M.isActive()) {
                    MallProductDetailActivity.this.M.t0(MallProductDetailActivity.this.L, null, null);
                }
            }
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<MallSkuObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(Result<MallSkuObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40344, new Class[]{Result.class}, Void.TYPE).isSupported && MallProductDetailActivity.this.isActive()) {
                super.onNext(result);
                MallProductDetailActivity.this.P = result.getResult();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40345, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSkuObj>) obj);
        }
    }

    public class e implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 40347, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallProductDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 40346, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallProductDetailActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    static /* synthetic */ void Y1(MallProductDetailActivity mallProductDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallProductDetailActivity}, null, changeQuickRedirect, true, 40338, new Class[]{MallProductDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallProductDetailActivity.v2();
    }

    private void l2(String str, ValueCallback<String> valueCallback) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 40329, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, valueCallback);
    }

    public static Intent m2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 40323, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : n2(context, str, null);
    }

    public static Intent n2(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 40324, new Class[]{Context.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : o2(context, str, str2, null);
    }

    public static Intent o2(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 40325, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MallProductDetailActivity.class);
        intent.putExtra("sku_id", str);
        intent.putExtra("h_src", str2);
        intent.putExtra(W, str3);
        return intent;
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t2(this.N).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void q2(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 40331, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            this.N = intent.getStringExtra("sku_id");
            this.O = intent.getStringExtra("h_src");
            this.R = intent.getStringExtra(W);
        } else {
            this.N = data.getQueryParameter("sku_id");
            this.O = data.getQueryParameter("h_src");
            this.R = data.getQueryParameter(W);
        }
        p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r2(JsonObject jsonObject, JsonObject jsonObject2) {
        if (PatchProxy.proxy(new Object[]{jsonObject, jsonObject2}, null, changeQuickRedirect, true, 40337, new Class[]{JsonObject.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        jsonObject2.add("data", jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40336, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        l2(String.format(Locale.US, "addressChangedCallback(\"%s\",\"%s\")", str, this.Q), null);
    }

    private void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(this.N)) {
            jsonObject.addProperty("sku_id", this.N);
        }
        if (!com.max.hbcommon.utils.c.u(this.O)) {
            jsonObject.addProperty("h_src", this.O);
        }
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131207m2, jsonObject);
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40335, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(this.N)) {
            jsonObject.addProperty("sku_id", this.N);
        }
        if (!com.max.hbcommon.utils.c.u(this.O)) {
            jsonObject.addProperty("h_src", this.O);
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_mall_product_detail);
        ButterKnife.a(this);
        q2(getIntent());
        this.f66616q.setTitle("商品");
        this.f66617r.setVisibility(0);
        this.f66616q.setActionIcon(R.drawable.common_share);
        this.f66616q.setActionIconOnClickListener(new a());
        WebviewFragment webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        this.M = webviewFragment;
        if (webviewFragment == null) {
            String str = this.O;
            String str2 = "";
            if (str != null && !str.equals("")) {
                str2 = "&h_src=" + this.O;
            }
            this.S = false;
            WebviewFragment webviewFragmentU7 = WebviewFragment.u7(String.format(lb.a.X2, this.N) + str2);
            this.M = webviewFragmentU7;
            webviewFragmentU7.Y7(new b());
            getSupportFragmentManager().u().b(R.id.fragment_container, this.M).m();
        }
        this.mPurchaseView.setOnClickListener(new c());
    }

    @Override // com.max.xiaoheihe.module.mall.i.d
    public void o(MallRegisterOrderObj mallRegisterOrderObj) {
        if (PatchProxy.proxy(new Object[]{mallRegisterOrderObj}, this, changeQuickRedirect, false, 40328, new Class[]{MallRegisterOrderObj.class}, Void.TYPE).isSupported || mallRegisterOrderObj == null || mallRegisterOrderObj.getParams() == null) {
            return;
        }
        Iterator<MallOrderParamObj> it = mallRegisterOrderObj.getParams().iterator();
        String str = null;
        while (it.hasNext()) {
            str = "" + it.next().getSku_id();
        }
        if (com.max.hbcommon.utils.c.u(str) || str.equals(this.N)) {
            return;
        }
        this.N = str;
        l2(String.format(Locale.US, "itemChangedCallback(\"%s\")", str), null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        AddressInfoObj addressInfoObj;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40333, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
        if (i10 != 1 || i11 != -1 || intent == null || (addressInfoObj = (AddressInfoObj) intent.getSerializableExtra(AddAddressActivity.Q)) == null) {
            return;
        }
        this.Q = addressInfoObj.getId();
        final String str = String.format("%s%s%s%s", addressInfoObj.getProvince(), addressInfoObj.getCity(), addressInfoObj.getDistrict(), addressInfoObj.getDetail());
        WebviewFragment webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        if (webviewFragment != null) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("address", str);
            jsonObject.addProperty("id", this.Q);
            com.max.xiaoheihe.accelworld.j.e("addressChangedCallback", webviewFragment, new t.b() { // from class: com.max.xiaoheihe.module.mall.f
                @Override // com.max.xiaoheihe.module.webview.t.b
                public final void a(JsonObject jsonObject2) {
                    MallProductDetailActivity.r2(jsonObject, jsonObject2);
                }
            }, new t.a() { // from class: com.max.xiaoheihe.module.mall.g
                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    this.f90728a.u2(str);
                }
            }, null);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UMShareAPI.get(this).release();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 40330, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        q2(intent);
    }
}
