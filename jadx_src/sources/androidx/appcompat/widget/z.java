package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: DecorContentParent.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface z {
    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    void i(SparseArray<Parcelable> sparseArray);

    void l(SparseArray<Parcelable> sparseArray);

    void m(int i10);

    void n();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setMenu(Menu menu, androidx.appcompat.view.menu.m.a aVar);

    void setMenuPrepared();

    void setUiOptions(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
