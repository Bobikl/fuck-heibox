package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;

/* JADX INFO: compiled from: EmojiTextViewHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23202a;

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    @w0(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f23203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f23204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23205c = true;

        a(TextView textView) {
            this.f23203a = textView;
            this.f23204b = new d(textView);
        }

        @n0
        private InputFilter[] g(@n0 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f23204b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f23204b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> h(@n0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @n0
        private InputFilter[] i(@n0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayH = h(inputFilterArr);
            if (sparseArrayH.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayH.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayH.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        @p0
        private TransformationMethod k(@p0 TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void l() {
            this.f23203a.setFilters(a(this.f23203a.getFilters()));
        }

        @n0
        private TransformationMethod m(@p0 TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @n0
        InputFilter[] a(@n0 InputFilter[] inputFilterArr) {
            return !this.f23205c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f23205c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z10) {
            this.f23205c = z10;
            e();
            l();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            this.f23203a.setTransformationMethod(f(this.f23203a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return this.f23205c ? m(transformationMethod) : k(transformationMethod);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        void j(boolean z10) {
            this.f23205c = z10;
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class b {
        b() {
        }

        @n0
        InputFilter[] a(@n0 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z10) {
        }

        void d(boolean z10) {
        }

        void e() {
        }

        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    @w0(19)
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f23206a;

        c(TextView textView) {
            this.f23206a = new a(textView);
        }

        private boolean g() {
            return !androidx.emoji2.text.f.n();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @n0
        InputFilter[] a(@n0 InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f23206a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f23206a.b();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z10) {
            if (g()) {
                return;
            }
            this.f23206a.c(z10);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z10) {
            if (g()) {
                this.f23206a.j(z10);
            } else {
                this.f23206a.d(z10);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            if (g()) {
                return;
            }
            this.f23206a.e();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @p0
        TransformationMethod f(@p0 TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f23206a.f(transformationMethod);
        }
    }

    public f(@n0 TextView textView) {
        this(textView, true);
    }

    public f(@n0 TextView textView, boolean z10) {
        o.m(textView, "textView cannot be null");
        if (z10) {
            this.f23202a = new a(textView);
        } else {
            this.f23202a = new c(textView);
        }
    }

    @n0
    public InputFilter[] a(@n0 InputFilter[] inputFilterArr) {
        return this.f23202a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f23202a.b();
    }

    public void c(boolean z10) {
        this.f23202a.c(z10);
    }

    public void d(boolean z10) {
        this.f23202a.d(z10);
    }

    public void e() {
        this.f23202a.e();
    }

    @p0
    public TransformationMethod f(@p0 TransformationMethod transformationMethod) {
        return this.f23202a.f(transformationMethod);
    }
}
