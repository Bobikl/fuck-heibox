package com.umeng.socialize.editorpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ShareActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f106204c = "ShareActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f106205d = 140;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ImageView f106206a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f106211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ResContainer f106212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EditText f106213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f106214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f106215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f106216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SHARE_MEDIA f106217n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f106219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f106220q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f106208e = "7.3.2";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f106218o = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextWatcher f106207b = new TextWatcher() { // from class: com.umeng.socialize.editorpage.ShareActivity.1
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ShareActivity shareActivity = ShareActivity.this;
            shareActivity.f106216m = shareActivity.e();
        }
    };

    private SHARE_MEDIA a(String str) {
        if (str.equals("DOUBAN")) {
            return SHARE_MEDIA.DOUBAN;
        }
        if (str.equals("TWITTER")) {
            return SHARE_MEDIA.TWITTER;
        }
        return str.equals("LINKEDIN") ? SHARE_MEDIA.LINKEDIN : SHARE_MEDIA.SINA;
    }

    private String b(String str) {
        if (str.equals("TENCENT")) {
            return getResources().getString(this.f106212i.string("umeng_socialize_sharetotencent"));
        }
        if (str.equals("RENREN")) {
            return getResources().getString(this.f106212i.string("umeng_socialize_sharetorenren"));
        }
        if (str.equals("DOUBAN")) {
            return getResources().getString(this.f106212i.string("umeng_socialize_sharetodouban"));
        }
        if (str.equals("TWITTER")) {
            return getResources().getString(this.f106212i.string("umeng_socialize_sharetotwitter"));
        }
        return str.equals("LINKEDIN") ? getResources().getString(this.f106212i.string("umeng_socialize_sharetolinkin")) : getResources().getString(this.f106212i.string("umeng_socialize_sharetosina"));
    }

    private void b() {
        this.f106213j = (EditText) findViewById(this.f106212i.id("umeng_socialize_share_edittext"));
        if (!TextUtils.isEmpty(this.f106209f)) {
            this.f106213j.setText(this.f106209f);
            this.f106213j.setSelection(this.f106209f.length());
        }
        this.f106220q = (TextView) findViewById(this.f106212i.id("umeng_web_title"));
        this.f106206a = (ImageView) findViewById(this.f106212i.id("umeng_share_icon"));
        if (this.f106211h == null) {
            if (TextUtils.isEmpty(this.f106210g)) {
                return;
            }
            this.f106206a.setImageResource(ResContainer.getResourceId(this.f106215l, "drawable", "umeng_socialize_share_web"));
            this.f106220q.setVisibility(0);
            this.f106220q.setText(this.f106210g);
            return;
        }
        findViewById(this.f106212i.id("umeng_socialize_share_bottom_area")).setVisibility(0);
        ImageView imageView = (ImageView) findViewById(this.f106212i.id("umeng_share_icon"));
        this.f106206a = imageView;
        imageView.setVisibility(0);
        if (this.f106211h.equals("video")) {
            this.f106206a.setImageResource(ResContainer.getResourceId(this.f106215l, "drawable", "umeng_socialize_share_video"));
        } else if (this.f106211h.equals("music")) {
            this.f106206a.setImageResource(ResContainer.getResourceId(this.f106215l, "drawable", "umeng_socialize_share_music"));
        } else if (this.f106211h.equals("web")) {
            this.f106206a.setImageResource(ResContainer.getResourceId(this.f106215l, "drawable", "umeng_socialize_share_web"));
        } else {
            this.f106206a.setImageURI(Uri.fromFile(new File(this.f106211h)));
        }
        if (!TextUtils.isEmpty(this.f106210g)) {
            this.f106220q.setVisibility(0);
            this.f106220q.setText(this.f106210g);
        }
        findViewById(this.f106212i.id("root")).setBackgroundColor(-1);
    }

    private void c() {
        SHARE_MEDIA share_media;
        String string = this.f106213j.getText().toString();
        if (TextUtils.isEmpty(string.trim()) && this.f106217n == SHARE_MEDIA.SINA && (TextUtils.isEmpty(this.f106211h) || this.f106211h.equals("web") || this.f106211h.equals("video") || this.f106211h.equals("music"))) {
            Toast.makeText(this.f106215l, UmengText.SHARE.CONTEXT_EMPTY, 0).show();
            return;
        }
        if (SocializeUtils.countContentLength(string) <= f106205d || (share_media = this.f106217n) == SHARE_MEDIA.TWITTER || share_media == SHARE_MEDIA.LINKEDIN) {
            if (this.f106216m && this.f106217n != SHARE_MEDIA.TWITTER) {
                Toast.makeText(this.f106215l, UmengText.SHARE.CONTEXT_LONG, 0).show();
                return;
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString(SocializeConstants.KEY_TEXT, string);
            bundle.putString("pic", this.f106211h);
            intent.putExtras(bundle);
            setResult(-1, intent);
            a();
        }
    }

    private void d() {
        this.f106211h = null;
        findViewById(this.f106212i.id("root")).setBackgroundColor(Color.parseColor("#D4E0E5"));
        findViewById(this.f106212i.id("umeng_socialize_share_bottom_area")).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        int iCountContentLength = f106205d - SocializeUtils.countContentLength(this.f106213j.getText().toString());
        this.f106214k.setText(SocializeUtils.countContentLength(this.f106213j.getText().toString()) + "/" + f106205d);
        return iCountContentLength < 0;
    }

    protected void a() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!SocializeConstants.BACKKEY_COMPLETE_CLOSE || keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.umeng.socialize.editorpage.ShareActivity.2
            @Override // java.lang.Runnable
            public void run() {
                ShareActivity.this.setResult(1000);
                ShareActivity.this.finish();
            }
        }, 400L);
        return true;
    }

    public void onCancel(View view) {
        setResult(1000);
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == this.f106212i.id("umeng_back")) {
            onCancel(view);
        } else if (id2 == this.f106212i.id("umeng_share_btn")) {
            c();
        } else if (id2 == this.f106212i.id("umeng_del")) {
            d();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f106212i = ResContainer.get(this);
        this.f106218o = SocializeUtils.isFloatWindowStyle(this);
        super.onCreate(bundle);
        this.f106215l = this;
        setContentView(this.f106212i.layout("umeng_socialize_share"));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.softInputMode = 32;
        if (this.f106218o) {
            int[] floatWindowSize = SocializeUtils.getFloatWindowSize(this.f106215l);
            attributes.width = floatWindowSize[0];
            attributes.height = floatWindowSize[1];
        }
        getWindow().setAttributes(attributes);
        SLog.E(UmengText.SHARE.SHAREVIEWV + this.f106208e);
        Bundle extras = getIntent().getExtras();
        this.f106217n = a(extras.getString(SocializeConstants.KEY_PLATFORM));
        f106205d = 140;
        this.f106209f = extras.getString(SocializeConstants.KEY_TEXT);
        this.f106211h = extras.getString("pic");
        this.f106210g = extras.getString("title");
        b();
        this.f106219p = (ImageView) findViewById(this.f106212i.id("umeng_del"));
        this.f106213j.addTextChangedListener(this.f106207b);
        ((TextView) findViewById(this.f106212i.id("umeng_title"))).setText(b(extras.getString(SocializeConstants.KEY_PLATFORM)));
        findViewById(this.f106212i.id("umeng_back")).setOnClickListener(this);
        findViewById(this.f106212i.id("umeng_share_btn")).setOnClickListener(this);
        this.f106219p.setOnClickListener(this);
        this.f106214k = (TextView) findViewById(this.f106212i.id("umeng_socialize_share_word_num"));
        this.f106216m = e();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && keyEvent.getRepeatCount() == 0) {
            setResult(1000);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f106213j.requestFocus();
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
