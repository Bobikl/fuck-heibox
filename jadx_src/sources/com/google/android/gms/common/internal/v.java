package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class v {
    private v() {
    }

    @v8.a
    @androidx.annotation.p0
    public static String a(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet, boolean z10, boolean z11, @androidx.annotation.n0 String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                context.getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
                Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                Log.w(str3, "Resource " + str2 + " was not a string: " + typedValue.toString());
            }
        }
        if (z11 && attributeValue == null) {
            Log.w(str3, "Required XML attribute \"" + str2 + "\" missing");
        }
        return attributeValue;
    }
}
