package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2PlayerSelectorView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2PlayerSelectorView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87194e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f87195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f87197d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2PlayerSelectorView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dota2PlayerSelectorView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2PlayerSelectorView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37333, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackground(q.o(getContext(), R.color.white_alpha5, 3.0f));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_player_selector, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 44.0f)));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.v_left);
        f0.o(viewFindViewById, "findViewById(R.id.v_left)");
        setVLeft(viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_name)");
        setTvName((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_icon)");
        setIvIcon((ImageView) viewFindViewById3);
    }

    @d
    public final ImageView getIvIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37331, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87197d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivIcon");
        return null;
    }

    @d
    public final TextView getTvName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37329, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87196c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvName");
        return null;
    }

    @d
    public final View getVLeft() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37327, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87195b;
        if (view != null) {
            return view;
        }
        f0.S("vLeft");
        return null;
    }

    public final void setData(@e String str, @e String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10)}, this, changeQuickRedirect, false, 37334, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTvName().setText(str);
        b.K(str2, getIvIcon());
        getVLeft().setBackground(q.B(getContext(), i10, 4.0f));
    }

    public final void setIvIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37332, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87197d = imageView;
    }

    public final void setTvName(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37330, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87196c = textView;
    }

    public final void setVLeft(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37328, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87195b = view;
    }
}
