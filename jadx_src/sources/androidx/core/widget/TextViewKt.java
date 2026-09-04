package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
public final class TextViewKt {

    /* JADX INFO: compiled from: TextView.kt */
    @t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<Editable, b2> f21874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.r<CharSequence, Integer, Integer, Integer, b2> f21875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.r<CharSequence, Integer, Integer, Integer, b2> f21876d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.l<? super Editable, b2> lVar, yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> rVar, yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> rVar2) {
            this.f21874b = lVar;
            this.f21875c = rVar;
            this.f21876d = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            this.f21874b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            this.f21875c.U0(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            this.f21876d.U0(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    /* JADX INFO: compiled from: TextView.kt */
    @t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n71#2:98\n77#3:99\n*E\n"})
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l f21880b;

        public b(yh.l lVar) {
            this.f21880b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            this.f21880b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: TextView.kt */
    @t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n78#2:98\n77#3:99\n*E\n"})
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.r f21881b;

        public c(yh.r rVar) {
            this.f21881b = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            this.f21881b.U0(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: TextView.kt */
    @t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n78#2:98\n71#3:99\n*E\n"})
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.r f21882b;

        public d(yh.r rVar) {
            this.f21882b = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
            this.f21882b.U0(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @dl.d
    public static final TextWatcher a(@dl.d TextView textView, @dl.d yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> beforeTextChanged, @dl.d yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> onTextChanged, @dl.d yh.l<? super Editable, b2> afterTextChanged) {
        f0.p(textView, "<this>");
        f0.p(beforeTextChanged, "beforeTextChanged");
        f0.p(onTextChanged, "onTextChanged");
        f0.p(afterTextChanged, "afterTextChanged");
        a aVar = new a(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, yh.r beforeTextChanged, yh.r onTextChanged, yh.l afterTextChanged, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            beforeTextChanged = new yh.r<CharSequence, Integer, Integer, Integer, b2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$1
                @Override // yh.r
                public /* bridge */ /* synthetic */ b2 U0(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return b2.f124493a;
                }

                public final void a(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            onTextChanged = new yh.r<CharSequence, Integer, Integer, Integer, b2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$2
                @Override // yh.r
                public /* bridge */ /* synthetic */ b2 U0(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return b2.f124493a;
                }

                public final void a(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                }
            };
        }
        if ((i10 & 4) != 0) {
            afterTextChanged = new yh.l<Editable, b2>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$3
                public final void a(@dl.e Editable editable) {
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Editable editable) {
                    a(editable);
                    return b2.f124493a;
                }
            };
        }
        f0.p(textView, "<this>");
        f0.p(beforeTextChanged, "beforeTextChanged");
        f0.p(onTextChanged, "onTextChanged");
        f0.p(afterTextChanged, "afterTextChanged");
        a aVar = new a(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    @dl.d
    public static final TextWatcher c(@dl.d TextView textView, @dl.d yh.l<? super Editable, b2> action) {
        f0.p(textView, "<this>");
        f0.p(action, "action");
        b bVar = new b(action);
        textView.addTextChangedListener(bVar);
        return bVar;
    }

    @dl.d
    public static final TextWatcher d(@dl.d TextView textView, @dl.d yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> action) {
        f0.p(textView, "<this>");
        f0.p(action, "action");
        c cVar = new c(action);
        textView.addTextChangedListener(cVar);
        return cVar;
    }

    @dl.d
    public static final TextWatcher e(@dl.d TextView textView, @dl.d yh.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, b2> action) {
        f0.p(textView, "<this>");
        f0.p(action, "action");
        d dVar = new d(action);
        textView.addTextChangedListener(dVar);
        return dVar;
    }
}
