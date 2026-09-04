package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
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
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostPictureFragment;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.jd;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: ConceptPostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@k(message = "这个页面不会打开了")
@ig.d(path = {lb.d.f131149e0})
@m(path = lb.d.S)
@o(parameters = 0)
public final class ConceptPostPageActivity extends BasePostPageActivity {
    public static final int L4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int I4;

    @dl.d
    private String J4 = PostPageFactory.I;

    @dl.e
    private TextView K4;

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28745, new Class[0], Void.TYPE).isSupported && ConceptPostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28746, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ConceptPostPageActivity.this.isActive()) {
                ConceptPostPageActivity.this.n4();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28747, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ConceptPostPageActivity.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    ConceptPostPageActivity conceptPostPageActivity = ConceptPostPageActivity.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = conceptPostPageActivity.H3().getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        conceptPostPageActivity.H3().setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28748, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28750, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ConceptPostPageActivity.this.Y2().size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28749, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = ConceptPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            Log.d("cqtest", "key : " + key);
            return PostPictureFragment.a.b(PostPictureFragment.f81916x1, true, null, null, null, 14, null);
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28752, new Class[]{Object.class}, Integer.TYPE);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28751, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = ConceptPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            com.max.hbcommon.utils.d.b("cqtest", "Key is " + key);
            return f0.g(PostPageFactory.E, key) ? ConceptPostPageActivity.this.getString(R.string.post_title) : ConceptPostPageActivity.this.getString(R.string.comment);
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28753, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = ConceptPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                ConceptPostPageActivity.this.r4(true);
            } else {
                ConceptPostPageActivity conceptPostPageActivity = ConceptPostPageActivity.this;
                conceptPostPageActivity.r4(true ^ conceptPostPageActivity.Z3());
            }
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentP5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28754, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentP5 = ConceptPostPageActivity.p5(ConceptPostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentP5.z4();
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81686c;

        e(BBSUserInfoObj bBSUserInfoObj) {
            this.f81686c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            com.max.xiaoheihe.utils.d.E1(((BaseActivity) ConceptPostPageActivity.this).f66601b, view, ViewUtils.f(((BaseActivity) ConceptPostPageActivity.this).f66601b, 20.0f), (iArr[1] + ViewUtils.f(((BaseActivity) ConceptPostPageActivity.this).f66601b, 10.0f)) - t.m(((BaseActivity) ConceptPostPageActivity.this).f66601b), this.f81686c.getMedal(), this.f81686c.getMedals(), this.f81686c.getLevel_info(), this.f81686c.getUserid());
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentP5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28756, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentP5 = ConceptPostPageActivity.p5(ConceptPostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentP5.z4();
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81689c;

        g(BBSUserInfoObj bBSUserInfoObj) {
            this.f81689c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28757, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) ConceptPostPageActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.T(mContext, this.f81689c.getUserid()));
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentP5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28758, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentP5 = ConceptPostPageActivity.p5(ConceptPostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentP5.F6();
        }
    }

    /* JADX INFO: compiled from: ConceptPostPageActivity.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPictureFragment postPictureFragmentP5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28759, new Class[]{View.class}, Void.TYPE).isSupported || (postPictureFragmentP5 = ConceptPostPageActivity.p5(ConceptPostPageActivity.this)) == null) {
                return;
            }
            postPictureFragmentP5.D4();
        }
    }

    public static final /* synthetic */ PostPictureFragment p5(ConceptPostPageActivity conceptPostPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{conceptPostPageActivity}, null, changeQuickRedirect, true, 28744, new Class[]{ConceptPostPageActivity.class}, PostPictureFragment.class);
        return patchProxyResultProxy.isSupported ? (PostPictureFragment) patchProxyResultProxy.result : conceptPostPageActivity.q5();
    }

    private final PostPictureFragment q5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28726, new Class[0], PostPictureFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPictureFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.E, Y2().get(i10).getKey())) {
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

    private final void r5(jd jdVar) {
        if (PatchProxy.proxy(new Object[]{jdVar}, this, changeQuickRedirect, false, 28742, new Class[]{jd.class}, Void.TYPE).isSupported) {
            return;
        }
        this.K4 = jdVar.f112145e;
        LinkInfoObj linkInfoObjV2 = V2();
        f0.m(linkInfoObjV2);
        BBSUserInfoObj user = linkInfoObjV2.getUser();
        com.max.hbimage.b.I(user.getAvartar(), jdVar.f112142b, R.drawable.common_default_avatar_40x40);
        com.max.xiaoheihe.utils.d.k1(jdVar.f112143c, user, 12);
        jdVar.f112144d.setText(user.getUsername());
        g gVar = new g(user);
        jdVar.f112144d.setOnClickListener(gVar);
        jdVar.f112142b.setOnClickListener(gVar);
        jdVar.f112143c.setOnClickListener(new e(user));
        if (com.max.xiaoheihe.module.account.utils.c.c(user.getUserid()) == 1) {
            TextView textView = this.K4;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.K4;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.K4;
        if (textView3 != null) {
            textView3.setOnClickListener(new f());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    private final void s5() {
        boolean z10;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28727, new Class[0], Void.TYPE).isSupported) {
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
        boolean z12 = z10 || !(f0.g("18", W2()) || f0.g("19", W2()));
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        if (!f0.g("3", W2()) && !f0.g("14", W2()) && !f0.g("18", W2()) && !f0.g("19", W2()) && !f0.g("20", W2())) {
            z11 = true;
        }
        bottomEditorBarPostPageImplH3.setEnableShare(z11);
        if (z12) {
            this.f66616q.setActionIcon(R.drawable.common_more);
            this.f66616q.setActionIconOnClickListener(new i());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public PostCommentFragment A2() {
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public BasePostFragment B2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28737, new Class[0], BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : q5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28734, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28733, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I4(new b(getSupportFragmentManager()));
        q3().setOnPageChangeListener(new c());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 28740, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().setEditAddCY(false);
        H3().setCYIconColor(R.color.text_secondary_1_color);
        PostPictureFragment postPictureFragmentQ5 = q5();
        if (postPictureFragmentQ5 != null && postPictureFragmentQ5.isActive()) {
            T3(postPictureFragmentQ5, bBSFloorCommentObj);
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
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 28730, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
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
                if (postTypeW3 == PostPageFactory.PostType.CONCEPT || postTypeW3 == PostPageFactory.PostType.PICTURE_TEXT) {
                    i4();
                } else {
                    Log.d("cqtest", "Not Normal 1");
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
        PostPictureFragment postPictureFragmentQ5 = q5();
        if (postPictureFragmentQ5 != null && postPictureFragmentQ5.isActive()) {
            postPictureFragmentQ5.A4(result);
        }
        c2();
    }

    @Override // kf.a
    public void d1(@dl.e Fragment fragment, int i10, @dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28738, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.E);
        arrayList.add(keyDescObj);
        H3().setBottomBarVisible(true);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28732, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w4(false);
        PostPictureFragment postPictureFragmentQ5 = q5();
        if (postPictureFragmentQ5 != null) {
            postPictureFragmentQ5.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i2() {
        PostPictureFragment postPictureFragmentQ5;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28731, new Class[0], Void.TYPE).isSupported || (postPictureFragmentQ5 = q5()) == null) {
            return;
        }
        postPictureFragmentQ5.C4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28741, new Class[0], Void.TYPE).isSupported) {
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
        this.f66616q.setVisibility(0);
        this.f66617r.setVisibility(0);
        jd jdVarD = jd.d(this.f66602c, this.f66616q, false);
        f0.o(jdVarD, "inflate(mInflater, mTitleBar, false)");
        LinkInfoObj linkInfoObjV2 = V2();
        if (linkInfoObjV2 == null || linkInfoObjV2.getUser() == null) {
            this.f66616q.setTitle(u3());
        } else {
            r5(jdVarD);
            this.f66616q.setContentView(jdVarD.b());
        }
        s5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28728, new Class[0], Void.TYPE).isSupported) {
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
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28736, new Class[0], Void.TYPE).isSupported && i0.e(this.f66601b) && isActive() && V2() != null) {
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
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M8(T2(), S2()).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new a()));
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, kf.a
    public void l(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28739, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || M3()) {
            return;
        }
        H3().d0(str, new d());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28735, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().A0();
        H3().setEnableComment(false);
        O3();
        H3().setChargeBtnVisible(false);
        H3().setShareBtnText("评论");
        H3().setShareOnClickListener(new h());
        H3().setShareBtnIcon(R.drawable.ic_comment_24);
        H3().setIvCYVisible(false);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, kf.a
    public void r1(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 28743, new Class[]{BBSUserInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.r1(bBSUserInfoObj, str);
        TextView textView = this.K4;
        if (textView != null) {
            if (f0.g("0", str)) {
                Drawable drawable = this.f66601b.getResources().getDrawable(R.drawable.common_add_with_padding_16x16);
                int iF = ViewUtils.f(this.f66601b, 14.0f);
                drawable.setBounds(0, 0, iF, iF);
                textView.setText(R.string.follow);
                textView.setTextColor(this.f66601b.getResources().getColor(R.color.white));
                textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.text_primary_2dp));
                textView.setCompoundDrawables(drawable, null, null, null);
                return;
            }
            if (f0.g("1", str)) {
                textView.setText(R.string.has_followed);
                textView.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
                textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.divider_color_concept_2dp));
                textView.setCompoundDrawables(null, null, null, null);
                return;
            }
            if (f0.g("2", str)) {
                Drawable drawable2 = this.f66601b.getResources().getDrawable(R.drawable.account_follow_each_other_v);
                int iF2 = ViewUtils.f(this.f66601b, 14.0f);
                drawable2.setBounds(0, 0, iF2, iF2);
                textView.setText(R.string.follow);
                textView.setTextColor(this.f66601b.getResources().getColor(R.color.white));
                textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.text_primary_2dp));
                textView.setCompoundDrawables(drawable2, null, null, null);
                return;
            }
            if (f0.g("3", str)) {
                Drawable drawable3 = this.f66601b.getResources().getDrawable(R.drawable.account_follow_each_other_v);
                int iF3 = ViewUtils.f(this.f66601b, 14.0f);
                drawable3.setBounds(0, 0, iF3, iF3);
                drawable3.setColorFilter(this.f66601b.getResources().getColor(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_ATOP);
                textView.setText(R.string.follow_each_other);
                textView.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
                textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.divider_color_concept_2dp));
                textView.setCompoundDrawables(drawable3, null, null, null);
            }
        }
    }
}
