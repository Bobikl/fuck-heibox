package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameBundleObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.module.game.GameListActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* JADX INFO: compiled from: BundleListAdapterV2.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends com.max.hbcommon.base.adapter.s<GameBundleObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f85642d = "owned_rate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f85643e = "discount";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f85644f = "release_date";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f85645g = "dlc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f85646h = "bundle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f85647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f85648c;

    /* JADX INFO: compiled from: BundleListAdapterV2.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameBundleObj f85649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f85651d;

        a(GameBundleObj gameBundleObj, String str, String str2) {
            this.f85649b = gameBundleObj;
            this.f85650c = str;
            this.f85651d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35519, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (b.f85645g.equals(this.f85649b.getType())) {
                b.this.f85647b.startActivity(com.max.xiaoheihe.module.game.z.b(b.this.f85647b, this.f85650c, this.f85651d, "pc", null, i0.m(), i0.j(), null));
            } else {
                b.this.f85647b.startActivity(GameListActivity.T1(b.this.f85647b, this.f85651d));
            }
        }
    }

    public b(Context context, List<GameBundleObj> list) {
        super(context, list, R.layout.item_game_bundles_v2);
        this.f85648c = null;
        this.f85647b = context;
    }

    public void n(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
        int i10;
        if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 35517, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameBundleObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_is_owned);
        TextView textView = (TextView) eVar.i(R.id.tv_owned);
        TextView textView2 = (TextView) eVar.i(R.id.tv_discount);
        TextView textView3 = (TextView) eVar.i(R.id.tv_game_count);
        ViewGroup viewGroup2 = (ViewGroup) eVar.i(R.id.vg_own_rate);
        TextView textView4 = (TextView) eVar.i(R.id.tv_own_rate);
        ViewGroup viewGroup3 = (ViewGroup) eVar.i(R.id.vg_discount_deadline);
        TextView textView5 = (TextView) eVar.i(R.id.tv_deadline_date);
        TextView textView6 = (TextView) eVar.i(R.id.tv_deadline_date_unit);
        ViewGroup viewGroup4 = (ViewGroup) eVar.i(R.id.vg_publish_date);
        TextView textView7 = (TextView) eVar.i(R.id.tv_publish_date);
        com.max.hbimage.b.d0(gameBundleObj.getImage(), (ImageView) eVar.i(R.id.iv_image), ViewUtils.f(this.f85647b, 4.0f));
        eVar.p(R.id.tv_name, gameBundleObj.getName());
        GamePriceObj heybox_price = gameBundleObj.getHeybox_price() != null ? gameBundleObj.getHeybox_price() : gameBundleObj.getPrice();
        GameObj gameObj = new GameObj();
        gameObj.setHeybox_price(gameBundleObj.getHeybox_price());
        gameObj.setPrice(gameBundleObj.getPrice());
        gameObj.setIs_free(false);
        gameObj.setPlatforms_url(gameBundleObj.getPlatforms_url());
        r1.A(eVar, gameObj);
        View viewI = eVar.i(R.id.divider);
        if (eVar.getAdapterPosition() == getItemCount() - 1) {
            viewI.setVisibility(8);
        } else {
            viewI.setVisibility(0);
        }
        viewGroup.setBackground(com.max.hbutils.utils.q.o(this.f85647b, R.color.black_alpha40, 2.0f));
        if (f85645g.equals(gameBundleObj.getType())) {
            textView3.setVisibility(8);
            if (gameBundleObj.isHas_owned()) {
                viewGroup.setVisibility(0);
                textView.setText(R.string.in_stock);
            } else {
                viewGroup.setVisibility(8);
            }
        } else {
            textView3.setText(String.format("%1$s 件物品", gameBundleObj.getGame_count()));
            textView3.setVisibility(0);
            if (com.max.hbutils.utils.n.q(gameBundleObj.getOwned_cnt()) > 0) {
                viewGroup.setVisibility(0);
                textView.setText(gameBundleObj.getOwned_cnt() + "/" + gameBundleObj.getGame_count() + com.max.xiaoheihe.utils.d.n0(R.string.in_stock));
            } else {
                viewGroup.setVisibility(8);
            }
        }
        if (heybox_price == null || com.max.hbutils.utils.n.p(heybox_price.getDiscount()) <= 0.0f) {
            i10 = 8;
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setBackground(com.max.hbutils.utils.q.o(this.f85647b, R.color.black_alpha60, 2.0f));
            textView2.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER + heybox_price.getDiscount() + "%");
            i10 = 8;
        }
        viewGroup2.setVisibility(i10);
        viewGroup3.setVisibility(i10);
        viewGroup4.setVisibility(i10);
        if ("discount".equals(this.f85648c)) {
            if (heybox_price != null && com.max.hbutils.utils.n.r(heybox_price.getDeadline_timestamp()) > 0) {
                String[] strArrR = com.max.hbutils.utils.w.r(this.f85647b, com.max.hbutils.utils.n.r(heybox_price.getDeadline_timestamp()));
                if (!com.max.hbcommon.utils.c.u(strArrR[0]) && !com.max.hbcommon.utils.c.u(strArrR[1])) {
                    viewGroup3.setVisibility(0);
                    textView5.setText(strArrR[0]);
                    textView6.setText(strArrR[1]);
                }
            }
        } else if (!"release_date".equals(this.f85648c)) {
            viewGroup2.setVisibility(0);
            textView4.setText(gameBundleObj.getOwned_rate());
        } else if (com.max.hbutils.utils.n.r(gameBundleObj.getRelease_timestamp()) > 0) {
            viewGroup4.setVisibility(0);
            textView7.setText(com.max.hbutils.utils.w.g(gameBundleObj.getRelease_timestamp(), "."));
        }
        eVar.b().setOnClickListener(new a(gameBundleObj, gameBundleObj.getH_src(), gameBundleObj.getBundle_id()));
    }

    public void o(String str) {
        this.f85648c = str;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 35518, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameBundleObj);
    }
}
