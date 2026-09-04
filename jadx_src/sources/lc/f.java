package lc;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.d2;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: GridExpressionAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends RecyclerView.Adapter<b> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f131310i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f131311j = "GridExpressionAdapter-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<? extends ExpressionObj> f131312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f131313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f131314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final l<ExpressionObj, b2> f131315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final p<ExpressionObj, View, Boolean> f131316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final yh.a<b2> f131317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f131318h;

    /* JADX INFO: compiled from: GridExpressionAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GridExpressionAdapter.kt */
    public static final class b extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final View f131319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final ImageView f131320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final TextView f131321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private d2 f131322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d View containerView, @dl.d ImageView expressionImg, @dl.e TextView textView, @dl.e d2 d2Var) {
            super(containerView);
            f0.p(containerView, "containerView");
            f0.p(expressionImg, "expressionImg");
            this.f131319b = containerView;
            this.f131320c = expressionImg;
            this.f131321d = textView;
            this.f131322e = d2Var;
        }

        public /* synthetic */ b(View view, ImageView imageView, TextView textView, d2 d2Var, int i10, u uVar) {
            this(view, imageView, textView, (i10 & 8) != 0 ? null : d2Var);
        }

        @dl.d
        public final View a() {
            return this.f131319b;
        }

        @dl.d
        public final ImageView b() {
            return this.f131320c;
        }

        @dl.e
        public final TextView d() {
            return this.f131321d;
        }

        @dl.e
        public final d2 g() {
            return this.f131322e;
        }

        public final void h(@dl.e d2 d2Var) {
            this.f131322e = d2Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d List<? extends ExpressionObj> data, @dl.d Context context, boolean z10, @dl.e l<? super ExpressionObj, b2> lVar, @dl.e p<? super ExpressionObj, ? super View, Boolean> pVar, @dl.e yh.a<b2> aVar) {
        f0.p(data, "data");
        f0.p(context, "context");
        this.f131312b = data;
        this.f131313c = context;
        this.f131314d = z10;
        this.f131315e = lVar;
        this.f131316f = pVar;
        this.f131317g = aVar;
    }

    public /* synthetic */ f(List list, Context context, boolean z10, l lVar, p pVar, yh.a aVar, int i10, u uVar) {
        this(list, context, z10, (i10 & 8) != 0 ? null : lVar, (i10 & 16) != 0 ? null : pVar, (i10 & 32) != 0 ? null : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(f this$0, View view, MotionEvent motionEvent) {
        yh.a<b2> aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, view, motionEvent}, null, changeQuickRedirect, true, bb.c.g.f32924k2, new Class[]{f.class, View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(this$0, "this$0");
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (aVar = this$0.f131317g) != null) {
            aVar.invoke();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(f this$0, ExpressionObj itemData, b holder, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, itemData, holder, view}, null, changeQuickRedirect, true, bb.c.g.f32944l2, new Class[]{f.class, ExpressionObj.class, b.class, View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(this$0, "this$0");
        f0.p(itemData, "$itemData");
        f0.p(holder, "$holder");
        p<ExpressionObj, View, Boolean> pVar = this$0.f131316f;
        if (pVar != null) {
            return pVar.invoke(itemData, holder.a()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(f this$0, ExpressionObj itemData, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, itemData, view}, null, changeQuickRedirect, true, bb.c.g.f32964m2, new Class[]{f.class, ExpressionObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(itemData, "$itemData");
        l<ExpressionObj, b2> lVar = this$0.f131315e;
        if (lVar != null) {
            lVar.invoke(itemData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32885i2, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f131312b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33004o2, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        r((b) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32984n2, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : v(viewGroup, i10);
    }

    @dl.d
    public final List<ExpressionObj> p() {
        return this.f131312b;
    }

    public final int q() {
        return this.f131318h;
    }

    public void r(@dl.d final b holder, int i10) {
        TextView textViewD;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32904j2, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        d2 d2VarG = holder.g();
        if (d2VarG != null) {
            d2.a.b(d2VarG, null, 1, null);
        }
        final ExpressionObj expressionObj = (ExpressionObj) CollectionsKt___CollectionsKt.R2(this.f131312b, i10);
        if (expressionObj == null) {
            return;
        }
        com.max.hbexpression.f.i(expressionObj, holder.b());
        if (this.f131314d && (textViewD = holder.d()) != null) {
            textViewD.setText(expressionObj.getName());
        }
        holder.a().setOnTouchListener(new View.OnTouchListener() { // from class: lc.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return f.s(this.f131304b, view, motionEvent);
            }
        });
        holder.a().setOnLongClickListener(new View.OnLongClickListener() { // from class: lc.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return f.t(this.f131305b, expressionObj, holder, view);
            }
        });
        holder.a().setOnClickListener(new View.OnClickListener() { // from class: lc.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.u(this.f131308b, expressionObj, view);
            }
        });
        holder.a().setHapticFeedbackEnabled(false);
    }

    @dl.d
    public b v(@dl.d ViewGroup parent, int i10) {
        TextView textView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32865h2, new Class[]{ViewGroup.class, Integer.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(this.f131313c);
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        if (!this.f131314d) {
            linearLayout.setPadding(this.f131318h, ViewUtils.f(linearLayout.getContext(), 8.0f), this.f131318h, ViewUtils.f(linearLayout.getContext(), 8.0f));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, q.o(linearLayout.getContext(), com.max.hbexpression.R.color.divider_primary_1_color_alpha50, 5.0f));
            stateListDrawable.addState(new int[0], new ColorDrawable(0));
            linearLayout.setBackground(stateListDrawable);
        }
        LinearLayout.LayoutParams layoutParams = this.f131314d ? new LinearLayout.LayoutParams(ViewUtils.f(this.f131313c, 60.0f), ViewUtils.f(this.f131313c, 60.0f)) : new LinearLayout.LayoutParams(ViewUtils.f(this.f131313c, 30.0f), ViewUtils.f(this.f131313c, 30.0f));
        ImageView imageView = new ImageView(this.f131313c);
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        if (this.f131314d) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = ViewUtils.f(this.f131313c, 2.0f);
            TextView textView2 = new TextView(this.f131313c);
            textView2.setLayoutParams(layoutParams2);
            textView2.setTextSize(1, 10.0f);
            textView2.setTextColor(androidx.core.content.d.f(textView2.getContext(), com.max.hbexpression.R.color.text_secondary_1_color));
            textView = textView2;
        } else {
            textView = null;
        }
        if (textView != null) {
            linearLayout.addView(textView);
        }
        return new b(linearLayout, imageView, textView, null, 8, null);
    }

    public final void w(@dl.d List<? extends ExpressionObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32825f2, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f131312b = list;
    }

    public final void x(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32845g2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f131318h = fi.u.I(i10, 0, ViewUtils.f(this.f131313c, 8.0f));
    }
}
