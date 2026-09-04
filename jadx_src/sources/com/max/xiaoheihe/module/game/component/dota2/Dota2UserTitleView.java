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
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2UserTitleView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2UserTitleView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final a f87231f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87232g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final String f87233h = "match_num";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f87234i = "win_rate";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f87235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f87237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Dota2HeroTitleView.b f87238e;

    /* JADX INFO: compiled from: Dota2UserTitleView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Dota2UserTitleView.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37408, new Class[]{View.class}, Void.TYPE).isSupported && Dota2UserTitleView.this.getCanClick()) {
                Dota2UserTitleView dota2UserTitleView = Dota2UserTitleView.this;
                dota2UserTitleView.b(dota2UserTitleView.getTvMatchNum());
                Dota2HeroTitleView.b onSelectListener = Dota2UserTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2UserTitleView.this.getTvMatchNum(), "match_num");
                }
            }
        }
    }

    /* JADX INFO: compiled from: Dota2UserTitleView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37409, new Class[]{View.class}, Void.TYPE).isSupported && Dota2UserTitleView.this.getCanClick()) {
                Dota2UserTitleView dota2UserTitleView = Dota2UserTitleView.this;
                dota2UserTitleView.b(dota2UserTitleView.getTvWinRate());
                Dota2HeroTitleView.b onSelectListener = Dota2UserTitleView.this.getOnSelectListener();
                if (onSelectListener != null) {
                    onSelectListener.a(Dota2UserTitleView.this.getTvWinRate(), "win_rate");
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2UserTitleView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2UserTitleView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2UserTitleView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_user_title, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.tv_win_rate);
        f0.o(viewFindViewById, "findViewById(R.id.tv_win_rate)");
        setTvWinRate((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_match_num);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_match_num)");
        setTvMatchNum((TextView) viewFindViewById2);
        Typeface typefaceB = bb.d.a().b(0);
        getTvWinRate().setTypeface(typefaceB);
        getTvMatchNum().setTypeface(typefaceB);
        getTvMatchNum().setOnClickListener(new b());
        getTvWinRate().setOnClickListener(new c());
    }

    public final void b(@d TextView tv) {
        if (PatchProxy.proxy(new Object[]{tv}, this, changeQuickRedirect, false, 37406, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tv, "tv");
        setChecked(getTvWinRate(), f0.g(getTvWinRate(), tv));
        setChecked(getTvMatchNum(), f0.g(getTvMatchNum(), tv));
    }

    public final void c(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37405, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g(str, "match_num")) {
            b(getTvMatchNum());
        } else if (f0.g(str, "win_rate")) {
            b(getTvWinRate());
        }
    }

    public final boolean getCanClick() {
        return this.f87237d;
    }

    @e
    public final Dota2HeroTitleView.b getOnSelectListener() {
        return this.f87238e;
    }

    @d
    public final TextView getTvMatchNum() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37402, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87236c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvMatchNum");
        return null;
    }

    @d
    public final TextView getTvWinRate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37400, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87235b;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWinRate");
        return null;
    }

    public final void setCanClick(boolean z10) {
        this.f87237d = z10;
    }

    public final void setChecked(@d TextView tv, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tv, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37407, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
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
                tv.setText("同场次数\uf0d7");
            } else {
                tv.setText("同场次数");
            }
        }
        if (z10) {
            tv.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        } else {
            tv.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
        }
    }

    public final void setOnSelectListener(@e Dota2HeroTitleView.b bVar) {
        this.f87238e = bVar;
    }

    public final void setTvMatchNum(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37403, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87236c = textView;
    }

    public final void setTvWinRate(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37401, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87235b = textView;
    }
}
