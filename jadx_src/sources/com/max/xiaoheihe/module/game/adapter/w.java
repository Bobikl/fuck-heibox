package com.max.xiaoheihe.module.game.adapter;

import android.view.View;
import com.google.gson.JsonObject;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: GameOrProductItemReportHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f86398a = "/mall/sku/show";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f86399b = "/game/item/show";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d View gameItemView, int i10) {
        if (PatchProxy.proxy(new Object[]{gameItemView, new Integer(i10)}, null, changeQuickRedirect, true, 35652, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(gameItemView, "gameItemView");
        Object tag = gameItemView.getTag();
        if (tag instanceof GameObj) {
            GameObj gameObj = (GameObj) tag;
            if (gameObj.isReported_exposure()) {
                return;
            }
            gameObj.setReported_exposure(true);
            b(new ReportItem(gameObj.getAppid(), null, null, gameObj.getH_src(), "" + com.max.hbutils.utils.w.C(), null, null, 102, null), i10);
        }
    }

    public static final void b(@dl.d ReportItem entity, int i10) {
        if (PatchProxy.proxy(new Object[]{entity, new Integer(i10)}, null, changeQuickRedirect, true, 35653, new Class[]{ReportItem.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        if (entity.k() == null && entity.o() == null) {
            return;
        }
        com.max.heybox.hblog.b.c("GameItemReportHelper, onGameItemExposure, " + entity.m() + ", " + entity.k() + ' ' + entity + ", bindingAdapterPosition = " + i10);
        JsonObject jsonObject = new JsonObject();
        if (entity.k() != null) {
            jsonObject.addProperty("app_id", entity.k());
        }
        if (entity.o() != null) {
            jsonObject.addProperty("sku_id", entity.o());
        }
        if (entity.l() != null) {
            jsonObject.addProperty("h_src", entity.l());
        }
        jsonObject.addProperty("idx", Integer.valueOf(i10));
        com.max.hbcommon.analytics.d.d("3", entity.k() != null ? f86399b : f86398a, null, jsonObject);
    }
}
