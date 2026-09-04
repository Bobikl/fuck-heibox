package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SpannableBuilder.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class q extends SpannableStringBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Class<?> f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final List<a> f23180c;

    /* JADX INFO: compiled from: SpannableBuilder.java */
    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f23181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f23182c = new AtomicInteger(0);

        a(Object obj) {
            this.f23181b = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof k;
        }

        final void a() {
            this.f23182c.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f23181b).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f23181b).beforeTextChanged(charSequence, i10, i11, i12);
        }

        final void c() {
            this.f23182c.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f23182c.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f23181b).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f23182c.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = i10 > i11 ? 0 : i10;
                    if (i12 > i13) {
                        i14 = i16;
                        i15 = 0;
                    } else {
                        i15 = i12;
                        i14 = i16;
                    }
                } else {
                    i14 = i10;
                    i15 = i12;
                }
                ((SpanWatcher) this.f23181b).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f23182c.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f23181b).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f23181b).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q(@n0 Class<?> cls) {
        this.f23180c = new ArrayList();
        androidx.core.util.o.m(cls, "watcherClass cannot be null");
        this.f23179b = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q(@n0 Class<?> cls, @n0 CharSequence charSequence) {
        super(charSequence);
        this.f23180c = new ArrayList();
        androidx.core.util.o.m(cls, "watcherClass cannot be null");
        this.f23179b = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q(@n0 Class<?> cls, @n0 CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f23180c = new ArrayList();
        androidx.core.util.o.m(cls, "watcherClass cannot be null");
        this.f23179b = cls;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f23180c.size(); i10++) {
            this.f23180c.get(i10).a();
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static q c(@n0 Class<?> cls, @n0 CharSequence charSequence) {
        return new q(cls, charSequence);
    }

    private void e() {
        for (int i10 = 0; i10 < this.f23180c.size(); i10++) {
            this.f23180c.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i10 = 0; i10 < this.f23180c.size(); i10++) {
            a aVar = this.f23180c.get(i10);
            if (aVar.f23181b == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(@n0 Class<?> cls) {
        return this.f23179b == cls;
    }

    private boolean h(@p0 Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i10 = 0; i10 < this.f23180c.size(); i10++) {
            this.f23180c.get(i10).c();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a() {
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @n0
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @n0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @n0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, @n0 Class<T> cls) {
        if (!g(cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f23181b;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, @p0 Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@p0 Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f23180c.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@p0 Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f23180c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new q(this.f23179b, this, i10, i11);
    }
}
