package com.max.xiaoheihe.module.littleprogram.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ComboObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.max.xiaoheihe.bean.bbs.WikiRelatedLinkObj;
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.PostPageParam;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import io.reactivex.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WikiPostPageFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.S)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class WikiPostPageFragment extends BasePostPageFragment implements PostCommentFragment.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f88887g4 = 8;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.e
    private WikiRelatedLinkObj f88888e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @dl.d
    private final com.max.hbshare.c.b f88889f4 = new g(new h());

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38962, new Class[0], Void.TYPE).isSupported && WikiPostPageFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38963, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (WikiPostPageFragment.this.isActive()) {
                WikiPostPageFragment.this.s6();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38964, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WikiPostPageFragment.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    WikiPostPageFragment wikiPostPageFragment = WikiPostPageFragment.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = WikiPostPageFragment.u7(wikiPostPageFragment).getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        WikiPostPageFragment.u7(wikiPostPageFragment).setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38965, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<WikiRelatedLinkObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38966, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (WikiPostPageFragment.this.isActive()) {
                super.onError(e10);
                WikiPostPageFragment.C7(WikiPostPageFragment.this);
            }
        }

        public void onNext(@dl.d Result<WikiRelatedLinkObj> result) {
            WebviewFragment webviewFragmentV7;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38967, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WikiPostPageFragment.this.isActive()) {
                WikiPostPageFragment.this.f88888e4 = result.getResult();
                if (WikiPostPageFragment.this.f88888e4 != null) {
                    WikiPostPageFragment wikiPostPageFragment = WikiPostPageFragment.this;
                    WikiRelatedLinkObj wikiRelatedLinkObj = wikiPostPageFragment.f88888e4;
                    WikiPostPageFragment.z7(wikiPostPageFragment, wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getLinkid() : null);
                    WikiPostPageFragment wikiPostPageFragment2 = WikiPostPageFragment.this;
                    WikiRelatedLinkObj wikiRelatedLinkObj2 = wikiPostPageFragment2.f88888e4;
                    WikiPostPageFragment.A7(wikiPostPageFragment2, wikiRelatedLinkObj2 != null ? wikiRelatedLinkObj2.getLink_tag() : null);
                    WikiRelatedLinkObj wikiRelatedLinkObj3 = WikiPostPageFragment.this.f88888e4;
                    if (!com.max.hbcommon.utils.c.u(wikiRelatedLinkObj3 != null ? wikiRelatedLinkObj3.getUrl() : null) && (webviewFragmentV7 = WikiPostPageFragment.v7(WikiPostPageFragment.this)) != null) {
                        WikiPostPageFragment wikiPostPageFragment3 = WikiPostPageFragment.this;
                        WikiRelatedLinkObj wikiRelatedLinkObj4 = wikiPostPageFragment3.f88888e4;
                        webviewFragmentV7.t7(WikiPostPageFragment.t7(wikiPostPageFragment3, wikiRelatedLinkObj4 != null ? wikiRelatedLinkObj4.getUrl() : null));
                    }
                    WikiPostPageFragment.this.d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38968, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WikiRelatedLinkObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38970, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WikiPostPageFragment.q7(WikiPostPageFragment.this).size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38969, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = ((KeyDescObj) WikiPostPageFragment.q7(WikiPostPageFragment.this).get(i10)).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                return new PostCommentFragment();
            }
            WikiRelatedLinkObj wikiRelatedLinkObj = WikiPostPageFragment.this.f88888e4;
            String strT7 = null;
            if ((wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getUrl() : null) != null) {
                WikiPostPageFragment wikiPostPageFragment = WikiPostPageFragment.this;
                WikiRelatedLinkObj wikiRelatedLinkObj2 = wikiPostPageFragment.f88888e4;
                strT7 = WikiPostPageFragment.t7(wikiPostPageFragment, wikiRelatedLinkObj2 != null ? wikiRelatedLinkObj2.getUrl() : null);
            }
            WebviewFragment webviewFragmentA = new u(strT7).p(WebviewFragment.W4).a();
            webviewFragmentA.Q7(true);
            return webviewFragmentA;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38972, new Class[]{Object.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(obj, "obj");
            if (obj instanceof BasePostFragment) {
                String strN4 = ((BasePostFragment) obj).n4();
                if (strN4 != null && StringsKt__StringsKt.W2(strN4, "comments", false, 2, null)) {
                    return -2;
                }
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38971, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = ((KeyDescObj) WikiPostPageFragment.q7(WikiPostPageFragment.this).get(i10)).getKey();
            f0.o(key, "mPageList[position].key");
            com.max.hbcommon.utils.d.b("cqtest", "Key is " + key);
            return f0.g(PostPageFactory.C, key) ? WikiPostPageFragment.this.getString(R.string.wiki_article) : WikiPostPageFragment.this.getString(R.string.comment);
        }

        @Override // androidx.fragment.app.n0, androidx.viewpager.widget.a
        @dl.e
        public Parcelable saveState() {
            return null;
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class d extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38973, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = ((KeyDescObj) WikiPostPageFragment.q7(WikiPostPageFragment.this).get(i10)).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                WikiPostPageFragment.y7(WikiPostPageFragment.this, true);
            } else {
                WikiPostPageFragment wikiPostPageFragment = WikiPostPageFragment.this;
                WikiPostPageFragment.y7(wikiPostPageFragment, true ^ WikiPostPageFragment.x7(wikiPostPageFragment));
            }
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class e implements com.max.hbminiprogram.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbminiprogram.c
        public final void a(@dl.e MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            UMImage uMImage;
            HBShareProtocolData hBShareProtocolData;
            if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 38974, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            l lVar = l.f66572a;
            JsonObject jsonObject = new JsonObject();
            WikiPostPageFragment wikiPostPageFragment = WikiPostPageFragment.this;
            WikiEntryObj wikiEntryObjR7 = WikiPostPageFragment.r7(wikiPostPageFragment);
            f0.m(wikiEntryObjR7);
            jsonObject.addProperty("wiki_id", wikiEntryObjR7.getWiki_id());
            WikiEntryObj wikiEntryObjR8 = WikiPostPageFragment.r7(wikiPostPageFragment);
            f0.m(wikiEntryObjR8);
            jsonObject.addProperty("name", wikiEntryObjR8.getName());
            WikiEntryObj wikiEntryObjR9 = WikiPostPageFragment.r7(wikiPostPageFragment);
            f0.m(wikiEntryObjR9);
            jsonObject.addProperty("article_id", wikiEntryObjR9.getArticle_id());
            b2 b2Var = b2.f124493a;
            lVar.l(lb.d.T2, jsonObject);
            if (WikiPostPageFragment.p7(WikiPostPageFragment.this) == null) {
                return;
            }
            LinkInfoObj linkInfoObjP7 = WikiPostPageFragment.p7(WikiPostPageFragment.this);
            f0.m(linkInfoObjP7);
            if (linkInfoObjP7.getForward() != null) {
                LinkInfoObj linkInfoObjP8 = WikiPostPageFragment.p7(WikiPostPageFragment.this);
                f0.m(linkInfoObjP8);
                if (linkInfoObjP8.getForward().getIs_deleted() != null) {
                    LinkInfoObj linkInfoObjP9 = WikiPostPageFragment.p7(WikiPostPageFragment.this);
                    f0.m(linkInfoObjP9);
                    if (f0.g("1", linkInfoObjP9.getForward().getIs_deleted())) {
                        com.max.hbutils.utils.c.f("原贴已被删除，无法转发");
                        return;
                    }
                }
            }
            if (WikiPostPageFragment.this.W3() != null) {
                WikiPostPageFragment.this.G4(miniProgramMenuInfoObj);
                return;
            }
            if (WikiPostPageFragment.this.b5() == null || WikiPostPageFragment.this.f88888e4 == null || !WikiPostPageFragment.n7(WikiPostPageFragment.this)) {
                WikiPostPageFragment wikiPostPageFragment2 = WikiPostPageFragment.this;
                Activity mContext = ((com.max.hbcommon.base.d) wikiPostPageFragment2).mContext;
                f0.o(mContext, "mContext");
                wikiPostPageFragment2.F4(mContext, WikiPostPageFragment.this.Q3(), WikiPostPageFragment.this.y4(), miniProgramMenuInfoObj, WikiPostPageFragment.this.f88889f4);
                return;
            }
            List[] listArr = new List[1];
            WikiRelatedLinkObj wikiRelatedLinkObj = WikiPostPageFragment.this.f88888e4;
            listArr[0] = wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getImgs() : null;
            if (com.max.hbcommon.utils.c.w(listArr)) {
                uMImage = new UMImage(((com.max.hbcommon.base.d) WikiPostPageFragment.this).mContext, R.drawable.share_thumbnail);
            } else {
                Activity activity = ((com.max.hbcommon.base.d) WikiPostPageFragment.this).mContext;
                WikiRelatedLinkObj wikiRelatedLinkObj2 = WikiPostPageFragment.this.f88888e4;
                f0.m(wikiRelatedLinkObj2);
                uMImage = new UMImage(activity, wikiRelatedLinkObj2.getImgs().get(0));
            }
            UMImage uMImage2 = uMImage;
            Activity activity2 = ((com.max.hbcommon.base.d) WikiPostPageFragment.this).mContext;
            String strQ3 = WikiPostPageFragment.this.Q3();
            WikiRelatedLinkObj wikiRelatedLinkObj3 = WikiPostPageFragment.this.f88888e4;
            if (wikiRelatedLinkObj3 == null || (hBShareProtocolData = wikiRelatedLinkObj3.toHBShareProtocolData()) == null) {
                hBShareProtocolData = null;
            } else {
                hBShareProtocolData.setSrc("wiki");
            }
            com.max.hbminiprogram.utils.b.h(activity2, strQ3, miniProgramMenuInfoObj, true, hBShareProtocolData, uMImage2, WikiPostPageFragment.this.f88889f4);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostCommentFragment postCommentFragmentB5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38975, new Class[]{View.class}, Void.TYPE).isSupported || (postCommentFragmentB5 = WikiPostPageFragment.this.b5()) == null) {
                return;
            }
            postCommentFragmentB5.z4();
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class g extends com.max.hbshare.c.b {
        g(h hVar) {
            super("wiki", hVar);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageFragment.kt */
    public static final class h implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 38977, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(WikiPostPageFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 38976, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(WikiPostPageFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public static final /* synthetic */ void A7(WikiPostPageFragment wikiPostPageFragment, String str) {
        if (PatchProxy.proxy(new Object[]{wikiPostPageFragment, str}, null, changeQuickRedirect, true, 38956, new Class[]{WikiPostPageFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiPostPageFragment.L6(str);
    }

    public static final /* synthetic */ void C7(WikiPostPageFragment wikiPostPageFragment) {
        if (PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38954, new Class[]{WikiPostPageFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiPostPageFragment.showError();
    }

    private final String D7(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38924, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strE = l0.e(str);
        Map<String, String> mapE7 = E7();
        String strO5 = o5();
        f0.m(strO5);
        mapE7.put("link_id", strO5);
        if (!w5()) {
            mapE7.put("in_topic", "1");
        }
        if (!com.max.hbcommon.utils.c.u(n5())) {
            String strN5 = n5();
            f0.m(strN5);
            mapE7.put("h_src", strN5);
        }
        return l0.f(strE, mapE7);
    }

    private final Map<String, String> E7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38923, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(u5());
        return mapX == null ? new HashMap(16) : mapX;
    }

    private final WebviewFragment F7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38922, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        int size = s5().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.C, s5().get(i10).getKey())) {
                Object objInstantiateItem = t5().instantiateItem((ViewGroup) D5(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof WebviewFragment) {
                    return (WebviewFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    private final void G7() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38921, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g("3", q5()) && !f0.g("14", q5()) && !f0.g("18", q5()) && !f0.g("19", q5()) && !f0.g("20", q5())) {
            z10 = true;
        }
        y6(z10);
    }

    public static final /* synthetic */ boolean n7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38960, new Class[]{WikiPostPageFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : wikiPostPageFragment.d5();
    }

    public static final /* synthetic */ LinkInfoObj p7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38959, new Class[]{WikiPostPageFragment.class}, LinkInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LinkInfoObj) patchProxyResultProxy.result : wikiPostPageFragment.p5();
    }

    public static final /* synthetic */ ArrayList q7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38950, new Class[]{WikiPostPageFragment.class}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : wikiPostPageFragment.s5();
    }

    public static final /* synthetic */ WikiEntryObj r7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38961, new Class[]{WikiPostPageFragment.class}, WikiEntryObj.class);
        return patchProxyResultProxy.isSupported ? (WikiEntryObj) patchProxyResultProxy.result : wikiPostPageFragment.E5();
    }

    public static final /* synthetic */ String t7(WikiPostPageFragment wikiPostPageFragment, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment, str}, null, changeQuickRedirect, true, 38951, new Class[]{WikiPostPageFragment.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : wikiPostPageFragment.D7(str);
    }

    public static final /* synthetic */ BottomEditorBarPostPageImpl u7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38958, new Class[]{WikiPostPageFragment.class}, BottomEditorBarPostPageImpl.class);
        return patchProxyResultProxy.isSupported ? (BottomEditorBarPostPageImpl) patchProxyResultProxy.result : wikiPostPageFragment.O5();
    }

    public static final /* synthetic */ WebviewFragment v7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38957, new Class[]{WikiPostPageFragment.class}, WebviewFragment.class);
        return patchProxyResultProxy.isSupported ? (WebviewFragment) patchProxyResultProxy.result : wikiPostPageFragment.F7();
    }

    public static final /* synthetic */ boolean x7(WikiPostPageFragment wikiPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageFragment}, null, changeQuickRedirect, true, 38953, new Class[]{WikiPostPageFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : wikiPostPageFragment.g6();
    }

    public static final /* synthetic */ void y7(WikiPostPageFragment wikiPostPageFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{wikiPostPageFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38952, new Class[]{WikiPostPageFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        wikiPostPageFragment.w6(z10);
    }

    public static final /* synthetic */ void z7(WikiPostPageFragment wikiPostPageFragment, String str) {
        if (PatchProxy.proxy(new Object[]{wikiPostPageFragment, str}, null, changeQuickRedirect, true, 38955, new Class[]{WikiPostPageFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiPostPageFragment.J6(str);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38945, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        if (E5() == null && (arguments = getArguments()) != null) {
            Serializable serializable = arguments.getSerializable(com.max.xiaoheihe.module.littleprogram.b.f88740a.b());
            WikiEntryObj wikiEntryObj = serializable instanceof WebProtocolObj ? (WikiEntryObj) ((WebProtocolObj) serializable).objectOf("entry", WikiEntryObj.class) : null;
            if (wikiEntryObj != null) {
                Context contextRequireContext = requireContext();
                f0.o(contextRequireContext, "requireContext()");
                R5(new PostPageParam(contextRequireContext, null, null, null, null, null, null, null, 0L, wikiEntryObj, 0, null, null, null, null, 31744, null));
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment.b
    @dl.e
    public Result<BBSLinkTreeObj> O1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38949, new Class[0], Result.class);
        return patchProxyResultProxy.isSupported ? (Result) patchProxyResultProxy.result : r5();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38931, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C6(false);
        if (ad.a.a(ad.a.E, false)) {
            PostCommentFragment postCommentFragmentB5 = b5();
            if (postCommentFragmentB5 != null) {
                postCommentFragmentB5.x4();
                return;
            }
            return;
        }
        PostCommentFragment postCommentFragmentB6 = b5();
        if (postCommentFragmentB6 != null) {
            postCommentFragmentB6.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void P4() {
        PostCommentFragment postCommentFragmentB5;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38930, new Class[0], Void.TYPE).isSupported || (postCommentFragmentB5 = b5()) == null) {
            return;
        }
        postCommentFragmentB5.C4();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void R2(int i10) {
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void R4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38937, new Class[0], Void.TYPE).isSupported && i0.e(this.mContext) && isActive() && p5() != null) {
            O5().setLikeBtnCheckState(true, true);
            String strValueOf = String.valueOf(Integer.parseInt(O5().getLikeText().toString()) + 1);
            O5().setLikeBtnText(strValueOf);
            O5().setLikeBtnCheckState(true, false);
            LinkInfoObj linkInfoObjP5 = p5();
            f0.m(linkInfoObjP5);
            linkInfoObjP5.setIs_award_link("1");
            LinkInfoObj linkInfoObjP6 = p5();
            f0.m(linkInfoObjP6);
            linkInfoObjP6.setLink_award_num(strValueOf);
            if (b6()) {
                e7(true);
            } else {
                e7(false);
                LinkInfoObj linkInfoObjP7 = p5();
                f0.m(linkInfoObjP7);
                linkInfoObjP7.setIs_favour("1");
                O5().setCollectBtnCheckState(true, true);
            }
            z6(true);
            if (O5().E0() && !f0.g(a5(), i0.j())) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(O5(), true, false, 2, null);
                String string = O5().getChargeText().toString();
                O5().setChargeBtnText((f0.g("", string) ? "0" : Integer.valueOf(Integer.parseInt(string) + 1)).toString());
            }
            addDisposable((io.reactivex.disposables.b) i.a().M8(o5(), n5()).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new a()));
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38933, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N6(new c(getChildFragmentManager()));
        D5().setOnPageChangeListener(new d());
        D5().setAdapter(t5());
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38925, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        U5();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    @dl.e
    public PostCommentFragment b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38938, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = s5().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.D, s5().get(i10).getKey())) {
                Object objInstantiateItem = t5().instantiateItem((ViewGroup) D5(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof PostCommentFragment) {
                    return (PostCommentFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    @Override // kf.a
    public void d1(@dl.e Fragment fragment, int i10, @dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38948, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3(new e());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void g5() {
        z<Result<WikiRelatedLinkObj>> zVarE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38935, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (E5() != null) {
            com.max.xiaoheihe.network.e eVarA = i.a();
            WikiEntryObj wikiEntryObjE5 = E5();
            f0.m(wikiEntryObjE5);
            String article_id = wikiEntryObjE5.getArticle_id();
            WikiEntryObj wikiEntryObjE6 = E5();
            f0.m(wikiEntryObjE6);
            String wiki_id = wikiEntryObjE6.getWiki_id();
            WikiEntryObj wikiEntryObjE7 = E5();
            f0.m(wikiEntryObjE7);
            zVarE = eVarA.E(article_id, wiki_id, wikiEntryObjE7.getName(), null);
            f0.o(zVarE, "{\n            ServiceGen…i!!.name, null)\n        }");
        } else {
            zVarE = i.a().E(null, null, null, o5());
            f0.o(zVarE, "{\n            ServiceGen… null, mLinkId)\n        }");
        }
        addDisposable((io.reactivex.disposables.b) zVarE.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38944, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        WikiEntryObj wikiEntryObjE5 = E5();
        if (wikiEntryObjE5 != null) {
            jsonObject.addProperty("wiki_id", wikiEntryObjE5.getWiki_id());
            jsonObject.addProperty("name", wikiEntryObjE5.getName());
            jsonObject.addProperty("article_id", wikiEntryObjE5.getArticle_id());
            jsonObject.addProperty("is_wiki", "1");
        }
        return jsonObject.toString();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void h0(@dl.d LinkInfoObj linkInfoObj, @dl.d Map<String, String> params, @dl.d yh.l<? super Boolean, b2> callback) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, params, callback}, this, changeQuickRedirect, false, 38943, new Class[]{LinkInfoObj.class, Map.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkInfoObj, "linkInfoObj");
        f0.p(params, "params");
        f0.p(callback, "callback");
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void i6(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 38941, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().setEditAddCY(false);
        O5().setCYIconColor(R.color.text_secondary_1_color);
        PostCommentFragment postCommentFragmentB5 = b5();
        if (postCommentFragmentB5 != null && postCommentFragmentB5.isActive()) {
            a6(postCommentFragmentB5, bBSFloorCommentObj);
        }
        O5().getImgPathList().clear();
        x mUploadImgShowerAdapter = O5().getMUploadImgShowerAdapter();
        if (mUploadImgShowerAdapter != null) {
            mUploadImgShowerAdapter.r(O5().getImgPathList());
        }
        B6("");
        l("action_comment", true);
        r6();
        if ((bBSFloorCommentObj == null || bBSFloorCommentObj.getReply_push_state() == null || !f0.g("1", bBSFloorCommentObj.getReply_push_state().getPush_state())) ? false : true) {
            v.a(this.mContext, v.f95761b, null);
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38926, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        showLoading();
        Y5();
        l6();
        g5();
        V5();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void j6(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 38928, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = f0.g("1", m5());
        H6("0");
        M6(result);
        if (zG && result != null && result.getResult() != null) {
            BBSLinkTreeObj result2 = result.getResult();
            f0.m(result2);
            if (result2.getLink() != null) {
                BBSLinkTreeObj result3 = result.getResult();
                f0.m(result3);
                K6(result3.getLink());
                LinkInfoObj linkInfoObjP5 = p5();
                if (((linkInfoObjP5 == null || (user = linkInfoObjP5.getUser()) == null) ? null : user.getUserid()) != null) {
                    LinkInfoObj linkInfoObjP6 = p5();
                    f0.m(linkInfoObjP6);
                    BBSUserInfoObj user2 = linkInfoObjP6.getUser();
                    f0.m(user2);
                    String userid = user2.getUserid();
                    f0.m(userid);
                    v6(userid);
                }
                LinkInfoObj linkInfoObjP7 = p5();
                L6(linkInfoObjP7 != null ? linkInfoObjP7.getLink_tag() : null);
                PostPageFactory.PostType postTypeH5 = H5();
                if (postTypeH5 == PostPageFactory.PostType.WIKI) {
                    n6();
                } else {
                    Log.d("cqtest", "Not WIKI 4");
                    PostPageFactory.a aVar = PostPageFactory.f81465a;
                    Activity mContext = this.mContext;
                    f0.o(mContext, "mContext");
                    BBSLinkTreeObj result4 = result.getResult();
                    f0.m(result4);
                    LinkInfoObj link = result4.getLink();
                    f0.o(link, "linkTreeResult.result!!.link");
                    aVar.c(mContext, postTypeH5, link, d6());
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO5 = O5();
                LinkInfoObj linkInfoObjP8 = p5();
                bottomEditorBarPostPageImplO5.setChargeBtnVisible(f0.g("1", linkInfoObjP8 != null ? linkInfoObjP8.getIs_article() : null));
                O5().setCollectBtnVisible(true);
                O5().setLikeBtnVisible(!f0.g("20", q5()));
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO6 = O5();
                LinkInfoObj linkInfoObjP9 = p5();
                bottomEditorBarPostPageImplO6.x(n.q(linkInfoObjP9 != null ? linkInfoObjP9.getComment_num() : null));
                LinkInfoObj linkInfoObjP10 = p5();
                k(linkInfoObjP10 != null ? linkInfoObjP10.getDisable_comment() : null);
                S4();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO7 = O5();
                LinkInfoObj linkInfoObjP11 = p5();
                String link_award_num = linkInfoObjP11 != null ? linkInfoObjP11.getLink_award_num() : null;
                bottomEditorBarPostPageImplO7.setLikeBtnText(link_award_num != null ? link_award_num : "0");
                W5();
                O5().setHideAddImg(false);
                if (O5().getHideAddImg()) {
                    O5().setAddImgVisible(false);
                }
            }
        }
        PostCommentFragment postCommentFragmentB5 = b5();
        if (postCommentFragmentB5 != null && postCommentFragmentB5.isActive()) {
            postCommentFragmentB5.A4(result);
        }
        L4();
        showContentView();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void l(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38940, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || T5()) {
            return;
        }
        O5().d0(str, new f());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public boolean m0(@dl.e String str) {
        PostCommentFragment postCommentFragmentB5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38934, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(D5().getCurrentItem() == 0)) {
            return false;
        }
        if (!com.max.hbcommon.utils.c.u(str) && (postCommentFragmentB5 = b5()) != null) {
            PostCommentFragment.E6(postCommentFragmentB5, str, false, 2, null);
        }
        D5().setCurrentItem(1);
        return true;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void m6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38939, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.C);
        arrayList.add(keyDescObj);
        if (c5()) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(PostPageFactory.D);
            arrayList.add(keyDescObj2);
            O5().setBottomBarVisible(!g6());
        }
        O5().setLikeBtnVisible(false);
        O5().setCollectBtnVisible(false);
        s5().clear();
        s5().addAll(arrayList);
        t5().notifyDataSetChanged();
        n6();
        if (d6()) {
            D5().setCurrentItem(1);
        } else {
            if (com.max.hbcommon.utils.c.u(v5())) {
                return;
            }
            m0(null);
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void m7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38929, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.m7();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO5 = O5();
        LinkInfoObj linkInfoObjP5 = p5();
        bottomEditorBarPostPageImplO5.setCommentBtnText(linkInfoObjP5 != null ? linkInfoObjP5.getComment_num() : null);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void n6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38942, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (x5() == null) {
            R6(this.mTitleBar.getTitleTabLayout());
        }
        SlidingTabLayout slidingTabLayoutX5 = x5();
        if (slidingTabLayoutX5 != null) {
            slidingTabLayoutX5.setViewPager(D5());
        }
        SlidingTabLayout slidingTabLayoutX6 = x5();
        if (slidingTabLayoutX6 != null) {
            slidingTabLayoutX6.setVisibility(0);
        }
        G7();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38927, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38947, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        m6();
        g5();
    }

    @Override // kf.a
    public void p1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38932, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C6(false);
    }

    @Override // com.max.hbcommon.base.d
    @SuppressLint({"ClickableViewAccessibility"})
    public void registerEvents() {
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38936, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjP5 = p5();
        f0.m(linkInfoObjP5);
        linkInfoObjP5.setIs_award_link("0");
        LinkInfoObj linkInfoObjP6 = p5();
        f0.m(linkInfoObjP6);
        String link_award_num = linkInfoObjP6.getLink_award_num();
        f0.o(link_award_num, "mLinkInfoObj!!.link_award_num");
        int i10 = Integer.parseInt(link_award_num) - 1;
        LinkInfoObj linkInfoObjP7 = p5();
        f0.m(linkInfoObjP7);
        linkInfoObjP7.setLink_award_num(String.valueOf(Math.max(i10, 0)));
        O5().setLikeBtnCheckState(false, false);
        O5().setLikeBtnText(String.valueOf(Integer.parseInt(O5().getLikeText().toString()) - 1));
        if (!e6()) {
            z6(false);
            LinkInfoObj linkInfoObjP8 = p5();
            f0.m(linkInfoObjP8);
            linkInfoObjP8.setIs_favour("2");
            O5().setCollectBtnCheckState(false, false);
        }
        if (O5().E0() && !f0.g(a5(), i0.j())) {
            O5().setChargeBtnText(String.valueOf(Integer.parseInt(O5().getChargeText().toString()) - 1));
            if (!O5().F0()) {
                LinkInfoObj linkInfoObjP9 = p5();
                f0.m(linkInfoObjP9);
                if (linkInfoObjP9.getBattery() != null) {
                    BottomEditorBarPostPageImpl.setChargeBtnState$default(O5(), false, false, 2, null);
                }
            }
        }
        PostCommentFragment postCommentFragmentB5 = b5();
        if (postCommentFragmentB5 != null) {
            postCommentFragmentB5.n5();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    @dl.e
    public HBShareProtocolData y4() {
        HBShareProtocolData hBShareProtocolData;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38946, new Class[0], HBShareProtocolData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareProtocolData) patchProxyResultProxy.result;
        }
        WikiRelatedLinkObj wikiRelatedLinkObj = this.f88888e4;
        if (wikiRelatedLinkObj == null || (hBShareProtocolData = wikiRelatedLinkObj.toHBShareProtocolData()) == null) {
            return null;
        }
        hBShareProtocolData.setSrc("wiki");
        return hBShareProtocolData;
    }
}
