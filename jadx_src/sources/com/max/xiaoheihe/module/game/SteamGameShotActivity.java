package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.max.xiaoheihe.bean.game.GameShotListObj;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderListObj;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderObj;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.max.xiaoheihe.utils.imageviewer.ui.GameShotUICustomizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SteamGameShotActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.D3)
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.D3})
public final class SteamGameShotActivity extends BaseActivity {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    public static final a f85394b0 = new a(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f85395c0 = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    public static final String f85396p1 = "user_id";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final String f85397x1 = "steam_id";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f85398y1 = 160;
    private df.d2 L;

    @dl.e
    private String M;

    @dl.e
    private String N;

    @dl.e
    private com.max.xiaoheihe.module.game.adapter.y O;
    private int R;
    private boolean T;
    private boolean U;

    @dl.e
    private String V;

    @dl.e
    private com.max.xiaoheihe.module.game.component.c W;

    @dl.e
    private LoadingDialog X;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f85399a0;

    @dl.d
    private final ArrayList<GameScreenPicShotObj> P = new ArrayList<>();

    @dl.d
    private final ArrayList<GameShotPictureFolderObj> Q = new ArrayList<>();
    private final int S = 30;

    @dl.d
    private final kotlinx.coroutines.q0 Y = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.c());

    @dl.d
    private final kotlinx.coroutines.q0 Z = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e());

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 35197, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) SteamGameShotActivity.class);
            intent.putExtra("user_id", str);
            intent.putExtra("steam_id", str2);
            return intent;
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<GameShotPictureFolderListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35199, new Class[0], Void.TYPE).isSupported && SteamGameShotActivity.this.isActive()) {
                super.onComplete();
                LoadingDialog loadingDialog = SteamGameShotActivity.this.X;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35198, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SteamGameShotActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = SteamGameShotActivity.this.X;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<GameShotPictureFolderListObj> result) {
            com.max.xiaoheihe.module.game.adapter.f0 f0VarB;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35200, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SteamGameShotActivity.this.isActive()) {
                super.onNext(result);
                SteamGameShotActivity.this.Q.clear();
                if (result.getResult() != null) {
                    GameShotPictureFolderListObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    if (!com.max.hbcommon.utils.c.w(result2.getInfos())) {
                        ArrayList arrayList = SteamGameShotActivity.this.Q;
                        GameShotPictureFolderListObj result3 = result.getResult();
                        kotlin.jvm.internal.f0.m(result3);
                        List<GameShotPictureFolderObj> infos = result3.getInfos();
                        kotlin.jvm.internal.f0.m(infos);
                        arrayList.addAll(infos);
                    }
                }
                com.max.xiaoheihe.module.game.component.c cVar = SteamGameShotActivity.this.W;
                if (cVar == null || (f0VarB = cVar.b()) == null) {
                    return;
                }
                f0VarB.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35201, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameShotPictureFolderListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<GameShotListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35203, new Class[0], Void.TYPE).isSupported && SteamGameShotActivity.this.isActive()) {
                SteamGameShotActivity.M1(SteamGameShotActivity.this);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35202, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SteamGameShotActivity.this.isActive()) {
                super.onError(e10);
                SteamGameShotActivity.k2(SteamGameShotActivity.this);
                SteamGameShotActivity.M1(SteamGameShotActivity.this);
            }
        }

        public void onNext(@dl.d Result<GameShotListObj> result) {
            com.max.xiaoheihe.module.game.adapter.f0 f0VarB;
            GameShotPictureFolderObj current_folder;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35204, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SteamGameShotActivity.this.isActive()) {
                super.onNext(result);
                df.d2 d2Var = null;
                if (SteamGameShotActivity.this.R == 0) {
                    df.d2 d2Var2 = SteamGameShotActivity.this.L;
                    if (d2Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        d2Var2 = null;
                    }
                    TextView textView = d2Var2.f109588f;
                    GameShotListObj result2 = result.getResult();
                    textView.setText((result2 == null || (current_folder = result2.getCurrent_folder()) == null) ? null : current_folder.getName());
                    SteamGameShotActivity.this.P.clear();
                    SteamGameShotActivity.this.U = true;
                    df.d2 d2Var3 = SteamGameShotActivity.this.L;
                    if (d2Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        d2Var3 = null;
                    }
                    d2Var3.f109587e.b0(true);
                }
                com.max.xiaoheihe.module.game.component.c cVar = SteamGameShotActivity.this.W;
                if (((cVar == null || (f0VarB = cVar.b()) == null) ? null : f0VarB.n()) == null) {
                    com.max.xiaoheihe.module.game.component.c cVar2 = SteamGameShotActivity.this.W;
                    com.max.xiaoheihe.module.game.adapter.f0 f0VarB2 = cVar2 != null ? cVar2.b() : null;
                    if (f0VarB2 != null) {
                        GameShotListObj result3 = result.getResult();
                        f0VarB2.q(result3 != null ? result3.getCurrent_folder() : null);
                    }
                }
                if (result.getResult() != null) {
                    GameShotListObj result4 = result.getResult();
                    kotlin.jvm.internal.f0.m(result4);
                    if (!com.max.hbcommon.utils.c.w(result4.getScreen_shots())) {
                        SteamGameShotActivity steamGameShotActivity = SteamGameShotActivity.this;
                        GameShotListObj result5 = result.getResult();
                        kotlin.jvm.internal.f0.m(result5);
                        List<GameScreenPicShotObj> screen_shots = result5.getScreen_shots();
                        kotlin.jvm.internal.f0.m(screen_shots);
                        SteamGameShotActivity.l2(steamGameShotActivity, screen_shots);
                        SteamGameShotActivity.j2(SteamGameShotActivity.this, false);
                        SteamGameShotActivity.i2(SteamGameShotActivity.this);
                        return;
                    }
                }
                if (SteamGameShotActivity.this.R == 0) {
                    SteamGameShotActivity.j2(SteamGameShotActivity.this, true);
                    return;
                }
                SteamGameShotActivity.this.U = false;
                df.d2 d2Var4 = SteamGameShotActivity.this.L;
                if (d2Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    d2Var = d2Var4;
                }
                d2Var.f109587e.b0(false);
                SteamGameShotActivity.n2(SteamGameShotActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35205, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameShotListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class d implements com.max.xiaoheihe.module.game.adapter.e0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.e0
        public void a(@dl.d GameShotPictureFolderObj data, int i10) {
            com.max.xiaoheihe.module.game.component.c cVar;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 35207, new Class[]{GameShotPictureFolderObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            df.d2 d2Var = SteamGameShotActivity.this.L;
            if (d2Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                d2Var = null;
            }
            d2Var.f109588f.setText(data.getName());
            SteamGameShotActivity.this.V = data.getAppid();
            SteamGameShotActivity.this.R = 0;
            SteamGameShotActivity.R1(SteamGameShotActivity.this);
            com.max.xiaoheihe.module.game.component.c cVar2 = SteamGameShotActivity.this.W;
            if (cVar2 != null && cVar2.isShowing()) {
                z10 = true;
            }
            if (!z10 || (cVar = SteamGameShotActivity.this.W) == null) {
                return;
            }
            cVar.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35208, new Class[0], Void.TYPE).isSupported && SteamGameShotActivity.this.isActive()) {
                df.d2 d2Var = SteamGameShotActivity.this.L;
                if (d2Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    d2Var = null;
                }
                if (d2Var.f109592j != null) {
                    SteamGameShotActivity.n2(SteamGameShotActivity.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35206, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamGameShotActivity.a2(SteamGameShotActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35209, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.W(((BaseActivity) SteamGameShotActivity.this).f66601b, SteamGameShotActivity.this.N);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35210, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.d2 d2Var = SteamGameShotActivity.this.L;
            if (d2Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                d2Var = null;
            }
            com.max.hbutils.anim.b.c(d2Var.f109592j, 160, false);
            SteamGameShotActivity.a2(SteamGameShotActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class i implements com.max.xiaoheihe.module.game.adapter.y.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void a(boolean z10, int i10) {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void b(int i10, @dl.d ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), imageView}, this, changeQuickRedirect, false, 35211, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(imageView, "imageView");
            ArrayList arrayList = new ArrayList();
            int size = SteamGameShotActivity.this.P.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = SteamGameShotActivity.this.P.get(i11);
                kotlin.jvm.internal.f0.o(obj, "gameShotList[i]");
                GameScreenPicShotObj gameScreenPicShotObj = (GameScreenPicShotObj) obj;
                Activity mContext = ((BaseActivity) SteamGameShotActivity.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                long j10 = i11;
                String img_url = gameScreenPicShotObj.getImg_url();
                if (img_url == null) {
                    img_url = "";
                }
                arrayList.add(new MediaData(mContext, j10, img_url, false, false, null, gameScreenPicShotObj, false, null, null, null, bb.c.b.cz, null));
            }
            ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
            Activity mContext2 = ((BaseActivity) SteamGameShotActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext2, "mContext");
            companion.a(mContext2).l(companion.d(imageView, i10), arrayList).e(new GameShotUICustomizer()).d(i10).p();
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class j extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 35214, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int iF = ViewUtils.f(((BaseActivity) SteamGameShotActivity.this).f66601b, 4.0f);
            outRect.set(iF, 0, parent.getChildAdapterPosition(view) % 2 == 0 ? 0 : iF, iF);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class k implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 35215, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            SteamGameShotActivity.this.R += SteamGameShotActivity.this.S;
            SteamGameShotActivity.R1(SteamGameShotActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35216, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.game.component.c cVar = SteamGameShotActivity.this.W;
            if (cVar != null) {
                df.d2 d2Var = SteamGameShotActivity.this.L;
                if (d2Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    d2Var = null;
                }
                cVar.showAsDropDown(d2Var.f109590h);
            }
            if (com.max.hbcommon.utils.c.w(SteamGameShotActivity.this.Q)) {
                SteamGameShotActivity.m2(SteamGameShotActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    public static final class m implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35221, new Class[0], Void.TYPE).isSupported && SteamGameShotActivity.this.isActive()) {
                df.d2 d2Var = SteamGameShotActivity.this.L;
                df.d2 d2Var2 = null;
                if (d2Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    d2Var = null;
                }
                if (d2Var.f109592j != null) {
                    df.d2 d2Var3 = SteamGameShotActivity.this.L;
                    if (d2Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        d2Var2 = d2Var3;
                    }
                    com.max.hbutils.anim.b.c(d2Var2.f109592j, 160, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.SteamGameShotActivity$showLoadingDialog$1, reason: invalid class name */
    /* JADX INFO: compiled from: SteamGameShotActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.SteamGameShotActivity$showLoadingDialog$1", f = "SteamGameShotActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85413b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35218, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : SteamGameShotActivity.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35220, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35219, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            LoadingDialog loadingDialog;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35217, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f85413b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            if (SteamGameShotActivity.this.X == null) {
                SteamGameShotActivity steamGameShotActivity = SteamGameShotActivity.this;
                Activity mContext = ((BaseActivity) steamGameShotActivity).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                steamGameShotActivity.X = new LoadingDialog(mContext, "");
            }
            LoadingDialog loadingDialog2 = SteamGameShotActivity.this.X;
            kotlin.jvm.internal.f0.m(loadingDialog2);
            if (!loadingDialog2.i() && (loadingDialog = SteamGameShotActivity.this.X) != null) {
                loadingDialog.r();
            }
            return kotlin.b2.f124493a;
        }
    }

    public static final /* synthetic */ void M1(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35192, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.o2();
    }

    public static final /* synthetic */ void R1(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35189, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.q2();
    }

    public static final /* synthetic */ void a2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35187, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.r2();
    }

    public static final /* synthetic */ void b2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35188, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.v2();
    }

    public static final /* synthetic */ void i2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35195, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.x1();
    }

    public static final /* synthetic */ void j2(SteamGameShotActivity steamGameShotActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35194, new Class[]{SteamGameShotActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.x2(z10);
    }

    public static final /* synthetic */ void k2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35191, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.C1();
    }

    public static final /* synthetic */ void l2(SteamGameShotActivity steamGameShotActivity, List list) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity, list}, null, changeQuickRedirect, true, 35193, new Class[]{SteamGameShotActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.y2(list);
    }

    public static final /* synthetic */ void m2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35196, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.showLoadingDialog();
    }

    public static final /* synthetic */ void n2(SteamGameShotActivity steamGameShotActivity) {
        if (PatchProxy.proxy(new Object[]{steamGameShotActivity}, null, changeQuickRedirect, true, 35190, new Class[]{SteamGameShotActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamGameShotActivity.z2();
    }

    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.T = false;
        df.d2 d2Var = this.L;
        df.d2 d2Var2 = null;
        if (d2Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var = null;
        }
        d2Var.f109587e.A(0);
        df.d2 d2Var3 = this.L;
        if (d2Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            d2Var2 = d2Var3;
        }
        d2Var2.f109587e.p(0);
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35179, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G6(this.M, this.N, "steam").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35176, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().La(this.M, this.N, this.V, "steam", this.R, this.S).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35178, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        com.max.xiaoheihe.base.router.b.k0(mContext, "heybox://{\"protocol_type\":\"openRouterPath\",\"path\":\"/bbs/post\",\"params\":{\"post_type\":4,\"open_picture_selector\":2}}");
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35184, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.Z, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35175, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("全部截图");
        this.f66617r.setVisibility(0);
        this.f66616q.setActionIcon(R.drawable.common_share);
        this.f66616q.setActionIconOnClickListener(new f());
        ImageView appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
        if (appbarActionButtonView != null) {
            appbarActionButtonView.setPadding(ViewUtils.f(appbarActionButtonView.getContext(), 10.0f), appbarActionButtonView.getPaddingTop(), appbarActionButtonView.getPaddingRight(), appbarActionButtonView.getPaddingBottom());
        }
        this.f66616q.setActionXIcon(R.drawable.common_refresh_line_24x24);
        this.f66616q.setActionXIconOnClickListener(new g());
        ImageView appbarActionButtonXView = this.f66616q.getAppbarActionButtonXView();
        if (appbarActionButtonXView != null) {
            appbarActionButtonXView.setPadding(ViewUtils.f(appbarActionButtonXView.getContext(), 10.0f), appbarActionButtonXView.getPaddingTop(), ViewUtils.f(appbarActionButtonXView.getContext(), 10.0f), appbarActionButtonXView.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = appbarActionButtonXView.getLayoutParams();
            layoutParams.width = ViewUtils.f(appbarActionButtonXView.getContext(), 40.0f);
            appbarActionButtonXView.setLayoutParams(layoutParams);
        }
        df.d2 d2Var = this.L;
        df.d2 d2Var2 = null;
        if (d2Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var = null;
        }
        d2Var.f109592j.setOnClickListener(new h());
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        com.max.xiaoheihe.module.game.adapter.y yVar = new com.max.xiaoheihe.module.game.adapter.y(mContext, this.P, ViewUtils.f(this.f66601b, 4.0f), ViewUtils.f(this.f66601b, 4.0f));
        this.O = yVar;
        yVar.x(new i());
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.O;
        if (yVar2 != null) {
            yVar2.y(false);
        }
        df.d2 d2Var3 = this.L;
        if (d2Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var3 = null;
        }
        d2Var3.f109586d.setLayoutManager(new GridLayoutManager(this.f66601b, 2));
        df.d2 d2Var4 = this.L;
        if (d2Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var4 = null;
        }
        d2Var4.f109586d.setAdapter(this.O);
        df.d2 d2Var5 = this.L;
        if (d2Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var5 = null;
        }
        d2Var5.f109586d.setPreloadEnable(true);
        df.d2 d2Var6 = this.L;
        if (d2Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var6 = null;
        }
        d2Var6.f109586d.setPreLoadGap(10);
        df.d2 d2Var7 = this.L;
        if (d2Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var7 = null;
        }
        d2Var7.f109586d.setPreLoadAction(new yh.a<kotlin.b2>() { // from class: com.max.xiaoheihe.module.game.SteamGameShotActivity$initView$7
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35213, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35212, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamGameShotActivity.b2(this.f85408b);
                df.d2 d2Var8 = this.f85408b.L;
                if (d2Var8 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    d2Var8 = null;
                }
                d2Var8.f109586d.b();
            }
        });
        df.d2 d2Var8 = this.L;
        if (d2Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var8 = null;
        }
        d2Var8.f109586d.addItemDecoration(new j());
        df.d2 d2Var9 = this.L;
        if (d2Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var9 = null;
        }
        d2Var9.f109587e.i0(false);
        df.d2 d2Var10 = this.L;
        if (d2Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var10 = null;
        }
        d2Var10.f109587e.f0(new k());
        if (this.W == null) {
            com.max.xiaoheihe.module.game.component.c cVar = new com.max.xiaoheihe.module.game.component.c(this.f66601b);
            this.W = cVar;
            cVar.d(this.Q);
            com.max.xiaoheihe.module.game.component.c cVar2 = this.W;
            if (cVar2 != null) {
                cVar2.f(new d());
            }
        }
        df.d2 d2Var11 = this.L;
        if (d2Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            d2Var2 = d2Var11;
        }
        d2Var2.f109592j.postDelayed(new e(), 10000L);
    }

    private final void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35180, new Class[0], Void.TYPE).isSupported || this.T || !this.U) {
            return;
        }
        this.T = true;
        this.R += this.S;
        q2();
    }

    private final void x2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35183, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        df.d2 d2Var = this.L;
        if (d2Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var = null;
        }
        d2Var.f109591i.b().setVisibility(z10 ? 0 : 8);
    }

    private final void y2(List<GameScreenPicShotObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 35182, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        df.d2 d2Var = this.L;
        if (d2Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var = null;
        }
        d2Var.f109590h.setOnClickListener(new l());
        int size = this.P.size();
        this.P.addAll(list);
        if (size > 0) {
            com.max.xiaoheihe.module.game.adapter.y yVar = this.O;
            if (yVar != null) {
                yVar.notifyItemRangeInserted(size, list.size());
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.O;
        if (yVar2 != null) {
            yVar2.notifyDataSetChanged();
        }
    }

    private final void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35177, new Class[0], Void.TYPE).isSupported || this.f85399a0) {
            return;
        }
        this.f85399a0 = true;
        df.d2 d2Var = this.L;
        df.d2 d2Var2 = null;
        if (d2Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2Var = null;
        }
        com.max.hbutils.anim.b.c(d2Var.f109592j, 160, true);
        df.d2 d2Var3 = this.L;
        if (d2Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            d2Var2 = d2Var3;
        }
        d2Var2.f109592j.postDelayed(new m(), 5000L);
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35186, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("user_id", this.M);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35174, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        df.d2 d2VarD = df.d2.d(this.f66602c, null, false);
        kotlin.jvm.internal.f0.o(d2VarD, "inflate(mInflater, null, false)");
        this.L = d2VarD;
        if (d2VarD == null) {
            kotlin.jvm.internal.f0.S("binding");
            d2VarD = null;
        }
        setContentView(d2VarD.b());
        Intent intent = getIntent();
        this.M = intent != null ? intent.getStringExtra("user_id") : null;
        Intent intent2 = getIntent();
        this.N = intent2 != null ? intent2.getStringExtra("steam_id") : null;
        u2();
        E1();
        q2();
        p2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35185, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        x2(false);
        E1();
        q2();
    }
}
