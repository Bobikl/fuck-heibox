package com.max.xiaoheihe.module.bbs.component.bottomeditorbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.v;
import androidx.compose.runtime.internal.o;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbexpression.ExpressionAssetManager;
import com.max.hbexpression.RecentEmojiManger;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbexpression.f;
import com.max.hbexpression.q;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendItemObj;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.b30;
import df.ge;
import df.he;
import dl.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Pair;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: BaseBottomEditorBar.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBaseBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1172:1\n262#2,2:1173\n262#2,2:1175\n262#2,2:1177\n262#2,2:1179\n262#2,2:1181\n13579#3,2:1183\n1#4:1185\n*S KotlinDebug\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar\n*L\n473#1:1173,2\n475#1:1175,2\n479#1:1177,2\n497#1:1179,2\n500#1:1181,2\n1095#1:1183,2\n*E\n"})
@o(parameters = 0)
public abstract class BaseBottomEditorBar extends RelativeLayout implements x, q.a, q.b {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;

    @dl.d
    private static final String Q = "tag_expression_fragment";
    public static final int R = 500;
    public static final int S = 20;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;

    @dl.e
    private ValueAnimator B;
    private int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private int H;

    @dl.e
    private Drawable I;

    @dl.e
    private FragmentManager J;
    private int K;
    private boolean L;
    private int M;

    @dl.e
    private b N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final b30 f80916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final View f80917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ExpressionEditText f80918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final LinearLayout f80919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final LinearLayout f80920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private q f80921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private ArrayList<ValueAnimator> f80922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.x f80923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f80924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f80925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private Timer f80926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private TimerTask f80927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private String f80928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f80929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private View.OnFocusChangeListener f80930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f80931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f80932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f80933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f80934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f80935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f80936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f80937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f80938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f80939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f80940z;

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27881, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : BaseBottomEditorBar.Q;
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public interface b {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class c implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27882, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.h(BaseBottomEditorBar.this);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class d extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@dl.d RecyclerView recyclerView, @dl.d RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 27885, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(recyclerView, "recyclerView");
            f0.p(viewHolder, "viewHolder");
            return (BaseBottomEditorBar.this.getImgPathList().size() <= 0 || viewHolder.getAdapterPosition() >= BaseBottomEditorBar.this.getImgPathList().size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@dl.d RecyclerView recyclerView, @dl.d RecyclerView.ViewHolder viewHolder, @dl.d RecyclerView.ViewHolder target) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, target}, this, changeQuickRedirect, false, 27883, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(recyclerView, "recyclerView");
            f0.p(viewHolder, "viewHolder");
            f0.p(target, "target");
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            if (BaseBottomEditorBar.this.getImgPathList() == null || BaseBottomEditorBar.this.getImgPathList().size() <= 0 || adapterPosition >= BaseBottomEditorBar.this.getImgPathList().size() || adapterPosition2 >= BaseBottomEditorBar.this.getImgPathList().size()) {
                return false;
            }
            if (adapterPosition >= adapterPosition2) {
                int i10 = adapterPosition2 + 1;
                if (i10 <= adapterPosition) {
                    int i11 = adapterPosition;
                    while (true) {
                        Collections.swap(BaseBottomEditorBar.this.getImgPathList(), i11, i11 - 1);
                        if (i11 == i10) {
                            break;
                        }
                        i11--;
                    }
                }
            } else {
                int i12 = adapterPosition;
                while (i12 < adapterPosition2) {
                    int i13 = i12 + 1;
                    Collections.swap(BaseBottomEditorBar.this.getImgPathList(), i12, i13);
                    i12 = i13;
                }
            }
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = BaseBottomEditorBar.this.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 27884, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            int adapterPosition = viewHolder.getAdapterPosition();
            if (BaseBottomEditorBar.this.getImgPathList().size() <= 0 || adapterPosition >= BaseBottomEditorBar.this.getImgPathList().size()) {
                return;
            }
            BaseBottomEditorBar.this.getImgPathList().remove(adapterPosition);
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = BaseBottomEditorBar.this.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.notifyItemRemoved(adapterPosition);
            }
            BaseBottomEditorBar.h(BaseBottomEditorBar.this);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ExpressionObj> f80944c;

        e(Ref.ObjectRef<ExpressionObj> objectRef) {
            this.f80944c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27888, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.this.o0(this.f80944c.f124891b);
            RecentEmojiManger.f70167a.g(this.f80944c.f124891b);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27889, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.this.setRecommendCheck(true);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27890, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.this.setRecommendCheck(false);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27891, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar baseBottomEditorBar = BaseBottomEditorBar.this;
            baseBottomEditorBar.C(baseBottomEditorBar.getEditor());
            BaseBottomEditorBar.this.getEditor().clearFocus();
            BaseBottomEditorBar.this.w();
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    @t0({"SMAP\nBaseBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar$initWindowInsets$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1172:1\n162#2,8:1173\n*S KotlinDebug\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar$initWindowInsets$1\n*L\n232#1:1173,8\n*E\n"})
    public static final class i implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
            int i10;
            Window window;
            View decorView;
            n3 n3VarO0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, 27892, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            f0.p(v10, "v");
            f0.p(windowInsets, "windowInsets");
            h0 h0VarF = windowInsets.f(n3.m.d());
            f0.o(h0VarF, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
            h0 h0VarF2 = windowInsets.f(n3.m.i());
            f0.o(h0VarF2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
            int i11 = h0VarF2.f20745d;
            if (i11 > ViewUtils.J(BaseBottomEditorBar.this.getContext()) * 0.2f) {
                i11 = 0;
            } else if (i11 == 0 && (i10 = t.f73585f) != 0) {
                i11 = i10;
            }
            int i12 = h0VarF.f20745d - i11;
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            aVar.M("imeHeight = " + i12 + "  imeInsets: " + h0VarF.f20745d + "   systemBarInsets: " + h0VarF2.f20745d);
            if (i12 > 0) {
                BaseBottomEditorBar.this.C = i12;
                BaseBottomEditorBar.n(BaseBottomEditorBar.this);
                BaseBottomEditorBar baseBottomEditorBar = BaseBottomEditorBar.this;
                LinearLayout linearLayout = baseBottomEditorBar.getMBinding().A;
                f0.o(linearLayout, "mBinding.vgBottomBlock");
                BaseBottomEditorBar.o(baseBottomEditorBar, linearLayout, i12);
            } else {
                ValueAnimator valueAnimator = BaseBottomEditorBar.this.B;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                LinearLayout linearLayout2 = BaseBottomEditorBar.this.getMBinding().A;
                f0.o(linearLayout2, "mBinding.vgBottomBlock");
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), 0);
            }
            if (t.f73585f == 0) {
                Context context = BaseBottomEditorBar.this.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (n3VarO0 = j1.o0(decorView)) != null) {
                    i11 = n3VarO0.f(n3.m.g()).f20745d;
                }
                aVar.M("sNavBarHeight = " + i11);
                BaseBottomEditorBar.i(BaseBottomEditorBar.this, i11);
            }
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class j implements ExpressionEditText.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.expression.widget.ExpressionEditText.d
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27893, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.k(BaseBottomEditorBar.this, false);
            BaseBottomEditorBar.this.setEditAddCY(false);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class k extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f80951b;

        k(RelativeLayout relativeLayout) {
            this.f80951b = relativeLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 27894, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f80951b.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f80953c;

        l(View.OnClickListener onClickListener) {
            this.f80953c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27897, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (AccelWorldStringKt.c(BaseBottomEditorBar.this.getMBinding().f108761d.getContentText()) <= BaseBottomEditorBar.this.getPostCommentTextNumMaxLimit()) {
                View.OnClickListener onClickListener = this.f80953c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            }
            com.max.hbutils.utils.x.p("评论不能超过" + BaseBottomEditorBar.this.getPostCommentTextNumMaxLimit() + "字哦");
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27900, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseBottomEditorBar.this.setFollowStatusTipsVisible(false);
        }
    }

    /* JADX INFO: compiled from: BaseBottomEditorBar.kt */
    @t0({"SMAP\nBaseBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar$updatePaddingWithAnimation$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1172:1\n162#2,8:1173\n*S KotlinDebug\n*F\n+ 1 BaseBottomEditorBar.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BaseBottomEditorBar$updatePaddingWithAnimation$1\n*L\n284#1:1173,8\n*E\n"})
    public static final class n implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f80955b;

        n(View view) {
            this.f80955b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 27901, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            com.max.heybox.hblog.g.f74531b.q("update Padding " + iIntValue);
            View view = this.f80955b;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iIntValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BaseBottomEditorBar(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BaseBottomEditorBar(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BaseBottomEditorBar(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context);
        f0.p(context, "context");
        b30 b30VarC = b30.c(LayoutInflater.from(context));
        f0.o(b30VarC, "inflate(LayoutInflater.from(context))");
        this.f80916b = b30VarC;
        View view = b30VarC.f108779v;
        f0.o(view, "mBinding.vMask");
        this.f80917c = view;
        ExpressionEditText expressionEditText = b30VarC.f108761d;
        f0.o(expressionEditText, "mBinding.etEditor");
        this.f80918d = expressionEditText;
        LinearLayout linearLayout = b30VarC.f108783z;
        f0.o(linearLayout, "mBinding.vgBottomBar");
        this.f80919e = linearLayout;
        LinearLayout linearLayout2 = b30VarC.L;
        f0.o(linearLayout2, "mBinding.vgRightButtons");
        this.f80920f = linearLayout2;
        this.f80924j = new ArrayList<>();
        this.f80928n = "参与讨论";
        this.f80937w = true;
        this.f80940z = "1";
        this.D = ViewUtils.f(context, 12.0f);
        this.F = ViewUtils.f(context, 12.0f);
        this.G = R.drawable.bbs_emoji_filled_24x24;
        this.H = R.color.white_alpha5;
        this.K = 49;
        this.M = 500;
        L();
    }

    public /* synthetic */ BaseBottomEditorBar(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final View D(@v int i10, String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27822, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        LinearLayout linearLayoutB = E(i10, str, z10).b();
        f0.o(linearLayoutB, "inflateButtonVB(drawable…ription, enableFill).root");
        return linearLayoutB;
    }

    public static /* synthetic */ ge F(BaseBottomEditorBar baseBottomEditorBar, int i10, String str, boolean z10, int i11, Object obj) {
        Object[] objArr = {baseBottomEditorBar, new Integer(i10), str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27826, new Class[]{BaseBottomEditorBar.class, cls, String.class, Boolean.TYPE, cls, Object.class}, ge.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge) patchProxyResultProxy.result;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inflateButtonVB");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return baseBottomEditorBar.E(i10, str, z10);
    }

    public static /* synthetic */ he H(BaseBottomEditorBar baseBottomEditorBar, int i10, String str, boolean z10, int i11, Object obj) {
        Object[] objArr = {baseBottomEditorBar, new Integer(i10), str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27828, new Class[]{BaseBottomEditorBar.class, cls, String.class, Boolean.TYPE, cls, Object.class}, he.class);
        if (patchProxyResultProxy.isSupported) {
            return (he) patchProxyResultProxy.result;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inflateLottieButtonVB");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return baseBottomEditorBar.G(i10, str, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.max.hbexpression.bean.ExpressionObj] */
    private final void J() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27837, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.J.removeAllViews();
        int iU = u();
        int iV = v(iU - 2);
        RecentEmojiManger recentEmojiManger = RecentEmojiManger.f70167a;
        LinkedList<String> linkedListB = recentEmojiManger.b();
        f0.m(linkedListB);
        kotlin.collections.x.I0(linkedListB, new yh.l<String, Boolean>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar$initRecentEmoji$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final Boolean a(@d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 27886, new Class[]{String.class}, Boolean.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Boolean) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return Boolean.valueOf(!ExpressionAssetManager.f69919a.t(it) && f.b(it) == null);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27887, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        });
        LinkedList<String> linkedListB2 = recentEmojiManger.b();
        f0.m(linkedListB2);
        int iMin = Math.min(iU, linkedListB2.size());
        while (i10 < iMin) {
            LinkedList<String> linkedListB3 = RecentEmojiManger.f70167a.b();
            f0.m(linkedListB3);
            String str = linkedListB3.get(i10);
            f0.o(str, "RecentEmojiManger.mMemoryCache!![i]");
            String str2 = str;
            FrameLayout frameLayout = new FrameLayout(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            ImageView imageView = new ImageView(getContext());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? expressionObj = new ExpressionObj(str2, -1, com.max.hbexpression.f.b(str2));
            expressionObj.setType(1);
            objectRef.f124891b = expressionObj;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 22.0f));
            layoutParams2.leftMargin = i10 == 0 ? ViewUtils.f(getContext(), 12.0f) : iV / 2;
            layoutParams2.rightMargin = i10 == iMin + (-1) ? ViewUtils.f(getContext(), 12.0f) : iV / 2;
            layoutParams2.gravity = 1;
            com.max.hbexpression.f.i((ExpressionObj) objectRef.f124891b, imageView);
            frameLayout.addView(imageView, layoutParams2);
            frameLayout.setOnClickListener(new e(objectRef));
            this.f80916b.J.addView(frameLayout, layoutParams);
            i10++;
        }
    }

    private final void K() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108780w.setOnClickListener(new f());
        this.f80916b.f108782y.setOnClickListener(new g());
        setRecommendCheck(true);
    }

    private final void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27812, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j1.a2(this, new i());
    }

    private final void V() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27841, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f80924j.size() <= 0 || !Q()) {
            this.f80916b.G.setVisibility(8);
        } else {
            this.f80916b.G.setVisibility(0);
        }
    }

    private final void Y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27866, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<ValueAnimator> arrayList = this.f80922h;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            arrayList.clear();
        }
        this.f80922h = null;
    }

    private final void Z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f80934t) {
            this.f80918d.P(lb.b.f131098n);
        } else {
            int textSize = (int) this.f80918d.getPaint().getTextSize();
            this.f80918d.J(lb.b.f131098n, new com.max.hbexpression.widget.a(getContext(), R.drawable.item_cy_icon, textSize + ViewUtils.f(getContext(), 5.0f), 0, textSize, 1));
        }
    }

    private final void a0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27814, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108761d.setOnTextCountChangedListener(new yh.l<Integer, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar$setInputTextNumChangedListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Integer curTextNumCount) {
                if (PatchProxy.proxy(new Object[]{curTextNumCount}, this, changeQuickRedirect, false, 27895, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                int postCommentTextNumMaxLimit = this.f80956b.getPostCommentTextNumMaxLimit();
                f0.o(curTextNumCount, "curTextNumCount");
                int iIntValue = postCommentTextNumMaxLimit - curTextNumCount.intValue();
                TextView invoke$lambda$0 = this.f80956b.getMBinding().f108773p;
                if (iIntValue < 0) {
                    f0.o(invoke$lambda$0, "invoke$lambda$0");
                    invoke$lambda$0.setVisibility(0);
                    invoke$lambda$0.setText(String.valueOf(iIntValue));
                    invoke$lambda$0.setTextColor(invoke$lambda$0.getContext().getColor(R.color.alert_color));
                    return;
                }
                if (iIntValue > 20) {
                    f0.o(invoke$lambda$0, "invoke$lambda$0");
                    invoke$lambda$0.setVisibility(8);
                } else {
                    f0.o(invoke$lambda$0, "invoke$lambda$0");
                    invoke$lambda$0.setVisibility(0);
                    invoke$lambda$0.setText(String.valueOf(iIntValue));
                    invoke$lambda$0.setTextColor(invoke$lambda$0.getContext().getColor(R.color.text_secondary_1_color));
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 27896, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num);
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final String getTAG_EXPRESSION_FRAGMENT() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27875, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : O.a();
    }

    public static final /* synthetic */ void h(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, null, changeQuickRedirect, true, 27880, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.V();
    }

    public static final /* synthetic */ void i(BaseBottomEditorBar baseBottomEditorBar, int i10) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar, new Integer(i10)}, null, changeQuickRedirect, true, 27878, new Class[]{BaseBottomEditorBar.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.setContentViewMinHeight(i10);
    }

    private final void j0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27816, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float fJ = ((((int) (ViewUtils.J(getContext()) * 0.75f)) - this.C) - (ViewUtils.f(getContext(), 48.0f) + this.f80916b.J.getHeight())) - ViewUtils.f(getContext(), this.f80924j.size() > 0 ? 44 : 0);
        com.max.heybox.hblog.g.f74531b.q("editorMaxHeight = " + fJ + " screenHeight = " + ViewUtils.J(getContext()) + " imeHeight = " + this.C + ' ');
        this.f80918d.setMaxHeight((int) fJ);
    }

    public static final /* synthetic */ void k(BaseBottomEditorBar baseBottomEditorBar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 27879, new Class[]{BaseBottomEditorBar.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.setCyIconState(z10);
    }

    private final void l0(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 27815, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getPaddingBottom(), i10);
        valueAnimatorOfInt.addUpdateListener(new n(view));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
        this.B = valueAnimatorOfInt;
    }

    private final boolean m0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27824, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1200g, false);
    }

    public static final /* synthetic */ void n(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, null, changeQuickRedirect, true, 27876, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.j0();
    }

    public static final /* synthetic */ void o(BaseBottomEditorBar baseBottomEditorBar, View view, int i10) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar, view, new Integer(i10)}, null, changeQuickRedirect, true, 27877, new Class[]{BaseBottomEditorBar.class, View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.l0(view, i10);
    }

    private final void s(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 27865, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f80922h == null) {
            this.f80922h = new ArrayList<>();
        }
        ArrayList<ValueAnimator> arrayList = this.f80922h;
        if (arrayList != null) {
            arrayList.add(valueAnimator);
        }
    }

    private final void setContentViewMinHeight(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27813, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Log.d("lockContentMinHeight", String.valueOf(this.L));
        if (this.L) {
            this.K = 65;
        } else {
            this.K = i10 != 0 ? 49 : 65;
        }
        LinearLayout linearLayout = this.f80916b.f108783z;
        float f10 = this.K;
        Context context = getContext();
        f0.o(context, "context");
        linearLayout.setMinimumHeight(com.max.xiaoheihe.accelworld.l.c(f10, context));
    }

    private final void setCyIconState(boolean z10) {
        int i10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27857, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("cy state = " + z10);
        if (z10) {
            i10 = R.color.text_primary_1_color;
        } else {
            i10 = this.f80938x ? R.color.white : R.color.text_secondary_2_color;
        }
        this.f80916b.f108763f.setColorFilter(com.max.xiaoheihe.utils.d.F(getContext(), i10));
    }

    private final Pair<Float, Float> t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27823, new Class[0], Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        return m0() ? new Pair<>(Float.valueOf(40.0f), Float.valueOf(33.0f)) : new Pair<>(Float.valueOf(42.0f), Float.valueOf(36.0f));
    }

    private final int u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27839, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iL = ViewUtils.L(getContext());
        int iF = ViewUtils.f(getContext(), 22.0f);
        int iF2 = ViewUtils.f(getContext(), 12.0f);
        int iF3 = ViewUtils.f(getContext(), 16.0f);
        int i10 = (iL - ((iF2 - (iF3 / 2)) * 2)) / (iF + iF3);
        com.max.hbcommon.utils.d.b("zzzztest", "count = " + i10);
        return i10;
    }

    private final int v(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27838, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iL = ViewUtils.L(getContext());
        int iF = ViewUtils.f(getContext(), 22.0f);
        int iF2 = (((iL - (ViewUtils.f(getContext(), 12.0f) * 2)) - (iF * 2)) - (iF * i10)) / (i10 + 1);
        com.max.hbcommon.utils.d.b("zzzztest", "space = " + iF2);
        return iF2;
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27811, new Class[0], Void.TYPE).isSupported || m0()) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        f0.o(context, "context");
        gradientDrawable.setSize(com.max.accelworld.c.c(2, context), 0);
        this.f80920f.setDividerDrawable(gradientDrawable);
        this.f80920f.setShowDividers(2);
    }

    private final void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27809, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f80938x) {
            this.f80916b.f108778u.setBackground(ViewUtils.G(ViewUtils.o(getContext(), this.f80916b.f108778u), com.max.xiaoheihe.utils.d.E(R.color.white)));
        } else {
            this.f80916b.f108778u.setBackground(ViewUtils.w(ViewUtils.o(getContext(), this.f80916b.f108778u), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
        }
    }

    public final void A(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27842, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.b().setVisibility(z10 ? 0 : 8);
        this.f80916b.F.setClickable(z10);
        this.f80918d.setClickable(z10);
        this.f80918d.setFocusable(z10);
        this.f80918d.setFocusableInTouchMode(z10);
        if (!z10) {
            this.f80916b.F.setOnClickListener(null);
            this.f80918d.setOnClickListener(null);
            this.f80918d.setOnFocusChangeListener(null);
            this.f80928n = getContext().getString(R.string.disable_comment_hint);
            this.f80918d.setHint(R.string.disable_comment_hint);
            return;
        }
        this.f80916b.F.setOnClickListener(this.f80929o);
        this.f80918d.setOnClickListener(this.f80929o);
        this.f80918d.setOnFocusChangeListener(this.f80930p);
        this.f80918d.setFocusable(z11);
        this.f80918d.setFocusableInTouchMode(z11);
        this.f80918d.setHint(this.f80928n);
    }

    public void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27830, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!P()) {
            this.f80917c.setAlpha(0.0f);
            this.f80917c.setVisibility(0);
            this.f80917c.animate().alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300L);
        }
        if (this.A) {
            LinearLayout linearLayout = this.f80916b.K;
            f0.o(linearLayout, "mBinding.vgRecommendBtns");
            linearLayout.setVisibility(this.f80936v ^ true ? 0 : 8);
        } else {
            LinearLayout linearLayout2 = this.f80916b.K;
            f0.o(linearLayout2, "mBinding.vgRecommendBtns");
            linearLayout2.setVisibility(8);
        }
        W(true);
        this.f80916b.D.setVisibility(0);
        RelativeLayout relativeLayout = this.f80916b.f108770m;
        f0.o(relativeLayout, "mBinding.rlExpandViewContainer");
        relativeLayout.setVisibility(0);
        this.f80916b.E.setVisibility(this.f80936v ? 0 : 8);
        this.f80918d.setSingleLine(false);
        j0();
        q qVar = this.f80921g;
        if (qVar != null) {
            this.f80935u = false;
            this.f80916b.f108765h.setImageResource(this.G);
            qVar.C();
        }
        U(true);
        h0();
        b bVar = this.N;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void C(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27818, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @dl.d
    @SuppressLint({"ClickableViewAccessibility"})
    public final ge E(@v int i10, @dl.d String description, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), description, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27825, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, ge.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge) patchProxyResultProxy.result;
        }
        f0.p(description, "description");
        ge geVarC = ge.c(LayoutInflater.from(getContext()));
        f0.o(geVarC, "inflate(LayoutInflater.from(context))");
        ImageView imageView = geVarC.f110951b;
        f0.o(imageView, "buttonBinding.img");
        ShineButton shineButton = geVarC.f110952c;
        f0.o(shineButton, "buttonBinding.shineButton");
        TextView textView = geVarC.f110953d;
        f0.o(textView, "buttonBinding.text");
        Pair<Float, Float> pairT = t();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), pairT.e().floatValue()), -2);
        layoutParams.gravity = 17;
        geVarC.b().setMinimumHeight(ViewUtils.f(getContext(), pairT.f().floatValue()));
        geVarC.b().setLayoutParams(layoutParams);
        if (z10) {
            imageView.setVisibility(8);
            shineButton.setVisibility(0);
            shineButton.setBackgroundResource(i10);
            shineButton.setShapeResource(i10);
        } else {
            imageView.setVisibility(0);
            shineButton.setVisibility(8);
            imageView.setImageResource(i10);
        }
        textView.setText(description);
        return geVarC;
    }

    @dl.d
    @SuppressLint({"ClickableViewAccessibility"})
    public final he G(@v int i10, @dl.d String description, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), description, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27827, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, he.class);
        if (patchProxyResultProxy.isSupported) {
            return (he) patchProxyResultProxy.result;
        }
        f0.p(description, "description");
        he heVarC = he.c(LayoutInflater.from(getContext()));
        f0.o(heVarC, "inflate(LayoutInflater.from(context))");
        ImageView imageView = heVarC.f111409b;
        f0.o(imageView, "buttonBinding.img");
        ShineButton shineButton = heVarC.f111412e;
        f0.o(shineButton, "buttonBinding.shineButton");
        TextView textView = heVarC.f111413f;
        f0.o(textView, "buttonBinding.text");
        Pair<Float, Float> pairT = t();
        heVarC.b().setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(getContext(), pairT.e().floatValue()), ViewUtils.f(getContext(), pairT.f().floatValue())));
        if (z10) {
            imageView.setVisibility(8);
            shineButton.setVisibility(0);
            heVarC.f111411d.setVisibility(8);
            shineButton.setBackgroundResource(i10);
            shineButton.setShapeResource(i10);
        } else {
            imageView.setVisibility(0);
            shineButton.setVisibility(8);
            heVarC.f111411d.setVisibility(8);
            imageView.setImageResource(i10);
        }
        textView.setText(description);
        return heVarC;
    }

    public final void I(@dl.d com.max.xiaoheihe.module.bbs.adapter.x.a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, 27859, new Class[]{com.max.xiaoheihe.module.bbs.adapter.x.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f80916b.f108771n.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f80916b.f108771n.setLayoutManager(linearLayoutManager);
        com.max.xiaoheihe.module.bbs.adapter.x xVar = new com.max.xiaoheihe.module.bbs.adapter.x(getContext());
        this.f80923i = xVar;
        xVar.s(listener);
        com.max.xiaoheihe.module.bbs.adapter.x xVar2 = this.f80923i;
        if (xVar2 != null) {
            xVar2.t(new c());
        }
        this.f80916b.f108771n.setAdapter(this.f80923i);
        d dVar = new d();
        this.f80933s = f0.g("1", com.max.hbcache.c.j("combo_tip_shown"));
        new ItemTouchHelper(dVar).attachToRecyclerView(this.f80916b.f108771n);
    }

    public void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27808, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addView(this.f80916b.b(), new ViewGroup.LayoutParams(-1, -1));
        this.f80916b.b().setVisibility(0);
        this.f80916b.f108779v.setOnClickListener(new h());
        z();
        J();
        M();
        K();
        setContentViewMinHeight(t.f73585f);
        if (ad.a.a(ad.a.f1215v, false)) {
            a0();
        }
    }

    public final boolean N() {
        return this.f80934t;
    }

    public final boolean O() {
        return this.f80935u;
    }

    public final boolean P() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27832, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f80916b.f108770m.getVisibility() == 0;
    }

    public final boolean Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27819, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f80917c.getVisibility() == 0;
    }

    public final boolean R() {
        return this.f80936v;
    }

    public final boolean S() {
        return this.f80933s;
    }

    public final boolean T() {
        return this.f80932r;
    }

    public final void U(boolean z10) {
        int i10;
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27871, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && this.f80938x) {
            if (z10) {
                i10 = !com.max.hbcommon.utils.c.u(this.f80939y) ? this.H : R.color.background_layer_2_dark_not_change_color;
            } else {
                i10 = R.color.white_alpha5;
            }
            this.f80916b.f108783z.setBackgroundResource(i10);
            this.f80916b.E.setBackgroundResource(i10);
            this.f80916b.J.setBackgroundResource(i10);
            if (z10) {
                this.f80916b.f108760c.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(this.f80939y));
            } else {
                this.f80916b.f108760c.setBackgroundColor(0);
            }
        }
    }

    public final void W(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27829, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f80916b.F.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z10) {
            int i10 = this.F;
            marginLayoutParams.rightMargin = i10;
            marginLayoutParams.leftMargin = i10;
            this.f80920f.setVisibility(8);
            return;
        }
        marginLayoutParams.rightMargin = this.E;
        marginLayoutParams.leftMargin = this.D;
        if (this.f80937w) {
            this.f80920f.setVisibility(0);
        }
    }

    public final void X() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27836, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!Q() || this.f80935u) {
            this.f80916b.J.setVisibility(8);
        } else {
            this.f80916b.J.setVisibility(0);
        }
    }

    public final void b0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27845, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80936v = false;
        this.f80918d.clearFocus();
        this.f80918d.setContentText("");
        this.f80918d.setHint(this.f80928n);
        this.f80916b.f108771n.setVisibility(0);
        if (this.f80931q) {
            this.f80916b.f108769l.setVisibility(8);
            q qVar = this.f80921g;
            if (qVar != null) {
                f0.m(qVar);
                qVar.v2();
                return;
            }
            return;
        }
        this.f80916b.f108769l.setVisibility(0);
        q qVar2 = this.f80921g;
        if (qVar2 != null) {
            f0.m(qVar2);
            qVar2.q2();
        }
    }

    public final void c0(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 27844, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80936v = true;
        this.f80918d.setHint(getContext().getString(R.string.reply) + str3);
        com.max.hbimage.b.H(str2, this.f80916b.f108764g);
        this.f80916b.f108774q.setText(str);
        this.f80916b.f108771n.setVisibility(4);
        this.f80916b.f108769l.setVisibility(8);
        q qVar = this.f80921g;
        if (qVar != null) {
            f0.m(qVar);
            qVar.v2();
        }
        this.f80916b.b().setVisibility(0);
        B();
    }

    public final void d0(@dl.e String str, @dl.d View.OnClickListener followClickListener) {
        String string;
        if (PatchProxy.proxy(new Object[]{str, followClickListener}, this, changeQuickRedirect, false, 27861, new Class[]{String.class, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followClickListener, "followClickListener");
        if (f0.g(str, "action_favour") && ad.a.b(ad.a.E, false, 2, null)) {
            return;
        }
        setFollowStatusTipsVisible(true);
        if (f0.g("action_share", str)) {
            string = getContext().getString(R.string.share);
        } else if (f0.g("action_favour", str)) {
            string = getContext().getString(R.string.favour);
        } else if (f0.g("action_charge", str)) {
            string = getContext().getString(R.string.charge);
        } else {
            string = f0.g("action_comment", str) ? getContext().getString(R.string.comment) : "";
        }
        this.f80916b.f108767j.setVisibility(8);
        this.f80916b.f108777t.setVisibility(0);
        TextView textView = this.f80916b.f108777t;
        v0 v0Var = v0.f124986a;
        String str2 = String.format("%s%s", Arrays.copyOf(new Object[]{getContext().getString(R.string.thank), string}, 2));
        f0.o(str2, "format(format, *args)");
        textView.setText(str2);
        this.f80916b.f108776s.setVisibility(0);
        this.f80916b.f108776s.setText(getContext().getString(R.string.follow_user_tips));
        this.f80916b.f108775r.setVisibility(0);
        this.f80916b.f108775r.setOnClickListener(followClickListener);
        this.f80916b.f108768k.setOnClickListener(new m());
    }

    public final void e0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27864, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108779v.setBackgroundResource(z10 ? R.color.black_alpha40 : R.color.transparent);
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27874, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80918d.onKeyDown(67, new KeyEvent(0, 67));
    }

    public final void f0(@dl.d View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27817, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public final void g0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27835, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f80934t) {
            setCyIconState(false);
            this.f80918d.P(lb.b.f131098n);
        } else {
            setCyIconState(true);
            int textSize = (int) this.f80918d.getPaint().getTextSize();
            this.f80918d.J(lb.b.f131098n, new com.max.hbexpression.widget.a(getContext(), R.drawable.item_cy_icon, textSize + ViewUtils.f(getContext(), 5.0f), textSize, textSize, 1));
            View.OnClickListener onClickListener = this.f80929o;
            if (onClickListener != null) {
                onClickListener.onClick(this.f80918d);
            }
        }
        this.f80934t = !this.f80934t;
    }

    @dl.e
    public final String getBgColor() {
        return this.f80939y;
    }

    @dl.d
    public final LinearLayout getBottomBar() {
        return this.f80919e;
    }

    public final int getContentMinHeight() {
        return this.K;
    }

    public final boolean getDarkStyle() {
        return this.f80938x;
    }

    public final int getDarkStyleContentBgColorId() {
        return this.H;
    }

    @dl.e
    public final Drawable getDarkStyleEditBgDrawable() {
        return this.I;
    }

    @dl.e
    public final String getDefaultEditTextHint() {
        return this.f80928n;
    }

    @dl.d
    public final ExpressionEditText getEditor() {
        return this.f80918d;
    }

    @dl.e
    public final View.OnClickListener getEditorClickListener() {
        return this.f80929o;
    }

    @dl.e
    public final View.OnFocusChangeListener getEditorOnFocusChangeListener() {
        return this.f80930p;
    }

    public final boolean getEnableRightButtons() {
        return this.f80937w;
    }

    @dl.e
    public final q getExpressionShowFragment() {
        return this.f80921g;
    }

    @dl.e
    public final FragmentManager getFragmentManager() {
        return this.J;
    }

    public final boolean getHideAddImg() {
        return this.f80931q;
    }

    @dl.d
    public final ArrayList<String> getImgPathList() {
        return this.f80924j;
    }

    @dl.e
    public final String getLocalRecommendState() {
        return this.f80940z;
    }

    public final boolean getLockContentMinHeight() {
        return this.L;
    }

    @dl.d
    public final b30 getMBinding() {
        return this.f80916b;
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.adapter.x getMUploadImgShowerAdapter() {
        return this.f80923i;
    }

    @dl.d
    public final View getMask() {
        return this.f80917c;
    }

    @dl.e
    public final b getOnEditorBarExpand() {
        return this.N;
    }

    public final int getPostCommentTextNumMaxLimit() {
        return this.M;
    }

    @dl.d
    public final LinearLayout getRightButtonContainer() {
        return this.f80920f;
    }

    public final int getRightButtonCount() {
        return this.f80925k;
    }

    public final boolean getShowRecommendBtns() {
        return this.A;
    }

    @dl.e
    public final Timer getTimer() {
        return this.f80926l;
    }

    @dl.e
    public final TimerTask getTimerTask() {
        return this.f80927m;
    }

    public final void h0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27840, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X();
        V();
    }

    public final void k0(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27860, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = getContext().getString(R.string.follow);
        f0.o(string, "context.getString(R.string.follow)");
        if (f0.g("0", str)) {
            string = getContext().getString(R.string.follow);
            f0.o(string, "context.getString(R.string.follow)");
        } else if (f0.g("1", str)) {
            string = getContext().getString(R.string.has_followed);
            f0.o(string, "context.getString(R.string.has_followed)");
        } else if (f0.g("2", str)) {
            string = getContext().getString(R.string.follow);
            f0.o(string, "context.getString(R.string.follow)");
        } else if (f0.g("3", str)) {
            string = getContext().getString(R.string.has_followed);
            f0.o(string, "context.getString(R.string.has_followed)");
        }
        this.f80916b.f108775r.setText(string);
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 27873, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.m(expressionObj);
        if (expressionObj.getType() != 0) {
            int selectionStart = this.f80918d.getSelectionStart();
            Editable editableText = this.f80918d.getEditableText();
            f0.o(editableText, "editor.editableText");
            if (selectionStart < 0 || selectionStart >= editableText.length()) {
                editableText.append((CharSequence) expressionObj.getEmoji_key());
                return;
            } else {
                editableText.insert(selectionStart, expressionObj.getEmoji_key());
                return;
            }
        }
        if (this.f80924j.size() >= 9) {
            com.max.hbutils.utils.c.f("评论图片数量已到达上限");
            return;
        }
        if (expressionObj.getResId() > 0) {
            this.f80924j.add(expressionObj.getResId() + "");
        } else {
            String filePath = expressionObj.getFilePath();
            if (filePath != null) {
                this.f80924j.add(filePath);
            }
        }
        com.max.xiaoheihe.module.bbs.adapter.x xVar = this.f80923i;
        if (xVar != null) {
            xVar.r(this.f80924j);
        }
    }

    @k0(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y();
        Timer timer = this.f80926l;
        if (timer != null) {
            timer.cancel();
        }
    }

    @dl.d
    public final View p(@v int i10, @dl.d String description, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), description, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27821, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(description, "description");
        View viewD = D(i10, description, z10);
        r(viewD);
        return viewD;
    }

    @dl.d
    public final View r(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27820, new Class[]{View.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        this.f80920f.addView(view);
        this.f80920f.setVisibility(0);
        this.f80925k++;
        return view;
    }

    public final void setAddGameOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27850, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108766i.setOnClickListener(onClickListener);
    }

    public final void setAddImgVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27862, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108769l.setVisibility(z10 ? 0 : 8);
    }

    public final void setAddOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27854, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108769l.setOnClickListener(onClickListener);
    }

    public final void setAtOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27849, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108762e.setOnClickListener(onClickListener);
    }

    public void setBarDarkStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27870, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80938x = true;
        int i10 = this.H;
        this.f80916b.f108783z.setBackgroundResource(i10);
        Drawable drawable = this.I;
        if (drawable != null) {
            this.f80916b.B.setBackground(drawable);
        } else {
            com.max.xiaoheihe.accelworld.l.u(this.f80916b.B, R.color.black_alpha10, 5.0f, R.color.white_alpha5, 0.5f);
        }
        this.f80916b.f108761d.setHintTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha40));
        this.f80916b.f108761d.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        this.f80916b.E.setBackgroundResource(i10);
        this.f80916b.f108781x.getRoot().setBackgroundResource(R.color.white_alpha10);
        this.f80916b.J.setBackgroundResource(i10);
        this.f80916b.f108772o.getRoot().setVisibility(8);
        q qVar = this.f80921g;
        if (qVar != null) {
            qVar.L1(true);
        }
        b30 b30Var = this.f80916b;
        ImageView[] imageViewArr = {b30Var.f108765h, b30Var.f108769l, b30Var.f108762e, b30Var.f108766i, b30Var.f108763f};
        for (int i11 = 0; i11 < 5; i11++) {
            ImageView imageView = imageViewArr[i11];
            imageView.setAlpha(0.2f);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        }
        z();
        this.f80916b.f108778u.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.black_alpha90));
        if (com.max.hbcommon.utils.c.u(this.f80939y)) {
            this.f80916b.H.setBackgroundResource(R.color.background_layer_2_dark_not_change_color);
            return;
        }
        q qVar2 = this.f80921g;
        if (qVar2 != null) {
            qVar2.N1(this.f80939y);
        }
        this.f80916b.H.setBackgroundResource(R.color.white_alpha3);
        this.f80916b.K.setBackgroundResource(R.color.white_alpha3);
    }

    public final void setBgColor(@dl.e String str) {
        this.f80939y = str;
    }

    public final void setBottomBarVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27863, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            this.f80916b.f108783z.setVisibility(8);
        } else {
            this.f80916b.b().bringToFront();
            this.f80916b.f108783z.setVisibility(0);
        }
    }

    public final void setCYIconColor(@androidx.annotation.n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27856, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setCyIconState(false);
    }

    public final void setCYOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27851, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108763f.setOnClickListener(onClickListener);
        this.f80918d.setOnCyChangedListener(new j());
    }

    public final void setContentMinHeight(int i10) {
        this.K = i10;
    }

    public final void setContentText(@dl.e CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 27833, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80918d.setContentText(charSequence);
        Z();
    }

    public final void setDarkStyle(boolean z10) {
        this.f80938x = z10;
    }

    public final void setDarkStyleContentBgColorId(int i10) {
        this.H = i10;
    }

    public final void setDarkStyleEditBgDrawable(@dl.e Drawable drawable) {
        this.I = drawable;
    }

    public final void setDefaultEditTextHint(@dl.e String str) {
        this.f80928n = str;
    }

    public final void setEditAddCY(boolean z10) {
        this.f80934t = z10;
    }

    public final void setEditorClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27806, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80918d.setOnClickListener(onClickListener);
        this.f80929o = onClickListener;
    }

    public final void setEditorOnFocusChangeListener(@dl.e View.OnFocusChangeListener onFocusChangeListener) {
        if (PatchProxy.proxy(new Object[]{onFocusChangeListener}, this, changeQuickRedirect, false, 27807, new Class[]{View.OnFocusChangeListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80918d.setOnFocusChangeListener(onFocusChangeListener);
        this.f80930p = onFocusChangeListener;
    }

    public final void setEmojiShowing(boolean z10) {
        this.f80935u = z10;
    }

    public final void setEnableRightButtons(boolean z10) {
        this.f80937w = z10;
    }

    public final void setExpressionImageResource(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27853, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108765h.setImageResource(i10);
    }

    public final void setExpressionOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27852, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108765h.setOnClickListener(onClickListener);
    }

    public final void setExpressionShowFragment(@dl.e q qVar) {
        this.f80921g = qVar;
    }

    public final void setFollowStatusTipsVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27843, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.f80916b.I;
        f0.o(relativeLayout, "mBinding.vgNotify");
        this.f80916b.b().bringToFront();
        relativeLayout.setVisibility(0);
        float fV = ViewUtils.V(relativeLayout);
        if (z10) {
            relativeLayout.setTranslationY(fV);
            ObjectAnimator animator = ObjectAnimator.ofFloat(relativeLayout, "translationY", fV, 0.0f);
            f0.o(animator, "animator");
            s(animator);
            animator.start();
            return;
        }
        relativeLayout.setTranslationY(0.0f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0.0f, fV);
        animator2.addListener(new k(relativeLayout));
        f0.o(animator2, "animator");
        s(animator2);
        animator2.start();
    }

    public final void setFragmentManager(@dl.e FragmentManager fragmentManager) {
        this.J = fragmentManager;
    }

    public final void setHideAddImg(boolean z10) {
        this.f80931q = z10;
    }

    public final void setImgPathList(@dl.d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 27805, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f80924j = arrayList;
    }

    public final void setIvAddGameVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27848, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108766i.setVisibility(z10 ? 0 : 8);
    }

    public final void setIvAtVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27846, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108762e.setVisibility(z10 ? 0 : 8);
    }

    public final void setIvCYVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27847, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108763f.setVisibility(z10 ? 0 : 8);
    }

    public final void setLocalRecommendState(@dl.e String str) {
        this.f80940z = str;
    }

    public final void setLockContentMinHeight(boolean z10) {
        this.L = z10;
    }

    public final void setMUploadImgShowerAdapter(@dl.e com.max.xiaoheihe.module.bbs.adapter.x xVar) {
        this.f80923i = xVar;
    }

    public final void setOnEditorBarExpand(@dl.e b bVar) {
        this.N = bVar;
    }

    public final void setPostCommentTextNumMaxLimit(int i10) {
        this.M = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setRecommendCheck(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27869, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f80940z = z10 ? "1" : "0";
        this.f80916b.f108780w.setCheck(z10);
        this.f80916b.f108782y.setCheck(!z10);
    }

    public final void setRecommendInfo(@dl.e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj) {
        if (PatchProxy.proxy(new Object[]{webWithNativeRecommendItemObj}, this, changeQuickRedirect, false, 27867, new Class[]{WebWithNativeRecommendItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108780w.setInfo(webWithNativeRecommendItemObj);
    }

    public final void setReplyFloor(boolean z10) {
        this.f80936v = z10;
    }

    public final void setRightButtonCount(int i10) {
        this.f80925k = i10;
    }

    public final void setSendOnClickListener(@dl.e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27855, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        if (ad.a.a(ad.a.f1215v, false)) {
            this.f80916b.f108778u.setOnClickListener(new l(onClickListener));
        } else {
            this.f80916b.f108778u.setOnClickListener(onClickListener);
        }
    }

    public final void setShowRecommendBtns(boolean z10) {
        this.A = z10;
    }

    public final void setTimer(@dl.e Timer timer) {
        this.f80926l = timer;
    }

    public final void setTimerTask(@dl.e TimerTask timerTask) {
        this.f80927m = timerTask;
    }

    public final void setTipShown(boolean z10) {
        this.f80933s = z10;
    }

    public final void setTriple(boolean z10) {
        this.f80932r = z10;
    }

    public final void setUnRecommendInfo(@dl.e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj) {
        if (PatchProxy.proxy(new Object[]{webWithNativeRecommendItemObj}, this, changeQuickRedirect, false, 27868, new Class[]{WebWithNativeRecommendItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80916b.f108782y.setInfo(webWithNativeRecommendItemObj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVgExpressionVisible(@dl.d FragmentManager fragmentManager, boolean z10) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27858, new Class[]{FragmentManager.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragmentManager, "fragmentManager");
        if (z10) {
            this.f80916b.H.setVisibility(0);
            this.f80916b.f108765h.setImageResource(R.drawable.ic_keyboard);
            q qVar = this.f80921g;
            if (qVar != null) {
                f0.m(qVar);
                qVar.q1();
                return;
            }
            String str = Q;
            Fragment fragmentS0 = fragmentManager.s0(str);
            if (fragmentS0 instanceof com.max.hbexpression.n) {
                this.f80921g = (q) fragmentS0;
            } else {
                q qVarA = com.max.hbexpression.e.a(this.f80931q || this.f80936v);
                qVarA.b2(new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar$setVgExpressionVisible$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    @d
                    public final Boolean a() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27898, new Class[0], Boolean.class);
                        if (patchProxyResultProxy.isSupported) {
                            return (Boolean) patchProxyResultProxy.result;
                        }
                        Editable text = this.f80957b.getEditor().getText();
                        return Boolean.valueOf(!c.u(text != null ? text.toString() : null));
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ Boolean invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27899, new Class[0], Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                    }
                });
                this.f80921g = qVarA;
            }
            if (this.f80938x) {
                q qVar2 = this.f80921g;
                if (qVar2 != null) {
                    qVar2.L1(true);
                }
                q qVar3 = this.f80921g;
                if (qVar3 != null) {
                    qVar3.N1(this.f80939y);
                }
            }
            q qVar4 = this.f80921g;
            if (qVar4 != null) {
                fragmentManager.u().c(R.id.vg_expression, qVar4.P(), str).m();
            }
        }
    }

    public void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27831, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f80916b.K;
        f0.o(linearLayout, "mBinding.vgRecommendBtns");
        linearLayout.setVisibility(8);
        W(false);
        this.f80916b.D.setVisibility(8);
        RelativeLayout relativeLayout = this.f80916b.f108770m;
        f0.o(relativeLayout, "mBinding.rlExpandViewContainer");
        relativeLayout.setVisibility(8);
        this.f80916b.E.setVisibility(8);
        this.f80917c.setVisibility(8);
        this.f80918d.setSingleLine(true);
        q qVar = this.f80921g;
        if (qVar != null) {
            this.f80935u = false;
            this.f80916b.f108765h.setImageResource(this.G);
            qVar.C();
        }
        U(false);
        h0();
        b bVar = this.N;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void x(int i10) {
        this.f80928n = "参与讨论";
    }
}
