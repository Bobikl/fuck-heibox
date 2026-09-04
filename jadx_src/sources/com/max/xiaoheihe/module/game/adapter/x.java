package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameRollRoomObj;
import com.max.xiaoheihe.bean.game.RollItemObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.littleprogram.fragment.RollRoomDetailFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.yw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameRollRoomListAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class x extends com.max.hbcommon.base.adapter.s<GameRollRoomObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f86400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f86401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.reactivex.disposables.a f86402d;

    /* JADX INFO: compiled from: GameRollRoomListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86403b;

        a(String str) {
            this.f86403b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35659, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f86403b)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(RollRoomDetailFragment.A, this.f86403b);
            com.max.xiaoheihe.module.littleprogram.b.p(x.this.f86400b, com.max.xiaoheihe.module.littleprogram.b.f88740a.f(), bundle);
        }
    }

    /* JADX INFO: compiled from: GameRollRoomListAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRollRoomObj f86405b;

        b(GameRollRoomObj gameRollRoomObj) {
            this.f86405b = gameRollRoomObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35660, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(x.this.f86400b, this.f86405b.getRoom_id());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(x.this.f86400b.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: GameRollRoomListAdapter.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86407b;

        c(String str) {
            this.f86407b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35661, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(x.this.f86400b, this.f86407b);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(x.this.f86400b.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: GameRollRoomListAdapter.java */
    public class d extends com.max.hbcommon.base.adapter.s<RollItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f86409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, List list, int i10, View.OnClickListener onClickListener) {
            super(context, list, i10);
            this.f86409b = onClickListener;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, RollItemObj rollItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, rollItemObj}, this, changeQuickRedirect, false, 35662, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RollItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            be.d dVarA = be.d.a(eVar.b());
            x.o(dVarA, rollItemObj);
            if (eVar.getBindingAdapterPosition() != 0) {
                ((ViewGroup.MarginLayoutParams) dVarA.b().getLayoutParams()).topMargin = ViewUtils.f(x.this.f86400b, 6.0f);
            }
            dVarA.b().setOnClickListener(this.f86409b);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, RollItemObj rollItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, rollItemObj}, this, changeQuickRedirect, false, 35663, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, rollItemObj);
        }
    }

    public x(Context context, io.reactivex.disposables.a aVar, List<GameRollRoomObj> list, String str) {
        super(context, list, R.layout.item_roll_room);
        this.f86400b = context;
        this.f86401c = str;
        this.f86402d = aVar;
    }

    public static void o(be.d dVar, RollItemObj rollItemObj) {
        if (PatchProxy.proxy(new Object[]{dVar, rollItemObj}, null, changeQuickRedirect, true, 35656, new Class[]{be.d.class, RollItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = dVar.b().getContext();
        com.max.hbimage.b.K(rollItemObj.getImage(), dVar.f35260f);
        dVar.f35259e.setBackgroundDrawable(com.max.hbutils.utils.q.L(context, R.color.white_alpha40, 0.5f, 4.0f));
        dVar.f35265k.setText(rollItemObj.getName());
        dVar.f35266l.setText(rollItemObj.getTime_desc());
        dVar.f35264j.setText(rollItemObj.getDescription());
        dVar.f35258d.setVisibility(8);
        dVar.f35257c.setBackground(ViewUtils.i(0, com.max.hbcommon.utils.l.a(R.color.icon_gradient_gray_dark_start_color), com.max.hbcommon.utils.l.a(R.color.icon_gradient_gray_dark_end_color)));
    }

    public void n(com.max.hbcommon.base.adapter.s.e eVar, GameRollRoomObj gameRollRoomObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameRollRoomObj}, this, changeQuickRedirect, false, 35655, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRollRoomObj.class}, Void.TYPE).isSupported) {
            return;
        }
        yw ywVarA = yw.a(eVar.itemView);
        ywVarA.f118069b.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f86400b, R.color.divider_secondary_2_color, 8.0f), this.f86400b, R.color.background_layer_1_color, 0.5f));
        ywVarA.f118086s.b().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_1_color));
        Boolean boolValueOf = Boolean.valueOf(com.max.hbcommon.utils.c.o(gameRollRoomObj.getRoll_items()) > 2);
        String link_id = gameRollRoomObj.getLink_id();
        gameRollRoomObj.getLink_tag();
        gameRollRoomObj.getRoom_id();
        a aVar = new a(link_id);
        ArrayList arrayList = new ArrayList();
        if ("me".equals(this.f86401c)) {
            ywVarA.f118085r.setVisibility(0);
            ywVarA.f118082o.setText("房间号:" + gameRollRoomObj.getRoom_id());
            ywVarA.f118072e.setOnClickListener(new b(gameRollRoomObj));
            if (gameRollRoomObj.isHas_pass()) {
                ywVarA.f118078k.setVisibility(0);
                ywVarA.f118078k.setBackground(com.max.hbutils.utils.q.L(this.f86400b, R.color.text_secondary_2_color, 0.5f, 2.0f));
            } else {
                ywVarA.f118078k.setVisibility(8);
            }
            String strV = com.max.xiaoheihe.utils.d.v(gameRollRoomObj.getPasswd());
            if (com.max.hbcommon.utils.c.u(strV)) {
                ywVarA.f118079l.setVisibility(8);
                ywVarA.f118071d.setVisibility(8);
            } else {
                String strReplaceAll = strV.replaceAll("\"", "");
                ywVarA.f118079l.setText("密码:" + strReplaceAll);
                ywVarA.f118071d.setOnClickListener(new c(strReplaceAll));
                ywVarA.f118079l.setVisibility(0);
                ywVarA.f118071d.setVisibility(0);
            }
        } else {
            ywVarA.f118085r.setVisibility(8);
        }
        if (boolValueOf.booleanValue()) {
            arrayList.addAll(gameRollRoomObj.getRoll_items().subList(0, 2));
            ywVarA.f118084q.setVisibility(0);
            ywVarA.f118076i.setText("共" + gameRollRoomObj.getGame_count() + "件物品");
        } else {
            arrayList.addAll(gameRollRoomObj.getRoll_items());
            ywVarA.f118084q.setVisibility(8);
        }
        ywVarA.f118075h.setAdapter(new d(this.f86400b, arrayList, R.layout.hbwallet_coupon_roll_item, aVar));
        if ("search".equals(this.f86401c)) {
            ywVarA.f118080m.setVisibility(0);
            ywVarA.f118080m.setText(String.format(this.f86400b.getResources().getString(R.string.room_id_format), gameRollRoomObj.getRoom_id()));
        } else {
            ywVarA.f118080m.setVisibility(8);
        }
        if (com.max.hbcommon.utils.c.u(gameRollRoomObj.getRoom_title())) {
            ywVarA.f118081n.setVisibility(8);
        } else {
            ywVarA.f118081n.setVisibility(0);
            ywVarA.f118081n.setText(gameRollRoomObj.getRoom_title());
        }
        if (gameRollRoomObj.getUser_info() != null) {
            BBSUserInfoObj user_info = gameRollRoomObj.getUser_info();
            com.max.hbimage.b.I(user_info.getAvartar(), ywVarA.f118070c, R.drawable.common_default_avatar_40x40);
            ywVarA.f118077j.setText(user_info.getUsername());
            com.max.xiaoheihe.utils.d.j1(ywVarA.f118074g, user_info);
        } else {
            com.max.hbimage.b.c(ywVarA.f118070c);
            ywVarA.f118077j.setText((CharSequence) null);
            ywVarA.f118074g.setVisibility(8);
        }
        String strJ = r1.J(gameRollRoomObj.getPrice());
        if ("1".equals(gameRollRoomObj.getOver())) {
            if ("1".equals(gameRollRoomObj.getWin_prize())) {
                ywVarA.f118086s.f118471b.setVisibility(0);
                ywVarA.f118086s.f118471b.setText(this.f86400b.getResources().getString(R.string.already_win));
                ywVarA.f118086s.f118471b.setAlpha(1.0f);
                ywVarA.f118086s.f118471b.setBackgroundDrawable(ViewUtils.x(ViewUtils.f(this.f86400b, 2.0f), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color)));
            } else if ("1".equals(gameRollRoomObj.getJoined())) {
                ywVarA.f118086s.f118471b.setVisibility(0);
                ywVarA.f118086s.f118471b.setText(this.f86400b.getResources().getString(R.string.not_win));
                ywVarA.f118086s.f118471b.setAlpha(0.5f);
                ywVarA.f118086s.f118471b.setBackgroundDrawable(ViewUtils.x(ViewUtils.f(this.f86400b, 2.0f), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_purple_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_purple_dark_end_color)));
            } else {
                ywVarA.f118086s.f118471b.setVisibility(8);
            }
            ywVarA.f118073f.setVisibility(0);
            SpannableString spannableString = new SpannableString(gameRollRoomObj.getRoll_time_desc() + " " + this.f86400b.getResources().getString(R.string.already_over));
            spannableString.setSpan(new ForegroundColorSpan(this.f86400b.getResources().getColor(R.color.text_secondary_1_color)), 0, spannableString.length(), 33);
            ywVarA.f118083p.setText(spannableString);
        } else {
            if ("1".equals(gameRollRoomObj.getJoined())) {
                ywVarA.f118086s.f118471b.setVisibility(0);
                ywVarA.f118086s.f118471b.setText(this.f86400b.getResources().getString(R.string.joined));
                ywVarA.f118086s.f118471b.setAlpha(1.0f);
                ywVarA.f118086s.f118471b.setBackgroundDrawable(ViewUtils.x(ViewUtils.f(this.f86400b, 2.0f), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_purple_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_purple_dark_end_color)));
            } else {
                ywVarA.f118086s.f118471b.setVisibility(8);
            }
            ywVarA.f118073f.setVisibility(8);
            String string = this.f86400b.getResources().getString(R.string.lottery);
            SpannableString spannableString2 = new SpannableString(gameRollRoomObj.getRoll_time_desc() + " " + string);
            spannableString2.setSpan(new ForegroundColorSpan(this.f86400b.getResources().getColor(R.color.text_secondary_1_color)), spannableString2.length() - string.length(), spannableString2.length(), 33);
            ywVarA.f118083p.setText(spannableString2);
        }
        ywVarA.f118086s.f118472c.setText(String.format(this.f86400b.getResources().getString(R.string.num_of_participants_format), gameRollRoomObj.getPeople()));
        if (com.max.hbutils.utils.n.p(strJ) > 0.0f) {
            ywVarA.f118086s.f118474e.setText(strJ);
            ywVarA.f118086s.f118477h.setVisibility(0);
        } else {
            ywVarA.f118086s.f118477h.setVisibility(8);
        }
        int iF = ViewUtils.f(this.f86400b, 2.0f);
        if (GameListObj.ROLL_PAGE_TYPE_HOME.equals(this.f86401c) && gameRollRoomObj == this.mDataList.get(0)) {
            float f10 = iF;
            ywVarA.b().setBackgroundDrawable(ViewUtils.I(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10}, this.f86400b.getResources().getColor(R.color.background_layer_2_color), this.f86400b.getResources().getColor(R.color.background_card_1_color)));
        } else {
            ywVarA.b().setBackgroundDrawable(ViewUtils.H(iF, this.f86400b.getResources().getColor(R.color.background_layer_2_color), this.f86400b.getResources().getColor(R.color.background_card_1_color)));
        }
        ywVarA.b().setOnClickListener(aVar);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameRollRoomObj gameRollRoomObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameRollRoomObj}, this, changeQuickRedirect, false, 35657, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameRollRoomObj);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 35658, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 35654, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
        ((RecyclerView) eVarOnCreateViewHolder.i(R.id.rv_roll_items)).setLayoutManager(new LinearLayoutManager(this.f86400b));
        return eVarOnCreateViewHolder;
    }
}
