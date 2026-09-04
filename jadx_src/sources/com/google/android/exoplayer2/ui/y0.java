package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.e1;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.p1;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: TrackSelectionDialogBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e1
    private int f50832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f50833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.l.a f50834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f50836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private v0 f50840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<com.google.android.exoplayer2.trackselection.f.C0399f> f50842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private Comparator<a2> f50843m;

    /* JADX INFO: compiled from: TrackSelectionDialogBuilder.java */
    public interface a {
        void a(boolean z10, List<com.google.android.exoplayer2.trackselection.f.C0399f> list);
    }

    public y0(Context context, CharSequence charSequence, final com.google.android.exoplayer2.trackselection.f fVar, final int i10) {
        this.f50831a = context;
        this.f50833c = charSequence;
        com.google.android.exoplayer2.trackselection.l.a aVar = (com.google.android.exoplayer2.trackselection.l.a) com.google.android.exoplayer2.util.a.g(fVar.k());
        this.f50834d = aVar;
        this.f50835e = i10;
        final p1 p1VarG = aVar.g(i10);
        final com.google.android.exoplayer2.trackselection.f.d dVarB = fVar.b();
        this.f50841k = dVarB.r(i10);
        com.google.android.exoplayer2.trackselection.f.C0399f c0399fS = dVarB.s(i10, p1VarG);
        this.f50842l = c0399fS == null ? Collections.emptyList() : Collections.singletonList(c0399fS);
        this.f50836f = new a() { // from class: com.google.android.exoplayer2.ui.x0
            @Override // com.google.android.exoplayer2.ui.y0.a
            public final void a(boolean z10, List list) {
                y0.f(fVar, dVarB, i10, p1VarG, z10, list);
            }
        };
    }

    public y0(Context context, CharSequence charSequence, com.google.android.exoplayer2.trackselection.l.a aVar, int i10, a aVar2) {
        this.f50831a = context;
        this.f50833c = charSequence;
        this.f50834d = aVar;
        this.f50835e = i10;
        this.f50836f = aVar2;
        this.f50842l = Collections.emptyList();
    }

    @androidx.annotation.p0
    private Dialog d() {
        try {
            Class cls = Integer.TYPE;
            Object objNewInstance = androidx.appcompat.app.c.a.class.getConstructor(Context.class, cls).newInstance(this.f50831a, Integer.valueOf(this.f50832b));
            View viewInflate = LayoutInflater.from((Context) androidx.appcompat.app.c.a.class.getMethod("getContext", new Class[0]).invoke(objNewInstance, new Object[0])).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener onClickListenerQ = q(viewInflate);
            androidx.appcompat.app.c.a.class.getMethod(com.alipay.sdk.m.x.d.f39536p, CharSequence.class).invoke(objNewInstance, this.f50833c);
            androidx.appcompat.app.c.a.class.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            androidx.appcompat.app.c.a.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.ok), onClickListenerQ);
            androidx.appcompat.app.c.a.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) androidx.appcompat.app.c.a.class.getMethod(TopicHashtagWrapper.TYPE_CREATE, new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    private Dialog e() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f50831a, this.f50832b);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.f50833c).setView(viewInflate).setPositiveButton(android.R.string.ok, q(viewInflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(com.google.android.exoplayer2.trackselection.f fVar, com.google.android.exoplayer2.trackselection.f.d dVar, int i10, p1 p1Var, boolean z10, List list) {
        fVar.h(com.google.android.exoplayer2.trackselection.v.c(dVar, i10, p1Var, z10, list.isEmpty() ? null : (com.google.android.exoplayer2.trackselection.f.C0399f) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i10) {
        this.f50836f.a(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    private DialogInterface.OnClickListener q(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.f50838h);
        trackSelectionView.setAllowAdaptiveSelections(this.f50837g);
        trackSelectionView.setShowDisableOption(this.f50839i);
        v0 v0Var = this.f50840j;
        if (v0Var != null) {
            trackSelectionView.setTrackNameProvider(v0Var);
        }
        trackSelectionView.e(this.f50834d, this.f50835e, this.f50841k, this.f50842l, this.f50843m, null);
        return new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.w0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f50822b.g(trackSelectionView, dialogInterface, i10);
            }
        };
    }

    public Dialog c() {
        Dialog dialogD = d();
        return dialogD == null ? e() : dialogD;
    }

    public y0 h(boolean z10) {
        this.f50837g = z10;
        return this;
    }

    public y0 i(boolean z10) {
        this.f50838h = z10;
        return this;
    }

    public y0 j(boolean z10) {
        this.f50841k = z10;
        return this;
    }

    public y0 k(@androidx.annotation.p0 com.google.android.exoplayer2.trackselection.f.C0399f c0399f) {
        return l(c0399f == null ? Collections.emptyList() : Collections.singletonList(c0399f));
    }

    public y0 l(List<com.google.android.exoplayer2.trackselection.f.C0399f> list) {
        this.f50842l = list;
        return this;
    }

    public y0 m(boolean z10) {
        this.f50839i = z10;
        return this;
    }

    public y0 n(@e1 int i10) {
        this.f50832b = i10;
        return this;
    }

    public void o(@androidx.annotation.p0 Comparator<a2> comparator) {
        this.f50843m = comparator;
    }

    public y0 p(@androidx.annotation.p0 v0 v0Var) {
        this.f50840j = v0Var;
        return this;
    }
}
