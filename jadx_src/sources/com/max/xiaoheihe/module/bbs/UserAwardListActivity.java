package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserAwardListResult;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class UserAwardListActivity extends BaseActivity {
    private static final String S = "msg";
    public static ChangeQuickRedirect changeQuickRedirect;
    private BBSUserMsgObj L;
    private String M;
    private String N;
    private String O;
    private com.max.hbcommon.base.adapter.s<BBSUserInfoObj> Q;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private int P = 0;
    private List<BBSUserInfoObj> R = new ArrayList();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26946, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(((BaseActivity) UserAwardListActivity.this).f66601b, null, UserAwardListActivity.this.L.getLinkid(), UserAwardListActivity.this.L.getLink_tag(), UserAwardListActivity.this.L.getHas_video(), UserAwardListActivity.this.L.getRoot_comment_id());
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f80152b;

            a(BBSUserInfoObj bBSUserInfoObj) {
                this.f80152b = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26949, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((BaseActivity) UserAwardListActivity.this).f66601b, this.f80152b.getUserid()).A();
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 26947, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            com.max.hbimage.b.H(bBSUserInfoObj.getAvartar(), imageView);
            textView.setText(bBSUserInfoObj.getUsername());
            eVar.b().setOnClickListener(new a(bBSUserInfoObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 26948, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSUserInfoObj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26950, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserAwardListActivity.this.P = 0;
            UserAwardListActivity.T1(UserAwardListActivity.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26951, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserAwardListActivity.R1(UserAwardListActivity.this, 30);
            UserAwardListActivity.T1(UserAwardListActivity.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<BBSUserAwardListResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(BBSUserAwardListResult bBSUserAwardListResult) {
            if (!PatchProxy.proxy(new Object[]{bBSUserAwardListResult}, this, changeQuickRedirect, false, 26954, new Class[]{BBSUserAwardListResult.class}, Void.TYPE).isSupported && UserAwardListActivity.this.isActive()) {
                super.onNext(bBSUserAwardListResult);
                UserAwardListActivity.W1(UserAwardListActivity.this, bBSUserAwardListResult.getUsers());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26953, new Class[0], Void.TYPE).isSupported && UserAwardListActivity.this.isActive()) {
                super.onComplete();
                UserAwardListActivity.this.mRefreshLayout.A(0);
                UserAwardListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26952, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserAwardListActivity.this.isActive()) {
                super.onError(th2);
                UserAwardListActivity.V1(UserAwardListActivity.this);
                UserAwardListActivity.this.mRefreshLayout.A(0);
                UserAwardListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26955, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSUserAwardListResult) obj);
        }
    }

    static /* synthetic */ int R1(UserAwardListActivity userAwardListActivity, int i10) {
        int i11 = userAwardListActivity.P + i10;
        userAwardListActivity.P = i11;
        return i11;
    }

    static /* synthetic */ void T1(UserAwardListActivity userAwardListActivity) {
        if (PatchProxy.proxy(new Object[]{userAwardListActivity}, null, changeQuickRedirect, true, 26943, new Class[]{UserAwardListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userAwardListActivity.Y1();
    }

    static /* synthetic */ void V1(UserAwardListActivity userAwardListActivity) {
        if (PatchProxy.proxy(new Object[]{userAwardListActivity}, null, changeQuickRedirect, true, 26944, new Class[]{UserAwardListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userAwardListActivity.C1();
    }

    static /* synthetic */ void W1(UserAwardListActivity userAwardListActivity, List list) {
        if (PatchProxy.proxy(new Object[]{userAwardListActivity, list}, null, changeQuickRedirect, true, 26945, new Class[]{UserAwardListActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userAwardListActivity.Z1(list);
    }

    public static Intent X1(Context context, BBSUserMsgObj bBSUserMsgObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSUserMsgObj}, null, changeQuickRedirect, true, 26938, new Class[]{Context.class, BBSUserMsgObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UserAwardListActivity.class);
        intent.putExtra("msg", bBSUserMsgObj);
        return intent;
    }

    private void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26940, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().I9(this.M, this.N, this.O, this.P, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void Z1(List<BBSUserInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26941, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (list != null) {
            if (this.P == 0) {
                this.R.clear();
            }
            this.R.addAll(list);
            this.Q.notifyDataSetChanged();
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
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String string;
        int iQ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26939, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.L = (BBSUserMsgObj) getIntent().getSerializableExtra("msg");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.awarded_user));
        if ("3".equals(this.L.getMessage_type())) {
            iQ = com.max.hbutils.utils.n.q(this.L.getLink_award_num());
            string = getString(R.string.view_original_post);
            this.N = this.L.getLinkid();
            this.O = this.L.getRoot_comment_id();
        } else if ("7".equals(this.L.getMessage_type())) {
            iQ = com.max.hbutils.utils.n.q(this.L.getComment_award_num());
            string = getString(R.string.view_original_post);
            this.N = this.L.getLinkid();
            this.O = this.L.getRoot_comment_id();
        } else if ("13".equals(this.L.getMessage_type())) {
            iQ = com.max.hbutils.utils.n.q(this.L.getLink_award_num());
            string = getString(R.string.view_original_post);
            this.N = this.L.getLinkid();
            this.O = this.L.getRoot_comment_id();
        } else {
            string = null;
            iQ = 0;
        }
        if (iQ > 0) {
            String str = " " + iQ;
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.text_secondary_1_color)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_14)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        }
        this.f66616q.setTitle(spannableStringBuilder);
        this.f66616q.setAction(string);
        this.f66616q.setActionTextColor(getResources().getColor(R.color.text_primary_1_color));
        this.f66616q.setActionOnClickListener(new a());
        this.f66617r.setVisibility(0);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.f66601b, 4.0f), 0, ViewUtils.f(this.f66601b, 4.0f));
        this.Q = new b(this.f66601b, this.R, R.layout.item_user_award);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(this.f66601b));
        this.mRecyclerView.setAdapter(this.Q);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        E1();
        Y1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26942, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        this.P = 0;
        Y1();
    }
}
