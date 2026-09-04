package com.max.hbcommon.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bb.c;
import com.max.hbcommon.R;
import com.max.hbcommon.base.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class GameStoreAgreementActivity extends BaseActivity {
    public static final int P = 1;
    public static final int Q = 2;
    private static final String R = "title";
    private static final String S = "content";
    private static final String T = "need_confirm";
    public static ChangeQuickRedirect changeQuickRedirect;
    TextView L;
    View M;
    TextView N;
    TextView O;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.b.er, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) GameStoreAgreementActivity.this).f66601b.setResult(1);
            GameStoreAgreementActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.b.fr, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) GameStoreAgreementActivity.this).f66601b.setResult(2);
            GameStoreAgreementActivity.this.finish();
        }
    }

    public static Intent O1(Context context, String str, String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.b.cr, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreAgreementActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("content", str2);
        intent.putExtra(T, z10);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.dr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_agreement);
        this.L = (TextView) findViewById(R.id.tv_content);
        this.M = findViewById(R.id.vg_button_panel);
        this.N = (TextView) findViewById(R.id.tv_negative_button);
        this.O = (TextView) findViewById(R.id.tv_positive_button);
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra("content");
        boolean booleanExtra = getIntent().getBooleanExtra(T, false);
        this.f66616q.setTitle(stringExtra);
        this.f66617r.setVisibility(0);
        this.L.setText(stringExtra2);
        if (!booleanExtra) {
            this.M.setVisibility(8);
            return;
        }
        this.M.setVisibility(0);
        this.N.setOnClickListener(new a());
        this.O.setOnClickListener(new b());
    }
}
