package com.max.hbexpression;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojiItemtObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbexpression.widget.ExpressionViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ExpressionShowFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends Fragment implements q {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExpressionViewPager f70213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f70214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f70215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70216e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f70218g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f70217f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<com.max.hbexpression.a> f70219h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f70220i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f70221j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70222k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f70223l = new b();

    /* JADX INFO: compiled from: ExpressionShowFragment.java */
    public class a implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.R0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int childCount = n.this.f70215d.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (n.this.f70215d.getChildAt(i10) == view) {
                    n.this.f70215d.getChildAt(i10).setBackgroundColor(n.N3(n.this));
                    n.this.f70213b.setCurrentItem(i10, false);
                } else {
                    n.this.f70215d.getChildAt(i10).setBackgroundColor(n.P3(n.this));
                }
            }
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragment.java */
    public static class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList<com.max.hbexpression.a> f70226l;

        public c(FragmentManager fragmentManager, ArrayList<com.max.hbexpression.a> arrayList) {
            super(fragmentManager);
            this.f70226l = arrayList;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.U0, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ArrayList<com.max.hbexpression.a> arrayList = this.f70226l;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.T0, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : this.f70226l.get(i10);
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.S0, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : mc.a.b()[i10];
        }
    }

    static /* synthetic */ int N3(n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, bb.c.g.P0, new Class[]{n.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : nVar.R3();
    }

    static /* synthetic */ int P3(n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, bb.c.g.Q0, new Class[]{n.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : nVar.S3();
    }

    private int R3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.H0, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!this.f70220i) {
            return androidx.core.content.d.f(getContext(), R.color.divider_secondary_2_color);
        }
        String str = this.f70221j;
        return str != null ? Color.parseColor(str) : androidx.core.content.d.f(getContext(), R.color.divider_secondary_2_dark_not_change_color);
    }

    private int S3() {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.I0, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Context context = getContext();
        if (this.f70220i) {
            i10 = this.f70221j != null ? R.color.transparent : R.color.background_layer_2_dark_not_change_color;
        } else {
            i10 = R.color.background_layer_2_color;
        }
        return androidx.core.content.d.f(context, i10);
    }

    private void T3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.J0, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f70213b = (ExpressionViewPager) view.findViewById(R.id.vp_expression);
        this.f70214c = (ViewGroup) view.findViewById(R.id.ll_emoji_root);
        this.f70215d = (ViewGroup) view.findViewById(R.id.vg_pack);
        this.f70216e = ViewUtils.f(getContext(), 237.0f);
        if (this.f70222k) {
            return;
        }
        q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V3(WeakReference weakReference, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{weakReference, valueAnimator}, null, changeQuickRedirect, true, bb.c.g.O0, new Class[]{WeakReference.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup viewGroup = (ViewGroup) weakReference.get();
        if (viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = iIntValue;
        viewGroup.setLayoutParams(layoutParams);
    }

    public static n W3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.C0, new Class[]{Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putBoolean(e.f70194a, z10);
        nVar.setArguments(bundle);
        return nVar;
    }

    private void X3() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.G0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EmojisListResultObj emojisListResultObj = f.f70195a;
        if (emojisListResultObj != null) {
            for (EmojiGroupObj emojiGroupObj : emojisListResultObj.getEmoji_groups()) {
                if (!com.max.hbcommon.utils.c.w(emojiGroupObj.getEmojis())) {
                    String type = emojiGroupObj.getType();
                    int i11 = "2".equals(type) ? 8 : 20;
                    ArrayList arrayList = new ArrayList();
                    int size = emojiGroupObj.getEmojis().size() / i11;
                    if (size < 1) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<EmojiItemtObj> it = emojiGroupObj.getEmojis().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(f.c(emojiGroupObj, it.next()));
                        }
                        arrayList.add(arrayList2);
                    } else {
                        if (emojiGroupObj.getEmojis().size() % i11 != 0) {
                            size++;
                        }
                        int i12 = 0;
                        while (i12 < size) {
                            ArrayList arrayList3 = new ArrayList();
                            int i13 = i11 * i12;
                            while (true) {
                                i10 = i12 + 1;
                                if (i13 < i11 * i10) {
                                    if (i13 >= 0 && i13 < emojiGroupObj.getEmojis().size()) {
                                        arrayList3.add(f.c(emojiGroupObj, emojiGroupObj.getEmojis().get(i13)));
                                    }
                                    i13++;
                                }
                            }
                            arrayList.add(arrayList3);
                            i12 = i10;
                        }
                    }
                    d dVarW3 = d.W3(arrayList, type);
                    String str = this.f70221j;
                    if (str != null) {
                        dVarW3.S3(str);
                    }
                    this.f70219h.add(dVarW3);
                }
            }
        }
        this.f70213b.setOffscreenPageLimit(2);
        c cVar = new c(getChildFragmentManager(), this.f70219h);
        this.f70218g = cVar;
        this.f70213b.setAdapter(cVar);
        this.f70213b.setScanScroll(false);
        this.f70213b.setOnPageChangeListener(new a());
        this.f70213b.setCurrentItem(0, false);
        Context context = getContext();
        for (int i14 = 0; i14 < this.f70219h.size(); i14++) {
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 42.0f), -1);
            ImageView imageView = new ImageView(context);
            EmojiGroupObj emojiGroupObj2 = f.f70195a.getEmoji_groups().get(i14);
            String group_img = emojiGroupObj2.getGroup_img();
            ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
            if (expressionAssetManager.u(emojiGroupObj2.getGroup_code(), emojiGroupObj2.getGroup_code())) {
                Glide.G(imageView).b(expressionAssetManager.i(emojiGroupObj2.getGroup_code(), emojiGroupObj2.getGroup_code())).C1(imageView);
            } else {
                f.h(emojiGroupObj2.getGroup_code(), emojiGroupObj2.getGroup_code(), emojiGroupObj2.getGroup_img());
                com.max.hbimage.b.K(group_img, imageView);
            }
            if (i14 == 0) {
                frameLayout.setBackgroundColor(R3());
            } else {
                frameLayout.setBackgroundColor(S3());
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(context, 22.0f), ViewUtils.f(context, 22.0f));
            layoutParams2.gravity = 17;
            frameLayout.addView(imageView, layoutParams2);
            frameLayout.setOnClickListener(this.f70223l);
            this.f70215d.addView(frameLayout, layoutParams);
        }
    }

    @Override // com.max.hbexpression.q
    public void C() {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.N0, new Class[0], Void.TYPE).isSupported || (viewGroup = this.f70214c) == null) {
            return;
        }
        this.f70222k = true;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = 0;
        this.f70214c.setLayoutParams(layoutParams);
    }

    @Override // com.max.hbexpression.q
    public void L1(boolean z10) {
        this.f70220i = z10;
    }

    @Override // com.max.hbexpression.q
    public void N1(@p0 String str) {
        this.f70221j = str;
    }

    @Override // com.max.hbexpression.q
    @androidx.annotation.n0
    public Fragment P() {
        return this;
    }

    @p0
    public String Q3() {
        return this.f70221j;
    }

    public boolean U3() {
        return this.f70220i;
    }

    @Override // com.max.hbexpression.q
    public void b2(@androidx.annotation.n0 yh.a<Boolean> aVar) {
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.g.D0, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.hbexpression_show_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.F0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.f70219h.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.g.E0, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.f70217f = getArguments().getBoolean(e.f70194a, false);
        }
        T3(view);
        X3();
        if (this.f70217f) {
            v2();
        }
    }

    @Override // com.max.hbexpression.q
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.M0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f70216e);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        final WeakReference weakReference = new WeakReference(this.f70214c);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbexpression.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n.V3(weakReference, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    @Override // com.max.hbexpression.q
    public void q2() {
        ExpressionViewPager expressionViewPager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.L0, new Class[0], Void.TYPE).isSupported || (expressionViewPager = this.f70213b) == null) {
            return;
        }
        expressionViewPager.setCurrentItem(0, false);
        this.f70213b.setScanScroll(false);
        for (int i10 = 0; i10 < this.f70219h.size(); i10++) {
            this.f70215d.getChildAt(i10).setVisibility(0);
        }
    }

    @Override // com.max.hbexpression.q
    public void v2() {
        ExpressionViewPager expressionViewPager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.K0, new Class[0], Void.TYPE).isSupported || (expressionViewPager = this.f70213b) == null) {
            return;
        }
        expressionViewPager.setCurrentItem(0, false);
        this.f70213b.setScanScroll(false);
        for (int i10 = 0; i10 < this.f70219h.size(); i10++) {
            if ("2".equals(this.f70219h.get(i10).O3())) {
                this.f70215d.getChildAt(i10).setVisibility(8);
            } else {
                this.f70215d.getChildAt(i10).setVisibility(0);
            }
        }
    }
}
