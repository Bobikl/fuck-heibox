package d0;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: compiled from: AllCapsTransformationMethod.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a implements TransformationMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Locale f108125b;

    public a(Context context) {
        this.f108125b = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f108125b);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}
