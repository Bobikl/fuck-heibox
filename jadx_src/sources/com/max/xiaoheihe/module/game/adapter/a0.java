package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.photoview.PhotoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: GameShotPreviewAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a0 extends com.max.hbcommon.base.adapter.s<GameScreenPicShotObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85640c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@dl.d Context context, @dl.d List<GameScreenPicShotObj> list) {
        super(context, list, R.layout.item_game_shot_preview);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85641b = context;
    }

    @dl.d
    public final Context m() {
        return this.f85641b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameScreenPicShotObj gameScreenPicShotObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameScreenPicShotObj}, this, changeQuickRedirect, false, 35673, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameScreenPicShotObj.class}, Void.TYPE).isSupported || eVar == null || gameScreenPicShotObj == null) {
            return;
        }
        PhotoView photoView = (PhotoView) eVar.i(R.id.photo_view);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_game_logo);
        TextView textView = (TextView) eVar.i(R.id.tv_desc);
        TextView textView2 = (TextView) eVar.i(R.id.tv_time);
        com.max.hbimage.b.K(gameScreenPicShotObj.getImg_url(), photoView);
        com.max.hbimage.b.e0(gameScreenPicShotObj.getBg_img(), imageView, ViewUtils.p(this.f85641b, imageView, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
        String desc = gameScreenPicShotObj.getDesc();
        if (desc == null) {
            desc = gameScreenPicShotObj.getName();
        }
        textView.setText(desc);
        textView2.setText(com.max.hbutils.utils.w.i(gameScreenPicShotObj.getPublish_timestamp(), com.max.hbutils.utils.w.f73605l));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameScreenPicShotObj gameScreenPicShotObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameScreenPicShotObj}, this, changeQuickRedirect, false, 35674, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameScreenPicShotObj);
    }
}
