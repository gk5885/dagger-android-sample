package dagger.demo;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gak on 9/25/14.
 */
@Module
final class ActivityModule {
    private final Activity activity;

    ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides Activity activity() {
        return activity;
    }
}
