package com.heybox.imageviewer.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.heybox.imageviewer.core.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Objects;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageViewerAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ImageViewerAdapter.kt */
    public static final class a extends DiffUtil.ItemCallback<d> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public boolean a(@dl.d d oldItem, @dl.d d newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 98, new Class[]{d.class, d.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return newItem.i() == oldItem.i() && newItem.id() == oldItem.id() && Objects.equals(newItem.d(), oldItem.d());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(d dVar, d dVar2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, dVar2}, this, changeQuickRedirect, false, 100, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(d dVar, d dVar2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, dVar2}, this, changeQuickRedirect, false, 99, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(dVar, dVar2);
        }

        public boolean b(@dl.d d oldItem, @dl.d d newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 97, new Class[]{d.class, d.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return newItem.i() == oldItem.i() && newItem.id() == oldItem.id();
        }
    }

    public static final /* synthetic */ a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 96, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : b();
    }

    private static final a b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 95, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }
}
