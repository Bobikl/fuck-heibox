package com.max.xiaoheihe.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentAdObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecLinksObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecSwitchObj;
import com.max.xiaoheihe.bean.news.FeedsContentArtRecObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentEntryObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameCommentObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameObj;
import com.max.xiaoheihe.bean.news.FeedsContentLinkCollectionObj;
import com.max.xiaoheihe.bean.news.FeedsContentLoginObj;
import com.max.xiaoheihe.bean.news.FeedsContentNewsTopicObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecHashObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecNewsObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecUsersObj;
import com.max.xiaoheihe.bean.news.FeedsContentTopicEntryObj;
import com.max.xiaoheihe.bean.news.FeedsLinkListObj;
import com.max.xiaoheihe.bean.news.FeedsUiKitObj;
import com.max.xiaoheihe.bean.news.events.FeedsEventListObj;
import com.max.xiaoheihe.bean.news.events.FeedsEventObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FeedsContentDeserializer implements JsonDeserializer<FeedsContentBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public FeedsContentBaseObj a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47679, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, FeedsContentBaseObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsContentBaseObj) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("content_type") != null ? asJsonObject.get("content_type").getAsString() : null;
        if ("1".equals(asJsonObject.get("is_update") != null ? asJsonObject.get("is_update").getAsString() : null)) {
            return (FeedsContentBaseObj) new Gson().fromJson(asJsonObject.toString(), FeedsContentBaseObj.class);
        }
        if ("12".equals(asString) || "13".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentGameObj.class);
        }
        if ("18".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentLoginObj.class);
        }
        if ("7".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentNewsTopicObj.class);
        }
        if ("10".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentEntryObj.class);
        }
        if ("21".equals(asString) || BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentRecNewsObj.class);
        }
        if ("22".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentRecSwitchObj.class);
        }
        if ("23".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentAdObj.class);
        }
        if ("24".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentRecHashObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_REC_WRITE_ARTICLE.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentArtRecObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_REC_LINK.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentRecLinksObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_REC_USERS.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentRecUsersObj.class);
        }
        if ("42".equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentGameCommentObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_UI_KIT.equals(asString)) {
            FeedsContentBaseObj feedsContentBaseObj = (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsUiKitObj.class);
            FeedsUiKitObj feedsUiKitObj = (FeedsUiKitObj) feedsContentBaseObj;
            if (feedsUiKitObj.getUi_kit() == null) {
                return feedsContentBaseObj;
            }
            feedsUiKitObj.setUi_kit(UiKitUtil.r(feedsUiKitObj.getUi_kit()));
            return feedsContentBaseObj;
        }
        if (BBSLinkObj.CONTENT_TYPE_TOPIC_ENTRY.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentTopicEntryObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_LINK_COLLECTION.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsContentLinkCollectionObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_HOR_LINK_LIST.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsLinkListObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_EVENT_LIST.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsEventListObj.class);
        }
        if (BBSLinkObj.CONTENT_TYPE_HOR_EVENT.equals(asString)) {
            return (FeedsContentBaseObj) k.a(asJsonObject.toString(), FeedsEventObj.class);
        }
        FeedsContentBaseObj feedsContentBaseObj2 = (FeedsContentBaseObj) k.a(asJsonObject.toString(), BBSLinkObj.class);
        if (feedsContentBaseObj2 != null && ((BBSLinkObj) feedsContentBaseObj2).getLinkid() == null) {
            try {
                JSONObject jSONObject = new JSONObject(asJsonObject.toString());
                if (jSONObject.has("link_id")) {
                    ((BBSLinkObj) feedsContentBaseObj2).setLinkid(jSONObject.getString("link_id"));
                }
            } catch (JSONException unused) {
            }
        }
        return feedsContentBaseObj2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.bean.news.FeedsContentBaseObj, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ FeedsContentBaseObj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 47680, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(jsonElement, type, jsonDeserializationContext);
    }
}
