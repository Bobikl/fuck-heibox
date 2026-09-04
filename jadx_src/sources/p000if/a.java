package p000if;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PlatformCardBgObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GradualColorPageTransformer.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a implements HBViewPager2.l {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    public static final C1088a f119351q = new C1088a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f119352r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @d
    public static final String f119353s = "GCPageTransformer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private ViewGroup f119354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private List<PlatformCardBgObj> f119355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private HBViewPager2 f119356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private ImageView f119357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private ImageView f119358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private ImageView f119359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private ImageView f119360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private View f119361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private View f119362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private ViewGroup f119363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private ViewGroup f119364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final WeakReference<VideoViewX> f119365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f119366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f119367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f119368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f119369p;

    /* JADX INFO: renamed from: if.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GradualColorPageTransformer.kt */
    public static final class C1088a {
        private C1088a() {
        }

        public /* synthetic */ C1088a(u uVar) {
            this();
        }
    }

    public a(@d ViewGroup vg_bg_container, @d List<PlatformCardBgObj> platformCardBgList, @d HBViewPager2 vp, @e VideoViewX videoViewX) {
        f0.p(vg_bg_container, "vg_bg_container");
        f0.p(platformCardBgList, "platformCardBgList");
        f0.p(vp, "vp");
        this.f119354a = vg_bg_container;
        this.f119355b = platformCardBgList;
        this.f119356c = vp;
        this.f119365l = new WeakReference<>(videoViewX);
        this.f119366m = -1;
        this.f119367n = -1;
        this.f119368o = -1;
        this.f119369p = 150.0f;
        View viewFindViewById = this.f119354a.findViewById(R.id.iv_bottom_bg);
        f0.m(viewFindViewById);
        this.f119357d = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.f119354a.findViewById(R.id.iv_bottom_mask);
        f0.m(viewFindViewById2);
        this.f119358e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = this.f119354a.findViewById(R.id.iv_top_bg);
        f0.m(viewFindViewById3);
        this.f119359f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.f119354a.findViewById(R.id.iv_top_mask);
        f0.m(viewFindViewById4);
        this.f119360g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = this.f119354a.findViewById(R.id.vg_bottom_video);
        f0.o(viewFindViewById5, "vg_bg_container.findViewById(R.id.vg_bottom_video)");
        this.f119363j = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = this.f119354a.findViewById(R.id.vg_top_video);
        f0.o(viewFindViewById6, "vg_bg_container.findViewById(R.id.vg_top_video)");
        this.f119364k = (ViewGroup) viewFindViewById6;
        if (videoViewX != null) {
            videoViewX.setAlpha(0.0f);
            Context context = this.f119354a.getContext();
            f0.o(context, "vg_bg_container.context");
            videoViewX.S(context);
            com.max.video.player.a player = videoViewX.getPlayer();
            if (player != null) {
                player.t(true);
            }
            videoViewX.setBackgroundResource(R.color.dark_blue);
            videoViewX.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private final boolean s(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25118, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Math.abs(i10 - i11) <= 2;
    }

    private final void t(VideoViewX videoViewX, String str) {
        if (PatchProxy.proxy(new Object[]{videoViewX, str}, this, changeQuickRedirect, false, 25114, new Class[]{VideoViewX.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoViewX.setVideoRes(str);
        videoViewX.setFillMode(true);
        videoViewX.H();
        videoViewX.M();
    }

    public final void A(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 25109, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f119359f = imageView;
    }

    public final void B(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 25110, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f119360g = imageView;
    }

    public final void C(@d List<PlatformCardBgObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25105, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f119355b = list;
    }

    public final void D(@d PlatformCardBgObj top, int i10) {
        if (PatchProxy.proxy(new Object[]{top, new Integer(i10)}, this, changeQuickRedirect, false, 25117, new Class[]{PlatformCardBgObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(top, "top");
        if (this.f119367n == i10) {
            return;
        }
        this.f119367n = i10;
        this.f119359f.setVisibility(top.hasBg() ? 0 : 8);
        this.f119360g.setVisibility(top.hasMask() ? 0 : 8);
        b.E(this.f119359f);
        if (top.hasBgUrl()) {
            if (top.getDefaultBgResourceId() == -1) {
                b.K(top.getBgUrl(), this.f119359f);
            } else {
                b.L(top.getBgUrl(), this.f119359f, top.getDefaultBgResourceId());
            }
        } else if (top.hasBgResourceId()) {
            this.f119359f.setImageResource(top.getBgDrawableResourceId());
        } else if (top.getDefaultBgResourceId() != -1) {
            this.f119359f.setImageResource(top.getDefaultBgResourceId());
        }
        b.E(this.f119360g);
        if (top.hasMaskUrl()) {
            if (top.getDefaultMaskResourceId() == -1) {
                b.K(top.getMaskUrl(), this.f119360g);
                return;
            } else {
                b.L(top.getMaskUrl(), this.f119360g, top.getDefaultMaskResourceId());
                return;
            }
        }
        if (top.hasMaskResourceId()) {
            this.f119360g.setImageResource(top.getMaskDrawableResourceId());
        } else if (top.getDefaultMaskResourceId() != -1) {
            this.f119360g.setImageResource(top.getDefaultMaskResourceId());
        }
    }

    public final void E(int i10) {
        this.f119367n = i10;
    }

    public final void F(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 25104, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f119354a = viewGroup;
    }

    public final void G(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 25111, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f119363j = viewGroup;
    }

    public final void H(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 25112, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f119364k = viewGroup;
    }

    public final void I(@d HBViewPager2 hBViewPager2) {
        if (PatchProxy.proxy(new Object[]{hBViewPager2}, this, changeQuickRedirect, false, 25106, new Class[]{HBViewPager2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hBViewPager2, "<set-?>");
        this.f119356c = hBViewPager2;
    }

    public final float a(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25120, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (f10 > 0.5f) {
            return new yb.a(new PointF(0.25f, 0.1f), new PointF(0.25f, 1.0f)).e((f10 - 0.5f) * 2);
        }
        return 0.0f;
    }

    public final int b() {
        return this.f119368o;
    }

    @e
    public final View c() {
        return this.f119361h;
    }

    @e
    public final View d() {
        return this.f119362i;
    }

    @d
    public final ImageView e() {
        return this.f119357d;
    }

    @d
    public final ImageView f() {
        return this.f119358e;
    }

    @d
    public final ImageView g() {
        return this.f119359f;
    }

    @d
    public final ImageView h() {
        return this.f119360g;
    }

    public final float i(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25119, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : new yb.a(new PointF(0.25f, 0.1f), new PointF(0.25f, 1.0f)).e(f10);
    }

    public final int j() {
        return this.f119366m;
    }

    @d
    public final List<PlatformCardBgObj> k() {
        return this.f119355b;
    }

    public final int l(int i10, float f10) {
        Object[] objArr = {new Integer(i10), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25115, new Class[]{cls, Float.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return fi.u.B(this.f119355b.size() - 1, fi.u.u(0, (int) (f10 > 0.0f ? Math.ceil(((double) f10) + ((double) i10)) : Math.floor(((double) f10) + ((double) i10)))));
    }

    public final int m() {
        return this.f119367n;
    }

    @d
    public final ViewGroup n() {
        return this.f119354a;
    }

    @d
    public final ViewGroup o() {
        return this.f119363j;
    }

    @d
    public final ViewGroup p() {
        return this.f119364k;
    }

    @d
    public final WeakReference<VideoViewX> q() {
        return this.f119365l;
    }

    @d
    public final HBViewPager2 r() {
        return this.f119356c;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.l
    public void transformPage(@d View page, float f10) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        if (PatchProxy.proxy(new Object[]{page, new Float(f10)}, this, changeQuickRedirect, false, 25113, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(page, "page");
        float fFloatValue = -1.0f;
        if (f10 < -1.0f || f10 > 1.0f) {
            return;
        }
        try {
            if (page.getTag(R.id.scroll_position) != null) {
                Object tag = page.getTag(R.id.scroll_position);
                f0.n(tag, "null cannot be cast to non-null type kotlin.Float");
                fFloatValue = ((Float) tag).floatValue();
            } else if (f10 > 0.5f) {
                fFloatValue = 1.0f;
            } else if (f10 >= -0.5f) {
                fFloatValue = 0.0f;
            }
            page.setTag(R.id.scroll_position, Float.valueOf(f10));
            Object tag2 = page.getTag(R.id.absolute_position);
            f0.n(tag2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag2).intValue();
            if (f10 < fFloatValue) {
                if (f10 > 0.0f) {
                    i10 = iIntValue;
                    iIntValue = -1;
                } else {
                    i10 = -1;
                }
            } else if (f10 <= fFloatValue) {
                i10 = -1;
                iIntValue = -1;
            } else if (f10 < 0.0f) {
                i10 = iIntValue;
                iIntValue = -1;
            } else {
                i10 = -1;
            }
            if (iIntValue != -1) {
                g.f74531b.M("transformPage currentPosition != -1  currentPosition: " + iIntValue + "  targetPosition: " + i10 + "  topCurrentIndex: " + this.f119367n + "  position: " + f10 + "  bottomCurrentIndex: " + this.f119368o);
                D(this.f119355b.get(iIntValue), iIntValue);
                return;
            }
            if (i10 != -1) {
                g.f74531b.M("transformPage targetPosition != -1  currentPosition: " + iIntValue + "  targetPosition: " + i10 + "  topCurrentIndex: " + this.f119367n + "  position: " + f10 + "  bottomCurrentIndex: " + this.f119368o);
                this.f119369p = this.f119355b.get(i10).getHeight();
                VideoViewX videoViewX = this.f119365l.get();
                if (videoViewX == null || !this.f119355b.get(this.f119367n).hasBgVideoUrl()) {
                    if (videoViewX != null) {
                        videoViewX.setAlpha(0.0f);
                    }
                    this.f119359f.setAlpha(a(Math.abs(f10)));
                } else {
                    this.f119359f.setAlpha(0.0f);
                    videoViewX.setAlpha(a(Math.abs(f10)));
                    if (!f0.g(videoViewX.getParent(), this.f119364k)) {
                        ViewParent parent = videoViewX.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeAllViews();
                        }
                        this.f119364k.addView(videoViewX);
                    }
                    if (!videoViewX.x()) {
                        t(videoViewX, this.f119355b.get(i10).getBgVideoUrl());
                    }
                }
                u(this.f119355b.get(i10), i10);
                this.f119360g.setAlpha(i(Math.abs(f10)));
                if (this.f119361h != null) {
                    int iF = ViewUtils.f(page.getContext(), this.f119369p);
                    View view = this.f119361h;
                    Integer numValueOf = (view == null || (layoutParams4 = view.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams4.height);
                    f0.m(numValueOf);
                    if (s(numValueOf.intValue(), iF)) {
                        return;
                    }
                    View view2 = this.f119361h;
                    Integer numValueOf2 = (view2 == null || (layoutParams3 = view2.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams3.height);
                    f0.m(numValueOf2);
                    if (iF > numValueOf2.intValue()) {
                        View view3 = this.f119361h;
                        layoutParams = view3 != null ? view3.getLayoutParams() : null;
                        if (layoutParams != null) {
                            layoutParams.height = ViewUtils.f(page.getContext(), ((1 - Math.abs(f10)) * (this.f119369p - 150.0f)) + 150.0f);
                        }
                        View view4 = this.f119361h;
                        if (view4 != null) {
                            view4.setLayoutParams(layoutParams);
                        }
                        View view5 = this.f119361h;
                        if (view5 != null) {
                            view5.invalidate();
                        }
                        View view6 = this.f119362i;
                        if (view6 == null) {
                            return;
                        }
                        view6.setAlpha(1 - Math.abs(f10));
                        return;
                    }
                    View view7 = this.f119361h;
                    Integer numValueOf3 = (view7 == null || (layoutParams2 = view7.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams2.height);
                    f0.m(numValueOf3);
                    if (iF < numValueOf3.intValue()) {
                        View view8 = this.f119361h;
                        layoutParams = view8 != null ? view8.getLayoutParams() : null;
                        if (layoutParams != null) {
                            layoutParams.height = ViewUtils.f(page.getContext(), this.f119369p + (Math.abs(f10) * (168.0f - this.f119369p)));
                        }
                        View view9 = this.f119361h;
                        if (view9 != null) {
                            view9.setLayoutParams(layoutParams);
                        }
                        View view10 = this.f119361h;
                        if (view10 != null) {
                            view10.invalidate();
                        }
                        View view11 = this.f119362i;
                        if (view11 == null) {
                            return;
                        }
                        view11.setAlpha(Math.abs(f10));
                    }
                }
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "no message";
            }
            Log.e(f119353s, message);
        }
    }

    public final void u(@d PlatformCardBgObj bottom, int i10) {
        if (PatchProxy.proxy(new Object[]{bottom, new Integer(i10)}, this, changeQuickRedirect, false, 25116, new Class[]{PlatformCardBgObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bottom, "bottom");
        VideoViewX videoViewX = this.f119365l.get();
        if (videoViewX != null && bottom.hasBgVideoUrl()) {
            videoViewX.setAlpha(1.0f);
            if (!f0.g(videoViewX.getParent(), this.f119363j)) {
                ViewParent parent = videoViewX.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f119363j.addView(videoViewX);
            }
            if (!videoViewX.x()) {
                t(videoViewX, bottom.getBgVideoUrl());
            }
        }
        if (this.f119368o == i10) {
            return;
        }
        this.f119368o = i10;
        this.f119357d.setVisibility(bottom.hasBg() ? 0 : 8);
        this.f119358e.setVisibility(bottom.hasMask() ? 0 : 8);
        b.E(this.f119357d);
        if (bottom.hasBgUrl()) {
            if (bottom.getDefaultBgResourceId() == -1) {
                b.K(bottom.getBgUrl(), this.f119357d);
            } else {
                b.L(bottom.getBgUrl(), this.f119357d, bottom.getDefaultBgResourceId());
            }
        } else if (bottom.hasBgResourceId()) {
            this.f119357d.setImageResource(bottom.getBgDrawableResourceId());
        } else if (bottom.getDefaultBgResourceId() != -1) {
            this.f119357d.setImageResource(bottom.getDefaultBgResourceId());
        }
        b.E(this.f119358e);
        if (bottom.hasMaskUrl()) {
            if (bottom.getDefaultMaskResourceId() == -1) {
                b.K(bottom.getMaskUrl(), this.f119358e);
                return;
            } else {
                b.L(bottom.getMaskUrl(), this.f119358e, bottom.getDefaultMaskResourceId());
                return;
            }
        }
        if (bottom.hasMaskResourceId()) {
            this.f119358e.setImageResource(bottom.getMaskDrawableResourceId());
        } else if (bottom.getDefaultMaskResourceId() != -1) {
            this.f119358e.setImageResource(bottom.getDefaultMaskResourceId());
        }
    }

    public final void v(int i10) {
        this.f119368o = i10;
    }

    public final void w(@e View view) {
        this.f119361h = view;
    }

    public final void x(@e View view) {
        this.f119362i = view;
    }

    public final void y(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 25107, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f119357d = imageView;
    }

    public final void z(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 25108, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f119358e = imageView;
    }
}
