package com.max.hbcommon.base;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseRVOnItemClickListener.kt */
/* JADX INFO: loaded from: classes9.dex */
public class e extends RecyclerView.SimpleOnItemTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final b f66870d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f66871e = "BaseRVOnItemClickListener-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final RecyclerView f66872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final GestureDetector f66873c;

    /* JADX INFO: compiled from: BaseRVOnItemClickListener.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@dl.d MotionEvent motionEvent) {
            if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.b.ew, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(motionEvent, "motionEvent");
            View viewFindChildViewUnder = e.this.f66872b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null) {
                e eVar = e.this;
                eVar.c(eVar.f66872b.getChildLayoutPosition(viewFindChildViewUnder), viewFindChildViewUnder);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@dl.d MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.b.fw, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(motionEvent, "motionEvent");
            View viewFindChildViewUnder = e.this.f66872b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null) {
                return e.this.b(e.this.f66872b.getChildLayoutPosition(viewFindChildViewUnder), viewFindChildViewUnder);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: BaseRVOnItemClickListener.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    public e(@dl.d RecyclerView recyclerView) {
        f0.p(recyclerView, "recyclerView");
        this.f66872b = recyclerView;
        this.f66873c = new GestureDetector(recyclerView.getContext(), new a());
    }

    public boolean b(int i10, @dl.e View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, bb.c.b.dw, new Class[]{Integer.TYPE, View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d(f66871e, "[onItemClick]\npos: " + i10 + ", view: " + view);
        return true;
    }

    public void c(int i10, @dl.e View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, bb.c.b.cw, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(f66871e, "[onItemLongClick]\npos: " + i10 + ", view: " + view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@dl.d RecyclerView rv, @dl.d MotionEvent e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rv, e10}, this, changeQuickRedirect, false, bb.c.b.bw, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(rv, "rv");
        f0.p(e10, "e");
        return this.f66873c.onTouchEvent(e10);
    }
}
