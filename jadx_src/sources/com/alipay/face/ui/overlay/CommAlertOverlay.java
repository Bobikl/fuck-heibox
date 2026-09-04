package com.alipay.face.ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.fintech.base.R;

/* JADX INFO: loaded from: classes6.dex */
public class CommAlertOverlay extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f39012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39013c;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CommAlertOverlay.this.f39012b != null) {
                CommAlertOverlay.this.f39012b.onCancel();
                CommAlertOverlay.this.setVisibility(4);
            }
        }
    }

    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CommAlertOverlay.this.f39012b != null) {
                CommAlertOverlay.this.f39012b.a();
                CommAlertOverlay.this.setVisibility(4);
            }
        }
    }

    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CommAlertOverlay.this.f39012b != null) {
                CommAlertOverlay.this.f39012b.a();
                CommAlertOverlay.this.setVisibility(4);
            }
        }
    }

    public interface d {
        void a();

        void onCancel();
    }

    public CommAlertOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39012b = null;
        this.f39013c = true;
        LayoutInflater.from(context).inflate(R.layout.f39301a, this);
        View viewFindViewById = findViewById(R.id.f39295e);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new a());
        }
        View viewFindViewById2 = findViewById(R.id.f39296f);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new b());
        }
        View viewFindViewById3 = findViewById(R.id.f39297g);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new c());
        }
    }

    public void setButtonType(boolean z10) {
        View viewFindViewById = findViewById(R.id.f39293c);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z10 ? 4 : 0);
        }
        View viewFindViewById2 = findViewById(R.id.f39294d);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z10 ? 0 : 4);
        }
        this.f39013c = z10;
    }

    public void setCancelText(String str) {
        TextView textView = (TextView) findViewById(R.id.f39295e);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setCommAlertOverlayListener(d dVar) {
        this.f39012b = dVar;
    }

    public void setConfirmText(String str) {
        if (this.f39013c) {
            TextView textView = (TextView) findViewById(R.id.f39296f);
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.f39297g);
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public void setMessageText(String str) {
        TextView textView = (TextView) findViewById(R.id.f39298h);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(R.id.f39299i);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
