package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.p0;
import com.huawei.hms.common.AccountPicker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.android.gms.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class C0407a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private Account f52310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private ArrayList f52312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private ArrayList f52313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f52315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Bundle f52316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f52317h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f52318i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private String f52319j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f52320k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private n f52321l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @p0
        private String f52322m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f52323n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f52324o;

        /* JADX INFO: renamed from: com.google.android.gms.common.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class C0408a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @p0
            private Account f52325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @p0
            private ArrayList f52326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @p0
            private ArrayList f52327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f52328d = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @p0
            private String f52329e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @p0
            private Bundle f52330f;

            @androidx.annotation.n0
            public C0407a a() {
                com.google.android.gms.common.internal.p.b(true, "We only support hostedDomain filter for account chip styled account picker");
                com.google.android.gms.common.internal.p.b(true, "Consent is only valid for account chip styled account picker");
                C0407a c0407a = new C0407a();
                c0407a.f52313d = this.f52327c;
                c0407a.f52312c = this.f52326b;
                c0407a.f52314e = this.f52328d;
                c0407a.f52321l = null;
                c0407a.f52319j = null;
                c0407a.f52316g = this.f52330f;
                c0407a.f52310a = this.f52325a;
                c0407a.f52311b = false;
                c0407a.f52317h = false;
                c0407a.f52322m = null;
                c0407a.f52318i = 0;
                c0407a.f52315f = this.f52329e;
                c0407a.f52320k = false;
                c0407a.f52323n = false;
                c0407a.f52324o = false;
                return c0407a;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a b(@p0 List<Account> list) {
                this.f52326b = list == null ? null : new ArrayList(list);
                return this;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a c(@p0 List<String> list) {
                this.f52327c = list == null ? null : new ArrayList(list);
                return this;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a d(boolean z10) {
                this.f52328d = z10;
                return this;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a e(@p0 Bundle bundle) {
                this.f52330f = bundle;
                return this;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a f(@p0 Account account) {
                this.f52325a = account;
                return this;
            }

            @s9.a
            @androidx.annotation.n0
            public C0408a g(@p0 String str) {
                this.f52329e = str;
                return this;
            }
        }

        static /* bridge */ /* synthetic */ boolean D(C0407a c0407a) {
            boolean z10 = c0407a.f52323n;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean a(C0407a c0407a) {
            boolean z10 = c0407a.f52324o;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean b(C0407a c0407a) {
            boolean z10 = c0407a.f52311b;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean c(C0407a c0407a) {
            boolean z10 = c0407a.f52317h;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean d(C0407a c0407a) {
            boolean z10 = c0407a.f52320k;
            return false;
        }

        static /* bridge */ /* synthetic */ int e(C0407a c0407a) {
            int i10 = c0407a.f52318i;
            return 0;
        }

        static /* bridge */ /* synthetic */ n h(C0407a c0407a) {
            n nVar = c0407a.f52321l;
            return null;
        }

        static /* bridge */ /* synthetic */ String i(C0407a c0407a) {
            String str = c0407a.f52319j;
            return null;
        }

        static /* bridge */ /* synthetic */ String j(C0407a c0407a) {
            String str = c0407a.f52322m;
            return null;
        }
    }

    private a() {
    }

    @androidx.annotation.n0
    @Deprecated
    public static Intent a(@p0 Account account, @p0 ArrayList<Account> arrayList, @p0 String[] strArr, boolean z10, @p0 String str, @p0 String str2, @p0 String[] strArr2, @p0 Bundle bundle) {
        Intent intent = new Intent();
        com.google.android.gms.common.internal.p.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra(AccountPicker.EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST, arrayList);
        intent.putExtra(AccountPicker.EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY, strArr);
        intent.putExtra(AccountPicker.EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE, bundle);
        intent.putExtra(AccountPicker.EXTRA_SELECTED_ACCOUNT, account);
        intent.putExtra(AccountPicker.EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT, z10);
        intent.putExtra(AccountPicker.EXTRA_DESCRIPTION_TEXT_OVERRIDE, str);
        intent.putExtra(AccountPicker.EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING, str2);
        intent.putExtra(AccountPicker.EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY, strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra(AccountPicker.EXTRA_OVERRIDE_THEME, 0);
        intent.putExtra(AccountPicker.EXTRA_OVERRIDE_CUSTOM_THEME, 0);
        intent.putExtra(AccountPicker.EXTRA_HOSTED_DOMAIN_FILTER, (String) null);
        return intent;
    }

    @androidx.annotation.n0
    public static Intent b(@androidx.annotation.n0 C0407a c0407a) {
        Intent intent = new Intent();
        C0407a.d(c0407a);
        C0407a.i(c0407a);
        com.google.android.gms.common.internal.p.b(true, "We only support hostedDomain filter for account chip styled account picker");
        C0407a.h(c0407a);
        com.google.android.gms.common.internal.p.b(true, "Consent is only valid for account chip styled account picker");
        C0407a.b(c0407a);
        com.google.android.gms.common.internal.p.b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        C0407a.d(c0407a);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra(AccountPicker.EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST, c0407a.f52312c);
        if (c0407a.f52313d != null) {
            intent.putExtra(AccountPicker.EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY, (String[]) c0407a.f52313d.toArray(new String[0]));
        }
        intent.putExtra(AccountPicker.EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE, c0407a.f52316g);
        intent.putExtra(AccountPicker.EXTRA_SELECTED_ACCOUNT, c0407a.f52310a);
        C0407a.b(c0407a);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra(AccountPicker.EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT, c0407a.f52314e);
        intent.putExtra(AccountPicker.EXTRA_DESCRIPTION_TEXT_OVERRIDE, c0407a.f52315f);
        C0407a.c(c0407a);
        intent.putExtra("setGmsCoreAccount", false);
        C0407a.j(c0407a);
        intent.putExtra(AccountPicker.EXTRA_REAL_CLIENT_PACKAGE, (String) null);
        C0407a.e(c0407a);
        intent.putExtra(AccountPicker.EXTRA_OVERRIDE_THEME, 0);
        C0407a.d(c0407a);
        intent.putExtra(AccountPicker.EXTRA_OVERRIDE_CUSTOM_THEME, 0);
        C0407a.i(c0407a);
        intent.putExtra(AccountPicker.EXTRA_HOSTED_DOMAIN_FILTER, (String) null);
        Bundle bundle = new Bundle();
        C0407a.d(c0407a);
        C0407a.h(c0407a);
        C0407a.D(c0407a);
        C0407a.a(c0407a);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
