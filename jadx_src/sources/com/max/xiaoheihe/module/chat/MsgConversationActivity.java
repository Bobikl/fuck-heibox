package com.max.xiaoheihe.module.chat;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.FeedBackFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import ig.d;

/* JADX INFO: loaded from: classes10.dex */
@d(path = {lb.d.J4, lb.d.S4})
public class MsgConversationActivity extends BaseActivity {
    private static final String N = "userid";
    private static final String O = "username";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31400, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) MsgConversationActivity.this).f66601b.startActivity(IMFriendSettingActivity.b2(((BaseActivity) MsgConversationActivity.this).f66601b, MsgConversationActivity.this.L));
        }
    }

    public static Intent Q1(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 31398, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MsgConversationActivity.class);
        intent.putExtra("userid", str);
        intent.putExtra("username", str2);
        return intent;
    }

    public static void R1(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 31397, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported || context == null) {
            return;
        }
        FlutterMsgConversationActivity.P0(context, str, str2);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31399, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.L = intent.getStringExtra("userid");
            this.M = intent.getStringExtra("username");
        }
        this.f66616q.setTitle(this.M);
        this.f66616q.setActionIcon(R.drawable.common_more);
        this.f66616q.setActionIconOnClickListener(new a());
        this.f66617r.setVisibility(0);
        if (((FeedBackFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, FeedBackFragment.f5(this.L)).m();
        }
    }
}
