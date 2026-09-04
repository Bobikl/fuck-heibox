package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebCallbackObj;
import com.max.xiaoheihe.bean.bbs.LinkBatteryInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkBatteryObj;
import com.max.xiaoheihe.bean.bbs.WebBatteryObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ChargeDialogFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f81172u = "link_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f81173v = "h_src";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f81174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f81175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f81176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f81177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f81178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f81179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f81180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private String f81181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LinkBatteryInfoObj f81182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference<WebView> f81183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WeakReference<Context> f81184t;

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26122, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class b extends com.max.hbcommon.network.d<Result<LinkBatteryInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26123, new Class[]{Throwable.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onError(th2);
                g.this.f81179o.setVisibility(8);
            }
        }

        public void onNext(Result<LinkBatteryInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26124, new Class[]{Result.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onNext(result);
                g.this.f81179o.setVisibility(8);
                g.this.f81182r = result.getResult();
                g.X3(g.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26125, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<LinkBatteryInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class c extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81187b;

        c(String str) {
            this.f81187b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26126, new Class[]{Throwable.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onError(th2);
                g.this.f81179o.setVisibility(8);
                g.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26127, new Class[]{Result.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onNext(result);
                WebBatteryObj webBatteryObj = new WebBatteryObj();
                webBatteryObj.setBattery(com.max.hbutils.utils.n.q(this.f81187b));
                WebCallbackObj webCallbackObj = new WebCallbackObj();
                webCallbackObj.setId(MallOrderDetailObj.ORDER_TYPE_CHARGE);
                webCallbackObj.setContent(webBatteryObj);
                if (g.this.f81184t != null && (g.this.f81184t.get() instanceof BasePostPageActivity)) {
                    ((BasePostPageActivity) g.this.f81184t.get()).l5(com.max.hbutils.utils.n.q(this.f81187b));
                }
                g.Z3(g.this, "httpCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");", null);
                g.this.f81179o.setVisibility(8);
                g.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26128, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26129, new Class[]{View.class}, Void.TYPE).isSupported || (context = g.this.getContext()) == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130945c3);
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.heybox_battery_faq));
            context.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f81190b;

        e(KeyDescObj keyDescObj) {
            this.f81190b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26130, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.a4(g.this, this.f81190b.getKey());
        }
    }

    /* JADX INFO: compiled from: ChargeDialogFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f81192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f81193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f81194d;

        f(List list, KeyDescObj keyDescObj, LinearLayout linearLayout) {
            this.f81192b = list;
            this.f81193c = keyDescObj;
            this.f81194d = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26131, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.U1(this.f81192b, this.f81193c);
            g.b4(g.this, this.f81194d, this.f81192b);
            g.c4(g.this, this.f81192b);
        }
    }

    static /* synthetic */ void X3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 26117, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.h4();
    }

    static /* synthetic */ void Z3(g gVar, String str, ValueCallback valueCallback) {
        if (PatchProxy.proxy(new Object[]{gVar, str, valueCallback}, null, changeQuickRedirect, true, 26118, new Class[]{g.class, String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.e4(str, valueCallback);
    }

    static /* synthetic */ void a4(g gVar, String str) {
        if (PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, 26119, new Class[]{g.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.d4(str);
    }

    static /* synthetic */ void b4(g gVar, LinearLayout linearLayout, List list) {
        if (PatchProxy.proxy(new Object[]{gVar, linearLayout, list}, null, changeQuickRedirect, true, 26120, new Class[]{g.class, LinearLayout.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.i4(linearLayout, list);
    }

    static /* synthetic */ void c4(g gVar, List list) {
        if (PatchProxy.proxy(new Object[]{gVar, list}, null, changeQuickRedirect, true, 26121, new Class[]{g.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.j4(list);
    }

    private void d4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26109, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81179o.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F7(this.f81180p, str, this.f81181q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    private void e4(String str, ValueCallback<String> valueCallback) {
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 26110, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        WeakReference<WebView> weakReference = this.f81183s;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(str, valueCallback);
    }

    private void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26108, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81179o.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N4(this.f81180p).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public static g g4(String str, @Nullable String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 26105, new Class[]{String.class, String.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("link_id", str);
        bundle.putString("h_src", str2);
        gVar.setArguments(bundle);
        return gVar;
    }

    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26111, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkBatteryInfoObj linkBatteryInfoObj = this.f81182r;
        KeyDescObj keyDescObj = null;
        LinkBatteryObj battery = linkBatteryInfoObj != null ? linkBatteryInfoObj.getBattery() : null;
        if (battery == null) {
            return;
        }
        if (!com.max.hbcommon.utils.c.x(battery.getEnabled())) {
            dismiss();
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("该文章无法充电");
            return;
        }
        bb.d.d(this.f81174j, 4);
        this.f81174j.setText(battery.getBalance());
        int size = battery.getCharge_limits() != null ? battery.getCharge_limits().size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                KeyDescObj keyDescObj2 = new KeyDescObj();
                int iIntValue = battery.getCharge_limits().get(i10).intValue();
                keyDescObj2.setKey("" + iIntValue);
                boolean z10 = com.max.hbutils.utils.n.o(battery.getBalance()) >= ((double) iIntValue);
                keyDescObj2.setEnable(z10 ? "1" : "0");
                if (z10 && keyDescObj == null) {
                    keyDescObj = keyDescObj2;
                }
                arrayList.add(keyDescObj2);
            }
            com.max.xiaoheihe.utils.d.U1(arrayList, keyDescObj);
            k4(this.f81175k, arrayList);
            j4(arrayList);
        }
        bb.d.d(this.f81176l, 4);
        this.f81176l.setText(battery.getCount());
        this.f81177m.setOnClickListener(new d());
    }

    private void i4(LinearLayout linearLayout, List<KeyDescObj> list) {
        int childCount;
        if (!PatchProxy.proxy(new Object[]{linearLayout, list}, this, changeQuickRedirect, false, 26114, new Class[]{LinearLayout.class, List.class}, Void.TYPE).isSupported && (childCount = linearLayout.getChildCount()) == list.size()) {
            for (int i10 = 0; i10 < childCount; i10++) {
                KeyDescObj keyDescObj = list.get(i10);
                ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(i10);
                boolean zEquals = "1".equals(keyDescObj.getEnable());
                int i11 = R.drawable.divider_bg_4dp;
                if (zEquals) {
                    viewGroup.setOnClickListener(new f(list, keyDescObj, linearLayout));
                    if (keyDescObj.isChecked()) {
                        i11 = R.drawable.divider_bg_primary_border_4dp;
                    }
                    viewGroup.setBackgroundResource(i11);
                    int childCount2 = viewGroup.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        viewGroup.getChildAt(i12).setAlpha(1.0f);
                    }
                } else {
                    viewGroup.setClickable(false);
                    viewGroup.setBackgroundResource(R.drawable.divider_bg_4dp);
                    int childCount3 = viewGroup.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        viewGroup.getChildAt(i13).setAlpha(0.4f);
                    }
                }
            }
        }
    }

    private void j4(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26112, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(list);
        boolean z10 = keyDescObjN != null;
        this.f81178n.setEnabled(z10);
        if (z10) {
            this.f81178n.setOnClickListener(new e(keyDescObjN));
        } else {
            this.f81178n.setClickable(false);
        }
    }

    private void k4(LinearLayout linearLayout, List<KeyDescObj> list) {
        Context context;
        if (PatchProxy.proxy(new Object[]{linearLayout, list}, this, changeQuickRedirect, false, 26113, new Class[]{LinearLayout.class, List.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return;
        }
        int iL = ((ViewUtils.L(context) - ViewUtils.f(context, 60.0f)) / 3) - 1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i10 = 0;
        while (i10 < size) {
            int iQ = com.max.hbutils.utils.n.q(list.get(i10).getKey());
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_battery_charge, (ViewGroup) linearLayout, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams.height = iL;
            marginLayoutParams.width = iL;
            marginLayoutParams.leftMargin = i10 == 0 ? 0 : ViewUtils.f(context, 10.0f);
            viewInflate.setLayoutParams(marginLayoutParams);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heybox_battery_cnt);
            if (iQ == 1) {
                imageView.setImageResource(R.drawable.ic_battery_1);
            } else if (iQ == 2) {
                imageView.setImageResource(R.drawable.ic_battery_2);
            } else if (iQ == 5) {
                imageView.setImageResource(R.drawable.ic_battery_5);
            }
            textView.setText(String.format(Locale.US, "x%d", Integer.valueOf(iQ)));
            linearLayout.addView(viewInflate);
            i10++;
        }
        i4(linearLayout, list);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void l4(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26116, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81184t = new WeakReference<>(context);
    }

    public void m4(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, changeQuickRedirect, false, 26115, new Class[]{WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81183s = new WeakReference<>(webView);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26106, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f81180p = getArguments().getString("link_id");
            this.f81181q = getArguments().getString("h_src");
        }
        return layoutInflater.inflate(R.layout.fragment_charge_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26107, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_close);
        this.f81174j = (TextView) view.findViewById(R.id.tv_battery_remaining);
        this.f81175k = (LinearLayout) view.findViewById(R.id.ll_choose_options);
        this.f81176l = (TextView) view.findViewById(R.id.tv_battery_got);
        this.f81177m = (TextView) view.findViewById(R.id.tv_heybox_battery_faq);
        this.f81178n = (TextView) view.findViewById(R.id.tv_confirm);
        this.f81179o = view.findViewById(R.id.vg_progress);
        imageView.setOnClickListener(new a());
        f4();
    }
}
