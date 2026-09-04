package com.max.hbcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CheckUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CheckUtil.java */
    public class a implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f68211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f68214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f68215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImageView f68216h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ EditText f68217i;

        a(int i10, boolean z10, ImageView imageView, EditText editText) {
            this.f68214f = i10;
            this.f68215g = z10;
            this.f68216h = imageView;
            this.f68217i = editText;
            this.f68210b = i10;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.f.f32180c0, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f68215g && this.f68216h != null) {
                if (editable.length() > 0) {
                    this.f68216h.setVisibility(0);
                } else {
                    this.f68216h.setVisibility(8);
                }
            }
            this.f68212d = this.f68217i.getSelectionStart();
            this.f68213e = this.f68217i.getSelectionEnd();
            int length = this.f68211c.length();
            int i10 = this.f68210b;
            if (length > i10) {
                editable.delete(i10, this.f68211c.length());
                int i11 = this.f68213e;
                int i12 = this.f68210b;
                if (i11 >= i12) {
                    i11 = i12;
                }
                this.f68217i.setText(editable);
                this.f68217i.setSelection(i11);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f68211c = charSequence;
        }
    }

    /* JADX INFO: compiled from: CheckUtil.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f68218b;

        b(EditText editText) {
            this.f68218b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32204d0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68218b.requestFocus();
            this.f68218b.setText("");
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CheckUtil.java */
    public class C0554c implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f68220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f68222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f68223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImageView f68224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ EditText f68225h;

        C0554c(int i10, boolean z10, ImageView imageView, EditText editText) {
            this.f68222e = i10;
            this.f68223f = z10;
            this.f68224g = imageView;
            this.f68225h = editText;
            this.f68219b = i10;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.f.f32227e0, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f68223f) {
                if (editable.length() > 0) {
                    this.f68224g.setVisibility(0);
                } else {
                    this.f68224g.setVisibility(8);
                }
            }
            if (Pattern.compile("[a-zA-Z']{1,50}").matcher(editable.toString()).matches()) {
                this.f68220c = this.f68225h.getSelectionStart();
                this.f68221d = this.f68225h.getSelectionEnd();
                if (editable.length() > 50) {
                    editable.delete(this.f68220c - 1, this.f68221d);
                    int i10 = this.f68221d;
                    this.f68225h.setText(editable);
                    this.f68225h.setSelection(i10);
                    return;
                }
                return;
            }
            this.f68220c = this.f68225h.getSelectionStart();
            this.f68221d = this.f68225h.getSelectionEnd();
            if (editable.length() > this.f68219b) {
                editable.delete(this.f68220c - 1, this.f68221d);
                int i11 = this.f68221d;
                this.f68225h.setText(editable);
                this.f68225h.setSelection(i11);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: CheckUtil.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f68226b;

        d(EditText editText) {
            this.f68226b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32250f0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68226b.requestFocus();
            this.f68226b.setText("");
        }
    }

    /* JADX INFO: compiled from: CheckUtil.java */
    public class e implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f68228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f68231f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImageView f68232g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImageView f68233h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ EditText f68234i;

        e(int i10, ImageView imageView, ImageView imageView2, EditText editText) {
            this.f68231f = i10;
            this.f68232g = imageView;
            this.f68233h = imageView2;
            this.f68234i = editText;
            this.f68227b = i10;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.f.f32273g0, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable.length() > 0) {
                this.f68232g.setVisibility(8);
                this.f68233h.setVisibility(0);
            } else {
                this.f68232g.setVisibility(0);
                this.f68233h.setVisibility(8);
            }
            this.f68229d = this.f68234i.getSelectionStart();
            int selectionEnd = this.f68234i.getSelectionEnd();
            this.f68230e = selectionEnd;
            if (this.f68229d < 1) {
                return;
            }
            this.f68234i.setSelection(selectionEnd);
            if (this.f68228c.length() > this.f68227b) {
                editable.delete(this.f68229d, this.f68230e);
                int i10 = this.f68230e;
                this.f68234i.setText(editable);
                this.f68234i.setSelection(i10);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f68228c = charSequence;
        }
    }

    /* JADX INFO: compiled from: CheckUtil.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f68235b;

        f(EditText editText) {
            this.f68235b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32296h0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68235b.requestFocus();
            this.f68235b.setText("");
        }
    }

    public static boolean A(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32700z, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str == null || x(str);
    }

    public static boolean B(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.O, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (u(str)) {
            return false;
        }
        if (TextUtils.isDigitsOnly(str) && str.length() == 11) {
            String strSubstring = str.substring(0, 2);
            if (strSubstring.equals("13") || strSubstring.equals("14") || strSubstring.equals("15") || strSubstring.equals("16") || strSubstring.equals("17") || strSubstring.equals("18") || strSubstring.equals("19")) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.f32134a0, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null && str2 != null) {
            return false;
        }
        if (str == null || str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static boolean D(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.P, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!u(str) && str.length() > 9 && str.startsWith("0")) {
            return !str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER) || str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER) == 3 || str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER) == 4;
        }
        return false;
    }

    public static void E(Context context, EditText editText, String str) {
        if (PatchProxy.proxy(new Object[]{context, editText, str}, null, changeQuickRedirect, true, bb.c.f.I, new Class[]{Context.class, EditText.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = context.getResources().getDrawable(R.drawable.seterror_icon);
        drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        editText.setTypeface(Typeface.SANS_SERIF);
        editText.setError(str, drawable);
    }

    public static String F(String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32634w, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return "";
        }
        int length = str.length();
        while (i10 < length && (str.charAt(i10) == ' ' || str.charAt(i10) == 12288)) {
            i10++;
        }
        while (i10 < length) {
            int i11 = length - 1;
            if (str.charAt(i11) != ' ' && str.charAt(i11) != 12288) {
                break;
            }
            length--;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    public static boolean G(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.W, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        HashSet hashSet = new HashSet();
        char[] charArray = str.toCharArray();
        if (charArray.length > 6) {
            return false;
        }
        for (char c10 : charArray) {
            hashSet.add(String.valueOf(c10));
        }
        return hashSet.size() <= 1 || str.equals("112233") || str.equals("123123") || str.equals("123321") || str.equals("123456") || str.equals("654321") || str.equals("abcdef") || str.equals("abcabc");
    }

    public static boolean a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.Y, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Pattern.compile(".*\\d+.*").matcher(str).matches();
    }

    public static String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.N, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (c10 == 12288) {
                charArray[i10] = ' ';
            } else if (c10 > 65280 && c10 < 65375) {
                charArray[i10] = (char) (c10 - 65248);
            }
        }
        return new String(charArray);
    }

    public static void c(EditText editText, ImageView imageView, ImageView imageView2, int i10) {
        if (PatchProxy.proxy(new Object[]{editText, imageView, imageView2, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.M, new Class[]{EditText.class, ImageView.class, ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        editText.addTextChangedListener(new e(i10, imageView2, imageView, editText));
        imageView.setOnClickListener(new f(editText));
    }

    public static void d(EditText editText, ImageView imageView, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{editText, imageView, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.K, new Class[]{EditText.class, ImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        editText.addTextChangedListener(new a(i10, z10, imageView, editText));
        if (imageView != null) {
            imageView.setOnClickListener(new b(editText));
        }
    }

    public static void e(EditText editText, ImageView imageView, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{editText, imageView, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.L, new Class[]{EditText.class, ImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        editText.addTextChangedListener(new C0554c(i10, z10, imageView, editText));
        imageView.setOnClickListener(new d(editText));
    }

    public static boolean f(Activity activity, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, str, str2, str3}, null, changeQuickRedirect, true, bb.c.f.J, new Class[]{Activity.class, String.class, String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str.compareTo(str2) >= 0) {
            return false;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(str3);
        return true;
    }

    public static boolean g(Activity activity, EditText editText, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, editText, str}, null, changeQuickRedirect, true, bb.c.f.B, new Class[]{Activity.class, EditText.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!u(editText.getText().toString().trim())) {
            return false;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(str);
        editText.requestFocus();
        return true;
    }

    public static boolean h(Activity activity, EditText editText, int i10, String str, boolean z10) {
        Object[] objArr = {activity, editText, new Integer(i10), str, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.D, new Class[]{Activity.class, EditText.class, Integer.TYPE, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int length = editText.getText().toString().trim().length();
        if (length >= i10) {
            return false;
        }
        if (z10) {
            E(activity, editText, str);
        }
        editText.requestFocus();
        editText.setSelection(length);
        return true;
    }

    public static boolean i(Activity activity, EditText editText, int i10, int i11, String str, boolean z10) {
        Object[] objArr = {activity, editText, new Integer(i10), new Integer(i11), str, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.F, new Class[]{Activity.class, EditText.class, cls, cls, String.class, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int length = editText.getText().toString().trim().length();
        if (length >= i10 && length <= i11) {
            return false;
        }
        if (z10) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(str);
        }
        editText.requestFocus();
        editText.setSelection(length);
        return true;
    }

    public static boolean j(Activity activity, EditText editText, int i10, String str, boolean z10) {
        Object[] objArr = {activity, editText, new Integer(i10), str, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.E, new Class[]{Activity.class, EditText.class, Integer.TYPE, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int length = editText.getText().toString().trim().length();
        if (length >= i10) {
            return false;
        }
        if (z10) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(str);
        }
        editText.requestFocus();
        editText.setSelection(length);
        return true;
    }

    public static boolean k(EditText editText, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{editText, str}, null, changeQuickRedirect, true, bb.c.f.C, new Class[]{EditText.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!u(editText.getText().toString().trim())) {
            return false;
        }
        com.max.hbutils.utils.c.f(str);
        editText.requestFocus();
        return true;
    }

    public static boolean l(Activity activity, EditText editText, boolean z10) {
        Object[] objArr = {activity, editText, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.G, new Class[]{Activity.class, EditText.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zB = B(editText.getText().toString());
        if (!zB) {
            if (z10) {
                E(activity, editText, activity.getString(R.string.input_right_phonenum));
            }
            editText.requestFocus();
        }
        return zB;
    }

    public static boolean m(Activity activity, EditText editText, boolean z10) {
        Object[] objArr = {activity, editText, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.H, new Class[]{Activity.class, EditText.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zB = B(editText.getText().toString());
        if (!zB) {
            if (z10) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(activity.getString(R.string.input_right_phonenum));
            }
            editText.requestFocus();
        }
        return zB;
    }

    public static boolean n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.Z, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (u(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (t(Character.codePointAt(str, i10))) {
                return true;
            }
        }
        return false;
    }

    public static int o(List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.f.X, new Class[]{List.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static int p(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.f.R, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (z(context, false) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 0) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
        }
        return -99;
    }

    public static Calendar q(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.f.S, new Class[]{Long.TYPE}, Calendar.class);
        if (patchProxyResultProxy.isSupported) {
            return (Calendar) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return calendar;
    }

    public static boolean r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.V, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !TextUtils.isEmpty(str) && str.startsWith(com.meituan.robust.Constants.ARRAY_TYPE) && str.endsWith("]");
    }

    public static boolean s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.U, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !TextUtils.isEmpty(str) && str.startsWith("{") && str.endsWith(z5.g.f141884d);
    }

    public static boolean t(int i10) {
        return (128 <= i10 && i10 <= 687) || (768 <= i10 && i10 <= 1023) || ((1536 <= i10 && i10 <= 1791) || ((3072 <= i10 && i10 <= 3199) || ((7616 <= i10 && i10 <= 7679) || ((7680 <= i10 && i10 <= 7935) || ((8192 <= i10 && i10 <= 8351) || ((8400 <= i10 && i10 <= 8527) || ((8592 <= i10 && i10 <= 9215) || ((9312 <= i10 && i10 <= 9727) || ((9728 <= i10 && i10 <= 10223) || ((10496 <= i10 && i10 <= 10751) || ((11008 <= i10 && i10 <= 11263) || ((11360 <= i10 && i10 <= 11391) || ((11776 <= i10 && i10 <= 11903) || ((42128 <= i10 && i10 <= 42191) || ((57344 <= i10 && i10 <= 63743) || ((65024 <= i10 && i10 <= 65039) || ((65072 <= i10 && i10 <= 65103) || ((126976 <= i10 && i10 <= 127023) || ((127136 <= i10 && i10 <= 127231) || ((127232 <= i10 && i10 <= 128591) || ((128640 <= i10 && i10 <= 128767) || ((129296 <= i10 && i10 <= 129387) || (129408 <= i10 && i10 <= 129504)))))))))))))))))))))));
    }

    public static boolean u(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32656x, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : F(str).equals("");
    }

    public static boolean v(String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, bb.c.f.f32678y, new Class[]{String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (u(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(List... listArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listArr}, null, changeQuickRedirect, true, bb.c.f.T, new Class[]{List[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (listArr.length == 0) {
            return true;
        }
        for (List list : listArr) {
            if (list == null || list.size() == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.A, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }

    public static <E> boolean y(List<E> list, List<E> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, null, changeQuickRedirect, true, bb.c.f.f32157b0, new Class[]{List.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (list == list2) {
            return true;
        }
        if (w(list) && w(list2)) {
            return true;
        }
        if (w(list) || w(list2) || list.size() != list2.size() || !list.containsAll(list2)) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!list.get(i10).equals(list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean z(Context context, boolean z10) {
        NetworkInfo[] allNetworkInfo;
        Object[] objArr = {context, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Q, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        if (z10) {
            x.p(context.getString(R.string.network_error));
        }
        return false;
    }
}
