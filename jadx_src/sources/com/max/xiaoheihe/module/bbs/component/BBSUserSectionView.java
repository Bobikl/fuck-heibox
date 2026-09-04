package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.accelworld.s;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.max.xiaoheihe.module.account.component.UserLevelView;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeComment;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: BBSUserSectionView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBBSUserSectionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSUserSectionView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSUserSectionView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,921:1\n262#2,2:922\n262#2,2:924\n262#2,2:926\n262#2,2:928\n262#2,2:930\n262#2,2:932\n262#2,2:934\n262#2,2:936\n*S KotlinDebug\n*F\n+ 1 BBSUserSectionView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSUserSectionView\n*L\n521#1:922,2\n685#1:924,2\n690#1:926,2\n691#1:928,2\n694#1:930,2\n695#1:932,2\n698#1:934,2\n699#1:936,2\n*E\n"})
@o(parameters = 0)
public class BBSUserSectionView extends RelativeLayout implements com.max.xiaoheihe.module.bbs.component.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final a f80844v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f80845w = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HeyBoxAvatarView f80846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f80847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f80848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f80849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UserLevelView f80850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f80851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HBUiKitView f80852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BBSLinkListLikeComment f80853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GameRateStarView f80854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f80855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f80856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f80857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f80858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f80859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f80860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f80861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f80862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RelativeLayout f80863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout f80864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f80865u;

    /* JADX INFO: compiled from: BBSUserSectionView.kt */
    public enum BBSUserSectionType {
        Link,
        LinkComment,
        LinkCommentV2,
        GameComment,
        FOLLOW,
        FOLLOW_V2,
        STORY;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static BBSUserSectionType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 27734, new Class[]{String.class}, BBSUserSectionType.class);
            return (BBSUserSectionType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(BBSUserSectionType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BBSUserSectionType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27733, new Class[0], BBSUserSectionType[].class);
            return (BBSUserSectionType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: BBSUserSectionView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.component.BBSUserSectionView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BBSUserSectionView.kt */
        public static final class ViewOnClickListenerC0693a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RelativeLayout f80866b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f80867c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<UserMedalObj> f80868d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<UserMedalObj> f80869e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f80870f;

            /* JADX WARN: Multi-variable type inference failed */
            ViewOnClickListenerC0693a(RelativeLayout relativeLayout, Context context, List<? extends UserMedalObj> list, List<? extends UserMedalObj> list2, String str) {
                this.f80866b = relativeLayout;
                this.f80867c = context;
                this.f80868d = list;
                this.f80869e = list2;
                this.f80870f = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27737, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int iV = ViewUtils.V(this.f80866b);
                int[] iArr = new int[2];
                this.f80866b.getLocationOnScreen(iArr);
                com.max.xiaoheihe.utils.d.E1(this.f80867c, this.f80866b, ViewUtils.f(this.f80867c, 20.0f), iArr[1] + iV + ViewUtils.f(this.f80867c, 10.0f), this.f80868d, this.f80869e, null, this.f80870f);
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, RelativeLayout relativeLayout, Context context, List list, List list2, String str, boolean z10, int i10, Object obj) {
            boolean z11 = z10;
            if (PatchProxy.proxy(new Object[]{aVar, relativeLayout, context, list, list2, str, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 27736, new Class[]{a.class, RelativeLayout.class, Context.class, List.class, List.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 32) != 0) {
                z11 = true;
            }
            aVar.a(relativeLayout, context, list, list2, str, z11);
        }

        public final void a(@dl.d RelativeLayout rl_medal_level, @dl.d Context context, @e List<? extends UserMedalObj> list, @e List<? extends UserMedalObj> list2, @e String str, boolean z10) {
            boolean z11;
            char c10;
            int iS;
            int i10 = 0;
            boolean z12 = true;
            if (PatchProxy.proxy(new Object[]{rl_medal_level, context, list, list2, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27735, new Class[]{RelativeLayout.class, Context.class, List.class, List.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(rl_medal_level, "rl_medal_level");
            f0.p(context, "context");
            rl_medal_level.setVisibility(0);
            rl_medal_level.removeAllViews();
            int size = list != null ? list.size() : 0;
            char c11 = 0;
            int iF = ViewUtils.f(context, 14.0f);
            int iF2 = ViewUtils.f(context, 4.0f);
            int i11 = z10 ? iF2 : 0;
            if (size > 0) {
                int i12 = 0;
                while (i12 < size) {
                    f0.m(list);
                    UserMedalObj userMedalObj = list.get(i12);
                    ImageView imageView = new ImageView(context);
                    if (com.max.hbcommon.utils.c.u(userMedalObj.getName_short())) {
                        char c12 = c11;
                        z11 = z12;
                        c10 = c12;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
                        layoutParams.addRule(15);
                        layoutParams.setMargins(i11, 0, 0, 0);
                        imageView.setLayoutParams(layoutParams);
                        com.max.hbimage.b.K(userMedalObj.getImg_url(), imageView);
                        rl_medal_level.addView(imageView);
                        iS = iF + iF2;
                    } else {
                        TextView textView = new TextView(context);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, iF);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iF, iF);
                        layoutParams2.addRule(15);
                        int i13 = iF / 2;
                        layoutParams2.setMargins(i11 + i13, i10, i10, i10);
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                        textView.setLayoutParams(layoutParams2);
                        textView.setGravity(17);
                        textView.setPadding(ViewUtils.f(context, 10.0f), 0, ViewUtils.f(context, 4.0f), 0);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setCornerRadius(ViewUtils.f(context, 1.0f));
                        gradientDrawable.setColor(com.max.xiaoheihe.utils.d.e1(userMedalObj.getColor()));
                        textView.setBackgroundDrawable(gradientDrawable);
                        textView.getBackground().setAlpha(85);
                        textView.setTextColor(com.max.xiaoheihe.utils.d.e1(userMedalObj.getColor()));
                        textView.setText(userMedalObj.getName_short());
                        z11 = true;
                        textView.setTextSize(1, 7.0f);
                        layoutParams3.addRule(15);
                        layoutParams3.setMargins(i11, 0, 0, 0);
                        imageView.setLayoutParams(layoutParams3);
                        com.max.hbimage.b.K(userMedalObj.getImg_url(), imageView);
                        rl_medal_level.addView(textView);
                        rl_medal_level.addView(imageView);
                        TextPaint paint = textView.getPaint();
                        f0.o(paint, "medalName.paint");
                        c10 = 0;
                        iS = (int) (ViewUtils.S(paint, userMedalObj.getName_short()) + i13 + iF2 + ViewUtils.f(context, 14.0f));
                    }
                    i11 += iS;
                    i12++;
                    i10 = 0;
                    boolean z13 = z11;
                    c11 = c10;
                    z12 = z13;
                }
            }
            if (rl_medal_level.getChildCount() <= 0) {
                rl_medal_level.setVisibility(8);
            } else {
                rl_medal_level.setVisibility(0);
                rl_medal_level.setOnClickListener(new ViewOnClickListenerC0693a(rl_medal_level, context, list, list2, str));
            }
        }
    }

    /* JADX INFO: compiled from: BBSUserSectionView.kt */
    @o(parameters = 0)
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f80871f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<View> f80872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final WeakReference<ViewGroup> f80873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final WeakReference<View> f80874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final WeakReference<View> f80875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final WeakReference<View> f80876e;

        public b(@dl.d View avatarView, @dl.d ViewGroup topView, @dl.d View nameView, @dl.d View rlMedalLevel, @dl.d View userLevel) {
            f0.p(avatarView, "avatarView");
            f0.p(topView, "topView");
            f0.p(nameView, "nameView");
            f0.p(rlMedalLevel, "rlMedalLevel");
            f0.p(userLevel, "userLevel");
            this.f80872a = new WeakReference<>(avatarView);
            this.f80873b = new WeakReference<>(topView);
            this.f80874c = new WeakReference<>(nameView);
            this.f80875d = new WeakReference<>(rlMedalLevel);
            this.f80876e = new WeakReference<>(userLevel);
        }

        @e
        public final View a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27738, new Class[0], View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.f80872a.get();
        }

        @e
        public final View b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27742, new Class[0], View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.f80874c.get();
        }

        @e
        public final View c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27740, new Class[0], View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.f80875d.get();
        }

        @e
        public final ViewGroup d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27739, new Class[0], ViewGroup.class);
            return patchProxyResultProxy.isSupported ? (ViewGroup) patchProxyResultProxy.result : this.f80873b.get();
        }

        @e
        public final View e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27741, new Class[0], View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.f80876e.get();
        }
    }

    /* JADX INFO: compiled from: BBSUserSectionView.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80877a;

        static {
            int[] iArr = new int[BBSUserSectionType.valuesCustom().length];
            try {
                iArr[BBSUserSectionType.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BBSUserSectionType.LinkComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BBSUserSectionType.LinkCommentV2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BBSUserSectionType.GameComment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BBSUserSectionType.FOLLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BBSUserSectionType.FOLLOW_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BBSUserSectionType.STORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f80877a = iArr;
        }
    }

    /* JADX INFO: compiled from: BBSUserSectionView.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f80879c;

        d(LinkInfoObj linkInfoObj, Context context) {
            this.f80878b = linkInfoObj;
            this.f80879c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27743, new Class[]{View.class}, Void.TYPE).isSupported || this.f80878b.getUser() == null || com.max.hbcommon.utils.c.u(this.f80878b.getUser().getUserid())) {
                return;
            }
            Context context = this.f80879c;
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.T(context, this.f80878b.getUser().getUserid()).A();
        }
    }

    public BBSUserSectionView(@e Context context) {
        this(context, null);
    }

    public BBSUserSectionView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSUserSectionView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSUserSectionView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        d();
        g(attributeSet);
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27711, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setAvartar(new HeyBoxAvatarView(getContext()));
        getAvartar().setId(R.id.bbs_avartar);
        int iF = ViewUtils.f(getContext(), 48.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        addView(getAvartar(), layoutParams);
        int iF2 = ViewUtils.f(getContext(), 6.0f);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f80863s = relativeLayout;
        relativeLayout.setId(R.id.bbs_user_section_top_view);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, R.id.bbs_avartar);
        layoutParams2.addRule(6, R.id.bbs_avartar);
        layoutParams2.topMargin = ViewUtils.f(getContext(), 6.0f);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 2.0f);
        View view = this.f80863s;
        if (view == null) {
            f0.S("topView");
            view = null;
        }
        addView(view, layoutParams2);
        setTv_name(new TextView(getContext()));
        getTv_name().setId(R.id.bbs_name);
        getTv_name().setTextSize(ViewUtils.g(getContext(), 14.0f));
        getTv_name().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        getTv_name().setGravity(17);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        RelativeLayout relativeLayout2 = this.f80863s;
        if (relativeLayout2 == null) {
            f0.S("topView");
            relativeLayout2 = null;
        }
        relativeLayout2.addView(getTv_name(), layoutParams3);
        setIv_author(new ImageView(getContext()));
        getIv_author().setId(R.id.bbs_author);
        getIv_author().setImageResource(R.drawable.ic_author_gradient);
        getIv_author().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 24.0f), ViewUtils.f(getContext(), 13.0f));
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iF2;
        layoutParams4.addRule(1, R.id.bbs_name);
        RelativeLayout relativeLayout3 = this.f80863s;
        if (relativeLayout3 == null) {
            f0.S("topView");
            relativeLayout3 = null;
        }
        relativeLayout3.addView(getIv_author(), layoutParams4);
        setRl_medal_level(new RelativeLayout(getContext()));
        getRl_medal_level().setId(R.id.bbs_medal);
        getRl_medal_level().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(15);
        layoutParams5.addRule(1, R.id.bbs_author);
        layoutParams5.leftMargin = iF2 - ViewUtils.f(getContext(), 4.0f);
        RelativeLayout relativeLayout4 = this.f80863s;
        if (relativeLayout4 == null) {
            f0.S("topView");
            relativeLayout4 = null;
        }
        relativeLayout4.addView(getRl_medal_level(), layoutParams5);
        setUserLevel(new UserLevelView(getContext()));
        getUserLevel().setId(R.id.bbs_user_level);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(1, R.id.bbs_medal);
        layoutParams6.leftMargin = iF2;
        RelativeLayout relativeLayout5 = this.f80863s;
        if (relativeLayout5 == null) {
            f0.S("topView");
            relativeLayout5 = null;
        }
        relativeLayout5.addView(getUserLevel(), layoutParams6);
        setLl_top_last(new LinearLayout(getContext()));
        getLl_top_last().setOrientation(0);
        getLl_top_last().setGravity(16);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(1, R.id.bbs_user_level);
        layoutParams7.addRule(15);
        RelativeLayout relativeLayout6 = this.f80863s;
        if (relativeLayout6 == null) {
            f0.S("topView");
            relativeLayout6 = null;
        }
        relativeLayout6.addView(getLl_top_last(), layoutParams7);
        setExtra_tag(new TextView(getContext()));
        getExtra_tag().setTextSize(ViewUtils.g(getContext(), 9.0f));
        getExtra_tag().setGravity(17);
        getExtra_tag().setBackground(q.o(getContext(), R.color.divider_secondary_1_color, 2.0f));
        getExtra_tag().setPadding(ViewUtils.f(getContext(), 5.0f), 0, ViewUtils.f(getContext(), 5.0f), 0);
        getExtra_tag().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        getExtra_tag().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 16.0f));
        layoutParams8.addRule(15);
        layoutParams8.leftMargin = ViewUtils.f(getContext(), 4.0f);
        getLl_top_last().addView(getExtra_tag(), layoutParams8);
        Context context = getContext();
        f0.o(context, "context");
        setExtra_tag_v2(new HBUiKitView(context));
        getLl_top_last().addView(getExtra_tag_v2(), new LinearLayout.LayoutParams(-2, -2));
        setLikeComment(new BBSLinkListLikeComment(getContext()));
        getLikeComment().setType(BBSLinkListLikeComment.Type.Comment);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(6, R.id.bbs_user_section_top_view);
        layoutParams9.addRule(8, R.id.bbs_user_section_top_view);
        layoutParams9.addRule(7, R.id.bbs_user_section_top_view);
        addView(getLikeComment(), layoutParams9);
        setLl_top_algin_right(new LinearLayout(getContext()));
        getLl_top_algin_right().setOrientation(0);
        getLl_top_algin_right().setGravity(16);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(11);
        layoutParams10.addRule(15);
        RelativeLayout relativeLayout7 = this.f80863s;
        if (relativeLayout7 == null) {
            f0.S("topView");
            relativeLayout7 = null;
        }
        relativeLayout7.addView(getLl_top_algin_right(), layoutParams10);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f80864t = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f80864t;
        if (linearLayout2 == null) {
            f0.S("bottomView");
            linearLayout2 = null;
        }
        linearLayout2.setGravity(16);
        LinearLayout linearLayout3 = this.f80864t;
        if (linearLayout3 == null) {
            f0.S("bottomView");
            linearLayout3 = null;
        }
        linearLayout3.setMinimumHeight(ViewUtils.f(getContext(), 20.0f));
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams11.addRule(1, R.id.bbs_avartar);
        layoutParams11.addRule(8, R.id.bbs_avartar);
        layoutParams11.bottomMargin = ViewUtils.f(getContext(), 3.0f);
        layoutParams11.leftMargin = ViewUtils.f(getContext(), 3.0f);
        View view2 = this.f80864t;
        if (view2 == null) {
            f0.S("bottomView");
            view2 = null;
        }
        addView(view2, layoutParams11);
        setLl_bottom_left(new LinearLayout(getContext()));
        getLl_bottom_left().setGravity(16);
        getLl_bottom_left().setOrientation(0);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout4 = this.f80864t;
        if (linearLayout4 == null) {
            f0.S("bottomView");
            linearLayout4 = null;
        }
        linearLayout4.addView(getLl_bottom_left(), layoutParams12);
        GameRateStarView gameRateStarView = new GameRateStarView(getContext());
        this.f80854j = gameRateStarView;
        gameRateStarView.setId(R.id.bbs_rating);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout5 = this.f80864t;
        if (linearLayout5 == null) {
            f0.S("bottomView");
            linearLayout5 = null;
        }
        GameRateStarView gameRateStarView2 = this.f80854j;
        if (gameRateStarView2 == null) {
            f0.S("rating_star");
            gameRateStarView2 = null;
        }
        linearLayout5.addView(gameRateStarView2, layoutParams13);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.bbs_rating_arrow);
        this.f80855k = frameLayout;
        ViewUtils.m(frameLayout.getContext(), ViewUtils.f(frameLayout.getContext(), 12.0f), ViewUtils.f(frameLayout.getContext(), 12.0f));
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        appCompatImageView.setImageResource(R.drawable.common_arrow_down_filled_24x24);
        appCompatImageView.setColorFilter(androidx.core.content.d.f(appCompatImageView.getContext(), R.color.text_secondary_1_color));
        appCompatImageView.setBackground(q.o(appCompatImageView.getContext(), R.color.arrow_bg, 2.0f));
        int iF3 = ViewUtils.f(appCompatImageView.getContext(), 2.0f);
        appCompatImageView.setPadding(iF3, iF3, iF3, iF3);
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(ViewUtils.f(frameLayout.getContext(), 12.0f), ViewUtils.f(frameLayout.getContext(), 12.0f)));
        frameLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 12.0f), ViewUtils.f(getContext(), 12.0f));
        layoutParams14.leftMargin = iF2;
        LinearLayout linearLayout6 = this.f80864t;
        if (linearLayout6 == null) {
            f0.S("bottomView");
            linearLayout6 = null;
        }
        FrameLayout frameLayout2 = this.f80855k;
        if (frameLayout2 == null) {
            f0.S("rating_star_arrow_view");
            frameLayout2 = null;
        }
        linearLayout6.addView(frameLayout2, layoutParams14);
        setLl_bottom_tag(new LinearLayout(getContext()));
        getLl_bottom_tag().setGravity(16);
        getLl_bottom_tag().setOrientation(0);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout7 = this.f80864t;
        if (linearLayout7 == null) {
            f0.S("bottomView");
            linearLayout7 = null;
        }
        linearLayout7.addView(getLl_bottom_tag(), layoutParams15);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.bbs_desc);
        textView.setTextSize(ViewUtils.g(textView.getContext(), 10.0f));
        textView.setTextColor(androidx.core.content.d.f(textView.getContext(), R.color.text_secondary_1_color));
        setTv_desc(textView);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams16.leftMargin = iF2;
        LinearLayout linearLayout8 = this.f80864t;
        if (linearLayout8 == null) {
            f0.S("bottomView");
            linearLayout8 = null;
        }
        linearLayout8.addView(getTv_desc(), layoutParams16);
        setIv_not_interested(new ImageView(getContext()));
        getIv_not_interested().setImageResource(R.drawable.ic_close_oval_20);
        getIv_not_interested().setVisibility(8);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 20.0f), ViewUtils.f(getContext(), 20.0f));
        layoutParams17.leftMargin = ViewUtils.f(getContext(), 2.0f);
        LinearLayout linearLayout9 = this.f80864t;
        if (linearLayout9 == null) {
            f0.S("bottomView");
            linearLayout9 = null;
        }
        linearLayout9.addView(getIv_not_interested(), layoutParams17);
        setIv_more(new ImageView(getContext()));
        getIv_more().setImageResource(R.drawable.common_more_line_24x24);
        getIv_more().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        getIv_more().setVisibility(8);
        int iF4 = ViewUtils.f(getContext(), 6.0f);
        getIv_more().setPadding(iF4, iF4, ViewUtils.f(getContext(), 2.0f), iF4);
        RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 24.0f), ViewUtils.f(getContext(), 28.0f));
        layoutParams18.addRule(11);
        addView(getIv_more(), layoutParams18);
        setTv_follow(new TextView(getContext()));
        RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 24.0f));
        layoutParams19.addRule(21);
        layoutParams19.addRule(15);
        getTv_follow().setGravity(17);
        getTv_follow().setTextSize(1, 12.0f);
        getTv_follow().setPadding(ViewUtils.f(getContext(), 4.0f), 0, ViewUtils.f(getContext(), 6.0f), 0);
        getTv_follow().setCompoundDrawablePadding(ViewUtils.f(getContext(), 2.0f));
        addView(getTv_follow(), layoutParams19);
        getTv_follow().setVisibility(8);
    }

    private final void g(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 27712, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.B);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.BBSUserSection)");
        typedArrayObtainStyledAttributes.getInt(0, 0);
    }

    public static /* synthetic */ void setAvatarType$default(BBSUserSectionView bBSUserSectionView, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bBSUserSectionView, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 27715, new Class[]{BBSUserSectionView.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAvatarType");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bBSUserSectionView.setAvatarType(z10);
    }

    public static /* synthetic */ void setData$default(BBSUserSectionView bBSUserSectionView, LinkInfoObj linkInfoObj, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bBSUserSectionView, linkInfoObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 27726, new Class[]{BBSUserSectionView.class, LinkInfoObj.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        bBSUserSectionView.setData(linkInfoObj, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void a(@e List<? extends UserMedalObj> list, @e List<? extends UserMedalObj> list2, @e String str) {
        if (PatchProxy.proxy(new Object[]{list, list2, str}, this, changeQuickRedirect, false, 27721, new Class[]{List.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = f80844v;
        RelativeLayout rl_medal_level = getRl_medal_level();
        Context context = getContext();
        f0.o(context, "context");
        a.b(aVar, rl_medal_level, context, list, list2, str, false, 32, null);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27723, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getUserLevel().setVisibility(z10 ? 0 : 8);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    @dl.d
    public HeyBoxAvatarView getAvartar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27679, new Class[0], HeyBoxAvatarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyBoxAvatarView) patchProxyResultProxy.result;
        }
        HeyBoxAvatarView heyBoxAvatarView = this.f80846b;
        if (heyBoxAvatarView != null) {
            return heyBoxAvatarView;
        }
        f0.S("avartar");
        return null;
    }

    @dl.d
    public final TextView getExtra_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27689, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80851g;
        if (textView != null) {
            return textView;
        }
        f0.S("extra_tag");
        return null;
    }

    @dl.d
    public final HBUiKitView getExtra_tag_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27691, new Class[0], HBUiKitView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBUiKitView) patchProxyResultProxy.result;
        }
        HBUiKitView hBUiKitView = this.f80852h;
        if (hBUiKitView != null) {
            return hBUiKitView;
        }
        f0.S("extra_tag_v2");
        return null;
    }

    @dl.d
    public final ImageView getIv_author() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27683, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80848d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_author");
        return null;
    }

    @dl.d
    public final ImageView getIv_more() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27707, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80862r;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_more");
        return null;
    }

    @dl.d
    public final ImageView getIv_not_interested() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27697, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80857m;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_not_interested");
        return null;
    }

    @dl.d
    public final BBSLinkListLikeComment getLikeComment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27693, new Class[0], BBSLinkListLikeComment.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkListLikeComment) patchProxyResultProxy.result;
        }
        BBSLinkListLikeComment bBSLinkListLikeComment = this.f80853i;
        if (bBSLinkListLikeComment != null) {
            return bBSLinkListLikeComment;
        }
        f0.S("likeComment");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_bottom_left() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27699, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80858n;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_bottom_left");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_bottom_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27705, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80861q;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_bottom_tag");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_top_algin_right() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27703, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80860p;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_top_algin_right");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_top_last() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27701, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80859o;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_top_last");
        return null;
    }

    @dl.d
    public final View getRatingArrowView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27731, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f80855k;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("rating_star_arrow_view");
        return null;
    }

    @dl.d
    public final RelativeLayout getRl_medal_level() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27685, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f80849e;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("rl_medal_level");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27695, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80856l;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_follow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27709, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80865u;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_follow");
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    @dl.d
    public TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27681, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80847c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @dl.d
    public final UserLevelView getUserLevel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27687, new Class[0], UserLevelView.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserLevelView) patchProxyResultProxy.result;
        }
        UserLevelView userLevelView = this.f80850f;
        if (userLevelView != null) {
            return userLevelView;
        }
        f0.S("userLevel");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@dl.d LinkInfoObj data, boolean z10) {
        FrameLayout frameLayout;
        GameRateStarView gameRateStarView;
        FrameLayout frameLayout2;
        String strP;
        if (PatchProxy.proxy(new Object[]{data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27728, new Class[]{LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        Context context = getContext();
        if (data.getUser() != null) {
            if (f0.g("14", data.getLink_tag())) {
                i(false);
                getLl_bottom_tag().setVisibility(0);
            } else {
                i(true);
                getLl_bottom_tag().setVisibility(0);
            }
            if (z10) {
                getAvartar().setAvatar(data.getUser().getAvartar(), data.getUser().getAvatar_decoration());
            } else {
                getAvartar().setAvatar(data.getUser().getAvartar(), ViewUtils.f(context, 2.0f));
            }
            if (data.getSource_info() != null) {
                getAvartar().setOnClickListener(null);
                setRating(0.0f);
                FrameLayout frameLayout3 = this.f80855k;
                if (frameLayout3 == null) {
                    f0.S("rating_star_arrow_view");
                    frameLayout3 = null;
                }
                frameLayout3.setVisibility(8);
            } else {
                getAvartar().setOnClickListener(new d(data, context));
                setRating(n.p(data.getScore()));
                if (com.max.hbcommon.utils.c.w(data.getMultidimensional_score())) {
                    frameLayout = this.f80855k;
                    if (frameLayout == null) {
                        f0.S("rating_star_arrow_view");
                        frameLayout = null;
                    }
                    frameLayout.setVisibility(8);
                    gameRateStarView = this.f80854j;
                    if (gameRateStarView == null) {
                        f0.S("rating_star");
                        gameRateStarView = null;
                    }
                    gameRateStarView.setOnClickListener(null);
                    frameLayout2 = this.f80855k;
                    if (frameLayout2 == null) {
                        f0.S("rating_star_arrow_view");
                        frameLayout2 = null;
                    }
                    frameLayout2.setOnClickListener(null);
                } else {
                    GameRateStarView gameRateStarView2 = this.f80854j;
                    if (gameRateStarView2 == null) {
                        f0.S("rating_star");
                        gameRateStarView2 = null;
                    }
                    if (gameRateStarView2.getVisibility() == 0) {
                        FrameLayout frameLayout4 = this.f80855k;
                        if (frameLayout4 == null) {
                            f0.S("rating_star_arrow_view");
                            frameLayout4 = null;
                        }
                        frameLayout4.setVisibility(0);
                    } else {
                        frameLayout = this.f80855k;
                        if (frameLayout == null) {
                            f0.S("rating_star_arrow_view");
                            frameLayout = null;
                        }
                        frameLayout.setVisibility(8);
                        gameRateStarView = this.f80854j;
                        if (gameRateStarView == null) {
                            f0.S("rating_star");
                            gameRateStarView = null;
                        }
                        gameRateStarView.setOnClickListener(null);
                        frameLayout2 = this.f80855k;
                        if (frameLayout2 == null) {
                            f0.S("rating_star_arrow_view");
                            frameLayout2 = null;
                        }
                        frameLayout2.setOnClickListener(null);
                    }
                }
            }
            setName(data.getUser().getUsername());
            a(data.getUser().getMedal(), data.getUser().getMedals(), data.getUser().getUserid());
            if (n.r(data.getModify_at()) > n.r(data.getCreate_at())) {
                String strP2 = ad.a.b(ad.a.G, false, 2, null) ? w.p(context, n.r(data.getModify_at())) : w.s(context, n.r(data.getModify_at()));
                v0 v0Var = v0.f124986a;
                String string = context.getResources().getString(R.string.modify_at_format);
                f0.o(string, "context.resources.getStr….string.modify_at_format)");
                strP = String.format(string, Arrays.copyOf(new Object[]{strP2}, 1));
                f0.o(strP, "format(format, *args)");
            } else {
                strP = ad.a.b(ad.a.G, false, 2, null) ? w.p(context, n.r(data.getCreate_at())) : w.s(context, n.r(data.getCreate_at()));
            }
            if (data.getSpecial_tag() != null) {
                getUserLevel().setVisibility(0);
                getUserLevel().setSpecialTag(data.getSpecial_tag());
            } else {
                getUserLevel().setVisibility(8);
            }
            StringBuilder sb2 = new StringBuilder();
            if (!com.max.hbcommon.utils.c.u(data.getPlay_state())) {
                sb2.append(data.getPlay_state());
            }
            if (!com.max.hbcommon.utils.c.u(strP)) {
                if ((sb2.length() > 0) != false) {
                    sb2.append("·");
                }
                sb2.append(strP);
            }
            if (!com.max.hbcommon.utils.c.u(data.getIp_location())) {
                if (sb2.length() > 0) {
                    sb2.append("·");
                }
                sb2.append(data.getIp_location());
            }
            setDesc(sb2.toString());
        }
        getLl_top_last().removeAllViews();
        if (f0.g("1", data.getOfficial_reply())) {
            TextView textView = new TextView(context);
            textView.setPadding(ViewUtils.f(context, 2.0f), ViewUtils.f(context, 0.5f), ViewUtils.f(context, 2.0f), ViewUtils.f(context, 0.5f));
            textView.setText(R.string.official_reply);
            textView.setTextColor(context.getResources().getColor(R.color.white));
            textView.setTextSize(1, 9.0f);
            textView.setBackgroundResource(R.drawable.interactive_2dp);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
            getLl_top_last().addView(textView, layoutParams);
        }
    }

    public final void i(boolean z10) {
        LinearLayout.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27717, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            GameRateStarView gameRateStarView = this.f80854j;
            if (gameRateStarView == null) {
                f0.S("rating_star");
                gameRateStarView = null;
            }
            gameRateStarView.setVisibility(0);
            FrameLayout frameLayout = this.f80855k;
            if (frameLayout == null) {
                f0.S("rating_star_arrow_view");
                frameLayout = null;
            }
            frameLayout.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = getTv_desc().getLayoutParams();
            layoutParams = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.leftMargin = ViewUtils.f(getContext(), 6.0f);
            return;
        }
        GameRateStarView gameRateStarView2 = this.f80854j;
        if (gameRateStarView2 == null) {
            f0.S("rating_star");
            gameRateStarView2 = null;
        }
        gameRateStarView2.setVisibility(8);
        FrameLayout frameLayout2 = this.f80855k;
        if (frameLayout2 == null) {
            f0.S("rating_star_arrow_view");
            frameLayout2 = null;
        }
        frameLayout2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = getTv_desc().getLayoutParams();
        layoutParams = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.leftMargin = 0;
    }

    @dl.d
    public final b j(@e BBSUserInfoObj bBSUserInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 27716, new Class[]{BBSUserInfoObj.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        LinkInfoObj linkInfoObj = new LinkInfoObj();
        linkInfoObj.setUser(bBSUserInfoObj);
        setType(BBSUserSectionType.STORY);
        getLl_bottom_tag().removeAllViews();
        h(linkInfoObj, true);
        HeyBoxAvatarView avartar = getAvartar();
        RelativeLayout relativeLayout = this.f80863s;
        if (relativeLayout == null) {
            f0.S("topView");
            relativeLayout = null;
        }
        TextView tv_name = getTv_name();
        RelativeLayout rl_medal_level = getRl_medal_level();
        UserLevelView userLevel = getUserLevel();
        removeAllViews();
        return new b(avartar, relativeLayout, tv_name, rl_medal_level, userLevel);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setAvartar(@dl.d HeyBoxAvatarView heyBoxAvatarView) {
        if (PatchProxy.proxy(new Object[]{heyBoxAvatarView}, this, changeQuickRedirect, false, 27680, new Class[]{HeyBoxAvatarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(heyBoxAvatarView, "<set-?>");
        this.f80846b = heyBoxAvatarView;
    }

    public final void setAvatarType(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27714, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getAvartar().getLayoutParams();
        int iF = z10 ? ViewUtils.f(getContext(), 42.0f) : ViewUtils.f(getContext(), 48.0f);
        layoutParams.width = iF;
        layoutParams.height = iF;
        getAvartar().setLayoutParams(layoutParams);
    }

    public final void setDarkStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27732, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setTextColor(-1);
        l.v(getTv_desc(), R.color.white_alpha60);
        getLikeComment().setDarkStyle();
    }

    public final void setData(@dl.d LinkInfoObj data, @e String str) {
        if (PatchProxy.proxy(new Object[]{data, str}, this, changeQuickRedirect, false, 27725, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        getLikeComment().setVisibility(8);
        setType(BBSUserSectionType.GameComment);
        getLl_bottom_tag().removeAllViews();
        i(true);
        h(data, true);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27719, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setExtraTag(@e String str, @e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{str, uiKitViewObj}, this, changeQuickRedirect, false, 27724, new Class[]{String.class, UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (uiKitViewObj != null) {
            getExtra_tag().setVisibility(8);
            getExtra_tag_v2().setVisibility(0);
            getExtra_tag_v2().setDataToCreate(uiKitViewObj);
        } else if (com.max.hbcommon.utils.c.u(str)) {
            getExtra_tag().setVisibility(8);
            getExtra_tag_v2().setVisibility(8);
        } else {
            getExtra_tag().setVisibility(0);
            getExtra_tag_v2().setVisibility(8);
            getExtra_tag().setText(str);
        }
    }

    public final void setExtra_tag(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27690, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80851g = textView;
    }

    public final void setExtra_tag_v2(@dl.d HBUiKitView hBUiKitView) {
        if (PatchProxy.proxy(new Object[]{hBUiKitView}, this, changeQuickRedirect, false, 27692, new Class[]{HBUiKitView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hBUiKitView, "<set-?>");
        this.f80852h = hBUiKitView;
    }

    public final void setGameRatingDesc(@dl.d LinkInfoObj data) {
        String strP;
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 27727, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        getLikeComment().setVisibility(8);
        setType(BBSUserSectionType.GameComment);
        getLl_bottom_tag().removeAllViews();
        h(data, true);
        i(false);
        if (n.r(data.getModify_at()) > n.r(data.getCreate_at())) {
            String strP2 = ad.a.b(ad.a.G, false, 2, null) ? w.p(getContext(), n.r(data.getModify_at())) : w.s(getContext(), n.r(data.getModify_at()));
            v0 v0Var = v0.f124986a;
            String string = getContext().getResources().getString(R.string.modify_at_format);
            f0.o(string, "context.resources.getStr….string.modify_at_format)");
            strP = String.format(string, Arrays.copyOf(new Object[]{strP2}, 1));
            f0.o(strP, "format(format, *args)");
        } else {
            strP = ad.a.b(ad.a.G, false, 2, null) ? w.p(getContext(), n.r(data.getCreate_at())) : w.s(getContext(), n.r(data.getCreate_at()));
        }
        StringBuilder sb2 = new StringBuilder();
        if (!com.max.hbcommon.utils.c.u(strP)) {
            if (sb2.length() > 0) {
                sb2.append("·");
            }
            sb2.append(strP);
        }
        if (!com.max.hbcommon.utils.c.u(data.getIp_location())) {
            if (sb2.length() > 0) {
                sb2.append("·");
            }
            sb2.append(data.getIp_location());
        }
        setDesc(sb2.toString());
    }

    public final void setIv_author(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27684, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80848d = imageView;
    }

    public final void setIv_more(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27708, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80862r = imageView;
    }

    public final void setIv_not_interested(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27698, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80857m = imageView;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setLevel(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27722, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getUserLevel().setLevel(i10);
    }

    public final void setLikeComment(@dl.d BBSLinkListLikeComment bBSLinkListLikeComment) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeComment}, this, changeQuickRedirect, false, 27694, new Class[]{BBSLinkListLikeComment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSLinkListLikeComment, "<set-?>");
        this.f80853i = bBSLinkListLikeComment;
    }

    public final void setLl_bottom_left(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27700, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80858n = linearLayout;
    }

    public final void setLl_bottom_tag(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27706, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80861q = linearLayout;
    }

    public final void setLl_top_algin_right(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27704, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80860p = linearLayout;
    }

    public final void setLl_top_last(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27702, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80859o = linearLayout;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27718, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setRating(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 27720, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GameRateStarView gameRateStarView = this.f80854j;
        if (gameRateStarView == null) {
            f0.S("rating_star");
            gameRateStarView = null;
        }
        gameRateStarView.setRating(f10);
    }

    public final void setRatingArrowRotation(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 27730, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        FrameLayout frameLayout = this.f80855k;
        if (frameLayout == null) {
            f0.S("rating_star_arrow_view");
            frameLayout = null;
        }
        frameLayout.getChildAt(0).setRotation(f10);
    }

    public final void setRatingBarClickListener(@dl.d View.OnClickListener listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, 27729, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        FrameLayout frameLayout = this.f80855k;
        GameRateStarView gameRateStarView = null;
        if (frameLayout == null) {
            f0.S("rating_star_arrow_view");
            frameLayout = null;
        }
        frameLayout.setOnClickListener(listener);
        GameRateStarView gameRateStarView2 = this.f80854j;
        if (gameRateStarView2 == null) {
            f0.S("rating_star");
        } else {
            gameRateStarView = gameRateStarView2;
        }
        gameRateStarView.setOnClickListener(listener);
    }

    public final void setRl_medal_level(@dl.d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 27686, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f80849e = relativeLayout;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27696, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80856l = textView;
    }

    public final void setTv_follow(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27710, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80865u = textView;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setTv_name(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27682, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80847c = textView;
    }

    public final void setType(@dl.d BBSUserSectionType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 27713, new Class[]{BBSUserSectionType.class}, Void.TYPE).isSupported) {
        }
        f0.p(type, "type");
        setAvatarType(false);
        View view = null;
        switch (c.f80877a[type.ordinal()]) {
            case 1:
                setAvatarType(true);
                RelativeLayout relativeLayout = this.f80863s;
                if (relativeLayout == null) {
                    f0.S("topView");
                    relativeLayout = null;
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).addRule(15);
                LinearLayout linearLayout = this.f80864t;
                if (linearLayout == null) {
                    f0.S("bottomView");
                } else {
                    view = linearLayout;
                }
                view.setVisibility(8);
                getLikeComment().setVisibility(8);
                getTv_follow().setVisibility(8);
                break;
            case 2:
                getLikeComment().setType(BBSLinkListLikeComment.Type.LikeOnly);
                s.a(getLikeComment(), 20.0f);
                i(false);
                getTv_follow().setVisibility(8);
                break;
            case 3:
                setAvatarType(true);
                ViewGroup.LayoutParams layoutParams2 = getLikeComment().getLayoutParams();
                RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.removeRule(6);
                    layoutParams3.removeRule(8);
                    layoutParams3.removeRule(7);
                    layoutParams3.addRule(15);
                    layoutParams3.addRule(11);
                } else {
                    layoutParams3 = null;
                }
                getLikeComment().setLayoutParams(layoutParams3);
                getLikeComment().setType(BBSLinkListLikeComment.Type.LikeOnly);
                s.a(getLikeComment(), 20.0f);
                LinearLayout linearLayout2 = this.f80864t;
                if (linearLayout2 == null) {
                    f0.S("bottomView");
                    linearLayout2 = null;
                }
                linearLayout2.setVisibility(8);
                i(false);
                getTv_follow().setVisibility(8);
                RelativeLayout relativeLayout2 = this.f80863s;
                if (relativeLayout2 == null) {
                    f0.S("topView");
                    relativeLayout2 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = relativeLayout2.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams5 = layoutParams4 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 != null) {
                    layoutParams5.removeRule(6);
                    layoutParams5.addRule(15);
                    layoutParams5.topMargin = 0;
                    layoutParams5.leftMargin = 0;
                } else {
                    layoutParams5 = null;
                }
                RelativeLayout relativeLayout3 = this.f80863s;
                if (relativeLayout3 == null) {
                    f0.S("topView");
                } else {
                    view = relativeLayout3;
                }
                view.setLayoutParams(layoutParams5);
                break;
            case 4:
                getLikeComment().setType(BBSLinkListLikeComment.Type.Comment);
                i(true);
                getTv_follow().setVisibility(8);
                break;
            case 5:
                i(false);
                getLikeComment().setVisibility(8);
                getTv_follow().setVisibility(0);
                break;
            case 6:
                i(false);
                RelativeLayout relativeLayout4 = this.f80863s;
                if (relativeLayout4 == null) {
                    f0.S("topView");
                    relativeLayout4 = null;
                }
                ViewGroup.LayoutParams layoutParams6 = relativeLayout4.getLayoutParams();
                f0.n(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams6).addRule(15);
                LinearLayout linearLayout3 = this.f80864t;
                if (linearLayout3 == null) {
                    f0.S("bottomView");
                } else {
                    view = linearLayout3;
                }
                view.setVisibility(8);
                getLikeComment().setVisibility(8);
                getTv_follow().setVisibility(0);
                break;
            case 7:
                i(false);
                RelativeLayout relativeLayout5 = this.f80863s;
                if (relativeLayout5 == null) {
                    f0.S("topView");
                    relativeLayout5 = null;
                }
                ViewGroup.LayoutParams layoutParams7 = relativeLayout5.getLayoutParams();
                f0.n(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams7).addRule(15);
                LinearLayout linearLayout4 = this.f80864t;
                if (linearLayout4 == null) {
                    f0.S("bottomView");
                } else {
                    view = linearLayout4;
                }
                view.setVisibility(8);
                getLikeComment().setVisibility(8);
                getTv_follow().setVisibility(8);
                getTv_name().setTextColor(getContext().getResources().getColor(R.color.white_day));
                break;
        }
    }

    public final void setUserLevel(@dl.d UserLevelView userLevelView) {
        if (PatchProxy.proxy(new Object[]{userLevelView}, this, changeQuickRedirect, false, 27688, new Class[]{UserLevelView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(userLevelView, "<set-?>");
        this.f80850f = userLevelView;
    }
}
