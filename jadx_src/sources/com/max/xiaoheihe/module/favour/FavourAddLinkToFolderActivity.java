package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObj;
import com.max.xiaoheihe.bean.favour.FavouredLinkObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.da0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourAddLinkToFolderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourAddLinkToFolderActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAddLinkToFolderActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
@o(parameters = 0)
public final class FavourAddLinkToFolderActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;

    @dl.d
    private static final String T = "folder_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String L;
    private da0 M;

    @dl.e
    private com.max.xiaoheihe.module.favour.e N;

    @dl.d
    private final ArrayList<BBSLinkObj> O = new ArrayList<>();

    @dl.e
    private com.max.hbcommon.base.e P;
    private int Q;

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d String folderId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, folderId}, this, changeQuickRedirect, false, 31646, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(folderId, "folderId");
            Intent intent = new Intent(context, (Class<?>) FavourAddLinkToFolderActivity.class);
            intent.putExtra("folder_id", folderId);
            return intent;
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    @t0({"SMAP\nFavourAddLinkToFolderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourAddLinkToFolderActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAddLinkToFolderActivity$getFavourLinkList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1603#2,9:267\n1855#2:276\n1856#2:278\n1612#2:279\n1#3:277\n*S KotlinDebug\n*F\n+ 1 FavourAddLinkToFolderActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAddLinkToFolderActivity$getFavourLinkList$1\n*L\n140#1:267,9\n140#1:276\n140#1:278\n140#1:279\n140#1:277\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<CollectionFolderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31647, new Class[0], Void.TYPE).isSupported && FavourAddLinkToFolderActivity.this.isActive()) {
                super.onComplete();
                da0 da0Var = FavourAddLinkToFolderActivity.this.M;
                da0 da0Var2 = null;
                if (da0Var == null) {
                    f0.S("binding");
                    da0Var = null;
                }
                da0Var.f109709c.A(0);
                da0 da0Var3 = FavourAddLinkToFolderActivity.this.M;
                if (da0Var3 == null) {
                    f0.S("binding");
                } else {
                    da0Var2 = da0Var3;
                }
                da0Var2.f109709c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31648, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourAddLinkToFolderActivity.this.isActive()) {
                super.onError(e10);
                FavourAddLinkToFolderActivity.W1(FavourAddLinkToFolderActivity.this);
                da0 da0Var = FavourAddLinkToFolderActivity.this.M;
                da0 da0Var2 = null;
                if (da0Var == null) {
                    f0.S("binding");
                    da0Var = null;
                }
                da0Var.f109709c.A(0);
                da0 da0Var3 = FavourAddLinkToFolderActivity.this.M;
                if (da0Var3 == null) {
                    f0.S("binding");
                } else {
                    da0Var2 = da0Var3;
                }
                da0Var2.f109709c.p(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolderDetailObj> collectionFolderResult) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{collectionFolderResult}, this, changeQuickRedirect, false, 31649, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(collectionFolderResult, "collectionFolderResult");
            CollectionFolderDetailObj result = collectionFolderResult.getResult();
            if (!FavourAddLinkToFolderActivity.this.isActive() || result == null) {
                return;
            }
            List<FavouredLinkObj> links = result.getLinks();
            if (links != null) {
                arrayList = new ArrayList();
                Iterator<T> it = links.iterator();
                while (it.hasNext()) {
                    BBSLinkObj link = ((FavouredLinkObj) it.next()).getLink();
                    if (link != null) {
                        arrayList.add(link);
                    }
                }
            } else {
                arrayList = null;
            }
            FavourAddLinkToFolderActivity.X1(FavourAddLinkToFolderActivity.this, arrayList);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31650, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class c implements l0.h<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomButtonLeftItemView f83645a;

        c(BottomButtonLeftItemView bottomButtonLeftItemView) {
            this.f83645a = bottomButtonLeftItemView;
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public /* bridge */ /* synthetic */ void a(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31653, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            d(bBSLinkObj);
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public /* bridge */ /* synthetic */ void b(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31654, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            c(bBSLinkObj);
        }

        public void c(@dl.e BBSLinkObj bBSLinkObj) {
            BottomButtonLeftItemView bottomButtonLeftItemView;
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31652, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported || (bottomButtonLeftItemView = this.f83645a) == null) {
                return;
            }
            bottomButtonLeftItemView.setChecked(false, false);
        }

        public void d(@dl.e BBSLinkObj bBSLinkObj) {
            BottomButtonLeftItemView bottomButtonLeftItemView;
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31651, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported || (bottomButtonLeftItemView = this.f83645a) == null) {
                return;
            }
            bottomButtonLeftItemView.setChecked(true, false);
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class d implements BottomButtonLeftItemView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView.a
        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31655, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = FavourAddLinkToFolderActivity.this.O.iterator();
            while (it.hasNext()) {
                ((BBSLinkObj) it.next()).setChecked(z10);
            }
            if (z10) {
                com.max.xiaoheihe.module.favour.e eVar = FavourAddLinkToFolderActivity.this.N;
                if (eVar != null) {
                    eVar.b(FavourAddLinkToFolderActivity.this.O.size());
                }
            } else {
                com.max.xiaoheihe.module.favour.e eVar2 = FavourAddLinkToFolderActivity.this.N;
                if (eVar2 != null) {
                    eVar2.b(0);
                }
            }
            com.max.xiaoheihe.module.favour.e eVar3 = FavourAddLinkToFolderActivity.this.N;
            if (eVar3 != null) {
                eVar3.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31656, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = "";
            String str2 = str;
            for (BBSLinkObj bBSLinkObj : FavourAddLinkToFolderActivity.this.O) {
                if (bBSLinkObj.isChecked()) {
                    if (!f0.g(str, "")) {
                        str = str + ',';
                    }
                    str = str + bBSLinkObj.getLinkid();
                    if (!f0.g(str2, "")) {
                        str2 = str2 + ',';
                    }
                    str2 = str2 + bBSLinkObj.getH_src();
                }
            }
            if (com.max.hbcommon.utils.c.u(str)) {
                return;
            }
            FavourAddLinkToFolderActivity.T1(FavourAddLinkToFolderActivity.this, str);
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class f extends com.max.hbcommon.base.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RecyclerView recyclerView) {
            super(recyclerView);
            f0.o(recyclerView, "this@with");
        }

        @Override // com.max.hbcommon.base.e
        public boolean b(int i10, @dl.e View view) {
            CheckBox checkBox;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 31657, new Class[]{Integer.TYPE, View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            super.b(i10, view);
            if (view != null && (checkBox = (CheckBox) view.findViewById(R.id.f76243cb)) != null) {
                checkBox.performClick();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31658, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourAddLinkToFolderActivity.this.Q = 0;
            FavourAddLinkToFolderActivity.N1(FavourAddLinkToFolderActivity.this);
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class h implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31659, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourAddLinkToFolderActivity.this.Q += 30;
            FavourAddLinkToFolderActivity.N1(FavourAddLinkToFolderActivity.this);
        }
    }

    /* JADX INFO: compiled from: FavourAddLinkToFolderActivity.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31661, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourAddLinkToFolderActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31660, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FavourAddLinkToFolderActivity.this.isActive()) {
                com.max.hbutils.utils.c.f("添加成功");
                FavourAddLinkToFolderActivity.this.setResult(-1);
                FavourAddLinkToFolderActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31662, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public static final /* synthetic */ void N1(FavourAddLinkToFolderActivity favourAddLinkToFolderActivity) {
        if (PatchProxy.proxy(new Object[]{favourAddLinkToFolderActivity}, null, changeQuickRedirect, true, 31645, new Class[]{FavourAddLinkToFolderActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        favourAddLinkToFolderActivity.Y1();
    }

    public static final /* synthetic */ void T1(FavourAddLinkToFolderActivity favourAddLinkToFolderActivity, String str) {
        if (PatchProxy.proxy(new Object[]{favourAddLinkToFolderActivity, str}, null, changeQuickRedirect, true, 31644, new Class[]{FavourAddLinkToFolderActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        favourAddLinkToFolderActivity.b2(str);
    }

    public static final /* synthetic */ void W1(FavourAddLinkToFolderActivity favourAddLinkToFolderActivity) {
        if (PatchProxy.proxy(new Object[]{favourAddLinkToFolderActivity}, null, changeQuickRedirect, true, 31642, new Class[]{FavourAddLinkToFolderActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        favourAddLinkToFolderActivity.C1();
    }

    public static final /* synthetic */ void X1(FavourAddLinkToFolderActivity favourAddLinkToFolderActivity, List list) {
        if (PatchProxy.proxy(new Object[]{favourAddLinkToFolderActivity, list}, null, changeQuickRedirect, true, 31643, new Class[]{FavourAddLinkToFolderActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        favourAddLinkToFolderActivity.c2(list);
    }

    @SuppressLint({"AutoDispose"})
    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31637, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C8(this.L, Integer.valueOf(this.Q), 30, 1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31639, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.f66602c;
        da0 da0Var = this.M;
        da0 da0Var2 = null;
        if (da0Var == null) {
            f0.S("binding");
            da0Var = null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_bar_multi_op, (ViewGroup) da0Var.f109710d, false);
        BottomButtonLeftItemView bottomButtonLeftItemView = viewInflate != null ? (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bottom_button) : null;
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setShowLeftButton(false);
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightText("确认添加");
        }
        com.max.xiaoheihe.module.favour.e eVar = this.N;
        if (eVar != null) {
            eVar.g(new c(bottomButtonLeftItemView));
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setCheckboxListener(new d());
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightClickListener(new e());
        }
        da0 da0Var3 = this.M;
        if (da0Var3 == null) {
            f0.S("binding");
        } else {
            da0Var2 = da0Var3;
        }
        da0Var2.f109710d.addView(viewInflate);
        com.max.xiaoheihe.module.favour.e eVar2 = this.N;
        if (eVar2 != null) {
            eVar2.a();
        }
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31636, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.N = new com.max.xiaoheihe.module.favour.e(mContext, this.O);
        da0 da0Var = this.M;
        da0 da0Var2 = null;
        if (da0Var == null) {
            f0.S("binding");
            da0Var = null;
        }
        RecyclerView initRecyclerView$lambda$0 = da0Var.f109708b;
        initRecyclerView$lambda$0.setClipToPadding(false);
        initRecyclerView$lambda$0.setClipChildren(false);
        initRecyclerView$lambda$0.setLayoutManager(new LinearLayoutManager(this.f66601b, 1, false));
        initRecyclerView$lambda$0.setAdapter(this.N);
        f fVar = new f(initRecyclerView$lambda$0);
        this.P = fVar;
        f0.o(initRecyclerView$lambda$0, "initRecyclerView$lambda$0");
        initRecyclerView$lambda$0.addOnItemTouchListener(fVar);
        da0 da0Var3 = this.M;
        if (da0Var3 == null) {
            f0.S("binding");
        } else {
            da0Var2 = da0Var3;
        }
        SmartRefreshLayout smartRefreshLayout = da0Var2.f109709c;
        smartRefreshLayout.S(new g());
        smartRefreshLayout.f0(new h());
    }

    @SuppressLint({"AutoDispose"})
    private final void b2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31640, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((i) com.max.xiaoheihe.network.i.a().a7(this.L, str, 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void c2(List<? extends BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31638, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (list != null) {
            if (this.Q == 0) {
                this.O.clear();
                com.max.xiaoheihe.module.favour.e eVar = this.N;
                if (eVar != null) {
                    eVar.b(0);
                }
                da0 da0Var = this.M;
                if (da0Var == null) {
                    f0.S("binding");
                    da0Var = null;
                }
                CheckBox checkBox = (CheckBox) da0Var.f109710d.findViewById(R.id.cb_all);
                if (checkBox != null) {
                    checkBox.setChecked(false);
                }
            }
            this.O.addAll(list);
            com.max.xiaoheihe.module.favour.e eVar2 = this.N;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
        }
        if (this.O.isEmpty()) {
            A1(R.drawable.common_tag_common_45x45, R.string.empty_content);
        } else {
            x1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31635, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        da0 da0VarC = da0.c(this.f66602c);
        f0.o(da0VarC, "inflate(mInflater)");
        this.M = da0VarC;
        if (da0VarC == null) {
            f0.S("binding");
            da0VarC = null;
        }
        setContentView(da0VarC.b());
        getWindow().setFormat(-3);
        t.h0(getWindow());
        t.M(this.f66601b, true);
        int iN = t.n(this.f66601b);
        View viewZ0 = Z0();
        f0.n(viewZ0, "null cannot be cast to non-null type android.view.ViewGroup");
        t.c(iN, (ViewGroup) viewZ0, null);
        this.f66617r.setVisibility(0);
        this.f66617r.setBackgroundColor(androidx.core.content.res.i.e(getResources(), R.color.divider_secondary_2_color, null));
        this.f66616q.setTitle(FavourLinkFolderActivity.X);
        this.f66616q.a0();
        a2();
        Z1();
        E1();
        Y1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31634, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        this.L = intent != null ? intent.getStringExtra("folder_id") : null;
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.hbcommon.base.e eVar = this.P;
        if (eVar != null) {
            da0 da0Var = this.M;
            if (da0Var == null) {
                f0.S("binding");
                da0Var = null;
            }
            RecyclerView recyclerView = da0Var.f109708b;
            f0.o(recyclerView, "binding.rv");
            recyclerView.removeOnItemTouchListener(eVar);
        }
    }
}
