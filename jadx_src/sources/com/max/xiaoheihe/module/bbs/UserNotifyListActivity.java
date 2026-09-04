package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.p.class}, path = {lb.d.f131286x4, lb.d.E4, lb.d.H4})
public class UserNotifyListActivity extends BaseActivity {
    public static final String L = "list_type";
    public static final String M = "name";
    public static final String N = "sender_id";
    public static final String O = "sub_entry";
    public static final String P = "0";
    public static final String Q = "1";
    public static final String R = "2";
    public static final String S = "3";
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    public static Intent N1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 27058, new Class[]{Context.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UserNotifyListActivity.class);
        intent.putExtra("list_type", "0");
        return intent;
    }

    public static Intent O1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 27059, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UserNotifyListActivity.class);
        intent.putExtra("list_type", str);
        return intent;
    }

    public static Intent Q1(Context context, String str, String str2, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4}, null, changeQuickRedirect, true, 27060, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UserNotifyListActivity.class);
        intent.putExtra("list_type", str);
        intent.putExtra("name", str2);
        intent.putExtra("sender_id", str3);
        intent.putExtra(O, str4);
        return intent;
    }

    public void M1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27062, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x8(str, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new a()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27061, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        String stringExtra = getIntent().getStringExtra("list_type");
        String stringExtra2 = getIntent().getStringExtra("sender_id");
        String stringExtra3 = getIntent().getStringExtra("name");
        String stringExtra4 = getIntent().getStringExtra(O);
        findViewById(R.id.fragment_container).setBackgroundDrawable(getResources().getDrawable(R.color.background_layer_2_color));
        if (getSupportFragmentManager().r0(R.id.fragment_container) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, "3".equals(stringExtra) ? com.max.xiaoheihe.module.bbs.messagecenter.b.Q.a(stringExtra, stringExtra3, stringExtra4) : q0.b4(stringExtra, stringExtra3, stringExtra2)).m();
        }
    }
}
