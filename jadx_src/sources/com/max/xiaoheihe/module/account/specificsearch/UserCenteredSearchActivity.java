package com.max.xiaoheihe.module.account.specificsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.SearchView;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: UserCenteredSearchActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nUserCenteredSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenteredSearchActivity.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredSearchActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,159:1\n75#2,13:160\n54#3,8:173\n262#4,2:181\n*S KotlinDebug\n*F\n+ 1 UserCenteredSearchActivity.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredSearchActivity\n*L\n34#1:160,13\n62#1:173,8\n80#1:181,2\n*E\n"})
@ig.d(interceptors = {com.max.xiaoheihe.module.account.specificsearch.c.class}, path = {lb.d.E, lb.d.F, lb.d.G, lb.d.H})
@o(parameters = 0)
public final class UserCenteredSearchActivity extends BaseActivity {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;

    @dl.d
    public static final String R = "search_type_path";

    @dl.d
    private static final String S = "UserCenteredSearchActivity-dbg";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final z L;
    private ld.a M;

    @e
    private String N;

    @e
    private SearchView O;

    /* JADX INFO: compiled from: UserCenteredSearchActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final com.sankuai.waimai.router.common.c a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25340, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return com.max.xiaoheihe.base.router.b.f(context, lb.d.H);
        }

        @dl.d
        @m
        public final com.sankuai.waimai.router.common.c b(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25339, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return com.max.xiaoheihe.base.router.b.f(context, lb.d.G);
        }

        @dl.d
        @m
        public final com.sankuai.waimai.router.common.c c(@dl.d Context context, @e String str, @e CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, charSequence}, this, changeQuickRedirect, false, 25338, new Class[]{Context.class, String.class, CharSequence.class}, com.sankuai.waimai.router.common.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            com.sankuai.waimai.router.common.c cVarF = com.max.xiaoheihe.base.router.b.f(context, lb.d.F);
            cVarF.U(UserCenteredMomentSearchFragment.f79218n, str);
            cVarF.U(UserCenteredMomentSearchFragment.f79219o, charSequence != null ? charSequence.toString() : null);
            return cVarF;
        }
    }

    /* JADX INFO: compiled from: UserCenteredSearchActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView;
            EditText et_search;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25341, new Class[]{View.class}, Void.TYPE).isSupported || (searchView = UserCenteredSearchActivity.this.O) == null || (et_search = searchView.getEt_search()) == null) {
                return;
            }
            et_search.setText("");
        }
    }

    /* JADX INFO: compiled from: UserCenteredSearchActivity.kt */
    @t0({"SMAP\nUserCenteredSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenteredSearchActivity.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredSearchActivity$initView$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,159:1\n262#2,2:160\n*S KotlinDebug\n*F\n+ 1 UserCenteredSearchActivity.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredSearchActivity$initView$1$2\n*L\n96#1:160,2\n*E\n"})
    public static final class c implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchView f79240c;

        c(SearchView searchView) {
            this.f79240c = searchView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 25342, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                com.max.xiaoheihe.utils.d.E0(((BaseActivity) UserCenteredSearchActivity.this).f66601b, this.f79240c.getEt_search());
                Editable text = this.f79240c.getEt_search().getText();
                ld.a aVar = null;
                String string = text != null ? text.toString() : null;
                if (!(!(string == null || kotlin.text.u.V1(string)))) {
                    string = null;
                }
                if (string != null) {
                    UserCenteredSearchActivity userCenteredSearchActivity = UserCenteredSearchActivity.this;
                    ld.a aVar2 = userCenteredSearchActivity.M;
                    if (aVar2 == null) {
                        f0.S("binding");
                    } else {
                        aVar = aVar2;
                    }
                    FrameLayout frameLayout = aVar.f131324b;
                    f0.o(frameLayout, "binding.searchResultContainer");
                    frameLayout.setVisibility(0);
                    UserCenteredSearchActivity.Q1(userCenteredSearchActivity).k(string);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: UserCenteredSearchActivity.kt */
    public static final class d implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25344, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            SearchView searchView;
            EditText et_search;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25343, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (z10 || (searchView = UserCenteredSearchActivity.this.O) == null || (et_search = searchView.getEt_search()) == null) {
                return;
            }
            et_search.setHint(str);
        }
    }

    public UserCenteredSearchActivity() {
        final yh.a aVar = null;
        this.L = new ViewModelLazy(n0.d(com.max.xiaoheihe.module.account.specificsearch.d.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredSearchActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25347, new Class[0], b1.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25348, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredSearchActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25345, new Class[0], y0.b.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25346, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredSearchActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25350, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25349, new Class[0], u2.a.class);
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

    public static final /* synthetic */ com.max.xiaoheihe.module.account.specificsearch.d Q1(UserCenteredSearchActivity userCenteredSearchActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userCenteredSearchActivity}, null, changeQuickRedirect, true, 25337, new Class[]{UserCenteredSearchActivity.class}, com.max.xiaoheihe.module.account.specificsearch.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.account.specificsearch.d) patchProxyResultProxy.result : userCenteredSearchActivity.R1();
    }

    private final com.max.xiaoheihe.module.account.specificsearch.d R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25328, new Class[0], com.max.xiaoheihe.module.account.specificsearch.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.account.specificsearch.d) patchProxyResultProxy.result : (com.max.xiaoheihe.module.account.specificsearch.d) this.L.getValue();
    }

    private final void T1() {
        SearchView searchView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TitleBar titleBarC1 = c1();
        if (titleBarC1 == null || (searchView = titleBarC1.getSearchView()) == null) {
            searchView = null;
        } else {
            searchView.setVisibility(0);
            searchView.setPadding(0, searchView.getPaddingTop(), searchView.getPaddingRight(), searchView.getPaddingBottom());
            searchView.getIv_title_del().setOnClickListener(new b());
            searchView.getEt_search().setFocusable(true);
            searchView.getEt_search().setFocusableInTouchMode(true);
            searchView.getEt_search().setImeOptions(3);
            searchView.getEt_search().setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
            searchView.getEt_search().setOnEditorActionListener(new c(searchView));
        }
        this.O = searchView;
        TitleBar titleBarC2 = c1();
        if (titleBarC2 != null) {
            titleBarC2.a0();
        }
    }

    @dl.d
    @m
    public static final com.sankuai.waimai.router.common.c V1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25336, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : P.a(context);
    }

    @dl.d
    @m
    public static final com.sankuai.waimai.router.common.c W1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25335, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : P.b(context);
    }

    @dl.d
    @m
    public static final com.sankuai.waimai.router.common.c X1(@dl.d Context context, @e String str, @e CharSequence charSequence) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, charSequence}, null, changeQuickRedirect, true, 25334, new Class[]{Context.class, String.class, CharSequence.class}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : P.c(context, str, charSequence);
    }

    private final void initViewModel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R1().g().k(this, new d());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ld.a aVarC = ld.a.c(this.f66602c);
        f0.o(aVarC, "inflate(mInflater)");
        this.M = aVarC;
        if (aVarC == null) {
            f0.S("binding");
            aVarC = null;
        }
        setContentView(aVarC.b());
        T1();
        initViewModel();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 25329, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        Fragment userCenteredFavourCollectionSearchFragment = null;
        this.N = intent != null ? intent.getStringExtra(R) : null;
        if (bundle == null) {
            Intent intent2 = getIntent();
            if (intent2 == null || (bundle2 = intent2.getExtras()) == null) {
                bundle2 = new Bundle();
            }
            String str = this.N;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -908820524) {
                    if (iHashCode != 1166926108) {
                        if (iHashCode == 1475263227 && str.equals(lb.d.F)) {
                            userCenteredFavourCollectionSearchFragment = new UserCenteredMomentSearchFragment();
                        }
                    } else if (str.equals(lb.d.G)) {
                        userCenteredFavourCollectionSearchFragment = new UserCenteredHistorySearchFragment();
                    }
                } else if (str.equals(lb.d.H)) {
                    userCenteredFavourCollectionSearchFragment = new UserCenteredFavourCollectionSearchFragment();
                }
            }
            if (userCenteredFavourCollectionSearchFragment == null) {
                Log.e(S, "[UserCenteredSearchActivity-dbg][initView] illegal searchTypePath: " + this.N);
                return;
            }
            userCenteredFavourCollectionSearchFragment.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            f0.o(supportFragmentManager, "supportFragmentManager");
            p0 p0VarU = supportFragmentManager.u();
            f0.o(p0VarU, "beginTransaction()");
            p0VarU.y(R.id.search_result_container, userCenteredFavourCollectionSearchFragment);
            p0VarU.p();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        EditText et_search;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25333, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        SearchView searchView = this.O;
        if (searchView == null || (et_search = searchView.getEt_search()) == null) {
            return;
        }
        ViewUtils.r0(et_search);
    }
}
