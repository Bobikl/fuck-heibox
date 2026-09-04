package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.d;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.TitleBarStyle;
import com.max.mediaselector.lib.utils.h;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class TitleBar extends RelativeLayout implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f75591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ImageView f75592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f75593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ImageView f75594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected MarqueeTextView f75595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected TextView f75596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected View f75597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f75598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected PictureSelectionConfig f75599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected View f75600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected RelativeLayout f75601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected a f75602m;

    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void a() {
        }

        public void b(View view) {
        }

        public void c() {
        }
    }

    public TitleBar(Context context) {
        super(context);
        c();
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public void a() {
    }

    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Va, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.ps_title_bar, this);
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ua, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b();
        setClickable(true);
        setFocusable(true);
        this.f75600k = findViewById(R.id.top_status_bar);
        this.f75601l = (RelativeLayout) findViewById(R.id.rl_title_bar);
        this.f75592c = (ImageView) findViewById(R.id.ps_iv_left_back);
        this.f75591b = (RelativeLayout) findViewById(R.id.ps_rl_album_bg);
        this.f75594e = (ImageView) findViewById(R.id.ps_iv_delete);
        this.f75598i = findViewById(R.id.ps_rl_album_click);
        this.f75595f = (MarqueeTextView) findViewById(R.id.ps_tv_title);
        this.f75593d = (ImageView) findViewById(R.id.ps_iv_arrow);
        this.f75596g = (TextView) findViewById(R.id.ps_tv_cancel);
        this.f75597h = findViewById(R.id.title_bar_line);
        this.f75592c.setOnClickListener(this);
        this.f75596g.setOnClickListener(this);
        this.f75591b.setOnClickListener(this);
        this.f75601l.setOnClickListener(this);
        this.f75598i.setOnClickListener(this);
        setBackgroundColor(d.f(getContext(), R.color.ps_color_grey));
        this.f75599j = PictureSelectionConfig.c();
        a();
    }

    public ImageView getImageArrow() {
        return this.f75593d;
    }

    public ImageView getImageDelete() {
        return this.f75594e;
    }

    public View getTitleBarLine() {
        return this.f75597h;
    }

    public TextView getTitleCancelView() {
        return this.f75596g;
    }

    public String getTitleText() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Xa, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f75595f.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.m.Za, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.ps_iv_left_back || id2 == R.id.ps_tv_cancel) {
            a aVar2 = this.f75602m;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        if (id2 == R.id.ps_rl_album_bg || id2 == R.id.ps_rl_album_click) {
            a aVar3 = this.f75602m;
            if (aVar3 != null) {
                aVar3.b(this);
                return;
            }
            return;
        }
        if (id2 != R.id.rl_title_bar || (aVar = this.f75602m) == null) {
            return;
        }
        aVar.c();
    }

    public void setOnTitleBarListener(a aVar) {
        this.f75602m = aVar;
    }

    public void setTitle(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.Wa, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75595f.setText(str);
    }

    public void setTitleBarStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ya, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f75599j.K) {
            this.f75600k.getLayoutParams().height = h.j(getContext());
        }
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.f75017b4.d();
        int iH = titleBarStyleD.h();
        if (s.b(iH)) {
            this.f75601l.getLayoutParams().height = iH;
        } else {
            this.f75601l.getLayoutParams().height = h.a(getContext(), 44.0f);
        }
        if (this.f75597h != null) {
            if (titleBarStyleD.z()) {
                this.f75597h.setVisibility(0);
                if (s.c(titleBarStyleD.j())) {
                    this.f75597h.setBackgroundColor(titleBarStyleD.j());
                }
            } else {
                this.f75597h.setVisibility(8);
            }
        }
        int iF = titleBarStyleD.f();
        if (s.c(iF)) {
            setBackgroundColor(iF);
        }
        int iU = titleBarStyleD.u();
        if (s.c(iU)) {
            this.f75592c.setImageResource(iU);
        }
        String strP = titleBarStyleD.p();
        if (s.f(strP)) {
            this.f75595f.setText(strP);
        }
        int iW = titleBarStyleD.w();
        if (s.b(iW)) {
            this.f75595f.setTextSize(iW);
        }
        int iV = titleBarStyleD.v();
        if (s.c(iV)) {
            this.f75595f.setTextColor(iV);
        }
        if (this.f75599j.K3) {
            this.f75593d.setImageResource(R.drawable.ps_ic_trans_1px);
        } else {
            int iR = titleBarStyleD.r();
            if (s.c(iR)) {
                this.f75593d.setImageResource(iR);
            }
        }
        int iD = titleBarStyleD.d();
        if (s.c(iD)) {
            this.f75591b.setBackgroundResource(iD);
        }
        if (titleBarStyleD.A()) {
            this.f75596g.setVisibility(8);
        } else {
            this.f75596g.setVisibility(0);
            int iK = titleBarStyleD.k();
            if (s.c(iK)) {
                this.f75596g.setBackgroundResource(iK);
            }
            String strL = titleBarStyleD.l();
            if (s.f(strL)) {
                this.f75596g.setText(strL);
            }
            int iN = titleBarStyleD.n();
            if (s.c(iN)) {
                this.f75596g.setTextColor(iN);
            }
            int iO = titleBarStyleD.o();
            if (s.b(iO)) {
                this.f75596g.setTextSize(iO);
            }
        }
        int iA = titleBarStyleD.a();
        if (s.c(iA)) {
            this.f75594e.setBackgroundResource(iA);
        } else {
            this.f75594e.setBackgroundResource(R.drawable.ps_ic_delete);
        }
    }
}
