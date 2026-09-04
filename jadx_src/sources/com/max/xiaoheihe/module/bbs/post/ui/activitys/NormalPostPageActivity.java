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
import com.max.hbcommon.analytics.m;
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
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: NormalPostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@m(path = lb.d.S)
@o(parameters = 0)
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.a.class}, path = {lb.d.S, lb.d.f131128b0})
public final class NormalPostPageActivity extends BasePostPageActivity {
    public static final int K4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int I4;

    @dl.d
    private String J4 = PostPageFactory.I;

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28781, new Class[0], Void.TYPE).isSupported && NormalPostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28782, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (NormalPostPageActivity.this.isActive()) {
                NormalPostPageActivity.this.n4();
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28783, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (NormalPostPageActivity.this.isActive()) {
                super.onNext(result);
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ComboObj result2 = result.getResult();
                if (result2 != null) {
                    NormalPostPageActivity normalPostPageActivity = NormalPostPageActivity.this;
                    if (com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                        com.max.hbutils.utils.c.f(result2.getMsg());
                        String string = normalPostPageActivity.H3().getChargeText().toString();
                        if (f0.g("", string)) {
                            string = "0";
                        }
                        normalPostPageActivity.H3().setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28784, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28786, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : NormalPostPageActivity.this.Y2().size();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        
            if (r10.equals("14") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r10.equals("3") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        
            r10 = new com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment();
            r10.setArguments(androidx.core.os.e.b(kotlin.c1.a(com.max.xiaoheihe.module.bbs.post.PostPageFactory.f81471g, r9.f81693l.f3())));
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        
            return r10;
         */
        @Override // androidx.fragment.app.n0
        @dl.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.fragment.app.Fragment getItem(int r10) {
            /*
                r9 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r10)
                r8 = 0
                r1[r8] = r2
                com.meituan.robust.ChangeQuickRedirect r3 = com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity.b.changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r6[r8] = r2
                java.lang.Class<androidx.fragment.app.Fragment> r7 = androidx.fragment.app.Fragment.class
                r4 = 0
                r5 = 28785(0x7071, float:4.0336E-41)
                r2 = r9
                com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
                boolean r2 = r1.isSupported
                if (r2 == 0) goto L26
                java.lang.Object r10 = r1.result
                androidx.fragment.app.Fragment r10 = (androidx.fragment.app.Fragment) r10
                return r10
            L26:
                com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity r1 = com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity.this
                java.util.ArrayList r1 = r1.Y2()
                java.lang.Object r10 = r1.get(r10)
                com.max.hbcommon.bean.KeyDescObj r10 = (com.max.hbcommon.bean.KeyDescObj) r10
                java.lang.String r10 = r10.getKey()
                java.lang.String r1 = "mPageList[position].key"
                kotlin.jvm.internal.f0.o(r10, r1)
                com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity r10 = com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity.this
                java.lang.String r10 = r10.W2()
                if (r10 == 0) goto L91
                int r1 = r10.hashCode()
                r2 = 51
                if (r1 == r2) goto L6b
                r2 = 1571(0x623, float:2.201E-42)
                if (r1 == r2) goto L62
                r0 = 1598(0x63e, float:2.239E-42)
                if (r1 == r0) goto L54
                goto L91
            L54:
                java.lang.String r0 = "20"
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L91
                com.max.xiaoheihe.module.bbs.post.ui.fragments.a r10 = new com.max.xiaoheihe.module.bbs.post.ui.fragments.a
                r10.<init>()
                goto L96
            L62:
                java.lang.String r1 = "14"
                boolean r10 = r10.equals(r1)
                if (r10 != 0) goto L74
                goto L91
            L6b:
                java.lang.String r1 = "3"
                boolean r10 = r10.equals(r1)
                if (r10 != 0) goto L74
                goto L91
            L74:
                com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment r10 = new com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment
                r10.<init>()
                com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity r1 = com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity.this
                kotlin.Pair[] r0 = new kotlin.Pair[r0]
                java.lang.String r1 = r1.f3()
                java.lang.String r2 = "root_comment_id"
                kotlin.Pair r1 = kotlin.c1.a(r2, r1)
                r0[r8] = r1
                android.os.Bundle r0 = androidx.core.os.e.b(r0)
                r10.setArguments(r0)
                goto L96
            L91:
                com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment r10 = new com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment
                r10.<init>()
            L96:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity.b.getItem(int):androidx.fragment.app.Fragment");
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28788, new Class[]{Object.class}, Integer.TYPE);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28787, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = NormalPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            return f0.g(PostPageFactory.E, key) ? NormalPostPageActivity.this.getString(R.string.post_title) : NormalPostPageActivity.this.getString(R.string.comment);
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28789, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String key = NormalPostPageActivity.this.Y2().get(i10).getKey();
            f0.o(key, "mPageList[position].key");
            if (!f0.g(PostPageFactory.C, key)) {
                NormalPostPageActivity.this.r4(true);
            } else {
                NormalPostPageActivity normalPostPageActivity = NormalPostPageActivity.this;
                normalPostPageActivity.r4(true ^ normalPostPageActivity.Z3());
            }
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostCommentFragment postCommentFragmentA2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28790, new Class[]{View.class}, Void.TYPE).isSupported || (postCommentFragmentA2 = NormalPostPageActivity.this.A2()) == null) {
                return;
            }
            postCommentFragmentA2.z4();
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28791, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = NormalPostPageActivity.this.a3().instantiateItem((ViewGroup) NormalPostPageActivity.this.q3(), NormalPostPageActivity.this.q3().getCurrentItem());
            f0.o(objInstantiateItem, "mPagerAdapter.instantiat…tem(mVp, mVp.currentItem)");
            if (objInstantiateItem instanceof PostCommentFragment) {
                ((PostCommentFragment) objInstantiateItem).G6();
                NormalPostPageActivity.this.I4 = 0;
                NormalPostPageActivity.this.J4 = PostPageFactory.I;
                NormalPostPageActivity.p5(NormalPostPageActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostCommentFragment postCommentFragmentO5;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28792, new Class[]{View.class}, Void.TYPE).isSupported || (postCommentFragmentO5 = NormalPostPageActivity.o5(NormalPostPageActivity.this)) == null) {
                return;
            }
            postCommentFragmentO5.D4();
        }
    }

    /* JADX INFO: compiled from: NormalPostPageActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28793, new Class[]{View.class}, Void.TYPE).isSupported || NormalPostPageActivity.this.V2() == null) {
                return;
            }
            LinkInfoObj linkInfoObjV2 = NormalPostPageActivity.this.V2();
            f0.m(linkInfoObjV2);
            if (linkInfoObjV2.getForward() != null) {
                LinkInfoObj linkInfoObjV3 = NormalPostPageActivity.this.V2();
                f0.m(linkInfoObjV3);
                if (linkInfoObjV3.getForward().getIs_deleted() != null) {
                    LinkInfoObj linkInfoObjV4 = NormalPostPageActivity.this.V2();
                    f0.m(linkInfoObjV4);
                    if (f0.g("1", linkInfoObjV4.getForward().getIs_deleted())) {
                        com.max.hbutils.utils.c.f("原贴已被删除，无法转发");
                        return;
                    }
                }
            }
            PostCommentFragment postCommentFragmentO5 = NormalPostPageActivity.o5(NormalPostPageActivity.this);
            if (postCommentFragmentO5 != null) {
                postCommentFragmentO5.E4();
            }
        }
    }

    public static final /* synthetic */ PostCommentFragment o5(NormalPostPageActivity normalPostPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{normalPostPageActivity}, null, changeQuickRedirect, true, 28779, new Class[]{NormalPostPageActivity.class}, PostCommentFragment.class);
        return patchProxyResultProxy.isSupported ? (PostCommentFragment) patchProxyResultProxy.result : normalPostPageActivity.s5();
    }

    public static final /* synthetic */ void p5(NormalPostPageActivity normalPostPageActivity) {
        if (PatchProxy.proxy(new Object[]{normalPostPageActivity}, null, changeQuickRedirect, true, 28780, new Class[]{NormalPostPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        normalPostPageActivity.t5();
    }

    private final PostCommentFragment s5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28760, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.E, Y2().get(i10).getKey())) {
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

    private final void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28778, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.J4;
        int iHashCode = str.hashCode();
        if (iHashCode != 1816285770) {
            if (iHashCode != 1817417828) {
                if (iHashCode == 1934989897 && str.equals(PostPageFactory.K)) {
                    this.f66616q.setTitle(getString(R.string.back_to_top));
                }
            } else if (str.equals(PostPageFactory.I)) {
                this.f66616q.setTitle(u3());
            }
        } else if (str.equals(PostPageFactory.J)) {
            this.f66616q.setTitle(getString(R.string.comment));
        }
        this.f66616q.getAppbarTitleTextView().setOnClickListener(new e());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    private final void u5() {
        boolean z10;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28761, new Class[0], Void.TYPE).isSupported) {
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
            this.f66616q.setActionIconOnClickListener(new f());
        }
        if (H3().getEnableShare()) {
            H3().setShareOnClickListener(new g());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    @dl.e
    public PostCommentFragment A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28771, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = Y2().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.E, Y2().get(i10).getKey())) {
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28772, new Class[0], BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : s5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public boolean L1() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28767, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I4(new b(getSupportFragmentManager()));
        q3().setOnPageChangeListener(new c());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (!PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 28775, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported && isActive()) {
            H3().setEditAddCY(false);
            H3().setCYIconColor(R.color.text_secondary_1_color);
            PostCommentFragment postCommentFragmentS5 = s5();
            if (postCommentFragmentS5 != null && postCommentFragmentS5.isActive()) {
                T3(postCommentFragmentS5, bBSFloorCommentObj);
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
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void c4(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        boolean z10;
        BBSUserInfoObj user;
        BBSUserInfoObj user2;
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 28764, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
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
                if (((linkInfoObjV2 == null || (user2 = linkInfoObjV2.getUser()) == null) ? null : user2.getUserid()) != null) {
                    LinkInfoObj linkInfoObjV3 = V2();
                    f0.m(linkInfoObjV3);
                    BBSUserInfoObj user3 = linkInfoObjV3.getUser();
                    f0.m(user3);
                    String userid = user3.getUserid();
                    f0.m(userid);
                    q4(userid);
                }
                LinkInfoObj linkInfoObjV4 = V2();
                G4(linkInfoObjV4 != null ? linkInfoObjV4.getLink_tag() : null);
                PostPageFactory.PostType postTypeW3 = w3();
                if (postTypeW3 == PostPageFactory.PostType.NORMAL) {
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
                if (f0.g("3", W2()) || f0.g("14", W2())) {
                    String strI = com.max.xiaoheihe.module.account.utils.c.i();
                    LinkInfoObj linkInfoObjV6 = V2();
                    if (f0.g(strI, (linkInfoObjV6 == null || (user = linkInfoObjV6.getUser()) == null) ? null : user.getUserid())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                H3().setCollectBtnVisible(!z10);
                H3().setLikeBtnVisible((f0.g("20", W2()) || f0.g("3", W2()) || f0.g("14", W2())) ? false : true);
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH4 = H3();
                LinkInfoObj linkInfoObjV7 = V2();
                bottomEditorBarPostPageImplH4.x(n.q(linkInfoObjV7 != null ? linkInfoObjV7.getComment_num() : null));
                LinkInfoObj linkInfoObjV8 = V2();
                k(linkInfoObjV8 != null ? linkInfoObjV8.getDisable_comment() : null);
                l2();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH5 = H3();
                LinkInfoObj linkInfoObjV9 = V2();
                String link_award_num = linkInfoObjV9 != null ? linkInfoObjV9.getLink_award_num() : null;
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
        String str3;
        if (PatchProxy.proxy(new Object[]{fragment, new Integer(i10), str, str2}, this, changeQuickRedirect, false, 28777, new Class[]{Fragment.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            str3 = PostPageFactory.I;
        } else {
            int i11 = this.I4 + i10;
            this.I4 = i11;
            str3 = i11 > ViewUtils.J(this.f66601b) ? PostPageFactory.K : PostPageFactory.J;
        }
        if (f0.g(str3, this.J4)) {
            return;
        }
        this.J4 = str3;
        t5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28773, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28766, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28765, new Class[0], Void.TYPE).isSupported || (postCommentFragmentA2 = A2()) == null) {
            return;
        }
        postCommentFragmentA2.C4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28776, new Class[0], Void.TYPE).isSupported) {
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
        this.f66616q.setTitle(u3());
        u5();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28762, new Class[0], Void.TYPE).isSupported) {
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
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28770, new Class[0], Void.TYPE).isSupported && i0.e(this.f66601b) && isActive() && V2() != null) {
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
            PostCommentFragment postCommentFragmentA2 = A2();
            if (postCommentFragmentA2 != null) {
                postCommentFragmentA2.c5();
                if (!U3()) {
                    postCommentFragmentA2.d5();
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
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28774, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || M3()) {
            return;
        }
        H3().d0(str, new d());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28769, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28763, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().A0();
        H3().setEnableComment(false);
        O3();
    }
}
