package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: SimpleCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int[] f21977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int[] f21978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f21980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f21981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    String[] f21982u;

    /* JADX INFO: compiled from: SimpleCursorAdapter.java */
    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: compiled from: SimpleCursorAdapter.java */
    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i10);
    }

    @Deprecated
    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.f21979r = -1;
        this.f21978q = iArr;
        this.f21982u = strArr;
        p(cursor, strArr);
    }

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f21979r = -1;
        this.f21978q = iArr;
        this.f21982u = strArr;
        p(cursor, strArr);
    }

    private void p(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f21977p = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f21977p;
        if (iArr == null || iArr.length != length) {
            this.f21977p = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f21977p[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.f21980s;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i10 = this.f21979r;
        return i10 > -1 ? cursor.getString(i10) : super.convertToString(cursor);
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.f21981t;
        int[] iArr = this.f21978q;
        int length = iArr.length;
        int[] iArr2 = this.f21977p;
        for (int i10 = 0; i10 < length; i10++) {
            View viewFindViewById = view.findViewById(iArr[i10]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.setViewValue(viewFindViewById, cursor, iArr2[i10]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i10]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        x((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        w((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor l(Cursor cursor) {
        p(cursor, this.f21982u);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.f21982u = strArr;
        this.f21978q = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public a q() {
        return this.f21980s;
    }

    public int r() {
        return this.f21979r;
    }

    public b s() {
        return this.f21981t;
    }

    public void t(a aVar) {
        this.f21980s = aVar;
    }

    public void u(int i10) {
        this.f21979r = i10;
    }

    public void v(b bVar) {
        this.f21981t = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }
}
