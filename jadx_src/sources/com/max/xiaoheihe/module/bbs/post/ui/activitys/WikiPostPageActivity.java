package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
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
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WikiPostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@k(message = "use WikiPostPageFragment")
@ig.d(path = {lb.d.f131135c0})
@m(path = lb.d.S)
@o(parameters = 0)
public final class WikiPostPageActivity extends BasePostPageActivity {
    public static final int J4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private WikiRelatedLinkObj I4;

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28891, new Class[0], Void.TYPE).isSupported && WikiPostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28892, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (WikiPostPageActivity.this.isActive()) {
                WikiPostPageActivity.this.n4();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28893, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WikiPostPageActivity.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    WikiPostPageActivity wikiPostPageActivity = WikiPostPageActivity.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = wikiPostPageActivity.H3().getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        wikiPostPageActivity.H3().setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28894, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<WikiRelatedLinkObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28895, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (WikiPostPageActivity.this.isActive()) {
                super.onError(e10);
                WikiPostPageActivity.t5(WikiPostPageActivity.this);
            }
        }

        public void onNext(@dl.d Result<WikiRelatedLinkObj> result) {
            WebviewFragment webviewFragmentR5;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28896, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WikiPostPageActivity.this.isActive()) {
                WikiPostPageActivity.this.I4 = result.getResult();
                if (WikiPostPageActivity.this.I4 != null) {
                    WikiPostPageActivity wikiPostPageActivity = WikiPostPageActivity.this;
                    WikiRelatedLinkObj wikiRelatedLinkObj = wikiPostPageActivity.I4;
                    wikiPostPageActivity.E4(wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getLinkid() : null);
                    WikiPostPageActivity wikiPostPageActivity2 = WikiPostPageActivity.this;
                    WikiRelatedLinkObj wikiRelatedLinkObj2 = wikiPostPageActivity2.I4;
                    wikiPostPageActivity2.G4(wikiRelatedLinkObj2 != null ? wikiRelatedLinkObj2.getLink_tag() : null);
                    WikiRelatedLinkObj wikiRelatedLinkObj3 = WikiPostPageActivity.this.I4;
                    if (!com.max.hbcommon.utils.c.u(wikiRelatedLinkObj3 != null ? wikiRelatedLinkObj3.getUrl() : null) && (webviewFragmentR5 = WikiPostPageActivity.r5(WikiPostPageActivity.this)) != null) {
                        WikiPostPageActivity wikiPostPageActivity3 = WikiPostPageActivity.this;
                        WikiRelatedLinkObj wikiRelatedLinkObj4 = wikiPostPageActivity3.I4;
                        webviewFragmentR5.t7(WikiPostPageActivity.q5(wikiPostPageActivity3, wikiRelatedLinkObj4 != null ? wikiRelatedLinkObj4.getUrl() : null));
                    }
                    WikiPostPageActivity.this.d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28897, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WikiRelatedLinkObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28899, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WikiPostPageActivity.this.Y2().size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28898, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = WikiPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                return new PostCommentFragment();
            }
            WikiRelatedLinkObj wikiRelatedLinkObj = WikiPostPageActivity.this.I4;
            String strQ5 = null;
            if ((wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getUrl() : null) != null) {
                WikiPostPageActivity wikiPostPageActivity = WikiPostPageActivity.this;
                WikiRelatedLinkObj wikiRelatedLinkObj2 = wikiPostPageActivity.I4;
                strQ5 = WikiPostPageActivity.q5(wikiPostPageActivity, wikiRelatedLinkObj2 != null ? wikiRelatedLinkObj2.getUrl() : null);
            }
            WebviewFragment webviewFragmentA = new u(strQ5).p(WebviewFragment.W4).a();
            webviewFragmentA.Q7(true);
            return webviewFragmentA;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28901, new Class[]{Object.class}, Integer.TYPE);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28900, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = WikiPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            com.max.hbcommon.utils.d.b("cqtest", "Key is " + key);
            return f0.g(PostPageFactory.C, key) ? WikiPostPageActivity.this.getString(R.string.wiki_article) : WikiPostPageActivity.this.getString(R.string.comment);
        }
    }

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class d extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28902, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = WikiPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                WikiPostPageActivity.this.r4(true);
            } else {
                WikiPostPageActivity wikiPostPageActivity = WikiPostPageActivity.this;
                wikiPostPageActivity.r4(true ^ wikiPostPageActivity.Z3());
            }
        }
    }

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostCommentFragment postCommentFragmentA2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28903, new Class[]{View.class}, Void.TYPE).isSupported || (postCommentFragmentA2 = WikiPostPageActivity.this.A2()) == null) {
                return;
            }
            postCommentFragmentA2.z4();
        }
    }

    /* JADX INFO: compiled from: WikiPostPageActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            UMImage uMImage;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l lVar = l.f66572a;
            JsonObject jsonObject = new JsonObject();
            WikiEntryObj wikiEntryObjR3 = WikiPostPageActivity.this.r3();
            if (wikiEntryObjR3 != null) {
                jsonObject.addProperty("wiki_id", wikiEntryObjR3.getWiki_id());
                jsonObject.addProperty("name", wikiEntryObjR3.getName());
                jsonObject.addProperty("article_id", wikiEntryObjR3.getArticle_id());
            }
            b2 b2Var = b2.f124493a;
            lVar.l(lb.d.T2, jsonObject);
            if (WikiPostPageActivity.this.V2() == null) {
                return;
            }
            LinkInfoObj linkInfoObjV2 = WikiPostPageActivity.this.V2();
            f0.m(linkInfoObjV2);
            if (linkInfoObjV2.getForward() != null) {
                LinkInfoObj linkInfoObjV3 = WikiPostPageActivity.this.V2();
                f0.m(linkInfoObjV3);
                if (linkInfoObjV3.getForward().getIs_deleted() != null) {
                    LinkInfoObj linkInfoObjV4 = WikiPostPageActivity.this.V2();
                    f0.m(linkInfoObjV4);
                    if (f0.g("1", linkInfoObjV4.getForward().getIs_deleted())) {
                        com.max.hbutils.utils.c.f("原贴已被删除，无法转发");
                        return;
                    }
                }
            }
            List[] listArr = new List[1];
            WikiRelatedLinkObj wikiRelatedLinkObj = WikiPostPageActivity.this.I4;
            listArr[0] = wikiRelatedLinkObj != null ? wikiRelatedLinkObj.getImgs() : null;
            if (com.max.hbcommon.utils.c.w(listArr)) {
                uMImage = new UMImage(((BaseActivity) WikiPostPageActivity.this).f66601b, R.drawable.share_thumbnail);
            } else {
                Activity activity = ((BaseActivity) WikiPostPageActivity.this).f66601b;
                WikiRelatedLinkObj wikiRelatedLinkObj2 = WikiPostPageActivity.this.I4;
                f0.m(wikiRelatedLinkObj2);
                uMImage = new UMImage(activity, wikiRelatedLinkObj2.getImgs().get(0));
            }
            PostCommentFragment postCommentFragmentA2 = WikiPostPageActivity.this.A2();
            if (postCommentFragmentA2 != null) {
                WikiRelatedLinkObj wikiRelatedLinkObj3 = WikiPostPageActivity.this.I4;
                String title = wikiRelatedLinkObj3 != null ? wikiRelatedLinkObj3.getTitle() : null;
                WikiRelatedLinkObj wikiRelatedLinkObj4 = WikiPostPageActivity.this.I4;
                String description = wikiRelatedLinkObj4 != null ? wikiRelatedLinkObj4.getDescription() : null;
                WikiRelatedLinkObj wikiRelatedLinkObj5 = WikiPostPageActivity.this.I4;
                postCommentFragmentA2.V4(title, description, wikiRelatedLinkObj5 != null ? wikiRelatedLinkObj5.getShare_url() : null, uMImage);
            }
        }
    }

    public static final /* synthetic */ String q5(WikiPostPageActivity wikiPostPageActivity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageActivity, str}, null, changeQuickRedirect, true, 28888, new Class[]{WikiPostPageActivity.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : wikiPostPageActivity.u5(str);
    }

    public static final /* synthetic */ WebviewFragment r5(WikiPostPageActivity wikiPostPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiPostPageActivity}, null, changeQuickRedirect, true, 28890, new Class[]{WikiPostPageActivity.class}, WebviewFragment.class);
        return patchProxyResultProxy.isSupported ? (WebviewFragment) patchProxyResultProxy.result : wikiPostPageActivity.w5();
    }

    public static final /* synthetic */ void t5(WikiPostPageActivity wikiPostPageActivity) {
        if (PatchProxy.proxy(new Object[]{wikiPostPageActivity}, null, changeQuickRedirect, true, 28889, new Class[]{WikiPostPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        wikiPostPageActivity.C1();
    }

    private final String u5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28870, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strE = l0.e(str);
        Map<String, String> mapV5 = v5();
        String strT2 = T2();
        f0.m(strT2);
        mapV5.put("link_id", strT2);
        if (!g3()) {
            mapV5.put("in_topic", "1");
        }
        if (!com.max.hbcommon.utils.c.u(S2())) {
            String strS2 = S2();
            f0.m(strS2);
            mapV5.put("h_src", strS2);
        }
        return l0.f(strE, mapV5);
    }

    private final Map<String, String> v5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28869, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(e3());
        return mapX == null ? new HashMap(16) : mapX;
    }

    private final WebviewFragment w5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28868, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.C, Y2().get(i10).getKey())) {
                Object objInstantiateItem = a3().instantiateItem((ViewGroup) q3(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof WebviewFragment) {
                    return (WebviewFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    private final void x5() {
        boolean z10;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28867, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (X2() != null) {
            Result<BBSLinkTreeObj> resultX2 = X2();
            f0.m(resultX2);
            if (resultX2.getResult() != null) {
                Result<BBSLinkTreeObj> resultX3 = X2();
                f0.m(resultX3);
                BBSLinkTreeObj result = resultX3.getResult();
                f0.m(result);
                if (result.getLink() != null) {
                    Result<BBSLinkTreeObj> resultX4 = X2();
                    f0.m(resultX4);
                    BBSLinkTreeObj result2 = resultX4.getResult();
                    f0.m(result2);
                    if (result2.getLink().getRelated_status() != null) {
                        Result<BBSLinkTreeObj> resultX5 = X2();
                        f0.m(resultX5);
                        BBSLinkTreeObj result3 = resultX5.getResult();
                        f0.m(result3);
                        if (f0.g("roll_room", result3.getLink().getRelated_status().getContent_type())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        if (!f0.g("3", W2()) && !f0.g("14", W2()) && !f0.g("18", W2()) && !f0.g("19", W2()) && !f0.g("20", W2())) {
            z11 = true;
        }
        bottomEditorBarPostPageImplH3.setEnableShare(z11);
        if (z10) {
            this.f66616q.setActionIcon(R.drawable.common_more);
        }
        if (H3().getEnableShare()) {
            H3().setShareOnClickListener(new f());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public PostCommentFragment A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28881, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.D, Y2().get(i10).getKey())) {
                Object objInstantiateItem = a3().instantiateItem((ViewGroup) q3(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof PostCommentFragment) {
                    return (PostCommentFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public BasePostFragment B2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28882, new Class[0], BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : A2();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void H2() {
        z<Result<WikiRelatedLinkObj>> zVarE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (r3() != null) {
            com.max.xiaoheihe.network.e eVarA = i.a();
            WikiEntryObj wikiEntryObjR3 = r3();
            f0.m(wikiEntryObjR3);
            String article_id = wikiEntryObjR3.getArticle_id();
            WikiEntryObj wikiEntryObjR4 = r3();
            f0.m(wikiEntryObjR4);
            String wiki_id = wikiEntryObjR4.getWiki_id();
            WikiEntryObj wikiEntryObjR5 = r3();
            f0.m(wikiEntryObjR5);
            zVarE = eVarA.E(article_id, wiki_id, wikiEntryObjR5.getName(), null);
            f0.o(zVarE, "{\n            ServiceGen…i!!.name, null)\n        }");
        } else {
            zVarE = i.a().E(null, null, null, T2());
            f0.o(zVarE, "{\n            ServiceGen… null, mLinkId)\n        }");
        }
        V((io.reactivex.disposables.b) zVarE.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public boolean L1() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28876, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I4(new c(getSupportFragmentManager()));
        q3().setOnPageChangeListener(new d());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 28885, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().setEditAddCY(false);
        H3().setCYIconColor(R.color.text_secondary_1_color);
        PostCommentFragment postCommentFragmentA2 = A2();
        if (postCommentFragmentA2 != null && postCommentFragmentA2.isActive()) {
            T3(postCommentFragmentA2, bBSFloorCommentObj);
        }
        H3().getImgPathList().clear();
        x mUploadImgShowerAdapter = H3().getMUploadImgShowerAdapter();
        if (mUploadImgShowerAdapter != null) {
            mUploadImgShowerAdapter.r(H3().getImgPathList());
        }
        v4("");
        l("action_comment", true);
        m4();
        if ((bBSFloorCommentObj == null || bBSFloorCommentObj.getReply_push_state() == null || !f0.g("1", bBSFloorCommentObj.getReply_push_state().getPush_state())) ? false : true) {
            v.a(this.f66601b, v.f95761b, null);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void c4(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 28873, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = f0.g("1", Q2());
        C4("0");
        H4(result);
        if (zG && result != null && result.getResult() != null) {
            BBSLinkTreeObj result2 = result.getResult();
            f0.m(result2);
            if (result2.getLink() != null) {
                BBSLinkTreeObj result3 = result.getResult();
                f0.m(result3);
                F4(result3.getLink());
                LinkInfoObj linkInfoObjV2 = V2();
                if (((linkInfoObjV2 == null || (user = linkInfoObjV2.getUser()) == null) ? null : user.getUserid()) != null) {
                    LinkInfoObj linkInfoObjV3 = V2();
                    f0.m(linkInfoObjV3);
                    BBSUserInfoObj user2 = linkInfoObjV3.getUser();
                    f0.m(user2);
                    String userid = user2.getUserid();
                    f0.m(userid);
                    q4(userid);
                }
                LinkInfoObj linkInfoObjV4 = V2();
                G4(linkInfoObjV4 != null ? linkInfoObjV4.getLink_tag() : null);
                PostPageFactory.PostType postTypeW3 = w3();
                if (postTypeW3 == PostPageFactory.PostType.WIKI) {
                    i4();
                } else {
                    Log.d("cqtest", "Not WIKI 4");
                    PostPageFactory.a aVar = PostPageFactory.f81465a;
                    Activity mContext = this.f66601b;
                    f0.o(mContext, "mContext");
                    BBSLinkTreeObj result4 = result.getResult();
                    f0.m(result4);
                    LinkInfoObj link = result4.getLink();
                    f0.o(link, "linkTreeResult.result!!.link");
                    aVar.c(mContext, postTypeW3, link, X3());
                    finish();
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
                LinkInfoObj linkInfoObjV5 = V2();
                bottomEditorBarPostPageImplH3.setChargeBtnVisible(f0.g("1", linkInfoObjV5 != null ? linkInfoObjV5.getIs_article() : null));
                H3().setCollectBtnVisible(true);
                H3().setLikeBtnVisible(!f0.g("20", W2()));
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH4 = H3();
                LinkInfoObj linkInfoObjV6 = V2();
                bottomEditorBarPostPageImplH4.x(n.q(linkInfoObjV6 != null ? linkInfoObjV6.getComment_num() : null));
                LinkInfoObj linkInfoObjV7 = V2();
                k(linkInfoObjV7 != null ? linkInfoObjV7.getDisable_comment() : null);
                l2();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH5 = H3();
                LinkInfoObj linkInfoObjV8 = V2();
                String link_award_num = linkInfoObjV8 != null ? linkInfoObjV8.getLink_award_num() : null;
                bottomEditorBarPostPageImplH5.setLikeBtnText(link_award_num != null ? link_award_num : "0");
                P3();
                H3().setHideAddImg(false);
                if (H3().getHideAddImg()) {
                    H3().setAddImgVisible(false);
                }
            }
        }
        PostCommentFragment postCommentFragmentA2 = A2();
        if (postCommentFragmentA2 != null && postCommentFragmentA2.isActive()) {
            postCommentFragmentA2.A4(result);
        }
        c2();
    }

    @Override // kf.a
    public void d1(@dl.e Fragment fragment, int i10, @dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.C);
        arrayList.add(keyDescObj);
        if (C2()) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(PostPageFactory.D);
            arrayList.add(keyDescObj2);
            H3().setBottomBarVisible(!Z3());
        }
        H3().setLikeBtnVisible(false);
        H3().setCollectBtnVisible(false);
        Y2().clear();
        Y2().addAll(arrayList);
        a3().notifyDataSetChanged();
        i4();
        if (X3()) {
            q3().setCurrentItem(1);
        } else {
            if (com.max.hbcommon.utils.c.u(f3())) {
                return;
            }
            m0(null);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28887, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        WikiEntryObj wikiEntryObjR3 = r3();
        if (wikiEntryObjR3 != null) {
            jsonObject.addProperty("wiki_id", wikiEntryObjR3.getWiki_id());
            jsonObject.addProperty("name", wikiEntryObjR3.getName());
            jsonObject.addProperty("article_id", wikiEntryObjR3.getArticle_id());
        }
        jsonObject.addProperty("is_wiki", "1");
        return jsonObject.toString();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28875, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w4(false);
        if (ad.a.a(ad.a.E, false)) {
            PostCommentFragment postCommentFragmentA2 = A2();
            if (postCommentFragmentA2 != null) {
                postCommentFragmentA2.x4();
                return;
            }
            return;
        }
        PostCommentFragment postCommentFragmentA3 = A2();
        if (postCommentFragmentA3 != null) {
            postCommentFragmentA3.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i2() {
        PostCommentFragment postCommentFragmentA2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28874, new Class[0], Void.TYPE).isSupported || (postCommentFragmentA2 = A2()) == null) {
            return;
        }
        postCommentFragmentA2.C4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28886, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewZ0 = Z0();
        f0.n(viewZ0, "null cannot be cast to non-null type android.view.ViewGroup");
        t.y((ViewGroup) viewZ0);
        int color = getResources().getColor(R.color.appbar_bg_color);
        View viewZ1 = Z0();
        f0.n(viewZ1, "null cannot be cast to non-null type android.view.ViewGroup");
        t.c(color, (ViewGroup) viewZ1, null);
        g4();
        if (h3() == null) {
            M4(this.f66616q.getTitleTabLayout());
        }
        SlidingTabLayout slidingTabLayoutH3 = h3();
        if (slidingTabLayoutH3 != null) {
            slidingTabLayoutH3.setViewPager(q3());
        }
        SlidingTabLayout slidingTabLayoutH4 = h3();
        if (slidingTabLayoutH4 != null) {
            slidingTabLayoutH4.setVisibility(0);
        }
        this.f66616q.getAppbarTitleTextView().setVisibility(8);
        this.f66617r.setVisibility(0);
        this.f66616q.a0();
        x5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28871, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        N3();
        R3();
        e4();
        q3().setAdapter(a3());
        f4();
        H2();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void k2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28880, new Class[0], Void.TYPE).isSupported && i0.e(this.f66601b) && isActive() && V2() != null) {
            H3().setLikeBtnCheckState(true, true);
            String strValueOf = String.valueOf(Integer.parseInt(H3().getLikeText().toString()) + 1);
            H3().setLikeBtnText(strValueOf);
            H3().setLikeBtnCheckState(true, false);
            LinkInfoObj linkInfoObjV2 = V2();
            f0.m(linkInfoObjV2);
            linkInfoObjV2.setIs_award_link("1");
            LinkInfoObj linkInfoObjV3 = V2();
            f0.m(linkInfoObjV3);
            linkInfoObjV3.setLink_award_num(strValueOf);
            if (U3()) {
                c5(true);
            } else {
                c5(false);
                LinkInfoObj linkInfoObjV4 = V2();
                f0.m(linkInfoObjV4);
                linkInfoObjV4.setIs_favour("1");
                H3().setCollectBtnCheckState(true, true);
            }
            t4(true);
            if (H3().E0() && !f0.g(z2(), i0.j())) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(H3(), true, false, 2, null);
                String string = H3().getChargeText().toString();
                H3().setChargeBtnText((f0.g("", string) ? "0" : Integer.valueOf(Integer.parseInt(string) + 1)).toString());
            }
            V((io.reactivex.disposables.b) i.a().M8(T2(), S2()).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new a()));
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, kf.a
    public void l(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28884, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || M3()) {
            return;
        }
        H3().d0(str, new e());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, kf.a
    public boolean m0(@dl.e String str) {
        PostCommentFragment postCommentFragmentA2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28877, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(q3().getCurrentItem() == 0)) {
            return false;
        }
        if (!com.max.hbcommon.utils.c.u(str) && (postCommentFragmentA2 = A2()) != null) {
            PostCommentFragment.E6(postCommentFragmentA2, str, false, 2, null);
        }
        q3().setCurrentItem(1);
        return true;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjV2 = V2();
        f0.m(linkInfoObjV2);
        linkInfoObjV2.setIs_award_link("0");
        LinkInfoObj linkInfoObjV3 = V2();
        f0.m(linkInfoObjV3);
        String link_award_num = linkInfoObjV3.getLink_award_num();
        f0.o(link_award_num, "mLinkInfoObj!!.link_award_num");
        int i10 = Integer.parseInt(link_award_num) - 1;
        LinkInfoObj linkInfoObjV4 = V2();
        f0.m(linkInfoObjV4);
        linkInfoObjV4.setLink_award_num(String.valueOf(Math.max(i10, 0)));
        H3().setLikeBtnCheckState(false, false);
        H3().setLikeBtnText(String.valueOf(Integer.parseInt(H3().getLikeText().toString()) - 1));
        if (!Y3()) {
            t4(false);
            LinkInfoObj linkInfoObjV5 = V2();
            f0.m(linkInfoObjV5);
            linkInfoObjV5.setIs_favour("2");
            H3().setCollectBtnCheckState(false, false);
        }
        if (H3().E0() && !f0.g(z2(), i0.j())) {
            H3().setChargeBtnText(String.valueOf(Integer.parseInt(H3().getChargeText().toString()) - 1));
            if (!H3().F0()) {
                LinkInfoObj linkInfoObjV6 = V2();
                f0.m(linkInfoObjV6);
                if (linkInfoObjV6.getBattery() != null) {
                    BottomEditorBarPostPageImpl.setChargeBtnState$default(H3(), false, false, 2, null);
                }
            }
        }
        PostCommentFragment postCommentFragmentA2 = A2();
        if (postCommentFragmentA2 != null) {
            postCommentFragmentA2.n5();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().A0();
        H3().setEnableComment(false);
        O3();
    }
}
