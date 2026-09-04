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

/* JADX INFO: compiled from: GameShotFolderAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class z extends com.max.hbcommon.base.adapter.s<GameShotPictureFolderObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86427d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f86428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private e0 f86429c;

    /* JADX INFO: compiled from: GameShotFolderAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameShotPictureFolderObj f86431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86432d;

        a(GameShotPictureFolderObj gameShotPictureFolderObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f86431c = gameShotPictureFolderObj;
            this.f86432d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e0 e0VarN;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35672, new Class[]{View.class}, Void.TYPE).isSupported || (e0VarN = z.this.n()) == null) {
                return;
            }
            GameShotPictureFolderObj gameShotPictureFolderObj = this.f86431c;
            kotlin.jvm.internal.f0.m(gameShotPictureFolderObj);
            e0VarN.a(gameShotPictureFolderObj, this.f86432d.getAbsoluteAdapterPosition());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@dl.d Context context, @dl.d List<GameShotPictureFolderObj> list) {
        super(context, list, R.layout.item_game_shot_folder);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f86428b = context;
    }

    @dl.d
    public final Context m() {
        return this.f86428b;
    }

    @dl.e
    public final e0 n() {
        return this.f86429c;
    }

    public void o(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameShotPictureFolderObj gameShotPictureFolderObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameShotPictureFolderObj}, this, changeQuickRedirect, false, 35670, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameShotPictureFolderObj.class}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        if (gameShotPictureFolderObj != null) {
            ImageView imageView = (ImageView) eVar.i(R.id.iv_folder_img);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_folder_icon);
            TextView textView = (TextView) eVar.i(R.id.tv_folder_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_pic_num);
            View viewI = eVar.i(R.id.v_div);
            com.max.hbimage.b.e0(gameShotPictureFolderObj.getThumb(), imageView, ViewUtils.p(this.f86428b, imageView, ViewUtils.ViewType.IMAGE), R.drawable.default_game_avater_351x150);
            if (com.max.hbcommon.utils.c.u(gameShotPictureFolderObj.getIcon())) {
                imageView2.setVisibility(8);
            } else {
                com.max.hbimage.b.L(gameShotPictureFolderObj.getIcon(), imageView2, R.drawable.common_default_game_avatar_74x74);
                imageView2.setVisibility(0);
            }
            textView.setText(gameShotPictureFolderObj.getName());
            textView2.setText((char) 65288 + gameShotPictureFolderObj.getValid_count() + (char) 65289);
            viewI.setVisibility(eVar.getAbsoluteAdapterPosition() == getDataList().size() - 1 ? 8 : 0);
        }
        eVar.itemView.setOnClickListener(new a(gameShotPictureFolderObj, eVar));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameShotPictureFolderObj gameShotPictureFolderObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameShotPictureFolderObj}, this, changeQuickRedirect, false, 35671, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, gameShotPictureFolderObj);
    }

    public final void p(@dl.e e0 e0Var) {
        this.f86429c = e0Var;
    }
}
