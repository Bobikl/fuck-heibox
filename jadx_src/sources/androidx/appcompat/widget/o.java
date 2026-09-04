package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private TextView f2860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private TextClassifier f2861b;

    /* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
    @androidx.annotation.w0(26)
    public static final class a {
        private a() {
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        static TextClassifier a(@androidx.annotation.n0 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    o(@androidx.annotation.n0 TextView textView) {
        this.f2860a = (TextView) androidx.core.util.o.l(textView);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f2861b;
        return textClassifier == null ? a.a(this.f2860a) : textClassifier;
    }

    @androidx.annotation.w0(api = 26)
    public void b(@androidx.annotation.p0 TextClassifier textClassifier) {
        this.f2861b = textClassifier;
    }
}
