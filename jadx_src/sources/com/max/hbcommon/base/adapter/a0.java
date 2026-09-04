package com.max.hbcommon.base.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface a0 {

    /* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d a0 a0Var, int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
        }
    }

    void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10);

    void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder);

    void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder);
}
