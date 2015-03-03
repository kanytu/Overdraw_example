package com.poliveira.apps.overdrawtest;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/**
 * Created by poliveira on 27/02/2015.
 */
public final class Utils {
    private Utils() {
    }

    public static Drawable getWindowBackground(Context context) {
        TypedValue typedValue = new TypedValue();
        Drawable drawable;
        context.getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
        if (typedValue.type >= TypedValue.TYPE_FIRST_COLOR_INT && typedValue.type <= TypedValue.TYPE_LAST_COLOR_INT) {
            drawable = new ColorDrawable(typedValue.data);
        } else {
            drawable = context.getResources().getDrawable(typedValue.resourceId);
        }
        return drawable;
    }
}
