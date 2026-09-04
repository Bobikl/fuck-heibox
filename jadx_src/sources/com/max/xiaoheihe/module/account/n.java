package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AnimationResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.List;
import kotlin.b2;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79088e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<AnimationResultObj> f79089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f79090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.l<AnimationResultObj, b2> f79091d;

    /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f79092e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final TextView f79093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final TextView f79094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final View f79095d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d TextView typeTextView, @dl.d TextView sourceTextView, @dl.d View containerView) {
            super(containerView);
            kotlin.jvm.internal.f0.p(typeTextView, "typeTextView");
            kotlin.jvm.internal.f0.p(sourceTextView, "sourceTextView");
            kotlin.jvm.internal.f0.p(containerView, "containerView");
            this.f79093b = typeTextView;
            this.f79094c = sourceTextView;
            this.f79095d = containerView;
        }

        @dl.d
        public final View a() {
            return this.f79095d;
        }

        @dl.d
        public final TextView b() {
            return this.f79094c;
        }

        @dl.d
        public final TextView d() {
            return this.f79093b;
        }
    }

    /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
    public static final class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimationResultObj f79096b;

        b(AnimationResultObj animationResultObj) {
            this.f79096b = animationResultObj;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23257, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            File file = new File(com.max.xiaoheihe.utils.r.r(this.f79096b.getType()));
            com.max.hbutils.utils.x.p(StringsKt__IndentKt.p("\n                    type: " + this.f79096b.getType() + "\n                    sourceType: " + this.f79096b.getSource_type() + "\n                    url: " + this.f79096b.getUrl() + "\n                    md5: " + this.f79096b.getMd5() + "\n                    file: " + file + "\n                    uri: " + file.toURI() + "\n                    file exists: " + file.exists() + "\n                "));
            return true;
        }
    }

    /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnimationResultObj f79098c;

        c(AnimationResultObj animationResultObj) {
            this.f79098c = animationResultObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23258, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.this.o().invoke(this.f79098c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@dl.d List<AnimationResultObj> cachedData, @dl.d Context context, @dl.d yh.l<? super AnimationResultObj, b2> onClickCallback) {
        kotlin.jvm.internal.f0.p(cachedData, "cachedData");
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(onClickCallback, "onClickCallback");
        this.f79089b = cachedData;
        this.f79090c = context;
        this.f79091d = onClickCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23253, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f79089b.size();
    }

    @dl.d
    public final List<AnimationResultObj> m() {
        return this.f79089b;
    }

    @dl.d
    public final Context n() {
        return this.f79090c;
    }

    @dl.d
    public final yh.l<AnimationResultObj, b2> o() {
        return this.f79091d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 23256, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 23255, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : q(viewGroup, i10);
    }

    @SuppressLint({"SetTextI18n"})
    public void p(@dl.d a holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 23254, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(holder, "holder");
        AnimationResultObj animationResultObj = this.f79089b.get(i10);
        holder.d().setText("type: " + animationResultObj.getType());
        holder.d().setTextSize(2, 16.0f);
        TextView textViewB = holder.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("source type: ");
        String source_type = animationResultObj.getSource_type();
        if (source_type == null) {
            source_type = AnimationResultObj.SOURCE_TYPE_DOT_JSON;
        }
        sb2.append(source_type);
        textViewB.setText(sb2.toString());
        holder.b().setTextColor(androidx.core.content.d.f(this.f79090c, R.color.text_secondary_2_color));
        holder.a().setOnLongClickListener(new b(animationResultObj));
        holder.a().setOnClickListener(new c(animationResultObj));
    }

    @dl.d
    public a q(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 23252, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(this.f79090c);
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, ViewUtils.f(linearLayout.getContext(), 50.0f)));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f79090c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = androidx.core.view.n.f21701b;
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this.f79090c);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = androidx.core.view.n.f21702c;
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
        return new a(textView, textView2, linearLayout);
    }

    public final void r(@dl.d List<AnimationResultObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 23251, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        this.f79089b = list;
    }
}
