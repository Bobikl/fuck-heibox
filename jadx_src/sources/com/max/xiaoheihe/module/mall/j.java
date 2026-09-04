package com.max.xiaoheihe.module.mall;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameMobileBundleObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class j extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f90777q = "bundle";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f90778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f90779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f90780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f90781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f90782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f90783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f90784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f90785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f90786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f90787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private GameMobileBundleObj f90788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f90789p;

    /* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40651, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            j.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
    public class b extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40652, new Class[]{Throwable.class}, Void.TYPE).isSupported && j.this.isActive()) {
                super.onError(th2);
                j.this.f90778e.setVisibility(8);
                j.this.dismiss();
            }
        }

        public void onNext(Result<GamePurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40653, new Class[]{Result.class}, Void.TYPE).isSupported && j.this.isActive()) {
                super.onNext(result);
                j.this.f90778e.setVisibility(8);
                GamePurchaseResultObj result2 = result.getResult();
                if (result2 != null) {
                    j.this.f90789p = result2.getCdkey();
                    j.Q3(j.this);
                    j.R3(j.this);
                } else {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(j.this.getString(R.string.fail));
                    j.this.dismiss();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40654, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40655, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            j jVar = j.this;
            j.T3(jVar, jVar.f90788o.getId());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40656, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            j.this.f90785l.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            j.this.f90785l.setFocusable(true);
            j.this.f90785l.setSelected(true);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseMobileBundleDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40657, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(view.getContext(), j.this.f90789p);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(j.this.getString(R.string.cdkey_copied));
        }
    }

    static /* synthetic */ void Q3(j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 40648, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.X3();
    }

    static /* synthetic */ void R3(j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 40649, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.Y3();
    }

    static /* synthetic */ void T3(j jVar, String str) {
        if (PatchProxy.proxy(new Object[]{jVar, str}, null, changeQuickRedirect, true, 40650, new Class[]{j.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.W3(str);
    }

    public static j V3(GameMobileBundleObj gameMobileBundleObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMobileBundleObj}, null, changeQuickRedirect, true, 40641, new Class[]{GameMobileBundleObj.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bundle", gameMobileBundleObj);
        jVar.setArguments(bundle);
        return jVar;
    }

    private void W3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40645, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90778e.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ya(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40647, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f90789p)) {
            this.f90784k.setVisibility(8);
            return;
        }
        this.f90784k.setVisibility(0);
        this.f90785l.setText(this.f90789p);
        this.f90785l.setOnClickListener(new d());
        this.f90786m.setOnClickListener(new e());
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40646, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f90789p)) {
            this.f90787n.setText(this.f90788o.getDetail() != null ? this.f90788o.getDetail().getButton_desc() : getString(R.string.claim));
            this.f90787n.setTextColor(getResources().getColor(R.color.click_blue));
            this.f90787n.setOnClickListener(new c());
        } else {
            this.f90787n.setText(getString(R.string.claimed_tips));
            this.f90787n.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            this.f90787n.setClickable(false);
        }
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 40642, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f90788o = (GameMobileBundleObj) getArguments().getSerializable("bundle");
        }
        return layoutInflater.inflate(R.layout.fragment_mall_purchase_mobile_bundle_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40644, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f90778e.setVisibility(8);
        com.max.hbimage.b.K(this.f90788o.getImg(), this.f90779f);
        this.f90780g.setText(this.f90788o.getName());
        StringBuilder sb2 = new StringBuilder();
        if (this.f90788o.getDetail() != null && !com.max.hbcommon.utils.c.u(this.f90788o.getDetail().getState_desc())) {
            sb2.append(this.f90788o.getDetail().getState_desc());
        }
        if (!com.max.hbcommon.utils.c.u(this.f90788o.getTime_desc())) {
            if (sb2.length() > 0) {
                sb2.append("   ");
            }
            sb2.append(this.f90788o.getTime_desc());
        }
        if (sb2.length() > 0) {
            this.f90781h.setVisibility(0);
            this.f90781h.setText(sb2);
        } else {
            this.f90781h.setVisibility(8);
        }
        this.f90782i.setText(this.f90788o.getDescription());
        List<String> bundle_desc = this.f90788o.getDetail() != null ? this.f90788o.getDetail().getBundle_desc() : null;
        if (com.max.hbcommon.utils.c.w(bundle_desc)) {
            this.f90783j.setVisibility(8);
        } else {
            this.f90783j.setVisibility(0);
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < bundle_desc.size(); i10++) {
                if (i10 != 0) {
                    sb3.append("\n");
                }
                sb3.append(bundle_desc.get(i10));
            }
            this.f90783j.setText(sb3);
        }
        X3();
        Y3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 40643, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.iv_window_close).setOnClickListener(new a());
        this.f90778e = (ProgressBar) view.findViewById(R.id.progress);
        this.f90779f = (ImageView) view.findViewById(R.id.iv_icon);
        this.f90780g = (TextView) view.findViewById(R.id.tv_title);
        this.f90781h = (TextView) view.findViewById(R.id.tv_time_desc);
        this.f90782i = (TextView) view.findViewById(R.id.tv_desc);
        this.f90783j = (TextView) view.findViewById(R.id.tv_bundle_desc);
        this.f90784k = view.findViewById(R.id.vg_key);
        this.f90785l = (TextView) view.findViewById(R.id.tv_key);
        this.f90786m = (TextView) view.findViewById(R.id.tv_copy);
        this.f90787n = (TextView) view.findViewById(R.id.tv_option);
    }
}
