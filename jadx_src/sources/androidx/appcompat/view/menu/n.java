package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: MenuView.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface n {

    /* JADX INFO: compiled from: MenuView.java */
    public interface a {
        boolean c();

        void d(j jVar, int i10);

        boolean e();

        j getItemData();

        void setCheckable(boolean z10);

        void setChecked(boolean z10);

        void setEnabled(boolean z10);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z10, char c10);

        void setTitle(CharSequence charSequence);
    }

    void a(g gVar);

    int getWindowAnimations();
}
