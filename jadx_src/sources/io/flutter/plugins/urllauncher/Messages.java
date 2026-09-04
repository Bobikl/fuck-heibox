package io.flutter.plugins.urllauncher;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public static final class BrowserOptions {

        @n0
        private Boolean showTitle;

        public static final class Builder {

            @p0
            private Boolean showTitle;

            @n0
            public BrowserOptions build() {
                BrowserOptions browserOptions = new BrowserOptions();
                browserOptions.setShowTitle(this.showTitle);
                return browserOptions;
            }

            @n0
            public Builder setShowTitle(@n0 Boolean bool) {
                this.showTitle = bool;
                return this;
            }
        }

        BrowserOptions() {
        }

        @n0
        static BrowserOptions fromList(@n0 ArrayList<Object> arrayList) {
            BrowserOptions browserOptions = new BrowserOptions();
            browserOptions.setShowTitle((Boolean) arrayList.get(0));
            return browserOptions;
        }

        @n0
        public Boolean getShowTitle() {
            return this.showTitle;
        }

        public void setShowTitle(@n0 Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.showTitle = bool;
        }

        @n0
        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.showTitle);
            return arrayList;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@n0 String str, @p0 String str2, @p0 Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface UrlLauncherApi {
        @n0
        Boolean canLaunchUrl(@n0 String str);

        void closeWebView();

        @n0
        Boolean launchUrl(@n0 String str, @n0 Map<String, String> map);

        @n0
        Boolean openUrlInApp(@n0 String str, @n0 Boolean bool, @n0 WebViewOptions webViewOptions, @n0 BrowserOptions browserOptions);

        @n0
        Boolean supportsCustomTabs();
    }

    public static class UrlLauncherApiCodec extends StandardMessageCodec {
        public static final UrlLauncherApiCodec INSTANCE = new UrlLauncherApiCodec();

        private UrlLauncherApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        protected Object readValueOfType(byte b10, @n0 ByteBuffer byteBuffer) {
            if (b10 != -128) {
                return b10 != -127 ? super.readValueOfType(b10, byteBuffer) : WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
            }
            return BrowserOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        protected void writeValue(@n0 ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof BrowserOptions) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((BrowserOptions) obj).toList());
            } else if (!(obj instanceof WebViewOptions)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
            }
        }
    }

    public static final class WebViewOptions {

        @n0
        private Boolean enableDomStorage;

        @n0
        private Boolean enableJavaScript;

        @n0
        private Map<String, String> headers;

        public static final class Builder {

            @p0
            private Boolean enableDomStorage;

            @p0
            private Boolean enableJavaScript;

            @p0
            private Map<String, String> headers;

            @n0
            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            @n0
            public Builder setEnableDomStorage(@n0 Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            @n0
            public Builder setEnableJavaScript(@n0 Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            @n0
            public Builder setHeaders(@n0 Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        WebViewOptions() {
        }

        @n0
        static WebViewOptions fromList(@n0 ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        @n0
        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        @n0
        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        @n0
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public void setEnableDomStorage(@n0 Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.enableDomStorage = bool;
        }

        public void setEnableJavaScript(@n0 Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.enableJavaScript = bool;
        }

        public void setHeaders(@n0 Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.headers = map;
        }

        @n0
        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
        }
    }

    @n0
    protected static ArrayList<Object> wrapError(@n0 Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        }
        return arrayList;
    }
}
