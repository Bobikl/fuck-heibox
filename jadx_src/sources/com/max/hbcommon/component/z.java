package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: HeyBoxPopupMenuComponent.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class z implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, bb.c.d.f31252g9, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "$context");
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj.setDesc(context.getResources().getString(R.string.friend_code_hide));
        keyDescObj2.setDesc(context.getResources().getString(R.string.friend_code_show));
        keyDescObj.setKey("0");
        keyDescObj2.setKey("1");
        keyDescObj.setChecked(true);
        arrayList.add(keyDescObj);
        arrayList.add(keyDescObj2);
        new HeyBoxPopupMenu(context, arrayList).show();
    }

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d final Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31229f9, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setPadding(50, 30, 50, 30);
        textView.setText("点击打开弹窗");
        textView.setBackgroundResource(R.drawable.text_primary_5dp);
        textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.g(context, view);
            }
        });
        return textView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/28/8f7c17e0f555ae17f4b8298839b177d9.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "HeyBoxPopupMenu";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65479f;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "ActionSheets/CheckItem";
    }
}
