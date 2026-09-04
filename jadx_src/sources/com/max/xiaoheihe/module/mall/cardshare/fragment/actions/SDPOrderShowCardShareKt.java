package com.max.xiaoheihe.module.mall.cardshare.fragment.actions;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.z;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbshare.c;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.bean.mall.cart.SteamPurchaseOrderDetailObj;
import com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import dl.d;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import sf.b;
import yh.l;

/* JADX INFO: compiled from: SDPOrderShowCardShare.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SDPOrderShowCardShareKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a(SDPOrderFragment sDPOrderFragment, Activity activity, LayoutInflater layoutInflater, SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41333, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        e(sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj);
    }

    public static final /* synthetic */ void b(SDPOrderFragment sDPOrderFragment, Activity activity, LayoutInflater layoutInflater, SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41334, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f(sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj);
    }

    public static final void c(@d final SDPOrderFragment sDPOrderFragment, @d final Activity mContext, @d final LayoutInflater mInflater, @d final SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        List<CardObj> cm_cards;
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        FragmentManager childFragmentManager;
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, mContext, mInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41329, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sDPOrderFragment, "<this>");
        f0.p(mContext, "mContext");
        f0.p(mInflater, "mInflater");
        f0.p(steamPurchaseOrderDetailObj, "steamPurchaseOrderDetailObj");
        if (mContext.isFinishing() || (cm_cards = steamPurchaseOrderDetailObj.getCm_cards()) == null || cm_cards.isEmpty() || (share_info = steamPurchaseOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = sDPOrderFragment.getChildFragmentManager();
        } catch (Exception unused) {
            childFragmentManager = null;
        }
        if (childFragmentManager == null) {
            return;
        }
        c.b bVarA4 = sDPOrderFragment.a4();
        x70 x70VarA = rf.a.a(mInflater);
        if (x70VarA == null) {
            return;
        }
        vf.a.c(vf.a.f(vf.a.a(b.a(share_window, x70VarA), childFragmentManager), share_window, mContext, cm_cards, sDPOrderFragment, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showCardShareDialog$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41335, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                sDPOrderFragment.s4(i10);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 41336, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num.intValue());
                return b2.f124493a;
            }
        }), x70VarA, share_info, bVarA4, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showCardShareDialog$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41338, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41337, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SDPOrderShowCardShareKt.a(sDPOrderFragment, mContext, mInflater, steamPurchaseOrderDetailObj);
            }
        });
    }

    public static final void d(@d final SDPOrderFragment sDPOrderFragment, @d final Activity mContext, @d final LayoutInflater mInflater, @d final SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, mContext, mInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41331, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sDPOrderFragment, "<this>");
        f0.p(mContext, "mContext");
        f0.p(mInflater, "mInflater");
        f0.p(steamPurchaseOrderDetailObj, "steamPurchaseOrderDetailObj");
        if (mContext.isFinishing()) {
            return;
        }
        List<CardObjV2> cm_cards_v2 = steamPurchaseOrderDetailObj.getCm_cards_v2();
        FragmentManager childFragmentManager = null;
        List listN2 = cm_cards_v2 != null ? CollectionsKt___CollectionsKt.n2(cm_cards_v2) : null;
        if ((listN2 == null || listN2.isEmpty()) || (share_info = steamPurchaseOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = sDPOrderFragment.getChildFragmentManager();
        } catch (Exception unused) {
        }
        if (childFragmentManager == null) {
            return;
        }
        c.b bVarA4 = sDPOrderFragment.a4();
        x70 x70VarA = rf.a.a(mInflater);
        if (x70VarA == null) {
            return;
        }
        vf.a.c(vf.a.g(vf.a.a(b.a(share_window, x70VarA), childFragmentManager), share_window, mContext, listN2, sDPOrderFragment, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showCardShareDialogV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41339, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                sDPOrderFragment.s4(i10);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 41340, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num.intValue());
                return b2.f124493a;
            }
        }), x70VarA, share_info, bVarA4, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt$showCardShareDialogV2$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41342, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41341, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SDPOrderShowCardShareKt.b(sDPOrderFragment, mContext, mInflater, steamPurchaseOrderDetailObj);
            }
        });
    }

    private static final void e(SDPOrderFragment sDPOrderFragment, Activity activity, LayoutInflater layoutInflater, SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        FragmentManager childFragmentManager;
        CardObj cardObjA;
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41330, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<CardObj> cm_cards = steamPurchaseOrderDetailObj.getCm_cards();
        if ((cm_cards == null || cm_cards.isEmpty()) || activity.isFinishing() || (share_info = steamPurchaseOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = sDPOrderFragment.getChildFragmentManager();
        } catch (Exception unused) {
            childFragmentManager = null;
        }
        FragmentManager fragmentManager = childFragmentManager;
        if (fragmentManager == null || (cardObjA = a.a(cm_cards, sDPOrderFragment.Z3())) == null) {
            return;
        }
        k.f(z.a(sDPOrderFragment), e1.c(), null, new SDPOrderShowCardShareKt$showPictureShareDialog$1$1(sDPOrderFragment, activity, cardObjA, share_info, share_window, rf.a.a(layoutInflater), fragmentManager, sDPOrderFragment, sDPOrderFragment.a4(), null), 2, null);
    }

    private static final void f(SDPOrderFragment sDPOrderFragment, Activity activity, LayoutInflater layoutInflater, SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        CardObjV2 cardObjV2B;
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, activity, layoutInflater, steamPurchaseOrderDetailObj}, null, changeQuickRedirect, true, 41332, new Class[]{SDPOrderFragment.class, Activity.class, LayoutInflater.class, SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<CardObjV2> cm_cards_v2 = steamPurchaseOrderDetailObj.getCm_cards_v2();
        FragmentManager childFragmentManager = null;
        List listN2 = cm_cards_v2 != null ? CollectionsKt___CollectionsKt.n2(cm_cards_v2) : null;
        if ((listN2 == null || listN2.isEmpty()) || activity.isFinishing() || (share_info = steamPurchaseOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = sDPOrderFragment.getChildFragmentManager();
        } catch (Exception unused) {
        }
        if (childFragmentManager == null || (cardObjV2B = a.b(listN2, sDPOrderFragment.Z3())) == null) {
            return;
        }
        c.b bVarA4 = sDPOrderFragment.a4();
        x70 x70VarA = rf.a.a(layoutInflater);
        vf.a.e(vf.a.i(vf.a.b(b.b(share_window, x70VarA), childFragmentManager), cardObjV2B, sDPOrderFragment, share_info), sDPOrderFragment, x70VarA, cardObjV2B, share_info, bVarA4);
    }
}
