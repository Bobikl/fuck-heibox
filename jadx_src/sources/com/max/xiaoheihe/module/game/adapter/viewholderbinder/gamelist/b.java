package com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist;

import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.utils.k;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.adapter.u;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameListPreviewVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86382g = 0;

    /* JADX INFO: compiled from: GameListPreviewVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f86383b;

        a(GameObj gameObj) {
            this.f86383b = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36219, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k.f(this.f86383b.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f86383b.getCustom_index(), this.f86383b.getCustom_suggested_from());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d d param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.e
    public void h(@dl.d s.e viewHolder, @dl.d GameObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36218, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        GameItemView gameItemView = (GameItemView) viewHolder.i(R.id.giv);
        View.OnClickListener aVar = null;
        if (m().h() instanceof u) {
            s<?> sVarH = m().h();
            f0.n(sVarH, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.GameListAdapter");
            aVar = ((u) sVarH).q();
        } else if (m().h() instanceof com.max.xiaoheihe.module.search.a) {
            String report_id = data.getReport_id();
            if (!(report_id == null || report_id.length() == 0)) {
                aVar = new a(data);
            }
        }
        gameItemView.g(data, l(), m(), true, aVar, viewHolder);
    }
}
