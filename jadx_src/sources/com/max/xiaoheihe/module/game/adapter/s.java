package com.max.xiaoheihe.module.game.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDiscountListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GameDiscountListAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s extends com.max.hbcommon.base.adapter.u<GameDiscountListObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86359d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final BaseActivity f86360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private LoadingDialog f86361c;

    /* JADX INFO: compiled from: GameDiscountListAdapter.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<GameDiscountListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameDiscountListObj f86363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86364d;

        a(GameDiscountListObj gameDiscountListObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f86363c = gameDiscountListObj;
            this.f86364d = eVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35595, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            s.n(s.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35593, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (s.this.r().isActive()) {
                super.onError(e10);
                s.n(s.this);
            }
        }

        public void onNext(@dl.d Result<GameDiscountListObj> result) {
            GameDiscountListObj result2;
            List<GameObj> game_list;
            List<GameObj> game_list2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35594, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (!s.this.r().isActive() || (result2 = result.getResult()) == null || (game_list = result2.getGame_list()) == null) {
                return;
            }
            GameDiscountListObj gameDiscountListObj = this.f86363c;
            com.max.hbcommon.base.adapter.s.e eVar = this.f86364d;
            s sVar = s.this;
            gameDiscountListObj.setOffset(gameDiscountListObj.getOffset() + game_list.size());
            int iU = fi.u.u((eVar != null ? Integer.valueOf(eVar.getAbsoluteAdapterPosition()) : null) != null ? eVar.getAbsoluteAdapterPosition() : 0, 0);
            GameDiscountListObj result3 = result.getResult();
            List<GameObj> game_list3 = result3 != null ? result3.getGame_list() : null;
            kotlin.jvm.internal.f0.m(game_list3);
            int size = game_list3.size();
            for (int i10 = 0; i10 < size; i10++) {
                GameDiscountListObj result4 = result.getResult();
                GameObj gameObj = (result4 == null || (game_list2 = result4.getGame_list()) == null) ? null : game_list2.get(i10);
                int offset = gameDiscountListObj.getOffset();
                GameDiscountListObj result5 = result.getResult();
                sVar.getDataList().add(iU + i10, new GameDiscountListObj(null, null, null, offset, 0, result5 != null ? result5.getPlatform() : null, null, gameObj, null, null, 0));
            }
            GameDiscountListObj result6 = result.getResult();
            List<GameObj> game_list4 = result6 != null ? result6.getGame_list() : null;
            kotlin.jvm.internal.f0.m(game_list4);
            sVar.notifyItemRangeInserted(iU, game_list4.size());
            GameDiscountListObj result7 = result.getResult();
            List<GameObj> game_list5 = result7 != null ? result7.getGame_list() : null;
            kotlin.jvm.internal.f0.m(game_list5);
            sVar.notifyItemChanged(iU + game_list5.size());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35596, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameDiscountListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameDiscountListAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameDiscountListObj f86366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86367d;

        b(GameDiscountListObj gameDiscountListObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f86366c = gameDiscountListObj;
            this.f86367d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35597, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            s.o(s.this);
            s.this.p(this.f86366c, this.f86367d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d BaseActivity mContext, @dl.d List<GameDiscountListObj> list) {
        super(mContext, list);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f86360b = mContext;
    }

    public static final /* synthetic */ void n(s sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, null, changeQuickRedirect, true, 35592, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        sVar.s();
    }

    public static final /* synthetic */ void o(s sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, null, changeQuickRedirect, true, 35591, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        sVar.u();
    }

    private final void s() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog2 = this.f86361c;
        if (loadingDialog2 != null && loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.f86361c) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void u() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35587, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog2 = this.f86361c;
        if (loadingDialog2 == null) {
            this.f86361c = new LoadingDialog(this.f86360b, com.max.xiaoheihe.utils.d.n0(R.string.loading), false).r();
            return;
        }
        kotlin.jvm.internal.f0.m(loadingDialog2);
        if (loadingDialog2.i() || (loadingDialog = this.f86361c) == null) {
            return;
        }
        loadingDialog.r();
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, GameDiscountListObj gameDiscountListObj) {
        Object[] objArr = {new Integer(i10), gameDiscountListObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35589, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : q(i10, gameDiscountListObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 35590, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (GameDiscountListObj) obj);
    }

    public final void p(@dl.e GameDiscountListObj gameDiscountListObj, @dl.e com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{gameDiscountListObj, eVar}, this, changeQuickRedirect, false, 35586, new Class[]{GameDiscountListObj.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported || gameDiscountListObj == null) {
            return;
        }
        this.f86360b.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z8(gameDiscountListObj.getPlatform(), gameDiscountListObj.getTimestamp(), gameDiscountListObj.getOffset(), 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(gameDiscountListObj, eVar)));
    }

    public int q(int i10, @dl.e GameDiscountListObj gameDiscountListObj) {
        Object[] objArr = {new Integer(i10), gameDiscountListObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35584, new Class[]{cls, GameDiscountListObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (gameDiscountListObj == null) {
            return -1;
        }
        int type = gameDiscountListObj.getType();
        if (type == 0) {
            GameHelper gameHelperA = GameHelper.f85623a.a();
            GameObj game = gameDiscountListObj.getGame();
            kotlin.jvm.internal.f0.m(game);
            return gameHelperA.b(game);
        }
        if (type == 1) {
            return R.layout.item_game_discount_list_title;
        }
        if (type != 2) {
            return -1;
        }
        return R.layout.item_game_discount_list_expand;
    }

    @dl.d
    public final BaseActivity r() {
        return this.f86360b;
    }

    public void t(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e GameDiscountListObj gameDiscountListObj) {
        if (PatchProxy.proxy(new Object[]{viewHolder, gameDiscountListObj}, this, changeQuickRedirect, false, 35585, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDiscountListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        if (gameDiscountListObj != null) {
            int type = gameDiscountListObj.getType();
            if (type == 0) {
                com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d dVar = new com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d(this.f86360b, this, null, "discount", false, 16, null);
                GameObj game = gameDiscountListObj.getGame();
                if (game != null) {
                    if (kotlin.jvm.internal.f0.g("switch", com.max.hbcommon.utils.c.w(game.getPlatform_infos()) ? "" : game.getPlatform_infos().get(0).getKey())) {
                        game.setIs_use_new_style("1");
                    }
                    com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.c.f86384a.a(dVar, viewHolder.d()).f(viewHolder, game);
                    return;
                }
                return;
            }
            if (type != 1) {
                if (type != 2) {
                    return;
                }
                ExpandMoreButton expandMoreButton = (ExpandMoreButton) viewHolder.i(R.id.emb);
                View viewI = viewHolder.i(R.id.divider);
                if (expandMoreButton != null) {
                    expandMoreButton.setBackgroundResource(R.color.transparent);
                }
                if (gameDiscountListObj.getOffset() >= gameDiscountListObj.getTotal()) {
                    if (expandMoreButton != null) {
                        expandMoreButton.setVisibility(8);
                    }
                    if (viewI == null) {
                        return;
                    }
                    viewI.setVisibility(4);
                    return;
                }
                if (expandMoreButton != null) {
                    expandMoreButton.setVisibility(0);
                }
                if (viewI != null) {
                    viewI.setVisibility(0);
                }
                if (expandMoreButton != null) {
                    v0 v0Var = v0.f124986a;
                    String str = String.format("更多 %s 款折扣", Arrays.copyOf(new Object[]{Integer.valueOf(gameDiscountListObj.getTotal() - gameDiscountListObj.getOffset())}, 1));
                    kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                    expandMoreButton.setText(str);
                }
                if (expandMoreButton != null) {
                    expandMoreButton.setOnClickListener(new b(gameDiscountListObj, viewHolder));
                    return;
                }
                return;
            }
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_time);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_max_discount);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_platform);
            if (textView != null) {
                textView.setText(gameDiscountListObj.getDescription());
            }
            if (textView2 != null) {
                textView2.setText(gameDiscountListObj.getDatetime());
            }
            if (textView != null) {
                textView.setTextColor(this.f86360b.getResources().getColor(R.color.text_primary_1_color));
            }
            if (com.max.hbcommon.utils.c.u(gameDiscountListObj.getMax_discount())) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else if (kotlin.jvm.internal.f0.g("0", gameDiscountListObj.getMax_discount())) {
                if (textView != null) {
                    textView.setTextColor(this.f86360b.getResources().getColor(R.color.text_secondary_1_color));
                }
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                if (textView3 != null) {
                    textView3.setText(gameDiscountListObj.getMax_discount());
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            if (imageView != null) {
                com.max.hbimage.b.K(gameDiscountListObj.getPlatform_icon(), imageView);
            }
        }
    }
}
