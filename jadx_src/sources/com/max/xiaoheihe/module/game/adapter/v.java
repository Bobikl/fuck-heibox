package com.max.xiaoheihe.module.game.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.AbsListItemReportHelper;
import com.max.hbcommon.base.adapter.Event;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.max.xiaoheihe.bean.game.GameDiscountListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.PublishGameTitle;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.recommend.GeneralGameObj;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.CouponWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameOrProductItemReportHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameOrProductItemReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrProductItemReportHelper.kt\ncom/max/xiaoheihe/module/game/adapter/GameOrProductItemReportHelper\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,324:1\n29#2:325\n5#2,2:326\n22#2:328\n7#2:329\n29#2:330\n5#2,2:331\n22#2:333\n7#2:334\n29#2:335\n5#2,2:336\n22#2:338\n7#2:339\n29#2:340\n5#2,2:341\n22#2:343\n7#2:344\n29#2:345\n5#2,2:346\n22#2:348\n7#2:349\n29#2:350\n5#2,2:351\n22#2:353\n7#2:354\n29#2:355\n5#2,2:356\n22#2:358\n7#2:359\n29#2:360\n5#2,2:361\n22#2:363\n7#2:364\n29#2:365\n5#2,2:366\n22#2:368\n7#2:369\n29#2:370\n5#2,2:371\n22#2:373\n7#2:374\n*S KotlinDebug\n*F\n+ 1 GameOrProductItemReportHelper.kt\ncom/max/xiaoheihe/module/game/adapter/GameOrProductItemReportHelper\n*L\n54#1:325\n54#1:326,2\n54#1:328\n54#1:329\n64#1:330\n64#1:331,2\n64#1:333\n64#1:334\n146#1:335\n146#1:336,2\n146#1:338\n146#1:339\n153#1:340\n153#1:341,2\n153#1:343\n153#1:344\n157#1:345\n157#1:346,2\n157#1:348\n157#1:349\n211#1:350\n211#1:351,2\n211#1:353\n211#1:354\n240#1:355\n240#1:356,2\n240#1:358\n240#1:359\n244#1:360\n244#1:361,2\n244#1:363\n244#1:364\n248#1:365\n248#1:366,2\n248#1:368\n248#1:369\n253#1:370\n253#1:371,2\n253#1:373\n253#1:374\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public class v<L extends RecyclerView.Adapter<?>> extends AbsListItemReportHelper<L, Object, ReportItem> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f86379q = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private JsonObject f86380p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public v(@dl.e androidx.lifecycle.y yVar, @dl.d RecyclerView recyclerView) {
        this(yVar, recyclerView, false, null, 12, null);
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public v(@dl.e androidx.lifecycle.y yVar, @dl.d RecyclerView recyclerView, boolean z10) {
        this(yVar, recyclerView, z10, null, 8, null);
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public v(@dl.e androidx.lifecycle.y yVar, @dl.d RecyclerView recyclerView, boolean z10, @dl.e JsonObject jsonObject) {
        super(yVar, recyclerView, z10);
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        this.f86380p = jsonObject;
    }

    public /* synthetic */ v(androidx.lifecycle.y yVar, RecyclerView recyclerView, boolean z10, JsonObject jsonObject, int i10, kotlin.jvm.internal.u uVar) {
        this(yVar, recyclerView, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? null : jsonObject);
    }

    private final boolean v(Object obj) {
        return (obj instanceof GameObj) || (obj instanceof RecommendGameListItemObj) || (obj instanceof RecommendBoardItem) || (obj instanceof MallProductObj) || (obj instanceof PublishGameTitle) || (obj instanceof BBSUserNotifyObj) || (obj instanceof GameDiscountListObj) || (obj instanceof CouponWrapper);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    @dl.e
    public Object f(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        String name;
        String name2;
        String name3;
        String name4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 35649, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (!(viewHolder instanceof com.max.hbcommon.base.adapter.s.e)) {
            return null;
        }
        com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
        Object tag = eVar.itemView.getTag();
        if (v(tag)) {
            String str = "getAdapterEntityForPosition, tag = " + tag;
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name4 = v.class.getName();
                kotlin.jvm.internal.f0.m(name4);
            } else {
                name4 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name4);
            }
            sb2.append(name4);
            sb2.append(", ");
            sb2.append(str);
            aVar.q(sb2.toString());
            return tag;
        }
        if (v(eVar.g())) {
            String str2 = "getAdapterEntityForPosition, viewTag.tag = " + eVar.g();
            com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name3 = v.class.getName();
                kotlin.jvm.internal.f0.m(name3);
            } else {
                name3 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name3);
            }
            sb3.append(name3);
            sb3.append(", ");
            sb3.append(str2);
            aVar2.q(sb3.toString());
            return eVar.g();
        }
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = eVar.getBindingAdapter();
        String str3 = "getAdapterEntityForPosition, bindingAdapter = " + eVar.getBindingAdapter();
        com.max.heybox.hblog.g.a aVar3 = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb4 = new StringBuilder();
        if (v.class.isAnonymousClass()) {
            name = v.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = v.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb4.append(name);
        sb4.append(", ");
        sb4.append(str3);
        aVar3.q(sb4.toString());
        if (bindingAdapter instanceof com.max.hbcommon.base.adapter.s) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = eVar.getBindingAdapter();
            kotlin.jvm.internal.f0.n(bindingAdapter2, "null cannot be cast to non-null type com.max.hbcommon.base.adapter.RVCommonAdapter<*>");
            Object itemData = ((com.max.hbcommon.base.adapter.s) bindingAdapter2).getItemData(i10);
            String str4 = "getAdapterEntityForPosition, data = " + itemData + ", " + viewHolder + " viewTag.bindingAdapter  = " + eVar.getBindingAdapter();
            StringBuilder sb5 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name2 = v.class.getName();
                kotlin.jvm.internal.f0.m(name2);
            } else {
                name2 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name2);
            }
            sb5.append(name2);
            sb5.append(", ");
            sb5.append(str4);
            aVar3.q(sb5.toString());
            if (v(itemData)) {
                return itemData;
            }
        }
        if (bindingAdapter instanceof com.max.hbcommon.base.adapter.t) {
            Object itemData2 = ((com.max.hbcommon.base.adapter.t) bindingAdapter).getItemData(i10);
            if (v(itemData2)) {
                return itemData2;
            }
        }
        if (!(bindingAdapter instanceof com.max.hbcommon.base.adapter.w)) {
            return null;
        }
        Object itemData3 = ((com.max.hbcommon.base.adapter.w) bindingAdapter).getItemData(i10);
        if (v(itemData3)) {
            return itemData3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.module.game.adapter.ReportItem, java.lang.Object] */
    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public /* bridge */ /* synthetic */ ReportItem i(Object obj, Event event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, event}, this, changeQuickRedirect, false, 35650, new Class[]{Object.class, Event.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : s(obj, event);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public boolean k(@dl.d Object entity, @dl.d Event event) {
        String name;
        String name2;
        String name3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 35645, new Class[]{Object.class, Event.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        if (entity instanceof GameObj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("needPostEvent, entity.isReported_exposure = ");
            GameObj gameObj = (GameObj) entity;
            sb2.append(gameObj.isReported_exposure());
            sb2.append(", ");
            sb2.append(event);
            String string = sb2.toString();
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name3 = v.class.getName();
                kotlin.jvm.internal.f0.m(name3);
            } else {
                name3 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name3);
            }
            sb3.append(name3);
            sb3.append(", ");
            sb3.append(string);
            aVar.q(sb3.toString());
            return (gameObj.isReported_exposure() || gameObj.getItemType() == GameObj.ITEM_TYPE_DATA_CARD || gameObj.getItemType() == GameObj.ITEM_TYPE_GAMECOMMENT_TIPS || event != Event.SCROLL_IN) ? false : true;
        }
        if (entity instanceof RecommendGameListItemObj) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("needPostEvent, entity.isReported_exposure = ");
            RecommendGameListItemObj recommendGameListItemObj = (RecommendGameListItemObj) entity;
            sb4.append(recommendGameListItemObj.isReported_exposure());
            sb4.append(", ");
            sb4.append(event);
            String string2 = sb4.toString();
            com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb5 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name2 = v.class.getName();
                kotlin.jvm.internal.f0.m(name2);
            } else {
                name2 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name2);
            }
            sb5.append(name2);
            sb5.append(", ");
            sb5.append(string2);
            aVar2.q(sb5.toString());
            return !recommendGameListItemObj.isReported_exposure() && event == Event.SCROLL_IN;
        }
        if (entity instanceof PublishGameTitle) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("needPostEvent, entity.isReported_exposure = ");
            PublishGameTitle publishGameTitle = (PublishGameTitle) entity;
            GameObj game = publishGameTitle.getGame();
            sb6.append(game != null ? Boolean.valueOf(game.isReported_exposure()) : null);
            sb6.append(", ");
            sb6.append(event);
            String string3 = sb6.toString();
            com.max.heybox.hblog.g.a aVar3 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb7 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name = v.class.getName();
                kotlin.jvm.internal.f0.m(name);
            } else {
                name = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name);
            }
            sb7.append(name);
            sb7.append(", ");
            sb7.append(string3);
            aVar3.q(sb7.toString());
            GameObj game2 = publishGameTitle.getGame();
            return !(game2 != null ? game2.isReported_exposure() : true) && event == Event.SCROLL_IN;
        }
        if (entity instanceof MallProductObj) {
            return !((MallProductObj) entity).isReported_exposure() && event == Event.SCROLL_IN;
        }
        if (entity instanceof BBSUserNotifyObj) {
            return !((BBSUserNotifyObj) entity).isReported_exposure() && event == Event.SCROLL_IN;
        }
        if (entity instanceof GameDiscountListObj) {
            GameDiscountListObj gameDiscountListObj = (GameDiscountListObj) entity;
            if (gameDiscountListObj.getGame() == null) {
                return false;
            }
            GameObj game3 = gameDiscountListObj.getGame();
            return !(game3 != null ? game3.isReported_exposure() : true) && event == Event.SCROLL_IN;
        }
        if (entity instanceof RecommendBoardItem) {
            RecommendBoardItem recommendBoardItem = (RecommendBoardItem) entity;
            return (recommendBoardItem.getGame() == null || recommendBoardItem.isExposureReport() || event != Event.SCROLL_IN) ? false : true;
        }
        if (!(entity instanceof CouponWrapper)) {
            return false;
        }
        CouponWrapper couponWrapper = (CouponWrapper) entity;
        if (couponWrapper.f() == null) {
            return false;
        }
        GameObj gameObjF = couponWrapper.f();
        kotlin.jvm.internal.f0.m(gameObjF);
        return !gameObjF.isReported_exposure();
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public void l(@dl.d List<? extends Triple<? extends ReportItem, ? extends Event, Integer>> tripleList) {
        if (PatchProxy.proxy(new Object[]{tripleList}, this, changeQuickRedirect, false, 35648, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(tripleList, "tripleList");
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public void m(@dl.d Object entity, @dl.d Event event) {
        GameObj gameObjF;
        GameObj game;
        GameObj game2;
        if (PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 35646, new Class[]{Object.class, Event.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        super.m(entity, event);
        if (entity instanceof GameObj) {
            ((GameObj) entity).setReported_exposure(true);
        }
        if (entity instanceof RecommendGameListItemObj) {
            ((RecommendGameListItemObj) entity).setReported_exposure(true);
        }
        if (entity instanceof MallProductObj) {
            ((MallProductObj) entity).setReported_exposure(true);
        }
        if ((entity instanceof PublishGameTitle) && (game2 = ((PublishGameTitle) entity).getGame()) != null) {
            game2.setReported_exposure(true);
        }
        if (entity instanceof BBSUserNotifyObj) {
            ((BBSUserNotifyObj) entity).setReported_exposure(true);
        }
        if ((entity instanceof GameDiscountListObj) && (game = ((GameDiscountListObj) entity).getGame()) != null) {
            game.setReported_exposure(true);
        }
        if (entity instanceof RecommendBoardItem) {
            ((RecommendBoardItem) entity).setExposureReport(true);
        }
        if (!(entity instanceof CouponWrapper) || (gameObjF = ((CouponWrapper) entity).f()) == null) {
            return;
        }
        gameObjF.setReported_exposure(true);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public /* bridge */ /* synthetic */ void n(ReportItem reportItem, Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{reportItem, event, new Integer(i10)}, this, changeQuickRedirect, false, 35651, new Class[]{Object.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        t(reportItem, event, i10);
    }

    @dl.e
    public final JsonObject r() {
        return this.f86380p;
    }

    @dl.d
    public ReportItem s(@dl.d Object entity, @dl.d Event event) {
        ReportItem reportItem;
        String name;
        String name2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 35644, new Class[]{Object.class, Event.class}, ReportItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (ReportItem) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        if (entity instanceof GameObj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getShowEventEntity, ");
            GameObj gameObj = (GameObj) entity;
            sb2.append(gameObj.getName());
            String string = sb2.toString();
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name2 = v.class.getName();
                kotlin.jvm.internal.f0.m(name2);
            } else {
                name2 = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name2);
            }
            sb3.append(name2);
            sb3.append(", ");
            sb3.append(string);
            aVar.q(sb3.toString());
            String name3 = gameObj.getName();
            reportItem = new ReportItem(gameObj.getAppid(), null, name3, gameObj.getH_src(), "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
        } else if (entity instanceof RecommendGameListItemObj) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getShowEventEntity, ");
            RecommendGameListItemObj recommendGameListItemObj = (RecommendGameListItemObj) entity;
            sb4.append(recommendGameListItemObj.getGame_name());
            String string2 = sb4.toString();
            com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb5 = new StringBuilder();
            if (v.class.isAnonymousClass()) {
                name = v.class.getName();
                kotlin.jvm.internal.f0.m(name);
            } else {
                name = v.class.getSimpleName();
                kotlin.jvm.internal.f0.m(name);
            }
            sb5.append(name);
            sb5.append(", ");
            sb5.append(string2);
            aVar2.q(sb5.toString());
            String game_name = recommendGameListItemObj.getGame_name();
            reportItem = new ReportItem(recommendGameListItemObj.getAppid(), null, game_name, recommendGameListItemObj.getH_src(), "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
        } else {
            if (entity instanceof PublishGameTitle) {
                PublishGameTitle publishGameTitle = (PublishGameTitle) entity;
                GameObj game = publishGameTitle.getGame();
                String name4 = game != null ? game.getName() : null;
                GameObj game2 = publishGameTitle.getGame();
                String appid = game2 != null ? game2.getAppid() : null;
                GameObj game3 = publishGameTitle.getGame();
                reportItem = new ReportItem(appid, null, name4, game3 != null ? game3.getH_src() : null, "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
            } else if (entity instanceof MallProductObj) {
                MallProductObj mallProductObj = (MallProductObj) entity;
                String name5 = mallProductObj.getName();
                String sku_id = mallProductObj.getSku_id();
                MallGameInfoObj game_info = mallProductObj.getGame_info();
                String appid2 = game_info != null ? game_info.getAppid() : null;
                reportItem = new ReportItem(appid2, sku_id, name5, mallProductObj.getH_src(), "" + com.max.hbutils.utils.w.C(), null, null, 96, null);
            } else if (entity instanceof BBSUserNotifyObj) {
                BBSUserNotifyObj bBSUserNotifyObj = (BBSUserNotifyObj) entity;
                String title = bBSUserNotifyObj.getTitle();
                String skuId = bBSUserNotifyObj.getSkuId();
                reportItem = new ReportItem(bBSUserNotifyObj.getAppid(), skuId, title, bBSUserNotifyObj.getH_src(), "" + com.max.hbutils.utils.w.C(), lb.d.I4, bBSUserNotifyObj.getReportAddition());
            } else if (entity instanceof GameDiscountListObj) {
                GameDiscountListObj gameDiscountListObj = (GameDiscountListObj) entity;
                GameObj game4 = gameDiscountListObj.getGame();
                String name6 = game4 != null ? game4.getName() : null;
                GameObj game5 = gameDiscountListObj.getGame();
                String appid3 = game5 != null ? game5.getAppid() : null;
                GameObj game6 = gameDiscountListObj.getGame();
                reportItem = new ReportItem(appid3, null, name6, game6 != null ? game6.getH_src() : null, "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
            } else if (entity instanceof RecommendBoardItem) {
                RecommendBoardItem recommendBoardItem = (RecommendBoardItem) entity;
                GeneralGameObj game7 = recommendBoardItem.getGame();
                String name7 = game7 != null ? game7.getName() : null;
                GeneralGameObj game8 = recommendBoardItem.getGame();
                String appid4 = game8 != null ? game8.getAppid() : null;
                GeneralGameObj game9 = recommendBoardItem.getGame();
                reportItem = new ReportItem(appid4, null, name7, game9 != null ? game9.getH_src() : null, "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
            } else if (entity instanceof CouponWrapper) {
                CouponWrapper couponWrapper = (CouponWrapper) entity;
                GameObj gameObjF = couponWrapper.f();
                String name8 = gameObjF != null ? gameObjF.getName() : null;
                GameObj gameObjF2 = couponWrapper.f();
                String appid5 = gameObjF2 != null ? gameObjF2.getAppid() : null;
                GameObj gameObjF3 = couponWrapper.f();
                reportItem = new ReportItem(appid5, null, name8, gameObjF3 != null ? gameObjF3.getH_src() : null, "" + com.max.hbutils.utils.w.C(), null, null, 98, null);
            } else {
                reportItem = new ReportItem(null, null, null, null, null, null, null, 127, null);
            }
        }
        if (reportItem.j() == null) {
            reportItem.q(this.f86380p);
        } else {
            reportItem.q(com.max.hbutils.utils.k.h(reportItem.j(), this.f86380p));
        }
        return reportItem;
    }

    public void t(@dl.d ReportItem entity, @dl.d Event event, int i10) {
        String name;
        if (PatchProxy.proxy(new Object[]{entity, event, new Integer(i10)}, this, changeQuickRedirect, false, 35647, new Class[]{ReportItem.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        String str = "onItemExposure, " + entity.m();
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (v.class.isAnonymousClass()) {
            name = v.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = v.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (com.max.hbcommon.utils.c.u(entity.n())) {
            w.b(entity, i10);
        } else {
            com.max.hbcommon.analytics.d.d("3", entity.n(), null, entity.j());
        }
    }

    public final void u(@dl.e JsonObject jsonObject) {
        this.f86380p = jsonObject;
    }
}
