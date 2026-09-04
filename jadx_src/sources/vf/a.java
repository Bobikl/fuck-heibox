package vf;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.y;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbshare.c;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import dl.d;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AccelWorldCardShare.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final h a(@d h hVar, @d FragmentManager manager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, manager}, null, changeQuickRedirect, true, 41294, new Class[]{h.class, FragmentManager.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(manager, "manager");
        hVar.X3(manager, "share_bottom_dialog");
        return hVar;
    }

    @d
    public static final BottomSheetsPictureShare b(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d FragmentManager manager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, manager}, null, changeQuickRedirect, true, 41295, new Class[]{BottomSheetsPictureShare.class, FragmentManager.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(manager, "manager");
        bottomSheetsPictureShare.X3(manager, "share_bottom_dialog");
        return bottomSheetsPictureShare;
    }

    @d
    public static final h c(@d h hVar, @d x70 sharePanelViewBinding, @d ShareInfoObj shareInfoObj, @d c.b report, @d yh.a<b2> sharePostWidgetClickCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, sharePanelViewBinding, shareInfoObj, report, sharePostWidgetClickCallback}, null, changeQuickRedirect, true, 41291, new Class[]{h.class, x70.class, ShareInfoObj.class, c.b.class, yh.a.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        f0.p(sharePostWidgetClickCallback, "sharePostWidgetClickCallback");
        return new uf.a().c(hVar, sharePanelViewBinding, shareInfoObj, report, sharePostWidgetClickCallback);
    }

    @d
    public static final BottomSheetsPictureShare d(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d Bitmap bitmap, @d com.max.hbcommon.base.d baseFragment, @d x70 sharePanelViewBinding, @d CardObj cardObj, @d ShareInfoObj shareInfoObj, @d c.b report) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, bitmap, baseFragment, sharePanelViewBinding, cardObj, shareInfoObj, report}, null, changeQuickRedirect, true, 41292, new Class[]{BottomSheetsPictureShare.class, Bitmap.class, com.max.hbcommon.base.d.class, x70.class, CardObj.class, ShareInfoObj.class, c.b.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(bitmap, "bitmap");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(cardObj, "cardObj");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        return new uf.a().d(bitmap, bottomSheetsPictureShare, baseFragment, sharePanelViewBinding, cardObj, shareInfoObj, report);
    }

    @d
    public static final BottomSheetsPictureShare e(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d com.max.hbcommon.base.d baseFragment, @d x70 sharePanelViewBinding, @d CardObjV2 cardObjV2, @d ShareInfoObj shareInfoObj, @d c.b report) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, baseFragment, sharePanelViewBinding, cardObjV2, shareInfoObj, report}, null, changeQuickRedirect, true, 41293, new Class[]{BottomSheetsPictureShare.class, com.max.hbcommon.base.d.class, x70.class, CardObjV2.class, ShareInfoObj.class, c.b.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(cardObjV2, "cardObjV2");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        return new uf.a().e(bottomSheetsPictureShare, baseFragment, sharePanelViewBinding, cardObjV2, shareInfoObj, report);
    }

    @d
    public static final h f(@d h hVar, @d ShareWindowObj windowInfo, @d Activity mContext, @d List<CardObj> cardList, @d com.max.hbcommon.base.d baseFragment, @d l<? super Integer, b2> scrollStateIdLeCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, windowInfo, mContext, cardList, baseFragment, scrollStateIdLeCallback}, null, changeQuickRedirect, true, 41287, new Class[]{h.class, ShareWindowObj.class, Activity.class, List.class, com.max.hbcommon.base.d.class, l.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(windowInfo, "windowInfo");
        f0.p(mContext, "mContext");
        f0.p(cardList, "cardList");
        f0.p(baseFragment, "baseFragment");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        new uf.a().k(hVar, windowInfo, mContext, cardList, baseFragment, scrollStateIdLeCallback);
        return hVar;
    }

    @d
    public static final h g(@d h hVar, @d ShareWindowObj windowInfo, @d Activity context, @d List<CardObjV2> cardListV2, @d com.max.hbcommon.base.d baseFragment, @d l<? super Integer, b2> scrollStateIdLeCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, windowInfo, context, cardListV2, baseFragment, scrollStateIdLeCallback}, null, changeQuickRedirect, true, 41288, new Class[]{h.class, ShareWindowObj.class, Activity.class, List.class, com.max.hbcommon.base.d.class, l.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(windowInfo, "windowInfo");
        f0.p(context, "context");
        f0.p(cardListV2, "cardListV2");
        f0.p(baseFragment, "baseFragment");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        new uf.a().l(hVar, windowInfo, context, cardListV2, baseFragment, scrollStateIdLeCallback);
        return hVar;
    }

    @d
    public static final BottomSheetsPictureShare h(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, bitmap}, null, changeQuickRedirect, true, 41289, new Class[]{BottomSheetsPictureShare.class, Bitmap.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(bitmap, "bitmap");
        new uf.a().m(bottomSheetsPictureShare, bitmap);
        return bottomSheetsPictureShare;
    }

    @d
    public static final BottomSheetsPictureShare i(@d BottomSheetsPictureShare bottomSheetsPictureShare, @d CardObjV2 cardObjV2, @d y lifecycleOwner, @d ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, cardObjV2, lifecycleOwner, shareInfoObj}, null, changeQuickRedirect, true, 41290, new Class[]{BottomSheetsPictureShare.class, CardObjV2.class, y.class, ShareInfoObj.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bottomSheetsPictureShare, "<this>");
        f0.p(cardObjV2, "cardObjV2");
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(shareInfoObj, "shareInfoObj");
        new uf.a().n(bottomSheetsPictureShare, cardObjV2, lifecycleOwner, shareInfoObj);
        return bottomSheetsPictureShare;
    }
}
