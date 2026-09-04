package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface SafeParcelable extends Parcelable {

    @n0
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface a {
        @n0
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface b {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface c {
        @n0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @n0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @n0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface d {
        @n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface e {
        int id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface f {
        @n0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @n0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface g {
        @n0
        int[] value();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface h {
        @n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @n0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
