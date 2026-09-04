package com.max.hblogistics;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.max.hblogistics.bean.address.AdminRegionsObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f70995w = "chosen_regions";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<AdminRegionObj> f70996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RecyclerView f70997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f70998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FlexboxLayout f70999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FlexboxLayout f71000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f71001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<AdminRegionObj> f71002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<AdminRegionObj> f71003q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<AdminRegionObj> f71004r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<AdminRegionObj> f71005s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t f71006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f71007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f71008v;

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Yg, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            e.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class b extends com.max.hbcommon.network.d<AdminRegionsObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(AdminRegionsObj adminRegionsObj) {
            if (!PatchProxy.proxy(new Object[]{adminRegionsObj}, this, changeQuickRedirect, false, bb.c.g.f32740ah, new Class[]{AdminRegionsObj.class}, Void.TYPE).isSupported && e.this.isActive()) {
                super.onNext(adminRegionsObj);
                e.this.f70998l.setVisibility(8);
                e.Y3(e.this, adminRegionsObj);
                if (adminRegionsObj != null) {
                    e.V3(e.this, adminRegionsObj.getPca_version());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.Zg, new Class[]{Throwable.class}, Void.TYPE).isSupported && e.this.isActive()) {
                super.onError(th2);
                e.V3(e.this, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32760bh, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((AdminRegionsObj) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<AdminRegionsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f71011b;

        c(String str) {
            this.f71011b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.f32780ch, new Class[]{Throwable.class}, Void.TYPE).isSupported && e.this.isActive()) {
                super.onError(th2);
                e.this.f70998l.setVisibility(8);
                e.this.dismiss();
            }
        }

        public void onNext(Result<AdminRegionsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.f32800dh, new Class[]{Result.class}, Void.TYPE).isSupported && e.this.isActive()) {
                super.onNext(result);
                e.this.f70998l.setVisibility(8);
                if (result.getResult() == null || result.getResult().getPca_version() == null || result.getResult().getPca_version().equals(this.f71011b)) {
                    return;
                }
                com.max.hbcache.b.h("pca", result.getResult());
                e.Y3(e.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32820eh, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AdminRegionsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f32840fh, new Class[]{View.class}, Void.TYPE).isSupported && e.this.f71004r.size() >= 1) {
                e eVar = e.this;
                eVar.f71004r = eVar.f71004r.subList(0, 1);
                e.this.f71007u = AdminRegionObj.TYPE_PROVINCE;
                if (e.this.f71002p != null) {
                    e.this.f71003q.clear();
                    e.this.f71003q.addAll(e.this.f71002p);
                }
                e.f4(e.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hblogistics.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class ViewOnClickListenerC0573e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0573e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f32860gh, new Class[]{View.class}, Void.TYPE).isSupported && e.this.f71004r.size() >= 2) {
                e eVar = e.this;
                eVar.f71004r = eVar.f71004r.subList(0, 2);
                e.this.f71007u = AdminRegionObj.TYPE_CITY;
                if (e.this.f71002p != null) {
                    String code = ((AdminRegionObj) e.this.f71004r.get(0)).getCode();
                    for (AdminRegionObj adminRegionObj : e.this.f71002p) {
                        if (code.equals(adminRegionObj.getCode()) && adminRegionObj.getChildren() != null) {
                            e.this.f71003q.clear();
                            e.this.f71003q.addAll(adminRegionObj.getChildren());
                        }
                    }
                }
                e.f4(e.this);
            }
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdminRegionObj f71015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f71016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlexboxLayout f71017d;

        f(AdminRegionObj adminRegionObj, List list, FlexboxLayout flexboxLayout) {
            this.f71015b = adminRegionObj;
            this.f71016c = list;
            this.f71017d = flexboxLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f32880hh, new Class[]{View.class}, Void.TYPE).isSupported || this.f71015b.isChecked()) {
                return;
            }
            e.g4(e.this, this.f71016c, this.f71015b);
            e.h4(e.this, this.f71017d, this.f71016c);
            for (AdminRegionObj adminRegionObj : e.this.f71002p) {
                if (adminRegionObj.getChildren() != null) {
                    for (AdminRegionObj adminRegionObj2 : adminRegionObj.getChildren()) {
                        if (adminRegionObj2.getCode() != null && adminRegionObj2.getCode().equals(this.f71015b.getCode())) {
                            e.this.f71004r.clear();
                            e.this.f71004r.add(adminRegionObj);
                            e.this.f71004r.add(adminRegionObj2);
                            if (adminRegionObj2.getChildren() != null) {
                                e.this.f71003q.clear();
                                e.this.f71003q.addAll(adminRegionObj2.getChildren());
                            }
                            e.this.f71007u = AdminRegionObj.TYPE_DISTRICT;
                            e.f4(e.this);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public class g extends s<AdminRegionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdminRegionObj f71020b;

            a(AdminRegionObj adminRegionObj) {
                this.f71020b = adminRegionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f32979mh, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                e eVar = e.this;
                e.g4(eVar, eVar.f71003q, this.f71020b);
                if (AdminRegionObj.TYPE_PROVINCE.equals(e.this.f71007u)) {
                    g.m(g.this, 0, this.f71020b);
                    e.this.f71007u = AdminRegionObj.TYPE_CITY;
                    e.f4(e.this);
                } else if (AdminRegionObj.TYPE_CITY.equals(e.this.f71007u)) {
                    g.m(g.this, 1, this.f71020b);
                    e.this.f71007u = AdminRegionObj.TYPE_DISTRICT;
                    e.f4(e.this);
                } else {
                    g.m(g.this, 2, this.f71020b);
                    if (e.this.f71008v != null) {
                        e.this.f71008v.d0(e.this.f71004r);
                    }
                    e.this.dismiss();
                }
            }
        }

        public g() {
            super(e.this.getContext(), e.this.f71003q, R.layout.hblogistics_item_admin_region);
        }

        static /* synthetic */ void m(g gVar, int i10, AdminRegionObj adminRegionObj) {
            if (PatchProxy.proxy(new Object[]{gVar, new Integer(i10), adminRegionObj}, null, changeQuickRedirect, true, bb.c.g.f32959lh, new Class[]{g.class, Integer.TYPE, AdminRegionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            gVar.n(i10, adminRegionObj);
        }

        private void n(int i10, AdminRegionObj adminRegionObj) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), adminRegionObj}, this, changeQuickRedirect, false, bb.c.g.f32919jh, new Class[]{Integer.TYPE, AdminRegionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (e.this.f71004r.size() > i10) {
                e.this.f71004r.set(i10, adminRegionObj);
            } else {
                e.this.f71004r.add(adminRegionObj);
            }
            if (adminRegionObj.getChildren() != null) {
                e.this.f71003q.clear();
                e.this.f71003q.addAll(adminRegionObj.getChildren());
            }
        }

        public void o(s.e eVar, AdminRegionObj adminRegionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, adminRegionObj}, this, changeQuickRedirect, false, bb.c.g.f32899ih, new Class[]{s.e.class, AdminRegionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            viewB.getContext();
            TextView textView = (TextView) eVar.i(R.id.tv_tag);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_checked);
            TextView textView2 = (TextView) eVar.i(R.id.tv_name);
            textView.setVisibility(0);
            textView.setText(adminRegionObj.getLetter());
            imageView.setVisibility(adminRegionObj.isChecked() ? 0 : 8);
            textView2.setText(adminRegionObj.getName());
            viewB.setOnClickListener(new a(adminRegionObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, AdminRegionObj adminRegionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, adminRegionObj}, this, changeQuickRedirect, false, bb.c.g.f32939kh, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, adminRegionObj);
        }
    }

    /* JADX INFO: compiled from: ChooseAddressDialogFragment.java */
    public interface h {
        void d0(List<AdminRegionObj> list);
    }

    static /* synthetic */ void V3(e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, null, changeQuickRedirect, true, bb.c.g.Tg, new Class[]{e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.o4(str);
    }

    static /* synthetic */ void Y3(e eVar, AdminRegionsObj adminRegionsObj) {
        if (PatchProxy.proxy(new Object[]{eVar, adminRegionsObj}, null, changeQuickRedirect, true, bb.c.g.Ug, new Class[]{e.class, AdminRegionsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.m4(adminRegionsObj);
    }

    static /* synthetic */ void f4(e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, null, changeQuickRedirect, true, bb.c.g.Vg, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.n4();
    }

    static /* synthetic */ void g4(e eVar, List list, AdminRegionObj adminRegionObj) {
        if (PatchProxy.proxy(new Object[]{eVar, list, adminRegionObj}, null, changeQuickRedirect, true, bb.c.g.Wg, new Class[]{e.class, List.class, AdminRegionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.v4(list, adminRegionObj);
    }

    static /* synthetic */ void h4(e eVar, FlexboxLayout flexboxLayout, List list) {
        if (PatchProxy.proxy(new Object[]{eVar, flexboxLayout, list}, null, changeQuickRedirect, true, bb.c.g.Xg, new Class[]{e.class, FlexboxLayout.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.r4(flexboxLayout, list);
    }

    private AdminRegionObj i4(List<AdminRegionObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.Sg, new Class[]{List.class}, AdminRegionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AdminRegionObj) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (AdminRegionObj adminRegionObj : list) {
            if (adminRegionObj.isChecked()) {
                return adminRegionObj;
            }
        }
        return null;
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Jg, new Class[0], Void.TYPE).isSupported || this.f71002p == null) {
            return;
        }
        ArrayList<AdminRegionObj> arrayList = this.f70996j;
        if ((arrayList != null ? arrayList.size() : 0) <= 0) {
            this.f71007u = AdminRegionObj.TYPE_PROVINCE;
            this.f71003q.clear();
            this.f71003q.addAll(this.f71002p);
            return;
        }
        if (this.f70996j.size() == 1) {
            AdminRegionObj adminRegionObj = this.f70996j.get(0);
            for (AdminRegionObj adminRegionObj2 : this.f71002p) {
                adminRegionObj2.setChecked(adminRegionObj2.equals(adminRegionObj));
                if (adminRegionObj2.isChecked() && adminRegionObj2.getChildren() != null) {
                    this.f71003q.clear();
                    this.f71003q.addAll(adminRegionObj2.getChildren());
                }
            }
            this.f71007u = AdminRegionObj.TYPE_CITY;
        } else if (this.f70996j.size() == 2) {
            AdminRegionObj adminRegionObj3 = this.f70996j.get(0);
            AdminRegionObj adminRegionObj4 = this.f70996j.get(1);
            for (AdminRegionObj adminRegionObj5 : this.f71002p) {
                adminRegionObj5.setChecked(adminRegionObj5.equals(adminRegionObj3));
                if (adminRegionObj5.isChecked() && adminRegionObj5.getChildren() != null) {
                    for (AdminRegionObj adminRegionObj6 : adminRegionObj5.getChildren()) {
                        adminRegionObj6.setChecked(adminRegionObj6.equals(adminRegionObj4));
                        if (adminRegionObj6.isChecked() && adminRegionObj6.getChildren() != null) {
                            this.f71003q.clear();
                            this.f71003q.addAll(adminRegionObj6.getChildren());
                        }
                    }
                }
            }
            this.f71007u = AdminRegionObj.TYPE_DISTRICT;
        } else {
            AdminRegionObj adminRegionObj7 = this.f70996j.get(0);
            AdminRegionObj adminRegionObj8 = this.f70996j.get(1);
            AdminRegionObj adminRegionObj9 = this.f70996j.get(2);
            for (AdminRegionObj adminRegionObj10 : this.f71002p) {
                adminRegionObj10.setChecked(adminRegionObj10.equals(adminRegionObj7));
                if (adminRegionObj10.isChecked() && adminRegionObj10.getChildren() != null) {
                    for (AdminRegionObj adminRegionObj11 : adminRegionObj10.getChildren()) {
                        adminRegionObj11.setChecked(adminRegionObj11.equals(adminRegionObj8));
                        if (adminRegionObj11.isChecked() && adminRegionObj11.getChildren() != null) {
                            this.f71003q.clear();
                            for (AdminRegionObj adminRegionObj12 : adminRegionObj11.getChildren()) {
                                adminRegionObj12.setChecked(adminRegionObj12.equals(adminRegionObj9));
                                this.f71003q.add(adminRegionObj12);
                            }
                        }
                    }
                }
            }
            this.f71007u = AdminRegionObj.TYPE_DISTRICT;
        }
        this.f71004r.clear();
        this.f71004r.addAll(this.f70996j);
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Gg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f70998l.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.a("pca", AdminRegionsObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public static e l4(ArrayList<AdminRegionObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, bb.c.g.Bg, new Class[]{ArrayList.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f70995w, arrayList);
        eVar.setArguments(bundle);
        return eVar;
    }

    private void m4(AdminRegionsObj adminRegionsObj) {
        if (PatchProxy.proxy(new Object[]{adminRegionsObj}, this, changeQuickRedirect, false, bb.c.g.Ig, new Class[]{AdminRegionsObj.class}, Void.TYPE).isSupported || adminRegionsObj == null) {
            return;
        }
        if (adminRegionsObj.getHot_city() != null) {
            this.f71005s.clear();
            this.f71005s.addAll(adminRegionsObj.getHot_city());
        }
        this.f71002p = adminRegionsObj.getPca();
        j4();
        this.f71006t.notifyDataSetChanged();
        q4();
    }

    private void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Qg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t4();
        p4();
        this.f71006t.notifyDataSetChanged();
    }

    private void o4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Hg, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hblogistics.h.a().c(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    private void p4() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Lg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (AdminRegionObj.TYPE_PROVINCE.equals(this.f71007u)) {
            string = getString(R.string.province_desc);
        } else {
            string = AdminRegionObj.TYPE_CITY.equals(this.f71007u) ? getString(R.string.city) : getString(R.string.district_desc);
        }
        this.f71001o.setText(String.format(getString(R.string.choose_format), string));
    }

    private void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Kg, new Class[0], Void.TYPE).isSupported || this.f70999m == null) {
            return;
        }
        t4();
        r4(this.f71000n, this.f71005s);
        p4();
    }

    private void r4(FlexboxLayout flexboxLayout, List<AdminRegionObj> list) {
        if (PatchProxy.proxy(new Object[]{flexboxLayout, list}, this, changeQuickRedirect, false, bb.c.g.Pg, new Class[]{FlexboxLayout.class, List.class}, Void.TYPE).isSupported || flexboxLayout == null || list == null) {
            return;
        }
        Context context = flexboxLayout.getContext();
        flexboxLayout.removeAllViews();
        int iF = ViewUtils.f(context, 7.0f);
        int iF2 = ViewUtils.f(context, 48.0f);
        int iF3 = ViewUtils.f(context, 30.0f);
        for (AdminRegionObj adminRegionObj : list) {
            TextView textView = new TextView(context);
            textView.setPadding(iF, iF, iF, iF);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
            textView.setText(adminRegionObj.getName());
            textView.setGravity(17);
            textView.setMinWidth(iF2);
            textView.setMinHeight(iF3);
            textView.setBackgroundResource(adminRegionObj.isChecked() ? R.drawable.btn_divider_bg_tile_border_2dp : R.drawable.btn_divider_bg_2dp);
            textView.setOnClickListener(new f(adminRegionObj, list, flexboxLayout));
            flexboxLayout.addView(textView);
        }
    }

    private void s4(View view, AdminRegionObj adminRegionObj) {
        String string;
        String string2;
        View.OnClickListener viewOnClickListenerC0573e;
        if (PatchProxy.proxy(new Object[]{view, adminRegionObj}, this, changeQuickRedirect, false, bb.c.g.Og, new Class[]{View.class, AdminRegionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_desc);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_name);
        if (AdminRegionObj.TYPE_PROVINCE.equals(adminRegionObj.getType())) {
            string = getString(R.string.province_desc);
            string2 = getString(R.string.beijing);
            viewOnClickListenerC0573e = new d();
        } else if (AdminRegionObj.TYPE_CITY.equals(adminRegionObj.getType())) {
            string = getString(R.string.city);
            string2 = getString(R.string.beijing);
            viewOnClickListenerC0573e = new ViewOnClickListenerC0573e();
        } else {
            string = getString(R.string.district_desc);
            string2 = getString(R.string.beijing_chaoyang);
            viewOnClickListenerC0573e = null;
        }
        textView.setText(string);
        if (com.max.hbcommon.utils.c.u(adminRegionObj.getName())) {
            textView2.setText(string2);
            textView2.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        } else {
            textView2.setText(adminRegionObj.getName());
            textView2.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        }
        view.setOnClickListener(viewOnClickListenerC0573e);
    }

    private void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Mg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u4(this.f70999m, this.f71004r);
    }

    private void u4(FlexboxLayout flexboxLayout, List<AdminRegionObj> list) {
        String str;
        if (PatchProxy.proxy(new Object[]{flexboxLayout, list}, this, changeQuickRedirect, false, bb.c.g.Ng, new Class[]{FlexboxLayout.class, List.class}, Void.TYPE).isSupported || flexboxLayout == null || list == null) {
            return;
        }
        Context context = flexboxLayout.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int iL = (ViewUtils.L(context) - ViewUtils.f(context, 25.0f)) / 3;
        flexboxLayout.removeAllViews();
        int i10 = 0;
        while (i10 < 3) {
            AdminRegionObj adminRegionObj = i10 < list.size() ? list.get(i10) : new AdminRegionObj();
            if (i10 == 0) {
                str = AdminRegionObj.TYPE_PROVINCE;
            } else {
                str = i10 == 1 ? AdminRegionObj.TYPE_CITY : AdminRegionObj.TYPE_DISTRICT;
            }
            adminRegionObj.setType(str);
            if (i10 > 0) {
                View view = new View(context);
                view.setLayoutParams(new FlexboxLayout.LayoutParams(ViewUtils.f(context, 0.5f), ViewUtils.f(context, 33.0f)));
                view.setBackgroundColor(getResources().getColor(R.color.divider_secondary_1_color));
                flexboxLayout.addView(view);
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.hblogistics_item_selected_region, (ViewGroup) flexboxLayout, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.width = iL;
            viewInflate.setLayoutParams(layoutParams);
            s4(viewInflate, adminRegionObj);
            flexboxLayout.addView(viewInflate);
            i10++;
        }
    }

    private void v4(List<AdminRegionObj> list, AdminRegionObj adminRegionObj) {
        if (PatchProxy.proxy(new Object[]{list, adminRegionObj}, this, changeQuickRedirect, false, bb.c.g.Rg, new Class[]{List.class, AdminRegionObj.class}, Void.TYPE).isSupported || list == null || adminRegionObj == null) {
            return;
        }
        for (AdminRegionObj adminRegionObj2 : list) {
            adminRegionObj2.setChecked(adminRegionObj2.equals(adminRegionObj));
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.g.Cg, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof h) {
            this.f71008v = (h) getParentFragment();
            return;
        }
        if (context instanceof h) {
            this.f71008v = (h) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement SelectListener");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.g.Eg, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f70996j = (ArrayList) getArguments().getSerializable(f70995w);
        }
        return layoutInflater.inflate(R.layout.hblogistics_fragment_choose_address_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Dg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f71008v = null;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.g.Fg, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f70998l = view.findViewById(R.id.vg_progress);
        this.f70997k = (RecyclerView) view.findViewById(R.id.rv);
        a aVar = new a();
        view.setOnClickListener(aVar);
        this.f70997k.setLayoutManager(new LinearLayoutManager(getContext()));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i10 = R.layout.hblogistics_item_choose_address_header;
        View viewInflate = layoutInflaterFrom.inflate(i10, (ViewGroup) this.f70997k, false);
        this.f70999m = (FlexboxLayout) viewInflate.findViewById(R.id.fl_selected);
        this.f71000n = (FlexboxLayout) viewInflate.findViewById(R.id.fl_popular_city);
        this.f71001o = (TextView) viewInflate.findViewById(R.id.tv_choose_desc);
        viewInflate.findViewById(R.id.iv_close).setOnClickListener(aVar);
        t tVar = new t(new g());
        this.f71006t = tVar;
        tVar.p(i10, viewInflate);
        this.f70997k.setAdapter(this.f71006t);
        k4();
    }
}
