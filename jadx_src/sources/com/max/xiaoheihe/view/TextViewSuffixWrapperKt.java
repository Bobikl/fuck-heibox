package com.max.xiaoheihe.view;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.u;
import androidx.transition.v;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.utils.e0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.q;

/* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nTextViewSuffixWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewSuffixWrapper.kt\ncom/max/xiaoheihe/view/TextViewSuffixWrapperKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,550:1\n31#2,4:551\n*S KotlinDebug\n*F\n+ 1 TextViewSuffixWrapper.kt\ncom/max/xiaoheihe/view/TextViewSuffixWrapperKt\n*L\n391#1:551,4\n*E\n"})
public final class TextViewSuffixWrapperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f95872a = "TextViewLayout";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f95873b = false;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
    public static final class a extends u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f95874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f95875c;

        a(TextView textView, CharSequence charSequence) {
            this.f95874b = textView;
            this.f95875c = charSequence;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@dl.d Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49548, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(transition, "transition");
            transition.n0(this);
            this.f95874b.getLayoutParams().height = -2;
            TextView textView = this.f95874b;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f95874b.setText(this.f95875c);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void e(@dl.d Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49549, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(transition, "transition");
            transition.n0(this);
        }
    }

    /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f95876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<CharSequence, b2> f95877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f95878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CharSequence f95879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<CharSequence, CharSequence, Integer, CharSequence> f95881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f95882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ yh.l<CharSequence, b2> f95883i;

        /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f95884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CharSequence f95885c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CharSequence f95886d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f95887e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q<CharSequence, CharSequence, Integer, CharSequence> f95888f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ yh.l<CharSequence, b2> f95889g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ CharSequence f95890h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ yh.l<CharSequence, b2> f95891i;

            /* JADX WARN: Multi-variable type inference failed */
            a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i10, q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, yh.l<? super CharSequence, b2> lVar, CharSequence charSequence3, yh.l<? super CharSequence, b2> lVar2) {
                this.f95884b = textView;
                this.f95885c = charSequence;
                this.f95886d = charSequence2;
                this.f95887e = i10;
                this.f95888f = qVar;
                this.f95889g = lVar;
                this.f95890h = charSequence3;
                this.f95891i = lVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49555, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                yh.l<CharSequence, b2> lVar = this.f95889g;
                CharSequence charSequence = this.f95890h;
                TextView textView = this.f95884b;
                CharSequence charSequence2 = this.f95885c;
                int i10 = this.f95887e;
                CharSequence charSequence3 = this.f95886d;
                q<CharSequence, CharSequence, Integer, CharSequence> qVar = this.f95888f;
                TextViewSuffixWrapperKt.c(lVar, charSequence, textView, charSequence2, i10, charSequence3, qVar, this.f95891i, TextViewSuffixWrapperKt.a(textView, charSequence2, charSequence3, i10, qVar));
                TextViewSuffixWrapperKt.b(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(TextView textView, yh.l<? super CharSequence, b2> lVar, CharSequence charSequence, CharSequence charSequence2, int i10, q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, CharSequence charSequence3, yh.l<? super CharSequence, b2> lVar2) {
            this.f95876b = textView;
            this.f95877c = lVar;
            this.f95878d = charSequence;
            this.f95879e = charSequence2;
            this.f95880f = i10;
            this.f95881g = qVar;
            this.f95882h = charSequence3;
            this.f95883i = lVar2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@dl.e View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49554, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            this.f95876b.removeOnLayoutChangeListener(this);
            if (this.f95876b.getLayout() != null) {
                TextView textView = this.f95876b;
                textView.post(new a(textView, this.f95878d, this.f95879e, this.f95880f, this.f95881g, this.f95877c, this.f95882h, this.f95883i));
            } else {
                yh.l<CharSequence, b2> lVar = this.f95877c;
                CharSequence text = this.f95876b.getText();
                f0.o(text, "text");
                lVar.invoke(text);
            }
        }
    }

    public static final /* synthetic */ int a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i10, q qVar) {
        Object[] objArr = {textView, charSequence, charSequence2, new Integer(i10), qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49540, new Class[]{TextView.class, CharSequence.class, CharSequence.class, cls, q.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : d(textView, charSequence, charSequence2, i10, qVar);
    }

    public static final /* synthetic */ void b(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 49541, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        j(obj);
    }

    public static final /* synthetic */ void c(yh.l lVar, CharSequence charSequence, TextView textView, CharSequence charSequence2, int i10, CharSequence charSequence3, q qVar, yh.l lVar2, int i11) {
        Object[] objArr = {lVar, charSequence, textView, charSequence2, new Integer(i10), charSequence3, qVar, lVar2, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49539, new Class[]{yh.l.class, CharSequence.class, TextView.class, CharSequence.class, cls, CharSequence.class, q.class, yh.l.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        p(lVar, charSequence, textView, charSequence2, i10, charSequence3, qVar, lVar2, i11);
    }

    private static final int d(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i10, q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar) {
        int i11;
        Object[] objArr = {textView, charSequence, charSequence2, new Integer(i10), qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49534, new Class[]{TextView.class, CharSequence.class, CharSequence.class, cls, q.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Ref.IntRef intRef = new Ref.IntRef();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (textView.getLayout() == null) {
            j("layout is null");
            return -1;
        }
        int iE = e(linkedHashMap, intRef, charSequence, charSequence2, textView, qVar, 0, charSequence.length());
        String str = ", targetLineCount = ";
        if (iE <= i10) {
            j("verify <= targetLineCount, verify = " + iE + ", targetLineCount = " + i10);
            textView.setText(charSequence);
            return charSequence.length();
        }
        int length = charSequence.length();
        j("left = 0, right = " + length);
        int i12 = length;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int i15 = i13;
            int i16 = i12;
            String str2 = str;
            int iE2 = e(linkedHashMap, intRef, charSequence, charSequence2, textView, qVar, 0, i14);
            String str3 = "binarySearch: (" + i15 + ", " + i14 + ", " + i16 + "), pLineCount = " + iE2;
            if (iE2 < i10) {
                str3 = str3 + str2 + i10 + ", pLineCount < targetLineCount";
                i13 = i14 + 1;
                i11 = i14;
            } else if (iE2 == i10) {
                int i17 = i14 + 1;
                int iE3 = e(linkedHashMap, intRef, charSequence, charSequence2, textView, qVar, 0, i17);
                str3 = str3 + ", nLineCount = " + iE3;
                int i18 = i10 + 1;
                if (iE3 >= i18) {
                    if (iE3 != i18) {
                        j("impossible");
                        break;
                    }
                    j("success = " + i14 + ", verifyCount = " + intRef.f124889b);
                    return i14;
                }
                i11 = i14;
                i13 = i17;
            } else {
                i11 = i14;
                i16 = i11 - 1;
                i13 = i15;
            }
            j(str3 + ", text = " + charSequence.subSequence(0, i11).toString() + ((Object) charSequence2));
            i12 = i16;
            str = str2;
        }
        j("failed, verifyCount = " + intRef.f124889b);
        return -1;
    }

    private static final int e(Map<Integer, Integer> map, Ref.IntRef intRef, CharSequence charSequence, CharSequence charSequence2, TextView textView, q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, int i10, int i11) {
        CharSequence context;
        Object[] objArr = {map, intRef, charSequence, charSequence2, textView, qVar, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49538, new Class[]{Map.class, Ref.IntRef.class, CharSequence.class, CharSequence.class, TextView.class, q.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i12 = (i10 << 16) | i11;
        Integer num = map.get(Integer.valueOf(i12));
        if (num != null) {
            j("verify: " + i11 + " cached");
            return num.intValue();
        }
        intRef.f124889b++;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
        if (charSequenceSubSequence instanceof SpannableStringBuilder) {
            context = ((SpannableStringBuilder) charSequenceSubSequence).append(charSequence2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) charSequenceSubSequence);
            sb2.append((Object) charSequence2);
            context = sb2.toString();
        }
        if (qVar != null) {
            f0.o(context, "context");
            CharSequence charSequenceInvoke = qVar.invoke(context, charSequence2, Integer.valueOf(i11));
            if (charSequenceInvoke != null) {
                context = charSequenceInvoke;
            }
        }
        textView.setText(context);
        int lineCount = textView.getLineCount();
        j("verify: " + i11 + ", lineCount = " + lineCount);
        map.put(Integer.valueOf(i12), Integer.valueOf(lineCount));
        return lineCount;
    }

    public static final void f(@dl.d final TextView textView, @dl.d final CharSequence mainContent, @dl.d CharSequence suffix, final int i10, @dl.e final Transition transition, @dl.d final ViewGroup sceneRoot, @dl.e final yh.l<? super CharSequence, b2> lVar, @dl.e final yh.l<? super CharSequence, b2> lVar2, @dl.e q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar) {
        if (PatchProxy.proxy(new Object[]{textView, mainContent, suffix, new Integer(i10), transition, sceneRoot, lVar, lVar2, qVar}, null, changeQuickRedirect, true, 49528, new Class[]{TextView.class, CharSequence.class, CharSequence.class, Integer.TYPE, Transition.class, ViewGroup.class, yh.l.class, yh.l.class, q.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(mainContent, "mainContent");
        f0.p(suffix, "suffix");
        f0.p(sceneRoot, "sceneRoot");
        final CharSequence text = textView.getText();
        o(textView, mainContent, suffix, i10, new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapperKt$collapse$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TextViewSuffixWrapper.kt */
            public static final class a extends u {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ TextView f95897b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CharSequence f95898c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ yh.l<CharSequence, b2> f95899d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ CharSequence f95900e;

                /* JADX WARN: Multi-variable type inference failed */
                a(TextView textView, CharSequence charSequence, yh.l<? super CharSequence, b2> lVar, CharSequence charSequence2) {
                    this.f95897b = textView;
                    this.f95898c = charSequence;
                    this.f95899d = lVar;
                    this.f95900e = charSequence2;
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void d(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49544, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    transition.n0(this);
                    this.f95897b.getLayoutParams().height = -2;
                    TextView textView = this.f95897b;
                    textView.setLayoutParams(textView.getLayoutParams());
                    this.f95897b.setText(this.f95898c);
                    yh.l<CharSequence, b2> lVar = this.f95899d;
                    if (lVar != null) {
                        lVar.invoke(this.f95900e);
                    }
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void e(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 49545, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    transition.n0(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d CharSequence result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49542, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (transition == null) {
                    yh.l<CharSequence, b2> lVar3 = lVar;
                    if (lVar3 != null) {
                        lVar3.invoke(result);
                        return;
                    }
                    return;
                }
                CharSequence text2 = textView.getText();
                int height = textView.getLayout().getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(text);
                textView.getLayoutParams().height = height;
                TextView textView2 = textView;
                textView2.setLayoutParams(textView2.getLayoutParams());
                transition.a(new a(textView, text2, lVar, result));
                v.b(sceneRoot, transition);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 49543, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(charSequence);
                return b2.f124493a;
            }
        }, new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapperKt$collapse$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d CharSequence it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49546, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                textView.setText(mainContent);
                textView.setMaxLines(i10);
                yh.l<CharSequence, b2> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(mainContent);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 49547, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(charSequence);
                return b2.f124493a;
            }
        }, qVar);
    }

    public static /* synthetic */ void g(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i10, Transition transition, ViewGroup viewGroup, yh.l lVar, yh.l lVar2, q qVar, int i11, Object obj) {
        ViewGroup viewGroup2;
        Object[] objArr = {textView, charSequence, charSequence2, new Integer(i10), transition, viewGroup, lVar, lVar2, qVar, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49529, new Class[]{TextView.class, CharSequence.class, CharSequence.class, cls, Transition.class, ViewGroup.class, yh.l.class, yh.l.class, q.class, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        Transition autoTransition = (i11 & 8) != 0 ? new AutoTransition() : transition;
        if ((i11 & 16) != 0) {
            ViewParent parent = textView.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = viewGroup;
        }
        f(textView, charSequence, charSequence2, i10, autoTransition, viewGroup2, (i11 & 32) != 0 ? null : lVar, (i11 & 64) != 0 ? null : lVar2, qVar);
    }

    public static final void h(@dl.d TextView textView, @dl.d CharSequence mainContent, @dl.e Transition transition, @dl.d ViewGroup sceneRoot) {
        if (PatchProxy.proxy(new Object[]{textView, mainContent, transition, sceneRoot}, null, changeQuickRedirect, true, 49530, new Class[]{TextView.class, CharSequence.class, Transition.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(mainContent, "mainContent");
        f0.p(sceneRoot, "sceneRoot");
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setText(mainContent);
        if (transition != null) {
            v.b(sceneRoot, transition);
        }
    }

    public static /* synthetic */ void i(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{textView, charSequence, transition, viewGroup, new Integer(i10), obj}, null, changeQuickRedirect, true, 49531, new Class[]{TextView.class, CharSequence.class, Transition.class, ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            transition = new AutoTransition();
        }
        if ((i10 & 4) != 0) {
            ViewParent parent = textView.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) parent;
        }
        h(textView, charSequence, transition, viewGroup);
    }

    private static final void j(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 49525, new Class[]{Object.class}, Void.TYPE).isSupported && f95873b) {
            Log.d(f95872a, String.valueOf(obj));
        }
    }

    @xh.i
    public static final void k(@dl.d TextView textView, @dl.d CharSequence content) {
        if (PatchProxy.proxy(new Object[]{textView, content}, null, changeQuickRedirect, true, 49536, new Class[]{TextView.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(content, "content");
        n(textView, content, null, null, 6, null);
    }

    @xh.i
    public static final void l(@dl.d TextView textView, @dl.d CharSequence content, @dl.d Transition transition) {
        if (PatchProxy.proxy(new Object[]{textView, content, transition}, null, changeQuickRedirect, true, 49535, new Class[]{TextView.class, CharSequence.class, Transition.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(content, "content");
        f0.p(transition, "transition");
        n(textView, content, transition, null, 4, null);
    }

    @xh.i
    public static final void m(@dl.d TextView textView, @dl.d CharSequence content, @dl.d Transition transition, @dl.d ViewGroup sceneRoot) {
        if (PatchProxy.proxy(new Object[]{textView, content, transition, sceneRoot}, null, changeQuickRedirect, true, 49526, new Class[]{TextView.class, CharSequence.class, Transition.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(content, "content");
        f0.p(transition, "transition");
        f0.p(sceneRoot, "sceneRoot");
        CharSequence text = textView.getText();
        textView.setText(content);
        Layout layout = textView.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(text);
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            transition.a(new a(textView, content));
        }
        v.b(sceneRoot, transition);
    }

    public static /* synthetic */ void n(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{textView, charSequence, transition, viewGroup, new Integer(i10), obj}, null, changeQuickRedirect, true, 49527, new Class[]{TextView.class, CharSequence.class, Transition.class, ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            transition = new AutoTransition();
        }
        if ((i10 & 4) != 0) {
            ViewParent parent = textView.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) parent;
        }
        m(textView, charSequence, transition, viewGroup);
    }

    public static final void o(@dl.d TextView textView, @dl.d CharSequence mainContent, @dl.d CharSequence suffix, int i10, @dl.d yh.l<? super CharSequence, b2> onSuccess, @dl.d yh.l<? super CharSequence, b2> onFailed, @dl.e q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar) {
        if (PatchProxy.proxy(new Object[]{textView, mainContent, suffix, new Integer(i10), onSuccess, onFailed, qVar}, null, changeQuickRedirect, true, 49532, new Class[]{TextView.class, CharSequence.class, CharSequence.class, Integer.TYPE, yh.l.class, yh.l.class, q.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        f0.p(mainContent, "mainContent");
        f0.p(suffix, "suffix");
        f0.p(onSuccess, "onSuccess");
        f0.p(onFailed, "onFailed");
        CharSequence text = textView.getText();
        if (textView.getLayout() == null) {
            textView.addOnLayoutChangeListener(new b(textView, onFailed, mainContent, suffix, i10, qVar, text, onSuccess));
            textView.requestLayout();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        p(onFailed, text, textView, mainContent, i10, suffix, qVar, onSuccess, d(textView, mainContent, suffix, i10, qVar));
        j(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x014f  */
    private static final void p(yh.l<? super CharSequence, b2> lVar, CharSequence originText, TextView textView, CharSequence charSequence, int i10, CharSequence charSequence2, q<? super CharSequence, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, yh.l<? super CharSequence, b2> lVar2, int i11) {
        SpannableStringBuilder msg;
        CharSequence charSequenceInvoke = charSequence;
        Object[] objArr = {lVar, originText, textView, charSequenceInvoke, new Integer(i10), charSequence2, qVar, lVar2, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49537, new Class[]{yh.l.class, CharSequence.class, TextView.class, CharSequence.class, cls, CharSequence.class, q.class, yh.l.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (i11 < 0) {
                f0.o(originText, "originText");
                lVar.invoke(originText);
                return;
            }
            if (i11 < charSequence.length()) {
                SpannableStringBuilder spannableStringBuilder = charSequenceInvoke instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequenceInvoke : new SpannableStringBuilder(charSequenceInvoke);
                if (i11 > 3) {
                    int i12 = i11 - 3;
                    CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i11);
                    f0.n(charSequenceSubSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequenceSubSequence;
                    String[] strArr = {"#0014191E", "#FF14191E"};
                    Object[] spans = spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), CharacterStyle.class);
                    f0.o(spans, "getSpans(start, end, T::class.java)");
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spans;
                    int length = characterStyleArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        CharacterStyle characterStyle = characterStyleArr[i13];
                        CharacterStyle[] characterStyleArr2 = characterStyleArr;
                        if ((characterStyle instanceof ae.a) || (characterStyle instanceof ForegroundColorSpan)) {
                            spannableStringBuilder2.removeSpan(characterStyle);
                        }
                        i13++;
                        characterStyleArr = characterStyleArr2;
                    }
                    StaticLayout staticLayoutE = e0.e(textView, ViewUtils.W(textView));
                    int lineStart = staticLayoutE.getLineStart(Math.min(staticLayoutE.getLineCount() - 1, i10 - 1));
                    if (lineStart < i12) {
                        spannableStringBuilder2.setSpan(new ae.a(Color.parseColor(strArr[1]), Color.parseColor(strArr[0]), ViewUtils.S(textView.getPaint(), charSequenceInvoke.subSequence(lineStart, i12).toString()), spannableStringBuilder2), 0, 3, 33);
                    }
                    CharSequence charSequenceSubSequence2 = spannableStringBuilder.subSequence(0, i12);
                    f0.n(charSequenceSubSequence2, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    msg = ((SpannableStringBuilder) charSequenceSubSequence2).append((CharSequence) spannableStringBuilder2).append(charSequence2);
                } else {
                    CharSequence charSequenceSubSequence3 = spannableStringBuilder.subSequence(0, i11);
                    f0.n(charSequenceSubSequence3, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    msg = ((SpannableStringBuilder) charSequenceSubSequence3).append(charSequence2);
                }
                if (qVar != null) {
                    f0.o(msg, "msg");
                    charSequenceInvoke = qVar.invoke(msg, charSequence2, Integer.valueOf(i11));
                    if (charSequenceInvoke == null) {
                        charSequenceInvoke = msg;
                    }
                } else {
                    charSequenceInvoke = msg;
                }
            }
            textView.setText(charSequenceInvoke);
            CharSequence text = textView.getText();
            f0.o(text, "text");
            lVar2.invoke(text);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void q(final TextView textView, CharSequence charSequence, CharSequence charSequence2, final int i10, yh.l lVar, yh.l lVar2, q qVar, int i11, Object obj) {
        Object[] objArr = {textView, charSequence, charSequence2, new Integer(i10), lVar, lVar2, qVar, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49533, new Class[]{TextView.class, CharSequence.class, CharSequence.class, cls, yh.l.class, yh.l.class, q.class, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(textView, charSequence, charSequence2, i10, (i11 & 8) != 0 ? new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapperKt$setTextWithSuffix$1
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d CharSequence it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49550, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence3) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence3}, this, changeQuickRedirect, false, 49551, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(charSequence3);
                return b2.f124493a;
            }
        } : lVar, (i11 & 16) != 0 ? new yh.l<CharSequence, b2>() { // from class: com.max.xiaoheihe.view.TextViewSuffixWrapperKt$setTextWithSuffix$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d CharSequence text) {
                if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 49552, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(text, "text");
                textView.setText(text);
                textView.setMaxLines(i10);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CharSequence charSequence3) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence3}, this, changeQuickRedirect, false, 49553, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(charSequence3);
                return b2.f124493a;
            }
        } : lVar2, qVar);
    }
}
