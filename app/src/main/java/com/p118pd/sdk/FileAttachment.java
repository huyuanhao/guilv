package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;

import com.sky.guilv.R;

import java.io.File;

import org.json.JSONException;
import org.json.JSONObject;

public class FileAttachment implements MsgAttachment {
    public static final String KEY_EXPIRE = "expire";
    public static final String KEY_EXT = "ext";
    public static final String KEY_MD5 = "md5";
    public static final String KEY_NAME = "name";
    public static final String KEY_PATH = "path";
    public static final String KEY_SIZE = "size";
    public static final String KEY_URL = "url";
    public String displayName;
    public long expire;
    public String extension;
    public String md5;
    public String path;
    public long size;
    public String url;

    public FileAttachment() {
    }

    public FileAttachment(String str) {
        fromJson(str);
    }

    private void fromJson(String str) {
        JSONObject a = C1810b.m3420a(str);
        this.path = C1810b.m3432e(a, "path");
        this.md5 = C1810b.m3432e(a, KEY_MD5);
        this.url = C1810b.m3432e(a, "url");
        this.displayName = C1810b.m3432e(a, "name");
        this.size = C1810b.m3430c(a, KEY_SIZE);
        this.extension = C1810b.m3432e(a, "ext");
        this.expire = C1810b.m3430c(a, KEY_EXPIRE);
        load(a);
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public boolean countToUnread() {
        return true;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String getContent(Context context) {
        return context.getString(R.string.ysf_msg_notify_file) + getDisplayName();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public long getExpire() {
        return this.expire;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getFileName() {
        return !TextUtils.isEmpty(this.path) ? C1853d.m3519b(this.path) : TextUtils.isEmpty(this.md5) ? C1852c.m3511a(this.url) : this.md5;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPath() {
        String pathForSave = getPathForSave();
        if (new File(pathForSave).exists()) {
            return pathForSave;
        }
        return null;
    }

    public String getPathForSave() {
        return !TextUtils.isEmpty(this.path) ? this.path : C2349d.m5123a(getFileName(), storageType());
    }

    public long getSize() {
        return this.size;
    }

    public String getThumbPath() {
        String thumbPathForSave = getThumbPathForSave();
        if (!new File(thumbPathForSave).exists()) {
            thumbPathForSave = null;
        }
        return thumbPathForSave != null ? thumbPathForSave : getPath();
    }

    public String getThumbPathForSave() {
        return C2349d.m5123a(getFileName(), EnumC2347c.TYPE_THUMB_IMAGE);
    }

    public String getUrl() {
        return this.url;
    }

    public void load(JSONObject jSONObject) {
    }

    public void save(JSONObject jSONObject, boolean z) {
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public EnumC2347c storageType() {
        return EnumC2347c.TYPE_FILE;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String toJson(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                if (!TextUtils.isEmpty(this.path)) {
                    jSONObject.put("path", this.path);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(this.md5)) {
            try {
                jSONObject.put(KEY_MD5, this.md5);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(this.displayName)) {
            try {
                jSONObject.put("name", this.displayName);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject.put("url", this.url);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            jSONObject.put(KEY_SIZE, this.size);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.extension)) {
            try {
                jSONObject.put("ext", this.extension);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.expire > 0) {
            try {
                jSONObject.put(KEY_EXPIRE, this.expire);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        save(jSONObject, z);
        return jSONObject.toString();
    }
}
