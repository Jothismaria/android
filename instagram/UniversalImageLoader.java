package com.example.instagram;

import android.content.Context;
import android.widget.ImageView;

        import android.content.Context;
        import android.graphics.Bitmap;
        import android.media.Image;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.ProgressBar;

        import com.example.instagram.R;
        import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
        import com.nostra13.universalimageloader.core.DisplayImageOptions;
        import com.nostra13.universalimageloader.core.ImageLoader;
        import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
        import com.nostra13.universalimageloader.core.assist.FailReason;
        import com.nostra13.universalimageloader.core.assist.ImageScaleType;
        import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
        import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

public class UniversalImageLoader {
    private static final int defaultImage = R.drawable.android;
    private Context mContext;

    public UniversalImageLoader(Context context) {
        mContext = context;
    }

    public static void setImage(String imgURL, ImageView mProfilePhoto, Object o, String s) {
    }

    public ImageLoaderConfiguration getConfig() {
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(defaultImage)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .cacheOnDisk(true).cacheInMemory(true)
                .cacheOnDisk(true).resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .diskCacheSize(100 * 1024 * 1024).build();
        return configuration;
    }
}