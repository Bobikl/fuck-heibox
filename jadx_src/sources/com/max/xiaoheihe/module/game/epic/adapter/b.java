package com.max.xiaoheihe.module.game.epic.adapter;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.EpicGameItemView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicGameWithTimeAndProgressAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends s<GameObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87411d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f87412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f87413c;

    /* JADX INFO: compiled from: EpicGameWithTimeAndProgressAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f87415c;

        a(GameObj gameObj) {
            this.f87415c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37509, new Class[]{View.class}, Void.TYPE).isSupported && b.this.n()) {
                b.this.f87412b.startActivity(z.b(b.this.f87412b, this.f87415c.getH_src(), r1.Z(this.f87415c), this.f87415c.getGame_type(), null, i0.m(), i0.j(), null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d Context mContext, @e List<? extends GameObj> list) {
        super(mContext, list, R.layout.item_epic_game);
        f0.p(mContext, "mContext");
        this.f87412b = mContext;
        this.f87413c = true;
    }

    public final boolean n() {
        return this.f87413c;
    }

    public void o(@e s.e eVar, @e GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 37507, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported || gameObj == null) {
            return;
        }
        EpicGameItemView epicGameItemView = eVar != null ? (EpicGameItemView) eVar.i(R.id.egiv) : null;
        if (epicGameItemView != null) {
            epicGameItemView.setFreeToGet(gameObj.isIs_free_get());
            com.max.hbimage.b.e0(gameObj.getImage(), epicGameItemView.getIv_game_icon(), ViewUtils.f(this.f87412b, 4.0f), R.drawable.common_default_placeholder_375x210);
            epicGameItemView.setName(gameObj.getName());
            epicGameItemView.setPlayTime(com.max.xiaoheihe.module.account.utils.d.b(gameObj.getPlaytime_forever()));
            epicGameItemView.setProgressStyle(gameObj);
            eVar.itemView.setOnClickListener(new a(gameObj));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 37508, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, gameObj);
    }

    public final void p(boolean z10) {
        this.f87413c = z10;
    }
}
