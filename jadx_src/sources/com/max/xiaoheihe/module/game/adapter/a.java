package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameBundleObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.GameListActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: BundleListAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends com.max.hbcommon.base.adapter.s<GameBundleObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f85635b;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BundleListAdapter.java */
    public class ViewOnClickListenerC0762a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f85638d;

        ViewOnClickListenerC0762a(String str, String str2, String str3) {
            this.f85636b = str;
            this.f85637c = str2;
            this.f85638d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35516, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (b.f85645g.equals(this.f85636b)) {
                a.this.f85635b.startActivity(com.max.xiaoheihe.module.game.z.b(a.this.f85635b, this.f85637c, this.f85638d, "pc", null, i0.m(), i0.j(), null));
            } else {
                a.this.f85635b.startActivity(GameListActivity.T1(a.this.f85635b, this.f85638d));
            }
        }
    }

    public a(Context context, List<GameBundleObj> list) {
        super(context, list, R.layout.item_game_bundles);
        this.f85635b = context;
    }

    public void n(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 35514, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameBundleObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.d0(gameBundleObj.getImage(), (ImageView) eVar.i(R.id.iv_image), ViewUtils.f(this.f85635b, 4.0f));
        eVar.p(R.id.tv_name, gameBundleObj.getName());
        eVar.p(R.id.tv_game_count, String.format(this.f85635b.getResources().getString(R.string.count_of_game), gameBundleObj.getGame_count()));
        GameObj gameObj = new GameObj();
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
        eVar.b().setOnClickListener(new ViewOnClickListenerC0762a(gameBundleObj.getType(), gameBundleObj.getH_src(), gameBundleObj.getBundle_id()));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 35515, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameBundleObj);
    }
}
