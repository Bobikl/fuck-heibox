package com.huawei.hms.scankit;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.scankit.drawable.ScanDrawable;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.w7;
import java.util.Locale;

/* JADX INFO: compiled from: IRemoteLocalViewDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class h extends i implements View.OnClickListener {
    private ScanDrawable I;
    private ImageView J;
    private ImageView K;
    private ImageView L;
    private ImageView M;
    private ImageView N;
    private RelativeLayout O;
    private LinearLayout P;
    private LinearLayout Q;
    private LinearLayout R;
    private LinearLayout S;
    private int T;
    private int U;
    private LinearLayout V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private LinearLayout f61494a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f61495b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f61496c0;

    /* JADX INFO: compiled from: IRemoteLocalViewDelegateImpl.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            Context context = h.this.f61464c;
            if (context == null) {
                return;
            }
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            if (w7.c((Activity) h.this.f61464c)) {
                return;
            }
            int width = ((Activity) h.this.f61464c).getWindow().getDecorView().getRootView().getWidth() - rect.right;
            if (!w7.d()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h.this.S.getLayoutParams();
                if (width != 0) {
                    int marginEnd = layoutParams.getMarginEnd();
                    h hVar = h.this;
                    if (marginEnd != i8.a(hVar.f61464c, hVar.T - 12)) {
                        h hVar2 = h.this;
                        layoutParams.setMarginEnd(i8.a(hVar2.f61464c, hVar2.T - 12));
                        return;
                    }
                    return;
                }
                int marginEnd2 = layoutParams.getMarginEnd();
                h hVar3 = h.this;
                if (marginEnd2 != i8.a(hVar3.f61464c, hVar3.T - 12) + i8.a(h.this.f61464c)) {
                    h hVar4 = h.this;
                    layoutParams.setMarginEnd(i8.a(hVar4.f61464c, hVar4.T - 12) + i8.a(h.this.f61464c));
                    return;
                }
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) h.this.O.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) h.this.f61494a0.getLayoutParams();
            if (width != 0) {
                int marginStart = layoutParams2.getMarginStart();
                h hVar5 = h.this;
                if (marginStart != i8.a(hVar5.f61464c, hVar5.T - 12)) {
                    h hVar6 = h.this;
                    layoutParams2.setMarginStart(i8.a(hVar6.f61464c, hVar6.T - 12));
                }
                int marginStart2 = layoutParams3.getMarginStart();
                h hVar7 = h.this;
                if (marginStart2 != i8.a(hVar7.f61464c, hVar7.T - 12)) {
                    h hVar8 = h.this;
                    layoutParams3.setMarginStart(i8.a(hVar8.f61464c, hVar8.T - 12));
                    return;
                }
                return;
            }
            int marginStart3 = layoutParams2.getMarginStart();
            h hVar9 = h.this;
            if (marginStart3 != i8.a(hVar9.f61464c, hVar9.T - 12) + i8.a(h.this.f61464c)) {
                h hVar10 = h.this;
                layoutParams2.setMarginStart(i8.a(hVar10.f61464c, hVar10.T - 12) + i8.a(h.this.f61464c));
            }
            int marginStart4 = layoutParams3.getMarginStart();
            h hVar11 = h.this;
            if (marginStart4 != i8.a(hVar11.f61464c, hVar11.T - 12) + i8.a(h.this.f61464c)) {
                h hVar12 = h.this;
                layoutParams3.setMarginStart(i8.a(hVar12.f61464c, hVar12.T - 12) + i8.a(h.this.f61464c));
            }
        }
    }

    public h(Context context, int i10, IObjectWrapper iObjectWrapper, boolean z10, boolean z11, int i11, boolean z12, boolean z13) {
        super(context, i10, iObjectWrapper, z10, z11);
        this.T = 24;
        this.U = i11;
        this.f61495b0 = z12;
        this.f61496c0 = z13;
    }

    private void q() {
        ((RelativeLayout.LayoutParams) this.P.getLayoutParams()).setMarginStart(i8.a(this.f61464c, this.T - 12));
        ((RelativeLayout.LayoutParams) this.Q.getLayoutParams()).setMarginEnd(i8.a(this.f61464c, this.T - 12));
        ((RelativeLayout.LayoutParams) this.R.getLayoutParams()).setMarginStart(i8.a(this.f61464c, this.T - 12));
        ((RelativeLayout.LayoutParams) this.S.getLayoutParams()).setMarginEnd(i8.a(this.f61464c, this.T - 12));
    }

    private void r() {
        Context context = this.f61464c;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    private void s() {
        this.f61465d.findViewById(R.id.scan_title_landscape).setVisibility(8);
        this.f61465d.findViewById(R.id.scan_title).setVisibility(0);
    }

    private void t() {
        int currentModeType = ((UiModeManager) ((Activity) this.f61464c).getSystemService("uimode")).getCurrentModeType();
        if (currentModeType == 3) {
            this.T = 32;
            return;
        }
        if (currentModeType == 4) {
            this.T = 48;
        } else if (currentModeType != 6) {
            this.T = 24;
        } else {
            this.T = 26;
        }
    }

    private void u() {
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = this.f61464c;
            Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (defaultDisplay.getWidth() < (w7.c((Activity) this.f61464c) ? point.x : point.y)) {
                s();
            } else {
                v();
            }
        }
    }

    private void v() {
        this.V.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
        layoutParams.setMargins(0, l(), 0, 0);
        this.O.setLayoutParams(layoutParams);
        this.f61465d.findViewById(R.id.scan_title_landscape).setVisibility(0);
        this.f61465d.findViewById(R.id.scan_title).setVisibility(8);
    }

    @Override // com.huawei.hms.scankit.i, com.huawei.hms.scankit.e
    protected ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f61464c : DynamicModuleInitializer.getContext(), false, false);
    }

    @Override // com.huawei.hms.scankit.i, com.huawei.hms.scankit.e
    protected void e() {
        super.e();
        this.f61467f.c(this.f61496c0);
        this.J = (ImageView) this.f61465d.findViewById(R.id.ivScan);
        this.K = (ImageView) this.f61465d.findViewById(R.id.back_img_in);
        this.L = (ImageView) this.f61465d.findViewById(R.id.img_btn);
        this.M = (ImageView) this.f61465d.findViewById(R.id.scankit_back_img_in_land);
        this.N = (ImageView) this.f61465d.findViewById(R.id.scankit_img_btn_in_land);
        this.O = (RelativeLayout) this.f61465d.findViewById(R.id.scan_title_landscape);
        this.P = (LinearLayout) this.f61465d.findViewById(R.id.back_layout);
        this.Q = (LinearLayout) this.f61465d.findViewById(R.id.gallery_Layout);
        this.R = (LinearLayout) this.f61465d.findViewById(R.id.back_layout_landscape);
        this.S = (LinearLayout) this.f61465d.findViewById(R.id.gallery_Layout_landscape);
        ProviderRemoteView providerRemoteView = this.f61465d;
        int i10 = R.id.scan_title_layout;
        this.V = (LinearLayout) providerRemoteView.findViewById(i10);
        this.W = (TextView) this.f61465d.findViewById(R.id.title_scan);
        this.X = (TextView) this.f61465d.findViewById(R.id.title_scan_level_two);
        this.Y = (TextView) this.f61465d.findViewById(R.id.scankit_title_scan_land);
        this.Z = (TextView) this.f61465d.findViewById(R.id.scankit_title_scan_land_level_two);
        this.f61494a0 = (LinearLayout) this.f61465d.findViewById(R.id.scanLayout);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.V.getLayoutParams();
        layoutParams.setMargins(0, i8.a(this.f61464c, 80) + w7.d(this.f61464c), 0, 0);
        layoutParams.addRule(6);
        this.V.setLayoutParams(layoutParams);
        this.V.bringToFront();
        this.V.setVisibility(0);
        t();
        q();
        if (this.U == 0) {
            TextView textView = this.W;
            int i11 = R.string.scankit_title_all;
            textView.setText(i11);
            TextView textView2 = this.W;
            textView2.setContentDescription(textView2.getResources().getString(i11));
            TextView textView3 = this.X;
            int i12 = R.string.scankit_title_all_level_two;
            textView3.setText(i12);
            this.Y.setText(i11);
            TextView textView4 = this.Y;
            textView4.setContentDescription(textView4.getResources().getString(i11));
            this.Z.setText(i12);
        } else {
            TextView textView5 = this.W;
            int i13 = R.string.scankit_title_qr;
            textView5.setText(i13);
            TextView textView6 = this.W;
            textView6.setContentDescription(textView6.getResources().getString(i13));
            TextView textView7 = this.X;
            int i14 = R.string.scankit_title_qr_level_two;
            textView7.setText(i14);
            this.Y.setText(i13);
            TextView textView8 = this.Y;
            textView8.setContentDescription(textView8.getResources().getString(i13));
            this.Z.setText(i14);
        }
        this.Z.bringToFront();
        try {
            ImageView imageView = this.J;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (i8.b(this.f61464c).x > i8.a(this.f61464c, bb.c.b.f30512a7)) {
                    layoutParams2.width = i8.b(this.f61464c).x / 2;
                } else {
                    layoutParams2.width = i8.b(this.f61464c).x;
                }
                this.J.setLayoutParams(layoutParams2);
                ScanDrawable scanDrawable = new ScanDrawable(this.f61464c.getResources());
                this.I = scanDrawable;
                this.J.setImageDrawable(scanDrawable);
            }
            if (!w7.j(this.f61464c)) {
                if (w7.c((Activity) this.f61464c)) {
                    s();
                } else {
                    u();
                }
                if (w7.f(this.f61464c) && !w7.b((Activity) this.f61464c) && !w7.h(this.f61464c)) {
                    if (w7.f()) {
                        u();
                    } else {
                        v();
                    }
                }
            }
            if (w7.f(this.f61464c)) {
                LinearLayout linearLayout = (LinearLayout) this.f61465d.findViewById(i10);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                if (w7.b((Activity) this.f61464c)) {
                    layoutParams3.setMargins(0, i8.a(this.f61464c, 80), 0, 0);
                    layoutParams3.addRule(10);
                } else if (!w7.h(this.f61464c)) {
                    if (w7.f()) {
                        layoutParams3.setMargins(0, i8.a(this.f61464c, 80), 0, 0);
                        layoutParams3.addRule(10);
                    } else {
                        layoutParams3.setMargins(0, i8.a(this.f61464c, 0), 0, 0);
                        layoutParams3.addRule(12);
                    }
                }
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.bringToFront();
            }
            if (!w7.c((Activity) this.f61464c) && w7.k(this.f61464c) && !w7.j(this.f61464c) && !w7.f(this.f61464c)) {
                if (Locale.getDefault() == null || !w7.d()) {
                    ((RelativeLayout.LayoutParams) this.S.getLayoutParams()).setMarginEnd(i8.a(this.f61464c, this.T - 12) + i8.a(this.f61464c));
                } else {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
                    layoutParams4.setMarginEnd(i8.a(this.f61464c, 0));
                    layoutParams4.setMarginStart(i8.a(this.f61464c, this.T - 12) + i8.a(this.f61464c));
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f61494a0.getLayoutParams();
                    layoutParams5.setMarginEnd(i8.a(this.f61464c, 0));
                    layoutParams5.setMarginStart(i8.a(this.f61464c, this.T - 12) + i8.a(this.f61464c));
                }
            }
            if (!w7.c((Activity) this.f61464c) && w7.i(this.f61464c) && this.f61481t && this.f61495b0) {
                i();
            }
        } catch (NullPointerException unused) {
            Log.e("scankitSDk", "initView: NullPoint");
        } catch (RuntimeException unused2) {
            Log.e("scankitSDk", "initView: Exception");
        }
        ((RelativeLayout) this.f61465d.findViewById(R.id.scan_parent_view)).getViewTreeObserver().addOnGlobalLayoutListener(new a());
        if (this.f61495b0) {
            return;
        }
        this.J.setVisibility(8);
    }

    @Override // com.huawei.hms.scankit.i
    protected void j() {
        if (Locale.getDefault() == null || !w7.d()) {
            return;
        }
        this.K = (ImageView) this.f61465d.findViewById(R.id.back_img_in);
        this.M = (ImageView) this.f61465d.findViewById(R.id.scankit_back_img_in_land);
        ImageView imageView = this.K;
        if (imageView != null) {
            int i10 = R.drawable.scankit_ic_back_mirroring;
            imageView.setImageResource(i10);
            this.M.setImageResource(i10);
        }
        k();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.back_layout) {
            r();
        }
        if (view.getId() == R.id.back_layout_landscape) {
            r();
        }
        if (view.getId() == R.id.back_img_in) {
            r();
        }
        if (view.getId() == R.id.scankit_back_img_in_land) {
            r();
        }
        if (view.getId() == R.id.gallery_Layout) {
            this.f61470i.onClick(view);
        }
        if (view.getId() == R.id.gallery_Layout_landscape) {
            this.f61470i.onClick(view);
        }
        if (view.getId() == R.id.scankit_img_btn_in_land) {
            this.f61470i.onClick(view);
        }
        if (view.getId() == R.id.img_btn) {
            this.f61470i.onClick(view);
        }
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
        super.onStart();
        if (this.f61495b0) {
            ScanDrawable scanDrawable = this.I;
            if (scanDrawable != null) {
                if (scanDrawable.isRunning()) {
                    return;
                }
                this.I.start();
            } else {
                ScanDrawable scanDrawable2 = new ScanDrawable(this.f61464c.getResources());
                this.I = scanDrawable2;
                this.J.setImageDrawable(scanDrawable2);
                this.I.start();
            }
        }
    }

    @Override // com.huawei.hms.scankit.e, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
        ScanDrawable scanDrawable;
        super.onStop();
        if (this.f61495b0 && (scanDrawable = this.I) != null && scanDrawable.isRunning()) {
            this.I.stop();
        }
    }
}
