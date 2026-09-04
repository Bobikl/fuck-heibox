package com.max.xiaoheihe.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.mall.cart.ui.FragmentID;
import com.max.xiaoheihe.module.mall.cart.ui.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.socialize.UMShareAPI;
import dl.e;
import ig.d;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FragmentContainerActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
@d(interceptors = {com.max.xiaoheihe.router.interceptors.d.class}, path = {lb.d.f131172h2, lb.d.Y1, lb.d.f131137c2})
public final class FragmentContainerActivity extends BaseActivity {

    @dl.d
    public static final a L = new a(null);
    public static final int M = 0;

    @dl.d
    private static final String N = "arg_fragment_id";

    @dl.d
    private static final String O = "arg_bundle";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: FragmentContainerActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.OG, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras != null ? extras.getSerializable(N) : null;
        FragmentID fragmentID = serializable instanceof FragmentID ? (FragmentID) serializable : null;
        if (fragmentID == null) {
            return;
        }
        Bundle extras2 = getIntent().getExtras();
        Bundle bundle = extras2 != null ? extras2.getBundle(O) : null;
        if (getSupportFragmentManager().r0(R.id.fragment_container) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, b.f90502a.a(fragmentID, bundle)).m();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.QG, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.PG, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getSupportFragmentManager().J0().size() > 0) {
            for (androidx.activity.result.b bVar : getSupportFragmentManager().J0()) {
                if (bVar instanceof cf.a) {
                    ((cf.a) bVar).S2();
                    return;
                }
            }
        }
        super.onBackPressed();
    }
}
