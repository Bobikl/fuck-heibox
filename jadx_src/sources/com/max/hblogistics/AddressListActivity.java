package com.max.hblogistics;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.f131179i2})
public class AddressListActivity extends BaseActivity implements com.max.hblogistics.a.h {
    public static final String N = "select";
    public static final int O = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private xc.b L;
    private boolean M;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Nf, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AddressListActivity addressListActivity = AddressListActivity.this;
            addressListActivity.startActivityForResult(AddAddressActivity.a2(((BaseActivity) addressListActivity).f66601b, null), 1);
        }
    }

    public static Intent N1(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Jf, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) AddressListActivity.class);
        intent.putExtra(N, z10);
        return intent;
    }

    @Override // com.max.hblogistics.a.h
    public void A0(View view, AddressInfoObj addressInfoObj) {
        if (!PatchProxy.proxy(new Object[]{view, addressInfoObj}, this, changeQuickRedirect, false, bb.c.g.Mf, new Class[]{View.class, AddressInfoObj.class}, Void.TYPE).isSupported && this.M) {
            Intent intent = new Intent();
            intent.putExtra(AddAddressActivity.Q, addressInfoObj);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Kf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        xc.b bVarC = xc.b.c(this.f66602c);
        this.L = bVarC;
        setContentView(bVarC.b());
        ButterKnife.a(this);
        this.M = getIntent().getBooleanExtra(N, false);
        this.f66616q.setTitle(getString(R.string.shipping_address));
        this.f66617r.setVisibility(0);
        this.L.f141194b.setOnClickListener(new a());
        this.L.f141194b.setBackground(ViewUtils.w(ViewUtils.f(this.f66601b, 5.0f), this.f66601b.getColor(R.color.icon_gradient_dark_start_color), this.f66601b.getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.LEFT_RIGHT));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i10 = R.id.fragment_container;
        if (((com.max.hblogistics.a) supportFragmentManager.r0(i10)) == null) {
            com.max.hblogistics.a aVarA4 = com.max.hblogistics.a.a4();
            aVarA4.setMenuVisibility(true);
            aVarA4.setUserVisibleHint(true);
            getSupportFragmentManager().u().b(i10, aVarA4).m();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Lf, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1 && i11 == -1 && intent != null) {
            com.max.hblogistics.a aVar = (com.max.hblogistics.a) getSupportFragmentManager().r0(R.id.fragment_container);
            AddressInfoObj addressInfoObj = (AddressInfoObj) intent.getSerializableExtra(AddAddressActivity.Q);
            if (aVar == null || addressInfoObj == null) {
                return;
            }
            aVar.b4(addressInfoObj);
        }
    }

    @Override // com.max.hblogistics.a.h
    public boolean y0() {
        return this.M;
    }
}
