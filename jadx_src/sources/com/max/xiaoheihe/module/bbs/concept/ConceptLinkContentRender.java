package com.max.xiaoheihe.module.bbs.concept;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.RecyclerViewItemWatcher;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.hbcustomview.recyclerview.SlideHorRecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.max.xiaoheihe.bean.bbs.ArticleCollectionObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.CommentPostLinkCardObj;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkToolCardObj;
import com.max.xiaoheihe.bean.bbs.PictureLinkContentTagObj;
import com.max.xiaoheihe.bean.bbs.PostContentTagObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.component.LinkToolCardView;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.post.utils.SimpleDoubleClickDetector;
import com.max.xiaoheihe.module.bbs.widget.LinkPostInfoDecoratorWidget;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import df.ls;
import df.n30;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ConceptLinkContentRender.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nConceptLinkContentRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConceptLinkContentRender.kt\ncom/max/xiaoheihe/module/bbs/concept/ConceptLinkContentRender\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1572:1\n29#2:1573\n5#2,2:1574\n22#2:1576\n7#2:1577\n29#2:1604\n5#2,2:1605\n22#2:1607\n7#2:1608\n262#3,2:1578\n262#3,2:1580\n304#3,2:1582\n262#3,2:1584\n262#3,2:1586\n262#3,2:1588\n304#3,2:1590\n262#3,2:1592\n262#3,2:1594\n262#3,2:1596\n262#3,2:1598\n262#3,2:1600\n262#3,2:1602\n262#3,2:1609\n262#3,2:1611\n260#3:1613\n*S KotlinDebug\n*F\n+ 1 ConceptLinkContentRender.kt\ncom/max/xiaoheihe/module/bbs/concept/ConceptLinkContentRender\n*L\n490#1:1573\n490#1:1574,2\n490#1:1576\n490#1:1577\n968#1:1604\n968#1:1605,2\n968#1:1607\n968#1:1608\n497#1:1578,2\n563#1:1580,2\n578#1:1582,2\n617#1:1584,2\n619#1:1586,2\n700#1:1588,2\n720#1:1590,2\n913#1:1592,2\n927#1:1594,2\n933#1:1596,2\n934#1:1598,2\n962#1:1600,2\n963#1:1602,2\n1380#1:1609,2\n1382#1:1611,2\n1385#1:1613\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ConceptLinkContentRender {
    public static final int A = 300;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final a f81001x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f81002y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f81003z = 450;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f81004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final AppCompatActivity f81005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f81006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private n30 f81007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f81009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f81010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f81011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private ArrayList<KeyDescObj> f81012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<KeyDescObj> f81013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f81014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private ConceptLinkContentRender$rvLayoutManager$1 f81015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private b f81016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private sb.a f81017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinkInfoObj f81018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private List<String> f81019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<BBSTextObj> f81020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final ArrayList<String> f81021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSTextObj> f81022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final ArrayList<String> f81023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final ArrayList<CommentPostLinkCardObj> f81024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final ArrayList<LinkToolCardObj> f81025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final ArrayList<KeyDescObj> f81026w;

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public enum ContentType {
        TYPE_TEXT("text"),
        TYPE_IMAGE(SocialConstants.PARAM_IMG_URL),
        TYPE_GAME_CARD("game_card"),
        TYPE_LINK_CARD("link_card"),
        TYPE_TOOL_CARD("tool_card"),
        TYPE_POST_GUIDE_CARD("post_guide_card");


        @dl.d
        public static final a Companion = new a(null);
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        private final String value;

        /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
        @t0({"SMAP\nConceptLinkContentRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConceptLinkContentRender.kt\ncom/max/xiaoheihe/module/bbs/concept/ConceptLinkContentRender$ContentType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
        public static final class a {
            public static ChangeQuickRedirect changeQuickRedirect;

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.e
            public final ContentType a(@dl.d String value) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 28062, new Class[]{String.class}, ContentType.class);
                if (patchProxyResultProxy.isSupported) {
                    return (ContentType) patchProxyResultProxy.result;
                }
                f0.p(value, "value");
                for (ContentType contentType : ContentType.valuesCustom()) {
                    if (f0.g(contentType.getValue(), value)) {
                        return contentType;
                    }
                }
                return null;
            }
        }

        ContentType(String str) {
            this.value = str;
        }

        public static ContentType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 28061, new Class[]{String.class}, ContentType.class);
            return (ContentType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ContentType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ContentType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28060, new Class[0], ContentType[].class);
            return (ContentType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }

        @dl.d
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final void a(@dl.e TextView textView, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 28059, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported || textView == null) {
                return;
            }
            Context context = textView.getContext();
            if (f0.g("1", str)) {
                textView.setText(R.string.has_followed);
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.divider_color_concept_2dp));
                textView.setCompoundDrawables(null, null, null, null);
                return;
            }
            if (f0.g("2", str)) {
                Drawable drawable = context.getResources().getDrawable(R.drawable.account_follow_each_other_v);
                f0.o(drawable, "mContext.getResources()\n…ount_follow_each_other_v)");
                int iF = ViewUtils.f(context, 16.0f);
                drawable.setBounds(0, 0, iF, iF);
                textView.setText(R.string.follow);
                textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                textView.setBackground(com.max.hbutils.utils.q.k(context, context.getResources().getColor(R.color.dialog_btn_black_color_day_night, context.getTheme()), context.getResources().getColor(R.color.text_primary_1_color, context.getTheme()), GradientDrawable.Orientation.LEFT_RIGHT, new float[]{3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f}));
                textView.setCompoundDrawables(com.max.hbutils.utils.q.S(drawable, com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color)), null, null, null);
                return;
            }
            if (!f0.g("3", str)) {
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.common_add_with_padding_16x16);
                f0.o(drawable2, "mContext.getResources()\n…n_add_with_padding_16x16)");
                int iF2 = ViewUtils.f(context, 16.0f);
                drawable2.setBounds(0, 0, iF2, iF2);
                textView.setText(R.string.follow);
                textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                textView.setBackground(com.max.hbutils.utils.q.k(context, context.getResources().getColor(R.color.dialog_btn_black_color_day_night, context.getTheme()), context.getResources().getColor(R.color.text_primary_1_color, context.getTheme()), GradientDrawable.Orientation.LEFT_RIGHT, new float[]{3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f}));
                textView.setCompoundDrawables(com.max.hbutils.utils.q.S(drawable2, com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color)), null, null, null);
                return;
            }
            Drawable drawable3 = context.getResources().getDrawable(R.drawable.account_follow_each_other_v);
            f0.o(drawable3, "mContext.getResources()\n…ount_follow_each_other_v)");
            int iF3 = ViewUtils.f(context, 16.0f);
            drawable3.setBounds(0, 0, iF3, iF3);
            drawable3.setColorFilter(context.getResources().getColor(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_ATOP);
            textView.setText(R.string.follow_each_other);
            textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
            textView.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.divider_color_concept_2dp));
            textView.setCompoundDrawables(com.max.hbutils.utils.q.S(drawable3, com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color)), null, null, null);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class a0 extends com.max.hbcommon.base.adapter.s<LinkToolCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0(AppCompatActivity appCompatActivity, ArrayList<LinkToolCardObj> arrayList) {
            super(appCompatActivity, arrayList, R.layout.item_link_tool_card);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e LinkToolCardObj linkToolCardObj) {
            LinkToolCardView linkToolCardView;
            if (PatchProxy.proxy(new Object[]{eVar, linkToolCardObj}, this, changeQuickRedirect, false, 28113, new Class[]{com.max.hbcommon.base.adapter.s.e.class, LinkToolCardObj.class}, Void.TYPE).isSupported || eVar == null || linkToolCardObj == null || (linkToolCardView = (LinkToolCardView) eVar.i(R.id.v_tool_card)) == null) {
                return;
            }
            f0.o(linkToolCardView, "getView<LinkToolCardView>(R.id.v_tool_card)");
            linkToolCardView.setData(linkToolCardObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, LinkToolCardObj linkToolCardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, linkToolCardObj}, this, changeQuickRedirect, false, 28114, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, linkToolCardObj);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public interface b {
        void a();

        void b();

        void c();

        void d();
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81027a;

        static {
            int[] iArr = new int[ContentType.valuesCustom().length];
            try {
                iArr[ContentType.TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.TYPE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.TYPE_GAME_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentType.TYPE_LINK_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContentType.TYPE_TOOL_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContentType.TYPE_POST_GUIDE_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f81027a = iArr;
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f81029c;

        d(GameObj gameObj) {
            this.f81029c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28063, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptLinkContentRender.this.y().startActivity(com.max.xiaoheihe.module.game.z.b(ConceptLinkContentRender.this.y(), this.f81029c.getH_src(), this.f81029c.getAppid(), this.f81029c.getGame_type(), null, i0.m(), i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f81031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f81032d;

        e(TextView textView, GameObj gameObj) {
            this.f81031c = textView;
            this.f81032d = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28064, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptLinkContentRender.this.D(this.f81031c, this.f81032d);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f81034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f81035d;

        f(KeyDescObj keyDescObj, KeyDescObj keyDescObj2) {
            this.f81034c = keyDescObj;
            this.f81035d = keyDescObj2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28065, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptLinkContentRender.k(ConceptLinkContentRender.this, this.f81034c, true);
            com.max.xiaoheihe.base.router.b.k0(ConceptLinkContentRender.this.y(), this.f81035d.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f81037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f81038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f81039e;

        g(TextView textView, GameObj gameObj, String str) {
            this.f81037c = textView;
            this.f81038d = gameObj;
            this.f81039e = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28066, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            LayoutInflater.Factory factoryY = ConceptLinkContentRender.this.y();
            f0.n(factoryY, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
            if (((com.max.hbcommon.base.f) factoryY).isActive()) {
                super.onError(e10);
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
                r1.n2(this.f81037c, this.f81038d.getFollow_state(), true, true);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28067, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            LayoutInflater.Factory factoryY = ConceptLinkContentRender.this.y();
            f0.n(factoryY, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
            if (((com.max.hbcommon.base.f) factoryY).isActive()) {
                super.onNext(result);
                this.f81038d.setFollow_state(this.f81039e);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28068, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class h implements com.max.hbcommon.base.adapter.a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 28077, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.base.adapter.a0.a.a(this, i10, viewHolder, f10);
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            View view;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 28076, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported || viewHolder == null || (view = viewHolder.itemView) == null) {
                return;
            }
            ConceptLinkContentRender conceptLinkContentRender = ConceptLinkContentRender.this;
            if (view.getTag(R.id.rb_0) instanceof BBSTextObj) {
                Object tag = view.getTag(R.id.rb_0);
                f0.n(tag, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSTextObj");
                PictureLinkContentTagObj extra_tag_v2 = ((BBSTextObj) tag).getExtra_tag_v2();
                if (extra_tag_v2 != null) {
                    f0.o(extra_tag_v2, "extra_tag_v2");
                    if (extra_tag_v2.getReported_exposure()) {
                        return;
                    }
                    extra_tag_v2.setReported_exposure(true);
                    ConceptLinkContentRender.l(conceptLinkContentRender, extra_tag_v2, false);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f81041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f81042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ConceptLinkContentRender f81043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameObj f81044e;

        i(EditText editText, TextView textView, ConceptLinkContentRender conceptLinkContentRender, GameObj gameObj) {
            this.f81041b = editText;
            this.f81042c = textView;
            this.f81043d = conceptLinkContentRender;
            this.f81044e = gameObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28078, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f81041b.getText().toString();
            if (!com.max.hbcommon.utils.c.B(string)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.input_right_phonenum));
                return;
            }
            r1.n2(this.f81042c, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
            ConceptLinkContentRender.b(this.f81043d, this.f81042c, this.f81044e, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, string);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f81053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConceptLinkContentRender f81054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f81055d;

        j(TextView textView, ConceptLinkContentRender conceptLinkContentRender, GameObj gameObj) {
            this.f81053b = textView;
            this.f81054c = conceptLinkContentRender;
            this.f81055d = gameObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28079, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            r1.n2(this.f81053b, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true, true);
            ConceptLinkContentRender.b(this.f81054c, this.f81053b, this.f81055d, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, null);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f81056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConceptLinkContentRender f81057c;

        k(KeyDescObj keyDescObj, ConceptLinkContentRender conceptLinkContentRender) {
            this.f81056b = keyDescObj;
            this.f81057c = conceptLinkContentRender;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28080, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f81056b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f81057c.y(), this.f81056b.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class l implements sb.a.InterfaceC1267a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f81058a = new l();
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // sb.a.InterfaceC1267a
        public final void a(int i10, @dl.d View child) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), child}, this, changeQuickRedirect, false, 28081, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(child, "child");
            com.max.xiaoheihe.module.game.adapter.w.a(child, i10);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f81060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ExpandMoreButton f81061d;

        /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExpandMoreButton f81062b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f81063c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Result<GamesInfoResultObj> f81064d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ConceptLinkContentRender f81065e;

            a(ExpandMoreButton expandMoreButton, int i10, Result<GamesInfoResultObj> result, ConceptLinkContentRender conceptLinkContentRender) {
                this.f81062b = expandMoreButton;
                this.f81063c = i10;
                this.f81064d = result;
                this.f81065e = conceptLinkContentRender;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<GameObj> base_infos;
                GameObj gameObj;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28084, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f81062b.setVisibility(8);
                for (int i10 = 3; i10 < this.f81063c; i10++) {
                    GamesInfoResultObj result = this.f81064d.getResult();
                    if (result != null && (base_infos = result.getBase_infos()) != null && (gameObj = (GameObj) CollectionsKt___CollectionsKt.R2(base_infos, i10)) != null) {
                        ConceptLinkContentRender conceptLinkContentRender = this.f81065e;
                        LinearLayout linearLayout = conceptLinkContentRender.v().A;
                        f0.o(linearLayout, "binding.vgGamecardList");
                        conceptLinkContentRender.q(gameObj, linearLayout);
                    }
                }
            }
        }

        m(ViewGroup viewGroup, ExpandMoreButton expandMoreButton) {
            this.f81060c = viewGroup;
            this.f81061d = expandMoreButton;
        }

        public void onNext(@dl.d Result<GamesInfoResultObj> result) {
            List<GameObj> base_infos;
            GameObj gameObj;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28082, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            ConceptLinkContentRender.this.v().A.removeAllViews();
            LayoutInflater.Factory factoryY = ConceptLinkContentRender.this.y();
            f0.n(factoryY, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
            if (((com.max.hbcommon.base.f) factoryY).isActive() && result.getResult() != null) {
                GamesInfoResultObj result2 = result.getResult();
                f0.m(result2);
                if (!com.max.hbcommon.utils.c.w(result2.getBase_infos())) {
                    this.f81060c.setVisibility(0);
                    GamesInfoResultObj result3 = result.getResult();
                    f0.m(result3);
                    int size = result3.getBase_infos().size();
                    int iMin = Math.min(size, 3);
                    for (int i10 = 0; i10 < iMin; i10++) {
                        GamesInfoResultObj result4 = result.getResult();
                        if (result4 != null && (base_infos = result4.getBase_infos()) != null && (gameObj = (GameObj) CollectionsKt___CollectionsKt.R2(base_infos, i10)) != null) {
                            ConceptLinkContentRender conceptLinkContentRender = ConceptLinkContentRender.this;
                            LinearLayout linearLayout = conceptLinkContentRender.v().A;
                            f0.o(linearLayout, "binding.vgGamecardList");
                            conceptLinkContentRender.q(gameObj, linearLayout);
                        }
                    }
                    if (size <= 3) {
                        this.f81061d.setVisibility(8);
                        ConceptLinkContentRender.this.v().A.setPadding(0, 0, 0, 0);
                        return;
                    }
                    this.f81061d.setText("查看全部 " + size + " 款");
                    ExpandMoreButton expandMoreButton = this.f81061d;
                    expandMoreButton.setOnClickListener(new a(expandMoreButton, size, result, ConceptLinkContentRender.this));
                    this.f81061d.setBackgroundResource(R.color.divider_color);
                    this.f81061d.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                    this.f81061d.setVisibility(0);
                    ConceptLinkContentRender.this.v().A.setPadding(0, ViewUtils.f(ConceptLinkContentRender.this.y(), 4.0f), 0, 0);
                    return;
                }
            }
            this.f81060c.setVisibility(8);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28083, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class n extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 28086, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            outRect.top = ViewUtils.f(ConceptLinkContentRender.this.y(), 10.0f);
            outRect.left = ViewUtils.f(ConceptLinkContentRender.this.y(), 10.0f);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConceptLinkContentRender f81068c;

        o(BBSUserInfoObj bBSUserInfoObj, ConceptLinkContentRender conceptLinkContentRender) {
            this.f81067b = bBSUserInfoObj;
            this.f81068c = conceptLinkContentRender;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28087, new Class[]{View.class}, Void.TYPE).isSupported && i0.r(this.f81067b.getUserid())) {
                AppCompatActivity appCompatActivityY = this.f81068c.y();
                String userid = this.f81067b.getUserid();
                f0.o(userid, "user.userid");
                com.max.xiaoheihe.base.router.b.U(appCompatActivityY, userid, this.f81067b.getSteamid()).A();
            }
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVarZ;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28088, new Class[]{View.class}, Void.TYPE).isSupported || !i0.e(ConceptLinkContentRender.this.y()) || (bVarZ = ConceptLinkContentRender.this.z()) == null) {
                return;
            }
            bVarZ.d();
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f81070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArticleCollectionObj f81071c;

        q(ConstraintLayout constraintLayout, ArticleCollectionObj articleCollectionObj) {
            this.f81070b = constraintLayout;
            this.f81071c = articleCollectionObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28089, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f81070b.getContext();
            f0.o(context, "constraintLayout.context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f81071c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SimpleDoubleClickDetector f81072b;

        r(SimpleDoubleClickDetector simpleDoubleClickDetector) {
            this.f81072b = simpleDoubleClickDetector;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28090, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f81072b.f();
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureLinkContentTagObj f81075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f81076d;

        s(PictureLinkContentTagObj pictureLinkContentTagObj, Context context) {
            this.f81075c = pictureLinkContentTagObj;
            this.f81076d = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28095, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptLinkContentRender.l(ConceptLinkContentRender.this, this.f81075c, true);
            if (com.max.hbcommon.utils.c.u(this.f81075c.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f81076d, this.f81075c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class t extends DiffUtil.ItemCallback<BBSTextObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        public boolean a(@dl.d BBSTextObj oldItem, @dl.d BBSTextObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 28099, new Class[]{BBSTextObj.class, BBSTextObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getExtra_tag_v2(), newItem.getExtra_tag_v2());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(BBSTextObj bBSTextObj, BBSTextObj bBSTextObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTextObj, bBSTextObj2}, this, changeQuickRedirect, false, 28101, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(bBSTextObj, bBSTextObj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(BBSTextObj bBSTextObj, BBSTextObj bBSTextObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTextObj, bBSTextObj2}, this, changeQuickRedirect, false, 28100, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(bBSTextObj, bBSTextObj2);
        }

        public boolean b(@dl.d BBSTextObj oldItem, @dl.d BBSTextObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 28098, new Class[]{BBSTextObj.class, BBSTextObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getUrl(), newItem.getUrl());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class u extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28102, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            com.max.hbcommon.utils.d.b("zzzzconceptindex", "onscroll  first ==" + ConceptLinkContentRender.this.f81009f + "  lastIndex ==" + ConceptLinkContentRender.this.f81010g);
            ConceptLinkContentRender.this.t();
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class v extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v(AppCompatActivity appCompatActivity, ArrayList<KeyDescObj> arrayList) {
            super(appCompatActivity, arrayList, R.layout.item_concept_img_indicator);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d KeyDescObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 28103, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            com.max.hbcommon.utils.d.b("zzzzconceptindex", "adapter  first ==" + ConceptLinkContentRender.this.f81009f + "  lastIndex ==" + ConceptLinkContentRender.this.f81010g + " positon ==" + bindingAdapterPosition + " tag == " + viewHolder.itemView.getTag());
            if (data.isChecked()) {
                ConceptLinkContentRender.n(ConceptLinkContentRender.this, 1, viewHolder.itemView);
                return;
            }
            if (bindingAdapterPosition <= ConceptLinkContentRender.this.f81009f && ConceptLinkContentRender.this.f81009f != 0 && ConceptLinkContentRender.this.f81014k) {
                ConceptLinkContentRender.n(ConceptLinkContentRender.this, 2, viewHolder.itemView);
            } else if (bindingAdapterPosition < ConceptLinkContentRender.this.f81010g || ConceptLinkContentRender.this.f81010g == ConceptLinkContentRender.this.f81012i.size() - 1 || !ConceptLinkContentRender.this.f81014k) {
                ConceptLinkContentRender.n(ConceptLinkContentRender.this, 4, viewHolder.itemView);
            } else {
                ConceptLinkContentRender.n(ConceptLinkContentRender.this, 3, viewHolder.itemView);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 28104, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    @t0({"SMAP\nConceptLinkContentRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConceptLinkContentRender.kt\ncom/max/xiaoheihe/module/bbs/concept/ConceptLinkContentRender$updateImgList$snapPageScrollListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1572:1\n1855#2,2:1573\n*S KotlinDebug\n*F\n+ 1 ConceptLinkContentRender.kt\ncom/max/xiaoheihe/module/bbs/concept/ConceptLinkContentRender$updateImgList$snapPageScrollListener$1\n*L\n843#1:1573,2\n*E\n"})
    public static final class w extends com.max.xiaoheihe.view.callback.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ConceptLinkContentRender f81082b;

            a(ConceptLinkContentRender conceptLinkContentRender) {
                this.f81082b = conceptLinkContentRender;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28106, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f81082b.t();
            }
        }

        w() {
        }

        @Override // com.max.xiaoheihe.view.callback.d
        public void e(int i10) {
            int i11;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28105, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView.Adapter adapter = ConceptLinkContentRender.this.v().f113650m.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 1;
            TextView textView = ConceptLinkContentRender.this.v().f113655r;
            StringBuilder sb2 = new StringBuilder();
            int i12 = i10 + 1;
            sb2.append(i12);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(itemCount);
            textView.setText(sb2.toString());
            RecyclerView.Adapter adapter2 = ConceptLinkContentRender.this.v().f113650m.getAdapter();
            f0.n(adapter2, "null cannot be cast to non-null type com.max.hbcommon.base.adapter.RVCommonAdapter<com.max.xiaoheihe.bean.bbs.BBSTextObj>");
            List dataList = ((com.max.hbcommon.base.adapter.s) adapter2).getDataList();
            com.max.hbcommon.base.adapter.s sVar = null;
            BBSTextObj bBSTextObj = dataList != null ? (BBSTextObj) dataList.get(i10) : null;
            if (bBSTextObj != null) {
                ConceptLinkContentRender.a(ConceptLinkContentRender.this, bBSTextObj.getExtra_tag());
            }
            boolean z10 = i10 > ConceptLinkContentRender.this.f81008e;
            ConceptLinkContentRender.this.f81008e = i10;
            if (itemCount > 1) {
                Iterator it = ConceptLinkContentRender.this.f81012i.iterator();
                while (it.hasNext()) {
                    ((KeyDescObj) it.next()).setChecked(false);
                }
                ((KeyDescObj) ConceptLinkContentRender.this.f81012i.get(i10)).setChecked(true);
                if (!ConceptLinkContentRender.this.f81014k) {
                    com.max.hbcommon.base.adapter.s sVar2 = ConceptLinkContentRender.this.f81013j;
                    if (sVar2 == null) {
                        f0.S("indexAdapter");
                    } else {
                        sVar = sVar2;
                    }
                    sVar.notifyDataSetChanged();
                    return;
                }
                if (z10) {
                    int i13 = ConceptLinkContentRender.this.f81010g;
                    com.max.hbcommon.utils.d.b("zzzzdot", "toright currentP==" + i13 + "   position=" + i10 + ' ');
                    if (i10 >= i13 && i12 < itemCount) {
                        ConceptLinkContentRender.this.v().f113651n.smoothScrollToPosition(i12);
                        ConceptLinkContentRender.this.f81009f++;
                        ConceptLinkContentRender.this.f81010g++;
                    }
                } else {
                    int i14 = ConceptLinkContentRender.this.f81009f;
                    com.max.hbcommon.utils.d.b("zzzzdot", "toleft currentP==" + i14 + "   position=" + i10 + ' ');
                    if (i10 <= i14 && (i11 = i10 - 1) >= 0) {
                        ConceptLinkContentRender.this.v().f113651n.smoothScrollToPosition(i11);
                        ConceptLinkContentRender.this.f81009f--;
                        ConceptLinkContentRender.this.f81010g--;
                    }
                }
                com.max.hbcommon.base.adapter.s sVar3 = ConceptLinkContentRender.this.f81013j;
                if (sVar3 == null) {
                    f0.S("indexAdapter");
                } else {
                    sVar = sVar3;
                }
                sVar.notifyDataSetChanged();
                ConceptLinkContentRender.this.v().f113651n.post(new a(ConceptLinkContentRender.this));
            }
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f81083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommentPostLinkCardObj f81084c;

        x(AppCompatActivity appCompatActivity, CommentPostLinkCardObj commentPostLinkCardObj) {
            this.f81083b = appCompatActivity;
            this.f81084c = commentPostLinkCardObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28107, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f81083b, this.f81084c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class y extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 28108, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(0, ViewUtils.f(ConceptLinkContentRender.this.y(), 8.0f), 0, 0);
            }
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class z extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        z(AppCompatActivity appCompatActivity, ArrayList<KeyDescObj> arrayList) {
            super(appCompatActivity, arrayList, R.layout.item_picture_event_entry);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 28109, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            ConceptLinkContentRender conceptLinkContentRender = ConceptLinkContentRender.this;
            if (keyDescObj != null) {
                ls lsVarA = ls.a(eVar.itemView);
                f0.o(lsVarA, "bind(viewHolder.itemView)");
                ConceptLinkContentRender.j(conceptLinkContentRender, lsVarA, keyDescObj);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 28110, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$rvLayoutManager$1] */
    public ConceptLinkContentRender(@dl.d io.reactivex.disposables.a compositeDisposable, @dl.d final AppCompatActivity mContext, @dl.d View mLinkInfoView, boolean z10) {
        f0.p(compositeDisposable, "compositeDisposable");
        f0.p(mContext, "mContext");
        f0.p(mLinkInfoView, "mLinkInfoView");
        this.f81004a = compositeDisposable;
        this.f81005b = mContext;
        this.f81006c = z10;
        n30 n30VarA = n30.a(mLinkInfoView);
        f0.o(n30VarA, "bind(mLinkInfoView)");
        this.f81007d = n30VarA;
        this.f81009f = -1;
        this.f81010g = -1;
        this.f81011h = 4;
        this.f81012i = new ArrayList<>();
        this.f81015l = new LinearLayoutManager(mContext) { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$rvLayoutManager$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
            public static final class a extends LinearSmoothScroller {
                public static ChangeQuickRedirect changeQuickRedirect;

                a(Context context) {
                    super(context);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(@d DisplayMetrics displayMetrics) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{displayMetrics}, this, changeQuickRedirect, false, 28094, new Class[]{DisplayMetrics.class}, Float.TYPE);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Float) patchProxyResultProxy.result).floatValue();
                    }
                    f0.p(displayMetrics, "displayMetrics");
                    return 1500.0f / displayMetrics.densityDpi;
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(@d RecyclerView recyclerView, @e RecyclerView.State state, int i10) {
                if (PatchProxy.proxy(new Object[]{recyclerView, state, new Integer(i10)}, this, changeQuickRedirect, false, 28093, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(recyclerView, "recyclerView");
                a aVar = new a(recyclerView.getContext());
                aVar.setTargetPosition(i10);
                startSmoothScroll(aVar);
            }
        };
        this.f81021r = new ArrayList<>();
        this.f81022s = new ArrayList<>();
        this.f81023t = new ArrayList<>();
        this.f81024u = new ArrayList<>();
        this.f81025v = new ArrayList<>();
        this.f81026w = new ArrayList<>();
        A(CollectionsKt__CollectionsKt.E());
    }

    private final void A(final List<? extends BBSTextObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28026, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        final AppCompatActivity appCompatActivity = this.f81005b;
        com.max.hbcommon.base.adapter.s<BBSTextObj> sVar = new com.max.hbcommon.base.adapter.s<BBSTextObj>(list, appCompatActivity) { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$initImgList$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ SimpleDoubleClickDetector f81046b;

                a(SimpleDoubleClickDetector simpleDoubleClickDetector) {
                    this.f81046b = simpleDoubleClickDetector;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28071, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    this.f81046b.f();
                }
            }

            public void m(@d final s.e viewHolder, @d final BBSTextObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 28069, new Class[]{s.e.class, BBSTextObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                viewHolder.itemView.setTag(R.id.rb_0, data);
                final ViewGroup vg_tag = (ViewGroup) viewHolder.i(R.id.vg_tag);
                if (data.getExtra_tag_v2() != null) {
                    vg_tag.setVisibility(0);
                    ConceptLinkContentRender conceptLinkContentRender = this;
                    AppCompatActivity appCompatActivityY = conceptLinkContentRender.y();
                    f0.o(vg_tag, "vg_tag");
                    PictureLinkContentTagObj extra_tag_v2 = data.getExtra_tag_v2();
                    f0.o(extra_tag_v2, "data.extra_tag_v2");
                    conceptLinkContentRender.R(appCompatActivityY, vg_tag, extra_tag_v2);
                } else {
                    vg_tag.setVisibility(8);
                }
                final ImageView imageView = (ImageView) viewHolder.i(R.id.iv_image);
                ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_image_not_full);
                com.max.hbimage.b.K(data.getUrl(), imageView);
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                long jG = PostUtils.f81983a.g();
                LifecycleCoroutineScope lifecycleCoroutineScopeA = z.a(this.y());
                final ConceptLinkContentRender conceptLinkContentRender2 = this;
                yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$initImgList$1$onBindViewHolder$doubleClickUpvoteDetector$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28073, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28072, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        if (vg_tag.getVisibility() == 0) {
                            vg_tag.setVisibility(8);
                            data.setExtra_tag_v2(null);
                            return;
                        }
                        ArrayList arrayList = conceptLinkContentRender2.f81022s;
                        ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((BBSTextObj) it.next()).getUrl());
                        }
                        ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                        ImageViewerHelper.a aVarA = companion.a(conceptLinkContentRender2.y());
                        ImageView imageView3 = imageView;
                        f0.o(imageView3, "imageView");
                        aVarA.m(companion.d(imageView3, viewHolder.getBindingAdapterPosition()), (String[]) arrayList2.toArray(new String[0])).d(viewHolder.getBindingAdapterPosition()).p();
                    }
                };
                final ConceptLinkContentRender conceptLinkContentRender3 = this;
                viewHolder.itemView.setOnClickListener(new a(new SimpleDoubleClickDetector(jG, lifecycleCoroutineScopeA, aVar, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$initImgList$1$onBindViewHolder$doubleClickUpvoteDetector$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28075, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MotionEvent lastDownEvent;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28074, new Class[0], Void.TYPE).isSupported || (lastDownEvent = conceptLinkContentRender3.v().f113648k.getLastDownEvent()) == null) {
                            return;
                        }
                        ConceptLinkContentRender conceptLinkContentRender4 = conceptLinkContentRender3;
                        conceptLinkContentRender4.v().f113649l.c(lastDownEvent.getX(), lastDownEvent.getY());
                        ConceptLinkContentRender.b bVarZ = conceptLinkContentRender4.z();
                        if (bVarZ != null) {
                            bVarZ.c();
                        }
                    }
                })));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTextObj bBSTextObj) {
                if (PatchProxy.proxy(new Object[]{eVar, bBSTextObj}, this, changeQuickRedirect, false, 28070, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, bBSTextObj);
            }
        };
        this.f81020q = sVar;
        this.f81007d.f113650m.setAdapter(sVar);
        AppCompatActivity appCompatActivity2 = this.f81005b;
        SlideHorRecyclerView slideHorRecyclerView = this.f81007d.f113650m;
        f0.o(slideHorRecyclerView, "binding.rvImages");
        new RecyclerViewItemWatcher(appCompatActivity2, slideHorRecyclerView, new h(), 0, false, 24, null);
        LayoutInflater.Factory factory = this.f81005b;
        com.max.hbcommon.analytics.d.f fVar = factory instanceof com.max.hbcommon.analytics.d.f ? (com.max.hbcommon.analytics.d.f) factory : null;
        if (fVar != null) {
            SlideHorRecyclerView slideHorRecyclerView2 = this.f81007d.f113650m;
            f0.o(slideHorRecyclerView2, "binding.rvImages");
            new OneTimeValidExposureWatcher(fVar, slideHorRecyclerView2);
        }
    }

    private final void E(ls lsVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{lsVar, keyDescObj}, this, changeQuickRedirect, false, 28031, new Class[]{ls.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj == null) {
            FrameLayout root = lsVar.b();
            f0.o(root, "root");
            root.setVisibility(8);
            return;
        }
        FrameLayout root2 = lsVar.b();
        f0.o(root2, "root");
        root2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = lsVar.b().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) com.max.accelworld.c.a(12.0f, this.f81005b);
            marginLayoutParams.rightMargin = (int) com.max.accelworld.c.a(12.0f, this.f81005b);
        }
        ConstraintLayout constraintLayout = lsVar.f113139e;
        com.max.xiaoheihe.accelworld.l.q(constraintLayout, R.color.background_card_1_color, 3.0f);
        constraintLayout.setOnClickListener(new k(keyDescObj, this));
        com.max.hbimage.b.K(keyDescObj.getIcon(), lsVar.f113136b);
        lsVar.f113138d.setText(keyDescObj.getText());
        lsVar.f113137c.setText(keyDescObj.getDesc());
        lsVar.f113137c.getTv_more().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        lsVar.f113137c.getTv_more().setTextSize(1, 11.0f);
    }

    @xh.m
    public static final void F(@dl.e TextView textView, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, null, changeQuickRedirect, true, 28052, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f81001x.a(textView, str);
    }

    private final void J(List<PostContentTagObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28032, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || com.max.hbcommon.utils.c.w(list)) {
            this.f81007d.B.setVisibility(8);
            return;
        }
        this.f81007d.B.removeAllViews();
        RecyclerView recyclerView = this.f81007d.B;
        final AppCompatActivity appCompatActivity = this.f81005b;
        recyclerView.setLayoutManager(new FlexboxLayoutManager(appCompatActivity) { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$renderContentTags$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            @d
            public RecyclerView.LayoutParams generateLayoutParams(@e ViewGroup.LayoutParams layoutParams) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, 28085, new Class[]{ViewGroup.LayoutParams.class}, RecyclerView.LayoutParams.class);
                if (patchProxyResultProxy.isSupported) {
                    return (RecyclerView.LayoutParams) patchProxyResultProxy.result;
                }
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    return new FlexboxLayoutManager.LayoutParams((RecyclerView.LayoutParams) layoutParams);
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    return new FlexboxLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
                }
                RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(layoutParams);
                f0.o(layoutParamsGenerateLayoutParams, "super.generateLayoutParams(lp)");
                return layoutParamsGenerateLayoutParams;
            }
        });
        this.f81007d.B.setAdapter(new com.max.xiaoheihe.module.bbs.concept.c(this.f81005b, list));
        if (this.f81007d.B.getItemDecorationCount() == 0) {
            this.f81007d.B.addItemDecoration(new n());
        }
        this.f81007d.B.setVisibility(0);
    }

    private final void L(KeyDescObj keyDescObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28028, new Class[]{KeyDescObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        LinkInfoObj linkInfoObj = this.f81018o;
        if (linkInfoObj == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj = null;
        }
        jsonObject.addProperty("link_id", linkInfoObj.getLinkid());
        jsonObject.addProperty(SocialConstants.PARAM_APP_DESC, keyDescObj.getDesc());
        com.max.hbcommon.analytics.d.d(z10 ? "4" : "3", lb.d.T, null, jsonObject);
    }

    private final void M(PictureLinkContentTagObj pictureLinkContentTagObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pictureLinkContentTagObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28027, new Class[]{PictureLinkContentTagObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        LinkInfoObj linkInfoObj = this.f81018o;
        if (linkInfoObj == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj = null;
        }
        jsonObject.addProperty("link_id", linkInfoObj.getLinkid());
        jsonObject.addProperty(SocialConstants.PARAM_APP_DESC, pictureLinkContentTagObj.getDesc());
        com.max.hbcommon.analytics.d.d(z10 ? "4" : "3", lb.d.U, null, jsonObject);
    }

    private final void P(int i10, View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 28043, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported || view == null || f0.g(view.getTag(), Integer.valueOf(i10))) {
            return;
        }
        view.setTag(Integer.valueOf(i10));
        if (i10 == 1) {
            view.setBackgroundDrawable(com.max.hbutils.utils.q.o(this.f81005b, R.color.text_primary_1_color, 1.0f));
            return;
        }
        if (i10 == 2) {
            view.setBackgroundDrawable(ViewUtils.x(ViewUtils.f(this.f81005b, 1.0f), com.max.xiaoheihe.utils.d.E(R.color.transparent), com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color)));
        } else if (i10 == 3) {
            view.setBackgroundDrawable(ViewUtils.x(ViewUtils.f(this.f81005b, 1.0f), com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color), com.max.xiaoheihe.utils.d.E(R.color.transparent)));
        } else {
            if (i10 != 4) {
                return;
            }
            view.setBackgroundDrawable(com.max.hbutils.utils.q.o(this.f81005b, R.color.divider_primary_1_color, 1.0f));
        }
    }

    private final void V() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28038, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f81026w)) {
            View root = this.f81007d.f113641d.getRoot();
            f0.o(root, "binding.imageDiv.root");
            root.setVisibility(this.f81022s.size() > 0 ? 0 : 8);
            RecyclerView recyclerView = this.f81007d.f113652o;
            f0.o(recyclerView, "binding.rvPostGuide");
            recyclerView.setVisibility(8);
            return;
        }
        View root2 = this.f81007d.f113641d.getRoot();
        f0.o(root2, "binding.imageDiv.root");
        root2.setVisibility(8);
        RecyclerView recyclerView2 = this.f81007d.f113652o;
        f0.o(recyclerView2, "binding.rvPostGuide");
        recyclerView2.setVisibility(0);
        this.f81007d.f113652o.setLayoutManager(new LinearLayoutManager(this.f81005b));
        if (this.f81007d.f113652o.getItemDecorationCount() == 0) {
            this.f81007d.f113652o.addItemDecoration(new y());
        }
        this.f81007d.f113652o.setAdapter(new z(this.f81005b, this.f81026w));
    }

    private final void X() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28036, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f81021r)) {
            this.f81007d.f113654q.setVisibility(8);
            return;
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(this.f81021r, "\n", null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$updateTextList$text$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final CharSequence a(@d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28111, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28112, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null);
        ExpressionTextView expressionTextView = this.f81007d.f113654q;
        f0.o(expressionTextView, "binding.tvDesc");
        I(strH3, expressionTextView);
        this.f81007d.f113654q.setVisibility(0);
    }

    public static final /* synthetic */ void a(ConceptLinkContentRender conceptLinkContentRender, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, keyDescObj}, null, changeQuickRedirect, true, 28055, new Class[]{ConceptLinkContentRender.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.s(keyDescObj);
    }

    public static final /* synthetic */ void b(ConceptLinkContentRender conceptLinkContentRender, TextView textView, GameObj gameObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, textView, gameObj, str, str2}, null, changeQuickRedirect, true, 28057, new Class[]{ConceptLinkContentRender.class, TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.u(textView, gameObj, str, str2);
    }

    public static final /* synthetic */ void j(ConceptLinkContentRender conceptLinkContentRender, ls lsVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, lsVar, keyDescObj}, null, changeQuickRedirect, true, 28056, new Class[]{ConceptLinkContentRender.class, ls.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.E(lsVar, keyDescObj);
    }

    public static final /* synthetic */ void k(ConceptLinkContentRender conceptLinkContentRender, KeyDescObj keyDescObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, keyDescObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 28058, new Class[]{ConceptLinkContentRender.class, KeyDescObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.L(keyDescObj, z10);
    }

    public static final /* synthetic */ void l(ConceptLinkContentRender conceptLinkContentRender, PictureLinkContentTagObj pictureLinkContentTagObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, pictureLinkContentTagObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 28053, new Class[]{ConceptLinkContentRender.class, PictureLinkContentTagObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.M(pictureLinkContentTagObj, z10);
    }

    public static final /* synthetic */ void n(ConceptLinkContentRender conceptLinkContentRender, int i10, View view) {
        if (PatchProxy.proxy(new Object[]{conceptLinkContentRender, new Integer(i10), view}, null, changeQuickRedirect, true, 28054, new Class[]{ConceptLinkContentRender.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinkContentRender.P(i10, view);
    }

    private final void r(View view, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{view, str, str2}, this, changeQuickRedirect, false, 28029, new Class[]{View.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        float fP = com.max.hbutils.utils.n.p(str);
        float fP2 = com.max.hbutils.utils.n.p(str2);
        float fL = (ViewUtils.L(this.f81005b) * 2.4f) / 4.0f;
        float fL2 = (ViewUtils.L(this.f81005b) * 4.0f) / 3.0f;
        if (fP > 0.0f && fP2 > 0.0f && (fP > 450.0f || fP2 > 300.0f)) {
            fL = Math.min(fL2, Math.max(fL, (ViewUtils.L(this.f81005b) * fP2) / fP));
        }
        view.getLayoutParams().height = (int) fL;
    }

    private final void s(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 28040, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj == null) {
            this.f81007d.E.setVisibility(8);
            return;
        }
        if (!keyDescObj.isIs_default()) {
            keyDescObj.setIs_default(true);
            L(keyDescObj, false);
        }
        LinearLayout linearLayout = this.f81007d.E;
        linearLayout.setVisibility(0);
        linearLayout.setBackground(com.max.hbutils.utils.q.o(this.f81005b, R.color.toast_background_color_alpha90, 8.0f));
        linearLayout.setOnClickListener(new f(keyDescObj, keyDescObj));
        this.f81007d.f113659v.setText(keyDescObj.getDesc());
        com.max.hbimage.b.K(keyDescObj.getIcon(), this.f81007d.f113646i);
    }

    private final void u(TextView textView, GameObj gameObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, str, str2}, this, changeQuickRedirect, false, 28048, new Class[]{TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if (kotlin.text.u.L1("unfollowing", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(gameObj.getAppid());
        } else if (kotlin.text.u.L1("following", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(gameObj.getAppid());
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(gameObj.getAppid());
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(gameObj.getAppid(), str2);
        }
        if (zVarNb != null) {
            this.f81004a.c((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(textView, gameObj, str)));
        }
    }

    private final String x() {
        String strT;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28042, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        LinkInfoObj linkInfoObj = null;
        if (ad.a.b(ad.a.G, false, 2, null)) {
            AppCompatActivity appCompatActivity = this.f81005b;
            LinkInfoObj linkInfoObj2 = this.f81018o;
            if (linkInfoObj2 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj2 = null;
            }
            strT = com.max.hbutils.utils.w.q(appCompatActivity, linkInfoObj2.getCreate_at());
        } else {
            AppCompatActivity appCompatActivity2 = this.f81005b;
            LinkInfoObj linkInfoObj3 = this.f81018o;
            if (linkInfoObj3 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj3 = null;
            }
            strT = com.max.hbutils.utils.w.t(appCompatActivity2, linkInfoObj3.getCreate_at());
        }
        if (!com.max.hbcommon.utils.c.u(strT)) {
            LinkInfoObj linkInfoObj4 = this.f81018o;
            if (linkInfoObj4 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj4 = null;
            }
            if (!com.max.hbcommon.utils.c.u(linkInfoObj4.getIp_location())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strT);
                sb2.append(kotlin.text.y.f128610s);
                LinkInfoObj linkInfoObj5 = this.f81018o;
                if (linkInfoObj5 == null) {
                    f0.S("mLinkInfoObj");
                } else {
                    linkInfoObj = linkInfoObj5;
                }
                sb2.append(linkInfoObj.getIp_location());
                return sb2.toString();
            }
        }
        if (!com.max.hbcommon.utils.c.u(strT)) {
            return strT;
        }
        LinkInfoObj linkInfoObj6 = this.f81018o;
        if (linkInfoObj6 == null) {
            f0.S("mLinkInfoObj");
        } else {
            linkInfoObj = linkInfoObj6;
        }
        return linkInfoObj.getIp_location();
    }

    public final boolean B() {
        return this.f81006c;
    }

    public final void C() {
        String name;
        sb.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (ConceptLinkContentRender.class.isAnonymousClass()) {
            name = ConceptLinkContentRender.class.getName();
            f0.m(name);
        } else {
            name = ConceptLinkContentRender.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onContentExposure");
        aVar2.q(sb2.toString());
        if (!ViewUtils.f0(this.f81007d.A) || (aVar = this.f81017n) == null) {
            return;
        }
        aVar.f();
    }

    public final void D(@dl.d TextView tvFollowState, @dl.d GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{tvFollowState, gameObj}, this, changeQuickRedirect, false, 28047, new Class[]{TextView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tvFollowState, "tvFollowState");
        f0.p(gameObj, "gameObj");
        if (!com.max.hbcommon.utils.c.u(gameObj.getDownload_url_android())) {
            l0.z0(this.f81005b, gameObj.getDownload_url_android(), gameObj.getBundle_id());
            return;
        }
        if (i0.e(this.f81005b)) {
            if (!kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, gameObj.getFollow_state(), true)) {
                if (!kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, gameObj.getFollow_state(), true)) {
                    kotlin.text.u.L1(GameObj.FOLLOW_STATE_OWNED, gameObj.getFollow_state(), true);
                    return;
                } else {
                    r1.n2(tvFollowState, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true, true);
                    u(tvFollowState, gameObj, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
                    return;
                }
            }
            int iF = ViewUtils.f(this.f81005b, 10.0f);
            EditText editText = new EditText(this.f81005b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, iF, 0, iF * 2);
            editText.setLayoutParams(layoutParams);
            editText.setPadding(iF, iF, iF, iF);
            editText.setGravity(17);
            editText.setBackgroundDrawable(this.f81005b.getResources().getDrawable(R.drawable.bg_dialog_edit));
            editText.setTextSize(0, this.f81005b.getResources().getDimensionPixelSize(R.dimen.text_size_16));
            editText.setTextColor(this.f81005b.getResources().getColor(R.color.text_primary_1_color));
            editText.setInputType(3);
            String strX0 = r1.x0();
            if (com.max.hbcommon.utils.c.B(strX0)) {
                editText.setText(strX0);
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f81005b);
            fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.confirm_your_cell_phone_number)).l(com.max.xiaoheihe.utils.d.n0(R.string.game_reserve_desc)).i(editText).u(com.max.xiaoheihe.utils.d.n0(R.string.commit), new i(editText, tvFollowState, this, gameObj)).o(com.max.xiaoheihe.utils.d.n0(R.string.skip), new j(tvFollowState, this, gameObj));
            fVar.F();
            editText.requestFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    public final void G(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28049, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObj = this.f81018o;
        if (linkInfoObj == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj = null;
        }
        BBSUserInfoObj user = linkInfoObj.getUser();
        if (i0.r(user != null ? user.getUserid() : null)) {
            LinkInfoObj linkInfoObj2 = this.f81018o;
            if (linkInfoObj2 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj2 = null;
            }
            BBSUserInfoObj user2 = linkInfoObj2.getUser();
            if (i0.q(user2 != null ? user2.getUserid() : null)) {
                this.f81007d.f113660w.getTv_follow().setVisibility(8);
            } else {
                f81001x.a(this.f81007d.f113660w.getTv_follow(), str);
                this.f81007d.f113660w.getTv_follow().setVisibility(0);
            }
        } else {
            this.f81007d.f113660w.getTv_follow().setVisibility(8);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[refreshFollowButton]\nisVisible: ");
        sb2.append(this.f81007d.f113660w.getTv_follow().getVisibility() == 0);
        sb2.append("\ntext: ");
        sb2.append((Object) this.f81007d.f113660w.getTv_follow().getText());
        Log.d("DBG-ConceptLinkContentRender", sb2.toString());
    }

    public final void H(@dl.d String appIDs, @dl.d ViewGroup gameCard) {
        if (PatchProxy.proxy(new Object[]{appIDs, gameCard}, this, changeQuickRedirect, false, 28045, new Class[]{String.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(appIDs, "appIDs");
        f0.p(gameCard, "gameCard");
        ExpandMoreButton expandMoreButton = (ExpandMoreButton) gameCard.findViewById(R.id.emb_more);
        if (!com.max.hbcommon.utils.c.u(appIDs)) {
            LinearLayout linearLayout = this.f81007d.A;
            f0.o(linearLayout, "binding.vgGamecardList");
            this.f81017n = new sb.a(linearLayout, l.f81058a);
        }
        this.f81004a.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x4(appIDs, "link").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m(gameCard, expandMoreButton)));
    }

    public final void I(@dl.d String title, @dl.d TextView textview) {
        if (PatchProxy.proxy(new Object[]{title, textview}, this, changeQuickRedirect, false, 28041, new Class[]{String.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(title, "title");
        f0.p(textview, "textview");
        String strG = AccelWorldStringKt.g(title);
        if (strG == null) {
            strG = "";
        }
        StringBuilder sb2 = new StringBuilder(strG);
        Pattern patternCompile = Pattern.compile("(<em>(.*?)</em>)");
        for (Matcher matcher = patternCompile.matcher(title); matcher.find(); matcher = patternCompile.matcher(sb2)) {
            sb2.replace(matcher.start(), matcher.end(), matcher.group(2));
        }
        textview.setText(sb2);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0225  */
    public final void K() {
        String name;
        StringBuilder sb2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = "renderLinkContent, gameList = " + this.f81023t;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb3 = new StringBuilder();
        if (ConceptLinkContentRender.class.isAnonymousClass()) {
            name = ConceptLinkContentRender.class.getName();
            f0.m(name);
        } else {
            name = ConceptLinkContentRender.class.getSimpleName();
            f0.m(name);
        }
        sb3.append(name);
        sb3.append(", ");
        sb3.append(str);
        aVar.q(sb3.toString());
        S();
        T();
        U();
        Y();
        V();
        TextView renderLinkContent$lambda$5 = this.f81007d.f113656s;
        f0.o(renderLinkContent$lambda$5, "renderLinkContent$lambda$5");
        LinkInfoObj linkInfoObj = this.f81018o;
        LinkInfoObj linkInfoObj2 = null;
        if (linkInfoObj == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj = null;
        }
        renderLinkContent$lambda$5.setVisibility(com.max.hbcommon.utils.c.x(linkInfoObj.getIs_only_me_view()) ? 0 : 8);
        renderLinkContent$lambda$5.setBackground(com.max.hbutils.utils.q.o(this.f81005b, R.color.divider_secondary_1_color, 2.0f));
        if (this.f81006c) {
            this.f81007d.f113661x.setVisibility(0);
            this.f81007d.f113660w.setVisibility(8);
            LinkInfoObj linkInfoObj3 = this.f81018o;
            if (linkInfoObj3 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj3 = null;
            }
            linkInfoObj3.getIp_location();
            if (ad.a.b(ad.a.G, false, 2, null)) {
                AppCompatActivity appCompatActivity = this.f81005b;
                LinkInfoObj linkInfoObj4 = this.f81018o;
                if (linkInfoObj4 == null) {
                    f0.S("mLinkInfoObj");
                    linkInfoObj4 = null;
                }
                sb2 = new StringBuilder(com.max.hbutils.utils.w.q(appCompatActivity, linkInfoObj4.getCreate_at()));
            } else {
                AppCompatActivity appCompatActivity2 = this.f81005b;
                LinkInfoObj linkInfoObj5 = this.f81018o;
                if (linkInfoObj5 == null) {
                    f0.S("mLinkInfoObj");
                    linkInfoObj5 = null;
                }
                sb2 = new StringBuilder(com.max.hbutils.utils.w.t(appCompatActivity2, linkInfoObj5.getCreate_at()));
            }
            LinkInfoObj linkInfoObj6 = this.f81018o;
            if (linkInfoObj6 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj6 = null;
            }
            if (!com.max.hbcommon.utils.c.u(linkInfoObj6.getIp_location())) {
                if (sb2.length() > 0) {
                    sb2.append("·");
                }
                LinkInfoObj linkInfoObj7 = this.f81018o;
                if (linkInfoObj7 == null) {
                    f0.S("mLinkInfoObj");
                    linkInfoObj7 = null;
                }
                sb2.append(linkInfoObj7.getIp_location());
            }
            this.f81007d.f113657t.setText(sb2);
        } else {
            this.f81007d.f113661x.setVisibility(0);
            this.f81007d.f113660w.setVisibility(0);
            this.f81007d.f113657t.setText(x());
            LinkInfoObj linkInfoObj8 = this.f81018o;
            if (linkInfoObj8 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj8 = null;
            }
            BBSUserInfoObj user = linkInfoObj8.getUser();
            if (user != null) {
                this.f81007d.f113660w.setName(user.getUsername());
                this.f81007d.f113660w.getAvartar().setAvatar(user.getAvartar(), user.getAvatar_decoration());
                this.f81007d.f113660w.a(user.getMedal(), user.getMedals(), user.getUserid());
                LevelInfoObj level_info = user.getLevel_info();
                if (level_info != null) {
                    f0.o(level_info, "level_info");
                    this.f81007d.f113660w.setLevel(com.max.hbutils.utils.n.q(user.getLevel_info().getLevel()));
                }
                this.f81007d.f113660w.setType(BBSUserSectionView.BBSUserSectionType.FOLLOW_V2);
                this.f81007d.f113660w.getAvartar().setOnClickListener(new o(user, this));
                if (i0.q(user.getUserid())) {
                    this.f81007d.f113660w.getTv_follow().setVisibility(8);
                } else {
                    this.f81007d.f113660w.getTv_follow().setVisibility(0);
                }
            }
            this.f81007d.f113660w.setDesc(x());
            this.f81007d.f113660w.getTv_follow().setOnClickListener(new p());
            LinkInfoObj linkInfoObj9 = this.f81018o;
            if (linkInfoObj9 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj9 = null;
            }
            BBSUserInfoObj user2 = linkInfoObj9.getUser();
            if (i0.r(user2 != null ? user2.getUserid() : null)) {
                LinkInfoObj linkInfoObj10 = this.f81018o;
                if (linkInfoObj10 == null) {
                    f0.S("mLinkInfoObj");
                    linkInfoObj10 = null;
                }
                BBSUserInfoObj user3 = linkInfoObj10.getUser();
                if (i0.q(user3 != null ? user3.getUserid() : null)) {
                    this.f81007d.f113660w.getTv_follow().setVisibility(8);
                }
            } else {
                this.f81007d.f113660w.getTv_follow().setVisibility(8);
            }
        }
        LinkInfoObj linkInfoObj11 = this.f81018o;
        if (linkInfoObj11 == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj11 = null;
        }
        J(linkInfoObj11.getContent_tags());
        LinkInfoObj linkInfoObj12 = this.f81018o;
        if (linkInfoObj12 == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj12 = null;
        }
        if (com.max.hbcommon.utils.c.u(linkInfoObj12.getTitle())) {
            this.f81007d.f113658u.setVisibility(8);
        } else {
            LinkInfoObj linkInfoObj13 = this.f81018o;
            if (linkInfoObj13 == null) {
                f0.S("mLinkInfoObj");
                linkInfoObj13 = null;
            }
            String title = linkInfoObj13.getTitle();
            f0.o(title, "mLinkInfoObj.title");
            ExpressionTextView expressionTextView = this.f81007d.f113658u;
            f0.o(expressionTextView, "binding.tvTitle");
            I(title, expressionTextView);
            this.f81007d.f113658u.setVisibility(0);
        }
        n30 n30Var = this.f81007d;
        ConstraintLayout constraintLayout = n30Var.f113647j;
        f0.o(constraintLayout, "constraintLayout");
        LinkInfoObj linkInfoObj14 = this.f81018o;
        if (linkInfoObj14 == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj14 = null;
        }
        ArticleCollectionObj article_collection = linkInfoObj14.getArticle_collection();
        if (article_collection != null) {
            f0.o(article_collection, "article_collection");
            constraintLayout.setOnClickListener(new q(constraintLayout, article_collection));
            com.max.xiaoheihe.accelworld.l.q(constraintLayout, R.color.lib_permission_window_bg_color, 5.0f);
            n30Var.f113643f.setImageResource(R.drawable.common_copy_line_2_24x24);
            TextView textView = n30Var.f113645h;
            String title2 = article_collection.getTitle();
            if (title2 == null) {
                title2 = "合集【推荐】";
            }
            textView.setText(title2);
            n30Var.f113642e.setText(com.max.xiaoheihe.accelworld.l.g(article_collection.getPriority(), article_collection.getCount()));
            com.max.xiaoheihe.accelworld.l.x(n30Var.f113644g, R.drawable.ic_arrow_12, R.color.text_secondary_1_color);
        } else {
            article_collection = null;
        }
        constraintLayout.setVisibility(article_collection == null ? 8 : 0);
        X();
        this.f81007d.f113648k.setOnClickListener(new r(new SimpleDoubleClickDetector(300L, androidx.lifecycle.z.a(this.f81005b), null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$renderLinkContent$gestureDetector$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28092, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MotionEvent lastDownEvent;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28091, new Class[0], Void.TYPE).isSupported || (lastDownEvent = this.f81073b.v().f113648k.getLastDownEvent()) == null) {
                    return;
                }
                ConceptLinkContentRender conceptLinkContentRender = this.f81073b;
                conceptLinkContentRender.v().f113649l.c(lastDownEvent.getX(), lastDownEvent.getY());
                ConceptLinkContentRender.b bVarZ = conceptLinkContentRender.z();
                if (bVarZ != null) {
                    bVarZ.c();
                }
            }
        }, 4, null)));
        ls lsVar = this.f81007d.f113662y;
        f0.o(lsVar, "binding.vgEventEntry");
        LinkInfoObj linkInfoObj15 = this.f81018o;
        if (linkInfoObj15 == null) {
            f0.S("mLinkInfoObj");
        } else {
            linkInfoObj2 = linkInfoObj15;
        }
        E(lsVar, linkInfoObj2.getEvent_entry());
    }

    public final void N(@dl.d n30 n30Var) {
        if (PatchProxy.proxy(new Object[]{n30Var}, this, changeQuickRedirect, false, 28024, new Class[]{n30.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(n30Var, "<set-?>");
        this.f81007d = n30Var;
    }

    public final void O(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28051, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81007d.f113649l.setDoubleClickLottieKey(str);
    }

    public final void Q(@dl.e b bVar) {
        this.f81016m = bVar;
    }

    public final void R(@dl.d Context context, @dl.d ViewGroup viewGroup, @dl.d PictureLinkContentTagObj tag) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, tag}, this, changeQuickRedirect, false, 28050, new Class[]{Context.class, ViewGroup.class, PictureLinkContentTagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(viewGroup, "viewGroup");
        f0.p(tag, "tag");
        if (!tag.getReported_exposure()) {
            tag.setReported_exposure(true);
            M(tag, false);
        }
        View viewFindViewById = viewGroup.findViewById(R.id.v_arrow);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_tag_content);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_tag);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_icon);
        if (!com.max.hbcommon.utils.c.v(tag.getRight(), tag.getBottom())) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(tag.getRight()));
            marginLayoutParams.bottomMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(tag.getBottom()));
        }
        viewFindViewById.setBackground(ViewUtils.T(ViewUtils.f(this.f81005b, 6.0f), ViewUtils.f(this.f81005b, 13.0f), 0, com.max.hbcommon.utils.l.a(R.color.toast_background_color_alpha90)));
        viewGroup2.setBackground(com.max.hbutils.utils.q.o(this.f81005b, R.color.toast_background_color_alpha90, 8.0f));
        textView.setText(tag.getDesc());
        if (com.max.hbcommon.utils.c.u(tag.getIcon())) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.max.hbimage.b.K(tag.getIcon(), imageView);
        }
        viewGroup2.setOnClickListener(new s(tag, context));
    }

    public final void S() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f81023t)) {
            this.f81007d.f113663z.setVisibility(8);
            return;
        }
        this.f81007d.f113663z.setVisibility(0);
        String strH3 = CollectionsKt___CollectionsKt.h3(this.f81023t, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender$updateGameList$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final CharSequence a(@d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28096, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28097, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null);
        LinearLayout linearLayout = this.f81007d.f113663z;
        f0.o(linearLayout, "binding.vgGamecard");
        H(strH3, linearLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.s<KeyDescObj> sVar = null;
        if (com.max.hbcommon.utils.c.w(this.f81022s)) {
            this.f81007d.C.setVisibility(8);
            this.f81007d.f113655r.setVisibility(8);
            this.f81007d.f113641d.getRoot().setVisibility(8);
            this.f81007d.f113651n.setVisibility(8);
            AppCompatActivity appCompatActivity = this.f81005b;
            com.max.hbcommon.analytics.d.f fVar = appCompatActivity instanceof com.max.hbcommon.analytics.d.f ? (com.max.hbcommon.analytics.d.f) appCompatActivity : null;
            if (fVar != null) {
                BBSUserSectionView bBSUserSectionView = this.f81007d.f113660w;
                f0.o(bBSUserSectionView, "binding.vUserSection");
                new OneTimeValidExposureViewWatcher(fVar, bBSUserSectionView);
                return;
            }
            return;
        }
        SlideHorRecyclerView slideHorRecyclerView = this.f81007d.f113650m;
        f0.o(slideHorRecyclerView, "binding.rvImages");
        r(slideHorRecyclerView, this.f81022s.get(0).getWidth(), this.f81022s.get(0).getHeight());
        this.f81007d.C.setVisibility(0);
        this.f81007d.f113641d.getRoot().setVisibility(0);
        this.f81007d.f113655r.setVisibility(0);
        this.f81007d.f113655r.setBackground(com.max.hbutils.utils.q.o(this.f81005b, R.color.text_primary_1_color_alpha40, 2.0f));
        this.f81007d.f113655r.setText("1/" + this.f81022s.size());
        this.f81007d.f113650m.setLayoutManager(new LinearLayoutManager(this.f81005b, 0, false));
        AppCompatActivity appCompatActivity2 = this.f81005b;
        if (appCompatActivity2 instanceof BasePostPageActivity) {
            this.f81007d.f113650m.setParentView(((BasePostPageActivity) appCompatActivity2).q3());
        }
        this.f81007d.f113650m.setOnFlingListener(null);
        new PagerSnapHelper().attachToRecyclerView(this.f81007d.f113650m);
        com.max.hbcommon.base.adapter.s<BBSTextObj> sVar2 = this.f81020q;
        if (sVar2 != null) {
            com.max.hbcommon.base.adapter.d.b(sVar2, this.f81022s, new t());
        }
        this.f81014k = this.f81022s.size() > this.f81011h;
        if (this.f81022s.size() > 1) {
            this.f81012i.clear();
            this.f81007d.f113651n.setVisibility(0);
            this.f81007d.f113651n.setLayoutManager(this.f81015l);
            RecyclerView.ItemAnimator itemAnimator = this.f81007d.f113651n.getItemAnimator();
            f0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f81007d.f113651n.addOnScrollListener(new u());
            v vVar = new v(this.f81005b, this.f81012i);
            this.f81013j = vVar;
            this.f81007d.f113651n.setAdapter(vVar);
            if (this.f81014k) {
                this.f81007d.f113651n.getLayoutParams().width = ViewUtils.f(this.f81005b, 14.0f) * (this.f81011h + 1);
                int size = this.f81022s.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f81012i.add(new KeyDescObj());
                }
                this.f81009f = 0;
                this.f81010g = this.f81011h;
            } else {
                this.f81007d.f113651n.getLayoutParams().width = -2;
                int size2 = this.f81022s.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    this.f81012i.add(new KeyDescObj());
                }
            }
            this.f81012i.get(0).setChecked(true);
            com.max.hbcommon.base.adapter.s<KeyDescObj> sVar3 = this.f81013j;
            if (sVar3 == null) {
                f0.S("indexAdapter");
            } else {
                sVar = sVar3;
            }
            sVar.notifyDataSetChanged();
            t();
        } else {
            this.f81007d.f113651n.setVisibility(8);
        }
        if (this.f81007d.f113650m.getTag(R.id.tag_viewholder) == null) {
            w wVar = new w();
            this.f81007d.f113650m.addOnScrollListener(wVar);
            this.f81007d.f113650m.setTag(R.id.tag_viewholder, wVar);
        }
    }

    public final void U() {
        String image;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28034, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AppCompatActivity appCompatActivity = this.f81005b;
        if (!(!this.f81024u.isEmpty())) {
            LinkPostInfoDecoratorWidget updateLinkCard$lambda$16 = this.f81007d.f113639b;
            f0.o(updateLinkCard$lambda$16, "updateLinkCard$lambda$16");
            updateLinkCard$lambda$16.setVisibility(8);
            return;
        }
        CommentPostLinkCardObj commentPostLinkCardObj = this.f81024u.get(0);
        f0.o(commentPostLinkCardObj, "linkCardList[0]");
        CommentPostLinkCardObj commentPostLinkCardObj2 = commentPostLinkCardObj;
        LinkPostInfoDecoratorWidget updateLinkCard$lambda$15 = this.f81007d.f113639b;
        f0.o(updateLinkCard$lambda$15, "updateLinkCard$lambda$15");
        updateLinkCard$lambda$15.setVisibility(0);
        ImageView mPostImageView = updateLinkCard$lambda$15.getMPostImageView();
        if (mPostImageView != null && (image = commentPostLinkCardObj2.getImage()) != null) {
            com.max.hbimage.b.U(image, mPostImageView, com.max.hbutils.utils.q.l(appCompatActivity, mPostImageView.getWidth(), mPostImageView.getHeight(), mPostImageView.getHeight()));
        }
        TextView mPostAuthorTextView = updateLinkCard$lambda$15.getMPostAuthorTextView();
        if (mPostAuthorTextView != null) {
            mPostAuthorTextView.setText(commentPostLinkCardObj2.getUsername());
        }
        TextView mPostInfoTextView = updateLinkCard$lambda$15.getMPostInfoTextView();
        if (mPostInfoTextView != null) {
            mPostInfoTextView.setText(commentPostLinkCardObj2.getText());
        }
        updateLinkCard$lambda$15.setOnClickListener(new x(appCompatActivity, commentPostLinkCardObj2));
    }

    public final void W(@dl.d LinkInfoObj linkInfoObj, @dl.e List<String> list) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, list}, this, changeQuickRedirect, false, 28025, new Class[]{LinkInfoObj.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkInfoObj, "linkInfoObj");
        this.f81018o = linkInfoObj;
        this.f81019p = list;
        com.max.heybox.hblog.g.f74531b.q("ConceptLinkContentRender, mThumbs = " + this.f81019p);
        this.f81021r.clear();
        this.f81022s.clear();
        this.f81023t.clear();
        this.f81025v.clear();
        this.f81026w.clear();
        LinkInfoObj linkInfoObj2 = this.f81018o;
        if (linkInfoObj2 == null) {
            f0.S("mLinkInfoObj");
            linkInfoObj2 = null;
        }
        List<BBSTextObj> listB = com.max.hbutils.utils.k.b(linkInfoObj2.getText(), BBSTextObj.class);
        if (!com.max.hbcommon.utils.c.w(listB)) {
            for (BBSTextObj bBSTextObj : listB) {
                if (bBSTextObj != null) {
                    ContentType.a aVar = ContentType.Companion;
                    String type = bBSTextObj.getType();
                    f0.o(type, "contextObj.type");
                    ContentType contentTypeA = aVar.a(type);
                    if (contentTypeA != null) {
                        switch (c.f81027a[contentTypeA.ordinal()]) {
                            case 1:
                                this.f81021r.add(bBSTextObj.getText());
                                break;
                            case 2:
                                this.f81022s.add(bBSTextObj);
                                break;
                            case 3:
                                if (!com.max.hbcommon.utils.c.u(bBSTextObj.getAppid())) {
                                    this.f81023t.add(bBSTextObj.getAppid());
                                }
                                break;
                            case 4:
                                this.f81024u.add(new CommentPostLinkCardObj(bBSTextObj.getProtocol(), bBSTextObj.getImage(), bBSTextObj.getText(), bBSTextObj.getUsername()));
                                break;
                            case 5:
                                LinkToolCardObj tool_card = bBSTextObj.getTool_card();
                                if (tool_card != null) {
                                    f0.o(tool_card, "tool_card");
                                    this.f81025v.add(tool_card);
                                }
                                break;
                            case 6:
                                KeyDescObj post_guide_card = bBSTextObj.getPost_guide_card();
                                if (post_guide_card != null) {
                                    f0.o(post_guide_card, "post_guide_card");
                                    this.f81026w.add(post_guide_card);
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        K();
    }

    public final void Y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28037, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f81025v)) {
            RecyclerView recyclerView = this.f81007d.f113653p;
            f0.o(recyclerView, "binding.rvToolCard");
            recyclerView.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = this.f81007d.f113653p;
            f0.o(recyclerView2, "binding.rvToolCard");
            recyclerView2.setVisibility(0);
            this.f81007d.f113653p.setLayoutManager(new LinearLayoutManager(this.f81005b));
            this.f81007d.f113653p.setAdapter(new a0(this.f81005b, this.f81025v));
        }
    }

    public final void q(@dl.d GameObj gameInfo, @dl.d ViewGroup gameCardContainer) {
        if (PatchProxy.proxy(new Object[]{gameInfo, gameCardContainer}, this, changeQuickRedirect, false, 28046, new Class[]{GameObj.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameInfo, "gameInfo");
        f0.p(gameCardContainer, "gameCardContainer");
        this.f81007d.f113663z.setBackgroundResource(R.drawable.divider_color_bg_stroke_8dp);
        View viewInflate = LayoutInflater.from(this.f81005b).inflate(R.layout.item_concept_game_card_v2, gameCardContainer, false);
        viewInflate.setTag(gameInfo);
        viewInflate.setOnClickListener(new d(gameInfo));
        GameCard gameCard = (GameCard) viewInflate.findViewById(R.id.game_card_concept_link);
        if (gameCard != null) {
            gameCard.b(gameInfo);
        }
        TextView tv_follow_state = gameCard != null ? gameCard.getTv_follow_state() : null;
        if (gameInfo.getHeybox_price() != null) {
            if (tv_follow_state != null) {
                tv_follow_state.setClickable(false);
            }
        } else if (tv_follow_state != null) {
            tv_follow_state.setOnClickListener(new e(tv_follow_state, gameInfo));
        }
        gameCardContainer.addView(viewInflate);
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28044, new Class[0], Void.TYPE).isSupported || !this.f81014k) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzconceptindex", "first ==" + this.f81009f + "  lastIndex ==" + this.f81010g);
        int i10 = this.f81009f;
        int i11 = this.f81010g;
        if (i10 > i11) {
            return;
        }
        while (true) {
            View viewFindViewByPosition = findViewByPosition(i10);
            if (i10 >= 0 && i10 < this.f81012i.size()) {
                if (this.f81012i.get(i10).isChecked()) {
                    P(1, viewFindViewByPosition);
                } else if (i10 <= this.f81009f && i10 != 0) {
                    P(2, viewFindViewByPosition);
                } else if (i10 < this.f81010g || i10 == this.f81012i.size() - 1) {
                    P(4, viewFindViewByPosition);
                } else {
                    P(3, viewFindViewByPosition);
                }
            }
            if (i10 == i11) {
                return;
            } else {
                i10++;
            }
        }
    }

    @dl.d
    public final n30 v() {
        return this.f81007d;
    }

    @dl.d
    public final io.reactivex.disposables.a w() {
        return this.f81004a;
    }

    @dl.d
    public final AppCompatActivity y() {
        return this.f81005b;
    }

    @dl.e
    public final b z() {
        return this.f81016m;
    }
}
