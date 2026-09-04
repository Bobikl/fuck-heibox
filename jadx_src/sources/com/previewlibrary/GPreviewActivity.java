package com.previewlibrary;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.previewlibrary.enitity.IThumbViewInfo;
import com.previewlibrary.wight.BezierBannerView;
import com.previewlibrary.wight.PhotoViewPager;
import com.previewlibrary.wight.SmoothImageView;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.PushClientConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GPreviewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f96287k = "com.previewlibrary.GPreviewActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<IThumbViewInfo> f96289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f96290d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PhotoViewPager f96292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f96293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BezierBannerView f96294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private GPreviewBuilder.IndicatorType f96295i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f96288b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.previewlibrary.view.a> f96291e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f96296j = true;

    public class a implements ViewPager.i {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (GPreviewActivity.this.f96293g != null) {
                GPreviewActivity.this.f96293g.setText(GPreviewActivity.this.getString(R.string.string_count, Integer.valueOf(i10 + 1), Integer.valueOf(GPreviewActivity.this.f96289c.size())));
            }
            GPreviewActivity gPreviewActivity = GPreviewActivity.this;
            gPreviewActivity.f96290d = i10;
            gPreviewActivity.f96292f.setCurrentItem(GPreviewActivity.this.f96290d, true);
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GPreviewActivity.this.f96292f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (GPreviewActivity.this.f96291e != null) {
                GPreviewActivity gPreviewActivity = GPreviewActivity.this;
                if (gPreviewActivity.f96290d < gPreviewActivity.f96291e.size()) {
                    ((com.previewlibrary.view.a) GPreviewActivity.this.f96291e.get(GPreviewActivity.this.f96290d)).S3();
                }
            }
        }
    }

    public class c implements SmoothImageView.j {
        c() {
        }

        @Override // com.previewlibrary.wight.SmoothImageView.j
        public void a(SmoothImageView.Status status) {
            GPreviewActivity.this.T0().setEnabled(true);
            GPreviewActivity.this.R0();
        }
    }

    public class d extends n0 {
        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            if (GPreviewActivity.this.f96291e == null) {
                return 0;
            }
            return GPreviewActivity.this.f96291e.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            return (Fragment) GPreviewActivity.this.f96291e.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        finish();
        overridePendingTransition(0, 0);
    }

    private void V0() {
        this.f96289c = getIntent().getParcelableArrayListExtra("imagePaths");
        this.f96290d = getIntent().getIntExtra(CommonNetImpl.POSITION, -1);
        this.f96295i = (GPreviewBuilder.IndicatorType) getIntent().getSerializableExtra("type");
        this.f96296j = getIntent().getBooleanExtra("isShow", true);
        int intExtra = getIntent().getIntExtra("duration", 300);
        boolean booleanExtra = getIntent().getBooleanExtra("isFullscreen", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("isScale", false);
        SmoothImageView.setFullscreen(booleanExtra);
        SmoothImageView.setIsScale(booleanExtra2);
        if (booleanExtra) {
            setTheme(android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            U0(this.f96289c, this.f96290d, (Class) getIntent().getSerializableExtra(PushClientConstants.TAG_CLASS_NAME));
        } catch (Exception unused) {
            U0(this.f96289c, this.f96290d, com.previewlibrary.view.a.class);
        }
    }

    @SuppressLint({"StringFormatMatches"})
    private void W0() {
        this.f96292f = (PhotoViewPager) findViewById(R.id.viewPager);
        this.f96292f.setAdapter(new d(getSupportFragmentManager()));
        this.f96292f.setCurrentItem(this.f96290d);
        this.f96292f.setOffscreenPageLimit(3);
        this.f96294h = (BezierBannerView) findViewById(R.id.bezierBannerView);
        TextView textView = (TextView) findViewById(R.id.ltAddDot);
        this.f96293g = textView;
        if (this.f96295i == GPreviewBuilder.IndicatorType.Dot) {
            this.f96294h.setVisibility(0);
            this.f96294h.b(this.f96292f);
        } else {
            textView.setVisibility(0);
            this.f96293g.setText(getString(R.string.string_count, Integer.valueOf(this.f96290d + 1), Integer.valueOf(this.f96289c.size())));
            this.f96292f.c(new a());
        }
        if (this.f96291e.size() == 1 && !this.f96296j) {
            this.f96294h.setVisibility(8);
            this.f96293g.setVisibility(8);
        }
        this.f96292f.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public List<com.previewlibrary.view.a> S0() {
        return this.f96291e;
    }

    public PhotoViewPager T0() {
        return this.f96292f;
    }

    protected void U0(List<IThumbViewInfo> list, int i10, Class<? extends com.previewlibrary.view.a> cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            this.f96291e.add(com.previewlibrary.view.a.P3(cls, list.get(i11), i10 == i11, getIntent().getBooleanExtra("isSingleFling", false), getIntent().getBooleanExtra("isDrag", false), getIntent().getFloatExtra("sensitivity", 0.5f)));
            i11++;
        }
    }

    public int X0() {
        return 0;
    }

    public void Z0() {
        if (this.f96288b) {
            return;
        }
        T0().setEnabled(false);
        this.f96288b = true;
        int currentItem = this.f96292f.getCurrentItem();
        if (currentItem >= this.f96289c.size()) {
            R0();
            return;
        }
        com.previewlibrary.view.a aVar = this.f96291e.get(currentItem);
        TextView textView = this.f96293g;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f96294h.setVisibility(8);
        }
        aVar.L3(0);
        aVar.T3(new c());
    }

    @Override // android.app.Activity
    public void finish() {
        com.previewlibrary.view.a.f96341n = null;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f96288b = false;
        Z0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @i
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        V0();
        if (X0() == 0) {
            setContentView(R.layout.activity_image_preview_photo);
        } else {
            setContentView(X0());
        }
        W0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.previewlibrary.b.a().b().c(this);
        PhotoViewPager photoViewPager = this.f96292f;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f96292f.h();
            this.f96292f.removeAllViews();
            this.f96292f = null;
        }
        List<com.previewlibrary.view.a> list = this.f96291e;
        if (list != null) {
            list.clear();
            this.f96291e = null;
        }
        List<IThumbViewInfo> list2 = this.f96289c;
        if (list2 != null) {
            list2.clear();
            this.f96289c = null;
        }
        super.onDestroy();
    }
}
