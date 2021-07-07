package com.p118pd.sdk;

import android.content.Context;
import java.io.Serializable;

public interface MsgAttachment extends Serializable {
    boolean countToUnread();

    String getContent(Context context);

    String toJson(boolean z);
}
