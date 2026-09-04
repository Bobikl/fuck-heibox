package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;
import java.util.Locale;

/* JADX INFO: compiled from: IRemoteViewDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class i extends e {
    protected ViewfinderView A;
    protected ImageView B;
    private ImageView C;
    private TextView D;
    private IObjectWrapper E;
    private RelativeLayout F;
    private int G;
    private int H;

    /* JADX INFO: compiled from: IRemoteViewDelegateImpl.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f61498a;

        a(RelativeLayout relativeLayout) {
            this.f61498a = relativeLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (i.this.G == this.f61498a.getHeight() || i.this.H == this.f61498a.getWidth()) {
                return;
            }
            i.this.G = this.f61498a.getHeight();
            i.this.H = this.f61498a.getWidth();
            i.this.p();
        }
    }

    /* JADX INFO: compiled from: IRemoteViewDelegateImpl.java */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = i.this.f61470i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: IRemoteViewDelegateImpl.java */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                i.this.f();
                i.this.o();
                i.this.C.setContentDescription(i.this.C.getResources().getString(R.string.scankit_light));
            } else {
                i.this.g();
                view.setSelected(true);
                TextView textView = i.this.D;
                int i10 = R.string.scankit_light_off;
                textView.setText(i10);
                i.this.C.setContentDescription(i.this.C.getResources().getString(i10));
            }
        }
    }

    public i(Context context, int i10, IObjectWrapper iObjectWrapper, boolean z10, boolean z11) {
        super(context, i10, null, iObjectWrapper, z10, false, z11);
        this.G = 0;
        this.H = 0;
        this.E = iObjectWrapper;
        this.f61464c = context;
        this.f61463b = i10;
        this.f61477p = z10;
        this.f61475n = new Rect(-1, -1, -1, -1);
        this.f61480s = z11;
    }

    private boolean n() {
        return this.f61464c.getResources().getDisplayMetrics().widthPixels > 1990 && this.f61464c.getResources().getDisplayMetrics().widthPixels < 2300 && this.f61464c.getResources().getDisplayMetrics().heightPixels > 2190 && this.f61464c.getResources().getDisplayMetrics().heightPixels < 2600;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setSelected(false);
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(R.string.scankit_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if ((w7.f(this.f61464c) && w7.b((Activity) this.f61464c)) || this.F == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.F.getLayoutParams().width, this.F.getLayoutParams().height);
        layoutParams.setMargins(0, m(), 0, 0);
        this.F.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.hms.scankit.e
    protected void c() {
        super.c();
        o4.d("Scankit", "initlight mIsContains " + this.f61471j);
        if (!this.f61471j && this.f61481t && w7.a(this.f61464c)) {
            o4.d("Scankit", "initlight open");
            this.f61484w.setVisibility(0);
        }
    }

    @Override // com.huawei.hms.scankit.e
    protected ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f61464c : DynamicModuleInitializer.getContext(), false);
    }

    @Override // com.huawei.hms.scankit.e
    protected void e() {
        ProviderRemoteView providerRemoteViewD = d();
        this.f61465d = providerRemoteViewD;
        this.F = (RelativeLayout) providerRemoteViewD.findViewById(R.id.scan_title);
        p();
        RelativeLayout relativeLayout = (RelativeLayout) this.f61465d.findViewById(R.id.scan_parent_view);
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new a(relativeLayout));
        }
        this.f61466e = (TextureView) this.f61465d.findViewById(R.id.surfaceView);
        this.A = (ViewfinderView) this.f61465d.findViewById(R.id.viewfinderView);
        com.huawei.hms.scankit.b bVar = new com.huawei.hms.scankit.b(this.f61464c, this.f61466e, this.A, this.f61475n, this.f61463b, this.E, this.f61477p, "DefaultView", false);
        this.f61467f = bVar;
        bVar.b(this.f61480s);
        ImageView imageView = (ImageView) this.f61465d.findViewById(R.id.img_btn);
        this.B = imageView;
        imageView.setOnClickListener(new b());
        this.f61484w = (LinearLayout) this.f61465d.findViewById(R.id.flash_light_ll);
        this.C = (ImageView) this.f61465d.findViewById(R.id.ivFlash);
        c();
        this.C.setOnClickListener(new c());
        this.D = (TextView) this.f61465d.findViewById(R.id.flash_light_text);
        a((Point) null, true);
        j();
        k();
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.f61465d);
    }

    protected void i() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f61465d.findViewById(R.id.scan_parent_view);
        this.f61484w = new LinearLayout(this.f61464c);
        o4.d("Scankit", "initlight adJustLightLayout open");
        this.f61484w.setVisibility(0);
        this.f61484w.setOrientation(1);
        ViewGroup viewGroup = (ViewGroup) this.C.getParent();
        viewGroup.removeView(this.C);
        viewGroup.removeView(this.D);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i8.a(this.f61464c, 6);
        this.f61484w.setGravity(16);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i8.a(this.f61464c, bb.c.b.f30645g1), -1);
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        LinearLayout linearLayout = new LinearLayout(this.f61464c);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(i8.a(this.f61464c, 24), 0, i8.a(this.f61464c, 24), 0);
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        ((LinearLayout.LayoutParams) this.C.getLayoutParams()).setMargins(0, 0, 0, 0);
        linearLayout.addView(this.C);
        linearLayout.addView(this.D, layoutParams);
        this.f61484w.addView(linearLayout);
        relativeLayout.addView(this.f61484w, layoutParams2);
    }

    protected void j() {
        if (Locale.getDefault() == null || !w7.d()) {
            return;
        }
        TextView textView = (TextView) this.f61465d.findViewById(R.id.title_scan);
        ImageView imageView = (ImageView) this.f61465d.findViewById(R.id.back_img_in);
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(1, R.id.img_btn);
                layoutParams2.rightMargin = 200;
                textView.setLayoutParams(layoutParams);
            }
        }
        k();
    }

    protected void k() {
        ViewGroup.LayoutParams layoutParams = this.f61484w.getLayoutParams();
        Context context = this.f61464c;
        if (context == null || context.getResources() == null || this.f61464c.getResources().getDisplayMetrics() == null || !n() || !(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        ((FrameLayout.LayoutParams) layoutParams).bottomMargin = 150;
        this.f61484w.setLayoutParams(layoutParams);
    }

    protected int l() {
        int iM = m();
        Context context = this.f61464c;
        if (context == null || context.getResources() == null) {
            return iM;
        }
        try {
            int identifier = this.f61464c.getResources().getIdentifier("hw_multiwindow_height_of_drag_bar", "dimen", "androidhwext");
            return identifier > 0 ? this.f61464c.getResources().getDimensionPixelSize(identifier) : iM;
        } catch (Exception e10) {
            Log.e("IRemoteViewDelegateImpl", "getMultiWindowDragBarHeight exception: " + e10.getMessage());
            return iM;
        }
    }

    protected int m() {
        int identifier;
        Context context = this.f61464c;
        if (context == null || context.getResources() == null || (identifier = this.f61464c.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return this.f61464c.getResources().getDimensionPixelSize(identifier);
    }

    @Override // com.huawei.hms.scankit.e, android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
        com.huawei.hms.scankit.b bVar = this.f61467f;
        if (bVar.f61382i == null) {
            bVar.f61382i = this.f61466e;
        }
        bVar.f();
        o();
        SensorManager sensorManager = this.f61469h;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(IObjectWrapper iObjectWrapper) {
        this.f61470i = (View.OnClickListener) ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() throws RemoteException {
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() throws RemoteException {
    }
}
