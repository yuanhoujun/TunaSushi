package com.tunasushi.tuna;


import android.databinding.BindingAdapter;

/**
 * @author TunaSashimi
 * @date 2020-03-16 23:34
 * @Copyright 2020 TunaSashimi. All rights reserved.
 * @Description
 */
public class TBinding {
    @BindingAdapter({"text"})
    public static void setText(TView t, String text) {
        final String oldText = t.getText();
        if ((text == null && oldText.length() == 0) || text == oldText || text.equals(oldText)) {
            return;
        }
        t.setText(text);
    }

    @BindingAdapter({"content"})
    public static void setContent(TView t, String content) {
        final String oldContent = t.getContent();
        if ((content == null && oldContent.length() == 0) || content == oldContent || content.equals(oldContent)) {
            return;
        }
        t.setContent(content);
    }
}
