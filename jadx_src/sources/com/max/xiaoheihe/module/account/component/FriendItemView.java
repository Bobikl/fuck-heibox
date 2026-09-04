package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FriendItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class FriendItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f78854p = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private TextView f78855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ImageView f78856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private ViewGroup f78857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TextView f78858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private TextView f78859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private ViewGroup f78860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private ImageView f78861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private TextView f78862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private ViewGroup f78863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private ImageView f78864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private TextView f78865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private ViewGroup f78866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private TextView f78867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private TextView f78868o;

    /* JADX INFO: compiled from: FriendItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24902, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l.r(FriendItemView.this.getContext());
        }
    }

    public FriendItemView(@dl.e Context context) {
        this(context, null);
    }

    public FriendItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FriendItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FriendItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 24881, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f76290f1);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.FriendItemView)");
        int color = typedArrayObtainStyledAttributes.getColor(3, getContext().getResources().getColor(R.color.text_secondary_1_color));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_friend_item, this);
        this.f78855b = (TextView) findViewById(R.id.tv_rank);
        this.f78856c = (ImageView) findViewById(R.id.iv_avatar);
        this.f78857d = (ViewGroup) findViewById(R.id.vg_account_info);
        this.f78858e = (TextView) findViewById(R.id.tv_nickname);
        this.f78859f = (TextView) findViewById(R.id.tv_status);
        this.f78860g = (ViewGroup) findViewById(R.id.vg_heybox_account);
        this.f78861h = (ImageView) findViewById(R.id.iv_heybox_avatar);
        this.f78862i = (TextView) findViewById(R.id.tv_heybox_nickname);
        this.f78863j = (ViewGroup) findViewById(R.id.vg_achievement_point);
        this.f78864k = (ImageView) findViewById(R.id.iv_achievement);
        this.f78865l = (TextView) findViewById(R.id.tv_achievement);
        this.f78866m = (ViewGroup) findViewById(R.id.vg_heybox_account_content);
        TextView textView = (TextView) findViewById(R.id.tv_invite);
        if (textView != null) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            textView = null;
        }
        this.f78867n = textView;
        this.f78868o = (TextView) findViewById(R.id.tv_avatar);
        b(false);
        setShowRank(z10);
        setShowAchievement(z11);
        setShowStatus(z12);
        setStatusColor(color);
        setInviteClickListener(new a());
        bb.d.d(this.f78855b, 2);
    }

    public final void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24900, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            TextView textView = this.f78868o;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ImageView imageView = this.f78856c;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f78868o;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView2 = this.f78856c;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @dl.e
    public final TextView getTextAvartar() {
        return this.f78868o;
    }

    @dl.e
    public final TextView getTv_status() {
        return this.f78859f;
    }

    @dl.e
    public final ViewGroup getVg_account_info() {
        return this.f78857d;
    }

    public final void setAchievementIcon(@dl.d Drawable icon) {
        if (PatchProxy.proxy(new Object[]{icon}, this, changeQuickRedirect, false, 24892, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(icon, "icon");
        ImageView imageView = this.f78864k;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setAchievementIcon(@dl.d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 24893, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        ImageView imageView = this.f78864k;
        if (imageView != null) {
            f0.m(imageView);
            com.max.hbimage.b.K(url, imageView);
        }
    }

    public final void setAchievementPoint(@dl.d String achievementPoint) {
        if (PatchProxy.proxy(new Object[]{achievementPoint}, this, changeQuickRedirect, false, 24887, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(achievementPoint, "achievementPoint");
        TextView textView = this.f78865l;
        if (textView == null) {
            return;
        }
        textView.setText(achievementPoint);
    }

    public final void setAvartar(@dl.d Drawable icon) {
        if (PatchProxy.proxy(new Object[]{icon}, this, changeQuickRedirect, false, 24888, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(icon, "icon");
        ImageView imageView = this.f78856c;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setAvartar(@dl.d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 24889, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        ImageView imageView = this.f78856c;
        if (imageView != null) {
            f0.m(imageView);
            com.max.hbimage.b.e0(url, imageView, ViewUtils.f(getContext(), 3.0f), R.drawable.common_default_avatar_40x40);
        }
    }

    public final void setHeyboxAccountClickListener(@dl.d View.OnClickListener l10) {
        if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 24895, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(l10, "l");
        ViewGroup viewGroup = this.f78860g;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(l10);
        }
    }

    public final void setHeyboxAvartar(@dl.d Drawable icon) {
        if (PatchProxy.proxy(new Object[]{icon}, this, changeQuickRedirect, false, 24890, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(icon, "icon");
        ImageView imageView = this.f78861h;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
    }

    public final void setHeyboxAvartar(@dl.d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 24891, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        ImageView imageView = this.f78861h;
        if (imageView != null) {
            f0.m(imageView);
            com.max.hbimage.b.I(url, imageView, R.drawable.common_default_avatar_40x40);
        }
    }

    public final void setHeyboxNickName(@dl.d String name) {
        if (PatchProxy.proxy(new Object[]{name}, this, changeQuickRedirect, false, 24884, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        TextView textView = this.f78862i;
        if (textView == null) {
            return;
        }
        textView.setText(name);
    }

    public final void setInviteClickListener(@dl.d View.OnClickListener l10) {
        if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, 24896, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(l10, "l");
        TextView textView = this.f78867n;
        if (textView != null) {
            textView.setOnClickListener(l10);
        }
    }

    public final void setIsMe(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24901, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            setBackgroundResource(R.color.divider_secondary_2_color);
        } else {
            setBackgroundResource(R.color.background_layer_2_color);
        }
    }

    public final void setNickName(@dl.d String name) {
        if (PatchProxy.proxy(new Object[]{name}, this, changeQuickRedirect, false, 24883, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        TextView textView = this.f78858e;
        if (textView == null) {
            return;
        }
        textView.setText(name);
    }

    public final void setRank(@dl.d String rank) {
        if (PatchProxy.proxy(new Object[]{rank}, this, changeQuickRedirect, false, 24882, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rank, "rank");
        int iQ = n.q(rank);
        if (1 <= iQ && iQ < 4) {
            TextView textView = this.f78855b;
            if (textView != null) {
                textView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
            }
        } else {
            TextView textView2 = this.f78855b;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            }
        }
        TextView textView3 = this.f78855b;
        if (textView3 == null) {
            return;
        }
        textView3.setText(rank);
    }

    public final void setShowAchievement(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24899, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            ViewGroup viewGroup = this.f78863j;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
            return;
        }
        ViewGroup viewGroup2 = this.f78863j;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    public final void setShowInvite(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24894, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            ViewGroup viewGroup = this.f78860g;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f78867n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        ViewGroup viewGroup2 = this.f78860g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        TextView textView2 = this.f78867n;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void setShowRank(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24898, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            TextView textView = this.f78855b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            setPadding(0, 0, 0, 0);
            return;
        }
        TextView textView2 = this.f78855b;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        setPadding(ViewUtils.f(getContext(), 12.0f), 0, 0, 0);
    }

    public final void setShowStatus(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24897, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            TextView textView = this.f78859f;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = this.f78859f;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void setStatusColor(int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24886, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.f78859f) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    public final void setStatusText(@dl.d String status) {
        if (PatchProxy.proxy(new Object[]{status}, this, changeQuickRedirect, false, 24885, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(status, "status");
        TextView textView = this.f78859f;
        if (textView != null) {
            textView.setText(status);
        }
        setShowStatus(true);
    }

    public final void setTv_status(@dl.e TextView textView) {
        this.f78859f = textView;
    }

    public final void setVg_account_info(@dl.e ViewGroup viewGroup) {
        this.f78857d = viewGroup;
    }
}
