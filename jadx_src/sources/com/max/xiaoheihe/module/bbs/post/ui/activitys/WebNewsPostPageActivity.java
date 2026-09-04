package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
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
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostWebNewsFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@m(path = lb.d.S)
@o(parameters = 0)
@ig.d(path = {lb.d.f131142d0})
public final class WebNewsPostPageActivity extends BasePostPageActivity implements com.max.xiaoheihe.module.webview.c, com.max.xiaoheihe.app.c {
    public static final int I4 = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28855, new Class[0], Void.TYPE).isSupported && WebNewsPostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28856, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (WebNewsPostPageActivity.this.isActive()) {
                WebNewsPostPageActivity.this.n4();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28857, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WebNewsPostPageActivity.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    WebNewsPostPageActivity webNewsPostPageActivity = WebNewsPostPageActivity.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = webNewsPostPageActivity.H3().getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        webNewsPostPageActivity.H3().setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28858, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28860, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WebNewsPostPageActivity.this.Y2().size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28859, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = WebNewsPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.f81489y, key)) {
                return new PostCommentFragment();
            }
            PostWebNewsFragment.a aVar = PostWebNewsFragment.J3;
            Intent intent = WebNewsPostPageActivity.this.getIntent();
            String stringExtra = intent != null ? intent.getStringExtra(PostPageFactory.f81483s) : null;
            Intent intent2 = WebNewsPostPageActivity.this.getIntent();
            return aVar.a(stringExtra, (LinkInfoObj) (intent2 != null ? intent2.getSerializableExtra(PostPageFactory.f81482r) : null), WebNewsPostPageActivity.this.getIntent().getStringExtra(PostPageFactory.f81471g));
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28862, new Class[]{Object.class}, Integer.TYPE);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28861, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = WebNewsPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList.get(position).getKey()");
            com.max.hbcommon.utils.d.b("cqtest", "Key is " + key);
            return f0.g(PostPageFactory.f81489y, key) ? WebNewsPostPageActivity.this.getString(R.string.subject) : WebNewsPostPageActivity.this.getString(R.string.comment);
        }
    }

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28863, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = WebNewsPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList.get(position).getKey()");
            if (!f0.g(PostPageFactory.f81489y, key)) {
                WebNewsPostPageActivity.this.r4(true);
            } else {
                WebNewsPostPageActivity webNewsPostPageActivity = WebNewsPostPageActivity.this;
                webNewsPostPageActivity.r4(true ^ webNewsPostPageActivity.Z3());
            }
        }
    }

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostWebNewsFragment postWebNewsFragmentO5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28864, new Class[]{View.class}, Void.TYPE).isSupported || (postWebNewsFragmentO5 = WebNewsPostPageActivity.o5(WebNewsPostPageActivity.this)) == null) {
                return;
            }
            postWebNewsFragmentO5.z4();
        }
    }

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostWebNewsFragment postWebNewsFragmentO5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28865, new Class[]{View.class}, Void.TYPE).isSupported || (postWebNewsFragmentO5 = WebNewsPostPageActivity.o5(WebNewsPostPageActivity.this)) == null) {
                return;
            }
            postWebNewsFragmentO5.D4();
        }
    }

    /* JADX INFO: compiled from: WebNewsPostPageActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28866, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = WebNewsPostPageActivity.this.a3().instantiateItem((ViewGroup) WebNewsPostPageActivity.this.q3(), WebNewsPostPageActivity.this.q3().getCurrentItem());
            f0.o(objInstantiateItem, "mPagerAdapter.instantiat…tem(mVp, mVp.currentItem)");
            if (objInstantiateItem instanceof PostCommentFragment) {
                ((PostCommentFragment) objInstantiateItem).F6();
            }
        }
    }

    public static final /* synthetic */ PostWebNewsFragment o5(WebNewsPostPageActivity webNewsPostPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webNewsPostPageActivity}, null, changeQuickRedirect, true, 28854, new Class[]{WebNewsPostPageActivity.class}, PostWebNewsFragment.class);
        return patchProxyResultProxy.isSupported ? (PostWebNewsFragment) patchProxyResultProxy.result : webNewsPostPageActivity.p5();
    }

    private final PostWebNewsFragment p5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28829, new Class[0], PostWebNewsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostWebNewsFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.f81489y, Y2().get(i10).getKey())) {
                Object objInstantiateItem = a3().instantiateItem((ViewGroup) q3(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof PostWebNewsFragment) {
                    return (PostWebNewsFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    private final boolean q5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28853, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!r5()) {
            return false;
        }
        Intent intent = getIntent();
        return ((LinkInfoObj) (intent != null ? intent.getSerializableExtra(PostPageFactory.f81482r) : null)) != null;
    }

    private final boolean r5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28852, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(PostPageFactory.f81483s) : null;
        if (f0.g("0", com.max.hbcache.c.j("local_html_enabled"))) {
            return false;
        }
        return com.max.hbcommon.utils.c.u(stringExtra) || !f0.g(W2(), "29");
    }

    private final void s5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28832, new Class[0], Void.TYPE).isSupported || V2() == null) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        LinkInfoObj linkInfoObjV2 = V2();
        bottomEditorBarPostPageImplH3.setChargeBtnVisible(f0.g("1", linkInfoObjV2 != null ? linkInfoObjV2.getIs_article() : null));
        H3().setCollectBtnVisible(true);
        H3().setLikeBtnVisible(true ^ f0.g("20", W2()));
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH4 = H3();
        LinkInfoObj linkInfoObjV3 = V2();
        bottomEditorBarPostPageImplH4.x(n.q(linkInfoObjV3 != null ? linkInfoObjV3.getComment_num() : null));
        LinkInfoObj linkInfoObjV4 = V2();
        k(linkInfoObjV4 != null ? linkInfoObjV4.getDisable_comment() : null);
        l2();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH5 = H3();
        LinkInfoObj linkInfoObjV5 = V2();
        String link_award_num = linkInfoObjV5 != null ? linkInfoObjV5.getLink_award_num() : null;
        if (link_award_num == null) {
            link_award_num = "0";
        } else {
            f0.o(link_award_num, "mLinkInfoObj?.link_award_num ?: \"0\"");
        }
        bottomEditorBarPostPageImplH5.setLikeBtnText(link_award_num);
        P3();
        H3().setHideAddImg(false);
        if (H3().getHideAddImg()) {
            H3().setAddImgVisible(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    private final void u5() {
        boolean z10;
        BBSUserInfoObj user;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28846, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b5();
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
        if (z10 || (!f0.g("18", W2()) && !f0.g("19", W2()))) {
            z11 = true;
        }
        H3().setEnableComment(C2());
        if (z11 && V2() != null) {
            TitleBar titleBar = this.f66616q;
            LinkInfoObj linkInfoObjV2 = V2();
            titleBar.setActionIcon(i0.q((linkInfoObjV2 == null || (user = linkInfoObjV2.getUser()) == null) ? null : user.getUserid()) ? R.drawable.common_more : R.drawable.common_share);
            this.f66616q.setActionIconOnClickListener(new e());
        }
        if (H3().getEnableComment()) {
            H3().setCommentOnClickListener(new f());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public PostCommentFragment A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28840, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.f81490z, Y2().get(i10).getKey())) {
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28841, new Class[0], BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : p5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28837, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
    }

    @Override // com.max.xiaoheihe.app.c
    public void P(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 28848, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        z0(1);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28835, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I4(new b(getSupportFragmentManager()));
        q3().setOnPageChangeListener(new c());
    }

    @Override // com.max.xiaoheihe.app.c
    public void Y(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 28850, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        z0(2);
    }

    @Override // com.max.xiaoheihe.app.c
    public void b0(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 28849, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        z0(3);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 28843, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().setEditAddCY(false);
        H3().setCYIconColor(R.color.text_secondary_1_color);
        PostWebNewsFragment postWebNewsFragmentP5 = p5();
        if (postWebNewsFragmentP5 != null && postWebNewsFragmentP5.isActive()) {
            T3(postWebNewsFragmentP5, bBSFloorCommentObj);
        }
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
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 28831, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = f0.g("1", Q2());
        H4(result);
        if (zG && result != null && result.getResult() != null) {
            BBSLinkTreeObj result2 = result.getResult();
            f0.m(result2);
            if (result2.getLink() != null) {
                C4("0");
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
                if (postTypeW3 == PostPageFactory.PostType.WEB_NEWS) {
                    i4();
                } else {
                    Log.d("cqtest", "Not WEB_NEWS 3");
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
                s5();
            }
        }
        PostWebNewsFragment postWebNewsFragmentP5 = p5();
        PostCommentFragment postCommentFragmentA2 = A2();
        if (f0.g("page_style_news_content", str)) {
            if (postWebNewsFragmentP5 != null && postWebNewsFragmentP5.isActive()) {
                postWebNewsFragmentP5.A4(result);
            }
        } else if (!f0.g("page_style_news_comments", str)) {
            if (postWebNewsFragmentP5 != null && postWebNewsFragmentP5.isActive()) {
                postWebNewsFragmentP5.A4(result);
            }
            if (postCommentFragmentA2 != null && postCommentFragmentA2.isActive()) {
                postCommentFragmentA2.A4(result);
            }
        } else if (postCommentFragmentA2 != null && postCommentFragmentA2.isActive()) {
            postCommentFragmentA2.A4(result);
        }
        if (ad.a.b(ad.a.f1199f, false, 2, null)) {
            LinkInfoObj linkInfoObjV5 = V2();
            BBSUserInfoObj user3 = linkInfoObjV5 != null ? linkInfoObjV5.getUser() : null;
            LinkInfoObj linkInfoObjV6 = V2();
            d5(user3, linkInfoObjV6 != null ? linkInfoObjV6.getFollow_status() : null);
        }
        c2();
    }

    @Override // kf.a
    public void d1(@dl.e Fragment fragment, int i10, @dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28842, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.f81489y);
        arrayList.add(keyDescObj);
        if (C2()) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(PostPageFactory.f81490z);
            arrayList.add(keyDescObj2);
            r4(!Z3());
        }
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

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w4(false);
        if (ad.a.a(ad.a.E, false)) {
            PostWebNewsFragment postWebNewsFragmentP5 = p5();
            if (postWebNewsFragmentP5 != null) {
                postWebNewsFragmentP5.x4();
                return;
            }
            return;
        }
        PostWebNewsFragment postWebNewsFragmentP6 = p5();
        if (postWebNewsFragmentP6 != null) {
            postWebNewsFragmentP6.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i2() {
        PostWebNewsFragment postWebNewsFragmentP5;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28833, new Class[0], Void.TYPE).isSupported || (postWebNewsFragmentP5 = p5()) == null) {
            return;
        }
        postWebNewsFragmentP5.C4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28844, new Class[0], Void.TYPE).isSupported) {
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
        if (C2()) {
            SlidingTabLayout slidingTabLayoutH3 = h3();
            if (slidingTabLayoutH3 != null) {
                slidingTabLayoutH3.setIndicatorColor(getResources().getColor(R.color.nav_bar_active));
            }
            SlidingTabLayout slidingTabLayoutH4 = h3();
            if (slidingTabLayoutH4 != null) {
                slidingTabLayoutH4.setTextsize(15.0f);
            }
        } else {
            SlidingTabLayout slidingTabLayoutH5 = h3();
            if (slidingTabLayoutH5 != null) {
                slidingTabLayoutH5.setIndicatorColor(getResources().getColor(R.color.divider_secondary_2_color));
            }
            SlidingTabLayout slidingTabLayoutH6 = h3();
            if (slidingTabLayoutH6 != null) {
                slidingTabLayoutH6.setTextsize(17.0f);
            }
        }
        SlidingTabLayout slidingTabLayoutH7 = h3();
        if (slidingTabLayoutH7 != null) {
            slidingTabLayoutH7.setViewPager(q3());
        }
        SlidingTabLayout slidingTabLayoutH8 = h3();
        if (slidingTabLayoutH8 != null) {
            slidingTabLayoutH8.setVisibility(0);
        }
        this.f66616q.getAppbarTitleTextView().setVisibility(8);
        this.f66617r.setVisibility(0);
        this.f66616q.a0();
        u5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28828, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        N3();
        R3();
        e4();
        q3().setAdapter(a3());
        f4();
        if (!q5()) {
            H2();
            return;
        }
        Intent intent = getIntent();
        F4((LinkInfoObj) (intent != null ? intent.getSerializableExtra(PostPageFactory.f81482r) : null));
        s5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void k2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28838, new Class[0], Void.TYPE).isSupported && i0.e(this.f66601b) && isActive() && V2() != null) {
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
            PostWebNewsFragment postWebNewsFragmentP5 = p5();
            if (postWebNewsFragmentP5 != null) {
                postWebNewsFragmentP5.c5();
                if (!U3()) {
                    postWebNewsFragmentP5.d5();
                }
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
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28836, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || M3()) {
            return;
        }
        H3().d0(str, new d());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28839, new Class[0], Void.TYPE).isSupported) {
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
        PostWebNewsFragment postWebNewsFragmentP5 = p5();
        if (postWebNewsFragmentP5 != null) {
            postWebNewsFragmentP5.n5();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28845, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().A0();
        H3().setEnableShare(false);
        O3();
    }

    public final void t5(float f10) {
        PostWebNewsFragment postWebNewsFragmentP5;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 28830, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (postWebNewsFragmentP5 = p5()) == null) {
            return;
        }
        postWebNewsFragmentP5.f8(f10);
    }

    @Override // com.max.xiaoheihe.app.c
    public void u(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 28851, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        z0(0);
    }

    @Override // com.max.xiaoheihe.module.webview.c
    public void z0(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28847, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || p5() == null) {
            return;
        }
        PostWebNewsFragment postWebNewsFragmentP5 = p5();
        f0.m(postWebNewsFragmentP5);
        postWebNewsFragmentP5.e8(i10);
    }
}
