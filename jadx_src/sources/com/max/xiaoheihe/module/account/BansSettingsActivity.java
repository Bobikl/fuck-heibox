package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BanItemWrapperObj;
import com.max.xiaoheihe.bean.bbs.BlockListObj;
import com.max.xiaoheihe.module.bbs.ChooseTopicsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BansSettingsActivity extends BaseActivity {
    private static final int N = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BanItemWrapperObj> L = new ArrayList();
    private i M;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.BansSettingsActivity$a$a, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0635a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0635a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22454, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22453, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.hbcommon.view.a.f(((BaseActivity) BansSettingsActivity.this).f66601b).x(R.string.bans_settings_tips).t(R.string.confirm, new DialogInterfaceOnClickListenerC0635a()).F();
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(@androidx.annotation.n0 ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22455, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            BansSettingsActivity.N1(BansSettingsActivity.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<BlockListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22456, new Class[0], Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onComplete();
                BansSettingsActivity.this.mRefreshLayout.A(0);
                BansSettingsActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22457, new Class[]{Throwable.class}, Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onError(th2);
                BansSettingsActivity.W1(BansSettingsActivity.this);
                BansSettingsActivity.this.mRefreshLayout.A(0);
                BansSettingsActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BlockListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22458, new Class[]{Result.class}, Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onNext(result);
                BansSettingsActivity.X1(BansSettingsActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22459, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BlockListObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77496b;

        d(String str) {
            this.f77496b = str;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22460, new Class[]{Result.class}, Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onNext(result);
                Iterator it = BansSettingsActivity.this.L.iterator();
                while (it.hasNext()) {
                    BanItemWrapperObj banItemWrapperObj = (BanItemWrapperObj) it.next();
                    if (banItemWrapperObj.getItemType() == 1 && this.f77496b.equals(banItemWrapperObj.getTopic().getTopic_id())) {
                        it.remove();
                    }
                }
                BansSettingsActivity.this.M.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22461, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77498b;

        e(String str) {
            this.f77498b = str;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22462, new Class[]{Result.class}, Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onNext(result);
                Iterator it = BansSettingsActivity.this.L.iterator();
                while (it.hasNext()) {
                    BanItemWrapperObj banItemWrapperObj = (BanItemWrapperObj) it.next();
                    if (banItemWrapperObj.getItemType() == 2 && this.f77498b.equals(banItemWrapperObj.getUser().getUserid())) {
                        it.remove();
                    }
                }
                BansSettingsActivity.this.M.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22463, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f77500b;

        f(BBSTopicObj bBSTopicObj) {
            this.f77500b = bBSTopicObj;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            int i10 = 0;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22464, new Class[]{Result.class}, Void.TYPE).isSupported && BansSettingsActivity.this.isActive()) {
                super.onNext(result);
                for (BanItemWrapperObj banItemWrapperObj : BansSettingsActivity.this.L) {
                    if (banItemWrapperObj.getItemType() == 1 && this.f77500b.equals(banItemWrapperObj.getTopic())) {
                        return;
                    }
                }
                if (BansSettingsActivity.this.L.size() > 0 && ((BanItemWrapperObj) BansSettingsActivity.this.L.get(0)).getItemType() == 0) {
                    i10 = 1;
                }
                BanItemWrapperObj banItemWrapperObj2 = new BanItemWrapperObj();
                banItemWrapperObj2.setItemType(1);
                banItemWrapperObj2.setTopic(this.f77500b);
                BansSettingsActivity.this.L.add(i10, banItemWrapperObj2);
                BansSettingsActivity.this.M.notifyItemInserted(i10);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22465, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22466, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f77503b;

        h(BBSTopicObj bBSTopicObj) {
            this.f77503b = bBSTopicObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22467, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            BansSettingsActivity.a2(BansSettingsActivity.this, this.f77503b);
            dialogInterface.dismiss();
        }
    }

    public class i extends com.max.hbcommon.base.adapter.u<BanItemWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22474, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                BansSettingsActivity bansSettingsActivity = BansSettingsActivity.this;
                bansSettingsActivity.startActivityForResult(ChooseTopicsActivity.b2(((BaseActivity) bansSettingsActivity).f66601b, "feedback", new ArrayList(), 1), 5);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f77507b;

            public class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22476, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.BansSettingsActivity$i$b$b, reason: collision with other inner class name */
            public class DialogInterfaceOnClickListenerC0636b implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                DialogInterfaceOnClickListenerC0636b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22477, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    b bVar = b.this;
                    BansSettingsActivity.e2(BansSettingsActivity.this, bVar.f77507b.getTopic_id());
                    dialogInterface.dismiss();
                }
            }

            b(BBSTopicObj bBSTopicObj) {
                this.f77507b = bBSTopicObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22475, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                new com.max.hbcommon.view.a.f(((BaseActivity) BansSettingsActivity.this).f66601b).y(String.format(BansSettingsActivity.this.getString(R.string.ban_confirm_format), this.f77507b.getName())).t(R.string.remove, new DialogInterfaceOnClickListenerC0636b()).n(R.string.cancel, new a()).F();
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f77511b;

            c(BBSTopicObj bBSTopicObj) {
                this.f77511b = bBSTopicObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22478, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.H(((BaseActivity) BansSettingsActivity.this).f66601b, this.f77511b);
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f77513b;

            public class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22480, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            public class b implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22481, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    d dVar = d.this;
                    BansSettingsActivity.R1(BansSettingsActivity.this, dVar.f77513b.getUserid());
                    dialogInterface.dismiss();
                }
            }

            d(BBSUserInfoObj bBSUserInfoObj) {
                this.f77513b = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22479, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                new com.max.hbcommon.view.a.f(((BaseActivity) BansSettingsActivity.this).f66601b).y(String.format(BansSettingsActivity.this.getString(R.string.ban_confirm_format), this.f77513b.getUsername())).t(R.string.remove, new b()).n(R.string.cancel, new a()).F();
            }
        }

        public class e implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f77517b;

            e(BBSUserInfoObj bBSUserInfoObj) {
                this.f77517b = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22482, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((BaseActivity) BansSettingsActivity.this).f66601b, this.f77517b.getUserid()).A();
            }
        }

        public i() {
            super(((BaseActivity) BansSettingsActivity.this).f66601b, BansSettingsActivity.this.L);
        }

        private void p(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 22470, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_remove);
            com.max.hbimage.b.K(bBSTopicObj.getPic_url(), imageView);
            textView.setText(bBSTopicObj.getName());
            textView2.setOnClickListener(new b(bBSTopicObj));
            eVar.b().setOnClickListener(new c(bBSTopicObj));
        }

        private void q(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 22471, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_remove);
            com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            textView.setText(bBSUserInfoObj.getUsername());
            textView2.setOnClickListener(new d(bBSUserInfoObj));
            eVar.b().setOnClickListener(new e(bBSUserInfoObj));
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, BanItemWrapperObj banItemWrapperObj) {
            Object[] objArr = {new Integer(i10), banItemWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22472, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, banItemWrapperObj);
        }

        public int n(int i10, BanItemWrapperObj banItemWrapperObj) {
            Object[] objArr = {new Integer(i10), banItemWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22468, new Class[]{cls, BanItemWrapperObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (banItemWrapperObj.getItemType() == 0) {
                return R.layout.item_bans_title;
            }
            if (1 == banItemWrapperObj.getItemType()) {
                return R.layout.item_bans_topic;
            }
            if (2 == banItemWrapperObj.getItemType()) {
                return R.layout.item_bans_user;
            }
            if (3 == banItemWrapperObj.getItemType()) {
                return R.layout.item_bans_add_topic;
            }
            return 0;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, BanItemWrapperObj banItemWrapperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, banItemWrapperObj}, this, changeQuickRedirect, false, 22469, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BanItemWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (R.layout.item_bans_title == eVar.d()) {
                eVar.p(R.id.tv_title, banItemWrapperObj.getTitle());
                eVar.i(R.id.vg_more).setVisibility(8);
            } else if (R.layout.item_bans_topic == eVar.d()) {
                p(eVar, banItemWrapperObj.getTopic());
            } else if (R.layout.item_bans_user == eVar.d()) {
                q(eVar, banItemWrapperObj.getUser());
            } else if (R.layout.item_bans_add_topic == eVar.d()) {
                eVar.i(R.id.vg_add).setOnClickListener(new a());
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 22473, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (BanItemWrapperObj) obj);
        }
    }

    static /* synthetic */ void N1(BansSettingsActivity bansSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity}, null, changeQuickRedirect, true, 22447, new Class[]{BansSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.i2();
    }

    static /* synthetic */ void R1(BansSettingsActivity bansSettingsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity, str}, null, changeQuickRedirect, true, 22452, new Class[]{BansSettingsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.m2(str);
    }

    static /* synthetic */ void W1(BansSettingsActivity bansSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity}, null, changeQuickRedirect, true, 22448, new Class[]{BansSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.C1();
    }

    static /* synthetic */ void X1(BansSettingsActivity bansSettingsActivity, BlockListObj blockListObj) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity, blockListObj}, null, changeQuickRedirect, true, 22449, new Class[]{BansSettingsActivity.class, BlockListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.j2(blockListObj);
    }

    static /* synthetic */ void a2(BansSettingsActivity bansSettingsActivity, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity, bBSTopicObj}, null, changeQuickRedirect, true, 22450, new Class[]{BansSettingsActivity.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.f2(bBSTopicObj);
    }

    static /* synthetic */ void e2(BansSettingsActivity bansSettingsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{bansSettingsActivity, str}, null, changeQuickRedirect, true, 22451, new Class[]{BansSettingsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bansSettingsActivity.l2(str);
    }

    private void f2(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 22442, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Sb(bBSTopicObj.getTopic_id()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(bBSTopicObj)));
    }

    public static Intent h2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22437, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) BansSettingsActivity.class);
    }

    private void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22439, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void j2(BlockListObj blockListObj) {
        if (PatchProxy.proxy(new Object[]{blockListObj}, this, changeQuickRedirect, false, 22443, new Class[]{BlockListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (blockListObj == null) {
            return;
        }
        this.L.clear();
        List<BBSTopicObj> block_topics = blockListObj.getBlock_topics();
        if (!com.max.hbcommon.utils.c.w(block_topics)) {
            BanItemWrapperObj banItemWrapperObj = new BanItemWrapperObj();
            banItemWrapperObj.setItemType(0);
            banItemWrapperObj.setTitle(getString(R.string.banned_topic));
            this.L.add(banItemWrapperObj);
            for (BBSTopicObj bBSTopicObj : block_topics) {
                BanItemWrapperObj banItemWrapperObj2 = new BanItemWrapperObj();
                banItemWrapperObj2.setItemType(1);
                banItemWrapperObj2.setTopic(bBSTopicObj);
                this.L.add(banItemWrapperObj2);
            }
        }
        BanItemWrapperObj banItemWrapperObj3 = new BanItemWrapperObj();
        banItemWrapperObj3.setItemType(3);
        this.L.add(banItemWrapperObj3);
        List<BBSUserInfoObj> block_users = blockListObj.getBlock_users();
        if (!com.max.hbcommon.utils.c.w(block_users)) {
            BanItemWrapperObj banItemWrapperObj4 = new BanItemWrapperObj();
            banItemWrapperObj4.setItemType(0);
            banItemWrapperObj4.setTitle(getString(R.string.banned_author));
            this.L.add(banItemWrapperObj4);
            for (BBSUserInfoObj bBSUserInfoObj : block_users) {
                BanItemWrapperObj banItemWrapperObj5 = new BanItemWrapperObj();
                banItemWrapperObj5.setItemType(2);
                banItemWrapperObj5.setUser(bBSUserInfoObj);
                this.L.add(banItemWrapperObj5);
            }
        }
        this.M.notifyDataSetChanged();
    }

    private void k2(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 22444, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported || isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(String.format(getString(R.string.ban_topic_confirm_format), bBSTopicObj.getName())).t(R.string.screen, new h(bBSTopicObj)).n(R.string.cancel, new g()).F();
    }

    private void l2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22440, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private void m2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22441, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str)));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22438, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.f66616q.setTitle(R.string.bans_settings);
        this.f66617r.setVisibility(0);
        this.f66616q.setActionIcon(R.drawable.ic_0icon_action_faq_24);
        this.f66616q.setActionIconOnClickListener(new a());
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        i iVar = new i();
        this.M = iVar;
        this.mRecyclerView.setAdapter(iVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.b0(false);
        E1();
        i2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22445, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        i2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        ArrayList arrayList;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22446, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != 5 || i11 != -1 || intent == null || (arrayList = (ArrayList) intent.getSerializableExtra("choosed_topics")) == null || arrayList.size() <= 0) {
            return;
        }
        k2((BBSTopicObj) arrayList.get(0));
    }
}
