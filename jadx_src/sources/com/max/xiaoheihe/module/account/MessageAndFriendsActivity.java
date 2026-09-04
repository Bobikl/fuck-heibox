package com.max.xiaoheihe.module.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.OnlineStateObj;
import com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment;
import com.max.xiaoheihe.router.interceptors.MessageAndFriendsInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.n1;

/* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(interceptors = {MessageAndFriendsInterceptor.class}, path = {lb.d.f131279w4, lb.d.f131276w1})
public final class MessageAndFriendsActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;

    @dl.d
    public static final String S = "default_select";

    @dl.d
    public static final String T = "userid";

    @dl.d
    public static final String U = "key";

    @dl.d
    public static final String V = "from";

    @dl.d
    public static final String W = "message";

    @dl.d
    public static final String X = "friends";
    public static ChangeQuickRedirect changeQuickRedirect;
    private n1 L;

    @dl.e
    private String M;
    private boolean N = true;

    @dl.e
    private String O = "message";

    @dl.e
    private UserProfileUpdatedBroadcastReceiver P;

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public final class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public UserProfileUpdatedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23708, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (kotlin.jvm.internal.f0.g(lb.a.f130960f0, intent.getAction())) {
                MessageAndFriendsActivity.b2(MessageAndFriendsActivity.this, false, 1, null);
            }
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<OnlineStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f78206c;

        b(boolean z10) {
            this.f78206c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 23710, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            MessageAndFriendsActivity.X1(MessageAndFriendsActivity.this);
            if (this.f78206c) {
                MessageAndFriendsActivity.V1(MessageAndFriendsActivity.this);
            }
        }

        public void onNext(@dl.d Result<OnlineStateObj> t10) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 23709, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            super.onNext(t10);
            MessageAndFriendsActivity.X1(MessageAndFriendsActivity.this);
            OnlineStateObj result = t10.getResult();
            if (com.max.hbutils.utils.n.q(result != null ? result.getFriend_num() : null) <= 0 && !kotlin.jvm.internal.f0.g(MessageAndFriendsActivity.this.O, "friends")) {
                z10 = false;
            }
            if ((z10 && !MessageAndFriendsActivity.this.N) || this.f78206c) {
                MessageAndFriendsActivity.this.N = z10;
                MessageAndFriendsActivity.V1(MessageAndFriendsActivity.this);
            }
            if (MessageAndFriendsActivity.this.N) {
                MessageAndFriendsActivity messageAndFriendsActivity = MessageAndFriendsActivity.this;
                OnlineStateObj result2 = t10.getResult();
                messageAndFriendsActivity.j2(com.max.hbutils.utils.n.q(result2 != null ? result2.getFriend_online_num() : null));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23711, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OnlineStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class c extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(MessageAndFriendsActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23713, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 1 || !MessageAndFriendsActivity.this.N) {
                return MessageCenterFragment.Q.b("2", null, null);
            }
            com.max.xiaoheihe.module.account.d.a aVar = com.max.xiaoheihe.module.account.d.f78906g;
            String str = MessageAndFriendsActivity.this.M;
            Intent intent = MessageAndFriendsActivity.this.getIntent();
            String stringExtra = intent != null ? intent.getStringExtra("key") : null;
            Intent intent2 = MessageAndFriendsActivity.this.getIntent();
            return aVar.a(str, stringExtra, intent2 != null ? intent2.getStringExtra("from") : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23712, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return MessageAndFriendsActivity.this.N ? 2 : 1;
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class d implements com.google.android.material.tabs.d.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.google.android.material.tabs.d.b
        public final void a(@dl.d TabLayout.h tab, int i10) {
            if (PatchProxy.proxy(new Object[]{tab, new Integer(i10)}, this, changeQuickRedirect, false, 23714, new Class[]{TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            if (i10 == 1 || !MessageAndFriendsActivity.this.N) {
                MessageAndFriendsActivity.O1(MessageAndFriendsActivity.this, tab);
            } else {
                MessageAndFriendsActivity.N1(MessageAndFriendsActivity.this, tab);
            }
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23715, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MessageAndFriendsActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23716, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.xiaoheihe.module.account.b().show(MessageAndFriendsActivity.this.getSupportFragmentManager(), "addFriend");
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23717, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.G(MessageAndFriendsActivity.this, 1));
        }
    }

    /* JADX INFO: compiled from: MessageAndFriendsActivity.kt */
    public static final class h implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23718, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            MessageAndFriendsActivity messageAndFriendsActivity = MessageAndFriendsActivity.this;
            View viewFindViewById = viewG.findViewById(R.id.tv_name);
            kotlin.jvm.internal.f0.o(viewFindViewById, "it.findViewById(R.id.tv_name)");
            TextView textView = (TextView) viewFindViewById;
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            n1 n1Var = messageAndFriendsActivity.L;
            if (n1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                n1Var = null;
            }
            if (kotlin.jvm.internal.f0.g(n1Var.f113588e.D(0), hVar)) {
                com.max.hbcache.c.C(com.max.hbcache.c.B0, "0");
                messageAndFriendsActivity.c2();
                messageAndFriendsActivity.sendBroadcast(new Intent(lb.a.f131055v));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23719, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            View viewFindViewById = viewG.findViewById(R.id.tv_name);
            kotlin.jvm.internal.f0.o(viewFindViewById, "it.findViewById(R.id.tv_name)");
            TextView textView = (TextView) viewFindViewById;
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    public static final /* synthetic */ void N1(MessageAndFriendsActivity messageAndFriendsActivity, TabLayout.h hVar) {
        if (PatchProxy.proxy(new Object[]{messageAndFriendsActivity, hVar}, null, changeQuickRedirect, true, 23705, new Class[]{MessageAndFriendsActivity.class, TabLayout.h.class}, Void.TYPE).isSupported) {
            return;
        }
        messageAndFriendsActivity.Y1(hVar);
    }

    public static final /* synthetic */ void O1(MessageAndFriendsActivity messageAndFriendsActivity, TabLayout.h hVar) {
        if (PatchProxy.proxy(new Object[]{messageAndFriendsActivity, hVar}, null, changeQuickRedirect, true, 23704, new Class[]{MessageAndFriendsActivity.class, TabLayout.h.class}, Void.TYPE).isSupported) {
            return;
        }
        messageAndFriendsActivity.Z1(hVar);
    }

    public static final /* synthetic */ void V1(MessageAndFriendsActivity messageAndFriendsActivity) {
        if (PatchProxy.proxy(new Object[]{messageAndFriendsActivity}, null, changeQuickRedirect, true, 23707, new Class[]{MessageAndFriendsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        messageAndFriendsActivity.f2();
    }

    public static final /* synthetic */ void X1(MessageAndFriendsActivity messageAndFriendsActivity) {
        if (PatchProxy.proxy(new Object[]{messageAndFriendsActivity}, null, changeQuickRedirect, true, 23706, new Class[]{MessageAndFriendsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        messageAndFriendsActivity.x1();
    }

    private final void Y1(TabLayout.h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23700, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.layout_friends_tab, (ViewGroup) null);
        hVar.v(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.tv_name)).setText("好友");
    }

    private final void Z1(TabLayout.h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23699, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.layout_friends_tab, (ViewGroup) null);
        hVar.v(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.tv_name)).setText("消息");
    }

    public static /* synthetic */ void b2(MessageAndFriendsActivity messageAndFriendsActivity, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{messageAndFriendsActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 23698, new Class[]{MessageAndFriendsActivity.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        messageAndFriendsActivity.a2(z10);
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23695, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n1 n1Var = this.L;
        n1 n1Var2 = null;
        if (n1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var = null;
        }
        n1Var.f113588e.L();
        n1 n1Var3 = this.L;
        if (n1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var3 = null;
        }
        n1Var3.f113588e.t();
        i2();
        n1 n1Var4 = this.L;
        if (n1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var4 = null;
        }
        n1Var4.f113589f.setAdapter(new c());
        n1 n1Var5 = this.L;
        if (n1Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var5 = null;
        }
        TabLayout tabLayout = n1Var5.f113588e;
        n1 n1Var6 = this.L;
        if (n1Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var6 = null;
        }
        new com.google.android.material.tabs.d(tabLayout, n1Var6.f113589f, new d()).a();
        if (!this.N) {
            n1 n1Var7 = this.L;
            if (n1Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                n1Var2 = n1Var7;
            }
            n1Var2.f113588e.setSelectedTabIndicatorColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
            return;
        }
        if (kotlin.jvm.internal.f0.g("friends", this.O)) {
            return;
        }
        n1 n1Var8 = this.L;
        if (n1Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            n1Var2 = n1Var8;
        }
        n1Var2.f113589f.setCurrentItem(1, false);
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23694, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n1 n1Var = this.L;
        n1 n1Var2 = null;
        if (n1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var = null;
        }
        n1Var.f113587d.setOnClickListener(new e());
        n1 n1Var3 = this.L;
        if (n1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var3 = null;
        }
        n1Var3.f113585b.setOnClickListener(new f());
        n1 n1Var4 = this.L;
        if (n1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            n1Var2 = n1Var4;
        }
        n1Var2.f113586c.setOnClickListener(new g());
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23696, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n1 n1Var = this.L;
        if (n1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var = null;
        }
        n1Var.f113588e.h(new h());
    }

    public final void a2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23697, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(z10)));
    }

    public final void c2() {
        View viewG;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23702, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n1 n1Var = this.L;
        if (n1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var = null;
        }
        TabLayout.h hVarD = n1Var.f113588e.D(0);
        if (hVarD == null || (viewG = hVarD.g()) == null) {
            return;
        }
        View viewFindViewById = viewG.findViewById(R.id.iv_red_point);
        kotlin.jvm.internal.f0.o(viewFindViewById, "customView.findViewById(R.id.iv_red_point)");
        ((ImageView) viewFindViewById).setVisibility(8);
    }

    public final boolean e2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23703, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.N) {
            n1 n1Var = this.L;
            if (n1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                n1Var = null;
            }
            if (n1Var.f113589f.getCurrentItem() != 1) {
                return false;
            }
        }
        return true;
    }

    public final void j2(int i10) {
        View viewG;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23701, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        n1 n1Var = this.L;
        if (n1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1Var = null;
        }
        TabLayout.h hVarD = n1Var.f113588e.D(0);
        if (hVarD == null || (viewG = hVarD.g()) == null) {
            return;
        }
        View viewFindViewById = viewG.findViewById(R.id.vg_online);
        kotlin.jvm.internal.f0.o(viewFindViewById, "customView.findViewById(R.id.vg_online)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewG.findViewById(R.id.tv_online_num);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "customView.findViewById(R.id.tv_online_num)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewG.findViewById(R.id.iv_red_point);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "customView.findViewById(R.id.iv_red_point)");
        ImageView imageView = (ImageView) viewFindViewById3;
        if (i10 <= 0) {
            viewGroup.setVisibility(8);
            imageView.setVisibility(com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.B0, "1")) ? 0 : 8);
        } else {
            textView.setText(String.valueOf(i10));
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23692, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        n1 n1VarC = n1.c(this.f66602c);
        kotlin.jvm.internal.f0.o(n1VarC, "inflate(mInflater)");
        this.L = n1VarC;
        if (n1VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            n1VarC = null;
        }
        setContentView(n1VarC.b());
        Intent intent = getIntent();
        if (intent != null) {
            this.O = intent.getStringExtra(S);
            this.M = intent.getStringExtra("userid");
        }
        h2();
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver();
        this.P = userProfileUpdatedBroadcastReceiver;
        t1(userProfileUpdatedBroadcastReceiver, lb.a.f130960f0);
        E1();
        a2(true);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23693, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        unregisterReceiver(this.P);
    }
}
