package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2HeroTitleView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2HeroTitleView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f87115h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f87116i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f87117j = "match_num";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f87118k = "win_rate";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f87119l = "mmr";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f87120m = "kda";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f87121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f87125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private b f87126g;

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public interface b {
        void a(@dl.d TextView textView, @dl.d String str);
    }

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37195, new Class[]{View.class}, Void.TYPE).isSupported && Dota2HeroTitleView.this.getCanClick()) {
                Dota2HeroTitleView dota2HeroTitleView = Dota2HeroTitleView.this;
                dota2HeroTitleView.b(dota2HeroTitleView.getTvMatchNum());
                b onSelectListener = Dota2HeroTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2HeroTitleView.this.getTvMatchNum(), "match_num");
                }
            }
        }
    }

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37196, new Class[]{View.class}, Void.TYPE).isSupported && Dota2HeroTitleView.this.getCanClick()) {
                Dota2HeroTitleView dota2HeroTitleView = Dota2HeroTitleView.this;
                dota2HeroTitleView.b(dota2HeroTitleView.getTvWinRate());
                b onSelectListener = Dota2HeroTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2HeroTitleView.this.getTvWinRate(), "win_rate");
                }
            }
        }
    }

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37197, new Class[]{View.class}, Void.TYPE).isSupported && Dota2HeroTitleView.this.getCanClick()) {
                Dota2HeroTitleView dota2HeroTitleView = Dota2HeroTitleView.this;
                dota2HeroTitleView.b(dota2HeroTitleView.getTvMmr());
                b onSelectListener = Dota2HeroTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2HeroTitleView.this.getTvMmr(), Dota2HeroTitleView.f87119l);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Dota2HeroTitleView.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37198, new Class[]{View.class}, Void.TYPE).isSupported && Dota2HeroTitleView.this.getCanClick()) {
                Dota2HeroTitleView dota2HeroTitleView = Dota2HeroTitleView.this;
                dota2HeroTitleView.b(dota2HeroTitleView.getTvKda());
                b onSelectListener = Dota2HeroTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2HeroTitleView.this.getTvKda(), Dota2HeroTitleView.f87120m);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2HeroTitleView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2HeroTitleView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2HeroTitleView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37191, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_hero_title, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.tv_win_rate);
        f0.o(viewFindViewById, "findViewById(R.id.tv_win_rate)");
        setTvWinRate((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_match_num);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_match_num)");
        setTvMatchNum((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_mmr);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_mmr)");
        setTvMmr((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_kda);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_kda)");
        setTvKda((TextView) viewFindViewById4);
        Typeface typefaceB = bb.d.a().b(0);
        getTvWinRate().setTypeface(typefaceB);
        getTvMatchNum().setTypeface(typefaceB);
        getTvMmr().setTypeface(typefaceB);
        getTvKda().setTypeface(typefaceB);
        getTvMatchNum().setOnClickListener(new c());
        getTvWinRate().setOnClickListener(new d());
        getTvMmr().setOnClickListener(new e());
        getTvKda().setOnClickListener(new f());
    }

    public final void b(@dl.d TextView tv) {
        if (PatchProxy.proxy(new Object[]{tv}, this, changeQuickRedirect, false, 37193, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tv, "tv");
        setChecked(getTvWinRate(), f0.g(getTvWinRate(), tv));
        setChecked(getTvMatchNum(), f0.g(getTvMatchNum(), tv));
        setChecked(getTvMmr(), f0.g(getTvMmr(), tv));
        setChecked(getTvKda(), f0.g(getTvKda(), tv));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37192, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1119927453:
                if (str.equals("win_rate")) {
                    b(getTvWinRate());
                    break;
                }
                break;
            case 106024:
                if (str.equals(f87120m)) {
                    b(getTvKda());
                    break;
                }
                break;
            case 108242:
                if (str.equals(f87119l)) {
                    b(getTvMmr());
                    break;
                }
                break;
            case 614353420:
                if (str.equals("match_num")) {
                    b(getTvMatchNum());
                    break;
                }
                break;
        }
    }

    public final boolean getCanClick() {
        return this.f87125f;
    }

    @dl.e
    public final b getOnSelectListener() {
        return this.f87126g;
    }

    @dl.d
    public final TextView getTvKda() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37189, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87124e;
        if (textView != null) {
            return textView;
        }
        f0.S("tvKda");
        return null;
    }

    @dl.d
    public final TextView getTvMatchNum() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37185, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87122c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvMatchNum");
        return null;
    }

    @dl.d
    public final TextView getTvMmr() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37187, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87123d;
        if (textView != null) {
            return textView;
        }
        f0.S("tvMmr");
        return null;
    }

    @dl.d
    public final TextView getTvWinRate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37183, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87121b;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWinRate");
        return null;
    }

    public final void setCanClick(boolean z10) {
        this.f87125f = z10;
    }

    public final void setChecked(@dl.d TextView tv, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tv, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37194, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tv, "tv");
        if (f0.g(tv, getTvWinRate())) {
            if (z10) {
                tv.setText("胜率\uf0d7");
            } else {
                tv.setText("胜率");
            }
        } else if (f0.g(tv, getTvMatchNum())) {
            if (z10) {
                tv.setText("场次\uf0d7");
            } else {
                tv.setText("场次");
            }
        } else if (f0.g(tv, getTvMmr())) {
            if (z10) {
                tv.setText("MMR/排名\uf0d7");
            } else {
                tv.setText("MMR/排名");
            }
        } else if (f0.g(tv, getTvKda())) {
            if (z10) {
                tv.setText("KDA\uf0d7");
            } else {
                tv.setText("KDA");
            }
        }
        if (z10) {
            tv.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        } else {
            tv.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
        }
    }

    public final void setOnSelectListener(@dl.e b bVar) {
        this.f87126g = bVar;
    }

    public final void setTvKda(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37190, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87124e = textView;
    }

    public final void setTvMatchNum(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37186, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87122c = textView;
    }

    public final void setTvMmr(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37188, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87123d = textView;
    }

    public final void setTvWinRate(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37184, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87121b = textView;
    }
}
