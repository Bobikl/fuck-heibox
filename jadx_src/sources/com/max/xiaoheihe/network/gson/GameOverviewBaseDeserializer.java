package com.max.xiaoheihe.network.gson;

import com.google.common.base.a;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewAllRadarObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewAuthsObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewBannerObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCareerObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewChartObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCommonTitleObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewDataStatsListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeroListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewItemEmptyObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewLogoObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMMRObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMatchListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMatchObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewNotifyObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewOverlayRecordObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewRecentMatchsObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewSpaceObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewUserListObj;
import com.max.xiaoheihe.module.game.adapter.overview.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes12.dex */
public class GameOverviewBaseDeserializer implements JsonDeserializer<BaseGameOverviewObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseGameOverviewObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        byte b10 = 3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47681, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, BaseGameOverviewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BaseGameOverviewObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("item_type") != null ? asJsonObject.get("item_type").getAsString() : "";
        String string = asJsonObject.toString();
        asString.hashCode();
        switch (asString.hashCode()) {
            case -2145229041:
                b10 = !asString.equals(b.B) ? (byte) -1 : (byte) 0;
                break;
            case -1965127391:
                b10 = !asString.equals(b.G) ? (byte) -1 : (byte) 1;
                break;
            case -1925129778:
                b10 = !asString.equals(b.f85772q) ? (byte) -1 : (byte) 2;
                break;
            case -1825511182:
                if (!asString.equals(b.f85765j)) {
                    b10 = -1;
                }
                break;
            case -1667837214:
                b10 = !asString.equals("teammate") ? (byte) -1 : (byte) 4;
                break;
            case -1221270899:
                b10 = !asString.equals("header") ? (byte) -1 : (byte) 5;
                break;
            case -1152484550:
                b10 = !asString.equals(b.H) ? (byte) -1 : (byte) 6;
                break;
            case -1039689911:
                b10 = !asString.equals("notify") ? (byte) -1 : (byte) 7;
                break;
            case -178324674:
                b10 = !asString.equals("calendar") ? (byte) -1 : (byte) 8;
                break;
            case -158618848:
                b10 = !asString.equals(b.I) ? (byte) -1 : (byte) 9;
                break;
            case 3327403:
                b10 = !asString.equals(b.f85771p) ? (byte) -1 : (byte) 10;
                break;
            case 13146162:
                b10 = !asString.equals(b.f85773r) ? (byte) -1 : (byte) 11;
                break;
            case 93181899:
                b10 = !asString.equals(b.D) ? (byte) -1 : (byte) 12;
                break;
            case 108270342:
                b10 = !asString.equals(b.f85776u) ? (byte) -1 : (byte) 13;
                break;
            case 109637894:
                b10 = !asString.equals("space") ? (byte) -1 : (byte) 14;
                break;
            case 287929860:
                b10 = !asString.equals(b.f85780y) ? (byte) -1 : (byte) 15;
                break;
            case 346713384:
                b10 = !asString.equals(b.f85767l) ? (byte) -1 : (byte) 16;
                break;
            case 461722372:
                b10 = !asString.equals(b.F) ? (byte) -1 : (byte) 17;
                break;
            case 933946929:
                b10 = !asString.equals(b.f85779x) ? (byte) -1 : a.f56668u;
                break;
            case 1024628025:
                b10 = !asString.equals(b.f85766k) ? (byte) -1 : (byte) 19;
                break;
            case 1183790700:
                b10 = !asString.equals(b.f85777v) ? (byte) -1 : a.f56671x;
                break;
            case 1713050337:
                b10 = !asString.equals(b.f85768m) ? (byte) -1 : a.f56672y;
                break;
            case 1746634138:
                b10 = !asString.equals(b.A) ? (byte) -1 : a.f56673z;
                break;
            case 1864936781:
                b10 = !asString.equals(b.f85781z) ? (byte) -1 : a.A;
                break;
            case 1865016024:
                b10 = !asString.equals(b.f85769n) ? (byte) -1 : a.B;
                break;
            case 1904240423:
                b10 = !asString.equals(b.f85778w) ? (byte) -1 : a.C;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return (BaseGameOverviewObj) k.a(string, GameOverviewChartObj.class);
            case 1:
                return (BaseGameOverviewObj) k.a(string, GameOverviewItemEmptyObj.class);
            case 2:
                return (BaseGameOverviewObj) k.a(string, GameOverviewHeroListObj.class);
            case 3:
            case 25:
                return (BaseGameOverviewObj) k.a(string, GameOverviewMMRObj.class);
            case 4:
                return (BaseGameOverviewObj) k.a(string, GameOverviewUserListObj.class);
            case 5:
            case 20:
                return (BaseGameOverviewObj) k.a(string, GameOverviewHeaderObj.class);
            case 6:
                return (BaseGameOverviewObj) k.a(string, GameOverviewBannerObj.class);
            case 7:
                return (BaseGameOverviewObj) k.a(string, GameOverviewNotifyObj.class);
            case 8:
                return (BaseGameOverviewObj) k.a(string, GameOverviewCalendarListObj.class);
            case 9:
                return (BaseGameOverviewObj) k.a(string, GameOverviewOverlayRecordObj.class);
            case 10:
                return (BaseGameOverviewObj) k.a(string, GameOverviewLogoObj.class);
            case 11:
                return (BaseGameOverviewObj) k.a(string, GameOverviewCareerObj.class);
            case 12:
                return (BaseGameOverviewObj) k.a(string, GameOverviewAuthsObj.class);
            case 13:
                return (BaseGameOverviewObj) k.a(string, GameOverviewAllRadarObj.class);
            case 14:
                return (BaseGameOverviewObj) k.a(string, GameOverviewSpaceObj.class);
            case 15:
            case 18:
            case 24:
                return (BaseGameOverviewObj) k.a(string, GameOverviewMatchListObj.class);
            case 16:
            case 19:
                return (BaseGameOverviewObj) k.a(string, GameOverviewDataStatsListObj.class);
            case 17:
                return (BaseGameOverviewObj) k.a(string, GameOverviewCommonTitleObj.class);
            case 21:
                return (BaseGameOverviewObj) k.a(string, GameOverviewRecentMatchsObj.class);
            case 22:
            case 23:
                return (BaseGameOverviewObj) k.a(string, GameOverviewMatchObj.class);
            default:
                return (BaseGameOverviewObj) new Gson().fromJson(string, BaseGameOverviewObj.class);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ BaseGameOverviewObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47682, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
