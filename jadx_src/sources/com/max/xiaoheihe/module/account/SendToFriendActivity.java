package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.w1;

/* JADX INFO: compiled from: SendToFriendActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nSendToFriendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendToFriendActivity.kt\ncom/max/xiaoheihe/module/account/SendToFriendActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n262#2,2:68\n*S KotlinDebug\n*F\n+ 1 SendToFriendActivity.kt\ncom/max/xiaoheihe/module/account/SendToFriendActivity\n*L\n63#1:68,2\n*E\n"})
@ig.d(path = {lb.d.P4})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SendToFriendActivity extends BaseActivity {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;

    @dl.d
    public static final String Q = "msg";

    @dl.d
    public static final String R = "msg_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    private w1 L;

    @dl.e
    private String M;

    @dl.e
    private String N;

    /* JADX INFO: compiled from: SendToFriendActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 23989, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) SendToFriendActivity.class);
            intent.putExtra("msg", str);
            intent.putExtra(SendToFriendActivity.R, str2);
            return intent;
        }
    }

    /* JADX INFO: compiled from: SendToFriendActivity.kt */
    public static final class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23990, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                FriendsFragment friendsFragmentF4 = FriendsFragment.f4(SendToFriendActivity.this.M, SendToFriendActivity.this.N);
                kotlin.jvm.internal.f0.o(friendsFragmentF4, "{\n                    Fr…sgType)\n                }");
                return friendsFragmentF4;
            }
            FollowingAndFansFragment followingAndFansFragmentP4 = FollowingAndFansFragment.p4(com.max.xiaoheihe.utils.i0.j(), 1);
            SendToFriendActivity sendToFriendActivity = SendToFriendActivity.this;
            Bundle arguments = followingAndFansFragmentP4.getArguments();
            if (arguments != null) {
                arguments.putString("msg", sendToFriendActivity.M);
                arguments.putString(SendToFriendActivity.R, sendToFriendActivity.N);
            }
            kotlin.jvm.internal.f0.o(followingAndFansFragmentP4, "{\n                    Fo…      }\n                }");
            return followingAndFansFragmentP4;
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23988, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        Intent intent = getIntent();
        if (intent != null) {
            this.M = intent.getStringExtra("msg");
            this.N = intent.getStringExtra(R);
        }
        w1 w1VarC = w1.c(this.f66602c);
        kotlin.jvm.internal.f0.o(w1VarC, "inflate(mInflater)");
        this.L = w1VarC;
        w1 w1Var = null;
        if (w1VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            w1VarC = null;
        }
        setContentView(w1VarC.b());
        w1 w1Var2 = this.L;
        if (w1Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            w1Var2 = null;
        }
        w1Var2.f116978b.setAdapter(new b(getSupportFragmentManager()));
        SlidingTabLayout installViews$lambda$1 = this.f66616q.getTitleTabLayout();
        this.f66616q.a0();
        kotlin.jvm.internal.f0.o(installViews$lambda$1, "installViews$lambda$1");
        installViews$lambda$1.setVisibility(0);
        w1 w1Var3 = this.L;
        if (w1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            w1Var = w1Var3;
        }
        installViews$lambda$1.setViewPager(w1Var.f116978b, new String[]{"好友", "关注"});
    }
}
