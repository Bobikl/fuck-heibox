package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CacheGameShotObj;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.max.xiaoheihe.bean.game.GameShotListObj;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderListObj;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderObj;
import com.max.xiaoheihe.module.bbs.ImageModuleListActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.k9;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.O0)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameShotPictureSelectorFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final a f84761p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f84762q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f84763r = "KEY_DOWNLOAD_SHOT_KEY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f84764s = "game_shot";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k9 f84765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.y f84766c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f84769f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f84771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f84772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f84773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f84774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.component.a f84775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private LoadingDialog f84776m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ArrayList<GameScreenPicShotObj> f84767d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ArrayList<GameShotPictureFolderObj> f84768e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f84770g = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f84777n = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.c());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f84778o = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e());

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public interface b {
        void a();

        void b(@dl.d ArrayList<Uri> arrayList);
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class c implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33726, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.d(GameShotPictureSelectorFragment.this.getString(R.string.load_fail));
        }

        @Override // com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment.b
        public void b(@dl.d ArrayList<Uri> uris) {
            if (PatchProxy.proxy(new Object[]{uris}, this, changeQuickRedirect, false, 33725, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(uris, "uris");
            File file = new File(PictureVideoEditPostFragment.g7(((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext));
            if (!file.exists()) {
                file.mkdirs();
            }
            com.max.xiaoheihe.module.bbs.adapter.l.a aVar = com.max.xiaoheihe.module.bbs.adapter.l.f80533a;
            Activity mContext = ((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.module.bbs.adapter.l.a.d(aVar, mContext, null, uris, file, null, GameShotPictureSelectorFragment.f84764s, 0, 64, null);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<CacheGameShotObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f84780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CacheGameShotObj> f84781c;

        d(Ref.BooleanRef booleanRef, Ref.ObjectRef<CacheGameShotObj> objectRef) {
            this.f84780b = booleanRef;
            this.f84781c = objectRef;
        }

        public void a(@dl.d CacheGameShotObj t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 33729, new Class[]{CacheGameShotObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            super.onNext(t10);
            this.f84781c.f124891b = t10;
            this.f84780b.f124884b = true;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33728, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            this.f84780b.f124884b = true;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33730, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((CacheGameShotObj) obj);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<GameShotPictureFolderListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33732, new Class[0], Void.TYPE).isSupported && GameShotPictureSelectorFragment.this.isActive()) {
                super.onComplete();
                LoadingDialog loadingDialog = GameShotPictureSelectorFragment.this.f84776m;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33731, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GameShotPictureSelectorFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = GameShotPictureSelectorFragment.this.f84776m;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<GameShotPictureFolderListObj> result) {
            com.max.xiaoheihe.module.game.adapter.z zVarA;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33733, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GameShotPictureSelectorFragment.this.isActive()) {
                super.onNext(result);
                GameShotPictureSelectorFragment.this.f84768e.clear();
                if (result.getResult() != null) {
                    GameShotPictureFolderListObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    if (!com.max.hbcommon.utils.c.w(result2.getInfos())) {
                        ArrayList arrayList = GameShotPictureSelectorFragment.this.f84768e;
                        GameShotPictureFolderListObj result3 = result.getResult();
                        kotlin.jvm.internal.f0.m(result3);
                        List<GameShotPictureFolderObj> infos = result3.getInfos();
                        kotlin.jvm.internal.f0.m(infos);
                        arrayList.addAll(infos);
                    }
                }
                com.max.xiaoheihe.module.game.component.a aVar = GameShotPictureSelectorFragment.this.f84775l;
                if (aVar == null || (zVarA = aVar.a()) == null) {
                    return;
                }
                zVarA.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33734, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameShotPictureFolderListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<GameShotListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33736, new Class[0], Void.TYPE).isSupported && GameShotPictureSelectorFragment.this.isActive()) {
                GameShotPictureSelectorFragment.L3(GameShotPictureSelectorFragment.this);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33735, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GameShotPictureSelectorFragment.this.isActive()) {
                super.onError(e10);
                GameShotPictureSelectorFragment.h4(GameShotPictureSelectorFragment.this);
                GameShotPictureSelectorFragment.L3(GameShotPictureSelectorFragment.this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:46:0x0107  */
        /* JADX WARN: Code duplicated, block: B:47:0x010b  */
        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
        /* JADX WARN: Code duplicated, block: B:51:0x011d  */
        public void onNext(@dl.d Result<GameShotListObj> result) {
            com.max.xiaoheihe.module.game.adapter.y yVar;
            GameShotPictureFolderObj current_folder;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33737, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GameShotPictureSelectorFragment.this.isActive()) {
                super.onNext(result);
                GameShotPictureSelectorFragment.this.f84774k = null;
                if (GameShotPictureSelectorFragment.this.f84769f == 0) {
                    GameShotListObj result2 = result.getResult();
                    if (!com.max.hbcommon.utils.c.u(result2 != null ? result2.getToast() : null)) {
                        if (((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mFragmentHidden) {
                            GameShotPictureSelectorFragment gameShotPictureSelectorFragment = GameShotPictureSelectorFragment.this;
                            GameShotListObj result3 = result.getResult();
                            gameShotPictureSelectorFragment.f84774k = result3 != null ? result3.getToast() : null;
                        } else {
                            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                            GameShotListObj result4 = result.getResult();
                            cVar.c(result4 != null ? result4.getToast() : null);
                        }
                    }
                    TextView textView = GameShotPictureSelectorFragment.this.o4().f112488i;
                    GameShotListObj result5 = result.getResult();
                    textView.setText((result5 == null || (current_folder = result5.getCurrent_folder()) == null) ? null : current_folder.getName());
                    GameShotPictureSelectorFragment.this.f84767d.clear();
                    GameShotPictureSelectorFragment.this.f84772i = true;
                    GameShotPictureSelectorFragment.this.o4().f112487h.b0(true);
                }
                if (result.getResult() != null) {
                    GameShotListObj result6 = result.getResult();
                    kotlin.jvm.internal.f0.m(result6);
                    if (!com.max.hbcommon.utils.c.w(result6.getScreen_shots())) {
                        GameShotPictureSelectorFragment gameShotPictureSelectorFragment2 = GameShotPictureSelectorFragment.this;
                        GameShotListObj result7 = result.getResult();
                        kotlin.jvm.internal.f0.m(result7);
                        List<GameScreenPicShotObj> screen_shots = result7.getScreen_shots();
                        kotlin.jvm.internal.f0.m(screen_shots);
                        GameShotPictureSelectorFragment.j4(gameShotPictureSelectorFragment2, screen_shots);
                    } else if (GameShotPictureSelectorFragment.this.f84769f == 0) {
                        GameShotPictureSelectorFragment.this.f84772i = false;
                        GameShotPictureSelectorFragment.this.o4().f112487h.b0(false);
                    } else if (com.max.hbcommon.utils.c.u(GameShotPictureSelectorFragment.this.f84773j)) {
                        GameShotPictureSelectorFragment gameShotPictureSelectorFragment3 = GameShotPictureSelectorFragment.this;
                        GameShotListObj result8 = result.getResult();
                        GameShotPictureSelectorFragment.l4(gameShotPictureSelectorFragment3, result8 != null ? result8.getTips_img_url() : null);
                    } else {
                        yVar = GameShotPictureSelectorFragment.this.f84766c;
                        if (yVar != null) {
                            yVar.notifyDataSetChanged();
                        }
                    }
                } else if (GameShotPictureSelectorFragment.this.f84769f == 0) {
                    GameShotPictureSelectorFragment.this.f84772i = false;
                    GameShotPictureSelectorFragment.this.o4().f112487h.b0(false);
                } else if (com.max.hbcommon.utils.c.u(GameShotPictureSelectorFragment.this.f84773j)) {
                    yVar = GameShotPictureSelectorFragment.this.f84766c;
                    if (yVar != null) {
                        yVar.notifyDataSetChanged();
                    }
                } else {
                    GameShotPictureSelectorFragment gameShotPictureSelectorFragment4 = GameShotPictureSelectorFragment.this;
                    GameShotListObj result9 = result.getResult();
                    GameShotPictureSelectorFragment.l4(gameShotPictureSelectorFragment4, result9 != null ? result9.getTips_img_url() : null);
                }
                GameShotPictureSelectorFragment.g4(GameShotPictureSelectorFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33738, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameShotListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class g implements com.max.xiaoheihe.module.game.adapter.y.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void a(boolean z10, int i10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 33739, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameShotPictureSelectorFragment.Z3(GameShotPictureSelectorFragment.this);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void b(int i10, @dl.d ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), imageView}, this, changeQuickRedirect, false, 33740, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(imageView, "imageView");
            GameShotPictureSelectorFragment.i4(GameShotPictureSelectorFragment.this, i10);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class h extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 33743, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int iF = ViewUtils.f(GameShotPictureSelectorFragment.this.getContext(), 1.0f);
            outRect.set(0, 0, parent.getChildAdapterPosition(view) % 2 == 0 ? iF : 0, iF);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class i implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33744, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GameShotPictureSelectorFragment.this.f84769f += GameShotPictureSelectorFragment.this.f84770g;
            GameShotPictureSelectorFragment.R3(GameShotPictureSelectorFragment.this);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class j implements com.max.xiaoheihe.module.game.adapter.e0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.e0
        public void a(@dl.d GameShotPictureFolderObj data, int i10) {
            com.max.xiaoheihe.module.game.component.a aVar;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 33745, new Class[]{GameShotPictureFolderObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            GameShotPictureSelectorFragment.this.o4().f112488i.setText(data.getName());
            GameShotPictureSelectorFragment.this.f84773j = data.getAppid();
            GameShotPictureSelectorFragment.this.f84769f = 0;
            GameShotPictureSelectorFragment.R3(GameShotPictureSelectorFragment.this);
            com.max.xiaoheihe.module.game.component.a aVar2 = GameShotPictureSelectorFragment.this.f84775l;
            if (aVar2 != null && aVar2.isShowing()) {
                z10 = true;
            }
            if (!z10 || (aVar = GameShotPictureSelectorFragment.this.f84775l) == null) {
                return;
            }
            aVar.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33746, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33747, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            pb.p pVarP = ob.a.p();
            Activity mContext = ((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String GAME_SHOT_FAQ_WEB = lb.a.f131078y4;
            kotlin.jvm.internal.f0.o(GAME_SHOT_FAQ_WEB, "GAME_SHOT_FAQ_WEB");
            pVarP.a(mContext, "常见问题", GAME_SHOT_FAQ_WEB);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33748, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.W(((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext, null);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class n implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f84797a = new n();
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33766, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class o extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f84798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameShotPictureSelectorFragment f84799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f84800d;

        o(Ref.BooleanRef booleanRef, GameShotPictureSelectorFragment gameShotPictureSelectorFragment, Ref.ObjectRef<String> objectRef) {
            this.f84798b = booleanRef;
            this.f84799c = gameShotPictureSelectorFragment;
            this.f84800d = objectRef;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33767, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            this.f84798b.f124884b = true;
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.String] */
        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 33768, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(file, "file");
            if (this.f84799c.isActive()) {
                super.onNext(file);
                if (file.exists()) {
                    this.f84800d.f124891b = file.getAbsolutePath();
                }
                this.f84798b.f124884b = true;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33769, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class p implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33771, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.d(GameShotPictureSelectorFragment.this.getString(R.string.load_fail));
        }

        @Override // com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment.b
        public void b(@dl.d ArrayList<Uri> uris) {
            if (PatchProxy.proxy(new Object[]{uris}, this, changeQuickRedirect, false, 33770, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(uris, "uris");
            if (((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext instanceof ImageModuleListActivity) {
                Activity activity = ((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext;
                kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.ImageModuleListActivity");
                ((ImageModuleListActivity) activity).c2(uris, null, GameShotPictureSelectorFragment.f84764s, null);
            }
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class q implements l0.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.xiaoheihe.module.game.l0.b
        @dl.e
        public List<GameScreenPicShotObj> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33772, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            com.max.xiaoheihe.module.game.adapter.y yVar = GameShotPictureSelectorFragment.this.f84766c;
            if (yVar != null) {
                return yVar.m();
            }
            return null;
        }

        @Override // com.max.xiaoheihe.module.game.l0.b
        public int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33774, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            com.max.xiaoheihe.module.game.adapter.y yVar = GameShotPictureSelectorFragment.this.f84766c;
            if (yVar != null) {
                return yVar.q();
            }
            return 0;
        }

        @Override // com.max.xiaoheihe.module.game.l0.b
        public void refresh() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33773, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameShotPictureSelectorFragment.Z3(GameShotPictureSelectorFragment.this);
            com.max.xiaoheihe.module.game.adapter.y yVar = GameShotPictureSelectorFragment.this.f84766c;
            if (yVar != null) {
                yVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33775, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.game.component.a aVar = GameShotPictureSelectorFragment.this.f84775l;
            if (aVar != null) {
                aVar.showAsDropDown(GameShotPictureSelectorFragment.this.o4().f112490k);
            }
            if (com.max.hbcommon.utils.c.w(GameShotPictureSelectorFragment.this.f84768e)) {
                GameShotPictureSelectorFragment.k4(GameShotPictureSelectorFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33780, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            pb.p pVarP = ob.a.p();
            Activity mContext = ((com.max.hbcommon.base.d) GameShotPictureSelectorFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String GAME_SHOT_FAQ_WEB = lb.a.f131078y4;
            kotlin.jvm.internal.f0.o(GAME_SHOT_FAQ_WEB, "GAME_SHOT_FAQ_WEB");
            pVarP.a(mContext, "常见问题", GAME_SHOT_FAQ_WEB);
        }
    }

    private final void A4(List<GameScreenPicShotObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33702, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        o4().f112487h.setVisibility(0);
        o4().f112491l.b().setVisibility(8);
        o4().f112489j.setVisibility(0);
        o4().f112489j.setOnClickListener(new r());
        int size = this.f84767d.size();
        this.f84767d.addAll(list);
        if (size > 0) {
            com.max.xiaoheihe.module.game.adapter.y yVar = this.f84766c;
            if (yVar != null) {
                yVar.notifyItemRangeInserted(size, list.size());
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.f84766c;
        if (yVar2 != null) {
            yVar2.notifyDataSetChanged();
        }
    }

    private final void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.f84778o, null, null, new GameShotPictureSelectorFragment$showLoadingDialog$1(this, null), 3, null);
    }

    private final void C4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33703, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        o4().f112487h.setVisibility(8);
        o4().f112491l.b().setVisibility(0);
        o4().f112489j.setVisibility(8);
        o4().f112491l.b().setBackground(ViewUtils.H(ViewUtils.o(getContext(), o4().f112491l.b()), com.max.xiaoheihe.utils.d.E(R.color.white_alpha2), com.max.xiaoheihe.utils.d.E(R.color.white_alpha2)));
        o4().f112489j.setOnClickListener(null);
        o4().f112491l.f114473b.getLayoutParams().height = ((ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 91.0f)) * 316) / bb.c.b.f31052y2;
        com.max.hbimage.b.K(str, o4().f112491l.f114473b);
        o4().f112491l.f114482k.setBackground(ViewUtils.H(ViewUtils.o(this.mContext, o4().f112491l.f114482k), com.max.xiaoheihe.utils.d.E(R.color.white_alpha4), com.max.xiaoheihe.utils.d.E(R.color.white_alpha4)));
        o4().f112491l.f114481j.setOnClickListener(new s());
    }

    public static final /* synthetic */ void L3(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33718, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.n4();
    }

    public static final /* synthetic */ Object O3(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment, cVar}, null, changeQuickRedirect, true, 33723, new Class[]{GameShotPictureSelectorFragment.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : gameShotPictureSelectorFragment.p4(cVar);
    }

    public static final /* synthetic */ void R3(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33716, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.r4();
    }

    public static final /* synthetic */ void Y3(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33715, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.t4();
    }

    public static final /* synthetic */ void Z3(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33713, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.u4();
    }

    public static final /* synthetic */ Object a4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, String str, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment, str, cVar}, null, changeQuickRedirect, true, 33724, new Class[]{GameShotPictureSelectorFragment.class, String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : gameShotPictureSelectorFragment.w4(str, cVar);
    }

    public static final /* synthetic */ void g4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33721, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.showContentView();
    }

    public static final /* synthetic */ void h4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33717, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.showError();
    }

    public static final /* synthetic */ void i4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment, new Integer(i10)}, null, changeQuickRedirect, true, 33714, new Class[]{GameShotPictureSelectorFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.z4(i10);
    }

    public static final /* synthetic */ void j4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, List list) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment, list}, null, changeQuickRedirect, true, 33719, new Class[]{GameShotPictureSelectorFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.A4(list);
    }

    public static final /* synthetic */ void k4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment}, null, changeQuickRedirect, true, 33722, new Class[]{GameShotPictureSelectorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.B4();
    }

    public static final /* synthetic */ void l4(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameShotPictureSelectorFragment, str}, null, changeQuickRedirect, true, 33720, new Class[]{GameShotPictureSelectorFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameShotPictureSelectorFragment.C4(str);
    }

    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33701, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84771h = false;
        o4().f112487h.A(0);
        o4().f112487h.p(0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    private final Object p4(kotlin.coroutines.c<? super CacheGameShotObj> cVar) throws Throwable {
        GameShotPictureSelectorFragment$getCacheImgList$1 gameShotPictureSelectorFragment$getCacheImgList$1;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 33708, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof GameShotPictureSelectorFragment$getCacheImgList$1) {
            gameShotPictureSelectorFragment$getCacheImgList$1 = (GameShotPictureSelectorFragment$getCacheImgList$1) cVar;
            int i10 = gameShotPictureSelectorFragment$getCacheImgList$1.f84789f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gameShotPictureSelectorFragment$getCacheImgList$1.f84789f = i10 - Integer.MIN_VALUE;
            } else {
                gameShotPictureSelectorFragment$getCacheImgList$1 = new GameShotPictureSelectorFragment$getCacheImgList$1(this, cVar);
            }
        } else {
            gameShotPictureSelectorFragment$getCacheImgList$1 = new GameShotPictureSelectorFragment$getCacheImgList$1(this, cVar);
        }
        Object obj = gameShotPictureSelectorFragment$getCacheImgList$1.f84787d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = gameShotPictureSelectorFragment$getCacheImgList$1.f84789f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            booleanRef = new Ref.BooleanRef();
            addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.a(f84763r, CacheGameShotObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(booleanRef, objectRef2)));
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) gameShotPictureSelectorFragment$getCacheImgList$1.f84786c;
            objectRef = (Ref.ObjectRef) gameShotPictureSelectorFragment$getCacheImgList$1.f84785b;
            kotlin.t0.n(obj);
        }
        while (!booleanRef.f124884b) {
            gameShotPictureSelectorFragment$getCacheImgList$1.f84785b = objectRef;
            gameShotPictureSelectorFragment$getCacheImgList$1.f84786c = booleanRef;
            gameShotPictureSelectorFragment$getCacheImgList$1.f84789f = 1;
            if (DelayKt.b(10L, gameShotPictureSelectorFragment$getCacheImgList$1) == objH) {
                return objH;
            }
        }
        return objectRef.f124891b;
    }

    private final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33698, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().La(com.max.xiaoheihe.utils.i0.j(), com.max.xiaoheihe.utils.i0.m(), this.f84773j, null, this.f84769f, this.f84770g).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33696, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        com.max.xiaoheihe.module.game.adapter.y yVar = new com.max.xiaoheihe.module.game.adapter.y(mContext, this.f84767d, ViewUtils.f(getContext(), 1.0f), 0);
        this.f84766c = yVar;
        yVar.y(true);
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.f84766c;
        if (yVar2 != null) {
            yVar2.x(new g());
        }
        o4().f112486g.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        o4().f112486g.setAdapter(this.f84766c);
        o4().f112486g.setPreloadEnable(true);
        o4().f112486g.setPreLoadGap(10);
        o4().f112486g.setPreLoadAction(new yh.a<kotlin.b2>() { // from class: com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$initView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33742, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33741, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameShotPictureSelectorFragment.Y3(this.f84792b);
                this.f84792b.o4().f112486g.b();
            }
        });
        o4().f112486g.addItemDecoration(new h());
        o4().f112487h.i0(false);
        o4().f112487h.f0(new i());
        if (this.f84775l == null) {
            com.max.xiaoheihe.module.game.component.a aVar = new com.max.xiaoheihe.module.game.component.a(this.mContext);
            this.f84775l = aVar;
            aVar.c(this.f84768e);
            com.max.xiaoheihe.module.game.component.a aVar2 = this.f84775l;
            if (aVar2 != null) {
                aVar2.e(new j());
            }
        }
        o4().f112482c.setOnClickListener(new k());
        o4().f112484e.setOnClickListener(new l());
        o4().f112485f.setOnClickListener(new m());
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33700, new Class[0], Void.TYPE).isSupported || this.f84771h || !this.f84772i) {
            return;
        }
        this.f84771h = true;
        this.f84769f += this.f84770g;
        r4();
    }

    private final void u4() {
        List<GameScreenPicShotObj> listM;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33697, new Class[0], Void.TYPE).isSupported && (this.mContext instanceof ImageModuleListActivity)) {
            com.max.xiaoheihe.module.game.adapter.y yVar = this.f84766c;
            int size = (yVar == null || (listM = yVar.m()) == null) ? 0 : listM.size();
            Activity activity = this.mContext;
            kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.ImageModuleListActivity");
            ((ImageModuleListActivity) activity).f2(size);
            Activity activity2 = this.mContext;
            kotlin.jvm.internal.f0.n(activity2, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.ImageModuleListActivity");
            ((ImageModuleListActivity) activity2).e2(size > 0);
        }
    }

    private final void v4(b bVar) {
        com.max.xiaoheihe.module.game.adapter.y yVar;
        List<GameScreenPicShotObj> listM;
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 33705, new Class[]{b.class}, Void.TYPE).isSupported || (yVar = this.f84766c) == null || (listM = yVar.m()) == null || !(true ^ listM.isEmpty())) {
            return;
        }
        kotlinx.coroutines.k.f(this.f84777n, null, null, new GameShotPictureSelectorFragment$saveAllImage$1$1(this, listM, bVar, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    private final Object w4(String str, kotlin.coroutines.c<? super String> cVar) throws Throwable {
        GameShotPictureSelectorFragment$saveImage$1 gameShotPictureSelectorFragment$saveImage$1;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, this, changeQuickRedirect, false, 33709, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof GameShotPictureSelectorFragment$saveImage$1) {
            gameShotPictureSelectorFragment$saveImage$1 = (GameShotPictureSelectorFragment$saveImage$1) cVar;
            int i10 = gameShotPictureSelectorFragment$saveImage$1.f84835f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gameShotPictureSelectorFragment$saveImage$1.f84835f = i10 - Integer.MIN_VALUE;
            } else {
                gameShotPictureSelectorFragment$saveImage$1 = new GameShotPictureSelectorFragment$saveImage$1(this, cVar);
            }
        } else {
            gameShotPictureSelectorFragment$saveImage$1 = new GameShotPictureSelectorFragment$saveImage$1(this, cVar);
        }
        Object obj = gameShotPictureSelectorFragment$saveImage$1.f84833d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = gameShotPictureSelectorFragment$saveImage$1.f84835f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            addDisposable((io.reactivex.disposables.b) com.max.hbimage.b.i(this.mContext.getCacheDir().getAbsolutePath(), n.f84797a, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o(booleanRef2, this, objectRef2)));
            booleanRef = booleanRef2;
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) gameShotPictureSelectorFragment$saveImage$1.f84832c;
            objectRef = (Ref.ObjectRef) gameShotPictureSelectorFragment$saveImage$1.f84831b;
            kotlin.t0.n(obj);
        }
        while (!booleanRef.f124884b) {
            gameShotPictureSelectorFragment$saveImage$1.f84831b = objectRef;
            gameShotPictureSelectorFragment$saveImage$1.f84832c = booleanRef;
            gameShotPictureSelectorFragment$saveImage$1.f84835f = 1;
            if (DelayKt.b(10L, gameShotPictureSelectorFragment$saveImage$1) == objH) {
                return objH;
            }
        }
        return objectRef.f124891b;
    }

    private final void z4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33704, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l0 l0VarA = l0.f87795f.a(this.f84767d, i10);
        l0VarA.T3(new q());
        getParentFragmentManager().u().I(R.anim.alpha_in, R.anim.alpha_out).c(R.id.fragment_game_shot_container, l0VarA, l0.f87797h).k(null).n();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33695, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        k9 k9VarC = k9.c(this.mInflater);
        kotlin.jvm.internal.f0.o(k9VarC, "inflate(mInflater)");
        y4(k9VarC);
        setContentView(o4());
        s4();
        ViewGroup.LayoutParams layoutParams = o4().f112490k.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.max.hbutils.utils.t.p(this.mContext);
        showLoading();
        r4();
        q4();
    }

    public final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v4(new c());
    }

    @dl.d
    public final k9 o4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33693, new Class[0], k9.class);
        if (patchProxyResultProxy.isSupported) {
            return (k9) patchProxyResultProxy.result;
        }
        k9 k9Var = this.f84765b;
        if (k9Var != null) {
            return k9Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33711, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (com.max.hbcommon.utils.c.u(this.f84774k)) {
            return;
        }
        com.max.hbutils.utils.c.f73533a.c(this.f84774k);
        this.f84774k = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33712, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        r4();
    }

    public final void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33699, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G6(com.max.xiaoheihe.utils.i0.j(), com.max.xiaoheihe.utils.i0.m(), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public final void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v4(new p());
    }

    public final void y4(@dl.d k9 k9Var) {
        if (PatchProxy.proxy(new Object[]{k9Var}, this, changeQuickRedirect, false, 33694, new Class[]{k9.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(k9Var, "<set-?>");
        this.f84765b = k9Var;
    }
}
