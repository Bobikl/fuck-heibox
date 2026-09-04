package com.max.xiaoheihe.module.account;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class LoginDialogActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23260, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.I1(LoginDialogActivity.this);
            LoginDialogActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23261, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            LoginDialogActivity.this.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 23259, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.dialog_activity_login);
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(17);
        TextView textView = (TextView) findViewById(R.id.content);
        Button button = (Button) findViewById(R.id.positiveButton);
        Button button2 = (Button) findViewById(R.id.negativeButton);
        textView.setText(com.max.xiaoheihe.utils.d.n0(R.string.need_login_to_use));
        button.setText("去登录");
        button2.setText("取消");
        button.setOnClickListener(new a());
        button2.setOnClickListener(new b());
    }
}
