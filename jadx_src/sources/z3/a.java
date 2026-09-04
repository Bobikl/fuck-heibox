package z3;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.n0;

/* JADX INFO: compiled from: LPaint.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Paint {
    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@n0 LocaleList localeList) {
    }
}
