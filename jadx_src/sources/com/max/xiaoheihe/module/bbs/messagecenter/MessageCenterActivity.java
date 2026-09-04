package com.max.xiaoheihe.module.bbs.messagecenter;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseActivity;
import com.max.xiaoheihe.router.interceptors.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ia0;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: MessageCenterActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nMessageCenterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterActivity.kt\ncom/max/xiaoheihe/module/bbs/messagecenter/MessageCenterActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,242:1\n75#2,13:243\n*S KotlinDebug\n*F\n+ 1 MessageCenterActivity.kt\ncom/max/xiaoheihe/module/bbs/messagecenter/MessageCenterActivity\n*L\n51#1:243,13\n*E\n"})
@ig.d(interceptors = {k.class}, path = {lb.d.R4, lb.d.f131300z4, lb.d.A4, lb.d.C4, lb.d.D4, lb.d.G4})
@o(parameters = 0)
public final class MessageCenterActivity extends BaseActivity<MessageCenterViewModel> {

    @dl.d
    public static final a H = new a(null);
    public static final int I = 8;
    public static final int J = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    public ia0 C;

    @dl.d
    private final z D;
    private androidx.viewpager.widget.a F;

    @dl.d
    private final ArrayList<Fragment> E = new ArrayList<>();

    @dl.d
    private final Handler G = new b(Looper.getMainLooper());

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 28232, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (msg.what == 0) {
                MessageCenterActivity.this.T1().clear();
                MessageCenterActivity.this.T1().add(MessageCenterFragment.Q.b(MessageCenterActivity.L1(MessageCenterActivity.this).p().f(), MessageCenterActivity.L1(MessageCenterActivity.this).r().f(), MessageCenterActivity.L1(MessageCenterActivity.this).t().f()));
                androidx.viewpager.widget.a aVar = MessageCenterActivity.this.F;
                if (aVar == null) {
                    f0.S("mPagerAdapter");
                    aVar = null;
                }
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28234, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : MessageCenterActivity.this.T1().size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28233, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Fragment fragment = MessageCenterActivity.this.T1().get(i10);
            f0.o(fragment, "fragmentList[position]");
            return fragment;
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28235, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.G(MessageCenterActivity.this, 1));
            MessageCenterActivity.M1(MessageCenterActivity.this).c().r(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28236, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(MessageCenterActivity.this, lb.d.X4);
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class f implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28238, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28237, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
                return;
            }
            MessageCenterActivity messageCenterActivity = MessageCenterActivity.this;
            MessageCenterActivity.O1(messageCenterActivity, str);
            messageCenterActivity.V0().removeMessages(0);
            messageCenterActivity.V0().sendEmptyMessage(0);
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class g implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28240, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28239, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
                return;
            }
            MessageCenterActivity messageCenterActivity = MessageCenterActivity.this;
            MessageCenterActivity.N1(messageCenterActivity, str);
            messageCenterActivity.V0().removeMessages(0);
            messageCenterActivity.V0().sendEmptyMessage(0);
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class h implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28242, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28241, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
                return;
            }
            MessageCenterActivity messageCenterActivity = MessageCenterActivity.this;
            messageCenterActivity.V0().removeMessages(0);
            messageCenterActivity.V0().sendEmptyMessage(0);
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class i implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28244, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28243, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.o(it, "it");
            if (it.booleanValue()) {
                Log.d("cqtest", "show red dot");
                MessageCenterActivity.K1(MessageCenterActivity.this).Y();
            } else {
                MessageCenterActivity.K1(MessageCenterActivity.this).T();
                Log.d("cqtest", "hide red dot");
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterActivity.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28245, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.B0(MessageCenterActivity.this);
            dialogInterface.dismiss();
        }
    }

    public MessageCenterActivity() {
        final yh.a aVar = null;
        this.D = new ViewModelLazy(kotlin.jvm.internal.n0.d(com.max.xiaoheihe.module.bbs.messagecenter.a.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28248, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.getViewModelStore();
                f0.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28249, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28246, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28247, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28251, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28250, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final /* synthetic */ TitleBar K1(MessageCenterActivity messageCenterActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterActivity}, null, changeQuickRedirect, true, 28229, new Class[]{MessageCenterActivity.class}, TitleBar.class);
        return patchProxyResultProxy.isSupported ? (TitleBar) patchProxyResultProxy.result : messageCenterActivity.g1();
    }

    public static final /* synthetic */ MessageCenterViewModel L1(MessageCenterActivity messageCenterActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterActivity}, null, changeQuickRedirect, true, 28231, new Class[]{MessageCenterActivity.class}, MessageCenterViewModel.class);
        return patchProxyResultProxy.isSupported ? (MessageCenterViewModel) patchProxyResultProxy.result : messageCenterActivity.i1();
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.bbs.messagecenter.a M1(MessageCenterActivity messageCenterActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterActivity}, null, changeQuickRedirect, true, 28230, new Class[]{MessageCenterActivity.class}, com.max.xiaoheihe.module.bbs.messagecenter.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.bbs.messagecenter.a) patchProxyResultProxy.result : messageCenterActivity.V1();
    }

    public static final /* synthetic */ void N1(MessageCenterActivity messageCenterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{messageCenterActivity, str}, null, changeQuickRedirect, true, 28228, new Class[]{MessageCenterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterActivity.X1(str);
    }

    public static final /* synthetic */ void O1(MessageCenterActivity messageCenterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{messageCenterActivity, str}, null, changeQuickRedirect, true, 28227, new Class[]{MessageCenterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterActivity.Y1(str);
    }

    private final void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28221, new Class[0], Void.TYPE).isSupported || com.max.xiaoheihe.utils.d.N0(this)) {
            return;
        }
        int iQ = n.q(com.max.hbcache.c.j("user_msg_enter_count")) + 1;
        com.max.hbcache.c.z("user_msg_enter_count", iQ + "");
        com.max.hbcommon.utils.d.b("zzzzpushopen", "count==" + iQ);
        if (iQ == 1 || iQ == 10 || iQ == 100) {
            a2();
        }
    }

    private final com.max.xiaoheihe.module.bbs.messagecenter.a V1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28218, new Class[0], com.max.xiaoheihe.module.bbs.messagecenter.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.bbs.messagecenter.a) patchProxyResultProxy.result : (com.max.xiaoheihe.module.bbs.messagecenter.a) this.D.getValue();
    }

    private final void X1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28225, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 52) {
                if (iHashCode != 1573) {
                    if (iHashCode != 56) {
                        if (iHashCode == 57 && str.equals("9")) {
                            g1().setTitle(R.string.friends_invite);
                            return;
                        }
                    } else if (str.equals("8")) {
                        g1().setTitle(R.string.game_discount);
                        i1().v("2");
                        return;
                    }
                } else if (str.equals("16")) {
                    g1().setTitle(R.string.at_me);
                    return;
                }
            } else if (str.equals("4")) {
                g1().setTitle(R.string.follow_message);
                return;
            }
        }
        g1().setTitle(R.string.message_center);
        g1().setActionIcon(R.drawable.common_service);
        g1().setActionIconOnClickListener(new d());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void Y1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28224, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 57) {
                switch (iHashCode) {
                    case 48:
                        if (str.equals("0")) {
                            g1().setTitle(R.string.all_comments);
                            return;
                        }
                        break;
                    case 49:
                        if (str.equals("1")) {
                            g1().setTitle(R.string.award);
                            return;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            X1(i1().r().f());
                            return;
                        }
                        break;
                }
            } else if (str.equals("9")) {
                g1().setTitle(R.string.stranger_msg);
                g1().setActionIcon(R.drawable.common_more);
                g1().setActionIconOnClickListener(new e());
                return;
            }
        }
        g1().setTitle(R.string.my_msg);
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_open_push, (ViewGroup) null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        new com.max.hbcommon.view.a.f(this).i(viewGroup).g(false).w(true).u("开启推送", new j()).d().show();
    }

    @dl.d
    public final ia0 R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28216, new Class[0], ia0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ia0) patchProxyResultProxy.result;
        }
        ia0 ia0Var = this.C;
        if (ia0Var != null) {
            return ia0Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final ArrayList<Fragment> T1() {
        return this.E;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    @dl.d
    public Handler V0() {
        return this.G;
    }

    public final boolean W1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28226, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g("2", i1().p().f()) && com.max.hbcommon.utils.c.u(i1().r().f());
    }

    public final void Z1(@dl.d ia0 ia0Var) {
        if (PatchProxy.proxy(new Object[]{ia0Var}, this, changeQuickRedirect, false, 28217, new Class[]{ia0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ia0Var, "<set-?>");
        this.C = ia0Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28219, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ia0 ia0VarC = ia0.c(LayoutInflater.from(this));
        f0.o(ia0VarC, "inflate(LayoutInflater.from(this))");
        Z1(ia0VarC);
        A1(R1());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i1().o(getIntent());
        this.F = new c(getSupportFragmentManager());
        ViewPagerFixed viewPagerFixed = R1().f111722b;
        androidx.viewpager.widget.a aVar = this.F;
        if (aVar == null) {
            f0.S("mPagerAdapter");
            aVar = null;
        }
        viewPagerFixed.setAdapter(aVar);
        h1().setVisibility(0);
        if (f0.g(i1().u().f(), Boolean.TRUE) && R1().f111722b.getAdapter() != null) {
            androidx.viewpager.widget.a adapter = R1().f111722b.getAdapter();
            f0.m(adapter);
            if (adapter.getCount() > 1) {
                R1().f111722b.setCurrentItem(1);
            }
        }
        Q1();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void t1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28223, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i1().p().k(this, new f());
        i1().r().k(this, new g());
        i1().t().k(this, new h());
        V1().c().k(this, new i());
    }
}
