package com.max.hbcommon.component.bubble;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.i0;
import androidx.appcompat.app.AppCompatActivity;
import com.max.hbcommon.R;
import com.max.hbcustomview.bubble.BubbleView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: BubbleTipFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends androidx.fragment.app.j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final b f67364l = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f67365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f67366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BubbleView f67367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i0
    private int f67368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private d f67373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private DialogInterface.OnDismissListener f67374k;

    /* JADX INFO: compiled from: BubbleTipFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private Context f67375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @i0
        private int f67376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f67377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f67378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f67379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f67380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private BubbleView f67381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private d f67382h;

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.f67375a = context;
            this.f67376b = R.layout.layout_sample_fragment_container;
            this.f67379e = -1;
            this.f67381g = new BubbleView(this.f67375a);
        }

        @dl.d
        public final c a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ek, new Class[0], c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            l(new c(this, null));
            return b();
        }

        @dl.d
        public final c b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31691zk, new Class[0], c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            c cVar = this.f67380f;
            if (cVar != null) {
                return cVar;
            }
            f0.S("fragment");
            return null;
        }

        @dl.e
        public final d c() {
            return this.f67382h;
        }

        public final int d() {
            return this.f67376b;
        }

        @dl.d
        public final BubbleView e() {
            return this.f67381g;
        }

        @dl.d
        public final Context f() {
            return this.f67375a;
        }

        public final int g() {
            return this.f67379e;
        }

        public final int h() {
            return this.f67377c;
        }

        public final int i() {
            return this.f67378d;
        }

        @dl.d
        public final a j(@dl.d BubbleView view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Ck, new Class[]{BubbleView.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(view, "view");
            this.f67381g = view;
            return this;
        }

        @dl.d
        public final a k(int i10) {
            this.f67376b = i10;
            return this;
        }

        public final void l(@dl.d c cVar) {
            if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.d.Ak, new Class[]{c.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(cVar, "<set-?>");
            this.f67380f = cVar;
        }

        public final void m(@dl.e d dVar) {
            this.f67382h = dVar;
        }

        public final void n(int i10) {
            this.f67376b = i10;
        }

        public final void o(@dl.d BubbleView bubbleView) {
            if (PatchProxy.proxy(new Object[]{bubbleView}, this, changeQuickRedirect, false, bb.c.d.Bk, new Class[]{BubbleView.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(bubbleView, "<set-?>");
            this.f67381g = bubbleView;
        }

        public final void p(@dl.d Context context) {
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31669yk, new Class[]{Context.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "<set-?>");
            this.f67375a = context;
        }

        @dl.d
        public final a q(int i10) {
            this.f67379e = i10;
            return this;
        }

        public final void r(int i10) {
            this.f67379e = i10;
        }

        @dl.d
        public final a s(@dl.d d listener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, bb.c.d.Dk, new Class[]{d.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(listener, "listener");
            this.f67382h = listener;
            return this;
        }

        @dl.d
        public final a t(int i10) {
            this.f67377c = i10;
            return this;
        }

        public final void u(int i10) {
            this.f67377c = i10;
        }

        @dl.d
        public final a v(int i10) {
            this.f67378d = i10;
            return this;
        }

        public final void w(int i10) {
            this.f67378d = i10;
        }
    }

    /* JADX INFO: compiled from: BubbleTipFragment.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        @m
        public final a a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Fk, new Class[]{Context.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new a(context);
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.component.bubble.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BubbleTipFragment.kt */
    public final /* synthetic */ class C0540c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67383a;

        static {
            int[] iArr = new int[BubbleView.TailDirection.valuesCustom().length];
            try {
                iArr[BubbleView.TailDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BubbleView.TailDirection.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BubbleView.TailDirection.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BubbleView.TailDirection.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f67383a = iArr;
        }
    }

    /* JADX INFO: compiled from: BubbleTipFragment.kt */
    public interface d {
        void a();
    }

    private c(a aVar) {
        this.f67368e = R.layout.layout_sample_fragment_container;
        this.f67371h = -1;
        this.f67369f = aVar.h();
        this.f67370g = aVar.i();
        this.f67371h = aVar.g();
        this.f67368e = aVar.d();
        this.f67366c = aVar.f();
        this.f67367d = aVar.e();
        this.f67373j = aVar.c();
    }

    public /* synthetic */ c(a aVar, u uVar) {
        this(aVar);
    }

    @dl.d
    @m
    public static final a M3(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.d.f31647xk, new Class[]{Context.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f67364l.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(c this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31625wk, new Class[]{c.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    public final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31603vk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f67366c;
        Context context2 = null;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        if (context instanceof AppCompatActivity) {
            Context context3 = this.f67366c;
            if (context3 == null) {
                f0.S("mContext");
            } else {
                context2 = context3;
            }
            show(((AppCompatActivity) context2).getSupportFragmentManager(), "bubble_tip");
        }
    }

    @dl.e
    public final DialogInterface.OnDismissListener O3() {
        return this.f67374k;
    }

    public final void Q3(@dl.e DialogInterface.OnDismissListener onDismissListener) {
        this.f67374k = onDismissListener;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onActivityCreated(@dl.e Bundle bundle) {
        BubbleView bubbleView;
        float f10;
        View decorView;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.f31515rk, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Dialog dialog = getDialog();
        f0.m(dialog);
        Window window = dialog.getWindow();
        super.onActivityCreated(bundle);
        if (window != null) {
            Context context = this.f67366c;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            window.setBackgroundDrawable(androidx.core.content.d.i(context, android.R.color.transparent));
        }
        int iJ = ViewUtils.J(getActivity());
        int iM = ViewUtils.M();
        Integer numValueOf = (window == null || (decorView = window.getDecorView()) == null) ? null : Integer.valueOf(decorView.getHeight());
        int i10 = (!kotlin.text.u.L1("xiaomi", Build.MANUFACTURER, true) || (numValueOf != null && numValueOf.intValue() == iJ)) ? iJ - iM : iJ;
        if (window != null) {
            if (i10 == 0) {
                i10 = -1;
            }
            window.setLayout(-1, i10);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.dimAmount = 0.0f;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        BubbleView bubbleView2 = this.f67367d;
        if (bubbleView2 == null) {
            f0.S("mBubbleView");
            bubbleView2 = null;
        }
        int iW = ViewUtils.W(bubbleView2);
        BubbleView bubbleView3 = this.f67367d;
        if (bubbleView3 == null) {
            f0.S("mBubbleView");
            bubbleView3 = null;
        }
        int iV = ViewUtils.V(bubbleView3);
        Log.d("mBubbleView", "vWidth: " + ViewUtils.h0(getContext(), iW) + "  vHeight: " + ViewUtils.h0(getContext(), iV));
        int iF = this.f67371h;
        if (iF < 0) {
            Context context2 = this.f67366c;
            if (context2 == null) {
                f0.S("mContext");
                context2 = null;
            }
            iF = ViewUtils.f(context2, 12.0f);
        }
        Context context3 = this.f67366c;
        if (context3 == null) {
            f0.S("mContext");
            context3 = null;
        }
        int iL = ViewUtils.L(context3);
        BubbleView bubbleView4 = this.f67367d;
        if (bubbleView4 == null) {
            f0.S("mBubbleView");
            bubbleView4 = null;
        }
        BubbleView.TailDirection direction = bubbleView4.getDirection();
        int[] iArr = C0540c.f67383a;
        int i11 = iArr[direction.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && this.f67370g < iV + iF) {
                        BubbleView bubbleView5 = this.f67367d;
                        if (bubbleView5 == null) {
                            f0.S("mBubbleView");
                            bubbleView5 = null;
                        }
                        bubbleView5.setDirection(BubbleView.TailDirection.Top);
                    }
                } else if (this.f67369f < iW + iF) {
                    BubbleView bubbleView6 = this.f67367d;
                    if (bubbleView6 == null) {
                        f0.S("mBubbleView");
                        bubbleView6 = null;
                    }
                    bubbleView6.setDirection(BubbleView.TailDirection.Left);
                }
            } else if (this.f67370g + iV + iF > iJ) {
                BubbleView bubbleView7 = this.f67367d;
                if (bubbleView7 == null) {
                    f0.S("mBubbleView");
                    bubbleView7 = null;
                }
                bubbleView7.setDirection(BubbleView.TailDirection.Bottom);
            }
        } else if (this.f67369f + iW + iF > iL) {
            BubbleView bubbleView8 = this.f67367d;
            if (bubbleView8 == null) {
                f0.S("mBubbleView");
                bubbleView8 = null;
            }
            bubbleView8.setDirection(BubbleView.TailDirection.Right);
        }
        BubbleView bubbleView9 = this.f67367d;
        if (bubbleView9 == null) {
            f0.S("mBubbleView");
            bubbleView9 = null;
        }
        int i12 = iArr[bubbleView9.getDirection().ordinal()];
        if (i12 == 1) {
            int i13 = this.f67370g;
            int i14 = iV / 2;
            if ((i13 - i14) - iF < 0) {
                layoutParams.setMargins(this.f67369f, iF, 0, 0);
                BubbleView bubbleView10 = this.f67367d;
                if (bubbleView10 == null) {
                    f0.S("mBubbleView");
                    bubbleView10 = null;
                }
                bubbleView10.setTailPosition(this.f67370g - iF);
            } else if (iJ < i13 + i14 + iF) {
                layoutParams.setMargins(this.f67369f, (iJ - iV) - iF, 0, 0);
                BubbleView bubbleView11 = this.f67367d;
                if (bubbleView11 == null) {
                    f0.S("mBubbleView");
                    bubbleView11 = null;
                }
                bubbleView11.setTailPosition((this.f67370g - iJ) + iV + iF);
            } else {
                layoutParams.setMargins(this.f67369f - (iW / 2), i13, 0, 0);
                BubbleView bubbleView12 = this.f67367d;
                if (bubbleView12 == null) {
                    f0.S("mBubbleView");
                    bubbleView12 = null;
                }
                bubbleView12.setTailPosition(i14);
            }
        } else if (i12 == 2) {
            int i15 = this.f67369f;
            int i16 = iW / 2;
            if ((i15 - i16) - iF < 0) {
                layoutParams.setMargins(iF, this.f67370g, 0, 0);
                BubbleView bubbleView13 = this.f67367d;
                if (bubbleView13 == null) {
                    f0.S("mBubbleView");
                    bubbleView13 = null;
                }
                bubbleView13.setTailPosition(this.f67369f - iF);
            } else if (iL < i15 + i16 + iF) {
                layoutParams.setMargins((iL - iW) - iF, this.f67370g, 0, 0);
                BubbleView bubbleView14 = this.f67367d;
                if (bubbleView14 == null) {
                    f0.S("mBubbleView");
                    bubbleView14 = null;
                }
                bubbleView14.setTailPosition((this.f67369f - iL) + iW + iF);
            } else {
                layoutParams.setMargins(i15 - i16, this.f67370g, 0, 0);
                BubbleView bubbleView15 = this.f67367d;
                if (bubbleView15 == null) {
                    f0.S("mBubbleView");
                    bubbleView15 = null;
                }
                bubbleView15.setTailPosition(i16);
            }
        } else if (i12 == 3) {
            int i17 = this.f67370g;
            int i18 = iV / 2;
            if ((i17 - i18) - iF < 0) {
                int i19 = this.f67369f - iW;
                Context context4 = this.f67366c;
                if (context4 == null) {
                    f0.S("mContext");
                    f10 = 12.0f;
                    context4 = null;
                } else {
                    f10 = 12.0f;
                }
                layoutParams.setMargins(i19, ViewUtils.f(context4, f10), 0, 0);
                BubbleView bubbleView16 = this.f67367d;
                if (bubbleView16 == null) {
                    f0.S("mBubbleView");
                    bubbleView16 = null;
                }
                bubbleView16.setTailPosition(this.f67370g - iF);
            } else if (iJ < i17 + i18 + iF) {
                layoutParams.setMargins(this.f67369f - iW, (iJ - iV) - iF, 0, 0);
                BubbleView bubbleView17 = this.f67367d;
                if (bubbleView17 == null) {
                    f0.S("mBubbleView");
                    bubbleView17 = null;
                }
                bubbleView17.setTailPosition((this.f67370g - iJ) + iV + iF);
            } else {
                layoutParams.setMargins(this.f67369f - (iW / 2), i17, 0, 0);
                BubbleView bubbleView18 = this.f67367d;
                if (bubbleView18 == null) {
                    f0.S("mBubbleView");
                    bubbleView18 = null;
                }
                bubbleView18.setTailPosition(i18);
            }
        } else if (i12 == 4) {
            int i20 = this.f67369f;
            int i21 = iW / 2;
            if ((i20 - i21) - iF < 0) {
                layoutParams.setMargins(iF, this.f67370g - iV, 0, 0);
                BubbleView bubbleView19 = this.f67367d;
                if (bubbleView19 == null) {
                    f0.S("mBubbleView");
                    bubbleView19 = null;
                }
                bubbleView19.setTailPosition(this.f67369f - iF);
            } else if (iL < i20 + i21 + iF) {
                layoutParams.setMargins((iL - iW) - iF, this.f67370g, 0, 0);
                BubbleView bubbleView20 = this.f67367d;
                if (bubbleView20 == null) {
                    f0.S("mBubbleView");
                    bubbleView20 = null;
                }
                bubbleView20.setTailPosition((this.f67369f - iL) + iW + iF);
            } else {
                layoutParams.setMargins(i20 - i21, this.f67370g - iV, 0, 0);
                BubbleView bubbleView21 = this.f67367d;
                if (bubbleView21 == null) {
                    f0.S("mBubbleView");
                    bubbleView21 = null;
                }
                bubbleView21.setTailPosition(i21);
            }
        }
        BubbleView bubbleView22 = this.f67367d;
        if (bubbleView22 == null) {
            f0.S("mBubbleView");
            bubbleView = null;
        } else {
            bubbleView = bubbleView22;
        }
        bubbleView.setLayoutParams(layoutParams);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.f31493qk, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        setStyle(2, 0);
        super.onCreate(bundle);
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.requestFeature(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.d.f31537sk, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        View viewInflate = inflater.inflate(this.f67368e, viewGroup, false);
        f0.o(viewInflate, "inflate(...)");
        this.f67365b = viewInflate;
        if (viewInflate == null) {
            f0.S("rootView");
            viewInflate = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        BubbleView bubbleView = this.f67367d;
        if (bubbleView == null) {
            f0.S("mBubbleView");
            bubbleView = null;
        }
        viewGroup2.addView(bubbleView);
        View view = this.f67365b;
        if (view == null) {
            f0.S("rootView");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bubble.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.P3(this.f67363b, view2);
            }
        });
        View view2 = this.f67365b;
        if (view2 != null) {
            return view2;
        }
        f0.S("rootView");
        return null;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31559tk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        d dVar = this.f67373j;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.d.f31581uk, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f67374k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }
}
