package com.max.xiaoheihe.module.game;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.ApkMgrObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class AppDownloadFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f84012c;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ApkMgrObj> f84011b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.b f84013d = new com.max.xiaoheihe.module.game.b();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            int itemType;
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32207, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, 12.0f);
            int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, 10.0f);
            if (childAdapterPosition >= AppDownloadFragment.this.f84011b.size() || !((itemType = ((ApkMgrObj) AppDownloadFragment.this.f84011b.get(childAdapterPosition)).getItemType()) == 1 || itemType == 2)) {
                rect.set(iF, iF2, iF, iF2);
            } else {
                rect.set(iF, 0, iF, 0);
            }
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32208, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            AppDownloadFragment.this.r4();
            AppDownloadFragment.this.mRefreshLayout.P();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32209, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32210, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            for (ApkMgrObj apkMgrObj : AppDownloadFragment.this.f84011b) {
                if (apkMgrObj.getTask() != null && apkMgrObj.getTask().f64853b.f64785k == 5) {
                    apkMgrObj.getTask().s();
                }
            }
            AppDownloadFragment.this.r4();
            dialogInterface.dismiss();
        }
    }

    public class e implements Comparator<com.lzy.okserver.download.b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public int a(com.lzy.okserver.download.b bVar, com.lzy.okserver.download.b bVar2) {
            int i10 = bVar.f64853b.f64785k;
            if (i10 == 5 || bVar2.f64853b.f64785k == 5) {
                return i10 - bVar2.f64853b.f64785k;
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.lzy.okserver.download.b bVar, com.lzy.okserver.download.b bVar2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, bVar2}, this, changeQuickRedirect, false, 32211, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(bVar, bVar2);
        }
    }

    public class f extends com.max.hbcommon.base.adapter.u<ApkMgrObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32216, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                AppDownloadFragment.m4(AppDownloadFragment.this);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.lzy.okserver.download.b f84021b;

            b(com.lzy.okserver.download.b bVar) {
                this.f84021b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32217, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                la.c.p(this.f84021b.f64853b.f64779e);
                AppDownloadFragment.this.r4();
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84023b;

            c(String str) {
                this.f84023b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32218, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.d.S1(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, this.f84023b);
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.lzy.okserver.download.b f84025b;

            d(com.lzy.okserver.download.b bVar) {
                this.f84025b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32219, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                la.c.p(this.f84025b.f64853b.f64779e);
                AppDownloadFragment.this.r4();
            }
        }

        public class e implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.lzy.okserver.download.b f84027b;

            e(com.lzy.okserver.download.b bVar) {
                this.f84027b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32220, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.d.e(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, this.f84027b.f64853b.f64776b);
                com.max.xiaoheihe.utils.d.G0(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, this.f84027b.f64853b);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.AppDownloadFragment$f$f, reason: collision with other inner class name */
        public class ViewOnClickListenerC0744f implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84029b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameObj f84030c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.AppDownloadFragment$f$f$a */
            public class a implements com.max.hbcommon.utils.i.c {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // com.max.hbcommon.utils.i.c
                public void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32222, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.xiaoheihe.module.game.b bVar = AppDownloadFragment.this.f84013d;
                    ViewOnClickListenerC0744f viewOnClickListenerC0744f = ViewOnClickListenerC0744f.this;
                    bVar.q(viewOnClickListenerC0744f.f84029b, viewOnClickListenerC0744f.f84030c, true, null);
                }

                @Override // com.max.hbcommon.utils.i.c
                public void b() {
                }
            }

            ViewOnClickListenerC0744f(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
                this.f84029b = eVar;
                this.f84030c = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32221, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.i.a(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, new a());
            }
        }

        public class g implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f84033b;

            g(GameObj gameObj) {
                this.f84033b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32223, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, this.f84033b.getH_src(), r1.Z(this.f84033b), this.f84033b.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            }
        }

        public f() {
            super(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext, AppDownloadFragment.this.f84011b);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, ApkMgrObj apkMgrObj) {
            Object[] objArr = {new Integer(i10), apkMgrObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32214, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, apkMgrObj);
        }

        public int n(int i10, ApkMgrObj apkMgrObj) {
            Object[] objArr = {new Integer(i10), apkMgrObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32212, new Class[]{cls, ApkMgrObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (1 == apkMgrObj.getItemType() || 2 == apkMgrObj.getItemType()) ? R.layout.component_2_col_l_title_16 : R.layout.item_apk_mgr;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, ApkMgrObj apkMgrObj) {
            if (PatchProxy.proxy(new Object[]{eVar, apkMgrObj}, this, changeQuickRedirect, false, 32213, new Class[]{com.max.hbcommon.base.adapter.s.e.class, ApkMgrObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (1 == apkMgrObj.getItemType()) {
                TextView textView = (TextView) eVar.i(R.id.tv_title);
                View viewI = eVar.i(R.id.vg_more);
                textView.setText(R.string.downloading);
                viewI.setVisibility(8);
                return;
            }
            if (2 == apkMgrObj.getItemType()) {
                TextView textView2 = (TextView) eVar.i(R.id.tv_title);
                View viewI2 = eVar.i(R.id.vg_more);
                TextView textView3 = (TextView) eVar.i(R.id.tv_more);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_more);
                textView2.setText(R.string.download_history);
                viewI2.setVisibility(0);
                textView2.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.download_history));
                textView3.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.clear));
                imageView.setVisibility(8);
                viewI2.setOnClickListener(new a());
                return;
            }
            View viewB = eVar.b();
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView4 = (TextView) eVar.i(R.id.tv_name);
            TextView textView5 = (TextView) eVar.i(R.id.tv_download);
            TextView textView6 = (TextView) eVar.i(R.id.tv_progress_btn_left);
            TextView textView7 = (TextView) eVar.i(R.id.tv_progress_btn_right);
            TextView textView8 = (TextView) eVar.i(R.id.tv_progress);
            ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_download);
            com.lzy.okserver.download.b task = apkMgrObj.getTask();
            GameObj gameObj = (GameObj) task.f64853b.f64789o;
            String bundle_id = gameObj.getBundle_id();
            com.max.hbimage.b.K(gameObj.getAppicon(), imageView2);
            textView4.setText(gameObj.getName());
            if (com.max.xiaoheihe.module.game.c.i(bundle_id)) {
                textView5.setVisibility(8);
                textView7.setVisibility(0);
                progressBar.setVisibility(8);
                if (textView8 != null) {
                    textView8.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    textView8.setTextSize(0, ((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                    textView8.setVisibility(0);
                    textView8.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.download_completed));
                }
                if (com.max.hbcommon.utils.f.g(task.f64853b.f64779e)) {
                    textView6.setVisibility(0);
                    textView6.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                    textView6.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    textView6.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.delete_apk_file));
                    textView6.setOnClickListener(new b(task));
                } else {
                    textView6.setVisibility(8);
                }
                textView7.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                textView7.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                textView7.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.uninstall));
                textView7.setOnClickListener(new c(bundle_id));
            } else if (task.f64853b.f64785k == 5) {
                textView5.setVisibility(8);
                textView7.setVisibility(0);
                progressBar.setVisibility(8);
                if (textView8 != null) {
                    textView8.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    textView8.setTextSize(0, ((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                    textView8.setVisibility(0);
                    textView8.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.download_completed));
                }
                if (com.max.hbcommon.utils.f.g(task.f64853b.f64779e)) {
                    textView6.setVisibility(0);
                    textView6.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                    textView6.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    textView6.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.delete_apk_file));
                    textView6.setOnClickListener(new d(task));
                    textView7.setBackgroundResource(R.drawable.btn_primary_2dp);
                    textView7.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.white));
                    textView7.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.install_app));
                    textView7.setOnClickListener(new e(task));
                } else {
                    textView6.setVisibility(8);
                    textView7.setBackgroundResource(R.drawable.btn_primary_2dp);
                    textView7.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.white));
                    textView7.setText(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getString(R.string.download));
                    textView7.setOnClickListener(new ViewOnClickListenerC0744f(eVar, gameObj));
                }
            } else {
                textView6.setBackgroundResource(R.drawable.btn_primary_2dp);
                textView6.setTextColor(((com.max.hbcommon.base.d) AppDownloadFragment.this).mContext.getResources().getColor(R.color.white));
                AppDownloadFragment.this.f84013d.e(eVar, gameObj, true);
            }
            viewB.setOnClickListener(new g(gameObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 32215, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (ApkMgrObj) obj);
        }
    }

    static /* synthetic */ void m4(AppDownloadFragment appDownloadFragment) {
        if (PatchProxy.proxy(new Object[]{appDownloadFragment}, null, changeQuickRedirect, true, 32206, new Class[]{AppDownloadFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        appDownloadFragment.s4();
    }

    public static AppDownloadFragment q4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32200, new Class[0], AppDownloadFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppDownloadFragment) patchProxyResultProxy.result;
        }
        AppDownloadFragment appDownloadFragment = new AppDownloadFragment();
        appDownloadFragment.setArguments(new Bundle());
        return appDownloadFragment;
    }

    private void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32205, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.prompt).k(R.string.clear_all_finished_apk).t(R.string.clear, new d()).n(R.string.cancel, new c()).F();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32201, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.setBackgroundColor(getResources().getColor(R.color.white));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addItemDecoration(new a());
        f fVar = new f();
        this.f84012c = fVar;
        this.mRecyclerView.setAdapter(fVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.b0(false);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84013d.g();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32202, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        r4();
    }

    public void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32204, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84011b.clear();
        ArrayList<com.lzy.okserver.download.b> arrayList = new ArrayList();
        Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        Collections.sort(arrayList, new e());
        for (com.lzy.okserver.download.b bVar : arrayList) {
            ApkMgrObj apkMgrObj = new ApkMgrObj();
            apkMgrObj.setItemType(0);
            apkMgrObj.setTask(bVar);
            this.f84011b.add(apkMgrObj);
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < this.f84011b.size(); i12++) {
            ApkMgrObj apkMgrObj2 = this.f84011b.get(i12);
            if (apkMgrObj2.getItemType() == 0 && apkMgrObj2.getTask() != null) {
                if (apkMgrObj2.getTask().f64853b.f64785k != 5 && i11 == -1) {
                    i11 = i12;
                } else if (apkMgrObj2.getTask().f64853b.f64785k == 5 && i10 == -1) {
                    i10 = i12;
                }
            }
        }
        if (i10 != -1) {
            ApkMgrObj apkMgrObj3 = new ApkMgrObj();
            apkMgrObj3.setItemType(2);
            this.f84011b.add(i10, apkMgrObj3);
        }
        if (i11 != -1) {
            ApkMgrObj apkMgrObj4 = new ApkMgrObj();
            apkMgrObj4.setItemType(1);
            this.f84011b.add(i11, apkMgrObj4);
        }
        f fVar = this.f84012c;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
        if (this.f84011b.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
    }
}
