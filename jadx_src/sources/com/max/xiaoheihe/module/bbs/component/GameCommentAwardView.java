package com.max.xiaoheihe.module.bbs.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GameCommentAwardView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class GameCommentAwardView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f80880o = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ShineButton f80881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f80882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f80883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f80884n;

    public GameCommentAwardView(@e Context context) {
        this(context, null);
    }

    public GameCommentAwardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentAwardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f80884n = true;
        i(attributeSet);
    }

    @SuppressLint({"DefaultLocale"})
    private final String h(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27753, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i10 < 10000) {
            return String.valueOf(i10);
        }
        int i11 = (i10 / 1000) % 10;
        int i12 = i10 / 10000;
        if (i11 == 0) {
            v0 v0Var = v0.f124986a;
            String str = String.format("%d万", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            f0.o(str, "format(format, *args)");
            return str;
        }
        v0 v0Var2 = v0.f124986a;
        String str2 = String.format("%d.%d万", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i11)}, 2));
        f0.o(str2, "format(format, *args)");
        return str2;
    }

    private final void i(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 27746, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setCardElevation(0.0f);
        setRadius(ViewUtils.f(getContext(), 2.0f));
        View.inflate(getContext(), R.layout.view_game_comment_award, this);
        View viewFindViewById = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById, "findViewById(R.id.iv_icon)");
        setIv_icon((ShineButton) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_desc)");
        this.f80882l = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_num);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_num)");
        this.f80883m = (TextView) viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f76296g1);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.GameCommentAwardView)");
        String string = typedArrayObtainStyledAttributes.getString(1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.expression_cube_zan);
        setDesc(string);
        setNum(null);
        setChecked$default(this, false, false, 2, null);
        getIv_icon().setImageResource(resourceId);
    }

    public static /* synthetic */ void setChecked$default(GameCommentAwardView gameCommentAwardView, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {gameCommentAwardView, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27748, new Class[]{GameCommentAwardView.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        gameCommentAwardView.setChecked(z10, z11);
    }

    @d
    public final ShineButton getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27744, new Class[0], ShineButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShineButton) patchProxyResultProxy.result;
        }
        ShineButton shineButton = this.f80881k;
        if (shineButton != null) {
            return shineButton;
        }
        f0.S("iv_icon");
        return null;
    }

    public final void setChecked(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27747, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            setCardBackgroundColor(getContext().getResources().getColor(R.color.background_card_1_color));
            setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
            getIv_icon().setChecked(false, false);
            return;
        }
        if (this.f80884n) {
            setCardBackgroundColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        } else {
            setCardBackgroundColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        }
        setTextColor(getContext().getResources().getColor(R.color.white));
        if (this.f80884n && z11) {
            getIv_icon().setChecked(true, true);
        }
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27751, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80882l;
        if (textView == null) {
            f0.S("tv_desc");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setIcon(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27749, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_icon().setShapeResource(i10);
    }

    public final void setIv_icon(@d ShineButton shineButton) {
        if (PatchProxy.proxy(new Object[]{shineButton}, this, changeQuickRedirect, false, 27745, new Class[]{ShineButton.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shineButton, "<set-?>");
        this.f80881k = shineButton;
    }

    public final void setNum(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27752, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iQ = n.q(str);
        TextView textView = null;
        if (iQ == 0) {
            TextView textView2 = this.f80883m;
            if (textView2 == null) {
                f0.S("tv_num");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView3 = this.f80883m;
        if (textView3 == null) {
            f0.S("tv_num");
            textView3 = null;
        }
        textView3.setText(h(iQ));
        TextView textView4 = this.f80883m;
        if (textView4 == null) {
            f0.S("tv_num");
        } else {
            textView = textView4;
        }
        textView.setVisibility(0);
    }

    public final void setShowAnim(boolean z10) {
        this.f80884n = z10;
    }

    public final void setTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27750, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80882l;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_desc");
            textView = null;
        }
        textView.setTextColor(i10);
        TextView textView3 = this.f80883m;
        if (textView3 == null) {
            f0.S("tv_num");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(i10);
    }
}
