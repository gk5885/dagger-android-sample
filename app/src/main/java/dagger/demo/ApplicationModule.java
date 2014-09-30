package dagger.demo;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gak on 9/25/14.
 */
@Module
final class ApplicationModule {
    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides Application application() {
        return application;
    }
}
