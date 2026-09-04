package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagGroupObj;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagLaberObj;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagObj;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.t0;
import mb.b1;

/* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.f131234q1})
public final class TemplateHashtagListActivity extends BaseActivity {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public b1 L;

    @dl.e
    private com.max.hbcommon.base.adapter.s<TemplateHashtagGroupObj> M;

    @dl.d
    private ArrayList<TemplateHashtagGroupObj> N = new ArrayList<>();

    /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26853, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            return new Intent(context, (Class<?>) TemplateHashtagListActivity.class);
        }
    }

    /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TemplateHashtagResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26854, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TemplateHashtagListActivity.this.isActive()) {
                super.onError(e10);
                TemplateHashtagListActivity.this.R1().f131496c.P();
                TemplateHashtagListActivity.this.R1().f131496c.w();
                TemplateHashtagListActivity.N1(TemplateHashtagListActivity.this);
            }
        }

        public void onNext(@dl.d Result<TemplateHashtagResultObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 26855, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            if (TemplateHashtagListActivity.this.isActive()) {
                TemplateHashtagListActivity.this.R1().f131496c.P();
                TemplateHashtagListActivity.this.R1().f131496c.w();
                TemplateHashtagListActivity.this.V1(t10.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26856, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TemplateHashtagResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
    @t0({"SMAP\nTemplateHashtagListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateHashtagListActivity.kt\ncom/max/xiaoheihe/module/bbs/TemplateHashtagListActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,208:1\n1#2:209\n262#3,2:210\n262#3,2:212\n*S KotlinDebug\n*F\n+ 1 TemplateHashtagListActivity.kt\ncom/max/xiaoheihe/module/bbs/TemplateHashtagListActivity$initView$1\n*L\n137#1:210,2\n140#1:212,2\n*E\n"})
    public static final class c extends com.max.hbcommon.base.adapter.s<TemplateHashtagGroupObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TemplateHashtagListActivity f80086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f80087c;

            a(TemplateHashtagListActivity templateHashtagListActivity, String str) {
                this.f80086b = templateHashtagListActivity;
                this.f80087c = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26861, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((BaseActivity) this.f80086b).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.j0(mContext, this.f80087c);
            }
        }

        /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
        public static final class b extends com.max.hbcommon.base.adapter.s<TemplateHashtagObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TemplateHashtagListActivity f80088b;

            /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ TemplateHashtagListActivity f80089b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ TemplateHashtagObj f80090c;

                a(TemplateHashtagListActivity templateHashtagListActivity, TemplateHashtagObj templateHashtagObj) {
                    this.f80089b = templateHashtagListActivity;
                    this.f80090c = templateHashtagObj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26866, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Activity mContext = ((BaseActivity) this.f80089b).f66601b;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext, this.f80090c.getProtocol());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TemplateHashtagListActivity templateHashtagListActivity, Activity activity, ArrayList<TemplateHashtagObj> arrayList) {
                super(activity, arrayList, R.layout.item_hashtag_template);
                this.f80088b = templateHashtagListActivity;
            }

            public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TemplateHashtagObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 26863, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TemplateHashtagObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextView textView = (TextView) viewHolder.i(R.id.tv_new_tag);
                TextView textView2 = (TextView) viewHolder.i(R.id.tv_name);
                if (data.getLabel() != null) {
                    textView.setVisibility(0);
                    TemplateHashtagLaberObj label = data.getLabel();
                    kotlin.jvm.internal.f0.m(label);
                    int iE1 = com.max.xiaoheihe.utils.d.e1(label.getStart_color());
                    TemplateHashtagLaberObj label2 = data.getLabel();
                    kotlin.jvm.internal.f0.m(label2);
                    textView.setBackground(ViewUtils.i(0, iE1, com.max.xiaoheihe.utils.d.e1(label2.getEnd_color())));
                    TemplateHashtagLaberObj label3 = data.getLabel();
                    kotlin.jvm.internal.f0.m(label3);
                    textView.setText(label3.getSub_title());
                } else {
                    textView.setVisibility(8);
                }
                textView2.setText(data.getTitle());
                com.max.hbimage.b.K(data.getImg(), (ImageView) viewHolder.i(R.id.iv_img));
                viewHolder.itemView.setOnClickListener(new a(this.f80088b, data));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TemplateHashtagObj templateHashtagObj) {
                if (PatchProxy.proxy(new Object[]{eVar, templateHashtagObj}, this, changeQuickRedirect, false, 26865, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, templateHashtagObj);
            }

            @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 26864, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
                return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
            }

            @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            @dl.d
            public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 26862, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
                if (patchProxyResultProxy.isSupported) {
                    return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(parent, "parent");
                com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
                kotlin.jvm.internal.f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
                eVarOnCreateViewHolder.i(R.id.vg_card).getLayoutParams().width = (ViewUtils.L(((BaseActivity) this.f80088b).f66601b) - ViewUtils.f(((BaseActivity) this.f80088b).f66601b, 42.0f)) / 4;
                return eVarOnCreateViewHolder;
            }
        }

        c(Activity activity, ArrayList<TemplateHashtagGroupObj> arrayList) {
            super(activity, arrayList, R.layout.item_template_hashtag_group);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e groupViewHolder, @dl.d TemplateHashtagGroupObj group) {
            if (PatchProxy.proxy(new Object[]{groupViewHolder, group}, this, changeQuickRedirect, false, 26858, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TemplateHashtagGroupObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(groupViewHolder, "groupViewHolder");
            kotlin.jvm.internal.f0.p(group, "group");
            TextView textView = (TextView) groupViewHolder.i(R.id.tv_group_name);
            RecyclerView recyclerView = (RecyclerView) groupViewHolder.i(R.id.rv_group);
            textView.setText(group.getTitle());
            if (groupViewHolder.getAbsoluteAdapterPosition() != 0) {
                groupViewHolder.i(R.id.v_space).setVisibility(0);
            }
            recyclerView.setAdapter(new b(TemplateHashtagListActivity.this, ((BaseActivity) TemplateHashtagListActivity.this).f66601b, group.getItems()));
            LinearLayout checkMore = (LinearLayout) groupViewHolder.i(R.id.check_more);
            String protocol = group.getProtocol();
            b2 b2Var = null;
            if (protocol != null) {
                if (!(!kotlin.text.u.V1(protocol))) {
                    protocol = null;
                }
                if (protocol != null) {
                    TemplateHashtagListActivity templateHashtagListActivity = TemplateHashtagListActivity.this;
                    kotlin.jvm.internal.f0.o(checkMore, "checkMore");
                    checkMore.setVisibility(0);
                    checkMore.setOnClickListener(new a(templateHashtagListActivity, protocol));
                    b2Var = b2.f124493a;
                }
            }
            if (b2Var == null) {
                kotlin.jvm.internal.f0.o(checkMore, "checkMore");
                checkMore.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TemplateHashtagGroupObj templateHashtagGroupObj) {
            if (PatchProxy.proxy(new Object[]{eVar, templateHashtagGroupObj}, this, changeQuickRedirect, false, 26860, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, templateHashtagGroupObj);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 26859, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        @dl.d
        public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 26857, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(parent, "parent");
            com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
            kotlin.jvm.internal.f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
            ((RecyclerView) eVarOnCreateViewHolder.i(R.id.rv_group)).setLayoutManager(new GridLayoutManager(((BaseActivity) TemplateHashtagListActivity.this).f66601b, 4));
            return eVarOnCreateViewHolder;
        }
    }

    /* JADX INFO: compiled from: TemplateHashtagListActivity.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 26867, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            TemplateHashtagListActivity.this.O1();
        }
    }

    public static final /* synthetic */ void N1(TemplateHashtagListActivity templateHashtagListActivity) {
        if (PatchProxy.proxy(new Object[]{templateHashtagListActivity}, null, changeQuickRedirect, true, 26852, new Class[]{TemplateHashtagListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        templateHashtagListActivity.C1();
    }

    @dl.d
    @xh.m
    public static final Intent Q1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 26851, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : O.a(context);
    }

    private final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26847, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R1().f131495b.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.M = new c(this.f66601b, this.N);
        R1().f131495b.setAdapter(this.M);
        R1().f131496c.setBackgroundColor(getResources().getColor(R.color.white));
        R1().f131496c.S(new d());
        R1().f131496c.b0(false);
    }

    @SuppressLint({"AutoDispose"})
    public final void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26848, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().E5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    public final b1 R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26844, new Class[0], b1.class);
        if (patchProxyResultProxy.isSupported) {
            return (b1) patchProxyResultProxy.result;
        }
        b1 b1Var = this.L;
        if (b1Var != null) {
            return b1Var;
        }
        kotlin.jvm.internal.f0.S("mBinding");
        return null;
    }

    public final void V1(@dl.e TemplateHashtagResultObj templateHashtagResultObj) {
        if (PatchProxy.proxy(new Object[]{templateHashtagResultObj}, this, changeQuickRedirect, false, 26849, new Class[]{TemplateHashtagResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (templateHashtagResultObj != null) {
            this.N.clear();
            ArrayList<TemplateHashtagGroupObj> groups = templateHashtagResultObj.getGroups();
            if (groups != null) {
                this.N.addAll(groups);
            }
            com.max.hbcommon.base.adapter.s<TemplateHashtagGroupObj> sVar = this.M;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
        }
        if (com.max.hbcommon.utils.c.w(this.N)) {
            y1();
        } else {
            x1();
        }
    }

    public final void W1(@dl.d b1 b1Var) {
        if (PatchProxy.proxy(new Object[]{b1Var}, this, changeQuickRedirect, false, 26845, new Class[]{b1.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(b1Var, "<set-?>");
        this.L = b1Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26846, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(b1VarC, "inflate(layoutInflater)");
        W1(b1VarC);
        setContentView(R1().b());
        this.f66616q.setTitle("创意模板");
        T1();
        E1();
        O1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        O1();
    }
}
