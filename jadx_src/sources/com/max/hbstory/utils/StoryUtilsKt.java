package com.max.hbstory.utils;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import bb.c;
import com.max.hbstory.R;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.config.StoryRootViewBuilder;
import com.max.hbstory.i;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import pb.f;
import yh.l;

/* JADX INFO: compiled from: StoryUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nStoryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryUtils.kt\ncom/max/hbstory/utils/StoryUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
public final class StoryUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final String f73012a = "video_page_tag_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f73013b = "picture_page_tag_";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void b(@d View view, float f10, int i10, int i11, int i12, boolean z10) {
        int iD;
        Object[] objArr = {view, new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Ai, new Class[]{View.class, Float.TYPE, cls, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        int i13 = Resources.getSystem().getDisplayMetrics().heightPixels;
        int i14 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int dimension = (int) view.getContext().getResources().getDimension(R.dimen.fullscreen_icon_height_with_margin);
        float dimension2 = view.getContext().getResources().getDimension(R.dimen.bottom_bar_height);
        float f11 = (i13 - (i10 * f10)) - (i11 > i12 ? (1.0f - f10) * (dimension + dimension2) : (1.0f - f10) * dimension2);
        float f12 = (f11 / i12) * i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) f11;
        if (f12 < i14) {
            iD = (int) f12;
        } else {
            iD = z10 ? d(i14, i13, i11, i12, dimension2, i14) : i14;
        }
        layoutParams.width = iD;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i15 = (i14 - iD) / 2;
            marginLayoutParams.leftMargin = i15;
            marginLayoutParams.rightMargin = i15;
        }
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void c(View view, float f10, int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        Object[] objArr = {view, new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Bi, new Class[]{View.class, Float.TYPE, cls, cls, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b(view, f10, i10, i11, i12, (i13 & 16) != 0 ? false : z10 ? 1 : 0);
    }

    private static final int d(int i10, int i11, int i12, int i13, float f10, int i14) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Float(f10), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Ci, new Class[]{cls, cls, cls, cls, Float.TYPE, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i10 <= 0 || i11 <= 0) {
            g.f74531b.v("[StoryUtils][stretchView] invalid arg, screenWidth: " + i10 + ", screenHeight: " + i11);
            return i14;
        }
        if (i12 <= 0 || i13 <= 0) {
            g.f74531b.v("[StoryUtils][stretchView] invalid arg, mediaWidth: " + i12 + ", mediaHeight: " + i13);
            return i14;
        }
        if (i12 > i13) {
            return i14;
        }
        float f11 = i11 - f10;
        float f12 = i12;
        float f13 = i13;
        float f14 = (i10 / f12) * f13;
        float f15 = f11 - f14;
        return (f15 > 0.0f && f14 > ((float) 6) * f15) ? (int) ((f11 / f13) * f12) : i14;
    }

    public static final void e(@d com.max.hbstory.d dVar, int i10, @d yh.a<b2> foo) {
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10), foo}, null, changeQuickRedirect, true, c.k.f33852si, new Class[]{com.max.hbstory.d.class, Integer.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(foo, "foo");
        if (g(dVar, i10)) {
            foo.invoke();
        }
    }

    public static final void f(@d com.max.hbstory.viewpage2.video.a aVar, @d yh.a<b2> foo) {
        if (PatchProxy.proxy(new Object[]{aVar, foo}, null, changeQuickRedirect, true, c.k.f33830ri, new Class[]{com.max.hbstory.viewpage2.video.a.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<this>");
        f0.p(foo, "foo");
        if (h(aVar)) {
            foo.invoke();
        }
    }

    public static final boolean g(@d com.max.hbstory.d dVar, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, null, changeQuickRedirect, true, c.k.f33808qi, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(dVar, "<this>");
        com.max.hbstory.g gVarD = dVar.d();
        if (gVarD != null) {
            return i.a(gVarD, i10);
        }
        return false;
    }

    public static final boolean h(@d com.max.hbstory.viewpage2.video.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, c.k.f33785pi, new Class[]{com.max.hbstory.viewpage2.video.a.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.g gVarQ = q(aVar);
        if (gVarQ != null) {
            return i.a(gVarQ, aVar.getMPosition());
        }
        return false;
    }

    public static final void i(@d com.max.hbstory.viewpage2.video.a aVar, @d l<? super com.max.hbstory.g, b2> foo) {
        if (PatchProxy.proxy(new Object[]{aVar, foo}, null, changeQuickRedirect, true, c.k.f33670ki, new Class[]{com.max.hbstory.viewpage2.video.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<this>");
        f0.p(foo, "foo");
        com.max.hbstory.g gVarQ = q(aVar);
        if (gVarQ != null) {
            foo.invoke(gVarQ);
        }
    }

    @e
    public static final Fragment j(@d com.max.hbstory.viewpage2.video.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, c.k.f33716mi, new Class[]{com.max.hbstory.viewpage2.video.a.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.d mStoryContext = aVar.getMStoryContext();
        if (mStoryContext != null) {
            return mStoryContext.b();
        }
        return null;
    }

    @e
    public static final StoryStatInfoObj k(@d com.max.hbstory.viewpage2.video.a aVar, int i10) {
        StoryLinkCardInfoObj link_card_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Integer(i10)}, null, changeQuickRedirect, true, c.k.f33940wi, new Class[]{com.max.hbstory.viewpage2.video.a.class, Integer.TYPE}, StoryStatInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryStatInfoObj) patchProxyResultProxy.result;
        }
        f0.p(aVar, "<this>");
        StoryItemsObj storyItemsObjN = n(aVar, i10);
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) {
            return null;
        }
        return link_card_info.getStat_info();
    }

    @e
    public static final List<StoryItemsObj> l(@d com.max.hbstory.viewpage2.video.a aVar) {
        LiveData<List<StoryItemsObj>> liveDataF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, c.k.f33896ui, new Class[]{com.max.hbstory.viewpage2.video.a.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.g gVarQ = q(aVar);
        if (gVarQ == null || (liveDataF = gVarQ.F()) == null) {
            return null;
        }
        return liveDataF.f();
    }

    @e
    public static final StoryItemsObj m(@d com.max.hbstory.d dVar, int i10) {
        LiveData<List<StoryItemsObj>> liveDataF;
        List<StoryItemsObj> listF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, null, changeQuickRedirect, true, c.k.f33984yi, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        f0.p(dVar, "<this>");
        try {
            com.max.hbstory.g gVarD = dVar.d();
            if (gVarD == null || (liveDataF = gVarD.F()) == null || (listF = liveDataF.f()) == null) {
                return null;
            }
            return listF.get(i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    @e
    public static final StoryItemsObj n(@d com.max.hbstory.viewpage2.video.a aVar, int i10) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Integer(i10)}, null, changeQuickRedirect, true, c.k.f33918vi, new Class[]{com.max.hbstory.viewpage2.video.a.class, Integer.TYPE}, StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        f0.p(aVar, "<this>");
        List<StoryItemsObj> listL = l(aVar);
        if (!(listL == null || listL.isEmpty())) {
            if (i10 >= 0 && i10 < listL.size()) {
                z10 = true;
            }
            if (z10) {
                return listL.get(i10);
            }
        }
        return null;
    }

    public static final void o(@d com.max.hbstory.d dVar, int i10, @d l<? super StoryItemsObj, b2> foo) {
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10), foo}, null, changeQuickRedirect, true, c.k.f34006zi, new Class[]{com.max.hbstory.d.class, Integer.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(foo, "foo");
        StoryItemsObj storyItemsObjM = m(dVar, i10);
        if (storyItemsObjM != null) {
            foo.invoke(storyItemsObjM);
        }
    }

    public static final void p(@d com.max.hbstory.viewpage2.video.a aVar, int i10, @d l<? super StoryItemsObj, b2> foo) {
        if (PatchProxy.proxy(new Object[]{aVar, new Integer(i10), foo}, null, changeQuickRedirect, true, c.k.f33962xi, new Class[]{com.max.hbstory.viewpage2.video.a.class, Integer.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<this>");
        f0.p(foo, "foo");
        StoryItemsObj storyItemsObjN = n(aVar, i10);
        if (storyItemsObjN != null) {
            foo.invoke(storyItemsObjN);
        }
    }

    @e
    public static final com.max.hbstory.g q(@d com.max.hbstory.viewpage2.video.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, c.k.f33647ji, new Class[]{com.max.hbstory.viewpage2.video.a.class}, com.max.hbstory.g.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbstory.g) patchProxyResultProxy.result;
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.d mStoryContext = aVar.getMStoryContext();
        if (mStoryContext != null) {
            return mStoryContext.d();
        }
        return null;
    }

    public static final <T> void r(@d LiveData<T> liveData, @d com.max.hbstory.viewpage2.video.a iStoryViewHolder, @d final l<? super T, b2> foo) {
        if (PatchProxy.proxy(new Object[]{liveData, iStoryViewHolder, foo}, null, changeQuickRedirect, true, c.k.f33762oi, new Class[]{LiveData.class, com.max.hbstory.viewpage2.video.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(liveData, "<this>");
        f0.p(iStoryViewHolder, "iStoryViewHolder");
        f0.p(foo, "foo");
        Fragment fragmentJ = j(iStoryViewHolder);
        if (fragmentJ != null) {
            final l<T, b2> lVar = new l<T, b2>() { // from class: com.max.hbstory.utils.StoryUtilsKt$fastObserver$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Gi, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(obj);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t10) {
                    if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, c.k.Fi, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    foo.invoke(t10);
                }
            };
            liveData.k(fragmentJ, new j0() { // from class: com.max.hbstory.utils.a
                @Override // androidx.lifecycle.j0
                public final void a(Object obj) {
                    StoryUtilsKt.s(lVar, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, c.k.Ei, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final boolean t(@d com.max.hbstory.viewpage2.video.a aVar, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Integer(i10)}, null, changeQuickRedirect, true, c.k.f33739ni, new Class[]{com.max.hbstory.viewpage2.video.a.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.g gVarQ = q(aVar);
        if (gVarQ == null) {
            return false;
        }
        gVarQ.i0(i10);
        return true;
    }

    public static final boolean u(@d com.max.hbstory.viewpage2.video.a aVar, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Long(j10)}, null, changeQuickRedirect, true, c.k.f33693li, new Class[]{com.max.hbstory.viewpage2.video.a.class, Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(aVar, "<this>");
        com.max.hbstory.g gVarQ = q(aVar);
        if (gVarQ == null) {
            return false;
        }
        gVarQ.i0(j10);
        return true;
    }

    public static final void v(@d com.max.hbstory.d dVar, int i10, @d yh.a<b2> foo) {
        LiveData<List<StoryItemsObj>> liveDataF;
        List<StoryItemsObj> listF;
        fi.l lVarF;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10), foo}, null, changeQuickRedirect, true, c.k.f33874ti, new Class[]{com.max.hbstory.d.class, Integer.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(foo, "foo");
        com.max.hbstory.g gVarD = dVar.d();
        if (gVarD != null && (liveDataF = gVarD.F()) != null && (listF = liveDataF.f()) != null && (lVarF = CollectionsKt__CollectionsKt.F(listF)) != null && lVarF.s(i10)) {
            z10 = true;
        }
        if (z10) {
            foo.invoke();
        }
    }

    @e
    public static final StoryRootViewBuilder.OverlayTipsType w(@e StoryItemsObj storyItemsObj) {
        StoryRootViewBuilder.OverlayTipsType overlayTipsType;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, null, changeQuickRedirect, true, c.k.Di, new Class[]{StoryItemsObj.class}, StoryRootViewBuilder.OverlayTipsType.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryRootViewBuilder.OverlayTipsType) patchProxyResultProxy.result;
        }
        if (storyItemsObj == null) {
            return null;
        }
        Boolean boolValueOf = Boolean.valueOf(storyItemsObj.isVideo());
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        boolValueOf.booleanValue();
        f fVarI = ob.a.i();
        Boolean boolValueOf2 = fVarI != null ? Boolean.valueOf(fVarI.q(od.f.f132278b, od.f.f132280d, false, false)) : null;
        Boolean bool = Boolean.FALSE;
        if (f0.g(boolValueOf2, bool)) {
            overlayTipsType = StoryRootViewBuilder.OverlayTipsType.TYPE_VIDEO_TUTORIAL_TIPS;
            f fVarI2 = ob.a.i();
            if (fVarI2 != null) {
                fVarI2.n(od.f.f132278b, od.f.f132280d, true, false);
            }
        } else {
            f fVarI3 = ob.a.i();
            if (!f0.g(fVarI3 != null ? Boolean.valueOf(fVarI3.q("improve_ab_test", "improve_ab_testshow_fullscreen_award_guide", true, false)) : null, Boolean.TRUE)) {
                return null;
            }
            f fVarI4 = ob.a.i();
            if (!f0.g(fVarI4 != null ? Boolean.valueOf(fVarI4.q(na.a.f132027b, na.a.f132028c, false, false)) : null, bool)) {
                return null;
            }
            overlayTipsType = StoryRootViewBuilder.OverlayTipsType.TYPE_DOUBLE_CLICK_UPVOTE;
            f fVarI5 = ob.a.i();
            if (fVarI5 != null) {
                fVarI5.n(na.a.f132027b, na.a.f132028c, true, false);
            }
        }
        return overlayTipsType;
    }
}
