package com.max.xiaoheihe.router.serviceimpl;

import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.bean.GsonTypeAdapterInfo;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.favour.HistoryContentObj;
import com.max.xiaoheihe.bean.game.GamePublishBaseObj;
import com.max.xiaoheihe.bean.game.ac.AcContentObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentObj;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.r6.R6ContentObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.rich.BaseRichModelObj;
import com.max.xiaoheihe.network.gson.AcContentDeserializer;
import com.max.xiaoheihe.network.gson.ApexContentDeserializer;
import com.max.xiaoheihe.network.gson.BBSLinkDeserializer;
import com.max.xiaoheihe.network.gson.BaseRichModelDeserializer;
import com.max.xiaoheihe.network.gson.FeedsContentDeserializer;
import com.max.xiaoheihe.network.gson.GameOverviewBaseDeserializer;
import com.max.xiaoheihe.network.gson.GamePublishBaseDeserializer;
import com.max.xiaoheihe.network.gson.GameRecommendBaseDeserializer;
import com.max.xiaoheihe.network.gson.GeneralSearchInfoDeserializer;
import com.max.xiaoheihe.network.gson.HBUIKITDeserializer;
import com.max.xiaoheihe.network.gson.HeyBoxContentDeserializer;
import com.max.xiaoheihe.network.gson.HistoryContentDeserializer;
import com.max.xiaoheihe.network.gson.ProxyParamDeserializer;
import com.max.xiaoheihe.network.gson.R6ContentDeserializer;
import com.max.xiaoheihe.network.gson.TopicHashtagDeserializer;
import com.max.xiaoheihe.network.gson.WebProtocolDeserializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.network.gson.BasePuzzleInfoDeserializer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GsonTypeAdapterProvider.java */
/* JADX INFO: loaded from: classes13.dex */
@n9.a({ud.a.class})
public class f implements ud.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // ud.a
    @dl.d
    public List<GsonTypeAdapterInfo> a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48358, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GsonTypeAdapterInfo(R6ContentObj.class, new R6ContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(HistoryContentObj.class, new HistoryContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(AcContentObj.class, new AcContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(ApexContentObj.class, new ApexContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(FeedsContentBaseObj.class, new FeedsContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(BBSLinkObj.class, new BBSLinkDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(HeyBoxContentObj.class, new HeyBoxContentDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(WebProtocolObj.class, new WebProtocolDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(GeneralSearchInfo.class, new GeneralSearchInfoDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(GameRecommendBaseObj.class, new GameRecommendBaseDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(BaseRichModelObj.class, new BaseRichModelDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(BasePuzzleInfo.class, new BasePuzzleInfoDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(UiKitViewObj.class, new HBUIKITDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(BaseGameOverviewObj.class, new GameOverviewBaseDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(BaseProxyParamObj.class, new ProxyParamDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(TopicHashtagWrapper.class, new TopicHashtagDeserializer()));
        arrayList.add(new GsonTypeAdapterInfo(GamePublishBaseObj.class, new GamePublishBaseDeserializer()));
        return arrayList;
    }
}
