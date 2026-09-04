package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import com.huawei.android.hms.push.R;
import com.huawei.hms.push.r;

/* JADX INFO: loaded from: classes7.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        r.a(this, getIntent());
        finish();
    }
}
