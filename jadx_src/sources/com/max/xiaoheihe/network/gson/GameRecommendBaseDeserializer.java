package com.max.xiaoheihe.network.gson;

import com.google.common.base.a;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.game.recommend.AwardGameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.AwardGameList;
import com.max.xiaoheihe.bean.game.recommend.BannerObj;
import com.max.xiaoheihe.bean.game.recommend.CouponNewcomerObj;
import com.max.xiaoheihe.bean.game.recommend.FactoryListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.max.xiaoheihe.bean.game.recommend.GameDuoListObj;
import com.max.xiaoheihe.bean.game.recommend.GameListObj;
import com.max.xiaoheihe.bean.game.recommend.GameListWithTabObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.MenuV2Obj;
import com.max.xiaoheihe.bean.game.recommend.MiniProgramListObj;
import com.max.xiaoheihe.bean.game.recommend.RecGoodsObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardMultiObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendMenuObj;
import com.max.xiaoheihe.bean.game.recommend.SpaceObj;
import com.max.xiaoheihe.bean.game.recommend.TitleObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class GameRecommendBaseDeserializer implements JsonDeserializer<GameRecommendBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public GameRecommendBaseObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        byte b10 = 3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47685, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, GameRecommendBaseObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRecommendBaseObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("type") != null ? asJsonObject.get("type").getAsString() : "";
        String string = asJsonObject.toString();
        asString.hashCode();
        switch (asString.hashCode()) {
            case -2004202929:
                b10 = asString.equals(GameRecommendAdapter.C) ? (byte) 0 : (byte) -1;
                break;
            case -1880535373:
                b10 = asString.equals(GameRecommendAdapter.A) ? (byte) 1 : (byte) -1;
                break;
            case -1404215812:
                b10 = asString.equals(GameRecommendAdapter.f85963m) ? (byte) 2 : (byte) -1;
                break;
            case -1359492551:
                if (!asString.equals("mini_app")) {
                    b10 = -1;
                }
                break;
            case -1354478055:
                b10 = asString.equals(GameRecommendAdapter.E) ? (byte) 4 : (byte) -1;
                break;
            case -1261964852:
                b10 = asString.equals(GameRecommendAdapter.f85976z) ? (byte) 5 : (byte) -1;
                break;
            case -1221270899:
                b10 = asString.equals("header") ? (byte) 6 : (byte) -1;
                break;
            case -895758574:
                b10 = asString.equals("game_comment") ? (byte) 7 : (byte) -1;
                break;
            case -648178255:
                b10 = asString.equals(GameRecommendAdapter.B) ? (byte) 8 : (byte) -1;
                break;
            case -571200773:
                b10 = asString.equals(GameRecommendAdapter.f85973w) ? (byte) 9 : (byte) -1;
                break;
            case 3347807:
                b10 = asString.equals(GameRecommendAdapter.f85958h) ? (byte) 10 : (byte) -1;
                break;
            case 14056514:
                b10 = asString.equals(GameRecommendAdapter.f85970t) ? (byte) 11 : (byte) -1;
                break;
            case 109637894:
                b10 = asString.equals("space") ? (byte) 12 : (byte) -1;
                break;
            case 110371416:
                b10 = asString.equals("title") ? (byte) 13 : (byte) -1;
                break;
            case 157132561:
                b10 = asString.equals(GameRecommendAdapter.f85974x) ? (byte) 14 : (byte) -1;
                break;
            case 401221135:
                b10 = asString.equals(GameRecommendAdapter.f85972v) ? (byte) 15 : (byte) -1;
                break;
            case 406635402:
                b10 = asString.equals(GameRecommendAdapter.f85965o) ? (byte) 16 : (byte) -1;
                break;
            case 525666023:
                b10 = asString.equals(GameRecommendAdapter.D) ? (byte) 17 : (byte) -1;
                break;
            case 612084590:
                b10 = asString.equals(GameRecommendAdapter.f85968r) ? a.f56668u : (byte) -1;
                break;
            case 738012435:
                b10 = asString.equals("middle_game_card") ? (byte) 19 : (byte) -1;
                break;
            case 899109442:
                b10 = asString.equals("mini_app_v2") ? a.f56671x : (byte) -1;
                break;
            case 950365532:
                b10 = asString.equals(GameRecommendAdapter.f85959i) ? a.f56672y : (byte) -1;
                break;
            case 1020273680:
                b10 = asString.equals(GameRecommendAdapter.f85971u) ? a.f56673z : (byte) -1;
                break;
            case 1089390270:
                b10 = asString.equals("big_game_card") ? a.A : (byte) -1;
                break;
            case 1859588681:
                b10 = asString.equals(GameRecommendAdapter.f85964n) ? a.B : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return (GameRecommendBaseObj) k.a(string, GameCardVideoObj.class);
            case 1:
                return (GameRecommendBaseObj) k.a(string, FactoryListObj.class);
            case 2:
            case 24:
                return (GameRecommendBaseObj) k.a(string, GameDuoListObj.class);
            case 3:
            case 20:
                return (GameRecommendBaseObj) k.a(string, MiniProgramListObj.class);
            case 4:
                GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) k.a(string, CouponNewcomerObj.class);
                if (n.r(((CouponNewcomerObj) gameRecommendBaseObj).getDeadline_ts()) * 1000 > System.currentTimeMillis()) {
                    return gameRecommendBaseObj;
                }
                GameRecommendBaseObj gameRecommendBaseObj2 = (GameRecommendBaseObj) new Gson().fromJson(string, GameRecommendBaseObj.class);
                gameRecommendBaseObj2.setType("space");
                return gameRecommendBaseObj2;
            case 5:
                return (GameRecommendBaseObj) k.a(string, RecommendBoardMultiObj.class);
            case 6:
                return (GameRecommendBaseObj) k.a(string, BannerObj.class);
            case 7:
                return (GameRecommendBaseObj) k.a(string, RecommendBoardObj.class);
            case 8:
                return (GameRecommendBaseObj) k.a(string, GameListWithTabObj.class);
            case 9:
            case 14:
            case 15:
                return (GameRecommendBaseObj) k.a(string, GameCardListV2Obj.class);
            case 10:
                return (GameRecommendBaseObj) k.a(string, RecommendMenuObj.class);
            case 11:
                AwardGameCardListObj awardGameCardListObj = (AwardGameCardListObj) k.a(string, AwardGameCardListObj.class);
                GameCardListObj gameCardListObj = new GameCardListObj();
                gameCardListObj.setReport_additional(awardGameCardListObj.getReport_additional());
                gameCardListObj.setReport_path(awardGameCardListObj.getReport_path());
                gameCardListObj.setReported_exposure(awardGameCardListObj.isReported_exposure());
                gameCardListObj.setAuto_scroll(awardGameCardListObj.getAuto_scroll());
                if (!c.w(awardGameCardListObj.getAward_series())) {
                    ArrayList<GameCardObj> arrayList = new ArrayList<>();
                    ArrayList<KeyDescObj> arrayList2 = new ArrayList<>();
                    for (AwardGameList awardGameList : awardGameCardListObj.getAward_series()) {
                        KeyDescObj keyDescObj = new KeyDescObj();
                        keyDescObj.setIndex(arrayList.size());
                        keyDescObj.setName(awardGameList.getAward_name());
                        keyDescObj.setId(awardGameList.getAward_id());
                        arrayList2.add(keyDescObj);
                        if (awardGameList.getGames() != null) {
                            arrayList.addAll(awardGameList.getGames());
                        }
                    }
                    gameCardListObj.setTab(arrayList2);
                    gameCardListObj.setGames(arrayList);
                }
                if (n.p(gameCardListObj.getAuto_scroll()) > 0.0f) {
                    gameCardListObj.setType(GameRecommendAdapter.f85969s);
                } else {
                    gameCardListObj.setType(GameRecommendAdapter.f85968r);
                }
                return gameCardListObj;
            case 12:
                return (GameRecommendBaseObj) k.a(string, SpaceObj.class);
            case 13:
                return (GameRecommendBaseObj) k.a(string, TitleObj.class);
            case 16:
                return (GameRecommendBaseObj) k.a(string, GameListObj.class);
            case 17:
                return (GameRecommendBaseObj) k.a(string, RecGoodsObj.class);
            case 18:
            case 22:
                GameRecommendBaseObj gameRecommendBaseObj3 = (GameRecommendBaseObj) k.a(string, GameCardListObj.class);
                if (n.p(((GameCardListObj) gameRecommendBaseObj3).getAuto_scroll()) <= 0.0f) {
                    return gameRecommendBaseObj3;
                }
                gameRecommendBaseObj3.setType(GameRecommendAdapter.f85969s);
                return gameRecommendBaseObj3;
            case 19:
            case 23:
                return (GameRecommendBaseObj) k.a(string, GameCardObj.class);
            case 21:
                return (GameRecommendBaseObj) k.a(string, MenuV2Obj.class);
            default:
                return (GameRecommendBaseObj) new Gson().fromJson(string, GameRecommendBaseObj.class);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ GameRecommendBaseObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47686, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
