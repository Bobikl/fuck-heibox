package com.max.xiaoheihe.module.account.manageraccount;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.base.mvvm.BaseActivity;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.gq;
import df.k1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ManagerAccountListActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nManagerAccountListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerAccountListActivity.kt\ncom/max/xiaoheihe/module/account/manageraccount/ManagerAccountListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n262#2,2:165\n262#2,2:167\n*S KotlinDebug\n*F\n+ 1 ManagerAccountListActivity.kt\ncom/max/xiaoheihe/module/account/manageraccount/ManagerAccountListActivity\n*L\n81#1:165,2\n88#1:167,2\n*E\n"})
@o(parameters = 0)
public final class ManagerAccountListActivity extends BaseActivity<ManagerAccountListVM> {
    public static final int E = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public k1 C;

    @dl.d
    private final Handler D = new b(Looper.getMainLooper());

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    @t0({"SMAP\nManagerAccountListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerAccountListActivity.kt\ncom/max/xiaoheihe/module/account/manageraccount/ManagerAccountListActivity$AccountAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n262#2,2:165\n262#2,2:167\n262#2,2:169\n262#2,2:171\n*S KotlinDebug\n*F\n+ 1 ManagerAccountListActivity.kt\ncom/max/xiaoheihe/module/account/manageraccount/ManagerAccountListActivity$AccountAdapter\n*L\n111#1:165,2\n114#1:167,2\n121#1:169,2\n152#1:171,2\n*E\n"})
    public final class a extends s<User> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.manageraccount.ManagerAccountListActivity$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
        public static final class ViewOnClickListenerC0654a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ManagerAccountListActivity f78990b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ User f78991c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f78992d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ s.e f78993e;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.manageraccount.ManagerAccountListActivity$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
            public static final class DialogInterfaceOnClickListenerC0655a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ User f78994b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ManagerAccountListActivity f78995c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f78996d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ s.e f78997e;

                DialogInterfaceOnClickListenerC0655a(User user, ManagerAccountListActivity managerAccountListActivity, a aVar, s.e eVar) {
                    this.f78994b = user;
                    this.f78995c = managerAccountListActivity;
                    this.f78996d = aVar;
                    this.f78997e = eVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24989, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    com.max.xiaoheihe.module.account.accelworld.a.g(this.f78994b);
                    ManagerAccountListActivity.J1(this.f78995c).r();
                    if (ManagerAccountListActivity.J1(this.f78995c).p().isEmpty()) {
                        this.f78995c.startActivity(new Intent(this.f78995c, (Class<?>) MainActivity.class));
                    } else {
                        this.f78996d.notifyItemRemoved(this.f78997e.getAbsoluteAdapterPosition());
                    }
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.manageraccount.ManagerAccountListActivity$a$a$b */
            /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f78998b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24990, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            ViewOnClickListenerC0654a(ManagerAccountListActivity managerAccountListActivity, User user, a aVar, s.e eVar) {
                this.f78990b = managerAccountListActivity;
                this.f78991c = user;
                this.f78992d = aVar;
                this.f78993e = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24988, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String str = "移除代表 清除 ";
                com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(this.f78990b).y("确定移除该账号？");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "该账号在本设备中的登录记录");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), 5, str.length(), 33);
                fVarY.l(spannableStringBuilder).u("确定移除", new DialogInterfaceOnClickListenerC0655a(this.f78991c, this.f78990b, this.f78992d, this.f78993e)).o("暂不移除", b.f78998b).F();
            }
        }

        /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f78999b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f79000b = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
        public static final class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ManagerAccountListActivity f79001b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ User f79002c;

            d(ManagerAccountListActivity managerAccountListActivity, User user) {
                this.f79001b = managerAccountListActivity;
                this.f79002c = user;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24991, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.account.accelworld.a.j(this.f79001b, this.f79002c);
            }
        }

        public a() {
            super(ManagerAccountListActivity.this, ManagerAccountListActivity.J1(ManagerAccountListActivity.this).p(), R.layout.item_manager_account);
        }

        public void m(@dl.e s.e eVar, @dl.e User user) {
            AccountDetailObj account_detail;
            if (PatchProxy.proxy(new Object[]{eVar, user}, this, changeQuickRedirect, false, 24986, new Class[]{s.e.class, User.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            ManagerAccountListActivity managerAccountListActivity = ManagerAccountListActivity.this;
            if (user == null || (account_detail = user.getAccount_detail()) == null) {
                return;
            }
            gq gqVarA = gq.a(eVar.itemView);
            gqVarA.f111075b.setAvatar(account_detail.getAvartar(), account_detail.getAvatar_decoration());
            gqVarA.f111079f.setText(account_detail.getUsername());
            gqVarA.f111078e.setText("ID:" + account_detail.getUserid());
            gqVarA.b().setAlpha(1.0f);
            View root = gqVarA.f111076c.getRoot();
            f0.o(root, "divider.root");
            root.setVisibility(eVar.getAbsoluteAdapterPosition() != ManagerAccountListActivity.J1(managerAccountListActivity).p().size() - 1 ? 0 : 8);
            boolean zQ = i0.q(account_detail.getUserid());
            ImageView imageView = gqVarA.f111077d;
            f0.o(imageView, "onBindViewHolder$lambda$…ambda$4$lambda$3$lambda$0");
            imageView.setVisibility(zQ ? 0 : 8);
            imageView.setColorFilter(l.h(managerAccountListActivity, R.color.background_layer_2_color));
            l.q(imageView, R.color.text_primary_1_color, 8.0f);
            if (f0.g(ManagerAccountListActivity.J1(managerAccountListActivity).s().f(), Boolean.FALSE)) {
                TextView textView = gqVarA.f111080g;
                f0.o(textView, "onBindViewHolder$lambda$…ambda$4$lambda$3$lambda$2");
                textView.setVisibility(8);
                textView.setOnClickListener(c.f79000b);
                gqVarA.b().setOnClickListener(new d(managerAccountListActivity, user));
                return;
            }
            TextView textView2 = gqVarA.f111080g;
            l.q(textView2, R.color.background_card_1_color, 3.0f);
            f0.o(textView2, "onBindViewHolder$lambda$…ambda$4$lambda$3$lambda$1");
            textView2.setVisibility(zQ ^ true ? 0 : 8);
            textView2.setOnClickListener(new ViewOnClickListenerC0654a(managerAccountListActivity, user, this, eVar));
            if (zQ) {
                gqVarA.b().setAlpha(0.5f);
            }
            gqVarA.b().setOnClickListener(b.f78999b);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, User user) {
            if (PatchProxy.proxy(new Object[]{eVar, user}, this, changeQuickRedirect, false, 24987, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, user);
        }
    }

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 24992, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
        }
    }

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24993, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ManagerAccountListActivity managerAccountListActivity = ManagerAccountListActivity.this;
            managerAccountListActivity.startActivity(RegisterOrLoginActivityV2.Y2(managerAccountListActivity, true));
        }
    }

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24994, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ManagerAccountListActivity.J1(ManagerAccountListActivity.this).s().r(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24995, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ManagerAccountListActivity.J1(ManagerAccountListActivity.this).s().r(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: ManagerAccountListActivity.kt */
    public static final class f implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 24997, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 24996, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            ManagerAccountListActivity.K1(ManagerAccountListActivity.this);
        }
    }

    public static final /* synthetic */ ManagerAccountListVM J1(ManagerAccountListActivity managerAccountListActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{managerAccountListActivity}, null, changeQuickRedirect, true, 24985, new Class[]{ManagerAccountListActivity.class}, ManagerAccountListVM.class);
        return patchProxyResultProxy.isSupported ? (ManagerAccountListVM) patchProxyResultProxy.result : managerAccountListActivity.i1();
    }

    public static final /* synthetic */ void K1(ManagerAccountListActivity managerAccountListActivity) {
        if (PatchProxy.proxy(new Object[]{managerAccountListActivity}, null, changeQuickRedirect, true, 24984, new Class[]{ManagerAccountListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        managerAccountListActivity.M1();
    }

    private final void M1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24982, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TitleBar titleBarG1 = g1();
        titleBarG1.O();
        titleBarG1.P();
        if (f0.g(i1().s().f(), Boolean.TRUE)) {
            titleBarG1.setTitle("管理账号");
            titleBarG1.setAction("取消");
            titleBarG1.setActionOnClickListener(new d());
            LinearLayout linearLayout = L1().f112371d;
            f0.o(linearLayout, "binding.vgAddAccount");
            linearLayout.setVisibility(8);
        } else {
            titleBarG1.setTitle("切换账号");
            titleBarG1.setAction("管理");
            titleBarG1.setActionOnClickListener(new e());
            LinearLayout linearLayout2 = L1().f112371d;
            f0.o(linearLayout2, "binding.vgAddAccount");
            linearLayout2.setVisibility(com.max.xiaoheihe.module.account.accelworld.a.e().size() < com.max.xiaoheihe.module.account.accelworld.a.f() ? 0 : 8);
        }
        RecyclerView.Adapter adapter = L1().f112370c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @dl.d
    public final k1 L1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24977, new Class[0], k1.class);
        if (patchProxyResultProxy.isSupported) {
            return (k1) patchProxyResultProxy.result;
        }
        k1 k1Var = this.C;
        if (k1Var != null) {
            return k1Var;
        }
        f0.S("binding");
        return null;
    }

    public final void N1(@dl.d k1 k1Var) {
        if (PatchProxy.proxy(new Object[]{k1Var}, this, changeQuickRedirect, false, 24978, new Class[]{k1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(k1Var, "<set-?>");
        this.C = k1Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    @dl.d
    public Handler V0() {
        return this.D;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24979, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k1 k1VarC = k1.c(LayoutInflater.from(this));
        f0.o(k1VarC, "inflate(LayoutInflater.from(this))");
        N1(k1VarC);
        A1(L1());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24980, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g1().setInStack();
        RecyclerView recyclerView = L1().f112370c;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new a());
        ImageView imageView = L1().f112369b;
        imageView.setColorFilter(l.h(this, R.color.text_secondary_2_color));
        l.q(imageView, R.color.background_card_1_color, 21.0f);
        L1().f112371d.setOnClickListener(new c());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24983, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (f0.g(i1().s().f(), Boolean.TRUE)) {
            i1().s().r(Boolean.FALSE);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void t1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24981, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i1().r();
        RecyclerView.Adapter adapter = L1().f112370c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        i1().s().k(this, new f());
        M1();
    }
}
