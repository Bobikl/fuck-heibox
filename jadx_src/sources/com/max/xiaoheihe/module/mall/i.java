package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.module.game.v0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: MallPurchaseDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends com.max.hbcommon.base.swipeback.a implements n.w {
    public static final String E = "h_src";
    public static final String F = "app_id";
    public static final String G = "platf";
    public static final String H = "cart_id";
    public static final String I = "buy_type";
    public static final String J = "package_id";
    public static final String K = "sku_id";
    public static final String L = "page_type";
    public static final String M = "address_id";
    public static final String N = "mode";
    public static String O = "select";
    public static String P = "purchase";
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView A;
    private TextView B;
    private TextView C;
    private d D;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f90757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f90758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f90759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f90760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f90761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f90762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f90763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f90764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f90765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f90766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f90767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ViewGroup f90768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ViewGroup f90769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ViewGroup f90770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ViewGroup f90771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ImageView f90772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f90773z;

    /* JADX INFO: compiled from: MallPurchaseDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40638, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40639, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i.this.f90767t = "0";
            i.W3(i.this);
            i iVar = i.this;
            i.Y3(iVar, iVar.f90766s);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40640, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i.this.f90767t = "1";
            i.Z3(i.this);
            i iVar = i.this;
            i.Y3(iVar, iVar.f90766s);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDialogFragment.java */
    public interface d {
        void o(MallRegisterOrderObj mallRegisterOrderObj);
    }

    static /* synthetic */ void W3(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 40635, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.h4();
    }

    static /* synthetic */ void Y3(i iVar, String str) {
        if (PatchProxy.proxy(new Object[]{iVar, str}, null, changeQuickRedirect, true, 40636, new Class[]{i.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.f4(str);
    }

    static /* synthetic */ void Z3(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 40637, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.k4();
    }

    private Fragment a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40634, new Class[0], Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : getChildFragmentManager().r0(R.id.fl_fragment_container);
    }

    public static com.max.hbcommon.base.c b4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10}, null, changeQuickRedirect, true, 40619, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, com.max.hbcommon.base.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.c) patchProxyResultProxy.result;
        }
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putString("app_id", str2);
        bundle.putString(G, str3);
        bundle.putString(H, str4);
        bundle.putString(I, str5);
        bundle.putString("package_id", str6);
        bundle.putString("sku_id", str7);
        bundle.putString("mode", str8);
        bundle.putString("page_type", str10);
        bundle.putString(M, str9);
        iVar.setArguments(bundle);
        return iVar;
    }

    public static i c4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 40621, new Class[]{String.class, String.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", "");
        bundle.putString("mode", P);
        bundle.putString("sku_id", str);
        bundle.putString("page_type", "1");
        bundle.putString(M, null);
        bundle.putString(H, str2);
        iVar.setArguments(bundle);
        return iVar;
    }

    public static i d4(String str, String str2, String str3, String str4, String str5, String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 40620, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putString("app_id", str2);
        bundle.putString(H, str3);
        bundle.putString(I, str4);
        bundle.putString("package_id", str5);
        bundle.putString("sku_id", str6);
        bundle.putString("page_type", "0");
        iVar.setArguments(bundle);
        return iVar;
    }

    private void f4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40630, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER + com.max.hbutils.utils.n.q(String.valueOf(100.0d - (com.max.hbutils.utils.n.o(str) * 100.0d))) + "%";
        if ("0".equals(this.f90767t)) {
            this.f90769v.setBackgroundResource(R.drawable.text_primary_2dp_left);
            this.f90770w.setBackgroundResource(R.drawable.text_primary_border_2dp_right);
            this.f90772y.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
            this.f90773z.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            this.A.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            this.B.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            this.C.setBackgroundDrawable(ViewUtils.l(ViewUtils.f(getContext(), 24.0f), getResources().getColor(R.color.text_primary_1_color), str2, bb.d.a().b(2), getResources().getDimensionPixelSize(R.dimen.text_size_8), getResources().getColor(R.color.white), 0));
            return;
        }
        this.f90770w.setBackgroundResource(R.drawable.text_primary_2dp_right);
        this.f90769v.setBackgroundResource(R.drawable.text_primary_border_2dp_left);
        this.f90773z.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
        this.f90772y.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        this.B.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        this.A.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        this.C.setBackgroundDrawable(ViewUtils.l(ViewUtils.f(getContext(), 24.0f), getResources().getColor(R.color.white), str2, bb.d.a().b(2), getResources().getDimensionPixelSize(R.dimen.text_size_8), getResources().getColor(R.color.text_primary_1_color), 0));
    }

    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40631, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getChildFragmentManager().u().y(R.id.fl_fragment_container, v0.X5(this.f90758k, this.f90759l, this.f90760m, this.f90762o, this.f90763p, this.f90764q, this.f90765r)).m();
    }

    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40632, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getChildFragmentManager().u().y(R.id.fl_fragment_container, n.d5(this.f90758k, this.f90757j, this.f90765r, this.f90761n, this.f90762o)).m();
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40633, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getChildFragmentManager().u().y(R.id.fl_fragment_container, n.d5(this.f90758k, this.f90757j, com.max.hbcommon.network.b.f68052i ? "127" : "6836", this.f90761n, this.f90762o)).m();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void e4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40626, new Class[0], Void.TYPE).isSupported && (getParentFragment() instanceof com.max.xiaoheihe.module.mall.cart.ui.d)) {
            ((com.max.xiaoheihe.module.mall.cart.ui.d) getParentFragment()).u0();
        }
    }

    public void g4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40628, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90766s = str;
        f4(str);
        this.f90768u.setVisibility(0);
        this.f90769v.setOnClickListener(new b());
        this.f90770w.setOnClickListener(new c());
    }

    public void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40629, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f90767t = "1";
        k4();
        f4(this.f90766s);
    }

    @Override // com.max.xiaoheihe.module.mall.n.w
    public void o(MallRegisterOrderObj mallRegisterOrderObj) {
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 40622, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof d) {
            this.D = (d) getParentFragment();
        } else if (context instanceof d) {
            this.D = (d) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 40624, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f90757j = getArguments().getString("mode");
            this.f90758k = getArguments().getString("h_src");
            this.f90759l = getArguments().getString("app_id");
            this.f90760m = getArguments().getString(G);
            this.f90762o = getArguments().getString(H);
            this.f90763p = getArguments().getString(I);
            this.f90764q = getArguments().getString("package_id");
            this.f90765r = getArguments().getString("sku_id");
            this.f90761n = getArguments().getString(M);
            this.f90767t = getArguments().getString("page_type");
        }
        return layoutInflater.inflate(R.layout.fragment_mall_purchase_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40623, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.D = null;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@n0 DialogInterface dialogInterface) {
        MallRegisterOrderObj mallRegisterOrderObjV4;
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 40627, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDismiss(dialogInterface);
        if (!O.equals(this.f90757j) || this.D == null) {
            return;
        }
        Fragment fragmentA4 = a4();
        if (!(fragmentA4 instanceof n) || (mallRegisterOrderObjV4 = ((n) fragmentA4).V4()) == null) {
            return;
        }
        this.D.o(mallRegisterOrderObjV4);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 40625, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f90768u = (ViewGroup) view.findViewById(R.id.vg_selector);
        this.f90771x = (ViewGroup) view.findViewById(R.id.rl_root);
        this.f90769v = (ViewGroup) view.findViewById(R.id.vg_buy_game);
        this.f90770w = (ViewGroup) view.findViewById(R.id.vg_buy_product);
        this.f90772y = (ImageView) view.findViewById(R.id.iv_game_icon);
        this.f90773z = (ImageView) view.findViewById(R.id.iv_steam_icon);
        this.A = (TextView) view.findViewById(R.id.tv_buy_game);
        this.B = (TextView) view.findViewById(R.id.tv_buy_product);
        this.C = (TextView) view.findViewById(R.id.tv_discount);
        this.f90771x.setOnClickListener(new a());
        if ("0".equals(this.f90767t)) {
            h4();
        } else {
            i4();
        }
    }
}
