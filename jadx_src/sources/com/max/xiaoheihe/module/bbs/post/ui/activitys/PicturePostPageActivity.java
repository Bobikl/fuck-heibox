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
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
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
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostPictureFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: PicturePostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@m(path = lb.d.S)
@o(parameters = 0)
@ig.d(path = {lb.d.f131156f0})
public final class PicturePostPageActivity extends BasePostPageActivity implements com.max.xiaoheihe.app.c {
    public static final int J4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean I4;

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28816, new Class[0], Void.TYPE).isSupported && PicturePostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28817, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PicturePostPageActivity.this.isActive()) {
                PicturePostPageActivity.this.n4();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28818, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PicturePostPageActivity.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    PicturePostPageActivity picturePostPageActivity = PicturePostPageActivity.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = picturePostPageActivity.H3().getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        picturePostPageActivity.H3().setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28819, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28821, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : PicturePostPageActivity.this.Y2().size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28820, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = PicturePostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.F, key)) {
                return new PostCommentFragment();
            }
            Intent intent = PicturePostPageActivity.this.getIntent();
            LinkInfoObj linkInfoObj = (LinkInfoObj) (intent != null ? intent.getSerializableExtra(PostPageFactory.f81482r) : null);
            PostPictureFragment.a aVar = PostPictureFragment.f81916x1;
            Intent intent2 = PicturePostPageActivity.this.getIntent();
            return aVar.a(false, linkInfoObj, intent2 != null ? intent2.getStringExtra(PostPageFactory.f81471g) : null, linkInfoObj);
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28823, new Class[]{Object.class}, Integer.TYPE);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28822, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = PicturePostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList.get(position).getKey()");
            com.max.hbcommon.utils.d.b("cqtest", "Key is " + key);
            return f0.g(PostPageFactory.F, key) ? PicturePostPageActivity.this.getString(R.string.subject) : PicturePostPageActivity.this.getString(R.string.comment);
        }
    }

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28824, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = PicturePostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList.get(position).getKey()");
            if (!f0.g(PostPageFactory.F, key)) {
                PicturePostPageActivity.this.r4(true);
            } else {
                PicturePostPageActivity picturePostPageActivity = PicturePostPageActivity.this;
                picturePostPageActivity.r4(true ^ picturePostPageActivity.Z3());
            }
        }
    }

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentO5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28825, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentO5 = PicturePostPageActivity.o5(PicturePostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentO5.z4();
        }
    }

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentO5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28826, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentO5 = PicturePostPageActivity.o5(PicturePostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentO5.D4();
        }
    }

    /* JADX INFO: compiled from: PicturePostPageActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28827, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = PicturePostPageActivity.this.a3().instantiateItem((ViewGroup) PicturePostPageActivity.this.q3(), PicturePostPageActivity.this.q3().getCurrentItem());
            f0.o(objInstantiateItem, "mPagerAdapter.instantiat…tem(mVp, mVp.currentItem)");
            if (objInstantiateItem instanceof PostCommentFragment) {
                ((PostCommentFragment) objInstantiateItem).F6();
            }
        }
    }

    public static final /* synthetic */ PostPictureFragment o5(PicturePostPageActivity picturePostPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{picturePostPageActivity}, null, changeQuickRedirect, true, 28815, new Class[]{PicturePostPageActivity.class}, PostPictureFragment.class);
        return patchProxyResultProxy.isSupported ? (PostPictureFragment) patchProxyResultProxy.result : picturePostPageActivity.q5();
    }

    private final boolean p5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28796, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (ad.a.a("improve_ab_testshow_fullscreen_award_guide", true)) {
            return !MMKVManager.f71329a.d(na.a.f132027b, na.a.f132028c, false, false);
        }
        return false;
    }

    private final PostPictureFragment q5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28797, new Class[0], PostPictureFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPictureFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.F, Y2().get(i10).getKey())) {
                Object objInstantiateItem = a3().instantiateItem((ViewGroup) q3(), i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mVp, i)");
                if (objInstantiateItem instanceof PostPictureFragment) {
                    return (PostPictureFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    private final void r5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28795, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.I4 = true;
        com.max.xiaoheihe.module.bbs.post.ui.fragments.b.f81973c.a(0).show(getSupportFragmentManager(), "");
        MMKVManager.f71329a.k(na.a.f132027b, na.a.f132028c, true, false);
    }

    private final void s5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28814, new Class[0], Void.TYPE).isSupported || V2() == null) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        LinkInfoObj linkInfoObjV2 = V2();
        bottomEditorBarPostPageImplH3.setChargeBtnVisible(f0.g("1", linkInfoObjV2 != null ? linkInfoObjV2.getIs_article() : null));
        H3().setCollectBtnVisible(true);
        H3().setLikeBtnVisible(true ^ f0.g("20", W2()));
        LinkInfoObj linkInfoObjV3 = V2();
        k(linkInfoObjV3 != null ? linkInfoObjV3.getDisable_comment() : null);
        l2();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH4 = H3();
        LinkInfoObj linkInfoObjV4 = V2();
        String link_award_num = linkInfoObjV4 != null ? linkInfoObjV4.getLink_award_num() : null;
        if (link_award_num == null) {
            link_award_num = "0";
        } else {
            f0.o(link_award_num, "mLinkInfoObj?.link_award_num ?: \"0\"");
        }
        bottomEditorBarPostPageImplH4.setLikeBtnText(link_award_num);
        P3();
        H3().setHideAddImg(false);
        if (H3().getHideAddImg()) {
            H3().setAddImgVisible(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    private final void t5() {
        boolean z10;
        BBSUserInfoObj user;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28813, new Class[0], Void.TYPE).isSupported) {
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28807, new Class[0], PostCommentFragment.class);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28808, new Class[0], BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : q5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28804, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void P(Activity activity) {
        com.max.xiaoheihe.app.b.a(this, activity);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28802, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I4(new b(getSupportFragmentManager()));
        q3().setOnPageChangeListener(new c());
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void Y(Activity activity) {
        com.max.xiaoheihe.app.b.c(this, activity);
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void b0(Activity activity) {
        com.max.xiaoheihe.app.b.b(this, activity);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 28810, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().setEditAddCY(false);
        H3().setCYIconColor(R.color.text_secondary_1_color);
        PostPictureFragment postPictureFragmentQ5 = q5();
        if (postPictureFragmentQ5 != null && postPictureFragmentQ5.isActive()) {
            T3(postPictureFragmentQ5, bBSFloorCommentObj);
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
    public void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28799, new Class[0], Void.TYPE).isSupported || this.I4) {
            return;
        }
        super.c2();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void c4(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 28798, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
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
                if (postTypeW3 == PostPageFactory.PostType.PICTURE_TEXT) {
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
        PostPictureFragment postPictureFragmentQ5 = q5();
        PostCommentFragment postCommentFragmentA2 = A2();
        if (f0.g("page_style_picture", str)) {
            if (postPictureFragmentQ5 != null && postPictureFragmentQ5.isActive()) {
                postPictureFragmentQ5.A4(result);
            }
        } else if (!f0.g("page_style_news_comments", str)) {
            if (postPictureFragmentQ5 != null && postPictureFragmentQ5.isActive()) {
                postPictureFragmentQ5.A4(result);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28809, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.F);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28801, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w4(false);
        if (ad.a.a(ad.a.E, false)) {
            PostPictureFragment postPictureFragmentQ5 = q5();
            if (postPictureFragmentQ5 != null) {
                postPictureFragmentQ5.x4();
                return;
            }
            return;
        }
        PostPictureFragment postPictureFragmentQ6 = q5();
        if (postPictureFragmentQ6 != null) {
            postPictureFragmentQ6.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i2() {
        PostPictureFragment postPictureFragmentQ5;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28800, new Class[0], Void.TYPE).isSupported || (postPictureFragmentQ5 = q5()) == null) {
            return;
        }
        postPictureFragmentQ5.C4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28811, new Class[0], Void.TYPE).isSupported) {
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
        t5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        N3();
        R3();
        e4();
        q3().setAdapter(a3());
        f4();
        H2();
        if (p5()) {
            r5();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void k2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28805, new Class[0], Void.TYPE).isSupported && i0.e(this.f66601b) && isActive() && V2() != null) {
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
            PostPictureFragment postPictureFragmentQ5 = q5();
            if (postPictureFragmentQ5 != null) {
                postPictureFragmentQ5.c5();
                if (!U3()) {
                    postPictureFragmentQ5.d5();
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
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28803, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || M3()) {
            return;
        }
        H3().d0(str, new d());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28806, new Class[0], Void.TYPE).isSupported) {
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
        PostPictureFragment postPictureFragmentQ5 = q5();
        if (postPictureFragmentQ5 != null) {
            postPictureFragmentQ5.n5();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28812, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().A0();
        H3().setEnableShare(false);
        O3();
        s5();
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void u(Activity activity) {
        com.max.xiaoheihe.app.b.d(this, activity);
    }
}
