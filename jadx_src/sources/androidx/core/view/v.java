package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: MenuHost.java */
/* JADX INFO: loaded from: classes.dex */
public interface v {
    void addMenuProvider(@androidx.annotation.n0 p0 p0Var);

    void addMenuProvider(@androidx.annotation.n0 p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@androidx.annotation.n0 p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(@androidx.annotation.n0 p0 p0Var);
}
