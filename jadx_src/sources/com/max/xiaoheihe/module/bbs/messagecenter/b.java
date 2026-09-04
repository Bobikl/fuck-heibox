package com.max.xiaoheihe.module.bbs.messagecenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseFragment;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.max.xiaoheihe.module.bbs.UserNotifyListActivity;
import com.max.xiaoheihe.module.game.adapter.v;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import mb.b1;
import ng.j;

/* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@m(path = lb.d.H4)
@o(parameters = 0)
public final class b extends BaseFragment<OfficialNotifyListFragmentVM> {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final Handler L = new Handler(Looper.getMainLooper());

    @dl.e
    private b1 M;
    public RecyclerView N;
    public SmartRefreshLayout O;
    public s<BBSUserNotifyObj> P;

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final b a(@dl.e String str, @dl.e String str2, @dl.e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28402, new Class[]{String.class, String.class, String.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("list_type", str);
            bundle.putString("name", str2);
            bundle.putString(UserNotifyListActivity.O, str3);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class C0698b extends s<BBSUserNotifyObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.b$b$a */
        /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ImageView f81355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSUserNotifyObj f81356c;

            a(ImageView imageView, BBSUserNotifyObj bBSUserNotifyObj) {
                this.f81355b = imageView;
                this.f81356c = bBSUserNotifyObj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28405, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f81355b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                }
                layoutParams.height = (ViewUtils.W(this.f81355b) * 165) / bb.c.b.N3;
                this.f81355b.setLayoutParams(layoutParams);
                this.f81355b.invalidate();
                com.max.hbimage.b.L(this.f81356c.getThumb(), this.f81355b, R.drawable.common_default_placeholder_375x210);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
        @t0({"SMAP\nOfficialNotifyListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfficialNotifyListFragment.kt\ncom/max/xiaoheihe/module/bbs/messagecenter/OfficialNotifyListFragment$initAdapter$1$onBindViewHolder$1$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
        public static final class ViewOnClickListenerC0699b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserNotifyObj f81357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f81358c;

            ViewOnClickListenerC0699b(BBSUserNotifyObj bBSUserNotifyObj, b bVar) {
                this.f81357b = bBSUserNotifyObj;
                this.f81358c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28406, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                JsonObject reportAddition = this.f81357b.getReportAddition();
                String strX = b.t4(this.f81358c).x();
                if (strX != null) {
                    reportAddition.addProperty(UserNotifyListActivity.O, strX);
                }
                b2 b2Var = b2.f124493a;
                com.max.hbcommon.analytics.d.d("4", lb.d.I4, null, reportAddition);
                if (!com.max.hbcommon.utils.c.u(this.f81357b.getMaxjia())) {
                    Context context2 = this.f81358c.getContext();
                    if (context2 != null) {
                        com.max.xiaoheihe.base.router.b.k0(context2, this.f81357b.getMaxjia());
                        return;
                    }
                    return;
                }
                if (kotlin.text.u.L1("link", this.f81357b.getObj_type(), true)) {
                    com.max.xiaoheihe.module.bbs.utils.b.F(this.f81358c.getContext(), this.f81357b.getH_src(), this.f81357b.getObj_id(), this.f81357b.getLink_tag(), this.f81357b.getHas_video(), null);
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f81357b.getObj_content())) {
                    if (!kotlin.text.u.L1(SwitchDetailActivity.P, this.f81357b.getObj_type(), true) || (context = this.f81358c.getContext()) == null) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.k0(context, this.f81357b.getProtocol());
                    return;
                }
                Intent intent = new Intent(this.f81358c.getContext(), (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", this.f81357b.getObj_content());
                intent.putExtra("title", this.f81357b.getTitle());
                Context context3 = this.f81358c.getContext();
                if (context3 != null) {
                    context3.startActivity(intent);
                }
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.b$b$c */
        /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f81359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSUserNotifyObj f81360c;

            c(b bVar, BBSUserNotifyObj bBSUserNotifyObj) {
                this.f81359b = bVar;
                this.f81360c = bBSUserNotifyObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28407, new Class[]{View.class}, Void.TYPE).isSupported || (context = this.f81359b.getContext()) == null) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(context, this.f81360c.getUser_protocol());
            }
        }

        C0698b(Context context, ArrayList<BBSUserNotifyObj> arrayList) {
            super(context, arrayList, R.layout.item_official_message_v2);
        }

        public void m(@dl.e s.e eVar, @dl.e BBSUserNotifyObj bBSUserNotifyObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 28403, new Class[]{s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported || bBSUserNotifyObj == null) {
                return;
            }
            b bVar = b.this;
            if (eVar != null) {
                ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
                CardView cardView = (CardView) eVar.i(R.id.cv_content);
                TextView textView = (TextView) eVar.i(R.id.tv_title);
                TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
                View viewI = eVar.i(R.id.vg_text);
                ImageView imageView2 = (ImageView) eVar.i(R.id.iv_mid_img);
                View viewI2 = eVar.i(R.id.vg_user_info);
                Context context = bVar.getContext();
                int iL = ViewUtils.L(bVar.getContext());
                int iF = ViewUtils.f(bVar.getContext(), 165.0f);
                ViewUtils.ViewType viewType = ViewUtils.ViewType.IMAGE;
                cardView.setRadius(ViewUtils.n(context, iL, iF, viewType));
                if (f0.g("2", bBSUserNotifyObj.getThumb_size())) {
                    imageView.setVisibility(0);
                    imageView.post(new a(imageView, bBSUserNotifyObj));
                    imageView2.setVisibility(8);
                } else {
                    imageView.setVisibility(8);
                    if (com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getThumb())) {
                        imageView2.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(ViewUtils.f(bVar.getContext(), 12.0f));
                        viewI.requestLayout();
                    } else {
                        imageView2.setVisibility(0);
                        ViewGroup.LayoutParams layoutParams2 = viewI.getLayoutParams();
                        f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        ((LinearLayout.LayoutParams) layoutParams2).setMarginEnd(ViewUtils.f(bVar.getContext(), 10.0f));
                        viewI.requestLayout();
                        com.max.hbimage.b.e0(bBSUserNotifyObj.getThumb(), imageView2, ViewUtils.p(bVar.getContext(), imageView2, viewType), R.drawable.common_default_placeholder_375x210);
                    }
                }
                textView.setText(bBSUserNotifyObj.getTitle());
                textView2.setVisibility(bBSUserNotifyObj.getText() != null ? 0 : 8);
                textView2.setText(bBSUserNotifyObj.getText());
                b.v4(bVar, eVar, bBSUserNotifyObj);
                b.w4(bVar, eVar, bBSUserNotifyObj);
                eVar.b().setOnClickListener(new ViewOnClickListenerC0699b(bBSUserNotifyObj, bVar));
                if (com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getUser_protocol())) {
                    viewI2.setClickable(false);
                } else {
                    viewI2.setClickable(true);
                    viewI2.setOnClickListener(new c(bVar, bBSUserNotifyObj));
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 28404, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSUserNotifyObj);
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class c extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 28408, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            outRect.set(ViewUtils.f(b.this.getContext(), 12.0f), 0, ViewUtils.f(b.this.getContext(), 12.0f), 0);
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28409, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            b.t4(b.this).B();
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class e implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28410, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            b.t4(b.this).A();
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class f implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28412, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28411, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
                return;
            }
            b.s4(b.this).setTitle(str);
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class g implements j0<Result<BBSOfficialMessagesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f81366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f81367c;

            a(b bVar, String str) {
                this.f81366b = bVar;
                this.f81367c = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activityU4;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28415, new Class[]{View.class}, Void.TYPE).isSupported || (activityU4 = b.u4(this.f81366b)) == null) {
                    return;
                }
                String str = this.f81367c;
                v0 v0Var = v0.f124986a;
                String COMMON_FAQ_URL = lb.a.G4;
                f0.o(COMMON_FAQ_URL, "COMMON_FAQ_URL");
                String str2 = String.format(COMMON_FAQ_URL, Arrays.copyOf(new Object[]{str}, 1));
                f0.o(str2, "format(format, *args)");
                com.max.xiaoheihe.base.router.b.k0(activityU4, str2);
            }
        }

        g() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Result<BBSOfficialMessagesObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28414, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(result);
        }

        public final void b(Result<BBSOfficialMessagesObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28413, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.y4().notifyDataSetChanged();
            String faq_id = result.getResult().getFaq_id();
            if (com.max.hbcommon.utils.c.u(faq_id)) {
                return;
            }
            b.s4(b.this).setActionIcon(R.drawable.ic_0icon_action_faq_24);
            b.s4(b.this).setActionIconOnClickListener(new a(b.this, faq_id));
        }
    }

    /* JADX INFO: compiled from: OfficialNotifyListFragment.kt */
    public static final class h implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28417, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28416, new Class[]{Boolean.class}, Void.TYPE).isSupported && f0.g(bool, Boolean.FALSE)) {
                b.this.A4().A(0);
                b.this.A4().p(0);
            }
        }
    }

    private final void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28393, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G4(new C0698b(getContext(), Y3().p()));
    }

    private final void C4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28392, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Y3().D(arguments.getString("list_type"));
        Y3().I(arguments.getString(UserNotifyListActivity.O));
        Y3().y().r(arguments.getString("name"));
    }

    private final void D4(s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 28394, new Class[]{s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.vg_bottom_bar);
        View viewI2 = eVar.i(R.id.v_divider);
        View viewI3 = eVar.i(R.id.vg_content);
        if (com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getMaxjia()) && !kotlin.text.u.L1("link", bBSUserNotifyObj.getObj_type(), true) && com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getObj_content()) && !kotlin.text.u.L1(SwitchDetailActivity.P, bBSUserNotifyObj.getObj_type(), true)) {
            viewI2.setVisibility(8);
            viewI.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = viewI3.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = ViewUtils.f(getContext(), 12.0f);
            return;
        }
        viewI2.setVisibility(0);
        viewI.setVisibility(0);
        if (bBSUserNotifyObj.getText() != null) {
            ViewGroup.LayoutParams layoutParams2 = viewI3.getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).bottomMargin = ViewUtils.f(getContext(), 8.0f);
        } else {
            ViewGroup.LayoutParams layoutParams3 = viewI3.getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = ViewUtils.f(getContext(), 10.0f);
        }
    }

    private final void E4(s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 28395, new Class[]{s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
        TextView textView = (TextView) eVar.i(R.id.tv_username);
        TextView textView2 = (TextView) eVar.i(R.id.tv_time);
        com.max.hbimage.b.I(bBSUserNotifyObj.getSender_avatar(), imageView, R.drawable.common_default_avatar_40x40);
        textView.setText(bBSUserNotifyObj.getSender_name());
        if (bBSUserNotifyObj.getCreate_at() == null && bBSUserNotifyObj.getTimestamp() == null) {
            textView2.setVisibility(8);
        } else if (bBSUserNotifyObj.getCreate_at() == null) {
            textView2.setVisibility(0);
            textView2.setText(ad.a.b(ad.a.G, false, 2, null) ? w.q(getContext(), bBSUserNotifyObj.getTimestamp()) : w.t(getContext(), bBSUserNotifyObj.getTimestamp()));
        } else {
            textView2.setVisibility(0);
            textView2.setText(ad.a.b(ad.a.G, false, 2, null) ? w.q(getContext(), bBSUserNotifyObj.getCreate_at()) : w.t(getContext(), bBSUserNotifyObj.getCreate_at()));
        }
    }

    public static final /* synthetic */ TitleBar s4(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28398, new Class[]{b.class}, TitleBar.class);
        return patchProxyResultProxy.isSupported ? (TitleBar) patchProxyResultProxy.result : bVar.V3();
    }

    public static final /* synthetic */ OfficialNotifyListFragmentVM t4(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28397, new Class[]{b.class}, OfficialNotifyListFragmentVM.class);
        return patchProxyResultProxy.isSupported ? (OfficialNotifyListFragmentVM) patchProxyResultProxy.result : bVar.Y3();
    }

    public static final /* synthetic */ Activity u4(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 28399, new Class[]{b.class}, Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : bVar.getParentActivity();
    }

    public static final /* synthetic */ void v4(b bVar, s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{bVar, eVar, bBSUserNotifyObj}, null, changeQuickRedirect, true, 28400, new Class[]{b.class, s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.D4(eVar, bBSUserNotifyObj);
    }

    public static final /* synthetic */ void w4(b bVar, s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{bVar, eVar, bBSUserNotifyObj}, null, changeQuickRedirect, true, 28401, new Class[]{b.class, s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.E4(eVar, bBSUserNotifyObj);
    }

    @dl.d
    public final SmartRefreshLayout A4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28385, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.O;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        f0.S("refreshLayout");
        return null;
    }

    public final void F4(@dl.e b1 b1Var) {
        this.M = b1Var;
    }

    public final void G4(@dl.d s<BBSUserNotifyObj> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 28388, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.P = sVar;
    }

    public final void H4(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 28384, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.N = recyclerView;
    }

    public final void I4(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 28386, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(smartRefreshLayout, "<set-?>");
        this.O = smartRefreshLayout;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28389, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(getMInflater());
        this.M = b1VarC;
        f0.m(b1VarC);
        setViewBinding(b1VarC);
        b1 b1Var = this.M;
        f0.m(b1Var);
        RecyclerView recyclerView = b1Var.f131495b;
        f0.o(recyclerView, "binding!!.rv");
        H4(recyclerView);
        b1 b1Var2 = this.M;
        f0.m(b1Var2);
        SmartRefreshLayout smartRefreshLayout = b1Var2.f131496c;
        f0.o(smartRefreshLayout, "binding!!.srl");
        I4(smartRefreshLayout);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28391, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().y().k(getViewLifecycleOwner(), new f());
        Y3().v().k(getViewLifecycleOwner(), new g());
        Y3().z().k(getViewLifecycleOwner(), new h());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    @dl.d
    public Handler getEventHandler() {
        return this.L;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28396, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        String strX = Y3().x();
        if (strX != null) {
            jsonObject.addProperty(UserNotifyListActivity.O, strX);
        }
        return jsonObject.toString();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28390, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C4();
        W3().setVisibility(0);
        B4();
        z4().setLayoutManager(new LinearLayoutManager(getContext()));
        z4().addItemDecoration(new c());
        z4().setAdapter(y4());
        RecyclerView recyclerViewZ4 = z4();
        JsonObject jsonObject = new JsonObject();
        String strX = Y3().x();
        if (strX != null) {
            jsonObject.addProperty(UserNotifyListActivity.O, strX);
        }
        b2 b2Var = b2.f124493a;
        new v(this, recyclerViewZ4, false, jsonObject);
        A4().S(new d());
        A4().f0(new e());
        Y3().k().r(BaseDisplayState.LOADING);
        Y3().u();
        if (getParentActivity() instanceof UserNotifyListActivity) {
            Activity parentActivity = getParentActivity();
            f0.n(parentActivity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.UserNotifyListActivity");
            ((UserNotifyListActivity) parentActivity).M1("4");
        }
    }

    @dl.e
    public final b1 x4() {
        return this.M;
    }

    @dl.d
    public final s<BBSUserNotifyObj> y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28387, new Class[0], s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        s<BBSUserNotifyObj> sVar = this.P;
        if (sVar != null) {
            return sVar;
        }
        f0.S("mAdapter");
        return null;
    }

    @dl.d
    public final RecyclerView z4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28383, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.N;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("recyclerView");
        return null;
    }
}
