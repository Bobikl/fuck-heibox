package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.lifecycle.j0;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.l;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ComboObj;
import com.max.xiaoheihe.bean.bbs.ImageInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment;
import com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import df.hb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.f131255t1)
@t0({"SMAP\nGameMaterialPostPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialPostPageFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialPostPageFragment\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,504:1\n29#2:505\n5#2,2:506\n22#2:508\n7#2:509\n*S KotlinDebug\n*F\n+ 1 GameMaterialPostPageFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialPostPageFragment\n*L\n173#1:505\n173#1:506,2\n173#1:508\n173#1:509\n*E\n"})
@o(parameters = 0)
public final class GameMaterialPostPageFragment extends BasePostPageFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f87567g4 = 8;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public hb f87568e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @dl.e
    private ImageInfoObj f87569f4;

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class a extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37757, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : GameMaterialPostPageFragment.q7(GameMaterialPostPageFragment.this).size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37756, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = ((KeyDescObj) GameMaterialPostPageFragment.q7(GameMaterialPostPageFragment.this).get(i10)).getKey();
            f0.o(key, "mPageList[position].key");
            return f0.g(PostPageFactory.H, key) ? new PostGameMaterialFragment() : new PostCommentFragment();
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37759, new Class[]{Object.class}, Integer.TYPE);
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
            String comment_num;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37758, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String key = ((KeyDescObj) GameMaterialPostPageFragment.q7(GameMaterialPostPageFragment.this).get(i10)).getKey();
            f0.o(key, "mPageList.get(position).key");
            if (f0.g(PostPageFactory.H, key)) {
                return GameMaterialPostPageFragment.this.getString(R.string.game_details);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(GameMaterialPostPageFragment.this.getString(R.string.comment) + ' ');
            LinkInfoObj linkInfoObjP7 = GameMaterialPostPageFragment.p7(GameMaterialPostPageFragment.this);
            if (linkInfoObjP7 != null && (comment_num = linkInfoObjP7.getComment_num()) != null) {
                spannableStringBuilder.append((CharSequence) comment_num);
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.71428573f), 2, spannableStringBuilder.length(), 34);
            return spannableStringBuilder;
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class b implements j0<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d dVar) {
            if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 37761, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(dVar);
        }

        public final void b(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d dVar) {
            if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 37760, new Class[]{com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMaterialPostPageFragment.this.j6(dVar.e(), dVar.f());
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class c implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37763, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            LinkInfoObj linkInfoObjP7;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37762, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkInfoObj linkInfoObjP8 = GameMaterialPostPageFragment.p7(GameMaterialPostPageFragment.this);
            if (linkInfoObjP8 != null && linkInfoObjP8.getComment_num() != null && (linkInfoObjP7 = GameMaterialPostPageFragment.p7(GameMaterialPostPageFragment.this)) != null) {
                linkInfoObjP7.setComment_num(str);
            }
            GameMaterialPostPageFragment.u7(GameMaterialPostPageFragment.this, str);
            GameMaterialPostPageFragment.this.w7().f111379i.setupWithViewPager(GameMaterialPostPageFragment.this.w7().f111382l);
            SlidingTabLayout slidingTabLayoutS7 = GameMaterialPostPageFragment.s7(GameMaterialPostPageFragment.this);
            if (slidingTabLayoutS7 != null) {
                slidingTabLayoutS7.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BasePostFragment basePostFragmentN7;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37764, new Class[]{View.class}, Void.TYPE).isSupported || (basePostFragmentN7 = GameMaterialPostPageFragment.n7(GameMaterialPostPageFragment.this)) == null) {
                return;
            }
            basePostFragmentN7.z4();
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BasePostFragment basePostFragmentN7;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37765, new Class[]{View.class}, Void.TYPE).isSupported || (basePostFragmentN7 = GameMaterialPostPageFragment.n7(GameMaterialPostPageFragment.this)) == null) {
                return;
            }
            basePostFragmentN7.E4();
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37766, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = GameMaterialPostPageFragment.r7(GameMaterialPostPageFragment.this).instantiateItem((ViewGroup) GameMaterialPostPageFragment.this.D5(), GameMaterialPostPageFragment.this.D5().getCurrentItem());
            f0.o(objInstantiateItem, "mPagerAdapter.instantiat…tem(mVp, mVp.currentItem)");
            if (objInstantiateItem instanceof PostGameMaterialFragment) {
                GameMaterialPostPageFragment.this.D5().setCurrentItem(1);
            } else if (objInstantiateItem instanceof PostCommentFragment) {
                ((PostCommentFragment) objInstantiateItem).F6();
            }
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class g implements j0<l<? extends Result<ComboObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(l<? extends Result<ComboObj>> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 37768, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(lVar);
        }

        public final void b(l<? extends Result<ComboObj>> lVar) {
            Result<ComboObj> resultA;
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 37767, new Class[]{l.class}, Void.TYPE).isSupported || (resultA = lVar.a()) == null) {
                return;
            }
            GameMaterialPostPageFragment gameMaterialPostPageFragment = GameMaterialPostPageFragment.this;
            if (!com.max.hbcommon.utils.c.u(resultA.getMsg())) {
                com.max.hbutils.utils.c.f(resultA.getMsg());
            }
            ComboObj result = resultA.getResult();
            if (result == null || !com.max.hbcommon.utils.c.x(result.is_max_charge())) {
                return;
            }
            com.max.hbutils.utils.c.f(result.getMsg());
            String string = GameMaterialPostPageFragment.t7(gameMaterialPostPageFragment).getChargeText().toString();
            if (f0.g("", string)) {
                string = "0";
            }
            GameMaterialPostPageFragment.t7(gameMaterialPostPageFragment).setChargeBtnText(String.valueOf(Math.max(0, Integer.parseInt(string) - 1)));
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class h implements j0<l<? extends Result<ComboObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(l<? extends Result<ComboObj>> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 37770, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(lVar);
        }

        public final void b(l<? extends Result<ComboObj>> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 37769, new Class[]{l.class}, Void.TYPE).isSupported || lVar.a() == null) {
                return;
            }
            GameMaterialPostPageFragment.this.s6();
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class i implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 37771, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "drawable");
            GameMaterialPostPageFragment.this.w7().f111376f.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 37772, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "drawable");
        }
    }

    /* JADX INFO: compiled from: GameMaterialPostPageFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87580c;

        j(String str) {
            this.f87580c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37773, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
            Activity mContext = ((com.max.hbcommon.base.d) GameMaterialPostPageFragment.this).mContext;
            f0.o(mContext, "mContext");
            ImageViewerHelper.a aVarA = companion.a(mContext);
            ImageView imageView = GameMaterialPostPageFragment.this.w7().f111376f;
            f0.o(imageView, "mBinding.ivSolo");
            aVarA.m(companion.d(imageView, 0), new String[]{this.f87580c}).p();
        }
    }

    private final void A7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37736, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().x(n.q(str));
        O5().getEditor().setHint(O5().getDefaultEditTextHint());
    }

    private final void B7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37733, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<BBSTextObj> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        LinkInfoObj linkInfoObjP5 = p5();
        List<BBSTextObj> listB = k.b(linkInfoObjP5 != null ? linkInfoObjP5.getText() : null, BBSTextObj.class);
        if (!com.max.hbcommon.utils.c.w(listB)) {
            for (BBSTextObj bBSTextObj : listB) {
                if (bBSTextObj != null) {
                    if (f0.g("text", bBSTextObj.getType())) {
                        arrayList.add(bBSTextObj.getText());
                    } else if (f0.g(SocialConstants.PARAM_IMG_URL, bBSTextObj.getType())) {
                        arrayList2.add(bBSTextObj);
                    } else if (f0.g("game_card", bBSTextObj.getType()) && !com.max.hbcommon.utils.c.u(bBSTextObj.getAppid())) {
                        arrayList3.add(bBSTextObj.getAppid());
                    }
                }
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList2)) {
            w7().f111377g.setVisibility(8);
            return;
        }
        if (arrayList2.size() != 1 || this.f87569f4 == null) {
            w7().f111376f.setVisibility(8);
            w7().f111377g.setVisibility(0);
            w7().f111377g.n(arrayList2);
        } else {
            w7().f111377g.setVisibility(8);
            w7().f111376f.setVisibility(0);
            z7(arrayList2.get(0).getUrl());
        }
    }

    public static final /* synthetic */ BasePostFragment n7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37752, new Class[]{GameMaterialPostPageFragment.class}, BasePostFragment.class);
        return patchProxyResultProxy.isSupported ? (BasePostFragment) patchProxyResultProxy.result : gameMaterialPostPageFragment.v7();
    }

    public static final /* synthetic */ LinkInfoObj p7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37749, new Class[]{GameMaterialPostPageFragment.class}, LinkInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LinkInfoObj) patchProxyResultProxy.result : gameMaterialPostPageFragment.p5();
    }

    public static final /* synthetic */ ArrayList q7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37754, new Class[]{GameMaterialPostPageFragment.class}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : gameMaterialPostPageFragment.s5();
    }

    public static final /* synthetic */ androidx.viewpager.widget.a r7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37755, new Class[]{GameMaterialPostPageFragment.class}, androidx.viewpager.widget.a.class);
        return patchProxyResultProxy.isSupported ? (androidx.viewpager.widget.a) patchProxyResultProxy.result : gameMaterialPostPageFragment.t5();
    }

    public static final /* synthetic */ SlidingTabLayout s7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37751, new Class[]{GameMaterialPostPageFragment.class}, SlidingTabLayout.class);
        return patchProxyResultProxy.isSupported ? (SlidingTabLayout) patchProxyResultProxy.result : gameMaterialPostPageFragment.x5();
    }

    public static final /* synthetic */ BottomEditorBarPostPageImpl t7(GameMaterialPostPageFragment gameMaterialPostPageFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment}, null, changeQuickRedirect, true, 37753, new Class[]{GameMaterialPostPageFragment.class}, BottomEditorBarPostPageImpl.class);
        return patchProxyResultProxy.isSupported ? (BottomEditorBarPostPageImpl) patchProxyResultProxy.result : gameMaterialPostPageFragment.O5();
    }

    public static final /* synthetic */ void u7(GameMaterialPostPageFragment gameMaterialPostPageFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameMaterialPostPageFragment, str}, null, changeQuickRedirect, true, 37750, new Class[]{GameMaterialPostPageFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialPostPageFragment.A7(str);
    }

    private final BasePostFragment v7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37747, new Class[0], BasePostFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (BasePostFragment) patchProxyResultProxy.result;
        }
        int size = s5().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.H, s5().get(i10).getKey())) {
                Object objInstantiateItem = t5().instantiateItem((ViewGroup) w7().f111382l, i10);
                f0.o(objInstantiateItem, "mPagerAdapter.instantiateItem(mBinding.vp, i)");
                if (objInstantiateItem instanceof BasePostFragment) {
                    return (BasePostFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    private final void x7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37735, new Class[0], Void.TYPE).isSupported || p5() == null) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO5 = O5();
        LinkInfoObj linkInfoObjP5 = p5();
        bottomEditorBarPostPageImplO5.setChargeBtnVisible(f0.g("1", linkInfoObjP5 != null ? linkInfoObjP5.getIs_article() : null));
        O5().setLikeBtnVisible(!f0.g("20", q5()));
        LinkInfoObj linkInfoObjP6 = p5();
        A7(linkInfoObjP6 != null ? linkInfoObjP6.getComment_num() : null);
        LinkInfoObj linkInfoObjP7 = p5();
        k(linkInfoObjP7 != null ? linkInfoObjP7.getDisable_comment() : null);
        S4();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO6 = O5();
        LinkInfoObj linkInfoObjP8 = p5();
        String link_award_num = linkInfoObjP8 != null ? linkInfoObjP8.getLink_award_num() : null;
        if (link_award_num == null) {
            link_award_num = "0";
        } else {
            f0.o(link_award_num, "mLinkInfoObj?.link_award_num ?: \"0\"");
        }
        bottomEditorBarPostPageImplO6.setLikeBtnText(link_award_num);
        W5();
        O5().setHideAddImg(false);
        if (O5().getHideAddImg()) {
            O5().setAddImgVisible(false);
        }
    }

    private final void z7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37734, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.heybox.gamematerial.ui.e.b(this.mContext, w7().f111376f, ViewUtils.L(getContext()), this.f87569f4);
        w7().f111376f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.max.hbimage.b.X(getContext(), w7().f111376f, str, new i());
        w7().f111376f.setOnClickListener(new j(str));
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37738, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C6(false);
        if (ad.a.a(ad.a.E, false)) {
            BasePostFragment basePostFragmentV7 = v7();
            if (basePostFragmentV7 != null) {
                basePostFragmentV7.x4();
                return;
            }
            return;
        }
        BasePostFragment basePostFragmentV8 = v7();
        if (basePostFragmentV8 != null) {
            basePostFragmentV8.w4();
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void P4() {
        BasePostFragment basePostFragmentV7;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37737, new Class[0], Void.TYPE).isSupported || (basePostFragmentV7 = v7()) == null) {
            return;
        }
        basePostFragmentV7.C4();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void Q5(@dl.d Bundle arguments) {
        if (PatchProxy.proxy(new Object[]{arguments}, this, changeQuickRedirect, false, 37725, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arguments, "arguments");
        super.Q5(arguments);
        Serializable serializable = arguments.getSerializable(PostPageFactory.f81481q);
        if (serializable instanceof ImageInfoObj) {
            this.f87569f4 = (ImageInfoObj) serializable;
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void R2(int i10) {
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void R4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37742, new Class[0], Void.TYPE).isSupported && i0.e(this.mContext) && isActive() && p5() != null) {
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
            BasePostFragment basePostFragmentV7 = v7();
            if (basePostFragmentV7 != null) {
                basePostFragmentV7.c5();
                if (!b6()) {
                    basePostFragmentV7.d5();
                }
            }
            z6(true);
            if (O5().E0() && !f0.g(a5(), i0.j())) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(O5(), true, false, 2, null);
                String string = O5().getChargeText().toString();
                O5().setChargeBtnText((f0.g("", string) ? "0" : Integer.valueOf(Integer.parseInt(string) + 1)).toString());
            }
            G5().i(o5(), n5());
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        hb hbVarC = hb.c(this.mInflater);
        f0.o(hbVarC, "inflate(mInflater)");
        y7(hbVarC);
        setContentView(w7());
        BaseBottomEditorBar bottomEditorBar = w7().f111380j.getInstance();
        f0.n(bottomEditorBar, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl");
        h7((BottomEditorBarPostPageImpl) bottomEditorBar);
        ViewPagerFixed viewPagerFixed = w7().f111382l;
        f0.o(viewPagerFixed, "mBinding.vp");
        X6(viewPagerFixed);
        FrameLayout frameLayout = w7().f111381k;
        f0.o(frameLayout, "mBinding.vgWebFullscreen");
        U6(frameLayout);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37740, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N6(new a(getChildFragmentManager()));
        D5().setAdapter(t5());
        w7().f111379i.setupWithViewPager(w7().f111382l);
        w7().f111379i.getLayoutParams().width = ViewUtils.f(this.mContext, 150.0f);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void Z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.Z5();
        this.mTitleBar.setContentView(com.max.xiaoheihe.utils.d.r0(this.mContext));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37723, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        U5();
        G5().k().k(this, new b());
        G5().o().k(this, new c());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    @dl.e
    public PostCommentFragment b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37748, new Class[0], PostCommentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCommentFragment) patchProxyResultProxy.result;
        }
        int size = s5().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(PostPageFactory.G, s5().get(i10).getKey())) {
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

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void d3(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 37727, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        G5().p(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37726, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d3(null, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", null);
        G5().s();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void h0(@dl.d LinkInfoObj linkInfoObj, @dl.d Map<String, String> params, @dl.d yh.l<? super Boolean, b2> callback) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, params, callback}, this, changeQuickRedirect, false, 37746, new Class[]{LinkInfoObj.class, Map.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkInfoObj, "linkInfoObj");
        f0.p(params, "params");
        f0.p(callback, "callback");
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void i6(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        String comment_num;
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 37744, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().setEditAddCY(false);
        O5().setCYIconColor(R.color.text_secondary_1_color);
        PostCommentFragment postCommentFragmentB5 = b5();
        if (postCommentFragmentB5 != null && postCommentFragmentB5.isActive()) {
            a6(postCommentFragmentB5, bBSFloorCommentObj);
        }
        LinkInfoObj linkInfoObjP5 = p5();
        if (linkInfoObjP5 != null && (comment_num = linkInfoObjP5.getComment_num()) != null) {
            LinkInfoObj linkInfoObjP6 = p5();
            if (linkInfoObjP6 != null) {
                linkInfoObjP6.setComment_num(String.valueOf(n.q(comment_num) + 1));
            }
            G5().A(String.valueOf(n.q(comment_num) + 1));
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37724, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        V5();
        l6();
        Y5();
        m6();
        g5();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void j6(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        String name;
        String comment_num;
        BBSUserInfoObj user;
        BBSUserInfoObj user2;
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 37732, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
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
                if ((linkInfoObjP5 != null ? linkInfoObjP5.getUser() : null) != null) {
                    LinkInfoObj linkInfoObjP6 = p5();
                    if (((linkInfoObjP6 == null || (user2 = linkInfoObjP6.getUser()) == null) ? null : user2.getUserid()) != null) {
                        LinkInfoObj linkInfoObjP7 = p5();
                        String userid = (linkInfoObjP7 == null || (user = linkInfoObjP7.getUser()) == null) ? null : user.getUserid();
                        if (userid == null) {
                            userid = "";
                        }
                        v6(userid);
                    }
                }
                LinkInfoObj linkInfoObjP8 = p5();
                L6(linkInfoObjP8 != null ? linkInfoObjP8.getLink_tag() : null);
                n6();
                x7();
            }
        }
        LinkInfoObj linkInfoObjP9 = p5();
        if (linkInfoObjP9 != null && (comment_num = linkInfoObjP9.getComment_num()) != null) {
            G5().A(comment_num);
        }
        BasePostFragment basePostFragmentV7 = v7();
        if (basePostFragmentV7 != null && basePostFragmentV7.isActive()) {
            basePostFragmentV7.A4(result);
        }
        PostCommentFragment postCommentFragmentB5 = b5();
        String str2 = "onGetLinkTreeCompleted, commentsFragment = " + postCommentFragmentB5 + ", linkTreeResult = " + result;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialPostPageFragment.class.isAnonymousClass()) {
            name = GameMaterialPostPageFragment.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialPostPageFragment.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str2);
        aVar.q(sb2.toString());
        if (postCommentFragmentB5 != null && postCommentFragmentB5.isActive()) {
            postCommentFragmentB5.A4(result);
            postCommentFragmentB5.E5().f112961v.getRoot().setVisibility(8);
        }
        B7();
        showContentView();
        L4();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment, kf.a
    public void l(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37745, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.l(str, z10);
        if (T5()) {
            return;
        }
        O5().d0(str, new d());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void l6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37730, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.l6();
        O5().setShareBtnVisible(true);
        O5().setShareOnClickListener(new e());
        O5().setCollectBtnVisible(false);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void m6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37743, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(PostPageFactory.H);
        arrayList.add(keyDescObj);
        if (c5()) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(PostPageFactory.G);
            arrayList.add(keyDescObj2);
            w6(true);
        }
        O5().setEnableComment(c5());
        if (O5().getEnableComment()) {
            O5().setCommentOnClickListener(new f());
        }
        s5().clear();
        s5().addAll(arrayList);
        t5().notifyDataSetChanged();
        if (com.max.hbcommon.utils.c.u(v5())) {
            return;
        }
        m0(null);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void n6() {
    }

    @Override // kf.a
    public void p1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37739, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C6(false);
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37731, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.registerEvents();
        G5().n().k(this, new g());
        G5().m().k(this, new h());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment
    public void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37741, new Class[0], Void.TYPE).isSupported) {
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
        BasePostFragment basePostFragmentV7 = v7();
        if (basePostFragmentV7 != null) {
            basePostFragmentV7.n5();
        }
    }

    @dl.d
    public final hb w7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37721, new Class[0], hb.class);
        if (patchProxyResultProxy.isSupported) {
            return (hb) patchProxyResultProxy.result;
        }
        hb hbVar = this.f87568e4;
        if (hbVar != null) {
            return hbVar;
        }
        f0.S("mBinding");
        return null;
    }

    public final void y7(@dl.d hb hbVar) {
        if (PatchProxy.proxy(new Object[]{hbVar}, this, changeQuickRedirect, false, 37722, new Class[]{hb.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hbVar, "<set-?>");
        this.f87568e4 = hbVar;
    }
}
