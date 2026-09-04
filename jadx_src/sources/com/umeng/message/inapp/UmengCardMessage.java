package com.umeng.message.inapp;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.a;
import com.umeng.message.proguard.ai;
import com.umeng.message.proguard.bb;
import com.umeng.message.proguard.bd;
import com.umeng.message.proguard.f;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengCardMessage extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105606b = UmengCardMessage.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IUmengInAppMsgCloseCallback f105607a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f105608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private UInAppMessage f105609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f105610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f105611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewGroup f105612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f105614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private UInAppHandler f105617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f105618m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f105619n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f105620o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f105621p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f105622q = {"18", "16", "16"};

    static /* synthetic */ boolean a(UmengCardMessage umengCardMessage) {
        umengCardMessage.f105619n = true;
        return true;
    }

    static /* synthetic */ boolean e(UmengCardMessage umengCardMessage) {
        umengCardMessage.f105621p = true;
        return true;
    }

    static /* synthetic */ boolean f(UmengCardMessage umengCardMessage) {
        umengCardMessage.f105620o = true;
        return true;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f105612g != null) {
            RelativeLayout.LayoutParams layoutParams = configuration.orientation == 1 ? new RelativeLayout.LayoutParams(-1, -2) : new RelativeLayout.LayoutParams(-2, -1);
            int iA = bb.a(30.0f);
            int iA2 = bb.a(15.0f);
            layoutParams.setMargins(iA, iA2, iA, iA2);
            layoutParams.addRule(13);
            this.f105612g.setLayoutParams(layoutParams);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.NoTitleBar);
        setRetainInstance(true);
        try {
            this.f105608c = getActivity();
            Bundle arguments = getArguments();
            this.f105609d = new UInAppMessage(new JSONObject(arguments.getString("msg")));
            this.f105610e = arguments.getString(BasePuzzleInfo.PUZZLE_TYPE_LABEL);
            byte[] byteArray = arguments.getByteArray("bitmapByte");
            if (byteArray != null) {
                this.f105611f = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            this.f105617l = InAppMessageManager.getInstance(this.f105608c).getInAppHandler();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int i10 = this.f105609d.msg_type;
        if (i10 == 5 || i10 == 6) {
            String strA = InAppMessageManager.getInstance(this.f105608c).a("KEY_PLAIN_TEXT_SIZE", "");
            String[] strArrSplit = !TextUtils.isEmpty(strA) ? strA.split(Constants.ACCEPT_TIME_SEPARATOR_SP) : null;
            if (strArrSplit != null) {
                this.f105622q = strArrSplit;
            }
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Rect rect;
        RelativeLayout.LayoutParams layoutParams;
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height() - bb.a(65.0f);
            this.f105614i = iHeight;
            this.f105613h = (int) (((double) iHeight) * 1.2d);
            int iWidth = rect.width() - bb.a(70.0f);
            this.f105615j = iWidth;
            this.f105616k = (iWidth / 2) * 3;
        } else {
            rect = null;
        }
        int i10 = this.f105609d.msg_type;
        if (i10 == 2 || i10 == 3) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f105608c);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = this.f105609d.msg_type == 2 ? new RelativeLayout.LayoutParams(this.f105613h, this.f105614i) : new RelativeLayout.LayoutParams(-2, -1);
            }
            int iA = bb.a(30.0f);
            int iA2 = bb.a(15.0f);
            layoutParams.setMargins(iA, iA2, iA, iA2);
            layoutParams.addRule(13);
            FrameLayout frameLayout = new FrameLayout(this.f105608c);
            this.f105612g = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int iA3 = bb.a(12.0f);
            layoutParams2.setMargins(iA3, iA3, iA3, iA3);
            ImageView imageView = new ImageView(this.f105608c);
            imageView.setLayoutParams(layoutParams2);
            imageView.setAdjustViewBounds(true);
            imageView.setId(f.a());
            imageView.setImageBitmap(this.f105611f);
            this.f105612g.addView(imageView);
            int iA4 = bb.a(24.0f);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iA4, iA4, 5);
            bd bdVar = new bd(this.f105608c);
            bdVar.setLayoutParams(layoutParams3);
            this.f105612g.addView(bdVar);
            relativeLayout.addView(this.f105612g);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.a(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f105609d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f105617l.handleInAppMessage(UmengCardMessage.this.f105608c, UmengCardMessage.this.f105609d, 16);
                    UmengCardMessage.this.dismiss();
                }
            });
            bdVar.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.e(UmengCardMessage.this);
                    UmengCardMessage.this.dismiss();
                }
            });
            return relativeLayout;
        }
        if (i10 == 4) {
            View viewInflate = layoutInflater.inflate(a.a(a.a().f105663a, "umeng_custom_card_message"), viewGroup, false);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(a.a("umeng_card_message_image"));
            Button button = (Button) viewInflate.findViewById(a.a("umeng_card_message_ok"));
            Button button2 = (Button) viewInflate.findViewById(a.a("umeng_card_message_close"));
            imageView2.setImageBitmap(this.f105611f);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.a(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f105609d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f105617l.handleInAppMessage(UmengCardMessage.this.f105608c, UmengCardMessage.this.f105609d, 16);
                    UmengCardMessage.this.dismiss();
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.f(UmengCardMessage.this);
                    if (TextUtils.equals("none", UmengCardMessage.this.f105609d.action_type)) {
                        return;
                    }
                    UmengCardMessage.this.f105617l.handleInAppMessage(UmengCardMessage.this.f105608c, UmengCardMessage.this.f105609d, 19);
                    UmengCardMessage.this.dismiss();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UmengCardMessage.e(UmengCardMessage.this);
                    UmengCardMessage.this.dismiss();
                }
            });
            return viewInflate;
        }
        if ((i10 != 5 && i10 != 6) || rect == null) {
            return null;
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f105608c);
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout2.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            int iWidth2 = rect.width() - bb.a(70.0f);
            this.f105615j = iWidth2;
            if (this.f105609d.msg_type == 5) {
                this.f105616k = (iWidth2 / 6) * 5;
            } else {
                this.f105616k = (iWidth2 / 2) * 3;
            }
        } else {
            int iHeight2 = rect.height() - bb.a(65.0f);
            this.f105616k = iHeight2;
            this.f105615j = (iHeight2 / 5) * 6;
        }
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f105615j, this.f105616k);
        layoutParams4.addRule(13);
        LinearLayout linearLayout = new LinearLayout(this.f105608c);
        linearLayout.setLayoutParams(layoutParams4);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int iA5 = bb.a(20.0f);
        layoutParams5.setMargins(iA5, iA5, iA5, iA5);
        TextView textView = new TextView(this.f105608c);
        textView.setLayoutParams(layoutParams5);
        textView.setGravity(17);
        textView.setText(this.f105609d.title);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView.setTextSize(Integer.parseInt(this.f105622q[0]));
        textView.setTextColor(Color.parseColor("#000000"));
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams6.setMargins(iA5, 0, iA5, 0);
        layoutParams6.weight = 1.0f;
        ScrollView scrollView = new ScrollView(this.f105608c);
        scrollView.setLayoutParams(layoutParams6);
        scrollView.setScrollBarStyle(16777216);
        scrollView.setVerticalScrollBarEnabled(false);
        TextView textView2 = new TextView(this.f105608c);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setText(this.f105609d.content);
        textView2.setTextSize(Integer.parseInt(this.f105622q[1]));
        textView2.setTextColor(Color.parseColor("#000000"));
        scrollView.addView(textView2);
        linearLayout.addView(scrollView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(bb.a(1.0f), Color.parseColor("#D8D8D8"));
        gradientDrawable.setCornerRadius(20.0f);
        gradientDrawable.setColor(-1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, bb.a(35.0f));
        layoutParams7.setMargins(iA5, bb.a(30.0f), iA5, iA5);
        TextView textView3 = new TextView(this.f105608c);
        textView3.setLayoutParams(layoutParams7);
        textView3.setGravity(17);
        textView3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        textView3.setText(this.f105609d.button_text);
        textView3.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView3.setTextSize(Integer.parseInt(this.f105622q[2]));
        textView3.setTextColor(Color.parseColor("#000000"));
        textView3.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(textView3);
        relativeLayout2.addView(linearLayout);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengCardMessage.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UmengCardMessage.a(UmengCardMessage.this);
                UmengCardMessage.this.f105617l.handleInAppMessage(UmengCardMessage.this.f105608c, UmengCardMessage.this.f105609d, 18);
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout2;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ai aiVarA = ai.a(this.f105608c);
        UInAppMessage uInAppMessage = this.f105609d;
        aiVarA.a(uInAppMessage.msg_id, uInAppMessage.msg_type, 0, this.f105619n ? 1 : 0, 0, 0, this.f105621p ? 1 : 0, 0, this.f105620o ? 1 : 0);
        this.f105621p = false;
        this.f105619n = false;
        this.f105620o = false;
        this.f105618m = false;
        IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback = this.f105607a;
        if (iUmengInAppMsgCloseCallback != null) {
            iUmengInAppMsgCloseCallback.onClose();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f105618m) {
            ai aiVarA = ai.a(this.f105608c);
            UInAppMessage uInAppMessage = this.f105609d;
            aiVarA.a(uInAppMessage.msg_id, uInAppMessage.msg_type, 1, 0, 0, 0, 0, 0, 0);
        }
        this.f105618m = true;
    }
}
