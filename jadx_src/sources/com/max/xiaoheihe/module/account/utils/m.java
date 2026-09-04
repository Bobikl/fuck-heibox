package com.max.xiaoheihe.module.account.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SteamValueCardMaker.java */
/* JADX INFO: loaded from: classes9.dex */
public class m {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f79405s = "SteamValueCardMaker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f79406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f79407b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout[] f79413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewGroup f79414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LayoutInflater f79415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f79416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f79417l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View.OnClickListener f79421p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f79408c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f79409d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f79410e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n
    private int f79411f = R.color.dark_blue;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f79412g = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f79418m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f79419n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f79420o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f79422q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f79423r = false;

    /* JADX INFO: compiled from: SteamValueCardMaker.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f79424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f79425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f79426d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.utils.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SteamValueCardMaker.java */
        public class C0662a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0662a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25533, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                for (int i10 = m.this.f79408c - m.this.f79410e; i10 < m.this.f79408c; i10++) {
                    ViewGroup.LayoutParams layoutParams = m.this.f79413h[i10].getLayoutParams();
                    if (m.this.f79419n) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        a aVar = a.this;
                        layoutParams.height = (int) (fFloatValue * aVar.f79424b[i10]);
                        aVar.f79425c.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue() * 180.0f);
                    } else {
                        a.this.f79425c.setRotation((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 180.0f);
                        layoutParams.height = (int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * a.this.f79424b[i10]);
                    }
                    m.this.f79413h[i10].setLayoutParams(layoutParams);
                }
                if (m.this.f79417l != null) {
                    ViewGroup.LayoutParams layoutParams2 = m.this.f79417l.getLayoutParams();
                    if (m.this.f79419n) {
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        a aVar2 = a.this;
                        layoutParams2.height = (int) (fFloatValue2 * aVar2.f79424b[m.this.f79408c]);
                    } else {
                        float fFloatValue3 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        a aVar3 = a.this;
                        layoutParams2.height = (int) (fFloatValue3 * aVar3.f79424b[m.this.f79408c]);
                    }
                    m.this.f79417l.setLayoutParams(layoutParams2);
                }
            }
        }

        /* JADX INFO: compiled from: SteamValueCardMaker.java */
        public class b implements Animator.AnimatorListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 25535, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                m.this.f79418m = false;
                m mVar = m.this;
                mVar.f79419n = true ^ mVar.f79419n;
                if (m.this.f79419n) {
                    a aVar = a.this;
                    aVar.f79426d.setText(m.this.f79416k.getString(R.string.get_more_data));
                } else {
                    a aVar2 = a.this;
                    aVar2.f79426d.setText(m.this.f79416k.getString(R.string.fold));
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 25534, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                m.this.f79418m = true;
            }
        }

        a(int[] iArr, ImageView imageView, TextView textView) {
            this.f79424b = iArr;
            this.f79425c = imageView;
            this.f79426d = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25532, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (m.this.f79421p != null) {
                m.this.f79421p.onClick(view);
            }
            if (m.this.f79418m) {
                return;
            }
            for (int i10 = 0; i10 < m.this.f79408c; i10++) {
                this.f79424b[i10] = ViewUtils.V(m.this.f79413h[i10]);
            }
            if (m.this.f79417l != null) {
                this.f79424b[m.this.f79408c] = ViewUtils.V(m.this.f79417l);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new C0662a());
            valueAnimatorOfFloat.addListener(new b());
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: compiled from: SteamValueCardMaker.java */
    public interface b {
        int a();

        void b(View view, int i10);

        View c(LayoutInflater layoutInflater, int i10);
    }

    private boolean k() {
        return (this.f79406a == null || this.f79407b == null) ? false : true;
    }

    public LinearLayout l() {
        return this.f79412g;
    }

    public m m() {
        this.f79422q = true;
        return this;
    }

    public void n() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25530, new Class[0], Void.TYPE).isSupported && k()) {
            boolean z10 = this.f79420o;
            if (z10 || (this.f79408c > 0 && this.f79409d > 0)) {
                if (z10) {
                    this.f79408c = 1;
                }
                this.f79416k = this.f79406a.getContext();
                this.f79412g = (LinearLayout) this.f79406a.findViewById(R.id.gl_steam_value_card_x);
                this.f79414i = (ViewGroup) this.f79406a.findViewById(R.id.vg_steam_value_card_operator_panel);
                TextView textView = (TextView) this.f79406a.findViewById(R.id.tv_steam_value_card_text);
                ImageView imageView = (ImageView) this.f79406a.findViewById(R.id.iv_steam_value_card_sign);
                this.f79406a.setBackgroundColor(this.f79416k.getResources().getColor(this.f79411f));
                if (this.f79412g == null) {
                    return;
                }
                if (this.f79422q) {
                    this.f79414i.setVisibility(8);
                } else {
                    this.f79414i.setVisibility(0);
                }
                Context context = this.f79412g.getContext();
                this.f79416k = context;
                this.f79415j = LayoutInflater.from(context);
                this.f79413h = new LinearLayout[this.f79408c];
                this.f79412g.removeAllViews();
                int[] iArr = new int[this.f79408c + 1];
                for (int i10 = 0; i10 < this.f79408c; i10++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    this.f79413h[i10] = new LinearLayout(this.f79416k);
                    this.f79413h[i10].setOrientation(0);
                    this.f79413h[i10].setLayoutParams(layoutParams);
                    this.f79412g.addView(this.f79413h[i10]);
                }
                View view = this.f79417l;
                if (view != null && view.getParent() == null) {
                    this.f79412g.addView(this.f79417l, new LinearLayout.LayoutParams(-1, -2));
                }
                if (this.f79407b.a() <= 0) {
                    return;
                }
                if (this.f79420o) {
                    this.f79409d = this.f79407b.a();
                }
                for (int i11 = 0; i11 < this.f79407b.a(); i11++) {
                    View viewC = this.f79407b.c(this.f79415j, i11);
                    if (viewC == null) {
                        throw new NullPointerException("The onCreateItem can not return null");
                    }
                    this.f79413h[i11 / this.f79409d].addView(viewC);
                    this.f79407b.b(viewC, i11);
                }
                if (this.f79423r) {
                    textView.setText(this.f79416k.getString(R.string.get_more_data));
                    for (int i12 = 0; i12 < this.f79410e; i12++) {
                        ViewGroup.LayoutParams layoutParams2 = this.f79413h[(this.f79408c - i12) - 1].getLayoutParams();
                        layoutParams2.height = 0;
                        this.f79413h[(this.f79408c - i12) - 1].setLayoutParams(layoutParams2);
                    }
                    View view2 = this.f79417l;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        layoutParams3.height = 0;
                        this.f79417l.setLayoutParams(layoutParams3);
                    }
                } else {
                    imageView.setRotation(180.0f);
                    textView.setText(this.f79416k.getString(R.string.fold));
                }
                this.f79414i.setOnClickListener(new a(iArr, imageView, textView));
            }
        }
    }

    public m o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25531, new Class[0], m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        boolean z10 = this.f79420o;
        if (!z10 && this.f79409d < 1) {
            return this;
        }
        if (z10) {
            this.f79409d = this.f79407b.a();
        }
        for (LinearLayout linearLayout : this.f79413h) {
            linearLayout.removeAllViews();
        }
        for (int i10 = 0; i10 < this.f79407b.a(); i10++) {
            View viewC = this.f79407b.c(this.f79415j, i10);
            if (viewC == null) {
                throw new NullPointerException("The onCreateItem can not return null");
            }
            this.f79413h[i10 / this.f79409d].addView(viewC);
            this.f79407b.b(viewC, i10);
        }
        return this;
    }

    public m p(b bVar) {
        this.f79407b = bVar;
        return this;
    }

    public m q(@n int i10) {
        this.f79411f = i10;
        return this;
    }

    public m r(int i10) {
        this.f79409d = i10;
        return this;
    }

    public m s(View view) {
        this.f79417l = view;
        return this;
    }

    public m t(boolean z10) {
        this.f79423r = z10;
        this.f79419n = z10;
        return this;
    }

    public m u(int i10) {
        if (i10 > this.f79408c) {
            return this;
        }
        this.f79410e = i10;
        return this;
    }

    public m v(View.OnClickListener onClickListener) {
        this.f79421p = onClickListener;
        return this;
    }

    public m w(ViewGroup viewGroup) {
        this.f79406a = viewGroup;
        return this;
    }

    public m x(int i10) {
        this.f79408c = i10;
        return this;
    }

    public m y(boolean z10) {
        this.f79420o = z10;
        return this;
    }
}
