package com.previewlibrary.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.i;
import androidx.annotation.p0;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.github.chrisbanes.photoview.k;
import com.previewlibrary.GPVideoPlayerActivity;
import com.previewlibrary.GPreviewActivity;
import com.previewlibrary.R;
import com.previewlibrary.enitity.IThumbViewInfo;
import com.previewlibrary.wight.SmoothImageView;

/* JADX INFO: compiled from: BasePhotoFragment.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f96336i = "is_trans_photo";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f96337j = "isSingleFling";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f96338k = "key_item";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f96339l = "isDrag";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f96340m = "sensitivity";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static fg.c f96341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f96342o = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected IThumbViewInfo f96343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96344c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SmoothImageView f96345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected View f96346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected View f96347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected fg.b f96348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected View f96349h;

    /* JADX INFO: renamed from: com.previewlibrary.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class ViewOnClickListenerC0916a implements View.OnClickListener {
        ViewOnClickListenerC0916a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strS = a.this.f96343b.s();
            if (strS == null || strS.isEmpty()) {
                return;
            }
            fg.c cVar = a.f96341n;
            if (cVar != null) {
                cVar.a(strS);
            } else {
                GPVideoPlayerActivity.a(a.this.getContext(), strS);
            }
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class b implements fg.b {
        b() {
        }

        @Override // fg.b
        public void a(Drawable drawable) {
            a.this.f96347f.setVisibility(8);
            String strS = a.this.f96343b.s();
            if (strS == null || strS.isEmpty()) {
                a.this.f96349h.setVisibility(8);
            } else {
                a.this.f96349h.setVisibility(0);
                j1.g(a.this.f96349h).b(1.0f).s(1000L).y();
            }
        }

        @Override // fg.b
        public void onLoadFailed(Drawable drawable) {
            a.this.f96347f.setVisibility(8);
            a.this.f96349h.setVisibility(8);
            if (drawable != null) {
                a.this.f96345d.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class c implements k {
        c() {
        }

        @Override // com.github.chrisbanes.photoview.k
        public void a(View view, float f10, float f11) {
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class d implements k {
        d() {
        }

        @Override // com.github.chrisbanes.photoview.k
        public void a(View view, float f10, float f11) {
            if (a.this.f96345d.u()) {
                ((GPreviewActivity) a.this.getActivity()).Z0();
            }
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class e implements com.github.chrisbanes.photoview.g {
        e() {
        }

        @Override // com.github.chrisbanes.photoview.g
        public void a(ImageView imageView, float f10, float f11) {
            if (a.this.f96345d.u()) {
                FragmentActivity activity = a.this.getActivity();
                if (activity instanceof GPreviewActivity) {
                    ((GPreviewActivity) activity).Z0();
                }
            }
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class f implements SmoothImageView.g {
        f() {
        }

        @Override // com.previewlibrary.wight.SmoothImageView.g
        public void a(int i10) {
            String strS;
            if (i10 != 255 || (strS = a.this.f96343b.s()) == null || strS.isEmpty()) {
                a.this.f96349h.setVisibility(8);
            } else {
                a.this.f96349h.setVisibility(0);
            }
            a.this.f96346e.setBackgroundColor(a.O3(i10 / 255.0f, j1.f21601t));
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class g implements SmoothImageView.h {
        g() {
        }

        @Override // com.previewlibrary.wight.SmoothImageView.h
        public void a() {
            FragmentActivity activity = a.this.getActivity();
            if (activity instanceof GPreviewActivity) {
                ((GPreviewActivity) activity).Z0();
            }
        }
    }

    /* JADX INFO: compiled from: BasePhotoFragment.java */
    public class h implements SmoothImageView.j {
        h() {
        }

        @Override // com.previewlibrary.wight.SmoothImageView.j
        public void a(SmoothImageView.Status status) {
            a.this.f96346e.setBackgroundColor(j1.f21601t);
        }
    }

    public static int O3(float f10, int i10) {
        return (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i10 & 16777215);
    }

    public static a P3(Class<? extends a> cls, IThumbViewInfo iThumbViewInfo, boolean z10, boolean z11, boolean z12, float f10) {
        a aVar;
        try {
            aVar = cls.newInstance();
        } catch (Exception unused) {
            aVar = new a();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(f96338k, iThumbViewInfo);
        bundle.putBoolean(f96336i, z10);
        bundle.putBoolean(f96337j, z11);
        bundle.putBoolean(f96339l, z12);
        bundle.putFloat(f96340m, f10);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void Q3(View view) {
        this.f96347f = view.findViewById(R.id.loading);
        this.f96345d = (SmoothImageView) view.findViewById(R.id.photoView);
        this.f96349h = view.findViewById(R.id.btnVideo);
        View viewFindViewById = view.findViewById(R.id.rootView);
        this.f96346e = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f96345d.setDrawingCacheEnabled(false);
        this.f96349h.setOnClickListener(new ViewOnClickListenerC0916a());
        this.f96348g = M3();
    }

    public void L3(int i10) {
        j1.g(this.f96349h).b(0.0f).s(SmoothImageView.getDuration()).y();
        this.f96346e.setBackgroundColor(i10);
    }

    protected fg.b M3() {
        return new b();
    }

    public IThumbViewInfo N3() {
        return this.f96343b;
    }

    public void R3() {
        this.f96344c = false;
    }

    public void S3() {
        SmoothImageView smoothImageView = this.f96345d;
        if (smoothImageView != null) {
            smoothImageView.B(new h());
        }
    }

    public void T3(SmoothImageView.j jVar) {
        this.f96345d.C(jVar);
    }

    protected void initData() {
        boolean z10;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z10 = arguments.getBoolean(f96337j);
            this.f96343b = (IThumbViewInfo) arguments.getParcelable(f96338k);
            this.f96345d.setDrag(arguments.getBoolean(f96339l), arguments.getFloat(f96340m));
            this.f96345d.setThumbRect(this.f96343b.getBounds());
            this.f96346e.setTag(this.f96343b.getUrl());
            this.f96344c = arguments.getBoolean(f96336i, false);
            if (this.f96343b.getUrl().toLowerCase().contains(com.max.mediaselector.lib.config.f.f75143v)) {
                this.f96345d.setZoomable(false);
                com.previewlibrary.b.a().b().a(this, this.f96343b.getUrl(), this.f96345d, this.f96348g);
            } else {
                com.previewlibrary.b.a().b().d(this, this.f96343b.getUrl(), this.f96345d, this.f96348g);
            }
        } else {
            z10 = true;
        }
        if (this.f96344c) {
            this.f96345d.setMinimumScale(0.7f);
        } else {
            this.f96346e.setBackgroundColor(j1.f21601t);
        }
        if (z10) {
            this.f96345d.setOnViewTapListener(new c());
            this.f96345d.setOnViewTapListener(new d());
        } else {
            this.f96345d.setOnPhotoTapListener(new e());
        }
        this.f96345d.setAlphaChangeListener(new f());
        this.f96345d.setTransformOutListener(new g());
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_image_photo_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.previewlibrary.b.a().b().c(getActivity());
        if (getActivity() == null || !getActivity().isFinishing()) {
            return;
        }
        f96341n = null;
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onDestroyView() {
        super.onDestroyView();
        R3();
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onStop() {
        com.previewlibrary.b.a().b().b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onViewCreated(View view, @p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        Q3(view);
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
    }
}
