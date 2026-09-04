package com.ss.bytertc.engine;

import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PublisherConfiguration {
    private static final String TAG = "PublisherConfiguration";
    private JSONObject mJsonObject;

    public static class Builder {
        private PublisherParameters params = new PublisherParameters();

        public Builder audioChannels(int i10) {
            this.params.audiochannels = i10;
            return this;
        }

        public Builder audioKBitrate(int i10) {
            this.params.audioKBitrate = i10 / 1000;
            return this;
        }

        public Builder audioSampleRate(int i10) {
            this.params.audiosamplerate = i10;
            return this;
        }

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder defaultLayout(int i10) {
            this.params.defaultLayout = i10;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i10) {
            this.params.framerate = i10;
            return this;
        }

        public Builder kBitRate(int i10) {
            this.params.kBitrate = i10;
            return this;
        }

        public Builder liftCycle(int i10) {
            this.params.lifecycle = i10;
            return this;
        }

        public Builder owner(boolean z10) {
            this.params.owner = z10;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.mosaicStream = str;
            return this;
        }

        public Builder size(int i10, int i11) {
            PublisherParameters publisherParameters = this.params;
            publisherParameters.width = i10;
            publisherParameters.height = i11;
            return this;
        }
    }

    public PublisherConfiguration() {
    }

    private PublisherConfiguration(Builder builder) {
        try {
            JSONObject jSONObject = new JSONObject();
            this.mJsonObject = jSONObject;
            jSONObject.put("owner", builder.params.owner);
            this.mJsonObject.put("lifecycle", builder.params.lifecycle);
            this.mJsonObject.put("defaultLayout", builder.params.defaultLayout);
            this.mJsonObject.put("width", builder.params.width);
            this.mJsonObject.put("height", builder.params.height);
            this.mJsonObject.put("framerate", builder.params.framerate);
            this.mJsonObject.put("bitrate", builder.params.kBitrate);
            this.mJsonObject.put("mosaicStream", builder.params.mosaicStream);
            this.mJsonObject.put("extraInfo", builder.params.extraInfo);
            this.mJsonObject.put("audiosamplerate", builder.params.audiosamplerate);
            this.mJsonObject.put("audiobitrate", builder.params.audioKBitrate * 1000);
            this.mJsonObject.put("audiochannels", builder.params.audiochannels);
        } catch (JSONException unused) {
            this.mJsonObject = null;
            LogUtil.w(TAG, "failed to create PublisherConfiguration");
        }
    }

    public String toJsonString() {
        if (validate()) {
            return this.mJsonObject.toString();
        }
        return null;
    }

    public boolean validate() {
        return this.mJsonObject != null;
    }
}
