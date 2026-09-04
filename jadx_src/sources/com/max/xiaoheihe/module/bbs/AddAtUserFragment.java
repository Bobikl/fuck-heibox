package com.max.xiaoheihe.module.bbs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSFollowingResult;
import com.max.xiaoheihe.bean.bbs.BBSLinkSubObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserRelationsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AddAtUserFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f79522o = "page_follow";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f79523p = "page_fans";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f79524q = "arg_page";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f79525r = "arg_user_id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f79528d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f79531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EditText f79532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f79533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FilterButtonView f79534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.a f79535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f79536l;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.a.b f79538n;

    @BindView(R.id.rv_empty_view)
    View rv_empty_view;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f79526b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BBSUserInfoObj> f79529e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<BBSUserInfoObj> f79530f = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f79537m = new j(this);

    public class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@androidx.annotation.n0 RecyclerView recyclerView, int i10) {
            if (!PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 25729, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
                AddAtUserFragment.L3(AddAtUserFragment.this, recyclerView);
            }
        }
    }

    public class b implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 25730, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                String strR = AddAtUserFragment.this.r();
                AddAtUserFragment addAtUserFragment = AddAtUserFragment.this;
                AddAtUserFragment.L3(addAtUserFragment, addAtUserFragment.f79532h);
                if (!com.max.hbcommon.utils.c.u(strR)) {
                    AddAtUserFragment addAtUserFragment2 = AddAtUserFragment.this;
                    AddAtUserFragment.T3(addAtUserFragment2, addAtUserFragment2.r());
                    return true;
                }
            }
            return false;
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25731, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAtUserFragment.this.f79532h.setText("");
        }
    }

    public class d implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 25732, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAtUserFragment.this.f79537m.removeCallbacksAndMessages(null);
            Message messageObtainMessage = AddAtUserFragment.this.f79537m.obtainMessage();
            messageObtainMessage.obj = editable.toString();
            AddAtUserFragment.this.f79537m.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                AddAtUserFragment.this.f79533i.setVisibility(0);
            } else {
                AddAtUserFragment.this.f79533i.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 25733, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAtUserFragment.W3(AddAtUserFragment.this);
        }
    }

    public class f implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 25734, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAtUserFragment.X3(AddAtUserFragment.this, true);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<BBSLinkSubObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25736, new Class[0], Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onComplete();
                AddAtUserFragment.this.mRefreshLayout.A(0);
                AddAtUserFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25735, new Class[]{Throwable.class}, Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onError(th2);
                AddAtUserFragment.Y3(AddAtUserFragment.this);
                AddAtUserFragment.this.mRefreshLayout.A(0);
                AddAtUserFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSLinkSubObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25737, new Class[]{Result.class}, Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                AddAtUserFragment.this.f79529e = result.getResult().getUsers();
                AddAtUserFragment.X3(AddAtUserFragment.this, false);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25738, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkSubObj>) obj);
        }
    }

    public class h extends com.max.hbcommon.network.d<BBSFollowingResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79546b;

        h(boolean z10) {
            this.f79546b = z10;
        }

        public void a(BBSFollowingResult bBSFollowingResult) {
            if (!PatchProxy.proxy(new Object[]{bBSFollowingResult}, this, changeQuickRedirect, false, 25741, new Class[]{BBSFollowingResult.class}, Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                AddAtUserFragment.N3(AddAtUserFragment.this, bBSFollowingResult.getFollow_list(), this.f79546b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25740, new Class[0], Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onComplete();
                AddAtUserFragment.this.mRefreshLayout.A(0);
                AddAtUserFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25739, new Class[]{Throwable.class}, Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onError(th2);
                AddAtUserFragment.a4(AddAtUserFragment.this);
                AddAtUserFragment.this.mRefreshLayout.A(0);
                AddAtUserFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25742, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSFollowingResult) obj);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<BBSUserRelationsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79548b;

        i(String str) {
            this.f79548b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25744, new Class[0], Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25743, new Class[]{Throwable.class}, Void.TYPE).isSupported && AddAtUserFragment.this.isActive()) {
                super.onError(th2);
                AddAtUserFragment.O3(AddAtUserFragment.this);
            }
        }

        public void onNext(Result<BBSUserRelationsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25745, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            AddAtUserFragment.P3(AddAtUserFragment.this);
            if (AddAtUserFragment.this.isActive() && this.f79548b.equals(AddAtUserFragment.this.f79532h.getText().toString())) {
                AddAtUserFragment.this.f79530f.clear();
                if (result.getResult() != null) {
                    AddAtUserFragment.this.f79530f.addAll(result.getResult().getUsers());
                }
                AddAtUserFragment addAtUserFragment = AddAtUserFragment.this;
                AddAtUserFragment.R3(addAtUserFragment, addAtUserFragment.f79530f);
                AddAtUserFragment.this.f79536l.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25746, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSUserRelationsObj>) obj);
        }
    }

    public static class j extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AddAtUserFragment> f79550a;

        public j(AddAtUserFragment addAtUserFragment) {
            this.f79550a = new WeakReference<>(addAtUserFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 25747, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            AddAtUserFragment addAtUserFragment = this.f79550a.get();
            if (addAtUserFragment != null) {
                addAtUserFragment.h4((String) message.obj);
            }
        }
    }

    public AddAtUserFragment(com.max.xiaoheihe.module.bbs.adapter.a.b bVar) {
        this.f79538n = bVar;
    }

    static /* synthetic */ void L3(AddAtUserFragment addAtUserFragment, View view) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment, view}, null, changeQuickRedirect, true, 25719, new Class[]{AddAtUserFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.f4(view);
    }

    static /* synthetic */ void N3(AddAtUserFragment addAtUserFragment, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25725, new Class[]{AddAtUserFragment.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.i4(list, z10);
    }

    static /* synthetic */ void O3(AddAtUserFragment addAtUserFragment) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment}, null, changeQuickRedirect, true, 25726, new Class[]{AddAtUserFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.showError();
    }

    static /* synthetic */ void P3(AddAtUserFragment addAtUserFragment) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment}, null, changeQuickRedirect, true, 25727, new Class[]{AddAtUserFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.showContentView();
    }

    static /* synthetic */ void R3(AddAtUserFragment addAtUserFragment, List list) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment, list}, null, changeQuickRedirect, true, 25728, new Class[]{AddAtUserFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.k4(list);
    }

    static /* synthetic */ void T3(AddAtUserFragment addAtUserFragment, String str) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment, str}, null, changeQuickRedirect, true, 25720, new Class[]{AddAtUserFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.b4(str);
    }

    static /* synthetic */ void W3(AddAtUserFragment addAtUserFragment) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment}, null, changeQuickRedirect, true, 25721, new Class[]{AddAtUserFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.d4();
    }

    static /* synthetic */ void X3(AddAtUserFragment addAtUserFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25722, new Class[]{AddAtUserFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.c4(z10);
    }

    static /* synthetic */ void Y3(AddAtUserFragment addAtUserFragment) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment}, null, changeQuickRedirect, true, 25723, new Class[]{AddAtUserFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.showError();
    }

    static /* synthetic */ void a4(AddAtUserFragment addAtUserFragment) {
        if (PatchProxy.proxy(new Object[]{addAtUserFragment}, null, changeQuickRedirect, true, 25724, new Class[]{AddAtUserFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        addAtUserFragment.showError();
    }

    private void b4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25714, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().E4(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(str)));
    }

    private void c4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25708, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f79526b += 30;
        } else {
            this.f79526b = 0;
        }
        addDisposable((io.reactivex.disposables.b) (f79523p.equals(this.f79528d) ? com.max.xiaoheihe.network.i.a().a6(this.f79527c, this.f79526b, 30) : com.max.xiaoheihe.network.i.a().f0(this.f79527c, this.f79526b, 30)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(z10)));
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25710, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.f79528d = getArguments().getString(f79524q);
        this.f79527c = getArguments().getString(f79525r);
    }

    private void f4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25712, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static AddAtUserFragment g4(String str, String str2, com.max.xiaoheihe.module.bbs.adapter.a.b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, bVar}, null, changeQuickRedirect, true, 25704, new Class[]{String.class, String.class, com.max.xiaoheihe.module.bbs.adapter.a.b.class}, AddAtUserFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (AddAtUserFragment) patchProxyResultProxy.result;
        }
        AddAtUserFragment addAtUserFragment = new AddAtUserFragment(bVar);
        Bundle bundle = new Bundle();
        bundle.putString(f79525r, str);
        bundle.putString(f79524q, str2);
        addAtUserFragment.setArguments(bundle);
        return addAtUserFragment;
    }

    private void i4(List<BBSUserInfoObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25715, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            this.f79530f.clear();
            if (!this.f79529e.isEmpty()) {
                BBSUserInfoObj bBSUserInfoObj = new BBSUserInfoObj();
                bBSUserInfoObj.setUserid(null);
                bBSUserInfoObj.setUsername("最近联系人");
                this.f79530f.add(bBSUserInfoObj);
                this.f79530f.addAll(this.f79529e);
            }
            BBSUserInfoObj bBSUserInfoObj2 = new BBSUserInfoObj();
            bBSUserInfoObj2.setUserid(null);
            if (this.f79528d.equals(f79522o)) {
                bBSUserInfoObj2.setUsername("全部关注");
            } else {
                bBSUserInfoObj2.setUsername("全部粉丝");
            }
            this.f79530f.add(bBSUserInfoObj2);
        }
        this.f79530f.addAll(list);
        k4(this.f79530f);
        this.f79536l.notifyDataSetChanged();
    }

    private void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79535k = new com.max.xiaoheihe.module.bbs.adapter.a(this.mContext, this.f79530f, this.f79538n);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 4.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addOnScrollListener(new a());
        View viewInflate = this.mInflater.inflate(R.layout.item_following_user_header, (ViewGroup) this.mRecyclerView, false);
        this.f79531g = viewInflate;
        this.f79534j = (FilterButtonView) viewInflate.findViewById(R.id.fbv_sort);
        this.f79532h = (EditText) this.f79531g.findViewById(R.id.et_search);
        this.f79533i = (ImageView) this.f79531g.findViewById(R.id.iv_del);
        this.f79534j.setVisibility(8);
        this.f79531g.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 12.0f), 0);
        this.f79532h.setHint(getString(R.string.search_friend));
        this.f79532h.setFocusableInTouchMode(true);
        this.f79532h.setImeOptions(3);
        this.f79532h.setOnEditorActionListener(new b());
        this.f79533i.setOnClickListener(new c());
        this.f79532h.addTextChangedListener(new d());
        this.mRefreshLayout.a(true);
        this.mRefreshLayout.S(new e());
        this.mRefreshLayout.f0(new f());
        showLoading();
        j4();
        d4();
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25711, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.t tVar = new com.max.hbcommon.base.adapter.t(this.f79535k);
        this.f79536l = tVar;
        tVar.p(R.layout.layout_search_header_view, this.f79531g);
        this.mRecyclerView.setAdapter(this.f79536l);
    }

    private void k4(List list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25716, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            this.rv_empty_view.setVisibility(8);
            showContentView();
            this.mRefreshLayout.i0(true);
            if (this.f79528d.equals(f79522o)) {
                this.mRefreshLayout.b0(false);
                return;
            } else {
                this.mRefreshLayout.b0(true);
                return;
            }
        }
        this.mRefreshLayout.i0(false);
        this.mRefreshLayout.b0(false);
        this.rv_empty_view.setVisibility(0);
        ImageView imageView = (ImageView) this.rv_empty_view.findViewById(R.id.iv_empty);
        TextView textView = (TextView) this.rv_empty_view.findViewById(R.id.tv_empty);
        imageView.setImageResource(R.drawable.common_tag_favour_46x45);
        textView.setText(this.f79528d.equals(f79522o) ? R.string.no_following : R.string.no_follower);
        View view = this.rv_empty_view;
        if (view == null || this.f79531g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(0, ViewUtils.V(this.f79531g) + ViewUtils.f(this.mContext, 4.0f), 0, 0);
        this.rv_empty_view.setLayoutParams(layoutParams);
    }

    public void h4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25713, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            c4(false);
        } else {
            b4(str);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25705, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_refresh_rv_empty);
        this.mUnBinder = ButterKnife.f(this, view);
        e4();
        initViews();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25718, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79537m.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25717, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b4("");
    }

    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25709, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.f79532h;
        return editText != null ? editText.getText().toString() : "";
    }
}
