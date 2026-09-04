package com.max.hblogistics;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.network.q;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AddAddressActivity extends BaseActivity implements com.max.hblogistics.e.h {
    private static final String P = "address";
    public static final String Q = "address_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    private xc.a L;
    private AddressInfoObj M;
    private AddressInfoObj N = new AddressInfoObj();
    private ArrayList<AdminRegionObj> O = new ArrayList<>();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33217yf, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAddressActivity.M1(AddAddressActivity.this);
        }
    }

    public class b implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, bb.c.g.f33237zf, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 5) {
                return false;
            }
            AddAddressActivity.N1(AddAddressActivity.this);
            return true;
        }
    }

    public class c implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, bb.c.g.Af, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 6) {
                return false;
            }
            AddAddressActivity.M1(AddAddressActivity.this);
            AddAddressActivity.O1(AddAddressActivity.this, textView);
            return true;
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Bf, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAddressActivity.N1(AddAddressActivity.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.Cf, new Class[]{Throwable.class}, Void.TYPE).isSupported && AddAddressActivity.this.isActive()) {
                super.onError(th2);
                AddAddressActivity.this.L.f141192j.setVisibility(8);
            }
        }

        public void onNext(Result<KeyDescObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.Df, new Class[]{Result.class}, Void.TYPE).isSupported && AddAddressActivity.this.isActive()) {
                super.onNext(result);
                AddAddressActivity.this.L.f141192j.setVisibility(8);
                if (result.getResult() != null) {
                    AddAddressActivity.this.N.setId(result.getResult().getId());
                }
                Intent intent = new Intent();
                intent.putExtra(AddAddressActivity.Q, AddAddressActivity.this.N);
                AddAddressActivity.this.setResult(-1, intent);
                AddAddressActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Ef, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public class f extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.Ff, new Class[]{Throwable.class}, Void.TYPE).isSupported && AddAddressActivity.this.isActive()) {
                super.onError(th2);
                AddAddressActivity.this.L.f141192j.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.Gf, new Class[]{Result.class}, Void.TYPE).isSupported && AddAddressActivity.this.isActive()) {
                super.onNext(result);
                AddAddressActivity.this.L.f141192j.setVisibility(8);
                Intent intent = new Intent();
                intent.putExtra(AddAddressActivity.Q, AddAddressActivity.this.N);
                AddAddressActivity.this.setResult(-1, intent);
                AddAddressActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Hf, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements MessageQueue.IdleHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.If, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (AddAddressActivity.this.L.f141184b != null) {
                AddAddressActivity addAddressActivity = AddAddressActivity.this;
                AddAddressActivity.T1(addAddressActivity, addAddressActivity.L.f141184b);
            }
            return false;
        }
    }

    static /* synthetic */ void M1(AddAddressActivity addAddressActivity) {
        if (PatchProxy.proxy(new Object[]{addAddressActivity}, null, changeQuickRedirect, true, bb.c.g.f33137uf, new Class[]{AddAddressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addAddressActivity.Y1();
    }

    static /* synthetic */ void N1(AddAddressActivity addAddressActivity) {
        if (PatchProxy.proxy(new Object[]{addAddressActivity}, null, changeQuickRedirect, true, bb.c.g.f33157vf, new Class[]{AddAddressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addAddressActivity.X1();
    }

    static /* synthetic */ void O1(AddAddressActivity addAddressActivity, View view) {
        if (PatchProxy.proxy(new Object[]{addAddressActivity, view}, null, changeQuickRedirect, true, bb.c.g.f33177wf, new Class[]{AddAddressActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        addAddressActivity.hideSoftKeyboard(view);
    }

    static /* synthetic */ void T1(AddAddressActivity addAddressActivity, View view) {
        if (PatchProxy.proxy(new Object[]{addAddressActivity, view}, null, changeQuickRedirect, true, bb.c.g.f33197xf, new Class[]{AddAddressActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        addAddressActivity.Z1(view);
    }

    private void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33017of, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.setName(this.L.f141185c.getText().toString());
        this.N.setPhone(this.L.f141186d.getText().toString());
        this.N.setIs_default(this.L.f141187e.isChecked() ? "true" : "false");
        this.N.setDetail(this.L.f141184b.getText().toString());
        if (this.O.size() > 0) {
            this.N.setProvince(this.O.get(0).getName());
        }
        if (this.O.size() > 1) {
            this.N.setCity(this.O.get(1).getName());
        }
        if (this.O.size() > 2) {
            this.N.setDistrict(this.O.get(2).getName());
            this.N.setCode(this.O.get(2).getCode());
        }
        AddressInfoObj addressInfoObj = this.M;
        if (addressInfoObj != null) {
            this.N.setId(addressInfoObj.getId());
        }
    }

    private boolean W1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32997nf, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(this.N.getName())) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.type_receiver_name));
            return false;
        }
        if (com.max.hbcommon.utils.c.u(this.N.getPhone())) {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.type_receiver_phone_number));
            return false;
        }
        if (this.O.size() < 3) {
            com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(String.format(getString(R.string.choose_format), getString(R.string.current_region)));
            return false;
        }
        if (!com.max.hbcommon.utils.c.u(this.N.getDetail())) {
            return true;
        }
        com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(String.format(getString(R.string.type_format), getString(R.string.exact_address_tips)));
        return false;
    }

    private void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f7if, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hblogistics.e.l4(this.O).show(getSupportFragmentManager(), "ChooseAddress");
    }

    private void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32917jf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V1();
        if (W1()) {
            if (this.M != null) {
                e2(this.N.getName(), this.N.getPhone(), com.max.hbcommon.utils.c.x(this.N.getIs_default()) ? "1" : "0", this.N.getProvince(), this.N.getCity(), this.N.getDistrict(), this.N.getCode(), this.N.getDetail(), this.N.getId());
            } else {
                c2(this.N.getName(), this.N.getPhone(), com.max.hbcommon.utils.c.x(this.N.getIs_default()) ? "1" : "0", this.N.getProvince(), this.N.getCity(), this.N.getDistrict(), this.N.getCode(), this.N.getDetail());
            }
        }
    }

    private void Z1(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33077rf, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public static Intent a2(Context context, AddressInfoObj addressInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, addressInfoObj}, null, changeQuickRedirect, true, bb.c.g.f32858gf, new Class[]{Context.class, AddressInfoObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) AddAddressActivity.class);
        intent.putExtra(P, addressInfoObj);
        return intent;
    }

    private void b2() {
        AddressInfoObj addressInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32937kf, new Class[0], Void.TYPE).isSupported || (addressInfoObj = this.M) == null) {
            return;
        }
        this.L.f141185c.setText(addressInfoObj.getName());
        this.L.f141186d.setText(this.M.getPhone());
        this.L.f141184b.setText(this.M.getDetail());
        this.L.f141187e.setChecked(com.max.hbcommon.utils.c.x(this.M.getIs_default()));
        this.O.clear();
        if (!com.max.hbcommon.utils.c.u(this.M.getProvince()) && this.M.getCode() != null && this.M.getCode().length() > 1) {
            AdminRegionObj adminRegionObj = new AdminRegionObj();
            adminRegionObj.setName(this.M.getProvince());
            adminRegionObj.setCode(this.M.getCode().substring(0, 2));
            this.O.add(adminRegionObj);
        }
        if (!com.max.hbcommon.utils.c.u(this.M.getCity()) && this.M.getCode() != null && this.M.getCode().length() > 3) {
            AdminRegionObj adminRegionObj2 = new AdminRegionObj();
            adminRegionObj2.setName(this.M.getCity());
            adminRegionObj2.setCode(this.M.getCode().substring(0, 4));
            this.O.add(adminRegionObj2);
        }
        if (!com.max.hbcommon.utils.c.u(this.M.getDistrict()) && this.M.getCode() != null && this.M.getCode().length() > 5) {
            AdminRegionObj adminRegionObj3 = new AdminRegionObj();
            adminRegionObj3.setName(this.M.getDistrict());
            adminRegionObj3.setCode(this.M.getCode().substring(0, 6));
            this.O.add(adminRegionObj3);
        }
        f2();
    }

    private void c2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8}, this, changeQuickRedirect, false, bb.c.g.f32957lf, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L.f141192j.setVisibility(0);
        V((io.reactivex.disposables.b) h.a().f(str, str2, str3, str4, str5, str6, str7, str8).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void e2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9}, this, changeQuickRedirect, false, bb.c.g.f32977mf, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L.f141192j.setVisibility(0);
        V((io.reactivex.disposables.b) h.a().e(str, str2, str3, str4, str5, str6, str7, str8, str9).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33037pf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (AdminRegionObj adminRegionObj : this.O) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(adminRegionObj.getName());
        }
        this.L.f141190h.setText(sb2);
    }

    private void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33097sf, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33057qf, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    @Override // com.max.hblogistics.e.h
    public void d0(List<AdminRegionObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f33117tf, new Class[]{List.class}, Void.TYPE).isSupported || this.L.f141190h == null || list == null) {
            return;
        }
        this.O.clear();
        this.O.addAll(list);
        f2();
        Looper.myQueue().addIdleHandler(new g());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32878hf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        xc.a aVarC = xc.a.c(this.f66602c);
        this.L = aVarC;
        setContentView(aVarC.b());
        AddressInfoObj addressInfoObj = (AddressInfoObj) getIntent().getSerializableExtra(P);
        this.M = addressInfoObj;
        TitleBar titleBar = this.f66616q;
        Object[] objArr = new Object[2];
        objArr[0] = getString(addressInfoObj != null ? R.string.edit : R.string.add);
        objArr[1] = getString(R.string.shipping_address);
        titleBar.setTitle(String.format("%s%s", objArr));
        this.f66617r.setVisibility(0);
        this.L.f141189g.setOnClickListener(new a());
        this.L.f141186d.setOnEditorActionListener(new b());
        this.L.f141184b.setHorizontallyScrolling(false);
        this.L.f141184b.setMaxLines(Integer.MAX_VALUE);
        this.L.f141184b.setOnEditorActionListener(new c());
        this.L.f141190h.setOnClickListener(new d());
        this.L.f141192j.setOnClickListener(null);
        b2();
        showSoftKeyboard(this.L.f141185c);
    }
}
