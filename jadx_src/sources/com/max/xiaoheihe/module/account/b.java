package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HeyboxFriendListObj;
import com.max.xiaoheihe.bean.account.UserFriendObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AddFriendDialogFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f78791x = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f78792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EditText f78793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SmartRefreshLayout f78794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RecyclerView f78795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RecyclerView f78796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ViewGroup f78797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.h f78798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.h f78799q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private LoadingDialog f78802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f78803u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final List<UserFriendObj> f78800r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final List<UserFriendObj> f78801s = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f78804v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final a f78805w = new a(this);

    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<b> f78806a;

        public a(@dl.d b fragment) {
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            this.f78806a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 22362, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            b bVar = this.f78806a.get();
            if (bVar != null) {
                Object obj = msg.obj;
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                b.V3(bVar, (String) obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nAddFriendDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddFriendDialogFragment.kt\ncom/max/xiaoheihe/module/account/AddFriendDialogFragment$doSearch$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,233:1\n260#2:234\n*S KotlinDebug\n*F\n+ 1 AddFriendDialogFragment.kt\ncom/max/xiaoheihe/module/account/AddFriendDialogFragment$doSearch$1\n*L\n206#1:234\n*E\n"})
    public static final class C0650b extends com.max.hbcommon.network.d<Result<HeyboxFriendListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78808c;

        C0650b(String str) {
            this.f78808c = str;
        }

        public void onNext(@dl.d Result<HeyboxFriendListObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 22363, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            super.onNext(t10);
            if (!b.this.isAdded() || b.this.getContext() == null) {
                return;
            }
            String str = this.f78808c;
            EditText editText = b.this.f78793k;
            ViewGroup viewGroup = null;
            if (editText == null) {
                kotlin.jvm.internal.f0.S("etSearchFriend");
                editText = null;
            }
            if (kotlin.jvm.internal.f0.g(str, editText.getText().toString())) {
                b.j4(b.this);
                if (com.max.hbcommon.utils.c.w(t10.getResult().getList())) {
                    RecyclerView recyclerView = b.this.f78796n;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.f0.S("rv_search");
                        recyclerView = null;
                    }
                    if (recyclerView.getVisibility() == 0) {
                        ViewGroup viewGroup2 = b.this.f78797o;
                        if (viewGroup2 == null) {
                            kotlin.jvm.internal.f0.S("vg_search_empty");
                        } else {
                            viewGroup = viewGroup2;
                        }
                        viewGroup.setVisibility(0);
                        return;
                    }
                    return;
                }
                b.this.f78801s.clear();
                List list = b.this.f78801s;
                List<UserFriendObj> list2 = t10.getResult().getList();
                kotlin.jvm.internal.f0.m(list2);
                list.addAll(list2);
                com.max.xiaoheihe.module.bbs.adapter.h hVar = b.this.f78799q;
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                }
                ViewGroup viewGroup3 = b.this.f78797o;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.f0.S("vg_search_empty");
                } else {
                    viewGroup = viewGroup3;
                }
                viewGroup.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22364, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HeyboxFriendListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<HeyboxFriendListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22366, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            b.j4(b.this);
            SmartRefreshLayout smartRefreshLayout = b.this.f78794l;
            SmartRefreshLayout smartRefreshLayout2 = null;
            if (smartRefreshLayout == null) {
                kotlin.jvm.internal.f0.S("srl");
                smartRefreshLayout = null;
            }
            smartRefreshLayout.P();
            SmartRefreshLayout smartRefreshLayout3 = b.this.f78794l;
            if (smartRefreshLayout3 == null) {
                kotlin.jvm.internal.f0.S("srl");
            } else {
                smartRefreshLayout2 = smartRefreshLayout3;
            }
            smartRefreshLayout2.w();
        }

        public void onNext(@dl.d Result<HeyboxFriendListObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 22365, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            super.onNext(t10);
            if (!b.this.isAdded() || b.this.getContext() == null) {
                return;
            }
            b.j4(b.this);
            RecyclerView recyclerView = b.this.f78795m;
            SmartRefreshLayout smartRefreshLayout = null;
            if (recyclerView == null) {
                kotlin.jvm.internal.f0.S("rv");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = b.this.f78796n;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.f0.S("rv_search");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(8);
            b bVar = b.this;
            SwipeBackLayout swipeBackLayout = bVar.f66927e;
            RecyclerView recyclerView3 = bVar.f78795m;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.f0.S("rv");
                recyclerView3 = null;
            }
            swipeBackLayout.f69555k = recyclerView3;
            if (b.this.f78803u == 0) {
                b.this.f78800r.clear();
            }
            List<UserFriendObj> list = t10.getResult().getList();
            if (list != null) {
                b.this.f78800r.addAll(list);
            }
            com.max.xiaoheihe.module.bbs.adapter.h hVar = b.this.f78798p;
            if (hVar != null) {
                hVar.notifyDataSetChanged();
            }
            if (b.this.f78800r.size() == 0) {
                ViewGroup viewGroup = b.this.f78797o;
                if (viewGroup == null) {
                    kotlin.jvm.internal.f0.S("vg_search_empty");
                    viewGroup = null;
                }
                viewGroup.setVisibility(0);
            } else {
                ViewGroup viewGroup2 = b.this.f78797o;
                if (viewGroup2 == null) {
                    kotlin.jvm.internal.f0.S("vg_search_empty");
                    viewGroup2 = null;
                }
                viewGroup2.setVisibility(8);
            }
            SmartRefreshLayout smartRefreshLayout2 = b.this.f78794l;
            if (smartRefreshLayout2 == null) {
                kotlin.jvm.internal.f0.S("srl");
                smartRefreshLayout2 = null;
            }
            smartRefreshLayout2.P();
            SmartRefreshLayout smartRefreshLayout3 = b.this.f78794l;
            if (smartRefreshLayout3 == null) {
                kotlin.jvm.internal.f0.S("srl");
            } else {
                smartRefreshLayout = smartRefreshLayout3;
            }
            smartRefreshLayout.w();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22367, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HeyboxFriendListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    public static final class d implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22368, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable != null) {
                z10 = editable.length() > 0;
            }
            ViewGroup viewGroup = null;
            if (z10) {
                b.this.f78805w.removeCallbacksAndMessages(null);
                Message messageObtainMessage = b.this.f78805w.obtainMessage();
                kotlin.jvm.internal.f0.o(messageObtainMessage, "fragmentHandler.obtainMessage()");
                messageObtainMessage.obj = editable.toString();
                b.this.f78805w.sendMessageDelayed(messageObtainMessage, 100L);
                return;
            }
            RecyclerView recyclerView = b.this.f78795m;
            if (recyclerView == null) {
                kotlin.jvm.internal.f0.S("rv");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = b.this.f78796n;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.f0.S("rv_search");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(8);
            b bVar = b.this;
            SwipeBackLayout swipeBackLayout = bVar.f66927e;
            RecyclerView recyclerView3 = bVar.f78795m;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.f0.S("rv");
                recyclerView3 = null;
            }
            swipeBackLayout.f69555k = recyclerView3;
            if (b.this.f78800r.size() == 0) {
                ViewGroup viewGroup2 = b.this.f78797o;
                if (viewGroup2 == null) {
                    kotlin.jvm.internal.f0.S("vg_search_empty");
                } else {
                    viewGroup = viewGroup2;
                }
                viewGroup.setVisibility(0);
                return;
            }
            ViewGroup viewGroup3 = b.this.f78797o;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.f0.S("vg_search_empty");
            } else {
                viewGroup = viewGroup3;
            }
            viewGroup.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    public static final class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 22369, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            b.this.f78803u = 0;
            b.c4(b.this);
        }
    }

    /* JADX INFO: compiled from: AddFriendDialogFragment.kt */
    public static final class f implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 22370, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            b.this.f78803u += b.this.f78804v;
            b.c4(b.this);
        }
    }

    public static final /* synthetic */ void V3(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 22361, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.l4(str);
    }

    public static final /* synthetic */ void c4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 22359, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.m4();
    }

    public static final /* synthetic */ void j4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 22360, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.n4();
    }

    private final void l4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22358, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f78795m;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("rv");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        this.f78801s.clear();
        com.max.xiaoheihe.module.bbs.adapter.h hVar = this.f78799q;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
        RecyclerView recyclerView3 = this.f78796n;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("rv_search");
            recyclerView3 = null;
        }
        recyclerView3.setVisibility(0);
        SwipeBackLayout swipeBackLayout = this.f66927e;
        RecyclerView recyclerView4 = this.f78796n;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.f0.S("rv_search");
        } else {
            recyclerView2 = recyclerView4;
        }
        swipeBackLayout.f69555k = recyclerView2;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0650b(str)));
    }

    private final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22357, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w3(this.f78803u, this.f78804v).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void n4() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22356, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.f78802t) == null || !loadingDialog.i()) {
            return;
        }
        loadingDialog.c();
    }

    private final void showLoading() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22355, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        if (this.f78802t == null) {
            this.f78802t = new LoadingDialog(context, "");
        }
        LoadingDialog loadingDialog = this.f78802t;
        if (loadingDialog != null) {
            loadingDialog.r();
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 22353, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_fragment_add_friend, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 22354, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tv_add_friend_desc);
        kotlin.jvm.internal.f0.o(viewFindViewById, "view.findViewById(R.id.tv_add_friend_desc)");
        this.f78792j = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.et_search_friend);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "view.findViewById(R.id.et_search_friend)");
        this.f78793k = (EditText) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "view.findViewById(R.id.srl)");
        this.f78794l = (SmartRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "view.findViewById(R.id.rv)");
        this.f78795m = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rv_search);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "view.findViewById(R.id.rv_search)");
        this.f78796n = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.vg_search_empty);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "view.findViewById(R.id.vg_search_empty)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        this.f78797o = viewGroup;
        SmartRefreshLayout smartRefreshLayout = null;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_search_empty");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(null);
        ViewGroup viewGroup2 = this.f78797o;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.f0.S("vg_search_empty");
            viewGroup2 = null;
        }
        viewGroup2.setBackgroundResource(R.color.divider_secondary_2_color);
        TextView textView = this.f78792j;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tvAddFriendDesc");
            textView = null;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.add_friend_tips);
        kotlin.jvm.internal.f0.o(strN0, "getString(R.string.add_friend_tips)");
        String strJ = com.max.xiaoheihe.utils.i0.j();
        kotlin.jvm.internal.f0.o(strJ, "getCurrentUserId()");
        textView.setText(kotlin.text.u.l2(strN0, "userId", strJ, false, 4, null));
        RecyclerView recyclerView = this.f78795m;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("rv");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Context context = getContext();
        kotlin.jvm.internal.f0.m(context);
        this.f78798p = new com.max.xiaoheihe.module.bbs.adapter.h(context, this.f78800r, false, null, null, 28, null);
        RecyclerView recyclerView2 = this.f78795m;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("rv");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.f78798p);
        RecyclerView recyclerView3 = this.f78796n;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("rv_search");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        Context context2 = getContext();
        kotlin.jvm.internal.f0.m(context2);
        this.f78799q = new com.max.xiaoheihe.module.bbs.adapter.h(context2, this.f78801s, false, null, null, 28, null);
        RecyclerView recyclerView4 = this.f78796n;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.f0.S("rv_search");
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(this.f78799q);
        EditText editText = this.f78793k;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("etSearchFriend");
            editText = null;
        }
        editText.addTextChangedListener(new d());
        SmartRefreshLayout smartRefreshLayout2 = this.f78794l;
        if (smartRefreshLayout2 == null) {
            kotlin.jvm.internal.f0.S("srl");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.i0(false);
        SmartRefreshLayout smartRefreshLayout3 = this.f78794l;
        if (smartRefreshLayout3 == null) {
            kotlin.jvm.internal.f0.S("srl");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.S(new e());
        SmartRefreshLayout smartRefreshLayout4 = this.f78794l;
        if (smartRefreshLayout4 == null) {
            kotlin.jvm.internal.f0.S("srl");
        } else {
            smartRefreshLayout = smartRefreshLayout4;
        }
        smartRefreshLayout.f0(new f());
        showLoading();
        m4();
    }
}
