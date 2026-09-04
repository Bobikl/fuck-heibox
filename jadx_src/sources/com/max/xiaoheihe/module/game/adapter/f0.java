package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: SteamGameShotFolderAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f0 extends com.max.hbcommon.base.adapter.s<GameShotPictureFolderObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f85692e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private e0 f85694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private GameShotPictureFolderObj f85695d;

    /* JADX INFO: compiled from: SteamGameShotFolderAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameShotPictureFolderObj f85697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85698d;

        a(GameShotPictureFolderObj gameShotPictureFolderObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f85697c = gameShotPictureFolderObj;
            this.f85698d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35693, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameShotPictureFolderObj gameShotPictureFolderObjN = f0.this.n();
            f0.this.q(this.f85697c);
            try {
                f0 f0Var = f0.this;
                f0Var.notifyItemChanged(f0Var.getDataList().indexOf(gameShotPictureFolderObjN));
                f0 f0Var2 = f0.this;
                f0Var2.notifyItemChanged(f0Var2.getDataList().indexOf(f0.this.n()));
            } catch (Throwable unused) {
            }
            e0 e0VarO = f0.this.o();
            if (e0VarO != null) {
                GameShotPictureFolderObj gameShotPictureFolderObj = this.f85697c;
                kotlin.jvm.internal.f0.m(gameShotPictureFolderObj);
                e0VarO.a(gameShotPictureFolderObj, this.f85698d.getAbsoluteAdapterPosition());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@dl.d Context context, @dl.d List<GameShotPictureFolderObj> list) {
        super(context, list, R.layout.item_steam_game_shot_folder);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85693b = context;
    }

    @dl.d
    public final Context m() {
        return this.f85693b;
    }

    @dl.e
    public final GameShotPictureFolderObj n() {
        return this.f85695d;
    }

    @dl.e
    public final e0 o() {
        return this.f85694c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameShotPictureFolderObj gameShotPictureFolderObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameShotPictureFolderObj}, this, changeQuickRedirect, false, 35692, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, gameShotPictureFolderObj);
    }

    public void p(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameShotPictureFolderObj gameShotPictureFolderObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameShotPictureFolderObj}, this, changeQuickRedirect, false, 35691, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameShotPictureFolderObj.class}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        if (gameShotPictureFolderObj != null) {
            ImageView imageView = (ImageView) eVar.i(R.id.iv_folder_icon);
            TextView textView = (TextView) eVar.i(R.id.tv_folder_name);
            if (com.max.hbcommon.utils.c.u(gameShotPictureFolderObj.getIcon())) {
                imageView.setVisibility(8);
            } else {
                com.max.hbimage.b.e0(gameShotPictureFolderObj.getIcon(), imageView, ViewUtils.p(this.f85693b, imageView, ViewUtils.ViewType.IMAGE), R.drawable.common_default_game_avatar_74x74);
                imageView.setVisibility(0);
            }
            textView.setText(gameShotPictureFolderObj.getName());
            int iE = com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color);
            if (kotlin.jvm.internal.f0.g(this.f85695d, gameShotPictureFolderObj)) {
                View view = eVar.itemView;
                Context context = this.f85693b;
                view.setBackground(com.max.hbutils.utils.q.i(context, R.color.background_card_1_color, R.color.text_primary_2_color, 0.5f, ViewUtils.h0(context, ViewUtils.o(context, view))));
            } else {
                View view2 = eVar.itemView;
                view2.setBackground(ViewUtils.H(ViewUtils.o(this.f85693b, view2), iE, iE));
            }
        }
        eVar.itemView.setOnClickListener(new a(gameShotPictureFolderObj, eVar));
    }

    public final void q(@dl.e GameShotPictureFolderObj gameShotPictureFolderObj) {
        this.f85695d = gameShotPictureFolderObj;
    }

    public final void r(@dl.e e0 e0Var) {
        this.f85694c = e0Var;
    }
}
