package com.max.xiaoheihe.module.game.adapter.recommend;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.g;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj;
import com.max.xiaoheihe.module.game.component.NormalGameCard;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NormalGameCardAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class e extends s<GameCardV2Obj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86293e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f86294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private NormalGameCard.Type f86295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private PathSrcNode f86296d;

    /* JADX INFO: compiled from: NormalGameCardAdapter.kt */
    public static final class a implements g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s.e f86299d;

        a(GameObj gameObj, s.e eVar) {
            this.f86298c = gameObj;
            this.f86299d = eVar;
        }

        @Override // com.max.hbcommon.analytics.g
        @dl.e
        public JsonObject getAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35910, new Class[0], JsonObject.class);
            if (patchProxyResultProxy.isSupported) {
                return (JsonObject) patchProxyResultProxy.result;
            }
            PathSrcNode pathSrcNodeN = e.this.n();
            JsonObject addition = pathSrcNodeN != null ? pathSrcNodeN.getAddition() : null;
            if (addition == null) {
                addition = new JsonObject();
            }
            addition.addProperty("appid", this.f86298c.getAppid());
            addition.addProperty("idx", Integer.valueOf(this.f86299d.getBindingAdapterPosition()));
            return addition;
        }

        @Override // com.max.hbcommon.analytics.g
        @dl.e
        public String getPath() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35909, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            PathSrcNode pathSrcNodeN = e.this.n();
            if (pathSrcNodeN != null) {
                return pathSrcNodeN.getPath();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d Context context, @dl.d List<GameCardV2Obj> list) {
        super(context, list, R.layout.item_normal_game_card);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f86294b = context;
        this.f86295c = NormalGameCard.Type.Normal;
    }

    @dl.d
    public final Context m() {
        return this.f86294b;
    }

    @dl.e
    public final PathSrcNode n() {
        return this.f86296d;
    }

    @dl.d
    public final NormalGameCard.Type o() {
        return this.f86295c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameCardV2Obj gameCardV2Obj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameCardV2Obj}, this, changeQuickRedirect, false, 35908, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, gameCardV2Obj);
    }

    public void p(@dl.e s.e eVar, @dl.e GameCardV2Obj gameCardV2Obj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameCardV2Obj}, this, changeQuickRedirect, false, 35907, new Class[]{s.e.class, GameCardV2Obj.class}, Void.TYPE).isSupported || gameCardV2Obj == null) {
            return;
        }
        NormalGameCard normalGameCard = eVar != null ? (NormalGameCard) eVar.i(R.id.game_card) : null;
        if (normalGameCard != null) {
            GameObj game = gameCardV2Obj.getGame();
            com.max.hbimage.b.K(game != null ? game.getImage() : null, normalGameCard.getIv_game());
            normalGameCard.setType(this.f86295c);
            GameObj game2 = gameCardV2Obj.getGame();
            normalGameCard.setGameName(game2 != null ? game2.getName() : null);
            if (com.max.hbcommon.utils.c.u(gameCardV2Obj.getColor())) {
                normalGameCard.getV_gradient().setVisibility(8);
            } else {
                normalGameCard.setGradientColor(com.max.xiaoheihe.utils.d.e1(gameCardV2Obj.getColor()));
                normalGameCard.getV_gradient().setVisibility(0);
            }
            GameObj game3 = gameCardV2Obj.getGame();
            if (game3 != null) {
                if (this.f86296d != null) {
                    normalGameCard.setTag(new a(game3, eVar));
                } else {
                    normalGameCard.setTag(null);
                }
                r1.d2(normalGameCard, game3, null);
            }
            GameObj game4 = gameCardV2Obj.getGame();
            normalGameCard.b(game4 != null ? game4.getHb_rich_texts() : null);
            GameObj game5 = gameCardV2Obj.getGame();
            normalGameCard.setPlatformsIcon(game5 != null ? game5.getPlatforms_icon() : null);
        }
    }

    public final void q(@dl.e PathSrcNode pathSrcNode) {
        this.f86296d = pathSrcNode;
    }

    public final void r(@dl.d NormalGameCard.Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 35906, new Class[]{NormalGameCard.Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "<set-?>");
        this.f86295c = type;
    }
}
