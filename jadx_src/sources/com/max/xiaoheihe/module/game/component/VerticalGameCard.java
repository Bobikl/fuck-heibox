package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: VerticalGameCard.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class VerticalGameCard extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87013c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f87014b;

    /* JADX INFO: compiled from: VerticalGameCard.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f87016c;

        a(GameObj gameObj) {
            this.f87016c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37065, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VerticalGameCard.this.getContext().startActivity(z.b(VerticalGameCard.this.getContext(), this.f87016c.getH_src(), this.f87016c.getAppid(), null, null, i0.m(), i0.j(), null));
        }
    }

    public VerticalGameCard(@e Context context) {
        this(context, null);
    }

    public VerticalGameCard(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGameCard(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public VerticalGameCard(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 37063, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_vertical_game, this);
        f0.o(viewInflate, "from(context).inflate(R.…item_vertical_game, this)");
        this.f87014b = viewInflate;
        findViewById(R.id.vg_game_item).setBackgroundResource(R.color.transparent);
    }

    public final void b(@d GameObj data, @e String str, int i10) {
        if (PatchProxy.proxy(new Object[]{data, str, new Integer(i10)}, this, changeQuickRedirect, false, 37064, new Class[]{GameObj.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        View view = this.f87014b;
        View view2 = null;
        if (view == null) {
            f0.S(ChannelListActivity.q.f79586f);
            view = null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        View view3 = this.f87014b;
        if (view3 == null) {
            f0.S(ChannelListActivity.q.f79586f);
            view3 = null;
        }
        TextView textView = (TextView) view3.findViewById(R.id.tv_name);
        View view4 = this.f87014b;
        if (view4 == null) {
            f0.S(ChannelListActivity.q.f79586f);
            view4 = null;
        }
        TextView textView2 = (TextView) view4.findViewById(R.id.tv_scrim);
        int i11 = (int) (((i10 * 50.0f) / 105.0f) + 0.5f);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            imageView.setLayoutParams(layoutParams);
        }
        com.max.hbimage.b.e0(data.getImage(), imageView, ViewUtils.f(getContext(), 3.0f), R.drawable.common_default_placeholder_375x210);
        View view5 = this.f87014b;
        if (view5 == null) {
            f0.S(ChannelListActivity.q.f79586f);
            view5 = null;
        }
        r1.A(new s.e(R.layout.item_vertical_game, view5), data);
        textView.setMaxWidth(i10);
        textView.setText(data.getName());
        if (com.max.hbcommon.utils.c.u(str)) {
            textView2.setVisibility(8);
        } else {
            v0 v0Var = v0.f124986a;
            String string = getContext().getResources().getString(R.string.total_roll_item_num_format);
            f0.o(string, "context.resources.getStr…tal_roll_item_num_format)");
            String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            f0.o(str2, "format(format, *args)");
            textView2.setText(str2);
            textView2.setVisibility(0);
            textView2.setBackground(q.o(getContext(), R.color.black_alpha50, 3.0f));
        }
        if (com.max.hbcommon.utils.c.u(data.getAppid())) {
            View view6 = this.f87014b;
            if (view6 == null) {
                f0.S(ChannelListActivity.q.f79586f);
                view6 = null;
            }
            view6.setClickable(false);
        } else {
            View view7 = this.f87014b;
            if (view7 == null) {
                f0.S(ChannelListActivity.q.f79586f);
                view7 = null;
            }
            view7.setClickable(true);
            View view8 = this.f87014b;
            if (view8 == null) {
                f0.S(ChannelListActivity.q.f79586f);
                view8 = null;
            }
            view8.setOnClickListener(new a(data));
        }
        View view9 = this.f87014b;
        if (view9 == null) {
            f0.S(ChannelListActivity.q.f79586f);
        } else {
            view2 = view9;
        }
        r1.P1(new s.e(R.layout.item_vertical_game, view2), data.getScore_desc(), data.getScore());
    }
}
