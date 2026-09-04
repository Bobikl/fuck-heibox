package com.tencent.liteav.sdkcommon;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f99815c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ArrayAdapter<String> f99817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    WindowManager f99818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f99819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    TextView f99820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    TextView f99821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Spinner f99822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ScrollView f99823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f99824l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final a f99827o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final DisplayMetrics f99813a = new DisplayMetrics();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final WindowManager.LayoutParams f99814b = new WindowManager.LayoutParams();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f99828p = y1.a.f141526c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f99829q = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f99825m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f99826n = 1920;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f99816d = new Handler(Looper.getMainLooper());

    public interface a {
        void a(int i10);
    }

    public final class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f99831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f99832c;

        private b() {
        }

        /* synthetic */ b(g gVar, byte b10) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f99831b = (int) motionEvent.getRawX();
                this.f99832c = (int) motionEvent.getRawY();
            } else if (action == 2) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int i10 = rawX - this.f99831b;
                int i11 = rawY - this.f99832c;
                WindowManager.LayoutParams layoutParams = g.this.f99814b;
                int i12 = layoutParams.x + i10;
                layoutParams.x = i12;
                layoutParams.y += i11;
                this.f99831b = rawX;
                this.f99832c = rawY;
                layoutParams.x = Math.max(i12, 0);
                WindowManager.LayoutParams layoutParams2 = g.this.f99814b;
                layoutParams2.y = Math.max(layoutParams2.y, 0);
                g gVar = g.this;
                WindowManager.LayoutParams layoutParams3 = gVar.f99814b;
                int i13 = layoutParams3.x;
                DisplayMetrics displayMetrics = gVar.f99813a;
                int i14 = displayMetrics.widthPixels;
                if (i13 + i14 > i14) {
                    layoutParams3.width = i14 - i13;
                } else {
                    layoutParams3.width = i14;
                }
                int i15 = gVar.f99826n;
                layoutParams3.height = i15;
                if (gVar.f99825m) {
                    layoutParams3.height = i15 / 2;
                }
                int i16 = layoutParams3.y;
                int i17 = layoutParams3.height + i16;
                int i18 = displayMetrics.heightPixels;
                if (i17 > i18) {
                    layoutParams3.height = i18 - i16;
                }
                ViewGroup.LayoutParams layoutParams4 = gVar.f99823k.getLayoutParams();
                layoutParams4.height = g.this.b();
                g.this.f99823k.setLayoutParams(layoutParams4);
                g gVar2 = g.this;
                gVar2.f99818f.updateViewLayout(view, gVar2.f99814b);
            }
            view.performClick();
            return false;
        }
    }

    public final class c implements AdapterView.OnItemSelectedListener {
        private c() {
        }

        /* synthetic */ c(g gVar, byte b10) {
            this();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (view == null) {
                return;
            }
            ((TextView) view).setTextColor(y1.a.f141526c);
            g gVar = g.this;
            gVar.f99824l = gVar.f99817e.getItem(i10);
            g.this.f99827o.a(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public g(Context context, a aVar) {
        this.f99815c = context;
        this.f99827o = aVar;
        this.f99817e = new ArrayAdapter<>(context, R.layout.simple_spinner_item);
    }

    final int a(int i10) {
        return (int) ((i10 * this.f99815c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    final void a() {
        TextView textView;
        Spinner spinner = this.f99822j;
        if (spinner == null || (textView = (TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) == null) {
            return;
        }
        textView.setTextColor(y1.a.f141526c);
    }

    public final void a(String str) {
        TextView textView = this.f99821i;
        if (textView != null) {
            textView.setText(str);
        }
        this.f99816d.post(h.a(this));
    }

    public final void a(boolean z10) {
        if (z10 == this.f99829q) {
            return;
        }
        if (z10) {
            this.f99818f.addView(this.f99819g, this.f99814b);
        } else {
            this.f99818f.removeView(this.f99819g);
        }
        this.f99829q = z10;
    }

    final int b() {
        return Math.max((this.f99814b.height - a(bb.c.b.f31007w1)) - a(20), 0);
    }

    public final void b(String str) {
        TextView textView = this.f99820h;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
