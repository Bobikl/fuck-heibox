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
import com.max.xiaoheihe.bean.mall.cart.MallCartOrderDetailObj;
import com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment;
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

/* JADX INFO: compiled from: MallCartOrderShowCardShare.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MallCartOrderShowCardShareKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a(MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity, LayoutInflater layoutInflater, MallCartOrderDetailObj mallCartOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41311, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        e(mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj);
    }

    public static final /* synthetic */ void b(MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity, LayoutInflater layoutInflater, MallCartOrderDetailObj mallCartOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41312, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f(mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj);
    }

    public static final void c(@d final MallCartOrderDetailFragment mallCartOrderDetailFragment, @d final Activity mContext, @d final LayoutInflater mInflater, @d final MallCartOrderDetailObj mallCartOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        FragmentManager childFragmentManager;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, mContext, mInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41307, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallCartOrderDetailFragment, "<this>");
        f0.p(mContext, "mContext");
        f0.p(mInflater, "mInflater");
        f0.p(mallCartOrderDetailObj, "mallCartOrderDetailObj");
        List<CardObj> cm_cards = mallCartOrderDetailObj.getCm_cards();
        if ((cm_cards == null || cm_cards.isEmpty()) || mContext.isFinishing() || (share_info = mallCartOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = mallCartOrderDetailFragment.getChildFragmentManager();
        } catch (Exception unused) {
            childFragmentManager = null;
        }
        if (childFragmentManager == null) {
            return;
        }
        c.b bVarN5 = mallCartOrderDetailFragment.n5();
        x70 x70VarA = rf.a.a(mInflater);
        vf.a.c(vf.a.f(vf.a.a(b.a(share_window, x70VarA), childFragmentManager), share_window, mContext, cm_cards, mallCartOrderDetailFragment, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showCardShareDialog$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41313, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                mallCartOrderDetailFragment.c6(i10);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 41314, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num.intValue());
                return b2.f124493a;
            }
        }), x70VarA, share_info, bVarN5, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showCardShareDialog$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41316, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41315, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                MallCartOrderShowCardShareKt.a(mallCartOrderDetailFragment, mContext, mInflater, mallCartOrderDetailObj);
            }
        });
    }

    public static final void d(@d final MallCartOrderDetailFragment mallCartOrderDetailFragment, @d final Activity mContext, @d final LayoutInflater mInflater, @d final MallCartOrderDetailObj mallCartOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, mContext, mInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41309, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallCartOrderDetailFragment, "<this>");
        f0.p(mContext, "mContext");
        f0.p(mInflater, "mInflater");
        f0.p(mallCartOrderDetailObj, "mallCartOrderDetailObj");
        List<CardObjV2> cm_cards_v2 = mallCartOrderDetailObj.getCm_cards_v2();
        FragmentManager childFragmentManager = null;
        List listN2 = cm_cards_v2 != null ? CollectionsKt___CollectionsKt.n2(cm_cards_v2) : null;
        if ((listN2 == null || listN2.isEmpty()) || mContext.isFinishing() || (share_info = mallCartOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = mallCartOrderDetailFragment.getChildFragmentManager();
        } catch (Exception unused) {
        }
        if (childFragmentManager == null) {
            return;
        }
        c.b bVarN5 = mallCartOrderDetailFragment.n5();
        x70 x70VarA = rf.a.a(mInflater);
        vf.a.c(vf.a.g(vf.a.a(b.a(share_window, x70VarA), childFragmentManager), share_window, mContext, listN2, mallCartOrderDetailFragment, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showCardShareDialogV2$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41317, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                mallCartOrderDetailFragment.c6(i10);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 41318, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num.intValue());
                return b2.f124493a;
            }
        }), x70VarA, share_info, bVarN5, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt$showCardShareDialogV2$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41320, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41319, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                MallCartOrderShowCardShareKt.b(mallCartOrderDetailFragment, mContext, mInflater, mallCartOrderDetailObj);
            }
        });
    }

    private static final void e(MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity, LayoutInflater layoutInflater, MallCartOrderDetailObj mallCartOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        FragmentManager childFragmentManager;
        CardObj cardObjA;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41308, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<CardObj> cm_cards = mallCartOrderDetailObj.getCm_cards();
        if ((cm_cards == null || cm_cards.isEmpty()) || activity.isFinishing() || (share_info = mallCartOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = mallCartOrderDetailFragment.getChildFragmentManager();
        } catch (Exception unused) {
            childFragmentManager = null;
        }
        FragmentManager fragmentManager = childFragmentManager;
        if (fragmentManager == null || (cardObjA = a.a(cm_cards, mallCartOrderDetailFragment.m5())) == null) {
            return;
        }
        k.f(z.a(mallCartOrderDetailFragment), e1.c(), null, new MallCartOrderShowCardShareKt$showPictureShareDialog$1$1(mallCartOrderDetailFragment, activity, cardObjA, share_info, share_window, rf.a.a(layoutInflater), fragmentManager, mallCartOrderDetailFragment, mallCartOrderDetailFragment.n5(), null), 2, null);
    }

    private static final void f(MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity, LayoutInflater layoutInflater, MallCartOrderDetailObj mallCartOrderDetailObj) {
        ShareInfoObj share_info;
        ShareWindowObj share_window;
        CardObjV2 cardObjV2B;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, activity, layoutInflater, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41310, new Class[]{MallCartOrderDetailFragment.class, Activity.class, LayoutInflater.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<CardObjV2> cm_cards_v2 = mallCartOrderDetailObj.getCm_cards_v2();
        FragmentManager childFragmentManager = null;
        List listN2 = cm_cards_v2 != null ? CollectionsKt___CollectionsKt.n2(cm_cards_v2) : null;
        if ((listN2 == null || listN2.isEmpty()) || activity.isFinishing() || (share_info = mallCartOrderDetailObj.getShare_info()) == null || (share_window = share_info.getShare_window()) == null) {
            return;
        }
        try {
            childFragmentManager = mallCartOrderDetailFragment.getChildFragmentManager();
        } catch (Exception unused) {
        }
        if (childFragmentManager == null || (cardObjV2B = a.b(listN2, mallCartOrderDetailFragment.m5())) == null) {
            return;
        }
        c.b bVarN5 = mallCartOrderDetailFragment.n5();
        x70 x70VarA = rf.a.a(layoutInflater);
        vf.a.e(vf.a.i(vf.a.b(b.b(share_window, x70VarA), childFragmentManager), cardObjV2B, mallCartOrderDetailFragment, share_info), mallCartOrderDetailFragment, x70VarA, cardObjV2B, share_info, bVarN5);
    }
}
