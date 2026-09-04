package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class HorizontalScrollListView extends HorizontalScrollView implements Observer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f68538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f68539c;

    public static class a extends Observable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f68540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f68541b;

        public int a() {
            return this.f68540a;
        }

        public int b() {
            return this.f68541b;
        }

        public void c(b bVar) {
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.f.N7, new Class[]{b.class}, Void.TYPE).isSupported) {
                return;
            }
            setChanged();
            notifyObservers(bVar);
        }

        public void d(int i10) {
            this.f68540a = i10;
        }

        public void e(int i10) {
            this.f68541b = i10;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f68542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f68543b;

        public b(int i10, int i11) {
            this.f68542a = i10;
            this.f68543b = i11;
        }
    }

    public HorizontalScrollListView(Context context) {
        super(context);
    }

    public HorizontalScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalScrollListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public ImageView getIv_gradient() {
        return this.f68539c;
    }

    public a getObservable() {
        return this.f68538b;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.L7, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = new b(i10, i11);
        a aVar = this.f68538b;
        if (aVar != null) {
            aVar.c(bVar);
            this.f68538b.d(i10);
            this.f68538b.e(i11);
        }
    }

    public void setIv_gradient(ImageView imageView) {
        this.f68539c = imageView;
    }

    public void setObservable(a aVar) {
        this.f68538b = aVar;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (PatchProxy.proxy(new Object[]{observable, obj}, this, changeQuickRedirect, false, bb.c.f.M7, new Class[]{Observable.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b bVar = (b) obj;
        scrollTo(bVar.f68542a, bVar.f68543b);
        ImageView imageView = this.f68539c;
        if (imageView != null) {
            if (bVar.f68542a == 0) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
            }
        }
    }
}
