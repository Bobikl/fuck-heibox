package com.max.hblogistics;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.network.q;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hblogistics.bean.address.AddressInfosObj;
import com.max.hblogistics.bean.address.AdminRegionsObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mb.b1;
import ng.j;

/* JADX INFO: compiled from: AddressListFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f70970f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f70971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<AddressInfoObj> f70972c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f70973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b1 f70974e;

    /* JADX INFO: renamed from: com.max.hblogistics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AddressListFragment.java */
    public class C0571a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0571a() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.g.f32918jg, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            a.L3(a.this);
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class b extends com.max.hbcommon.network.d<Result<AddressInfosObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32958lg, new Class[0], Void.TYPE).isSupported && a.this.isActive()) {
                super.onComplete();
                a.this.f70974e.f131496c.A(0);
                a.this.f70974e.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.f32938kg, new Class[]{Throwable.class}, Void.TYPE).isSupported && a.this.isActive()) {
                super.onError(th2);
                a.M3(a.this);
                a.this.f70974e.f131496c.A(0);
                a.this.f70974e.f131496c.p(0);
            }
        }

        public void onNext(Result<AddressInfosObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.f32978mg, new Class[]{Result.class}, Void.TYPE).isSupported && a.this.isActive()) {
                super.onNext(result);
                String strO = com.max.hbcache.c.o("pca_version", null);
                String pca_version = result.getResult() != null ? result.getResult().getPca_version() : null;
                if (pca_version != null && !pca_version.equals(strO)) {
                    a.Q3(a.this, strO);
                }
                a.R3(a.this, result.getResult() != null ? result.getResult().getAddresses() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32998ng, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AddressInfosObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<AdminRegionsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f70977b;

        c(String str) {
            this.f70977b = str;
        }

        public void onNext(Result<AdminRegionsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.f33018og, new Class[]{Result.class}, Void.TYPE).isSupported && a.this.isActive()) {
                super.onNext(result);
                if (result.getResult() == null || result.getResult().getPca_version() == null || result.getResult().getPca_version().equals(this.f70977b)) {
                    return;
                }
                com.max.hbcache.b.h("pca", result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33038pg, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AdminRegionsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class d extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f70979b;

        d(String str) {
            this.f70979b = str;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.f33058qg, new Class[]{Result.class}, Void.TYPE).isSupported && a.this.isActive()) {
                super.onNext(result);
                a.S3(a.this, this.f70979b);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33078rg, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33098sg, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AddressInfoObj f70982b;

        f(AddressInfoObj addressInfoObj) {
            this.f70982b = addressInfoObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33118tg, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.T3(a.this, this.f70982b.getId());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public class g extends s<AddressInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hblogistics.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AddressListFragment.java */
        public class ViewOnClickListenerC0572a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressInfoObj f70985b;

            ViewOnClickListenerC0572a(AddressInfoObj addressInfoObj) {
                this.f70985b = addressInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33178wg, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                a aVar = a.this;
                aVar.startActivityForResult(AddAddressActivity.a2(((com.max.hbcommon.base.d) aVar).mContext, this.f70985b), 1);
            }
        }

        /* JADX INFO: compiled from: AddressListFragment.java */
        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressInfoObj f70987b;

            b(AddressInfoObj addressInfoObj) {
                this.f70987b = addressInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33198xg, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                a.N3(a.this, this.f70987b);
            }
        }

        /* JADX INFO: compiled from: AddressListFragment.java */
        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressInfoObj f70989b;

            c(AddressInfoObj addressInfoObj) {
                this.f70989b = addressInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33218yg, new Class[]{View.class}, Void.TYPE).isSupported || a.this.f70973d == null) {
                    return;
                }
                a.this.f70973d.A0(view, this.f70989b);
            }
        }

        public g() {
            super(((com.max.hbcommon.base.d) a.this).mContext, a.this.f70972c, R.layout.hblogistics_item_mall_address_edit);
        }

        public void m(s.e eVar, AddressInfoObj addressInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.f33138ug, new Class[]{s.e.class, AddressInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hblogistics.b.b(eVar, addressInfoObj);
            eVar.i(R.id.iv_edit).setOnClickListener(new ViewOnClickListenerC0572a(addressInfoObj));
            eVar.i(R.id.tv_delete).setOnClickListener(new b(addressInfoObj));
            View viewI = eVar.i(R.id.content);
            if (a.this.f70973d == null || !a.this.f70973d.y0()) {
                viewI.setClickable(false);
            } else {
                viewI.setOnClickListener(new c(addressInfoObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, AddressInfoObj addressInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.f33158vg, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, addressInfoObj);
        }
    }

    /* JADX INFO: compiled from: AddressListFragment.java */
    public interface h {
        void A0(View view, AddressInfoObj addressInfoObj);

        boolean y0();
    }

    static /* synthetic */ void L3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.g.f32779cg, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.Y3();
    }

    static /* synthetic */ void M3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.g.f32799dg, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showError();
    }

    static /* synthetic */ void N3(a aVar, AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{aVar, addressInfoObj}, null, changeQuickRedirect, true, bb.c.g.f32898ig, new Class[]{a.class, AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.X3(addressInfoObj);
    }

    static /* synthetic */ void Q3(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, bb.c.g.f32819eg, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.e4(str);
    }

    static /* synthetic */ void R3(a aVar, List list) {
        if (PatchProxy.proxy(new Object[]{aVar, list}, null, changeQuickRedirect, true, bb.c.g.f32839fg, new Class[]{a.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.f4(list);
    }

    static /* synthetic */ void S3(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, bb.c.g.f32859gg, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c4(str);
    }

    static /* synthetic */ void T3(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, bb.c.g.f32879hg, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.Z3(str);
    }

    private void X3(AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.Wf, new Class[]{AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.prompt).k(R.string.delete_address_tips).t(R.string.delete, new f(addressInfoObj)).n(R.string.cancel, new e()).F();
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Sf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hblogistics.h.a().a().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void Z3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Uf, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hblogistics.h.a().d(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    public static a a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.Of, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        a aVar = new a();
        aVar.setArguments(new Bundle());
        return aVar;
    }

    private void c4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Xf, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<AddressInfoObj> it = this.f70972c.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(str)) {
                it.remove();
                g gVar = this.f70971b;
                if (gVar != null) {
                    gVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
    }

    private void d4(AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.Zf, new Class[]{AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        for (AddressInfoObj addressInfoObj2 : this.f70972c) {
            if (addressInfoObj2.getId().equals(addressInfoObj.getId())) {
                addressInfoObj2.setName(addressInfoObj.getName());
                addressInfoObj2.setCode(addressInfoObj.getCode());
                addressInfoObj2.setIs_default(addressInfoObj.getIs_default());
                addressInfoObj2.setPhone(addressInfoObj.getPhone());
                addressInfoObj2.setProvince(addressInfoObj.getProvince());
                addressInfoObj2.setCity(addressInfoObj.getCity());
                addressInfoObj2.setDistrict(addressInfoObj.getDistrict());
                addressInfoObj2.setDetail(addressInfoObj.getDetail());
                g gVar = this.f70971b;
                if (gVar == null) {
                    break;
                }
                gVar.notifyDataSetChanged();
                break;
            }
        }
        Y3();
    }

    private void e4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Tf, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hblogistics.h.a().c(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    private void f4(List<AddressInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.Vf, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null) {
            showContentView();
            return;
        }
        this.f70972c.clear();
        this.f70972c.addAll(list);
        this.f70971b.notifyDataSetChanged();
        if (this.f70972c.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, R.string.no_address_tips);
        } else {
            showContentView();
        }
    }

    public void b4(AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.Yf, new Class[]{AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f70972c.add(0, addressInfoObj);
        g gVar = this.f70971b;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        Y3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Rf, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(this.mInflater);
        this.f70974e = b1VarC;
        setContentView(b1VarC);
        this.f70971b = new g();
        this.f70974e.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f70974e.f131495b.setAdapter(this.f70971b);
        this.f70974e.f131495b.setPadding(0, ViewUtils.f(this.mContext, 10.0f), 0, 0);
        this.f70974e.f131495b.setClipToPadding(false);
        this.f70974e.f131496c.S(new C0571a());
        this.f70974e.f131496c.b0(false);
        showLoading();
        Y3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        AddressInfoObj addressInfoObj;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32759bg, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1 || i11 != -1 || intent == null || (addressInfoObj = (AddressInfoObj) intent.getSerializableExtra(AddAddressActivity.Q)) == null) {
            return;
        }
        d4(addressInfoObj);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.g.Pf, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof h) {
            this.f70973d = (h) getParentFragment();
            return;
        }
        if (context instanceof h) {
            this.f70973d = (h) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement ListListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Qf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f70973d = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32739ag, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        Y3();
    }
}
