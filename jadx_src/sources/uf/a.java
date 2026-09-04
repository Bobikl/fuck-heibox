package uf;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.max.commentimagepainter.sharecard.CardRecyclerView;
import com.max.commentimagepainter.sharecard.GameOrderCassetteView;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.SaveImageToLocalKt;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.SharePostKt;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToQQKt;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToWeChatFriendsKt;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.ShareToWeChatMomentKt;
import com.max.xiaoheihe.module.mall.cardshare.base.widget.b;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import sf.c;
import yh.l;

/* JADX INFO: compiled from: ShareDialogAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f140795a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private final void a(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41276, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setVisibility(8);
    }

    private final void b(x70 x70Var) {
        if (PatchProxy.proxy(new Object[]{x70Var}, this, changeQuickRedirect, false, 41280, new Class[]{x70.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout vgCreatePost = x70Var.f117435c;
        f0.o(vgCreatePost, "vgCreatePost");
        a(vgCreatePost);
        LinearLayout vgPost = x70Var.f117436d;
        f0.o(vgPost, "vgPost");
        a(vgPost);
        LinearLayout vgCopyLink = x70Var.f117434b;
        f0.o(vgCopyLink, "vgCopyLink");
        a(vgCopyLink);
        LinearLayout vgSave = x70Var.f117438f;
        f0.o(vgSave, "vgSave");
        a(vgSave);
        LinearLayout vgQq = x70Var.f117437e;
        f0.o(vgQq, "vgQq");
        a(vgQq);
        LinearLayout vgWechatTimeline = x70Var.f117440h;
        f0.o(vgWechatTimeline, "vgWechatTimeline");
        a(vgWechatTimeline);
        LinearLayout vgWechatFriends = x70Var.f117439g;
        f0.o(vgWechatFriends, "vgWechatFriends");
        a(vgWechatFriends);
    }

    private final void f(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 41269, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageViewD4 = hVar.d4();
        imageViewD4.setColorFilter(d.E(R.color.text_secondary_2_color));
        o(imageViewD4);
    }

    private final void g(BottomSheetsPictureShare bottomSheetsPictureShare) {
        if (PatchProxy.proxy(new Object[]{bottomSheetsPictureShare}, this, changeQuickRedirect, false, 41270, new Class[]{BottomSheetsPictureShare.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageViewB4 = bottomSheetsPictureShare.b4();
        imageViewB4.setColorFilter(d.E(R.color.text_secondary_2_color));
        o(imageViewB4);
    }

    private final void h(h hVar, List<CardObj> list, com.max.hbcommon.base.d dVar, l<? super Integer, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{hVar, list, dVar, lVar}, this, changeQuickRedirect, false, 41285, new Class[]{h.class, List.class, com.max.hbcommon.base.d.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        CardRecyclerView cardRecyclerViewH4 = hVar.h4();
        cardRecyclerViewH4.e(list, dVar, lVar);
        o(cardRecyclerViewH4);
    }

    private final void i(BottomSheetsPictureShare bottomSheetsPictureShare, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{bottomSheetsPictureShare, bitmap}, this, changeQuickRedirect, false, 41286, new Class[]{BottomSheetsPictureShare.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageViewF4 = bottomSheetsPictureShare.f4();
        imageViewF4.setImageBitmap(bitmap);
        o(imageViewF4);
    }

    private final void j(h hVar, ShareWindowObj shareWindowObj) {
        if (PatchProxy.proxy(new Object[]{hVar, shareWindowObj}, this, changeQuickRedirect, false, 41272, new Class[]{h.class, ShareWindowObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.j4().setText(c.a(shareWindowObj));
    }

    private final void o(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41275, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setVisibility(0);
    }

    private final void p(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 41274, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewE4 = hVar.e4();
        if (ViewUtils.h0(viewE4.getContext(), ViewUtils.J(viewE4.getContext())) <= 720) {
            hVar.e4().setVisibility(4);
        }
    }

    private final void q(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 41273, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewC4 = hVar.c4();
        ConstraintLayout constraintLayout = viewC4 instanceof ConstraintLayout ? (ConstraintLayout) viewC4 : null;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
        }
    }

    private final void r(h hVar, Activity activity) {
        if (PatchProxy.proxy(new Object[]{hVar, activity}, this, changeQuickRedirect, false, 41271, new Class[]{h.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = hVar.k4().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = ViewUtils.f(activity, 56.0f);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = -2;
        }
    }

    @dl.d
    public final h c(@dl.d h dialog, @dl.d x70 sharePanelViewBinding, @dl.d ShareInfoObj shareInfoObj, @dl.d com.max.hbshare.c.b report, @dl.d yh.a<b2> sharePostWidgetClickCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialog, sharePanelViewBinding, shareInfoObj, report, sharePostWidgetClickCallback}, this, changeQuickRedirect, false, 41279, new Class[]{h.class, x70.class, ShareInfoObj.class, com.max.hbshare.c.b.class, yh.a.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(dialog, "dialog");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        f0.p(sharePostWidgetClickCallback, "sharePostWidgetClickCallback");
        b(sharePanelViewBinding);
        o(ShareToWeChatMomentKt.c(dialog, sharePanelViewBinding, shareInfoObj, report));
        o(ShareToWeChatFriendsKt.c(dialog, sharePanelViewBinding, shareInfoObj, report));
        o(ShareToQQKt.c(dialog, sharePanelViewBinding, shareInfoObj, report));
        o(b.a(dialog, sharePanelViewBinding, shareInfoObj, sharePostWidgetClickCallback));
        o(com.max.xiaoheihe.module.mall.cardshare.base.widget.a.a(dialog, sharePanelViewBinding, shareInfoObj));
        return dialog;
    }

    @dl.d
    public final BottomSheetsPictureShare d(@dl.d Bitmap bitmap, @dl.d BottomSheetsPictureShare dialog, @dl.d com.max.hbcommon.base.d baseFragment, @dl.d x70 sharePanelViewBinding, @dl.d CardObj cardObj, @dl.d ShareInfoObj shareInfoObj, @dl.d com.max.hbshare.c.b report) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, dialog, baseFragment, sharePanelViewBinding, cardObj, shareInfoObj, report}, this, changeQuickRedirect, false, 41277, new Class[]{Bitmap.class, BottomSheetsPictureShare.class, com.max.hbcommon.base.d.class, x70.class, CardObj.class, ShareInfoObj.class, com.max.hbshare.c.b.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(bitmap, "bitmap");
        f0.p(dialog, "dialog");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(cardObj, "cardObj");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        b(sharePanelViewBinding);
        o(ShareToWeChatMomentKt.d(dialog, bitmap, sharePanelViewBinding, report));
        o(ShareToWeChatFriendsKt.d(dialog, bitmap, sharePanelViewBinding, report));
        o(ShareToQQKt.d(dialog, bitmap, sharePanelViewBinding, report));
        o(SharePostKt.d(dialog, bitmap, baseFragment, sharePanelViewBinding, shareInfoObj, cardObj));
        o(SaveImageToLocalKt.b(dialog, bitmap, baseFragment, sharePanelViewBinding, shareInfoObj));
        return dialog;
    }

    @dl.d
    public final BottomSheetsPictureShare e(@dl.d BottomSheetsPictureShare dialog, @dl.d com.max.hbcommon.base.d baseFragment, @dl.d x70 sharePanelViewBinding, @dl.d CardObjV2 cardObj, @dl.d ShareInfoObj shareInfoObj, @dl.d com.max.hbshare.c.b report) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialog, baseFragment, sharePanelViewBinding, cardObj, shareInfoObj, report}, this, changeQuickRedirect, false, 41278, new Class[]{BottomSheetsPictureShare.class, com.max.hbcommon.base.d.class, x70.class, CardObjV2.class, ShareInfoObj.class, com.max.hbshare.c.b.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(dialog, "dialog");
        f0.p(baseFragment, "baseFragment");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(cardObj, "cardObj");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(report, "report");
        b(sharePanelViewBinding);
        o(ShareToWeChatMomentKt.e(dialog, sharePanelViewBinding, report));
        o(ShareToWeChatFriendsKt.e(dialog, sharePanelViewBinding, report));
        o(ShareToQQKt.e(dialog, sharePanelViewBinding, report));
        o(SharePostKt.e(dialog, baseFragment, sharePanelViewBinding, shareInfoObj, cardObj));
        o(SaveImageToLocalKt.c(dialog, baseFragment, sharePanelViewBinding, shareInfoObj));
        return dialog;
    }

    public final void k(@dl.d h dialog, @dl.d ShareWindowObj windowInfo, @dl.d Activity mContext, @dl.d List<CardObj> cardList, @dl.d com.max.hbcommon.base.d baseFragment, @dl.d l<? super Integer, b2> scrollStateIdLeCallback) {
        if (PatchProxy.proxy(new Object[]{dialog, windowInfo, mContext, cardList, baseFragment, scrollStateIdLeCallback}, this, changeQuickRedirect, false, 41281, new Class[]{h.class, ShareWindowObj.class, Activity.class, List.class, com.max.hbcommon.base.d.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        f0.p(windowInfo, "windowInfo");
        f0.p(mContext, "mContext");
        f0.p(cardList, "cardList");
        f0.p(baseFragment, "baseFragment");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        if (dialog.isViewCreated()) {
            j(dialog, windowInfo);
            r(dialog, mContext);
            f(dialog);
            q(dialog);
            p(dialog);
            h(dialog, cardList, baseFragment, scrollStateIdLeCallback);
        }
    }

    public final void l(@dl.d h dialog, @dl.d ShareWindowObj windowInfo, @dl.d Activity context, @dl.d List<CardObjV2> cardListV2, @dl.d com.max.hbcommon.base.d baseFragment, @dl.d l<? super Integer, b2> scrollStateIdLeCallback) {
        if (PatchProxy.proxy(new Object[]{dialog, windowInfo, context, cardListV2, baseFragment, scrollStateIdLeCallback}, this, changeQuickRedirect, false, 41282, new Class[]{h.class, ShareWindowObj.class, Activity.class, List.class, com.max.hbcommon.base.d.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        f0.p(windowInfo, "windowInfo");
        f0.p(context, "context");
        f0.p(cardListV2, "cardListV2");
        f0.p(baseFragment, "baseFragment");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        if (dialog.isViewCreated()) {
            j(dialog, windowInfo);
            r(dialog, context);
            f(dialog);
            q(dialog);
            p(dialog);
            CardRecyclerView cardRecyclerViewI4 = dialog.i4();
            cardRecyclerViewI4.f(cardListV2, baseFragment, scrollStateIdLeCallback);
            o(cardRecyclerViewI4);
        }
    }

    public final void m(@dl.d BottomSheetsPictureShare dialog, @dl.d Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{dialog, bitmap}, this, changeQuickRedirect, false, 41283, new Class[]{BottomSheetsPictureShare.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        f0.p(bitmap, "bitmap");
        if (dialog.isViewCreated()) {
            g(dialog);
            i(dialog, bitmap);
        }
    }

    public final void n(@dl.d BottomSheetsPictureShare dialog, @dl.d CardObjV2 cardObjV2, @dl.d y lifecycleOwner, @dl.d ShareInfoObj shareInfoObj) {
        if (PatchProxy.proxy(new Object[]{dialog, cardObjV2, lifecycleOwner, shareInfoObj}, this, changeQuickRedirect, false, 41284, new Class[]{BottomSheetsPictureShare.class, CardObjV2.class, y.class, ShareInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        f0.p(cardObjV2, "cardObjV2");
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(shareInfoObj, "shareInfoObj");
        if (dialog.isViewCreated()) {
            g(dialog);
            GameOrderCassetteView gameOrderCassetteViewE4 = dialog.e4();
            gameOrderCassetteViewE4.g(cardObjV2, z.a(lifecycleOwner), true, shareInfoObj.getShare_url());
            o(gameOrderCassetteViewE4);
        }
    }
}
