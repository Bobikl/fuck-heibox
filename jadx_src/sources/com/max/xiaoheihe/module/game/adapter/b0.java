package com.max.xiaoheihe.module.game.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GetGameHistoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: GetGamesHistoryAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b0 extends com.max.hbcommon.base.adapter.s<GetGameHistoryObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85653c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f85654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@dl.d Context mContext, @dl.d List<GetGameHistoryObj> list) {
        super(mContext, list, R.layout.item_get_games_history);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85654b = mContext;
    }

    @dl.d
    public final Context m() {
        return this.f85654b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GetGameHistoryObj getGameHistoryObj) {
        if (PatchProxy.proxy(new Object[]{eVar, getGameHistoryObj}, this, changeQuickRedirect, false, 35676, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GetGameHistoryObj.class}, Void.TYPE).isSupported || getGameHistoryObj == null) {
            return;
        }
        RecyclerView recyclerView = eVar != null ? (RecyclerView) eVar.i(R.id.rv_game) : null;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85654b));
        }
        u uVar = new u(this.f85654b, getGameHistoryObj.getValue(), null, null);
        com.max.hbcommon.base.adapter.t tVar = new com.max.hbcommon.base.adapter.t(uVar);
        Context context = this.f85654b;
        kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type android.app.Activity");
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_get_game_history_header, (ViewGroup) recyclerView, false);
        ((TextView) viewInflate.findViewById(R.id.tv_time)).setText(getGameHistoryObj.getKey());
        tVar.p(R.layout.layout_get_game_history_header, viewInflate);
        uVar.x(true);
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(tVar);
    }

    public final void o(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35675, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "<set-?>");
        this.f85654b = context;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GetGameHistoryObj getGameHistoryObj) {
        if (PatchProxy.proxy(new Object[]{eVar, getGameHistoryObj}, this, changeQuickRedirect, false, 35677, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, getGameHistoryObj);
    }
}
