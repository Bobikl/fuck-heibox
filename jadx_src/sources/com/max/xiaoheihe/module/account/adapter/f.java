package com.max.xiaoheihe.module.account.adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.BindGameCardV2;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.game.component.GameStatAccountMiniCard;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.view.l;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDataCardV2Adapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class f extends s<BindGameCardV2> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78772d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f78773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private List<BindGameCardV2> f78774c;

    /* JADX INFO: compiled from: GameDataCardV2Adapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BindGameCardV2 f78775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f78776c;

        a(BindGameCardV2 bindGameCardV2, f fVar) {
            this.f78775b = bindGameCardV2;
            this.f78776c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String protocol;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24822, new Class[]{View.class}, Void.TYPE).isSupported || (protocol = this.f78775b.getProtocol()) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f78776c.n(), protocol);
        }
    }

    /* JADX INFO: compiled from: GameDataCardV2Adapter.kt */
    public static final class b implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameStatAccountMiniCard f78777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f78778b;

        b(GameStatAccountMiniCard gameStatAccountMiniCard, f fVar) {
            this.f78777a = gameStatAccountMiniCard;
            this.f78778b = fVar;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 24823, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            GameStatAccountMiniCard gameStatAccountMiniCard = this.f78777a;
            f fVar = this.f78778b;
            ImageView iv_game_data_card_role = gameStatAccountMiniCard.getIv_game_data_card_role();
            f0.m(iv_game_data_card_role);
            iv_game_data_card_role.getLayoutParams().width = (drawable.getMinimumWidth() * ViewUtils.f(fVar.n(), 60.0f)) / drawable.getMinimumHeight();
            ImageView iv_game_data_card_role2 = gameStatAccountMiniCard.getIv_game_data_card_role();
            f0.m(iv_game_data_card_role2);
            iv_game_data_card_role2.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: GameDataCardV2Adapter.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BindGameCardV2 f78781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s.e f78782e;

        /* JADX INFO: compiled from: GameDataCardV2Adapter.kt */
        public static final class a implements m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BindGameCardV2 f78783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f78784b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ s.e f78785c;

            a(BindGameCardV2 bindGameCardV2, f fVar, s.e eVar) {
                this.f78783a = bindGameCardV2;
                this.f78784b = fVar;
                this.f78785c = eVar;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24826, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                com.max.hbcache.c.C(GameBindingFragment.E + this.f78783a.getGame_type(), "true");
                this.f78784b.getDataList().remove(this.f78783a);
                this.f78784b.notifyItemRemoved(this.f78785c.getAdapterPosition());
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24825, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        c(String str, BindGameCardV2 bindGameCardV2, s.e eVar) {
            this.f78780c = str;
            this.f78781d = bindGameCardV2;
            this.f78782e = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24824, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l.D(f.this.n(), f.this.n().getString(R.string.do_not_show_again_confirm), this.f78780c, f.this.n().getString(R.string.confirm), f.this.n().getString(R.string.cancel), new a(this.f78781d, f.this, this.f78782e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d Context mContext, @dl.d List<BindGameCardV2> list) {
        super(mContext, list, R.layout.layout_game_data_card_v2);
        f0.p(mContext, "mContext");
        f0.p(list, "list");
        this.f78773b = mContext;
        this.f78774c = list;
    }

    @dl.d
    public final List<BindGameCardV2> m() {
        return this.f78774c;
    }

    @dl.d
    public final Context n() {
        return this.f78773b;
    }

    public void o(@dl.e s.e eVar, @dl.e BindGameCardV2 bindGameCardV2) {
        TextView tv_nick_name;
        View iv_close_rec;
        View view;
        ImageView iv_bg;
        if (PatchProxy.proxy(new Object[]{eVar, bindGameCardV2}, this, changeQuickRedirect, false, 24820, new Class[]{s.e.class, BindGameCardV2.class}, Void.TYPE).isSupported || bindGameCardV2 == null) {
            return;
        }
        GameStatAccountMiniCard gameStatAccountMiniCard = eVar != null ? (GameStatAccountMiniCard) eVar.i(R.id.gsc) : null;
        if (gameStatAccountMiniCard != null && (iv_bg = gameStatAccountMiniCard.getIv_bg()) != null) {
            com.max.hbimage.b.K(bindGameCardV2.getBackground(), iv_bg);
        }
        if (gameStatAccountMiniCard != null && gameStatAccountMiniCard.getIv_app_icon() != null) {
            String top_left_icon = bindGameCardV2.getTop_left_icon();
            ImageView iv_app_icon = gameStatAccountMiniCard.getIv_app_icon();
            f0.m(iv_app_icon);
            com.max.hbimage.b.L(top_left_icon, iv_app_icon, R.drawable.common_default_placeholder_375x210);
        }
        if (eVar != null && (view = eVar.itemView) != null) {
            view.setOnClickListener(new a(bindGameCardV2, this));
        }
        if (gameStatAccountMiniCard != null) {
            gameStatAccountMiniCard.setBindState(bindGameCardV2.getBound());
        }
        if (!bindGameCardV2.getBound()) {
            String strU = r1.U(bindGameCardV2.getGame_type());
            tv_nick_name = gameStatAccountMiniCard != null ? gameStatAccountMiniCard.getTv_nick_name() : null;
            if (tv_nick_name != null) {
                tv_nick_name.setText(bindGameCardV2.getName());
            }
            if (gameStatAccountMiniCard == null || (iv_close_rec = gameStatAccountMiniCard.getIv_close_rec()) == null) {
                return;
            }
            iv_close_rec.setOnClickListener(new c(strU, bindGameCardV2, eVar));
            return;
        }
        TextView tv_nick_name2 = gameStatAccountMiniCard != null ? gameStatAccountMiniCard.getTv_nick_name() : null;
        if (tv_nick_name2 != null) {
            tv_nick_name2.setText(bindGameCardV2.getNickname());
        }
        if (gameStatAccountMiniCard != null && gameStatAccountMiniCard.getIv_level_icon() != null) {
            if (com.max.hbcommon.utils.c.u(bindGameCardV2.getBottom_left_icon())) {
                ImageView iv_level_icon = gameStatAccountMiniCard.getIv_level_icon();
                f0.m(iv_level_icon);
                iv_level_icon.setColorFilter(this.f78773b.getResources().getColor(R.color.divider_primary_1_not_change_color));
                ImageView iv_level_icon2 = gameStatAccountMiniCard.getIv_level_icon();
                f0.m(iv_level_icon2);
                iv_level_icon2.setImageResource(R.drawable.splash_logo);
            } else {
                ImageView iv_level_icon3 = gameStatAccountMiniCard.getIv_level_icon();
                f0.m(iv_level_icon3);
                iv_level_icon3.clearColorFilter();
                String bottom_left_icon = bindGameCardV2.getBottom_left_icon();
                ImageView iv_level_icon4 = gameStatAccountMiniCard.getIv_level_icon();
                f0.m(iv_level_icon4);
                com.max.hbimage.b.K(bottom_left_icon, iv_level_icon4);
            }
        }
        TextView tv_data = gameStatAccountMiniCard != null ? gameStatAccountMiniCard.getTv_data() : null;
        if (tv_data != null) {
            tv_data.setText(bindGameCardV2.getValue());
        }
        tv_nick_name = gameStatAccountMiniCard != null ? gameStatAccountMiniCard.getTv_data_desc() : null;
        if (tv_nick_name != null) {
            tv_nick_name.setText(bindGameCardV2.getKey());
        }
        if (gameStatAccountMiniCard == null || gameStatAccountMiniCard.getIv_game_data_card_role() == null) {
            return;
        }
        com.max.hbimage.b.X(this.f78773b, gameStatAccountMiniCard.getIv_game_data_card_role(), bindGameCardV2.getBottom_right_image(), new b(gameStatAccountMiniCard, this));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BindGameCardV2 bindGameCardV2) {
        if (PatchProxy.proxy(new Object[]{eVar, bindGameCardV2}, this, changeQuickRedirect, false, 24821, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, bindGameCardV2);
    }

    public final void p(@dl.d List<BindGameCardV2> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24819, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f78774c = list;
    }

    public final void q(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24818, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f78773b = context;
    }
}
