package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.bean.proxy.ProxyListObj;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.vt;
import df.z4;
import java.util.List;

/* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c2 extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f86546n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f86547o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f86548p = "proxy_list_info";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z4 f86549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private ProxyListObj f86550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private ProxyManager f86551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private b f86552m;

    /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final c2 a(@dl.d ProxyListObj proxyListInfo, @dl.e ProxyManager proxyManager) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyListInfo, proxyManager}, this, changeQuickRedirect, false, 35228, new Class[]{ProxyListObj.class, ProxyManager.class}, c2.class);
            if (patchProxyResultProxy.isSupported) {
                return (c2) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(proxyListInfo, "proxyListInfo");
            c2 c2Var = new c2();
            Bundle bundle = new Bundle();
            bundle.putSerializable(c2.f86548p, proxyListInfo);
            c2Var.setArguments(bundle);
            c2Var.b4(proxyManager);
            return c2Var;
        }
    }

    /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nSwitchProxyLineDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchProxyLineDialogFragment.kt\ncom/max/xiaoheihe/module/game/SwitchProxyLineDialogFragment$ProxyLineSelectAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,195:1\n262#2,2:196\n262#2,2:198\n262#2,2:200\n*S KotlinDebug\n*F\n+ 1 SwitchProxyLineDialogFragment.kt\ncom/max/xiaoheihe/module/game/SwitchProxyLineDialogFragment$ProxyLineSelectAdapter\n*L\n156#1:196,2\n159#1:198,2\n162#1:200,2\n*E\n"})
    public final class b extends com.max.hbcommon.base.adapter.s<ProxyItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Context f86553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private ProxyItemObj f86554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c2 f86555d;

        /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProxyItemObj f86557c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c2 f86558d;

            a(ProxyItemObj proxyItemObj, c2 c2Var) {
                this.f86557c = proxyItemObj;
                this.f86558d = c2Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35231, new Class[]{View.class}, Void.TYPE).isSupported || kotlin.jvm.internal.f0.g(b.this.n(), this.f86557c)) {
                    return;
                }
                ProxyItemObj proxyItemObjN = b.this.n();
                b.this.p(this.f86557c);
                int iIndexOf = b.this.getDataList().indexOf(proxyItemObjN);
                if (iIndexOf >= 0 && iIndexOf < b.this.getDataList().size()) {
                    b.this.notifyItemChanged(iIndexOf);
                }
                b bVar = b.this;
                bVar.notifyItemChanged(bVar.getDataList().indexOf(b.this.n()));
                BaseBottomButton rightbutton = this.f86558d.X3().f118201g.getRightbutton();
                if (rightbutton != null) {
                    rightbutton.setEnabled(true);
                    rightbutton.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d c2 c2Var, @dl.d Context context, List<ProxyItemObj> list) {
            super(context, list, R.layout.item_proxy_line_select);
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(list, "list");
            this.f86555d = c2Var;
            this.f86553b = context;
        }

        @dl.d
        public final Context m() {
            return this.f86553b;
        }

        @dl.e
        public final ProxyItemObj n() {
            return this.f86554c;
        }

        public void o(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e ProxyItemObj proxyItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, proxyItemObj}, this, changeQuickRedirect, false, 35229, new Class[]{com.max.hbcommon.base.adapter.s.e.class, ProxyItemObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            c2 c2Var = this.f86555d;
            vt vtVarA = vt.a(eVar.itemView);
            if (proxyItemObj != null) {
                vtVarA.f116933c.setText(proxyItemObj.getValue());
                ProxyManager proxyManager = c2Var.f86551l;
                if (kotlin.jvm.internal.f0.g(proxyItemObj, proxyManager != null ? proxyManager.g() : null)) {
                    TextView tvDesc = vtVarA.f116932b;
                    kotlin.jvm.internal.f0.o(tvDesc, "tvDesc");
                    tvDesc.setVisibility(0);
                    vtVarA.f116932b.setText("刚刚尝试");
                } else if (kotlin.jvm.internal.f0.g(proxyItemObj.getKey(), ProxyManager.ProxyType.acc.getKey())) {
                    TextView tvDesc2 = vtVarA.f116932b;
                    kotlin.jvm.internal.f0.o(tvDesc2, "tvDesc");
                    tvDesc2.setVisibility(0);
                    vtVarA.f116932b.setText("需要开启加速器");
                } else {
                    TextView tvDesc3 = vtVarA.f116932b;
                    kotlin.jvm.internal.f0.o(tvDesc3, "tvDesc");
                    tvDesc3.setVisibility(8);
                }
                if (kotlin.jvm.internal.f0.g(this.f86554c, proxyItemObj)) {
                    vtVarA.b().setBackground(ViewUtils.i(com.max.xiaoheihe.accelworld.l.c(5.0f, this.f86553b), com.max.xiaoheihe.accelworld.l.h(this.f86553b, R.color.icon_gradient_dark_start_color), com.max.xiaoheihe.accelworld.l.h(this.f86553b, R.color.icon_gradient_dark_end_color)));
                    vtVarA.f116933c.setTextColor(com.max.xiaoheihe.accelworld.l.h(this.f86553b, R.color.background_layer_2_color));
                } else {
                    com.max.xiaoheihe.accelworld.l.s(vtVarA.b(), com.max.xiaoheihe.accelworld.l.h(this.f86553b, R.color.divider_secondary_2_color), 5.0f);
                    TextView textView = vtVarA.f116933c;
                    Context context = this.f86553b;
                    ProxyManager proxyManager2 = c2Var.f86551l;
                    textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(context, kotlin.jvm.internal.f0.g(proxyManager2 != null ? proxyManager2.g() : null, proxyItemObj) ? R.color.text_secondary_1_color : R.color.text_primary_1_color));
                }
                vtVarA.b().setOnClickListener(new a(proxyItemObj, c2Var));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, ProxyItemObj proxyItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, proxyItemObj}, this, changeQuickRedirect, false, 35230, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, proxyItemObj);
        }

        public final void p(@dl.e ProxyItemObj proxyItemObj) {
            this.f86554c = proxyItemObj;
        }
    }

    /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35232, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c2.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35233, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ProxyManager proxyManager = c2.this.f86551l;
            if (proxyManager != null) {
                b bVar = c2.this.f86552m;
                proxyManager.p(bVar != null ? bVar.n() : null);
            }
            c2.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SwitchProxyLineDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinearLayout f86561b;

        e(LinearLayout linearLayout) {
            this.f86561b = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35234, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f86561b.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.j0(context, lb.a.I4);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35226, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z4 z4VarX3 = X3();
        ProxyListObj proxyListObj = this.f86550k;
        if (proxyListObj != null) {
            com.max.hbimage.b.K(proxyListObj.getIcon_url(), z4VarX3.f118196b);
            z4VarX3.f118200f.setText(proxyListObj.getTitle());
            z4VarX3.f118199e.setText(proxyListObj.getDesc());
            LinearLayout linearLayout = new LinearLayout(getContext());
            Context context = linearLayout.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(com.max.xiaoheihe.accelworld.l.c(44.0f, context), -2);
            Context context2 = linearLayout.getContext();
            kotlin.jvm.internal.f0.o(context2, "context");
            marginLayoutParams.rightMargin = com.max.xiaoheihe.accelworld.l.c(12.0f, context2);
            linearLayout.setLayoutParams(marginLayoutParams);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setOnClickListener(new e(linearLayout));
            ImageView imageView = new ImageView(getContext());
            Context context3 = imageView.getContext();
            kotlin.jvm.internal.f0.o(context3, "context");
            int iC = com.max.xiaoheihe.accelworld.l.c(20.0f, context3);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(iC, iC));
            imageView.setImageResource(R.drawable.common_help_line_24x24);
            com.max.xiaoheihe.accelworld.c.c(imageView, com.max.xiaoheihe.accelworld.l.h(imageView.getContext(), R.color.text_secondary_1_color));
            linearLayout.addView(imageView);
            TextView textView = new TextView(getContext());
            textView.setText(R.string.help);
            textView.setTextSize(1, 10.0f);
            textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.text_secondary_1_color));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            Context context4 = textView.getContext();
            kotlin.jvm.internal.f0.o(context4, "context");
            layoutParams.topMargin = com.max.xiaoheihe.accelworld.l.c(2.0f, context4);
            textView.setLayoutParams(layoutParams);
            linearLayout.addView(textView);
            z4VarX3.f118201g.b(linearLayout);
            BottomButtonLeftItemView bottomButtonLeftItemView = z4VarX3.f118201g;
            BaseBottomButton rightbutton = bottomButtonLeftItemView.getRightbutton();
            if (rightbutton != null) {
                rightbutton.setEnabled(false);
            }
            BaseBottomButton rightbutton2 = bottomButtonLeftItemView.getRightbutton();
            if (rightbutton2 != null) {
                rightbutton2.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayGray);
            }
            bottomButtonLeftItemView.setLeftClickListener(new c());
            bottomButtonLeftItemView.setRightClickListener(new d());
            RecyclerView recyclerView = z4VarX3.f118198d;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            List<ProxyItemObj> lines = proxyListObj.getLines();
            if (lines != null) {
                Context context5 = recyclerView.getContext();
                kotlin.jvm.internal.f0.o(context5, "context");
                b bVar = new b(this, context5, lines);
                this.f86552m = bVar;
                recyclerView.setAdapter(bVar);
            }
        }
    }

    @dl.d
    @xh.m
    public static final c2 Z3(@dl.d ProxyListObj proxyListObj, @dl.e ProxyManager proxyManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyListObj, proxyManager}, null, changeQuickRedirect, true, 35227, new Class[]{ProxyListObj.class, ProxyManager.class}, c2.class);
        return patchProxyResultProxy.isSupported ? (c2) patchProxyResultProxy.result : f86546n.a(proxyListObj, proxyManager);
    }

    @dl.d
    public final z4 X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35222, new Class[0], z4.class);
        if (patchProxyResultProxy.isSupported) {
            return (z4) patchProxyResultProxy.result;
        }
        z4 z4Var = this.f86549j;
        if (z4Var != null) {
            return z4Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final void a4(@dl.d z4 z4Var) {
        if (PatchProxy.proxy(new Object[]{z4Var}, this, changeQuickRedirect, false, 35223, new Class[]{z4.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(z4Var, "<set-?>");
        this.f86549j = z4Var;
    }

    public final void b4(@dl.e ProxyManager proxyManager) {
        this.f86551l = proxyManager;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 35224, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        z4 z4VarC = z4.c(inflater);
        kotlin.jvm.internal.f0.o(z4VarC, "inflate(inflater)");
        a4(z4VarC);
        X3().f118197c.setBackground(com.max.hbutils.utils.q.E(getContext(), R.color.background_layer_2_color, 8.0f));
        return X3().b();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 35225, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f86550k = Build.VERSION.SDK_INT >= 33 ? (ProxyListObj) arguments.getSerializable(f86548p, ProxyListObj.class) : (ProxyListObj) arguments.getSerializable(f86548p);
        }
        if (this.f86550k == null) {
            dismiss();
        } else {
            Y3();
        }
    }
}
