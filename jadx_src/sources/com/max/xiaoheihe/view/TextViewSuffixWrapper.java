package com.max.xiaoheihe.view;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import yh.q;

/* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TextViewSuffixWrapper {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f95846n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final TextView f95847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private CharSequence f95848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private CharSequence f95849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private CharSequence f95850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Layout f95851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f95854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private Transition f95856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private ViewGroup f95857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final q<CharSequence, CharSequence, Integer, CharSequence> f95858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final z f95859m;

    /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f95860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f95861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final Integer f95862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final View.OnClickListener f95863d;

        public a(int i10, int i11, @dl.e Integer num, @dl.e View.OnClickListener onClickListener) {
            this.f95860a = i10;
            this.f95861b = i11;
            this.f95862c = num;
            this.f95863d = onClickListener;
        }

        public /* synthetic */ a(int i10, int i11, Integer num, View.OnClickListener onClickListener, int i12, u uVar) {
            this(i10, i11, num, (i12 & 8) != 0 ? null : onClickListener);
        }

        public static /* synthetic */ a f(a aVar, int i10, int i11, Integer num, View.OnClickListener onClickListener, int i12, Object obj) {
            int i13 = i10;
            int i14 = i11;
            Object[] objArr = {aVar, new Integer(i13), new Integer(i14), num, onClickListener, new Integer(i12), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49509, new Class[]{a.class, cls, cls, Integer.class, View.OnClickListener.class, cls, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i12 & 1) != 0) {
                i13 = aVar.f95860a;
            }
            if ((i12 & 2) != 0) {
                i14 = aVar.f95861b;
            }
            return aVar.e(i13, i14, (i12 & 4) != 0 ? aVar.f95862c : num, (i12 & 8) != 0 ? aVar.f95863d : onClickListener);
        }

        public final int a() {
            return this.f95860a;
        }

        public final int b() {
            return this.f95861b;
        }

        @dl.e
        public final Integer c() {
            return this.f95862c;
        }

        @dl.e
        public final View.OnClickListener d() {
            return this.f95863d;
        }

        @dl.d
        public final a e(int i10, int i11, @dl.e Integer num, @dl.e View.OnClickListener onClickListener) {
            Object[] objArr = {new Integer(i10), new Integer(i11), num, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49508, new Class[]{cls, cls, Integer.class, View.OnClickListener.class}, a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(i10, i11, num, onClickListener);
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49512, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f95860a == aVar.f95860a && this.f95861b == aVar.f95861b && f0.g(this.f95862c, aVar.f95862c) && f0.g(this.f95863d, aVar.f95863d);
        }

        @dl.e
        public final Integer g() {
            return this.f95862c;
        }

        public final int h() {
            return this.f95860a;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49511, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int i10 = ((this.f95860a * 31) + this.f95861b) * 31;
            Integer num = this.f95862c;
            int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
            View.OnClickListener onClickListener = this.f95863d;
            return iHashCode + (onClickListener != null ? onClickListener.hashCode() : 0);
        }

        @dl.e
        public final View.OnClickListener i() {
            return this.f95863d;
        }

        public final int j() {
            return this.f95861b;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49510, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "SuffixColor(fromIndex=" + this.f95860a + ", toIndex=" + this.f95861b + ", color=" + this.f95862c + ", listener=" + this.f95863d + ')';
        }
    }

    /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
    public static final class b extends androidx.transition.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f95864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextViewSuffixWrapper f95865c;

        b(TextView textView, TextViewSuffixWrapper textViewSuffixWrapper) {
            this.f95864b = textView;
            this.f95865c = textViewSuffixWrapper;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@dl.d Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49517, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(transition, "transition");
            transition.n0(this);
            this.f95864b.getLayoutParams().height = -2;
            TextView textView = this.f95864b;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f95864b.setMaxLines(this.f95865c.q());
            this.f95864b.setText(this.f95865c.m());
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void e(@dl.d Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49518, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(transition, "transition");
            transition.n0(this);
        }
    }

    public TextViewSuffixWrapper(@dl.d TextView textView) {
        f0.p(textView, "textView");
        this.f95847a = textView;
        CharSequence text = textView.getText();
        f0.o(text, "textView.text");
        this.f95848b = text;
        this.f95854h = true;
        this.f95855i = 5;
        this.f95856j = new AutoTransition();
        ViewParent parent = textView.getParent();
        f0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f95857k = (ViewGroup) parent;
        this.f95858l = new q<CharSequence, CharSequence, Integer, SpannableStringBuilder>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapper$textWrapper$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
            public static final class a extends ClickableSpan {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f95871b;

                a(View.OnClickListener onClickListener) {
                    this.f95871b = onClickListener;
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(@dl.d View widget) {
                    if (PatchProxy.proxy(new Object[]{widget}, this, changeQuickRedirect, false, 49523, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(widget, "widget");
                    this.f95871b.onClick(widget);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(@dl.d TextPaint ds) {
                    if (PatchProxy.proxy(new Object[]{ds}, this, changeQuickRedirect, false, 49524, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setColor(ds.linkColor);
                    ds.setUnderlineText(false);
                }
            }

            {
                super(3);
            }

            @dl.d
            public final SpannableStringBuilder a(@dl.d CharSequence text2, @dl.d CharSequence suffix, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{text2, suffix, new Integer(i10)}, this, changeQuickRedirect, false, 49521, new Class[]{CharSequence.class, CharSequence.class, Integer.TYPE}, SpannableStringBuilder.class);
                if (patchProxyResultProxy.isSupported) {
                    return (SpannableStringBuilder) patchProxyResultProxy.result;
                }
                f0.p(text2, "text");
                f0.p(suffix, "suffix");
                SpannableStringBuilder spannableStringBuilder = text2 instanceof SpannableStringBuilder ? (SpannableStringBuilder) text2 : new SpannableStringBuilder(text2);
                TextViewSuffixWrapper textViewSuffixWrapper = this.f95870b;
                for (TextViewSuffixWrapper.a aVar : TextViewSuffixWrapper.a(textViewSuffixWrapper)) {
                    int iH = aVar.h() + i10;
                    int iJ = aVar.j() + i10;
                    View.OnClickListener onClickListenerI = aVar.i();
                    if (onClickListenerI != null) {
                        spannableStringBuilder.setSpan(new a(onClickListenerI), iH, iJ, 33);
                        textViewSuffixWrapper.r().setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    Integer numG = aVar.g();
                    if (numG != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(numG.intValue()), iH, iJ, 33);
                    }
                }
                return spannableStringBuilder;
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder, java.lang.Object] */
            @Override // yh.q
            public /* bridge */ /* synthetic */ SpannableStringBuilder invoke(CharSequence charSequence, CharSequence charSequence2, Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence, charSequence2, num}, this, changeQuickRedirect, false, 49522, new Class[]{Object.class, Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(charSequence, charSequence2, num.intValue());
            }
        };
        this.f95859m = b0.c(new yh.a<List<a>>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapper$suffixColorList$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<com.max.xiaoheihe.view.TextViewSuffixWrapper$a>] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ List<TextViewSuffixWrapper.a> invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49520, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final List<TextViewSuffixWrapper.a> invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49519, new Class[0], List.class);
                return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : new ArrayList();
            }
        });
        if (textView.getLayoutParams().width == -2) {
            throw new RuntimeException("textView's width can't be wrap_content. Only support match_parent or specified size");
        }
    }

    public static /* synthetic */ void J(TextViewSuffixWrapper textViewSuffixWrapper, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{textViewSuffixWrapper, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 49497, new Class[]{TextViewSuffixWrapper.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textViewSuffixWrapper.I(z10);
    }

    public static final /* synthetic */ List a(TextViewSuffixWrapper textViewSuffixWrapper) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textViewSuffixWrapper}, null, changeQuickRedirect, true, 49507, new Class[]{TextViewSuffixWrapper.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : textViewSuffixWrapper.p();
    }

    public static final /* synthetic */ void b(TextViewSuffixWrapper textViewSuffixWrapper, Transition transition) {
        if (PatchProxy.proxy(new Object[]{textViewSuffixWrapper, transition}, null, changeQuickRedirect, true, 49506, new Class[]{TextViewSuffixWrapper.class, Transition.class}, Void.TYPE).isSupported) {
            return;
        }
        v(textViewSuffixWrapper, transition);
    }

    public static /* synthetic */ void g(TextViewSuffixWrapper textViewSuffixWrapper, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{textViewSuffixWrapper, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 49495, new Class[]{TextViewSuffixWrapper.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textViewSuffixWrapper.f(z10);
    }

    public static /* synthetic */ void j(TextViewSuffixWrapper textViewSuffixWrapper, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{textViewSuffixWrapper, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 49499, new Class[]{TextViewSuffixWrapper.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textViewSuffixWrapper.i(z10);
    }

    private final List<a> p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49490, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : (List) this.f95859m.getValue();
    }

    private final void u(final Transition transition) {
        if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49501, new Class[]{Transition.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(!this.f95854h || this.f95847a.getMaxLines() >= this.f95855i)) {
            throw new IllegalArgumentException(("textView.maxLines(" + this.f95847a.getMaxLines() + ") < targetLineCount(" + this.f95855i + ')').toString());
        }
        this.f95852f = true;
        if (this.f95849c == null) {
            v(this, transition);
            return;
        }
        if (!this.f95853g || this.f95850d == null || !f0.g(this.f95851e, this.f95847a.getLayout())) {
            TextView textView = this.f95847a;
            CharSequence charSequence = this.f95848b;
            CharSequence charSequence2 = this.f95849c;
            f0.m(charSequence2);
            TextViewSuffixWrapperKt.f(textView, charSequence, charSequence2, this.f95855i, transition, this.f95857k, new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapper$performCollapse$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@dl.d CharSequence text) {
                    if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 49513, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(text, "text");
                    this.f95866b.f95850d = text;
                    TextViewSuffixWrapper textViewSuffixWrapper = this.f95866b;
                    textViewSuffixWrapper.f95851e = textViewSuffixWrapper.r().getLayout();
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence3) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence3}, this, changeQuickRedirect, false, 49514, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(charSequence3);
                    return b2.f124493a;
                }
            }, new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapper$performCollapse$3
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d CharSequence it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49515, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    TextViewSuffixWrapper.b(this.f95867b, transition);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence3) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence3}, this, changeQuickRedirect, false, 49516, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(charSequence3);
                    return b2.f124493a;
                }
            }, this.f95858l);
            return;
        }
        if (f0.g(this.f95850d, this.f95848b)) {
            return;
        }
        if (transition == null) {
            this.f95847a.setMaxLines(this.f95855i);
            this.f95847a.setEllipsize(TextUtils.TruncateAt.END);
            this.f95847a.setText(this.f95850d);
        } else {
            TextView textView2 = this.f95847a;
            CharSequence charSequence3 = this.f95850d;
            f0.m(charSequence3);
            TextViewSuffixWrapperKt.m(textView2, charSequence3, transition, this.f95857k);
        }
    }

    private static final void v(TextViewSuffixWrapper textViewSuffixWrapper, Transition transition) {
        if (PatchProxy.proxy(new Object[]{textViewSuffixWrapper, transition}, null, changeQuickRedirect, true, 49505, new Class[]{TextViewSuffixWrapper.class, Transition.class}, Void.TYPE).isSupported) {
            return;
        }
        textViewSuffixWrapper.f95847a.setMaxLines(textViewSuffixWrapper.f95855i);
        textViewSuffixWrapper.f95847a.setEllipsize(TextUtils.TruncateAt.END);
        CharSequence text = textViewSuffixWrapper.f95847a.getText();
        textViewSuffixWrapper.f95847a.setText(textViewSuffixWrapper.f95848b);
        if (transition != null) {
            TextView textView = textViewSuffixWrapper.f95847a;
            Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(text);
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                transition.a(new b(textView, textViewSuffixWrapper));
            }
            v.b(textViewSuffixWrapper.f95857k, transition);
        }
    }

    private final void w(Transition transition) {
        if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49500, new Class[]{Transition.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95852f = false;
        TextViewSuffixWrapperKt.h(this.f95847a, this.f95848b, transition, this.f95857k);
    }

    public final void A(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 49489, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f95857k = viewGroup;
    }

    public final void B(@dl.e CharSequence charSequence) {
        this.f95850d = null;
        this.f95849c = charSequence;
    }

    public final void C(int i10) {
        this.f95855i = i10;
    }

    public final void D(@dl.e Transition transition) {
        this.f95856j = transition;
    }

    public final void E(int i10, int i11, @androidx.annotation.n int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49491, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        p().add(new a(i10, i11, Integer.valueOf(androidx.core.content.res.i.e(this.f95847a.getResources(), i12, this.f95847a.getContext().getTheme())), null));
    }

    public final void F(int i10, int i11, @androidx.annotation.n int i12, @dl.e View.OnClickListener onClickListener) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49493, new Class[]{cls, cls, cls, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        p().add(new a(i10, i11, Integer.valueOf(androidx.core.content.res.i.e(this.f95847a.getResources(), i12, this.f95847a.getContext().getTheme())), onClickListener));
    }

    public final void G(int i10, int i11, @dl.d View.OnClickListener listener) {
        Object[] objArr = {new Integer(i10), new Integer(i11), listener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49492, new Class[]{cls, cls, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        p().add(new a(i10, i11, null, listener));
    }

    @xh.i
    public final void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49503, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        J(this, false, 1, null);
    }

    @xh.i
    public final void I(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49496, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f95852f) {
            i(z10);
        } else {
            f(z10);
        }
    }

    @xh.i
    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49502, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g(this, false, 1, null);
    }

    @xh.i
    public final void f(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49494, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u(z10 ? this.f95856j : null);
    }

    @xh.i
    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49504, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j(this, false, 1, null);
    }

    @xh.i
    public final void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49498, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        w(z10 ? this.f95856j : null);
    }

    public final boolean k() {
        return this.f95853g;
    }

    public final boolean l() {
        return this.f95854h;
    }

    @dl.d
    public final CharSequence m() {
        return this.f95848b;
    }

    @dl.d
    public final ViewGroup n() {
        return this.f95857k;
    }

    @dl.e
    public final CharSequence o() {
        return this.f95849c;
    }

    public final int q() {
        return this.f95855i;
    }

    @dl.d
    public final TextView r() {
        return this.f95847a;
    }

    @dl.e
    public final Transition s() {
        return this.f95856j;
    }

    public final boolean t() {
        return this.f95852f;
    }

    public final void x(boolean z10) {
        this.f95853g = z10;
    }

    public final void y(boolean z10) {
        this.f95854h = z10;
    }

    public final void z(@dl.d CharSequence value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 49488, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.f95850d = null;
        this.f95848b = value;
    }
}
