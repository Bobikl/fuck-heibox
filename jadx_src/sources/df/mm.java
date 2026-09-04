package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2RecordItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewRecordBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2RecordItemView f113494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2RecordItemView f113495b;

    private mm(@androidx.annotation.n0 Dota2RecordItemView dota2RecordItemView, @androidx.annotation.n0 Dota2RecordItemView dota2RecordItemView2) {
        this.f113494a = dota2RecordItemView;
        this.f113495b = dota2RecordItemView2;
    }

    @androidx.annotation.n0
    public static mm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18676, new Class[]{View.class}, mm.class);
        if (patchProxyResultProxy.isSupported) {
            return (mm) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2RecordItemView dota2RecordItemView = (Dota2RecordItemView) view;
        return new mm(dota2RecordItemView, dota2RecordItemView);
    }

    @androidx.annotation.n0
    public static mm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18674, new Class[]{LayoutInflater.class}, mm.class);
        return patchProxyResultProxy.isSupported ? (mm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18675, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mm.class);
        if (patchProxyResultProxy.isSupported) {
            return (mm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_record, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2RecordItemView b() {
        return this.f113494a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18677, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
