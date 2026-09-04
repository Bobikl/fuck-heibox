package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCard.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameCard extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86635d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f86636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86637c;

    public GameCard(@e Context context) {
        this(context, null);
    }

    public GameCard(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameCard(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameCard(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 36377, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_game, this);
        f0.o(viewInflate, "from(context).inflate(R.layout.item_game, this)");
        this.f86636b = viewInflate;
        findViewById(R.id.vg_game_item).setBackgroundResource(R.color.transparent);
        View viewFindViewById = findViewById(R.id.tv_follow_state);
        f0.o(viewFindViewById, "findViewById(R.id.tv_follow_state)");
        setTv_follow_state((TextView) viewFindViewById);
    }

    public final void b(@d GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 36378, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameObj, "gameObj");
        View view = this.f86636b;
        if (view == null) {
            f0.S(ChannelListActivity.q.f79586f);
            view = null;
        }
        r1.r1(new s.e(R.layout.item_game, view), gameObj, GameObj.KEY_POINT_FOLLOW_STATE);
    }

    @d
    public final TextView getTv_follow_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36375, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86637c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_follow_state");
        return null;
    }

    public final void setTv_follow_state(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36376, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86637c = textView;
    }
}
